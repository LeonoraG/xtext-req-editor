package eu.scasefp7.eclipse.reqeditor.dsl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import eu.scasefp7.eclipse.reqeditor.dsl.services.RqsDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRqsDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'REQUIREMENTS'", "'------------'", "'ANNOTATIONS'", "'.'", "':T'", "'Actor'", "'Action'", "'Object'", "'Property'", "':R'", "'IsActorOf'", "'HasProperty'", "'ActsOn'"
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
    public String getGrammarFileName() { return "../eu.scasefp7.eclipse.reqeditor.dsl/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/parser/antlr/internal/InternalRqsDsl.g"; }



     	private RqsDslGrammarAccess grammarAccess;
     	
        public InternalRqsDslParser(TokenStream input, RqsDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected RqsDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../eu.scasefp7.eclipse.reqeditor.dsl/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/parser/antlr/internal/InternalRqsDsl.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../eu.scasefp7.eclipse.reqeditor.dsl/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/parser/antlr/internal/InternalRqsDsl.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../eu.scasefp7.eclipse.reqeditor.dsl/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/parser/antlr/internal/InternalRqsDsl.g:69:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../eu.scasefp7.eclipse.reqeditor.dsl/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/parser/antlr/internal/InternalRqsDsl.g:76:1: ruleModel returns [EObject current=null] : ( () otherlv_1= 'REQUIREMENTS' otherlv_2= '------------' ( (lv_requirements_3_0= ruleRequirement ) )* otherlv_4= '------------' otherlv_5= 'ANNOTATIONS' otherlv_6= '------------' ( ( (lv_annotations_7_1= ruleTAnnotation | lv_annotations_7_2= ruleRAnnotation ) ) )* otherlv_8= '------------' ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_requirements_3_0 = null;

        EObject lv_annotations_7_1 = null;

        EObject lv_annotations_7_2 = null;


         enterRule(); 
            
        try {
            // ../eu.scasefp7.eclipse.reqeditor.dsl/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/parser/antlr/internal/InternalRqsDsl.g:79:28: ( ( () otherlv_1= 'REQUIREMENTS' otherlv_2= '------------' ( (lv_requirements_3_0= ruleRequirement ) )* otherlv_4= '------------' otherlv_5= 'ANNOTATIONS' otherlv_6= '------------' ( ( (lv_annotations_7_1= ruleTAnnotation | lv_annotations_7_2= ruleRAnnotation ) ) )* otherlv_8= '------------' ) )
            // ../eu.scasefp7.eclipse.reqeditor.dsl/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/parser/antlr/internal/InternalRqsDsl.g:80:1: ( () otherlv_1= 'REQUIREMENTS' otherlv_2= '------------' ( (lv_requirements_3_0= ruleRequirement ) )* otherlv_4= '------------' otherlv_5= 'ANNOTATIONS' otherlv_6= '------------' ( ( (lv_annotations_7_1= ruleTAnnotation | lv_annotations_7_2= ruleRAnnotation ) ) )* otherlv_8= '------------' )
            {
            // ../eu.scasefp7.eclipse.reqeditor.dsl/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/parser/antlr/internal/InternalRqsDsl.g:80:1: ( () otherlv_1= 'REQUIREMENTS' otherlv_2= '------------' ( (lv_requirements_3_0= ruleRequirement ) )* otherlv_4= '------------' otherlv_5= 'ANNOTATIONS' otherlv_6= '------------' ( ( (lv_annotations_7_1= ruleTAnnotation | lv_annotations_7_2= ruleRAnnotation ) ) )* otherlv_8= '------------' )
            // ../eu.scasefp7.eclipse.reqeditor.dsl/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/parser/antlr/internal/InternalRqsDsl.g:80:2: () otherlv_1= 'REQUIREMENTS' otherlv_2= '------------' ( (lv_requirements_3_0= ruleRequirement ) )* otherlv_4= '------------' otherlv_5= 'ANNOTATIONS' otherlv_6= '------------' ( ( (lv_annotations_7_1= ruleTAnnotation | lv_annotations_7_2= ruleRAnnotation ) ) )* otherlv_8= '------------'
            {
            // ../eu.scasefp7.eclipse.reqeditor.dsl/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/parser/antlr/internal/InternalRqsDsl.g:80:2: ()
            // ../eu.scasefp7.eclipse.reqeditor.dsl/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/parser/antlr/internal/InternalRqsDsl.g:81:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getModelAccess().getModelAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,11,FOLLOW_11_in_ruleModel131); 

                	newLeafNode(otherlv_1, grammarAccess.getModelAccess().getREQUIREMENTSKeyword_1());
                
            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleModel143); 

                	newLeafNode(otherlv_2, grammarAccess.getModelAccess().getHyphenMinusHyphenMinusHyphenMinusHyphenMinusHyphenMinusHyphenMinusHyphenMinusHyphenMinusHyphenMinusHyphenMinusHyphenMinusHyphenMinusKeyword_2());
                
            // ../eu.scasefp7.eclipse.reqeditor.dsl/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/parser/antlr/internal/InternalRqsDsl.g:94:1: ( (lv_requirements_3_0= ruleRequirement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../eu.scasefp7.eclipse.reqeditor.dsl/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/parser/antlr/internal/InternalRqsDsl.g:95:1: (lv_requirements_3_0= ruleRequirement )
            	    {
            	    // ../eu.scasefp7.eclipse.reqeditor.dsl/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/parser/antlr/internal/InternalRqsDsl.g:95:1: (lv_requirements_3_0= ruleRequirement )
            	    // ../eu.scasefp7.eclipse.reqeditor.dsl/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/parser/antlr/internal/InternalRqsDsl.g:96:3: lv_requirements_3_0= ruleRequirement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getRequirementsRequirementParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRequirement_in_ruleModel164);
            	    lv_requirements_3_0=ruleRequirement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"requirements",
            	            		lv_requirements_3_0, 
            	            		"Requirement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_4=(Token)match(input,12,FOLLOW_12_in_ruleModel177); 

                	newLeafNode(otherlv_4, grammarAccess.getModelAccess().getHyphenMinusHyphenMinusHyphenMinusHyphenMinusHyphenMinusHyphenMinusHyphenMinusHyphenMinusHyphenMinusHyphenMinusHyphenMinusHyphenMinusKeyword_4());
                
            otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleModel189); 

                	newLeafNode(otherlv_5, grammarAccess.getModelAccess().getANNOTATIONSKeyword_5());
                
            otherlv_6=(Token)match(input,12,FOLLOW_12_in_ruleModel201); 

                	newLeafNode(otherlv_6, grammarAccess.getModelAccess().getHyphenMinusHyphenMinusHyphenMinusHyphenMinusHyphenMinusHyphenMinusHyphenMinusHyphenMinusHyphenMinusHyphenMinusHyphenMinusHyphenMinusKeyword_6());
                
            // ../eu.scasefp7.eclipse.reqeditor.dsl/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/parser/antlr/internal/InternalRqsDsl.g:124:1: ( ( (lv_annotations_7_1= ruleTAnnotation | lv_annotations_7_2= ruleRAnnotation ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_INT) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../eu.scasefp7.eclipse.reqeditor.dsl/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/parser/antlr/internal/InternalRqsDsl.g:125:1: ( (lv_annotations_7_1= ruleTAnnotation | lv_annotations_7_2= ruleRAnnotation ) )
            	    {
            	    // ../eu.scasefp7.eclipse.reqeditor.dsl/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/parser/antlr/internal/InternalRqsDsl.g:125:1: ( (lv_annotations_7_1= ruleTAnnotation | lv_annotations_7_2= ruleRAnnotation ) )
            	    // ../eu.scasefp7.eclipse.reqeditor.dsl/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/parser/antlr/internal/InternalRqsDsl.g:126:1: (lv_annotations_7_1= ruleTAnnotation | lv_annotations_7_2= ruleRAnnotation )
            	    {
            	    // ../eu.scasefp7.eclipse.reqeditor.dsl/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/parser/antlr/internal/InternalRqsDsl.g:126:1: (lv_annotations_7_1= ruleTAnnotation | lv_annotations_7_2= ruleRAnnotation )
            	    int alt2=2;
            	    int LA2_0 = input.LA(1);

            	    if ( (LA2_0==RULE_INT) ) {
            	        int LA2_1 = input.LA(2);

            	        if ( (LA2_1==15) ) {
            	            alt2=1;
            	        }
            	        else if ( (LA2_1==20) ) {
            	            alt2=2;
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
            	            // ../eu.scasefp7.eclipse.reqeditor.dsl/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/parser/antlr/internal/InternalRqsDsl.g:127:3: lv_annotations_7_1= ruleTAnnotation
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getModelAccess().getAnnotationsTAnnotationParserRuleCall_7_0_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleTAnnotation_in_ruleModel224);
            	            lv_annotations_7_1=ruleTAnnotation();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getModelRule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"annotations",
            	                    		lv_annotations_7_1, 
            	                    		"TAnnotation");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../eu.scasefp7.eclipse.reqeditor.dsl/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/parser/antlr/internal/InternalRqsDsl.g:142:8: lv_annotations_7_2= ruleRAnnotation
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getModelAccess().getAnnotationsRAnnotationParserRuleCall_7_0_1()); 
            	            	    
            	            pushFollow(FOLLOW_ruleRAnnotation_in_ruleModel243);
            	            lv_annotations_7_2=ruleRAnnotation();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getModelRule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"annotations",
            	                    		lv_annotations_7_2, 
            	                    		"RAnnotation");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_8=(Token)match(input,12,FOLLOW_12_in_ruleModel259); 

                	newLeafNode(otherlv_8, grammarAccess.getModelAccess().getHyphenMinusHyphenMinusHyphenMinusHyphenMinusHyphenMinusHyphenMinusHyphenMinusHyphenMinusHyphenMinusHyphenMinusHyphenMinusHyphenMinusKeyword_8());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleRequirement"
    // ../eu.scasefp7.eclipse.reqeditor.dsl/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/parser/antlr/internal/InternalRqsDsl.g:172:1: entryRuleRequirement returns [EObject current=null] : iv_ruleRequirement= ruleRequirement EOF ;
    public final EObject entryRuleRequirement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequirement = null;


        try {
            // ../eu.scasefp7.eclipse.reqeditor.dsl/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/parser/antlr/internal/InternalRqsDsl.g:173:2: (iv_ruleRequirement= ruleRequirement EOF )
            // ../eu.scasefp7.eclipse.reqeditor.dsl/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/parser/antlr/internal/InternalRqsDsl.g:174:2: iv_ruleRequirement= ruleRequirement EOF
            {
             newCompositeNode(grammarAccess.getRequirementRule()); 
            pushFollow(FOLLOW_ruleRequirement_in_entryRuleRequirement295);
            iv_ruleRequirement=ruleRequirement();

            state._fsp--;

             current =iv_ruleRequirement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRequirement305); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRequirement"


    // $ANTLR start "ruleRequirement"
    // ../eu.scasefp7.eclipse.reqeditor.dsl/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/parser/antlr/internal/InternalRqsDsl.g:181:1: ruleRequirement returns [EObject current=null] : ( ( (lv_text_0_1= RULE_ID | lv_text_0_2= '.' ) ) ) ;
    public final EObject ruleRequirement() throws RecognitionException {
        EObject current = null;

        Token lv_text_0_1=null;
        Token lv_text_0_2=null;

         enterRule(); 
            
        try {
            // ../eu.scasefp7.eclipse.reqeditor.dsl/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/parser/antlr/internal/InternalRqsDsl.g:184:28: ( ( ( (lv_text_0_1= RULE_ID | lv_text_0_2= '.' ) ) ) )
            // ../eu.scasefp7.eclipse.reqeditor.dsl/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/parser/antlr/internal/InternalRqsDsl.g:185:1: ( ( (lv_text_0_1= RULE_ID | lv_text_0_2= '.' ) ) )
            {
            // ../eu.scasefp7.eclipse.reqeditor.dsl/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/parser/antlr/internal/InternalRqsDsl.g:185:1: ( ( (lv_text_0_1= RULE_ID | lv_text_0_2= '.' ) ) )
            // ../eu.scasefp7.eclipse.reqeditor.dsl/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/parser/antlr/internal/InternalRqsDsl.g:186:1: ( (lv_text_0_1= RULE_ID | lv_text_0_2= '.' ) )
            {
            // ../eu.scasefp7.eclipse.reqeditor.dsl/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/parser/antlr/internal/InternalRqsDsl.g:186:1: ( (lv_text_0_1= RULE_ID | lv_text_0_2= '.' ) )
            // ../eu.scasefp7.eclipse.reqeditor.dsl/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/parser/antlr/internal/InternalRqsDsl.g:187:1: (lv_text_0_1= RULE_ID | lv_text_0_2= '.' )
            {
            // ../eu.scasefp7.eclipse.reqeditor.dsl/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/parser/antlr/internal/InternalRqsDsl.g:187:1: (lv_text_0_1= RULE_ID | lv_text_0_2= '.' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            else if ( (LA4_0==14) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../eu.scasefp7.eclipse.reqeditor.dsl/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/parser/antlr/internal/InternalRqsDsl.g:188:3: lv_text_0_1= RULE_ID
                    {
                    lv_text_0_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRequirement348); 

                    			newLeafNode(lv_text_0_1, grammarAccess.getRequirementAccess().getTextIDTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRequirementRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"text",
                            		lv_text_0_1, 
                            		"ID");
                    	    

                    }
                    break;
                case 2 :
                    // ../eu.scasefp7.eclipse.reqeditor.dsl/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/parser/antlr/internal/InternalRqsDsl.g:203:8: lv_text_0_2= '.'
                    {
                    lv_text_0_2=(Token)match(input,14,FOLLOW_14_in_ruleRequirement369); 

                            newLeafNode(lv_text_0_2, grammarAccess.getRequirementAccess().getTextFullStopKeyword_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRequirementRule());
                    	        }
                           		setWithLastConsumed(current, "text", lv_text_0_2, null);
                    	    

                    }
                    break;

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRequirement"


    // $ANTLR start "entryRuleTAnnotation"
    // ../eu.scasefp7.eclipse.reqeditor.dsl/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/parser/antlr/internal/InternalRqsDsl.g:226:1: entryRuleTAnnotation returns [EObject current=null] : iv_ruleTAnnotation= ruleTAnnotation EOF ;
    public final EObject entryRuleTAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTAnnotation = null;


        try {
            // ../eu.scasefp7.eclipse.reqeditor.dsl/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/parser/antlr/internal/InternalRqsDsl.g:227:2: (iv_ruleTAnnotation= ruleTAnnotation EOF )
            // ../eu.scasefp7.eclipse.reqeditor.dsl/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/parser/antlr/internal/InternalRqsDsl.g:228:2: iv_ruleTAnnotation= ruleTAnnotation EOF
            {
             newCompositeNode(grammarAccess.getTAnnotationRule()); 
            pushFollow(FOLLOW_ruleTAnnotation_in_entryRuleTAnnotation420);
            iv_ruleTAnnotation=ruleTAnnotation();

            state._fsp--;

             current =iv_ruleTAnnotation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTAnnotation430); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTAnnotation"


    // $ANTLR start "ruleTAnnotation"
    // ../eu.scasefp7.eclipse.reqeditor.dsl/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/parser/antlr/internal/InternalRqsDsl.g:235:1: ruleTAnnotation returns [EObject current=null] : ( ( (lv_num_0_0= RULE_INT ) ) otherlv_1= ':T' ( (lv_id_2_0= RULE_INT ) ) ( ( (lv_type_3_1= 'Actor' | lv_type_3_2= 'Action' | lv_type_3_3= 'Object' | lv_type_3_4= 'Property' ) ) ) ( (lv_a_4_0= RULE_INT ) ) ( (lv_b_5_0= RULE_INT ) ) ( (lv_text_6_0= ruleUnquotedString ) ) ) ;
    public final EObject ruleTAnnotation() throws RecognitionException {
        EObject current = null;

        Token lv_num_0_0=null;
        Token otherlv_1=null;
        Token lv_id_2_0=null;
        Token lv_type_3_1=null;
        Token lv_type_3_2=null;
        Token lv_type_3_3=null;
        Token lv_type_3_4=null;
        Token lv_a_4_0=null;
        Token lv_b_5_0=null;
        AntlrDatatypeRuleToken lv_text_6_0 = null;


         enterRule(); 
            
        try {
            // ../eu.scasefp7.eclipse.reqeditor.dsl/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/parser/antlr/internal/InternalRqsDsl.g:238:28: ( ( ( (lv_num_0_0= RULE_INT ) ) otherlv_1= ':T' ( (lv_id_2_0= RULE_INT ) ) ( ( (lv_type_3_1= 'Actor' | lv_type_3_2= 'Action' | lv_type_3_3= 'Object' | lv_type_3_4= 'Property' ) ) ) ( (lv_a_4_0= RULE_INT ) ) ( (lv_b_5_0= RULE_INT ) ) ( (lv_text_6_0= ruleUnquotedString ) ) ) )
            // ../eu.scasefp7.eclipse.reqeditor.dsl/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/parser/antlr/internal/InternalRqsDsl.g:239:1: ( ( (lv_num_0_0= RULE_INT ) ) otherlv_1= ':T' ( (lv_id_2_0= RULE_INT ) ) ( ( (lv_type_3_1= 'Actor' | lv_type_3_2= 'Action' | lv_type_3_3= 'Object' | lv_type_3_4= 'Property' ) ) ) ( (lv_a_4_0= RULE_INT ) ) ( (lv_b_5_0= RULE_INT ) ) ( (lv_text_6_0= ruleUnquotedString ) ) )
            {
            // ../eu.scasefp7.eclipse.reqeditor.dsl/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/parser/antlr/internal/InternalRqsDsl.g:239:1: ( ( (lv_num_0_0= RULE_INT ) ) otherlv_1= ':T' ( (lv_id_2_0= RULE_INT ) ) ( ( (lv_type_3_1= 'Actor' | lv_type_3_2= 'Action' | lv_type_3_3= 'Object' | lv_type_3_4= 'Property' ) ) ) ( (lv_a_4_0= RULE_INT ) ) ( (lv_b_5_0= RULE_INT ) ) ( (lv_text_6_0= ruleUnquotedString ) ) )
            // ../eu.scasefp7.eclipse.reqeditor.dsl/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/parser/antlr/internal/InternalRqsDsl.g:239:2: ( (lv_num_0_0= RULE_INT ) ) otherlv_1= ':T' ( (lv_id_2_0= RULE_INT ) ) ( ( (lv_type_3_1= 'Actor' | lv_type_3_2= 'Action' | lv_type_3_3= 'Object' | lv_type_3_4= 'Property' ) ) ) ( (lv_a_4_0= RULE_INT ) ) ( (lv_b_5_0= RULE_INT ) ) ( (lv_text_6_0= ruleUnquotedString ) )
            {
            // ../eu.scasefp7.eclipse.reqeditor.dsl/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/parser/antlr/internal/InternalRqsDsl.g:239:2: ( (lv_num_0_0= RULE_INT ) )
            // ../eu.scasefp7.eclipse.reqeditor.dsl/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/parser/antlr/internal/InternalRqsDsl.g:240:1: (lv_num_0_0= RULE_INT )
            {
            // ../eu.scasefp7.eclipse.reqeditor.dsl/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/parser/antlr/internal/InternalRqsDsl.g:240:1: (lv_num_0_0= RULE_INT )
            // ../eu.scasefp7.eclipse.reqeditor.dsl/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/parser/antlr/internal/InternalRqsDsl.g:241:3: lv_num_0_0= RULE_INT
            {
            lv_num_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTAnnotation472); 

            			newLeafNode(lv_num_0_0, grammarAccess.getTAnnotationAccess().getNumINTTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTAnnotationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"num",
                    		lv_num_0_0, 
                    		"INT");
            	    

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleTAnnotation489); 

                	newLeafNode(otherlv_1, grammarAccess.getTAnnotationAccess().getTKeyword_1());
                
            // ../eu.scasefp7.eclipse.reqeditor.dsl/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/parser/antlr/internal/InternalRqsDsl.g:261:1: ( (lv_id_2_0= RULE_INT ) )
            // ../eu.scasefp7.eclipse.reqeditor.dsl/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/parser/antlr/internal/InternalRqsDsl.g:262:1: (lv_id_2_0= RULE_INT )
            {
            // ../eu.scasefp7.eclipse.reqeditor.dsl/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/parser/antlr/internal/InternalRqsDsl.g:262:1: (lv_id_2_0= RULE_INT )
            // ../eu.scasefp7.eclipse.reqeditor.dsl/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/parser/antlr/internal/InternalRqsDsl.g:263:3: lv_id_2_0= RULE_INT
            {
            lv_id_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTAnnotation506); 

            			newLeafNode(lv_id_2_0, grammarAccess.getTAnnotationAccess().getIdINTTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTAnnotationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"id",
                    		lv_id_2_0, 
                    		"INT");
            	    

            }


            }

            // ../eu.scasefp7.eclipse.reqeditor.dsl/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/parser/antlr/internal/InternalRqsDsl.g:279:2: ( ( (lv_type_3_1= 'Actor' | lv_type_3_2= 'Action' | lv_type_3_3= 'Object' | lv_type_3_4= 'Property' ) ) )
            // ../eu.scasefp7.eclipse.reqeditor.dsl/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/parser/antlr/internal/InternalRqsDsl.g:280:1: ( (lv_type_3_1= 'Actor' | lv_type_3_2= 'Action' | lv_type_3_3= 'Object' | lv_type_3_4= 'Property' ) )
            {
            // ../eu.scasefp7.eclipse.reqeditor.dsl/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/parser/antlr/internal/InternalRqsDsl.g:280:1: ( (lv_type_3_1= 'Actor' | lv_type_3_2= 'Action' | lv_type_3_3= 'Object' | lv_type_3_4= 'Property' ) )
            // ../eu.scasefp7.eclipse.reqeditor.dsl/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/parser/antlr/internal/InternalRqsDsl.g:281:1: (lv_type_3_1= 'Actor' | lv_type_3_2= 'Action' | lv_type_3_3= 'Object' | lv_type_3_4= 'Property' )
            {
            // ../eu.scasefp7.eclipse.reqeditor.dsl/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/parser/antlr/internal/InternalRqsDsl.g:281:1: (lv_type_3_1= 'Actor' | lv_type_3_2= 'Action' | lv_type_3_3= 'Object' | lv_type_3_4= 'Property' )
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
            case 19:
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
                    // ../eu.scasefp7.eclipse.reqeditor.dsl/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/parser/antlr/internal/InternalRqsDsl.g:282:3: lv_type_3_1= 'Actor'
                    {
                    lv_type_3_1=(Token)match(input,16,FOLLOW_16_in_ruleTAnnotation531); 

                            newLeafNode(lv_type_3_1, grammarAccess.getTAnnotationAccess().getTypeActorKeyword_3_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTAnnotationRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_3_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../eu.scasefp7.eclipse.reqeditor.dsl/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/parser/antlr/internal/InternalRqsDsl.g:294:8: lv_type_3_2= 'Action'
                    {
                    lv_type_3_2=(Token)match(input,17,FOLLOW_17_in_ruleTAnnotation560); 

                            newLeafNode(lv_type_3_2, grammarAccess.getTAnnotationAccess().getTypeActionKeyword_3_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTAnnotationRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_3_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../eu.scasefp7.eclipse.reqeditor.dsl/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/parser/antlr/internal/InternalRqsDsl.g:306:8: lv_type_3_3= 'Object'
                    {
                    lv_type_3_3=(Token)match(input,18,FOLLOW_18_in_ruleTAnnotation589); 

                            newLeafNode(lv_type_3_3, grammarAccess.getTAnnotationAccess().getTypeObjectKeyword_3_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTAnnotationRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_3_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../eu.scasefp7.eclipse.reqeditor.dsl/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/parser/antlr/internal/InternalRqsDsl.g:318:8: lv_type_3_4= 'Property'
                    {
                    lv_type_3_4=(Token)match(input,19,FOLLOW_19_in_ruleTAnnotation618); 

                            newLeafNode(lv_type_3_4, grammarAccess.getTAnnotationAccess().getTypePropertyKeyword_3_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTAnnotationRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_3_4, null);
                    	    

                    }
                    break;

            }


            }


            }

            // ../eu.scasefp7.eclipse.reqeditor.dsl/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/parser/antlr/internal/InternalRqsDsl.g:333:2: ( (lv_a_4_0= RULE_INT ) )
            // ../eu.scasefp7.eclipse.reqeditor.dsl/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/parser/antlr/internal/InternalRqsDsl.g:334:1: (lv_a_4_0= RULE_INT )
            {
            // ../eu.scasefp7.eclipse.reqeditor.dsl/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/parser/antlr/internal/InternalRqsDsl.g:334:1: (lv_a_4_0= RULE_INT )
            // ../eu.scasefp7.eclipse.reqeditor.dsl/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/parser/antlr/internal/InternalRqsDsl.g:335:3: lv_a_4_0= RULE_INT
            {
            lv_a_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTAnnotation651); 

            			newLeafNode(lv_a_4_0, grammarAccess.getTAnnotationAccess().getAINTTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTAnnotationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"a",
                    		lv_a_4_0, 
                    		"INT");
            	    

            }


            }

            // ../eu.scasefp7.eclipse.reqeditor.dsl/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/parser/antlr/internal/InternalRqsDsl.g:351:2: ( (lv_b_5_0= RULE_INT ) )
            // ../eu.scasefp7.eclipse.reqeditor.dsl/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/parser/antlr/internal/InternalRqsDsl.g:352:1: (lv_b_5_0= RULE_INT )
            {
            // ../eu.scasefp7.eclipse.reqeditor.dsl/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/parser/antlr/internal/InternalRqsDsl.g:352:1: (lv_b_5_0= RULE_INT )
            // ../eu.scasefp7.eclipse.reqeditor.dsl/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/parser/antlr/internal/InternalRqsDsl.g:353:3: lv_b_5_0= RULE_INT
            {
            lv_b_5_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTAnnotation673); 

            			newLeafNode(lv_b_5_0, grammarAccess.getTAnnotationAccess().getBINTTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTAnnotationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"b",
                    		lv_b_5_0, 
                    		"INT");
            	    

            }


            }

            // ../eu.scasefp7.eclipse.reqeditor.dsl/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/parser/antlr/internal/InternalRqsDsl.g:369:2: ( (lv_text_6_0= ruleUnquotedString ) )
            // ../eu.scasefp7.eclipse.reqeditor.dsl/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/parser/antlr/internal/InternalRqsDsl.g:370:1: (lv_text_6_0= ruleUnquotedString )
            {
            // ../eu.scasefp7.eclipse.reqeditor.dsl/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/parser/antlr/internal/InternalRqsDsl.g:370:1: (lv_text_6_0= ruleUnquotedString )
            // ../eu.scasefp7.eclipse.reqeditor.dsl/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/parser/antlr/internal/InternalRqsDsl.g:371:3: lv_text_6_0= ruleUnquotedString
            {
             
            	        newCompositeNode(grammarAccess.getTAnnotationAccess().getTextUnquotedStringParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleUnquotedString_in_ruleTAnnotation699);
            lv_text_6_0=ruleUnquotedString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTAnnotationRule());
            	        }
                   		add(
                   			current, 
                   			"text",
                    		lv_text_6_0, 
                    		"UnquotedString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTAnnotation"


    // $ANTLR start "entryRuleUnquotedString"
    // ../eu.scasefp7.eclipse.reqeditor.dsl/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/parser/antlr/internal/InternalRqsDsl.g:395:1: entryRuleUnquotedString returns [String current=null] : iv_ruleUnquotedString= ruleUnquotedString EOF ;
    public final String entryRuleUnquotedString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnquotedString = null;


        try {
            // ../eu.scasefp7.eclipse.reqeditor.dsl/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/parser/antlr/internal/InternalRqsDsl.g:396:2: (iv_ruleUnquotedString= ruleUnquotedString EOF )
            // ../eu.scasefp7.eclipse.reqeditor.dsl/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/parser/antlr/internal/InternalRqsDsl.g:397:2: iv_ruleUnquotedString= ruleUnquotedString EOF
            {
             newCompositeNode(grammarAccess.getUnquotedStringRule()); 
            pushFollow(FOLLOW_ruleUnquotedString_in_entryRuleUnquotedString736);
            iv_ruleUnquotedString=ruleUnquotedString();

            state._fsp--;

             current =iv_ruleUnquotedString.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnquotedString747); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnquotedString"


    // $ANTLR start "ruleUnquotedString"
    // ../eu.scasefp7.eclipse.reqeditor.dsl/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/parser/antlr/internal/InternalRqsDsl.g:404:1: ruleUnquotedString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID )+ ;
    public final AntlrDatatypeRuleToken ruleUnquotedString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../eu.scasefp7.eclipse.reqeditor.dsl/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/parser/antlr/internal/InternalRqsDsl.g:407:28: ( (this_ID_0= RULE_ID )+ )
            // ../eu.scasefp7.eclipse.reqeditor.dsl/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/parser/antlr/internal/InternalRqsDsl.g:408:1: (this_ID_0= RULE_ID )+
            {
            // ../eu.scasefp7.eclipse.reqeditor.dsl/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/parser/antlr/internal/InternalRqsDsl.g:408:1: (this_ID_0= RULE_ID )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../eu.scasefp7.eclipse.reqeditor.dsl/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/parser/antlr/internal/InternalRqsDsl.g:408:6: this_ID_0= RULE_ID
            	    {
            	    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUnquotedString787); 

            	    		current.merge(this_ID_0);
            	        
            	     
            	        newLeafNode(this_ID_0, grammarAccess.getUnquotedStringAccess().getIDTerminalRuleCall()); 
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnquotedString"


    // $ANTLR start "entryRuleRAnnotation"
    // ../eu.scasefp7.eclipse.reqeditor.dsl/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/parser/antlr/internal/InternalRqsDsl.g:423:1: entryRuleRAnnotation returns [EObject current=null] : iv_ruleRAnnotation= ruleRAnnotation EOF ;
    public final EObject entryRuleRAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRAnnotation = null;


        try {
            // ../eu.scasefp7.eclipse.reqeditor.dsl/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/parser/antlr/internal/InternalRqsDsl.g:424:2: (iv_ruleRAnnotation= ruleRAnnotation EOF )
            // ../eu.scasefp7.eclipse.reqeditor.dsl/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/parser/antlr/internal/InternalRqsDsl.g:425:2: iv_ruleRAnnotation= ruleRAnnotation EOF
            {
             newCompositeNode(grammarAccess.getRAnnotationRule()); 
            pushFollow(FOLLOW_ruleRAnnotation_in_entryRuleRAnnotation833);
            iv_ruleRAnnotation=ruleRAnnotation();

            state._fsp--;

             current =iv_ruleRAnnotation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRAnnotation843); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRAnnotation"


    // $ANTLR start "ruleRAnnotation"
    // ../eu.scasefp7.eclipse.reqeditor.dsl/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/parser/antlr/internal/InternalRqsDsl.g:432:1: ruleRAnnotation returns [EObject current=null] : ( ( (lv_num_0_0= RULE_INT ) ) otherlv_1= ':R' ( (lv_id_2_0= RULE_INT ) ) ( ( (lv_type_3_1= 'IsActorOf' | lv_type_3_2= 'HasProperty' | lv_type_3_3= 'ActsOn' | lv_type_3_4= 'Property' ) ) ) ( (lv_aa_4_0= RULE_INT ) ) otherlv_5= ':T' ( (lv_ab_6_0= RULE_INT ) ) ( (lv_ba_7_0= RULE_INT ) ) otherlv_8= ':T' ( (lv_bb_9_0= RULE_INT ) ) ) ;
    public final EObject ruleRAnnotation() throws RecognitionException {
        EObject current = null;

        Token lv_num_0_0=null;
        Token otherlv_1=null;
        Token lv_id_2_0=null;
        Token lv_type_3_1=null;
        Token lv_type_3_2=null;
        Token lv_type_3_3=null;
        Token lv_type_3_4=null;
        Token lv_aa_4_0=null;
        Token otherlv_5=null;
        Token lv_ab_6_0=null;
        Token lv_ba_7_0=null;
        Token otherlv_8=null;
        Token lv_bb_9_0=null;

         enterRule(); 
            
        try {
            // ../eu.scasefp7.eclipse.reqeditor.dsl/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/parser/antlr/internal/InternalRqsDsl.g:435:28: ( ( ( (lv_num_0_0= RULE_INT ) ) otherlv_1= ':R' ( (lv_id_2_0= RULE_INT ) ) ( ( (lv_type_3_1= 'IsActorOf' | lv_type_3_2= 'HasProperty' | lv_type_3_3= 'ActsOn' | lv_type_3_4= 'Property' ) ) ) ( (lv_aa_4_0= RULE_INT ) ) otherlv_5= ':T' ( (lv_ab_6_0= RULE_INT ) ) ( (lv_ba_7_0= RULE_INT ) ) otherlv_8= ':T' ( (lv_bb_9_0= RULE_INT ) ) ) )
            // ../eu.scasefp7.eclipse.reqeditor.dsl/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/parser/antlr/internal/InternalRqsDsl.g:436:1: ( ( (lv_num_0_0= RULE_INT ) ) otherlv_1= ':R' ( (lv_id_2_0= RULE_INT ) ) ( ( (lv_type_3_1= 'IsActorOf' | lv_type_3_2= 'HasProperty' | lv_type_3_3= 'ActsOn' | lv_type_3_4= 'Property' ) ) ) ( (lv_aa_4_0= RULE_INT ) ) otherlv_5= ':T' ( (lv_ab_6_0= RULE_INT ) ) ( (lv_ba_7_0= RULE_INT ) ) otherlv_8= ':T' ( (lv_bb_9_0= RULE_INT ) ) )
            {
            // ../eu.scasefp7.eclipse.reqeditor.dsl/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/parser/antlr/internal/InternalRqsDsl.g:436:1: ( ( (lv_num_0_0= RULE_INT ) ) otherlv_1= ':R' ( (lv_id_2_0= RULE_INT ) ) ( ( (lv_type_3_1= 'IsActorOf' | lv_type_3_2= 'HasProperty' | lv_type_3_3= 'ActsOn' | lv_type_3_4= 'Property' ) ) ) ( (lv_aa_4_0= RULE_INT ) ) otherlv_5= ':T' ( (lv_ab_6_0= RULE_INT ) ) ( (lv_ba_7_0= RULE_INT ) ) otherlv_8= ':T' ( (lv_bb_9_0= RULE_INT ) ) )
            // ../eu.scasefp7.eclipse.reqeditor.dsl/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/parser/antlr/internal/InternalRqsDsl.g:436:2: ( (lv_num_0_0= RULE_INT ) ) otherlv_1= ':R' ( (lv_id_2_0= RULE_INT ) ) ( ( (lv_type_3_1= 'IsActorOf' | lv_type_3_2= 'HasProperty' | lv_type_3_3= 'ActsOn' | lv_type_3_4= 'Property' ) ) ) ( (lv_aa_4_0= RULE_INT ) ) otherlv_5= ':T' ( (lv_ab_6_0= RULE_INT ) ) ( (lv_ba_7_0= RULE_INT ) ) otherlv_8= ':T' ( (lv_bb_9_0= RULE_INT ) )
            {
            // ../eu.scasefp7.eclipse.reqeditor.dsl/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/parser/antlr/internal/InternalRqsDsl.g:436:2: ( (lv_num_0_0= RULE_INT ) )
            // ../eu.scasefp7.eclipse.reqeditor.dsl/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/parser/antlr/internal/InternalRqsDsl.g:437:1: (lv_num_0_0= RULE_INT )
            {
            // ../eu.scasefp7.eclipse.reqeditor.dsl/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/parser/antlr/internal/InternalRqsDsl.g:437:1: (lv_num_0_0= RULE_INT )
            // ../eu.scasefp7.eclipse.reqeditor.dsl/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/parser/antlr/internal/InternalRqsDsl.g:438:3: lv_num_0_0= RULE_INT
            {
            lv_num_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleRAnnotation885); 

            			newLeafNode(lv_num_0_0, grammarAccess.getRAnnotationAccess().getNumINTTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRAnnotationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"num",
                    		lv_num_0_0, 
                    		"INT");
            	    

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleRAnnotation902); 

                	newLeafNode(otherlv_1, grammarAccess.getRAnnotationAccess().getRKeyword_1());
                
            // ../eu.scasefp7.eclipse.reqeditor.dsl/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/parser/antlr/internal/InternalRqsDsl.g:458:1: ( (lv_id_2_0= RULE_INT ) )
            // ../eu.scasefp7.eclipse.reqeditor.dsl/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/parser/antlr/internal/InternalRqsDsl.g:459:1: (lv_id_2_0= RULE_INT )
            {
            // ../eu.scasefp7.eclipse.reqeditor.dsl/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/parser/antlr/internal/InternalRqsDsl.g:459:1: (lv_id_2_0= RULE_INT )
            // ../eu.scasefp7.eclipse.reqeditor.dsl/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/parser/antlr/internal/InternalRqsDsl.g:460:3: lv_id_2_0= RULE_INT
            {
            lv_id_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleRAnnotation919); 

            			newLeafNode(lv_id_2_0, grammarAccess.getRAnnotationAccess().getIdINTTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRAnnotationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"id",
                    		lv_id_2_0, 
                    		"INT");
            	    

            }


            }

            // ../eu.scasefp7.eclipse.reqeditor.dsl/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/parser/antlr/internal/InternalRqsDsl.g:476:2: ( ( (lv_type_3_1= 'IsActorOf' | lv_type_3_2= 'HasProperty' | lv_type_3_3= 'ActsOn' | lv_type_3_4= 'Property' ) ) )
            // ../eu.scasefp7.eclipse.reqeditor.dsl/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/parser/antlr/internal/InternalRqsDsl.g:477:1: ( (lv_type_3_1= 'IsActorOf' | lv_type_3_2= 'HasProperty' | lv_type_3_3= 'ActsOn' | lv_type_3_4= 'Property' ) )
            {
            // ../eu.scasefp7.eclipse.reqeditor.dsl/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/parser/antlr/internal/InternalRqsDsl.g:477:1: ( (lv_type_3_1= 'IsActorOf' | lv_type_3_2= 'HasProperty' | lv_type_3_3= 'ActsOn' | lv_type_3_4= 'Property' ) )
            // ../eu.scasefp7.eclipse.reqeditor.dsl/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/parser/antlr/internal/InternalRqsDsl.g:478:1: (lv_type_3_1= 'IsActorOf' | lv_type_3_2= 'HasProperty' | lv_type_3_3= 'ActsOn' | lv_type_3_4= 'Property' )
            {
            // ../eu.scasefp7.eclipse.reqeditor.dsl/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/parser/antlr/internal/InternalRqsDsl.g:478:1: (lv_type_3_1= 'IsActorOf' | lv_type_3_2= 'HasProperty' | lv_type_3_3= 'ActsOn' | lv_type_3_4= 'Property' )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt7=1;
                }
                break;
            case 22:
                {
                alt7=2;
                }
                break;
            case 23:
                {
                alt7=3;
                }
                break;
            case 19:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../eu.scasefp7.eclipse.reqeditor.dsl/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/parser/antlr/internal/InternalRqsDsl.g:479:3: lv_type_3_1= 'IsActorOf'
                    {
                    lv_type_3_1=(Token)match(input,21,FOLLOW_21_in_ruleRAnnotation944); 

                            newLeafNode(lv_type_3_1, grammarAccess.getRAnnotationAccess().getTypeIsActorOfKeyword_3_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRAnnotationRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_3_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../eu.scasefp7.eclipse.reqeditor.dsl/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/parser/antlr/internal/InternalRqsDsl.g:491:8: lv_type_3_2= 'HasProperty'
                    {
                    lv_type_3_2=(Token)match(input,22,FOLLOW_22_in_ruleRAnnotation973); 

                            newLeafNode(lv_type_3_2, grammarAccess.getRAnnotationAccess().getTypeHasPropertyKeyword_3_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRAnnotationRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_3_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../eu.scasefp7.eclipse.reqeditor.dsl/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/parser/antlr/internal/InternalRqsDsl.g:503:8: lv_type_3_3= 'ActsOn'
                    {
                    lv_type_3_3=(Token)match(input,23,FOLLOW_23_in_ruleRAnnotation1002); 

                            newLeafNode(lv_type_3_3, grammarAccess.getRAnnotationAccess().getTypeActsOnKeyword_3_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRAnnotationRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_3_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../eu.scasefp7.eclipse.reqeditor.dsl/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/parser/antlr/internal/InternalRqsDsl.g:515:8: lv_type_3_4= 'Property'
                    {
                    lv_type_3_4=(Token)match(input,19,FOLLOW_19_in_ruleRAnnotation1031); 

                            newLeafNode(lv_type_3_4, grammarAccess.getRAnnotationAccess().getTypePropertyKeyword_3_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRAnnotationRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_3_4, null);
                    	    

                    }
                    break;

            }


            }


            }

            // ../eu.scasefp7.eclipse.reqeditor.dsl/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/parser/antlr/internal/InternalRqsDsl.g:530:2: ( (lv_aa_4_0= RULE_INT ) )
            // ../eu.scasefp7.eclipse.reqeditor.dsl/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/parser/antlr/internal/InternalRqsDsl.g:531:1: (lv_aa_4_0= RULE_INT )
            {
            // ../eu.scasefp7.eclipse.reqeditor.dsl/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/parser/antlr/internal/InternalRqsDsl.g:531:1: (lv_aa_4_0= RULE_INT )
            // ../eu.scasefp7.eclipse.reqeditor.dsl/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/parser/antlr/internal/InternalRqsDsl.g:532:3: lv_aa_4_0= RULE_INT
            {
            lv_aa_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleRAnnotation1064); 

            			newLeafNode(lv_aa_4_0, grammarAccess.getRAnnotationAccess().getAaINTTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRAnnotationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"aa",
                    		lv_aa_4_0, 
                    		"INT");
            	    

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleRAnnotation1081); 

                	newLeafNode(otherlv_5, grammarAccess.getRAnnotationAccess().getTKeyword_5());
                
            // ../eu.scasefp7.eclipse.reqeditor.dsl/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/parser/antlr/internal/InternalRqsDsl.g:552:1: ( (lv_ab_6_0= RULE_INT ) )
            // ../eu.scasefp7.eclipse.reqeditor.dsl/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/parser/antlr/internal/InternalRqsDsl.g:553:1: (lv_ab_6_0= RULE_INT )
            {
            // ../eu.scasefp7.eclipse.reqeditor.dsl/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/parser/antlr/internal/InternalRqsDsl.g:553:1: (lv_ab_6_0= RULE_INT )
            // ../eu.scasefp7.eclipse.reqeditor.dsl/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/parser/antlr/internal/InternalRqsDsl.g:554:3: lv_ab_6_0= RULE_INT
            {
            lv_ab_6_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleRAnnotation1098); 

            			newLeafNode(lv_ab_6_0, grammarAccess.getRAnnotationAccess().getAbINTTerminalRuleCall_6_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRAnnotationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"ab",
                    		lv_ab_6_0, 
                    		"INT");
            	    

            }


            }

            // ../eu.scasefp7.eclipse.reqeditor.dsl/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/parser/antlr/internal/InternalRqsDsl.g:570:2: ( (lv_ba_7_0= RULE_INT ) )
            // ../eu.scasefp7.eclipse.reqeditor.dsl/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/parser/antlr/internal/InternalRqsDsl.g:571:1: (lv_ba_7_0= RULE_INT )
            {
            // ../eu.scasefp7.eclipse.reqeditor.dsl/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/parser/antlr/internal/InternalRqsDsl.g:571:1: (lv_ba_7_0= RULE_INT )
            // ../eu.scasefp7.eclipse.reqeditor.dsl/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/parser/antlr/internal/InternalRqsDsl.g:572:3: lv_ba_7_0= RULE_INT
            {
            lv_ba_7_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleRAnnotation1120); 

            			newLeafNode(lv_ba_7_0, grammarAccess.getRAnnotationAccess().getBaINTTerminalRuleCall_7_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRAnnotationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"ba",
                    		lv_ba_7_0, 
                    		"INT");
            	    

            }


            }

            otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleRAnnotation1137); 

                	newLeafNode(otherlv_8, grammarAccess.getRAnnotationAccess().getTKeyword_8());
                
            // ../eu.scasefp7.eclipse.reqeditor.dsl/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/parser/antlr/internal/InternalRqsDsl.g:592:1: ( (lv_bb_9_0= RULE_INT ) )
            // ../eu.scasefp7.eclipse.reqeditor.dsl/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/parser/antlr/internal/InternalRqsDsl.g:593:1: (lv_bb_9_0= RULE_INT )
            {
            // ../eu.scasefp7.eclipse.reqeditor.dsl/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/parser/antlr/internal/InternalRqsDsl.g:593:1: (lv_bb_9_0= RULE_INT )
            // ../eu.scasefp7.eclipse.reqeditor.dsl/src-gen/eu/scasefp7/eclipse/reqeditor/dsl/parser/antlr/internal/InternalRqsDsl.g:594:3: lv_bb_9_0= RULE_INT
            {
            lv_bb_9_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleRAnnotation1154); 

            			newLeafNode(lv_bb_9_0, grammarAccess.getRAnnotationAccess().getBbINTTerminalRuleCall_9_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRAnnotationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"bb",
                    		lv_bb_9_0, 
                    		"INT");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRAnnotation"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleModel131 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleModel143 = new BitSet(new long[]{0x0000000000005010L});
    public static final BitSet FOLLOW_ruleRequirement_in_ruleModel164 = new BitSet(new long[]{0x0000000000005010L});
    public static final BitSet FOLLOW_12_in_ruleModel177 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleModel189 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleModel201 = new BitSet(new long[]{0x0000000000001020L});
    public static final BitSet FOLLOW_ruleTAnnotation_in_ruleModel224 = new BitSet(new long[]{0x0000000000001020L});
    public static final BitSet FOLLOW_ruleRAnnotation_in_ruleModel243 = new BitSet(new long[]{0x0000000000001020L});
    public static final BitSet FOLLOW_12_in_ruleModel259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequirement_in_entryRuleRequirement295 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRequirement305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRequirement348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleRequirement369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTAnnotation_in_entryRuleTAnnotation420 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTAnnotation430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTAnnotation472 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleTAnnotation489 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTAnnotation506 = new BitSet(new long[]{0x00000000000F0000L});
    public static final BitSet FOLLOW_16_in_ruleTAnnotation531 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_17_in_ruleTAnnotation560 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_18_in_ruleTAnnotation589 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_19_in_ruleTAnnotation618 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTAnnotation651 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTAnnotation673 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleUnquotedString_in_ruleTAnnotation699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnquotedString_in_entryRuleUnquotedString736 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnquotedString747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUnquotedString787 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleRAnnotation_in_entryRuleRAnnotation833 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRAnnotation843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleRAnnotation885 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleRAnnotation902 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleRAnnotation919 = new BitSet(new long[]{0x0000000000E80000L});
    public static final BitSet FOLLOW_21_in_ruleRAnnotation944 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_22_in_ruleRAnnotation973 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_23_in_ruleRAnnotation1002 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_19_in_ruleRAnnotation1031 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleRAnnotation1064 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleRAnnotation1081 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleRAnnotation1098 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleRAnnotation1120 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleRAnnotation1137 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleRAnnotation1154 = new BitSet(new long[]{0x0000000000000002L});

}