package eu.scasefp7.eclipse.reqeditor.dsl.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import eu.scasefp7.eclipse.reqeditor.dsl.services.RqsDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRqsDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.'", "'Actor'", "'Action'", "'Object'", "'Property'", "'IsActorOf'", "'HasProperty'", "'ActsOn'", "'REQUIREMENTS'", "'------------'", "'ANNOTATIONS'", "':T'", "':R'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalRqsDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRqsDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRqsDslParser.tokenNames; }
    public String getGrammarFileName() { return "../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g"; }


     
     	private RqsDslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(RqsDslGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleModel"
    // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:61:1: ( ruleModel EOF )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:69:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:73:2: ( ( ( rule__Model__Group__0 ) ) )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:74:1: ( ( rule__Model__Group__0 ) )
            {
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:74:1: ( ( rule__Model__Group__0 ) )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:75:1: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:76:1: ( rule__Model__Group__0 )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:76:2: rule__Model__Group__0
            {
            pushFollow(FOLLOW_rule__Model__Group__0_in_ruleModel94);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleRequirement"
    // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:88:1: entryRuleRequirement : ruleRequirement EOF ;
    public final void entryRuleRequirement() throws RecognitionException {
        try {
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:89:1: ( ruleRequirement EOF )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:90:1: ruleRequirement EOF
            {
             before(grammarAccess.getRequirementRule()); 
            pushFollow(FOLLOW_ruleRequirement_in_entryRuleRequirement121);
            ruleRequirement();

            state._fsp--;

             after(grammarAccess.getRequirementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRequirement128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRequirement"


    // $ANTLR start "ruleRequirement"
    // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:97:1: ruleRequirement : ( ( rule__Requirement__TextAssignment ) ) ;
    public final void ruleRequirement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:101:2: ( ( ( rule__Requirement__TextAssignment ) ) )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:102:1: ( ( rule__Requirement__TextAssignment ) )
            {
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:102:1: ( ( rule__Requirement__TextAssignment ) )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:103:1: ( rule__Requirement__TextAssignment )
            {
             before(grammarAccess.getRequirementAccess().getTextAssignment()); 
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:104:1: ( rule__Requirement__TextAssignment )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:104:2: rule__Requirement__TextAssignment
            {
            pushFollow(FOLLOW_rule__Requirement__TextAssignment_in_ruleRequirement154);
            rule__Requirement__TextAssignment();

            state._fsp--;


            }

             after(grammarAccess.getRequirementAccess().getTextAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRequirement"


    // $ANTLR start "entryRuleTAnnotation"
    // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:116:1: entryRuleTAnnotation : ruleTAnnotation EOF ;
    public final void entryRuleTAnnotation() throws RecognitionException {
        try {
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:117:1: ( ruleTAnnotation EOF )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:118:1: ruleTAnnotation EOF
            {
             before(grammarAccess.getTAnnotationRule()); 
            pushFollow(FOLLOW_ruleTAnnotation_in_entryRuleTAnnotation181);
            ruleTAnnotation();

            state._fsp--;

             after(grammarAccess.getTAnnotationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTAnnotation188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTAnnotation"


    // $ANTLR start "ruleTAnnotation"
    // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:125:1: ruleTAnnotation : ( ( rule__TAnnotation__Group__0 ) ) ;
    public final void ruleTAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:129:2: ( ( ( rule__TAnnotation__Group__0 ) ) )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:130:1: ( ( rule__TAnnotation__Group__0 ) )
            {
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:130:1: ( ( rule__TAnnotation__Group__0 ) )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:131:1: ( rule__TAnnotation__Group__0 )
            {
             before(grammarAccess.getTAnnotationAccess().getGroup()); 
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:132:1: ( rule__TAnnotation__Group__0 )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:132:2: rule__TAnnotation__Group__0
            {
            pushFollow(FOLLOW_rule__TAnnotation__Group__0_in_ruleTAnnotation214);
            rule__TAnnotation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTAnnotationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTAnnotation"


    // $ANTLR start "entryRuleUnquotedString"
    // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:144:1: entryRuleUnquotedString : ruleUnquotedString EOF ;
    public final void entryRuleUnquotedString() throws RecognitionException {
        try {
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:145:1: ( ruleUnquotedString EOF )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:146:1: ruleUnquotedString EOF
            {
             before(grammarAccess.getUnquotedStringRule()); 
            pushFollow(FOLLOW_ruleUnquotedString_in_entryRuleUnquotedString241);
            ruleUnquotedString();

            state._fsp--;

             after(grammarAccess.getUnquotedStringRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnquotedString248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUnquotedString"


    // $ANTLR start "ruleUnquotedString"
    // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:153:1: ruleUnquotedString : ( ( ( RULE_ID ) ) ( ( RULE_ID )* ) ) ;
    public final void ruleUnquotedString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:157:2: ( ( ( ( RULE_ID ) ) ( ( RULE_ID )* ) ) )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:158:1: ( ( ( RULE_ID ) ) ( ( RULE_ID )* ) )
            {
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:158:1: ( ( ( RULE_ID ) ) ( ( RULE_ID )* ) )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:159:1: ( ( RULE_ID ) ) ( ( RULE_ID )* )
            {
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:159:1: ( ( RULE_ID ) )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:160:1: ( RULE_ID )
            {
             before(grammarAccess.getUnquotedStringAccess().getIDTerminalRuleCall()); 
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:161:1: ( RULE_ID )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:161:3: RULE_ID
            {
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUnquotedString277); 

            }

             after(grammarAccess.getUnquotedStringAccess().getIDTerminalRuleCall()); 

            }

            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:164:1: ( ( RULE_ID )* )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:165:1: ( RULE_ID )*
            {
             before(grammarAccess.getUnquotedStringAccess().getIDTerminalRuleCall()); 
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:166:1: ( RULE_ID )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:166:3: RULE_ID
            	    {
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUnquotedString290); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getUnquotedStringAccess().getIDTerminalRuleCall()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnquotedString"


    // $ANTLR start "entryRuleRAnnotation"
    // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:179:1: entryRuleRAnnotation : ruleRAnnotation EOF ;
    public final void entryRuleRAnnotation() throws RecognitionException {
        try {
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:180:1: ( ruleRAnnotation EOF )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:181:1: ruleRAnnotation EOF
            {
             before(grammarAccess.getRAnnotationRule()); 
            pushFollow(FOLLOW_ruleRAnnotation_in_entryRuleRAnnotation320);
            ruleRAnnotation();

            state._fsp--;

             after(grammarAccess.getRAnnotationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRAnnotation327); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRAnnotation"


    // $ANTLR start "ruleRAnnotation"
    // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:188:1: ruleRAnnotation : ( ( rule__RAnnotation__Group__0 ) ) ;
    public final void ruleRAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:192:2: ( ( ( rule__RAnnotation__Group__0 ) ) )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:193:1: ( ( rule__RAnnotation__Group__0 ) )
            {
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:193:1: ( ( rule__RAnnotation__Group__0 ) )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:194:1: ( rule__RAnnotation__Group__0 )
            {
             before(grammarAccess.getRAnnotationAccess().getGroup()); 
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:195:1: ( rule__RAnnotation__Group__0 )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:195:2: rule__RAnnotation__Group__0
            {
            pushFollow(FOLLOW_rule__RAnnotation__Group__0_in_ruleRAnnotation353);
            rule__RAnnotation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRAnnotationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRAnnotation"


    // $ANTLR start "rule__Model__AnnotationsAlternatives_7_0"
    // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:207:1: rule__Model__AnnotationsAlternatives_7_0 : ( ( ruleTAnnotation ) | ( ruleRAnnotation ) );
    public final void rule__Model__AnnotationsAlternatives_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:211:1: ( ( ruleTAnnotation ) | ( ruleRAnnotation ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_INT) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==23) ) {
                    alt2=2;
                }
                else if ( (LA2_1==22) ) {
                    alt2=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:212:1: ( ruleTAnnotation )
                    {
                    // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:212:1: ( ruleTAnnotation )
                    // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:213:1: ruleTAnnotation
                    {
                     before(grammarAccess.getModelAccess().getAnnotationsTAnnotationParserRuleCall_7_0_0()); 
                    pushFollow(FOLLOW_ruleTAnnotation_in_rule__Model__AnnotationsAlternatives_7_0389);
                    ruleTAnnotation();

                    state._fsp--;

                     after(grammarAccess.getModelAccess().getAnnotationsTAnnotationParserRuleCall_7_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:218:6: ( ruleRAnnotation )
                    {
                    // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:218:6: ( ruleRAnnotation )
                    // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:219:1: ruleRAnnotation
                    {
                     before(grammarAccess.getModelAccess().getAnnotationsRAnnotationParserRuleCall_7_0_1()); 
                    pushFollow(FOLLOW_ruleRAnnotation_in_rule__Model__AnnotationsAlternatives_7_0406);
                    ruleRAnnotation();

                    state._fsp--;

                     after(grammarAccess.getModelAccess().getAnnotationsRAnnotationParserRuleCall_7_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__AnnotationsAlternatives_7_0"


    // $ANTLR start "rule__Requirement__TextAlternatives_0"
    // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:229:1: rule__Requirement__TextAlternatives_0 : ( ( RULE_ID ) | ( '.' ) );
    public final void rule__Requirement__TextAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:233:1: ( ( RULE_ID ) | ( '.' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            else if ( (LA3_0==11) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:234:1: ( RULE_ID )
                    {
                    // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:234:1: ( RULE_ID )
                    // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:235:1: RULE_ID
                    {
                     before(grammarAccess.getRequirementAccess().getTextIDTerminalRuleCall_0_0()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Requirement__TextAlternatives_0438); 
                     after(grammarAccess.getRequirementAccess().getTextIDTerminalRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:240:6: ( '.' )
                    {
                    // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:240:6: ( '.' )
                    // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:241:1: '.'
                    {
                     before(grammarAccess.getRequirementAccess().getTextFullStopKeyword_0_1()); 
                    match(input,11,FOLLOW_11_in_rule__Requirement__TextAlternatives_0456); 
                     after(grammarAccess.getRequirementAccess().getTextFullStopKeyword_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requirement__TextAlternatives_0"


    // $ANTLR start "rule__TAnnotation__TypeAlternatives_3_0"
    // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:253:1: rule__TAnnotation__TypeAlternatives_3_0 : ( ( 'Actor' ) | ( 'Action' ) | ( 'Object' ) | ( 'Property' ) );
    public final void rule__TAnnotation__TypeAlternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:257:1: ( ( 'Actor' ) | ( 'Action' ) | ( 'Object' ) | ( 'Property' ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt4=1;
                }
                break;
            case 13:
                {
                alt4=2;
                }
                break;
            case 14:
                {
                alt4=3;
                }
                break;
            case 15:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:258:1: ( 'Actor' )
                    {
                    // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:258:1: ( 'Actor' )
                    // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:259:1: 'Actor'
                    {
                     before(grammarAccess.getTAnnotationAccess().getTypeActorKeyword_3_0_0()); 
                    match(input,12,FOLLOW_12_in_rule__TAnnotation__TypeAlternatives_3_0491); 
                     after(grammarAccess.getTAnnotationAccess().getTypeActorKeyword_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:266:6: ( 'Action' )
                    {
                    // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:266:6: ( 'Action' )
                    // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:267:1: 'Action'
                    {
                     before(grammarAccess.getTAnnotationAccess().getTypeActionKeyword_3_0_1()); 
                    match(input,13,FOLLOW_13_in_rule__TAnnotation__TypeAlternatives_3_0511); 
                     after(grammarAccess.getTAnnotationAccess().getTypeActionKeyword_3_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:274:6: ( 'Object' )
                    {
                    // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:274:6: ( 'Object' )
                    // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:275:1: 'Object'
                    {
                     before(grammarAccess.getTAnnotationAccess().getTypeObjectKeyword_3_0_2()); 
                    match(input,14,FOLLOW_14_in_rule__TAnnotation__TypeAlternatives_3_0531); 
                     after(grammarAccess.getTAnnotationAccess().getTypeObjectKeyword_3_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:282:6: ( 'Property' )
                    {
                    // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:282:6: ( 'Property' )
                    // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:283:1: 'Property'
                    {
                     before(grammarAccess.getTAnnotationAccess().getTypePropertyKeyword_3_0_3()); 
                    match(input,15,FOLLOW_15_in_rule__TAnnotation__TypeAlternatives_3_0551); 
                     after(grammarAccess.getTAnnotationAccess().getTypePropertyKeyword_3_0_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TAnnotation__TypeAlternatives_3_0"


    // $ANTLR start "rule__RAnnotation__TypeAlternatives_3_0"
    // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:295:1: rule__RAnnotation__TypeAlternatives_3_0 : ( ( 'IsActorOf' ) | ( 'HasProperty' ) | ( 'ActsOn' ) | ( 'Property' ) );
    public final void rule__RAnnotation__TypeAlternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:299:1: ( ( 'IsActorOf' ) | ( 'HasProperty' ) | ( 'ActsOn' ) | ( 'Property' ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt5=1;
                }
                break;
            case 17:
                {
                alt5=2;
                }
                break;
            case 18:
                {
                alt5=3;
                }
                break;
            case 15:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:300:1: ( 'IsActorOf' )
                    {
                    // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:300:1: ( 'IsActorOf' )
                    // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:301:1: 'IsActorOf'
                    {
                     before(grammarAccess.getRAnnotationAccess().getTypeIsActorOfKeyword_3_0_0()); 
                    match(input,16,FOLLOW_16_in_rule__RAnnotation__TypeAlternatives_3_0586); 
                     after(grammarAccess.getRAnnotationAccess().getTypeIsActorOfKeyword_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:308:6: ( 'HasProperty' )
                    {
                    // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:308:6: ( 'HasProperty' )
                    // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:309:1: 'HasProperty'
                    {
                     before(grammarAccess.getRAnnotationAccess().getTypeHasPropertyKeyword_3_0_1()); 
                    match(input,17,FOLLOW_17_in_rule__RAnnotation__TypeAlternatives_3_0606); 
                     after(grammarAccess.getRAnnotationAccess().getTypeHasPropertyKeyword_3_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:316:6: ( 'ActsOn' )
                    {
                    // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:316:6: ( 'ActsOn' )
                    // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:317:1: 'ActsOn'
                    {
                     before(grammarAccess.getRAnnotationAccess().getTypeActsOnKeyword_3_0_2()); 
                    match(input,18,FOLLOW_18_in_rule__RAnnotation__TypeAlternatives_3_0626); 
                     after(grammarAccess.getRAnnotationAccess().getTypeActsOnKeyword_3_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:324:6: ( 'Property' )
                    {
                    // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:324:6: ( 'Property' )
                    // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:325:1: 'Property'
                    {
                     before(grammarAccess.getRAnnotationAccess().getTypePropertyKeyword_3_0_3()); 
                    match(input,15,FOLLOW_15_in_rule__RAnnotation__TypeAlternatives_3_0646); 
                     after(grammarAccess.getRAnnotationAccess().getTypePropertyKeyword_3_0_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RAnnotation__TypeAlternatives_3_0"


    // $ANTLR start "rule__Model__Group__0"
    // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:339:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:343:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:344:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__0678);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0681);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:351:1: rule__Model__Group__0__Impl : ( () ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:355:1: ( ( () ) )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:356:1: ( () )
            {
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:356:1: ( () )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:357:1: ()
            {
             before(grammarAccess.getModelAccess().getModelAction_0()); 
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:358:1: ()
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:360:1: 
            {
            }

             after(grammarAccess.getModelAccess().getModelAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:370:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:374:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:375:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__1739);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__2_in_rule__Model__Group__1742);
            rule__Model__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:382:1: rule__Model__Group__1__Impl : ( 'REQUIREMENTS' ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:386:1: ( ( 'REQUIREMENTS' ) )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:387:1: ( 'REQUIREMENTS' )
            {
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:387:1: ( 'REQUIREMENTS' )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:388:1: 'REQUIREMENTS'
            {
             before(grammarAccess.getModelAccess().getREQUIREMENTSKeyword_1()); 
            match(input,19,FOLLOW_19_in_rule__Model__Group__1__Impl770); 
             after(grammarAccess.getModelAccess().getREQUIREMENTSKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:401:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:405:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:406:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__2801);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__3_in_rule__Model__Group__2804);
            rule__Model__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:413:1: rule__Model__Group__2__Impl : ( '------------' ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:417:1: ( ( '------------' ) )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:418:1: ( '------------' )
            {
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:418:1: ( '------------' )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:419:1: '------------'
            {
             before(grammarAccess.getModelAccess().getHyphenMinusHyphenMinusHyphenMinusHyphenMinusHyphenMinusHyphenMinusHyphenMinusHyphenMinusHyphenMinusHyphenMinusHyphenMinusHyphenMinusKeyword_2()); 
            match(input,20,FOLLOW_20_in_rule__Model__Group__2__Impl832); 
             after(grammarAccess.getModelAccess().getHyphenMinusHyphenMinusHyphenMinusHyphenMinusHyphenMinusHyphenMinusHyphenMinusHyphenMinusHyphenMinusHyphenMinusHyphenMinusHyphenMinusKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Model__Group__3"
    // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:432:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:436:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:437:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__3863);
            rule__Model__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__4_in_rule__Model__Group__3866);
            rule__Model__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3"


    // $ANTLR start "rule__Model__Group__3__Impl"
    // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:444:1: rule__Model__Group__3__Impl : ( ( rule__Model__RequirementsAssignment_3 )* ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:448:1: ( ( ( rule__Model__RequirementsAssignment_3 )* ) )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:449:1: ( ( rule__Model__RequirementsAssignment_3 )* )
            {
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:449:1: ( ( rule__Model__RequirementsAssignment_3 )* )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:450:1: ( rule__Model__RequirementsAssignment_3 )*
            {
             before(grammarAccess.getModelAccess().getRequirementsAssignment_3()); 
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:451:1: ( rule__Model__RequirementsAssignment_3 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID||LA6_0==11) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:451:2: rule__Model__RequirementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Model__RequirementsAssignment_3_in_rule__Model__Group__3__Impl893);
            	    rule__Model__RequirementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getRequirementsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3__Impl"


    // $ANTLR start "rule__Model__Group__4"
    // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:461:1: rule__Model__Group__4 : rule__Model__Group__4__Impl rule__Model__Group__5 ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:465:1: ( rule__Model__Group__4__Impl rule__Model__Group__5 )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:466:2: rule__Model__Group__4__Impl rule__Model__Group__5
            {
            pushFollow(FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__4924);
            rule__Model__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__5_in_rule__Model__Group__4927);
            rule__Model__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__4"


    // $ANTLR start "rule__Model__Group__4__Impl"
    // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:473:1: rule__Model__Group__4__Impl : ( '------------' ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:477:1: ( ( '------------' ) )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:478:1: ( '------------' )
            {
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:478:1: ( '------------' )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:479:1: '------------'
            {
             before(grammarAccess.getModelAccess().getHyphenMinusHyphenMinusHyphenMinusHyphenMinusHyphenMinusHyphenMinusHyphenMinusHyphenMinusHyphenMinusHyphenMinusHyphenMinusHyphenMinusKeyword_4()); 
            match(input,20,FOLLOW_20_in_rule__Model__Group__4__Impl955); 
             after(grammarAccess.getModelAccess().getHyphenMinusHyphenMinusHyphenMinusHyphenMinusHyphenMinusHyphenMinusHyphenMinusHyphenMinusHyphenMinusHyphenMinusHyphenMinusHyphenMinusKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__4__Impl"


    // $ANTLR start "rule__Model__Group__5"
    // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:492:1: rule__Model__Group__5 : rule__Model__Group__5__Impl rule__Model__Group__6 ;
    public final void rule__Model__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:496:1: ( rule__Model__Group__5__Impl rule__Model__Group__6 )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:497:2: rule__Model__Group__5__Impl rule__Model__Group__6
            {
            pushFollow(FOLLOW_rule__Model__Group__5__Impl_in_rule__Model__Group__5986);
            rule__Model__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__6_in_rule__Model__Group__5989);
            rule__Model__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__5"


    // $ANTLR start "rule__Model__Group__5__Impl"
    // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:504:1: rule__Model__Group__5__Impl : ( 'ANNOTATIONS' ) ;
    public final void rule__Model__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:508:1: ( ( 'ANNOTATIONS' ) )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:509:1: ( 'ANNOTATIONS' )
            {
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:509:1: ( 'ANNOTATIONS' )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:510:1: 'ANNOTATIONS'
            {
             before(grammarAccess.getModelAccess().getANNOTATIONSKeyword_5()); 
            match(input,21,FOLLOW_21_in_rule__Model__Group__5__Impl1017); 
             after(grammarAccess.getModelAccess().getANNOTATIONSKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__5__Impl"


    // $ANTLR start "rule__Model__Group__6"
    // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:523:1: rule__Model__Group__6 : rule__Model__Group__6__Impl rule__Model__Group__7 ;
    public final void rule__Model__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:527:1: ( rule__Model__Group__6__Impl rule__Model__Group__7 )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:528:2: rule__Model__Group__6__Impl rule__Model__Group__7
            {
            pushFollow(FOLLOW_rule__Model__Group__6__Impl_in_rule__Model__Group__61048);
            rule__Model__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__7_in_rule__Model__Group__61051);
            rule__Model__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__6"


    // $ANTLR start "rule__Model__Group__6__Impl"
    // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:535:1: rule__Model__Group__6__Impl : ( '------------' ) ;
    public final void rule__Model__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:539:1: ( ( '------------' ) )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:540:1: ( '------------' )
            {
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:540:1: ( '------------' )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:541:1: '------------'
            {
             before(grammarAccess.getModelAccess().getHyphenMinusHyphenMinusHyphenMinusHyphenMinusHyphenMinusHyphenMinusHyphenMinusHyphenMinusHyphenMinusHyphenMinusHyphenMinusHyphenMinusKeyword_6()); 
            match(input,20,FOLLOW_20_in_rule__Model__Group__6__Impl1079); 
             after(grammarAccess.getModelAccess().getHyphenMinusHyphenMinusHyphenMinusHyphenMinusHyphenMinusHyphenMinusHyphenMinusHyphenMinusHyphenMinusHyphenMinusHyphenMinusHyphenMinusKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__6__Impl"


    // $ANTLR start "rule__Model__Group__7"
    // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:554:1: rule__Model__Group__7 : rule__Model__Group__7__Impl rule__Model__Group__8 ;
    public final void rule__Model__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:558:1: ( rule__Model__Group__7__Impl rule__Model__Group__8 )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:559:2: rule__Model__Group__7__Impl rule__Model__Group__8
            {
            pushFollow(FOLLOW_rule__Model__Group__7__Impl_in_rule__Model__Group__71110);
            rule__Model__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__8_in_rule__Model__Group__71113);
            rule__Model__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__7"


    // $ANTLR start "rule__Model__Group__7__Impl"
    // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:566:1: rule__Model__Group__7__Impl : ( ( rule__Model__AnnotationsAssignment_7 )* ) ;
    public final void rule__Model__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:570:1: ( ( ( rule__Model__AnnotationsAssignment_7 )* ) )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:571:1: ( ( rule__Model__AnnotationsAssignment_7 )* )
            {
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:571:1: ( ( rule__Model__AnnotationsAssignment_7 )* )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:572:1: ( rule__Model__AnnotationsAssignment_7 )*
            {
             before(grammarAccess.getModelAccess().getAnnotationsAssignment_7()); 
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:573:1: ( rule__Model__AnnotationsAssignment_7 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_INT) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:573:2: rule__Model__AnnotationsAssignment_7
            	    {
            	    pushFollow(FOLLOW_rule__Model__AnnotationsAssignment_7_in_rule__Model__Group__7__Impl1140);
            	    rule__Model__AnnotationsAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getAnnotationsAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__7__Impl"


    // $ANTLR start "rule__Model__Group__8"
    // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:583:1: rule__Model__Group__8 : rule__Model__Group__8__Impl ;
    public final void rule__Model__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:587:1: ( rule__Model__Group__8__Impl )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:588:2: rule__Model__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__8__Impl_in_rule__Model__Group__81171);
            rule__Model__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__8"


    // $ANTLR start "rule__Model__Group__8__Impl"
    // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:594:1: rule__Model__Group__8__Impl : ( '------------' ) ;
    public final void rule__Model__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:598:1: ( ( '------------' ) )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:599:1: ( '------------' )
            {
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:599:1: ( '------------' )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:600:1: '------------'
            {
             before(grammarAccess.getModelAccess().getHyphenMinusHyphenMinusHyphenMinusHyphenMinusHyphenMinusHyphenMinusHyphenMinusHyphenMinusHyphenMinusHyphenMinusHyphenMinusHyphenMinusKeyword_8()); 
            match(input,20,FOLLOW_20_in_rule__Model__Group__8__Impl1199); 
             after(grammarAccess.getModelAccess().getHyphenMinusHyphenMinusHyphenMinusHyphenMinusHyphenMinusHyphenMinusHyphenMinusHyphenMinusHyphenMinusHyphenMinusHyphenMinusHyphenMinusKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__8__Impl"


    // $ANTLR start "rule__TAnnotation__Group__0"
    // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:631:1: rule__TAnnotation__Group__0 : rule__TAnnotation__Group__0__Impl rule__TAnnotation__Group__1 ;
    public final void rule__TAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:635:1: ( rule__TAnnotation__Group__0__Impl rule__TAnnotation__Group__1 )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:636:2: rule__TAnnotation__Group__0__Impl rule__TAnnotation__Group__1
            {
            pushFollow(FOLLOW_rule__TAnnotation__Group__0__Impl_in_rule__TAnnotation__Group__01248);
            rule__TAnnotation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TAnnotation__Group__1_in_rule__TAnnotation__Group__01251);
            rule__TAnnotation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TAnnotation__Group__0"


    // $ANTLR start "rule__TAnnotation__Group__0__Impl"
    // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:643:1: rule__TAnnotation__Group__0__Impl : ( ( rule__TAnnotation__NumAssignment_0 ) ) ;
    public final void rule__TAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:647:1: ( ( ( rule__TAnnotation__NumAssignment_0 ) ) )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:648:1: ( ( rule__TAnnotation__NumAssignment_0 ) )
            {
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:648:1: ( ( rule__TAnnotation__NumAssignment_0 ) )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:649:1: ( rule__TAnnotation__NumAssignment_0 )
            {
             before(grammarAccess.getTAnnotationAccess().getNumAssignment_0()); 
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:650:1: ( rule__TAnnotation__NumAssignment_0 )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:650:2: rule__TAnnotation__NumAssignment_0
            {
            pushFollow(FOLLOW_rule__TAnnotation__NumAssignment_0_in_rule__TAnnotation__Group__0__Impl1278);
            rule__TAnnotation__NumAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTAnnotationAccess().getNumAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TAnnotation__Group__0__Impl"


    // $ANTLR start "rule__TAnnotation__Group__1"
    // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:660:1: rule__TAnnotation__Group__1 : rule__TAnnotation__Group__1__Impl rule__TAnnotation__Group__2 ;
    public final void rule__TAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:664:1: ( rule__TAnnotation__Group__1__Impl rule__TAnnotation__Group__2 )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:665:2: rule__TAnnotation__Group__1__Impl rule__TAnnotation__Group__2
            {
            pushFollow(FOLLOW_rule__TAnnotation__Group__1__Impl_in_rule__TAnnotation__Group__11308);
            rule__TAnnotation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TAnnotation__Group__2_in_rule__TAnnotation__Group__11311);
            rule__TAnnotation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TAnnotation__Group__1"


    // $ANTLR start "rule__TAnnotation__Group__1__Impl"
    // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:672:1: rule__TAnnotation__Group__1__Impl : ( ':T' ) ;
    public final void rule__TAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:676:1: ( ( ':T' ) )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:677:1: ( ':T' )
            {
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:677:1: ( ':T' )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:678:1: ':T'
            {
             before(grammarAccess.getTAnnotationAccess().getTKeyword_1()); 
            match(input,22,FOLLOW_22_in_rule__TAnnotation__Group__1__Impl1339); 
             after(grammarAccess.getTAnnotationAccess().getTKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TAnnotation__Group__1__Impl"


    // $ANTLR start "rule__TAnnotation__Group__2"
    // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:691:1: rule__TAnnotation__Group__2 : rule__TAnnotation__Group__2__Impl rule__TAnnotation__Group__3 ;
    public final void rule__TAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:695:1: ( rule__TAnnotation__Group__2__Impl rule__TAnnotation__Group__3 )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:696:2: rule__TAnnotation__Group__2__Impl rule__TAnnotation__Group__3
            {
            pushFollow(FOLLOW_rule__TAnnotation__Group__2__Impl_in_rule__TAnnotation__Group__21370);
            rule__TAnnotation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TAnnotation__Group__3_in_rule__TAnnotation__Group__21373);
            rule__TAnnotation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TAnnotation__Group__2"


    // $ANTLR start "rule__TAnnotation__Group__2__Impl"
    // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:703:1: rule__TAnnotation__Group__2__Impl : ( ( rule__TAnnotation__IdAssignment_2 ) ) ;
    public final void rule__TAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:707:1: ( ( ( rule__TAnnotation__IdAssignment_2 ) ) )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:708:1: ( ( rule__TAnnotation__IdAssignment_2 ) )
            {
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:708:1: ( ( rule__TAnnotation__IdAssignment_2 ) )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:709:1: ( rule__TAnnotation__IdAssignment_2 )
            {
             before(grammarAccess.getTAnnotationAccess().getIdAssignment_2()); 
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:710:1: ( rule__TAnnotation__IdAssignment_2 )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:710:2: rule__TAnnotation__IdAssignment_2
            {
            pushFollow(FOLLOW_rule__TAnnotation__IdAssignment_2_in_rule__TAnnotation__Group__2__Impl1400);
            rule__TAnnotation__IdAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTAnnotationAccess().getIdAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TAnnotation__Group__2__Impl"


    // $ANTLR start "rule__TAnnotation__Group__3"
    // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:720:1: rule__TAnnotation__Group__3 : rule__TAnnotation__Group__3__Impl rule__TAnnotation__Group__4 ;
    public final void rule__TAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:724:1: ( rule__TAnnotation__Group__3__Impl rule__TAnnotation__Group__4 )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:725:2: rule__TAnnotation__Group__3__Impl rule__TAnnotation__Group__4
            {
            pushFollow(FOLLOW_rule__TAnnotation__Group__3__Impl_in_rule__TAnnotation__Group__31430);
            rule__TAnnotation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TAnnotation__Group__4_in_rule__TAnnotation__Group__31433);
            rule__TAnnotation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TAnnotation__Group__3"


    // $ANTLR start "rule__TAnnotation__Group__3__Impl"
    // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:732:1: rule__TAnnotation__Group__3__Impl : ( ( rule__TAnnotation__TypeAssignment_3 ) ) ;
    public final void rule__TAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:736:1: ( ( ( rule__TAnnotation__TypeAssignment_3 ) ) )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:737:1: ( ( rule__TAnnotation__TypeAssignment_3 ) )
            {
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:737:1: ( ( rule__TAnnotation__TypeAssignment_3 ) )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:738:1: ( rule__TAnnotation__TypeAssignment_3 )
            {
             before(grammarAccess.getTAnnotationAccess().getTypeAssignment_3()); 
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:739:1: ( rule__TAnnotation__TypeAssignment_3 )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:739:2: rule__TAnnotation__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__TAnnotation__TypeAssignment_3_in_rule__TAnnotation__Group__3__Impl1460);
            rule__TAnnotation__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTAnnotationAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TAnnotation__Group__3__Impl"


    // $ANTLR start "rule__TAnnotation__Group__4"
    // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:749:1: rule__TAnnotation__Group__4 : rule__TAnnotation__Group__4__Impl rule__TAnnotation__Group__5 ;
    public final void rule__TAnnotation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:753:1: ( rule__TAnnotation__Group__4__Impl rule__TAnnotation__Group__5 )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:754:2: rule__TAnnotation__Group__4__Impl rule__TAnnotation__Group__5
            {
            pushFollow(FOLLOW_rule__TAnnotation__Group__4__Impl_in_rule__TAnnotation__Group__41490);
            rule__TAnnotation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TAnnotation__Group__5_in_rule__TAnnotation__Group__41493);
            rule__TAnnotation__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TAnnotation__Group__4"


    // $ANTLR start "rule__TAnnotation__Group__4__Impl"
    // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:761:1: rule__TAnnotation__Group__4__Impl : ( ( rule__TAnnotation__AAssignment_4 ) ) ;
    public final void rule__TAnnotation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:765:1: ( ( ( rule__TAnnotation__AAssignment_4 ) ) )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:766:1: ( ( rule__TAnnotation__AAssignment_4 ) )
            {
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:766:1: ( ( rule__TAnnotation__AAssignment_4 ) )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:767:1: ( rule__TAnnotation__AAssignment_4 )
            {
             before(grammarAccess.getTAnnotationAccess().getAAssignment_4()); 
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:768:1: ( rule__TAnnotation__AAssignment_4 )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:768:2: rule__TAnnotation__AAssignment_4
            {
            pushFollow(FOLLOW_rule__TAnnotation__AAssignment_4_in_rule__TAnnotation__Group__4__Impl1520);
            rule__TAnnotation__AAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getTAnnotationAccess().getAAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TAnnotation__Group__4__Impl"


    // $ANTLR start "rule__TAnnotation__Group__5"
    // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:778:1: rule__TAnnotation__Group__5 : rule__TAnnotation__Group__5__Impl rule__TAnnotation__Group__6 ;
    public final void rule__TAnnotation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:782:1: ( rule__TAnnotation__Group__5__Impl rule__TAnnotation__Group__6 )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:783:2: rule__TAnnotation__Group__5__Impl rule__TAnnotation__Group__6
            {
            pushFollow(FOLLOW_rule__TAnnotation__Group__5__Impl_in_rule__TAnnotation__Group__51550);
            rule__TAnnotation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TAnnotation__Group__6_in_rule__TAnnotation__Group__51553);
            rule__TAnnotation__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TAnnotation__Group__5"


    // $ANTLR start "rule__TAnnotation__Group__5__Impl"
    // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:790:1: rule__TAnnotation__Group__5__Impl : ( ( rule__TAnnotation__BAssignment_5 ) ) ;
    public final void rule__TAnnotation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:794:1: ( ( ( rule__TAnnotation__BAssignment_5 ) ) )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:795:1: ( ( rule__TAnnotation__BAssignment_5 ) )
            {
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:795:1: ( ( rule__TAnnotation__BAssignment_5 ) )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:796:1: ( rule__TAnnotation__BAssignment_5 )
            {
             before(grammarAccess.getTAnnotationAccess().getBAssignment_5()); 
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:797:1: ( rule__TAnnotation__BAssignment_5 )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:797:2: rule__TAnnotation__BAssignment_5
            {
            pushFollow(FOLLOW_rule__TAnnotation__BAssignment_5_in_rule__TAnnotation__Group__5__Impl1580);
            rule__TAnnotation__BAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getTAnnotationAccess().getBAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TAnnotation__Group__5__Impl"


    // $ANTLR start "rule__TAnnotation__Group__6"
    // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:807:1: rule__TAnnotation__Group__6 : rule__TAnnotation__Group__6__Impl ;
    public final void rule__TAnnotation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:811:1: ( rule__TAnnotation__Group__6__Impl )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:812:2: rule__TAnnotation__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__TAnnotation__Group__6__Impl_in_rule__TAnnotation__Group__61610);
            rule__TAnnotation__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TAnnotation__Group__6"


    // $ANTLR start "rule__TAnnotation__Group__6__Impl"
    // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:818:1: rule__TAnnotation__Group__6__Impl : ( ( rule__TAnnotation__TextAssignment_6 ) ) ;
    public final void rule__TAnnotation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:822:1: ( ( ( rule__TAnnotation__TextAssignment_6 ) ) )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:823:1: ( ( rule__TAnnotation__TextAssignment_6 ) )
            {
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:823:1: ( ( rule__TAnnotation__TextAssignment_6 ) )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:824:1: ( rule__TAnnotation__TextAssignment_6 )
            {
             before(grammarAccess.getTAnnotationAccess().getTextAssignment_6()); 
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:825:1: ( rule__TAnnotation__TextAssignment_6 )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:825:2: rule__TAnnotation__TextAssignment_6
            {
            pushFollow(FOLLOW_rule__TAnnotation__TextAssignment_6_in_rule__TAnnotation__Group__6__Impl1637);
            rule__TAnnotation__TextAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getTAnnotationAccess().getTextAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TAnnotation__Group__6__Impl"


    // $ANTLR start "rule__RAnnotation__Group__0"
    // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:849:1: rule__RAnnotation__Group__0 : rule__RAnnotation__Group__0__Impl rule__RAnnotation__Group__1 ;
    public final void rule__RAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:853:1: ( rule__RAnnotation__Group__0__Impl rule__RAnnotation__Group__1 )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:854:2: rule__RAnnotation__Group__0__Impl rule__RAnnotation__Group__1
            {
            pushFollow(FOLLOW_rule__RAnnotation__Group__0__Impl_in_rule__RAnnotation__Group__01681);
            rule__RAnnotation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RAnnotation__Group__1_in_rule__RAnnotation__Group__01684);
            rule__RAnnotation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RAnnotation__Group__0"


    // $ANTLR start "rule__RAnnotation__Group__0__Impl"
    // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:861:1: rule__RAnnotation__Group__0__Impl : ( ( rule__RAnnotation__NumAssignment_0 ) ) ;
    public final void rule__RAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:865:1: ( ( ( rule__RAnnotation__NumAssignment_0 ) ) )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:866:1: ( ( rule__RAnnotation__NumAssignment_0 ) )
            {
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:866:1: ( ( rule__RAnnotation__NumAssignment_0 ) )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:867:1: ( rule__RAnnotation__NumAssignment_0 )
            {
             before(grammarAccess.getRAnnotationAccess().getNumAssignment_0()); 
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:868:1: ( rule__RAnnotation__NumAssignment_0 )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:868:2: rule__RAnnotation__NumAssignment_0
            {
            pushFollow(FOLLOW_rule__RAnnotation__NumAssignment_0_in_rule__RAnnotation__Group__0__Impl1711);
            rule__RAnnotation__NumAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRAnnotationAccess().getNumAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RAnnotation__Group__0__Impl"


    // $ANTLR start "rule__RAnnotation__Group__1"
    // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:878:1: rule__RAnnotation__Group__1 : rule__RAnnotation__Group__1__Impl rule__RAnnotation__Group__2 ;
    public final void rule__RAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:882:1: ( rule__RAnnotation__Group__1__Impl rule__RAnnotation__Group__2 )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:883:2: rule__RAnnotation__Group__1__Impl rule__RAnnotation__Group__2
            {
            pushFollow(FOLLOW_rule__RAnnotation__Group__1__Impl_in_rule__RAnnotation__Group__11741);
            rule__RAnnotation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RAnnotation__Group__2_in_rule__RAnnotation__Group__11744);
            rule__RAnnotation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RAnnotation__Group__1"


    // $ANTLR start "rule__RAnnotation__Group__1__Impl"
    // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:890:1: rule__RAnnotation__Group__1__Impl : ( ':R' ) ;
    public final void rule__RAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:894:1: ( ( ':R' ) )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:895:1: ( ':R' )
            {
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:895:1: ( ':R' )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:896:1: ':R'
            {
             before(grammarAccess.getRAnnotationAccess().getRKeyword_1()); 
            match(input,23,FOLLOW_23_in_rule__RAnnotation__Group__1__Impl1772); 
             after(grammarAccess.getRAnnotationAccess().getRKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RAnnotation__Group__1__Impl"


    // $ANTLR start "rule__RAnnotation__Group__2"
    // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:909:1: rule__RAnnotation__Group__2 : rule__RAnnotation__Group__2__Impl rule__RAnnotation__Group__3 ;
    public final void rule__RAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:913:1: ( rule__RAnnotation__Group__2__Impl rule__RAnnotation__Group__3 )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:914:2: rule__RAnnotation__Group__2__Impl rule__RAnnotation__Group__3
            {
            pushFollow(FOLLOW_rule__RAnnotation__Group__2__Impl_in_rule__RAnnotation__Group__21803);
            rule__RAnnotation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RAnnotation__Group__3_in_rule__RAnnotation__Group__21806);
            rule__RAnnotation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RAnnotation__Group__2"


    // $ANTLR start "rule__RAnnotation__Group__2__Impl"
    // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:921:1: rule__RAnnotation__Group__2__Impl : ( ( rule__RAnnotation__IdAssignment_2 ) ) ;
    public final void rule__RAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:925:1: ( ( ( rule__RAnnotation__IdAssignment_2 ) ) )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:926:1: ( ( rule__RAnnotation__IdAssignment_2 ) )
            {
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:926:1: ( ( rule__RAnnotation__IdAssignment_2 ) )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:927:1: ( rule__RAnnotation__IdAssignment_2 )
            {
             before(grammarAccess.getRAnnotationAccess().getIdAssignment_2()); 
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:928:1: ( rule__RAnnotation__IdAssignment_2 )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:928:2: rule__RAnnotation__IdAssignment_2
            {
            pushFollow(FOLLOW_rule__RAnnotation__IdAssignment_2_in_rule__RAnnotation__Group__2__Impl1833);
            rule__RAnnotation__IdAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRAnnotationAccess().getIdAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RAnnotation__Group__2__Impl"


    // $ANTLR start "rule__RAnnotation__Group__3"
    // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:938:1: rule__RAnnotation__Group__3 : rule__RAnnotation__Group__3__Impl rule__RAnnotation__Group__4 ;
    public final void rule__RAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:942:1: ( rule__RAnnotation__Group__3__Impl rule__RAnnotation__Group__4 )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:943:2: rule__RAnnotation__Group__3__Impl rule__RAnnotation__Group__4
            {
            pushFollow(FOLLOW_rule__RAnnotation__Group__3__Impl_in_rule__RAnnotation__Group__31863);
            rule__RAnnotation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RAnnotation__Group__4_in_rule__RAnnotation__Group__31866);
            rule__RAnnotation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RAnnotation__Group__3"


    // $ANTLR start "rule__RAnnotation__Group__3__Impl"
    // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:950:1: rule__RAnnotation__Group__3__Impl : ( ( rule__RAnnotation__TypeAssignment_3 ) ) ;
    public final void rule__RAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:954:1: ( ( ( rule__RAnnotation__TypeAssignment_3 ) ) )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:955:1: ( ( rule__RAnnotation__TypeAssignment_3 ) )
            {
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:955:1: ( ( rule__RAnnotation__TypeAssignment_3 ) )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:956:1: ( rule__RAnnotation__TypeAssignment_3 )
            {
             before(grammarAccess.getRAnnotationAccess().getTypeAssignment_3()); 
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:957:1: ( rule__RAnnotation__TypeAssignment_3 )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:957:2: rule__RAnnotation__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__RAnnotation__TypeAssignment_3_in_rule__RAnnotation__Group__3__Impl1893);
            rule__RAnnotation__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRAnnotationAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RAnnotation__Group__3__Impl"


    // $ANTLR start "rule__RAnnotation__Group__4"
    // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:967:1: rule__RAnnotation__Group__4 : rule__RAnnotation__Group__4__Impl rule__RAnnotation__Group__5 ;
    public final void rule__RAnnotation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:971:1: ( rule__RAnnotation__Group__4__Impl rule__RAnnotation__Group__5 )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:972:2: rule__RAnnotation__Group__4__Impl rule__RAnnotation__Group__5
            {
            pushFollow(FOLLOW_rule__RAnnotation__Group__4__Impl_in_rule__RAnnotation__Group__41923);
            rule__RAnnotation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RAnnotation__Group__5_in_rule__RAnnotation__Group__41926);
            rule__RAnnotation__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RAnnotation__Group__4"


    // $ANTLR start "rule__RAnnotation__Group__4__Impl"
    // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:979:1: rule__RAnnotation__Group__4__Impl : ( ( rule__RAnnotation__AaAssignment_4 ) ) ;
    public final void rule__RAnnotation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:983:1: ( ( ( rule__RAnnotation__AaAssignment_4 ) ) )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:984:1: ( ( rule__RAnnotation__AaAssignment_4 ) )
            {
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:984:1: ( ( rule__RAnnotation__AaAssignment_4 ) )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:985:1: ( rule__RAnnotation__AaAssignment_4 )
            {
             before(grammarAccess.getRAnnotationAccess().getAaAssignment_4()); 
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:986:1: ( rule__RAnnotation__AaAssignment_4 )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:986:2: rule__RAnnotation__AaAssignment_4
            {
            pushFollow(FOLLOW_rule__RAnnotation__AaAssignment_4_in_rule__RAnnotation__Group__4__Impl1953);
            rule__RAnnotation__AaAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRAnnotationAccess().getAaAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RAnnotation__Group__4__Impl"


    // $ANTLR start "rule__RAnnotation__Group__5"
    // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:996:1: rule__RAnnotation__Group__5 : rule__RAnnotation__Group__5__Impl rule__RAnnotation__Group__6 ;
    public final void rule__RAnnotation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:1000:1: ( rule__RAnnotation__Group__5__Impl rule__RAnnotation__Group__6 )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:1001:2: rule__RAnnotation__Group__5__Impl rule__RAnnotation__Group__6
            {
            pushFollow(FOLLOW_rule__RAnnotation__Group__5__Impl_in_rule__RAnnotation__Group__51983);
            rule__RAnnotation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RAnnotation__Group__6_in_rule__RAnnotation__Group__51986);
            rule__RAnnotation__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RAnnotation__Group__5"


    // $ANTLR start "rule__RAnnotation__Group__5__Impl"
    // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:1008:1: rule__RAnnotation__Group__5__Impl : ( ':T' ) ;
    public final void rule__RAnnotation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:1012:1: ( ( ':T' ) )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:1013:1: ( ':T' )
            {
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:1013:1: ( ':T' )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:1014:1: ':T'
            {
             before(grammarAccess.getRAnnotationAccess().getTKeyword_5()); 
            match(input,22,FOLLOW_22_in_rule__RAnnotation__Group__5__Impl2014); 
             after(grammarAccess.getRAnnotationAccess().getTKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RAnnotation__Group__5__Impl"


    // $ANTLR start "rule__RAnnotation__Group__6"
    // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:1027:1: rule__RAnnotation__Group__6 : rule__RAnnotation__Group__6__Impl rule__RAnnotation__Group__7 ;
    public final void rule__RAnnotation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:1031:1: ( rule__RAnnotation__Group__6__Impl rule__RAnnotation__Group__7 )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:1032:2: rule__RAnnotation__Group__6__Impl rule__RAnnotation__Group__7
            {
            pushFollow(FOLLOW_rule__RAnnotation__Group__6__Impl_in_rule__RAnnotation__Group__62045);
            rule__RAnnotation__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RAnnotation__Group__7_in_rule__RAnnotation__Group__62048);
            rule__RAnnotation__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RAnnotation__Group__6"


    // $ANTLR start "rule__RAnnotation__Group__6__Impl"
    // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:1039:1: rule__RAnnotation__Group__6__Impl : ( ( rule__RAnnotation__AbAssignment_6 ) ) ;
    public final void rule__RAnnotation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:1043:1: ( ( ( rule__RAnnotation__AbAssignment_6 ) ) )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:1044:1: ( ( rule__RAnnotation__AbAssignment_6 ) )
            {
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:1044:1: ( ( rule__RAnnotation__AbAssignment_6 ) )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:1045:1: ( rule__RAnnotation__AbAssignment_6 )
            {
             before(grammarAccess.getRAnnotationAccess().getAbAssignment_6()); 
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:1046:1: ( rule__RAnnotation__AbAssignment_6 )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:1046:2: rule__RAnnotation__AbAssignment_6
            {
            pushFollow(FOLLOW_rule__RAnnotation__AbAssignment_6_in_rule__RAnnotation__Group__6__Impl2075);
            rule__RAnnotation__AbAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getRAnnotationAccess().getAbAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RAnnotation__Group__6__Impl"


    // $ANTLR start "rule__RAnnotation__Group__7"
    // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:1056:1: rule__RAnnotation__Group__7 : rule__RAnnotation__Group__7__Impl rule__RAnnotation__Group__8 ;
    public final void rule__RAnnotation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:1060:1: ( rule__RAnnotation__Group__7__Impl rule__RAnnotation__Group__8 )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:1061:2: rule__RAnnotation__Group__7__Impl rule__RAnnotation__Group__8
            {
            pushFollow(FOLLOW_rule__RAnnotation__Group__7__Impl_in_rule__RAnnotation__Group__72105);
            rule__RAnnotation__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RAnnotation__Group__8_in_rule__RAnnotation__Group__72108);
            rule__RAnnotation__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RAnnotation__Group__7"


    // $ANTLR start "rule__RAnnotation__Group__7__Impl"
    // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:1068:1: rule__RAnnotation__Group__7__Impl : ( ( rule__RAnnotation__BaAssignment_7 ) ) ;
    public final void rule__RAnnotation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:1072:1: ( ( ( rule__RAnnotation__BaAssignment_7 ) ) )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:1073:1: ( ( rule__RAnnotation__BaAssignment_7 ) )
            {
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:1073:1: ( ( rule__RAnnotation__BaAssignment_7 ) )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:1074:1: ( rule__RAnnotation__BaAssignment_7 )
            {
             before(grammarAccess.getRAnnotationAccess().getBaAssignment_7()); 
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:1075:1: ( rule__RAnnotation__BaAssignment_7 )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:1075:2: rule__RAnnotation__BaAssignment_7
            {
            pushFollow(FOLLOW_rule__RAnnotation__BaAssignment_7_in_rule__RAnnotation__Group__7__Impl2135);
            rule__RAnnotation__BaAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getRAnnotationAccess().getBaAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RAnnotation__Group__7__Impl"


    // $ANTLR start "rule__RAnnotation__Group__8"
    // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:1085:1: rule__RAnnotation__Group__8 : rule__RAnnotation__Group__8__Impl rule__RAnnotation__Group__9 ;
    public final void rule__RAnnotation__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:1089:1: ( rule__RAnnotation__Group__8__Impl rule__RAnnotation__Group__9 )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:1090:2: rule__RAnnotation__Group__8__Impl rule__RAnnotation__Group__9
            {
            pushFollow(FOLLOW_rule__RAnnotation__Group__8__Impl_in_rule__RAnnotation__Group__82165);
            rule__RAnnotation__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RAnnotation__Group__9_in_rule__RAnnotation__Group__82168);
            rule__RAnnotation__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RAnnotation__Group__8"


    // $ANTLR start "rule__RAnnotation__Group__8__Impl"
    // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:1097:1: rule__RAnnotation__Group__8__Impl : ( ':T' ) ;
    public final void rule__RAnnotation__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:1101:1: ( ( ':T' ) )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:1102:1: ( ':T' )
            {
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:1102:1: ( ':T' )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:1103:1: ':T'
            {
             before(grammarAccess.getRAnnotationAccess().getTKeyword_8()); 
            match(input,22,FOLLOW_22_in_rule__RAnnotation__Group__8__Impl2196); 
             after(grammarAccess.getRAnnotationAccess().getTKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RAnnotation__Group__8__Impl"


    // $ANTLR start "rule__RAnnotation__Group__9"
    // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:1116:1: rule__RAnnotation__Group__9 : rule__RAnnotation__Group__9__Impl ;
    public final void rule__RAnnotation__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:1120:1: ( rule__RAnnotation__Group__9__Impl )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:1121:2: rule__RAnnotation__Group__9__Impl
            {
            pushFollow(FOLLOW_rule__RAnnotation__Group__9__Impl_in_rule__RAnnotation__Group__92227);
            rule__RAnnotation__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RAnnotation__Group__9"


    // $ANTLR start "rule__RAnnotation__Group__9__Impl"
    // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:1127:1: rule__RAnnotation__Group__9__Impl : ( ( rule__RAnnotation__BbAssignment_9 ) ) ;
    public final void rule__RAnnotation__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:1131:1: ( ( ( rule__RAnnotation__BbAssignment_9 ) ) )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:1132:1: ( ( rule__RAnnotation__BbAssignment_9 ) )
            {
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:1132:1: ( ( rule__RAnnotation__BbAssignment_9 ) )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:1133:1: ( rule__RAnnotation__BbAssignment_9 )
            {
             before(grammarAccess.getRAnnotationAccess().getBbAssignment_9()); 
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:1134:1: ( rule__RAnnotation__BbAssignment_9 )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:1134:2: rule__RAnnotation__BbAssignment_9
            {
            pushFollow(FOLLOW_rule__RAnnotation__BbAssignment_9_in_rule__RAnnotation__Group__9__Impl2254);
            rule__RAnnotation__BbAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getRAnnotationAccess().getBbAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RAnnotation__Group__9__Impl"


    // $ANTLR start "rule__Model__RequirementsAssignment_3"
    // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:1165:1: rule__Model__RequirementsAssignment_3 : ( ruleRequirement ) ;
    public final void rule__Model__RequirementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:1169:1: ( ( ruleRequirement ) )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:1170:1: ( ruleRequirement )
            {
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:1170:1: ( ruleRequirement )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:1171:1: ruleRequirement
            {
             before(grammarAccess.getModelAccess().getRequirementsRequirementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleRequirement_in_rule__Model__RequirementsAssignment_32309);
            ruleRequirement();

            state._fsp--;

             after(grammarAccess.getModelAccess().getRequirementsRequirementParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__RequirementsAssignment_3"


    // $ANTLR start "rule__Model__AnnotationsAssignment_7"
    // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:1180:1: rule__Model__AnnotationsAssignment_7 : ( ( rule__Model__AnnotationsAlternatives_7_0 ) ) ;
    public final void rule__Model__AnnotationsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:1184:1: ( ( ( rule__Model__AnnotationsAlternatives_7_0 ) ) )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:1185:1: ( ( rule__Model__AnnotationsAlternatives_7_0 ) )
            {
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:1185:1: ( ( rule__Model__AnnotationsAlternatives_7_0 ) )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:1186:1: ( rule__Model__AnnotationsAlternatives_7_0 )
            {
             before(grammarAccess.getModelAccess().getAnnotationsAlternatives_7_0()); 
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:1187:1: ( rule__Model__AnnotationsAlternatives_7_0 )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:1187:2: rule__Model__AnnotationsAlternatives_7_0
            {
            pushFollow(FOLLOW_rule__Model__AnnotationsAlternatives_7_0_in_rule__Model__AnnotationsAssignment_72340);
            rule__Model__AnnotationsAlternatives_7_0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getAnnotationsAlternatives_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__AnnotationsAssignment_7"


    // $ANTLR start "rule__Requirement__TextAssignment"
    // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:1196:1: rule__Requirement__TextAssignment : ( ( rule__Requirement__TextAlternatives_0 ) ) ;
    public final void rule__Requirement__TextAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:1200:1: ( ( ( rule__Requirement__TextAlternatives_0 ) ) )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:1201:1: ( ( rule__Requirement__TextAlternatives_0 ) )
            {
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:1201:1: ( ( rule__Requirement__TextAlternatives_0 ) )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:1202:1: ( rule__Requirement__TextAlternatives_0 )
            {
             before(grammarAccess.getRequirementAccess().getTextAlternatives_0()); 
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:1203:1: ( rule__Requirement__TextAlternatives_0 )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:1203:2: rule__Requirement__TextAlternatives_0
            {
            pushFollow(FOLLOW_rule__Requirement__TextAlternatives_0_in_rule__Requirement__TextAssignment2373);
            rule__Requirement__TextAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getRequirementAccess().getTextAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requirement__TextAssignment"


    // $ANTLR start "rule__TAnnotation__NumAssignment_0"
    // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:1212:1: rule__TAnnotation__NumAssignment_0 : ( RULE_INT ) ;
    public final void rule__TAnnotation__NumAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:1216:1: ( ( RULE_INT ) )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:1217:1: ( RULE_INT )
            {
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:1217:1: ( RULE_INT )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:1218:1: RULE_INT
            {
             before(grammarAccess.getTAnnotationAccess().getNumINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__TAnnotation__NumAssignment_02406); 
             after(grammarAccess.getTAnnotationAccess().getNumINTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TAnnotation__NumAssignment_0"


    // $ANTLR start "rule__TAnnotation__IdAssignment_2"
    // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:1227:1: rule__TAnnotation__IdAssignment_2 : ( RULE_INT ) ;
    public final void rule__TAnnotation__IdAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:1231:1: ( ( RULE_INT ) )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:1232:1: ( RULE_INT )
            {
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:1232:1: ( RULE_INT )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:1233:1: RULE_INT
            {
             before(grammarAccess.getTAnnotationAccess().getIdINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__TAnnotation__IdAssignment_22437); 
             after(grammarAccess.getTAnnotationAccess().getIdINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TAnnotation__IdAssignment_2"


    // $ANTLR start "rule__TAnnotation__TypeAssignment_3"
    // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:1242:1: rule__TAnnotation__TypeAssignment_3 : ( ( rule__TAnnotation__TypeAlternatives_3_0 ) ) ;
    public final void rule__TAnnotation__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:1246:1: ( ( ( rule__TAnnotation__TypeAlternatives_3_0 ) ) )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:1247:1: ( ( rule__TAnnotation__TypeAlternatives_3_0 ) )
            {
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:1247:1: ( ( rule__TAnnotation__TypeAlternatives_3_0 ) )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:1248:1: ( rule__TAnnotation__TypeAlternatives_3_0 )
            {
             before(grammarAccess.getTAnnotationAccess().getTypeAlternatives_3_0()); 
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:1249:1: ( rule__TAnnotation__TypeAlternatives_3_0 )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:1249:2: rule__TAnnotation__TypeAlternatives_3_0
            {
            pushFollow(FOLLOW_rule__TAnnotation__TypeAlternatives_3_0_in_rule__TAnnotation__TypeAssignment_32468);
            rule__TAnnotation__TypeAlternatives_3_0();

            state._fsp--;


            }

             after(grammarAccess.getTAnnotationAccess().getTypeAlternatives_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TAnnotation__TypeAssignment_3"


    // $ANTLR start "rule__TAnnotation__AAssignment_4"
    // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:1258:1: rule__TAnnotation__AAssignment_4 : ( RULE_INT ) ;
    public final void rule__TAnnotation__AAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:1262:1: ( ( RULE_INT ) )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:1263:1: ( RULE_INT )
            {
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:1263:1: ( RULE_INT )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:1264:1: RULE_INT
            {
             before(grammarAccess.getTAnnotationAccess().getAINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__TAnnotation__AAssignment_42501); 
             after(grammarAccess.getTAnnotationAccess().getAINTTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TAnnotation__AAssignment_4"


    // $ANTLR start "rule__TAnnotation__BAssignment_5"
    // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:1273:1: rule__TAnnotation__BAssignment_5 : ( RULE_INT ) ;
    public final void rule__TAnnotation__BAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:1277:1: ( ( RULE_INT ) )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:1278:1: ( RULE_INT )
            {
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:1278:1: ( RULE_INT )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:1279:1: RULE_INT
            {
             before(grammarAccess.getTAnnotationAccess().getBINTTerminalRuleCall_5_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__TAnnotation__BAssignment_52532); 
             after(grammarAccess.getTAnnotationAccess().getBINTTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TAnnotation__BAssignment_5"


    // $ANTLR start "rule__TAnnotation__TextAssignment_6"
    // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:1288:1: rule__TAnnotation__TextAssignment_6 : ( ruleUnquotedString ) ;
    public final void rule__TAnnotation__TextAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:1292:1: ( ( ruleUnquotedString ) )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:1293:1: ( ruleUnquotedString )
            {
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:1293:1: ( ruleUnquotedString )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:1294:1: ruleUnquotedString
            {
             before(grammarAccess.getTAnnotationAccess().getTextUnquotedStringParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleUnquotedString_in_rule__TAnnotation__TextAssignment_62563);
            ruleUnquotedString();

            state._fsp--;

             after(grammarAccess.getTAnnotationAccess().getTextUnquotedStringParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TAnnotation__TextAssignment_6"


    // $ANTLR start "rule__RAnnotation__NumAssignment_0"
    // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:1303:1: rule__RAnnotation__NumAssignment_0 : ( RULE_INT ) ;
    public final void rule__RAnnotation__NumAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:1307:1: ( ( RULE_INT ) )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:1308:1: ( RULE_INT )
            {
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:1308:1: ( RULE_INT )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:1309:1: RULE_INT
            {
             before(grammarAccess.getRAnnotationAccess().getNumINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__RAnnotation__NumAssignment_02594); 
             after(grammarAccess.getRAnnotationAccess().getNumINTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RAnnotation__NumAssignment_0"


    // $ANTLR start "rule__RAnnotation__IdAssignment_2"
    // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:1318:1: rule__RAnnotation__IdAssignment_2 : ( RULE_INT ) ;
    public final void rule__RAnnotation__IdAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:1322:1: ( ( RULE_INT ) )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:1323:1: ( RULE_INT )
            {
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:1323:1: ( RULE_INT )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:1324:1: RULE_INT
            {
             before(grammarAccess.getRAnnotationAccess().getIdINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__RAnnotation__IdAssignment_22625); 
             after(grammarAccess.getRAnnotationAccess().getIdINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RAnnotation__IdAssignment_2"


    // $ANTLR start "rule__RAnnotation__TypeAssignment_3"
    // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:1333:1: rule__RAnnotation__TypeAssignment_3 : ( ( rule__RAnnotation__TypeAlternatives_3_0 ) ) ;
    public final void rule__RAnnotation__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:1337:1: ( ( ( rule__RAnnotation__TypeAlternatives_3_0 ) ) )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:1338:1: ( ( rule__RAnnotation__TypeAlternatives_3_0 ) )
            {
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:1338:1: ( ( rule__RAnnotation__TypeAlternatives_3_0 ) )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:1339:1: ( rule__RAnnotation__TypeAlternatives_3_0 )
            {
             before(grammarAccess.getRAnnotationAccess().getTypeAlternatives_3_0()); 
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:1340:1: ( rule__RAnnotation__TypeAlternatives_3_0 )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:1340:2: rule__RAnnotation__TypeAlternatives_3_0
            {
            pushFollow(FOLLOW_rule__RAnnotation__TypeAlternatives_3_0_in_rule__RAnnotation__TypeAssignment_32656);
            rule__RAnnotation__TypeAlternatives_3_0();

            state._fsp--;


            }

             after(grammarAccess.getRAnnotationAccess().getTypeAlternatives_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RAnnotation__TypeAssignment_3"


    // $ANTLR start "rule__RAnnotation__AaAssignment_4"
    // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:1349:1: rule__RAnnotation__AaAssignment_4 : ( RULE_INT ) ;
    public final void rule__RAnnotation__AaAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:1353:1: ( ( RULE_INT ) )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:1354:1: ( RULE_INT )
            {
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:1354:1: ( RULE_INT )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:1355:1: RULE_INT
            {
             before(grammarAccess.getRAnnotationAccess().getAaINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__RAnnotation__AaAssignment_42689); 
             after(grammarAccess.getRAnnotationAccess().getAaINTTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RAnnotation__AaAssignment_4"


    // $ANTLR start "rule__RAnnotation__AbAssignment_6"
    // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:1364:1: rule__RAnnotation__AbAssignment_6 : ( RULE_INT ) ;
    public final void rule__RAnnotation__AbAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:1368:1: ( ( RULE_INT ) )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:1369:1: ( RULE_INT )
            {
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:1369:1: ( RULE_INT )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:1370:1: RULE_INT
            {
             before(grammarAccess.getRAnnotationAccess().getAbINTTerminalRuleCall_6_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__RAnnotation__AbAssignment_62720); 
             after(grammarAccess.getRAnnotationAccess().getAbINTTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RAnnotation__AbAssignment_6"


    // $ANTLR start "rule__RAnnotation__BaAssignment_7"
    // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:1379:1: rule__RAnnotation__BaAssignment_7 : ( RULE_INT ) ;
    public final void rule__RAnnotation__BaAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:1383:1: ( ( RULE_INT ) )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:1384:1: ( RULE_INT )
            {
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:1384:1: ( RULE_INT )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:1385:1: RULE_INT
            {
             before(grammarAccess.getRAnnotationAccess().getBaINTTerminalRuleCall_7_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__RAnnotation__BaAssignment_72751); 
             after(grammarAccess.getRAnnotationAccess().getBaINTTerminalRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RAnnotation__BaAssignment_7"


    // $ANTLR start "rule__RAnnotation__BbAssignment_9"
    // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:1394:1: rule__RAnnotation__BbAssignment_9 : ( RULE_INT ) ;
    public final void rule__RAnnotation__BbAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:1398:1: ( ( RULE_INT ) )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:1399:1: ( RULE_INT )
            {
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:1399:1: ( RULE_INT )
            // ../eu.scasefp7.eclipse.reqeditor.dsl.ui/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/ui/contentassist/antlr/internal/InternalRqsDsl.g:1400:1: RULE_INT
            {
             before(grammarAccess.getRAnnotationAccess().getBbINTTerminalRuleCall_9_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__RAnnotation__BbAssignment_92782); 
             after(grammarAccess.getRAnnotationAccess().getBbINTTerminalRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RAnnotation__BbAssignment_9"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequirement_in_entryRuleRequirement121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRequirement128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Requirement__TextAssignment_in_ruleRequirement154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTAnnotation_in_entryRuleTAnnotation181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTAnnotation188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TAnnotation__Group__0_in_ruleTAnnotation214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnquotedString_in_entryRuleUnquotedString241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnquotedString248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUnquotedString277 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUnquotedString290 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleRAnnotation_in_entryRuleRAnnotation320 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRAnnotation327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RAnnotation__Group__0_in_ruleRAnnotation353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTAnnotation_in_rule__Model__AnnotationsAlternatives_7_0389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRAnnotation_in_rule__Model__AnnotationsAlternatives_7_0406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Requirement__TextAlternatives_0438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Requirement__TextAlternatives_0456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__TAnnotation__TypeAlternatives_3_0491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__TAnnotation__TypeAlternatives_3_0511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__TAnnotation__TypeAlternatives_3_0531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__TAnnotation__TypeAlternatives_3_0551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__RAnnotation__TypeAlternatives_3_0586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__RAnnotation__TypeAlternatives_3_0606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__RAnnotation__TypeAlternatives_3_0626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__RAnnotation__TypeAlternatives_3_0646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__0678 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__1739 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__1742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Model__Group__1__Impl770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__2801 = new BitSet(new long[]{0x0000000000100810L});
    public static final BitSet FOLLOW_rule__Model__Group__3_in_rule__Model__Group__2804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Model__Group__2__Impl832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__3863 = new BitSet(new long[]{0x0000000000100810L});
    public static final BitSet FOLLOW_rule__Model__Group__4_in_rule__Model__Group__3866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__RequirementsAssignment_3_in_rule__Model__Group__3__Impl893 = new BitSet(new long[]{0x0000000000000812L});
    public static final BitSet FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__4924 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Model__Group__5_in_rule__Model__Group__4927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Model__Group__4__Impl955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__5__Impl_in_rule__Model__Group__5986 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Model__Group__6_in_rule__Model__Group__5989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Model__Group__5__Impl1017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__6__Impl_in_rule__Model__Group__61048 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_rule__Model__Group__7_in_rule__Model__Group__61051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Model__Group__6__Impl1079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__7__Impl_in_rule__Model__Group__71110 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_rule__Model__Group__8_in_rule__Model__Group__71113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__AnnotationsAssignment_7_in_rule__Model__Group__7__Impl1140 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__Model__Group__8__Impl_in_rule__Model__Group__81171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Model__Group__8__Impl1199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TAnnotation__Group__0__Impl_in_rule__TAnnotation__Group__01248 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__TAnnotation__Group__1_in_rule__TAnnotation__Group__01251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TAnnotation__NumAssignment_0_in_rule__TAnnotation__Group__0__Impl1278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TAnnotation__Group__1__Impl_in_rule__TAnnotation__Group__11308 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__TAnnotation__Group__2_in_rule__TAnnotation__Group__11311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__TAnnotation__Group__1__Impl1339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TAnnotation__Group__2__Impl_in_rule__TAnnotation__Group__21370 = new BitSet(new long[]{0x000000000000F000L});
    public static final BitSet FOLLOW_rule__TAnnotation__Group__3_in_rule__TAnnotation__Group__21373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TAnnotation__IdAssignment_2_in_rule__TAnnotation__Group__2__Impl1400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TAnnotation__Group__3__Impl_in_rule__TAnnotation__Group__31430 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__TAnnotation__Group__4_in_rule__TAnnotation__Group__31433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TAnnotation__TypeAssignment_3_in_rule__TAnnotation__Group__3__Impl1460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TAnnotation__Group__4__Impl_in_rule__TAnnotation__Group__41490 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__TAnnotation__Group__5_in_rule__TAnnotation__Group__41493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TAnnotation__AAssignment_4_in_rule__TAnnotation__Group__4__Impl1520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TAnnotation__Group__5__Impl_in_rule__TAnnotation__Group__51550 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TAnnotation__Group__6_in_rule__TAnnotation__Group__51553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TAnnotation__BAssignment_5_in_rule__TAnnotation__Group__5__Impl1580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TAnnotation__Group__6__Impl_in_rule__TAnnotation__Group__61610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TAnnotation__TextAssignment_6_in_rule__TAnnotation__Group__6__Impl1637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RAnnotation__Group__0__Impl_in_rule__RAnnotation__Group__01681 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__RAnnotation__Group__1_in_rule__RAnnotation__Group__01684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RAnnotation__NumAssignment_0_in_rule__RAnnotation__Group__0__Impl1711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RAnnotation__Group__1__Impl_in_rule__RAnnotation__Group__11741 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__RAnnotation__Group__2_in_rule__RAnnotation__Group__11744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__RAnnotation__Group__1__Impl1772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RAnnotation__Group__2__Impl_in_rule__RAnnotation__Group__21803 = new BitSet(new long[]{0x0000000000078000L});
    public static final BitSet FOLLOW_rule__RAnnotation__Group__3_in_rule__RAnnotation__Group__21806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RAnnotation__IdAssignment_2_in_rule__RAnnotation__Group__2__Impl1833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RAnnotation__Group__3__Impl_in_rule__RAnnotation__Group__31863 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__RAnnotation__Group__4_in_rule__RAnnotation__Group__31866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RAnnotation__TypeAssignment_3_in_rule__RAnnotation__Group__3__Impl1893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RAnnotation__Group__4__Impl_in_rule__RAnnotation__Group__41923 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__RAnnotation__Group__5_in_rule__RAnnotation__Group__41926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RAnnotation__AaAssignment_4_in_rule__RAnnotation__Group__4__Impl1953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RAnnotation__Group__5__Impl_in_rule__RAnnotation__Group__51983 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__RAnnotation__Group__6_in_rule__RAnnotation__Group__51986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__RAnnotation__Group__5__Impl2014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RAnnotation__Group__6__Impl_in_rule__RAnnotation__Group__62045 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__RAnnotation__Group__7_in_rule__RAnnotation__Group__62048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RAnnotation__AbAssignment_6_in_rule__RAnnotation__Group__6__Impl2075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RAnnotation__Group__7__Impl_in_rule__RAnnotation__Group__72105 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__RAnnotation__Group__8_in_rule__RAnnotation__Group__72108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RAnnotation__BaAssignment_7_in_rule__RAnnotation__Group__7__Impl2135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RAnnotation__Group__8__Impl_in_rule__RAnnotation__Group__82165 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__RAnnotation__Group__9_in_rule__RAnnotation__Group__82168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__RAnnotation__Group__8__Impl2196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RAnnotation__Group__9__Impl_in_rule__RAnnotation__Group__92227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RAnnotation__BbAssignment_9_in_rule__RAnnotation__Group__9__Impl2254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequirement_in_rule__Model__RequirementsAssignment_32309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__AnnotationsAlternatives_7_0_in_rule__Model__AnnotationsAssignment_72340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Requirement__TextAlternatives_0_in_rule__Requirement__TextAssignment2373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__TAnnotation__NumAssignment_02406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__TAnnotation__IdAssignment_22437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TAnnotation__TypeAlternatives_3_0_in_rule__TAnnotation__TypeAssignment_32468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__TAnnotation__AAssignment_42501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__TAnnotation__BAssignment_52532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnquotedString_in_rule__TAnnotation__TextAssignment_62563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__RAnnotation__NumAssignment_02594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__RAnnotation__IdAssignment_22625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RAnnotation__TypeAlternatives_3_0_in_rule__RAnnotation__TypeAssignment_32656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__RAnnotation__AaAssignment_42689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__RAnnotation__AbAssignment_62720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__RAnnotation__BaAssignment_72751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__RAnnotation__BbAssignment_92782 = new BitSet(new long[]{0x0000000000000002L});

}