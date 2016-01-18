/*
 * generated by Xtext
 */
package eu.scasefp7.eclipse.reqeditor.dsl.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import eu.scasefp7.eclipse.reqeditor.dsl.services.RqsDslGrammarAccess;

public class RqsDslParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private RqsDslGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected eu.scasefp7.eclipse.reqeditor.dsl.parser.antlr.internal.InternalRqsDslParser createParser(XtextTokenStream stream) {
		return new eu.scasefp7.eclipse.reqeditor.dsl.parser.antlr.internal.InternalRqsDslParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}
	
	public RqsDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(RqsDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
