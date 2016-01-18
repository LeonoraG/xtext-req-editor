package syntaxcoloring;

import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.utils.TextStyle;


public class HighlightingConfiguration implements IHighlightingConfiguration {


		public static final String KEYWORD_ID = "keyword";
		public static final String STRING_ID = "string";
		public static final String NUMBER_ID = "number";
		public static final String DEFAULT_ID = "default";
		public static final String ACTOR = "actor";
		public static final String INVALID_TOKEN_ID = "error";

		public void configure(IHighlightingConfigurationAcceptor acceptor) {
			acceptor.acceptDefaultHighlighting(KEYWORD_ID, "Keyword", keywordTextStyle());
			acceptor.acceptDefaultHighlighting(DEFAULT_ID, "Default", defaultTextStyle());
			acceptor.acceptDefaultHighlighting(INVALID_TOKEN_ID, "Invalid Symbol", errorTextStyle());
			acceptor.acceptDefaultHighlighting(ACTOR, "Actor", actorStyle());
		}

		public TextStyle defaultTextStyle() {
			TextStyle textStyle = new TextStyle();
			// textStyle.setBackgroundColor(new RGB(255, 255, 255));
			textStyle.setColor(new RGB(0, 0, 0));
			return textStyle;
		}

		public TextStyle errorTextStyle() {
			TextStyle textStyle = defaultTextStyle().copy();
			// textStyle.setColor(new RGB(255, 0, 0));
			return textStyle;
		}

		
		public TextStyle keywordTextStyle() {
			TextStyle textStyle = defaultTextStyle().copy();
			textStyle.setColor(new RGB(127, 0, 85));
			textStyle.setStyle(SWT.BOLD);
			return textStyle;
		}

		
		public TextStyle actorStyle() {
			TextStyle textStyle = new TextStyle();
			textStyle.setColor(new RGB(0, 0, 0));
			RGB backgroundColor = new RGB(95, 197, 186);
			textStyle.setBackgroundColor(backgroundColor );
			return textStyle;
		}
		
	}


