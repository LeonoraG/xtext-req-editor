package syntaxcoloring;

import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import eu.scasefp7.eclipse.reqeditor.dsl.rqsDsl.RAnnotation;
import eu.scasefp7.eclipse.reqeditor.dsl.rqsDsl.Requirement;
import eu.scasefp7.eclipse.reqeditor.dsl.rqsDsl.TAnnotation;
import eu.scasefp7.eclipse.reqeditor.dsl.rqsDsl.impl.ModelImpl;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;



public class SemanticHighlightingCalculator implements ISemanticHighlightingCalculator {

	@Override
	public void provideHighlightingFor(XtextResource resource, IHighlightedPositionAcceptor acceptor) {
		
			if (resource == null || resource.getParseResult() == null || resource.getContents().size() <= 0) {
				return;
			}

			ModelImpl root = (ModelImpl)resource.getContents().get(0);
			
			EList<EObject> contents = root.getAnnotations();
			for (EObject eObject : contents ) {
				if(eObject instanceof RAnnotation){
				//TODO
					
				}
				
				if(eObject instanceof TAnnotation){
						TAnnotation tannotation = (TAnnotation)eObject;

						int lineno = tannotation.getNum() + 2; //we want to skip the REQUIREMENTS ------ parts

						EList<Requirement> reqs = root.getRequirements();
						EList<String> currActor = tannotation.getText();

						for (Requirement requirement : reqs) {
							String text = requirement.getText();
							
							if(text.equals(currActor.get(0))){
								
								INode currNode = NodeModelUtils.getNode(requirement);
								int nodelineno = currNode.getStartLine();
								
								if(nodelineno == lineno)
									acceptor.addPosition(currNode.getOffset(),
											tannotation.getB() - tannotation.getA(),
											 HighlightingConfiguration.ACTOR);

							}
							
						}
	
				}
			}
		
		}
	


	
}


