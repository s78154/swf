package beleg.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import beleg.services.S78154S78236GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalS78154S78236Parser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_NUMBER1", "RULE_ID", "RULE_VARIABLE", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'?-'", "'.'", "','", "':-'", "'('", "')'", "'[]'", "'['", "']'", "'|'"
    };
    public static final int RULE_STRING=8;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=11;
    public static final int RULE_VARIABLE=6;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_NUMBER1=4;
    public static final int RULE_INT=7;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalS78154S78236Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalS78154S78236Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalS78154S78236Parser.tokenNames; }
    public String getGrammarFileName() { return "InternalS78154S78236.g"; }



     	private S78154S78236GrammarAccess grammarAccess;

        public InternalS78154S78236Parser(TokenStream input, S78154S78236GrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected S78154S78236GrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalS78154S78236.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalS78154S78236.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalS78154S78236.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalS78154S78236.g:71:1: ruleModel returns [EObject current=null] : ( (lv_dsl_0_0= rulePrologDsl ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_dsl_0_0 = null;



        	enterRule();

        try {
            // InternalS78154S78236.g:77:2: ( ( (lv_dsl_0_0= rulePrologDsl ) ) )
            // InternalS78154S78236.g:78:2: ( (lv_dsl_0_0= rulePrologDsl ) )
            {
            // InternalS78154S78236.g:78:2: ( (lv_dsl_0_0= rulePrologDsl ) )
            // InternalS78154S78236.g:79:3: (lv_dsl_0_0= rulePrologDsl )
            {
            // InternalS78154S78236.g:79:3: (lv_dsl_0_0= rulePrologDsl )
            // InternalS78154S78236.g:80:4: lv_dsl_0_0= rulePrologDsl
            {

            				newCompositeNode(grammarAccess.getModelAccess().getDslPrologDslParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_dsl_0_0=rulePrologDsl();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getModelRule());
            				}
            				add(
            					current,
            					"dsl",
            					lv_dsl_0_0,
            					"beleg.S78154S78236.PrologDsl");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRulePrologDsl"
    // InternalS78154S78236.g:100:1: entryRulePrologDsl returns [EObject current=null] : iv_rulePrologDsl= rulePrologDsl EOF ;
    public final EObject entryRulePrologDsl() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrologDsl = null;


        try {
            // InternalS78154S78236.g:100:50: (iv_rulePrologDsl= rulePrologDsl EOF )
            // InternalS78154S78236.g:101:2: iv_rulePrologDsl= rulePrologDsl EOF
            {
             newCompositeNode(grammarAccess.getPrologDslRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrologDsl=rulePrologDsl();

            state._fsp--;

             current =iv_rulePrologDsl; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePrologDsl"


    // $ANTLR start "rulePrologDsl"
    // InternalS78154S78236.g:107:1: rulePrologDsl returns [EObject current=null] : ( ( (lv_program_0_0= ruleProgram ) ) ( (lv_exQuery_1_0= ruleExquery ) ) ) ;
    public final EObject rulePrologDsl() throws RecognitionException {
        EObject current = null;

        EObject lv_program_0_0 = null;

        EObject lv_exQuery_1_0 = null;



        	enterRule();

        try {
            // InternalS78154S78236.g:113:2: ( ( ( (lv_program_0_0= ruleProgram ) ) ( (lv_exQuery_1_0= ruleExquery ) ) ) )
            // InternalS78154S78236.g:114:2: ( ( (lv_program_0_0= ruleProgram ) ) ( (lv_exQuery_1_0= ruleExquery ) ) )
            {
            // InternalS78154S78236.g:114:2: ( ( (lv_program_0_0= ruleProgram ) ) ( (lv_exQuery_1_0= ruleExquery ) ) )
            // InternalS78154S78236.g:115:3: ( (lv_program_0_0= ruleProgram ) ) ( (lv_exQuery_1_0= ruleExquery ) )
            {
            // InternalS78154S78236.g:115:3: ( (lv_program_0_0= ruleProgram ) )
            // InternalS78154S78236.g:116:4: (lv_program_0_0= ruleProgram )
            {
            // InternalS78154S78236.g:116:4: (lv_program_0_0= ruleProgram )
            // InternalS78154S78236.g:117:5: lv_program_0_0= ruleProgram
            {

            					newCompositeNode(grammarAccess.getPrologDslAccess().getProgramProgramParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_program_0_0=ruleProgram();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPrologDslRule());
            					}
            					set(
            						current,
            						"program",
            						lv_program_0_0,
            						"beleg.S78154S78236.Program");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalS78154S78236.g:134:3: ( (lv_exQuery_1_0= ruleExquery ) )
            // InternalS78154S78236.g:135:4: (lv_exQuery_1_0= ruleExquery )
            {
            // InternalS78154S78236.g:135:4: (lv_exQuery_1_0= ruleExquery )
            // InternalS78154S78236.g:136:5: lv_exQuery_1_0= ruleExquery
            {

            					newCompositeNode(grammarAccess.getPrologDslAccess().getExQueryExqueryParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_exQuery_1_0=ruleExquery();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPrologDslRule());
            					}
            					set(
            						current,
            						"exQuery",
            						lv_exQuery_1_0,
            						"beleg.S78154S78236.Exquery");
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
    // $ANTLR end "rulePrologDsl"


    // $ANTLR start "entryRuleProgram"
    // InternalS78154S78236.g:157:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // InternalS78154S78236.g:157:48: (iv_ruleProgram= ruleProgram EOF )
            // InternalS78154S78236.g:158:2: iv_ruleProgram= ruleProgram EOF
            {
             newCompositeNode(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProgram=ruleProgram();

            state._fsp--;

             current =iv_ruleProgram; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalS78154S78236.g:164:1: ruleProgram returns [EObject current=null] : ( (lv_clauses_0_0= ruleClause ) )+ ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        EObject lv_clauses_0_0 = null;



        	enterRule();

        try {
            // InternalS78154S78236.g:170:2: ( ( (lv_clauses_0_0= ruleClause ) )+ )
            // InternalS78154S78236.g:171:2: ( (lv_clauses_0_0= ruleClause ) )+
            {
            // InternalS78154S78236.g:171:2: ( (lv_clauses_0_0= ruleClause ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalS78154S78236.g:172:3: (lv_clauses_0_0= ruleClause )
            	    {
            	    // InternalS78154S78236.g:172:3: (lv_clauses_0_0= ruleClause )
            	    // InternalS78154S78236.g:173:4: lv_clauses_0_0= ruleClause
            	    {

            	    				newCompositeNode(grammarAccess.getProgramAccess().getClausesClauseParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_4);
            	    lv_clauses_0_0=ruleClause();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getProgramRule());
            	    				}
            	    				add(
            	    					current,
            	    					"clauses",
            	    					lv_clauses_0_0,
            	    					"beleg.S78154S78236.Clause");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
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
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleExquery"
    // InternalS78154S78236.g:193:1: entryRuleExquery returns [EObject current=null] : iv_ruleExquery= ruleExquery EOF ;
    public final EObject entryRuleExquery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExquery = null;


        try {
            // InternalS78154S78236.g:193:48: (iv_ruleExquery= ruleExquery EOF )
            // InternalS78154S78236.g:194:2: iv_ruleExquery= ruleExquery EOF
            {
             newCompositeNode(grammarAccess.getExqueryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExquery=ruleExquery();

            state._fsp--;

             current =iv_ruleExquery; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleExquery"


    // $ANTLR start "ruleExquery"
    // InternalS78154S78236.g:200:1: ruleExquery returns [EObject current=null] : (otherlv_0= '?-' ( (lv_query_1_0= ruleQuery ) ) otherlv_2= '.' ) ;
    public final EObject ruleExquery() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_query_1_0 = null;



        	enterRule();

        try {
            // InternalS78154S78236.g:206:2: ( (otherlv_0= '?-' ( (lv_query_1_0= ruleQuery ) ) otherlv_2= '.' ) )
            // InternalS78154S78236.g:207:2: (otherlv_0= '?-' ( (lv_query_1_0= ruleQuery ) ) otherlv_2= '.' )
            {
            // InternalS78154S78236.g:207:2: (otherlv_0= '?-' ( (lv_query_1_0= ruleQuery ) ) otherlv_2= '.' )
            // InternalS78154S78236.g:208:3: otherlv_0= '?-' ( (lv_query_1_0= ruleQuery ) ) otherlv_2= '.'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getExqueryAccess().getQuestionMarkHyphenMinusKeyword_0());
            		
            // InternalS78154S78236.g:212:3: ( (lv_query_1_0= ruleQuery ) )
            // InternalS78154S78236.g:213:4: (lv_query_1_0= ruleQuery )
            {
            // InternalS78154S78236.g:213:4: (lv_query_1_0= ruleQuery )
            // InternalS78154S78236.g:214:5: lv_query_1_0= ruleQuery
            {

            					newCompositeNode(grammarAccess.getExqueryAccess().getQueryQueryParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_6);
            lv_query_1_0=ruleQuery();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExqueryRule());
            					}
            					set(
            						current,
            						"query",
            						lv_query_1_0,
            						"beleg.S78154S78236.Query");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getExqueryAccess().getFullStopKeyword_2());
            		

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
    // $ANTLR end "ruleExquery"


    // $ANTLR start "entryRuleQuery"
    // InternalS78154S78236.g:239:1: entryRuleQuery returns [EObject current=null] : iv_ruleQuery= ruleQuery EOF ;
    public final EObject entryRuleQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuery = null;


        try {
            // InternalS78154S78236.g:239:46: (iv_ruleQuery= ruleQuery EOF )
            // InternalS78154S78236.g:240:2: iv_ruleQuery= ruleQuery EOF
            {
             newCompositeNode(grammarAccess.getQueryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQuery=ruleQuery();

            state._fsp--;

             current =iv_ruleQuery; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleQuery"


    // $ANTLR start "ruleQuery"
    // InternalS78154S78236.g:246:1: ruleQuery returns [EObject current=null] : ( ( (lv_predicate_0_0= rulePredicate ) ) ( (lv_epredicates_1_0= ruleEPredicate ) )* ) ;
    public final EObject ruleQuery() throws RecognitionException {
        EObject current = null;

        EObject lv_predicate_0_0 = null;

        EObject lv_epredicates_1_0 = null;



        	enterRule();

        try {
            // InternalS78154S78236.g:252:2: ( ( ( (lv_predicate_0_0= rulePredicate ) ) ( (lv_epredicates_1_0= ruleEPredicate ) )* ) )
            // InternalS78154S78236.g:253:2: ( ( (lv_predicate_0_0= rulePredicate ) ) ( (lv_epredicates_1_0= ruleEPredicate ) )* )
            {
            // InternalS78154S78236.g:253:2: ( ( (lv_predicate_0_0= rulePredicate ) ) ( (lv_epredicates_1_0= ruleEPredicate ) )* )
            // InternalS78154S78236.g:254:3: ( (lv_predicate_0_0= rulePredicate ) ) ( (lv_epredicates_1_0= ruleEPredicate ) )*
            {
            // InternalS78154S78236.g:254:3: ( (lv_predicate_0_0= rulePredicate ) )
            // InternalS78154S78236.g:255:4: (lv_predicate_0_0= rulePredicate )
            {
            // InternalS78154S78236.g:255:4: (lv_predicate_0_0= rulePredicate )
            // InternalS78154S78236.g:256:5: lv_predicate_0_0= rulePredicate
            {

            					newCompositeNode(grammarAccess.getQueryAccess().getPredicatePredicateParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_7);
            lv_predicate_0_0=rulePredicate();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getQueryRule());
            					}
            					set(
            						current,
            						"predicate",
            						lv_predicate_0_0,
            						"beleg.S78154S78236.Predicate");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalS78154S78236.g:273:3: ( (lv_epredicates_1_0= ruleEPredicate ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalS78154S78236.g:274:4: (lv_epredicates_1_0= ruleEPredicate )
            	    {
            	    // InternalS78154S78236.g:274:4: (lv_epredicates_1_0= ruleEPredicate )
            	    // InternalS78154S78236.g:275:5: lv_epredicates_1_0= ruleEPredicate
            	    {

            	    					newCompositeNode(grammarAccess.getQueryAccess().getEpredicatesEPredicateParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_epredicates_1_0=ruleEPredicate();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getQueryRule());
            	    					}
            	    					add(
            	    						current,
            	    						"epredicates",
            	    						lv_epredicates_1_0,
            	    						"beleg.S78154S78236.EPredicate");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


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
    // $ANTLR end "ruleQuery"


    // $ANTLR start "entryRuleEPredicate"
    // InternalS78154S78236.g:296:1: entryRuleEPredicate returns [EObject current=null] : iv_ruleEPredicate= ruleEPredicate EOF ;
    public final EObject entryRuleEPredicate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEPredicate = null;


        try {
            // InternalS78154S78236.g:296:51: (iv_ruleEPredicate= ruleEPredicate EOF )
            // InternalS78154S78236.g:297:2: iv_ruleEPredicate= ruleEPredicate EOF
            {
             newCompositeNode(grammarAccess.getEPredicateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEPredicate=ruleEPredicate();

            state._fsp--;

             current =iv_ruleEPredicate; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEPredicate"


    // $ANTLR start "ruleEPredicate"
    // InternalS78154S78236.g:303:1: ruleEPredicate returns [EObject current=null] : (otherlv_0= ',' ( (lv_predicate_1_0= rulePredicate ) ) ) ;
    public final EObject ruleEPredicate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_predicate_1_0 = null;



        	enterRule();

        try {
            // InternalS78154S78236.g:309:2: ( (otherlv_0= ',' ( (lv_predicate_1_0= rulePredicate ) ) ) )
            // InternalS78154S78236.g:310:2: (otherlv_0= ',' ( (lv_predicate_1_0= rulePredicate ) ) )
            {
            // InternalS78154S78236.g:310:2: (otherlv_0= ',' ( (lv_predicate_1_0= rulePredicate ) ) )
            // InternalS78154S78236.g:311:3: otherlv_0= ',' ( (lv_predicate_1_0= rulePredicate ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getEPredicateAccess().getCommaKeyword_0());
            		
            // InternalS78154S78236.g:315:3: ( (lv_predicate_1_0= rulePredicate ) )
            // InternalS78154S78236.g:316:4: (lv_predicate_1_0= rulePredicate )
            {
            // InternalS78154S78236.g:316:4: (lv_predicate_1_0= rulePredicate )
            // InternalS78154S78236.g:317:5: lv_predicate_1_0= rulePredicate
            {

            					newCompositeNode(grammarAccess.getEPredicateAccess().getPredicatePredicateParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_predicate_1_0=rulePredicate();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEPredicateRule());
            					}
            					set(
            						current,
            						"predicate",
            						lv_predicate_1_0,
            						"beleg.S78154S78236.Predicate");
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
    // $ANTLR end "ruleEPredicate"


    // $ANTLR start "entryRuleClause"
    // InternalS78154S78236.g:338:1: entryRuleClause returns [EObject current=null] : iv_ruleClause= ruleClause EOF ;
    public final EObject entryRuleClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClause = null;


        try {
            // InternalS78154S78236.g:338:47: (iv_ruleClause= ruleClause EOF )
            // InternalS78154S78236.g:339:2: iv_ruleClause= ruleClause EOF
            {
             newCompositeNode(grammarAccess.getClauseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClause=ruleClause();

            state._fsp--;

             current =iv_ruleClause; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleClause"


    // $ANTLR start "ruleClause"
    // InternalS78154S78236.g:345:1: ruleClause returns [EObject current=null] : ( ( (lv_predicate_0_0= rulePredicate ) ) ( ( (lv_fact_1_0= ruleFact ) ) | ( (lv_rule_2_0= ruleRule ) ) ) ) ;
    public final EObject ruleClause() throws RecognitionException {
        EObject current = null;

        EObject lv_predicate_0_0 = null;

        AntlrDatatypeRuleToken lv_fact_1_0 = null;

        EObject lv_rule_2_0 = null;



        	enterRule();

        try {
            // InternalS78154S78236.g:351:2: ( ( ( (lv_predicate_0_0= rulePredicate ) ) ( ( (lv_fact_1_0= ruleFact ) ) | ( (lv_rule_2_0= ruleRule ) ) ) ) )
            // InternalS78154S78236.g:352:2: ( ( (lv_predicate_0_0= rulePredicate ) ) ( ( (lv_fact_1_0= ruleFact ) ) | ( (lv_rule_2_0= ruleRule ) ) ) )
            {
            // InternalS78154S78236.g:352:2: ( ( (lv_predicate_0_0= rulePredicate ) ) ( ( (lv_fact_1_0= ruleFact ) ) | ( (lv_rule_2_0= ruleRule ) ) ) )
            // InternalS78154S78236.g:353:3: ( (lv_predicate_0_0= rulePredicate ) ) ( ( (lv_fact_1_0= ruleFact ) ) | ( (lv_rule_2_0= ruleRule ) ) )
            {
            // InternalS78154S78236.g:353:3: ( (lv_predicate_0_0= rulePredicate ) )
            // InternalS78154S78236.g:354:4: (lv_predicate_0_0= rulePredicate )
            {
            // InternalS78154S78236.g:354:4: (lv_predicate_0_0= rulePredicate )
            // InternalS78154S78236.g:355:5: lv_predicate_0_0= rulePredicate
            {

            					newCompositeNode(grammarAccess.getClauseAccess().getPredicatePredicateParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_9);
            lv_predicate_0_0=rulePredicate();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClauseRule());
            					}
            					set(
            						current,
            						"predicate",
            						lv_predicate_0_0,
            						"beleg.S78154S78236.Predicate");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalS78154S78236.g:372:3: ( ( (lv_fact_1_0= ruleFact ) ) | ( (lv_rule_2_0= ruleRule ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            else if ( (LA3_0==16) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalS78154S78236.g:373:4: ( (lv_fact_1_0= ruleFact ) )
                    {
                    // InternalS78154S78236.g:373:4: ( (lv_fact_1_0= ruleFact ) )
                    // InternalS78154S78236.g:374:5: (lv_fact_1_0= ruleFact )
                    {
                    // InternalS78154S78236.g:374:5: (lv_fact_1_0= ruleFact )
                    // InternalS78154S78236.g:375:6: lv_fact_1_0= ruleFact
                    {

                    						newCompositeNode(grammarAccess.getClauseAccess().getFactFactParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_fact_1_0=ruleFact();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getClauseRule());
                    						}
                    						set(
                    							current,
                    							"fact",
                    							lv_fact_1_0,
                    							"beleg.S78154S78236.Fact");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalS78154S78236.g:393:4: ( (lv_rule_2_0= ruleRule ) )
                    {
                    // InternalS78154S78236.g:393:4: ( (lv_rule_2_0= ruleRule ) )
                    // InternalS78154S78236.g:394:5: (lv_rule_2_0= ruleRule )
                    {
                    // InternalS78154S78236.g:394:5: (lv_rule_2_0= ruleRule )
                    // InternalS78154S78236.g:395:6: lv_rule_2_0= ruleRule
                    {

                    						newCompositeNode(grammarAccess.getClauseAccess().getRuleRuleParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_rule_2_0=ruleRule();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getClauseRule());
                    						}
                    						set(
                    							current,
                    							"rule",
                    							lv_rule_2_0,
                    							"beleg.S78154S78236.Rule");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleClause"


    // $ANTLR start "entryRuleFact"
    // InternalS78154S78236.g:417:1: entryRuleFact returns [String current=null] : iv_ruleFact= ruleFact EOF ;
    public final String entryRuleFact() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFact = null;


        try {
            // InternalS78154S78236.g:417:44: (iv_ruleFact= ruleFact EOF )
            // InternalS78154S78236.g:418:2: iv_ruleFact= ruleFact EOF
            {
             newCompositeNode(grammarAccess.getFactRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFact=ruleFact();

            state._fsp--;

             current =iv_ruleFact.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFact"


    // $ANTLR start "ruleFact"
    // InternalS78154S78236.g:424:1: ruleFact returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '.' ;
    public final AntlrDatatypeRuleToken ruleFact() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalS78154S78236.g:430:2: (kw= '.' )
            // InternalS78154S78236.g:431:2: kw= '.'
            {
            kw=(Token)match(input,14,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getFactAccess().getFullStopKeyword());
            	

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
    // $ANTLR end "ruleFact"


    // $ANTLR start "entryRuleRule"
    // InternalS78154S78236.g:439:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalS78154S78236.g:439:45: (iv_ruleRule= ruleRule EOF )
            // InternalS78154S78236.g:440:2: iv_ruleRule= ruleRule EOF
            {
             newCompositeNode(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRule=ruleRule();

            state._fsp--;

             current =iv_ruleRule; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalS78154S78236.g:446:1: ruleRule returns [EObject current=null] : (otherlv_0= ':-' otherlv_1= '(' ( (lv_term_2_0= ruleTerm ) ) ( (lv_eterms_3_0= ruleETerm ) )* otherlv_4= ')' ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_term_2_0 = null;

        EObject lv_eterms_3_0 = null;



        	enterRule();

        try {
            // InternalS78154S78236.g:452:2: ( (otherlv_0= ':-' otherlv_1= '(' ( (lv_term_2_0= ruleTerm ) ) ( (lv_eterms_3_0= ruleETerm ) )* otherlv_4= ')' ) )
            // InternalS78154S78236.g:453:2: (otherlv_0= ':-' otherlv_1= '(' ( (lv_term_2_0= ruleTerm ) ) ( (lv_eterms_3_0= ruleETerm ) )* otherlv_4= ')' )
            {
            // InternalS78154S78236.g:453:2: (otherlv_0= ':-' otherlv_1= '(' ( (lv_term_2_0= ruleTerm ) ) ( (lv_eterms_3_0= ruleETerm ) )* otherlv_4= ')' )
            // InternalS78154S78236.g:454:3: otherlv_0= ':-' otherlv_1= '(' ( (lv_term_2_0= ruleTerm ) ) ( (lv_eterms_3_0= ruleETerm ) )* otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getRuleAccess().getColonHyphenMinusKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getRuleAccess().getLeftParenthesisKeyword_1());
            		
            // InternalS78154S78236.g:462:3: ( (lv_term_2_0= ruleTerm ) )
            // InternalS78154S78236.g:463:4: (lv_term_2_0= ruleTerm )
            {
            // InternalS78154S78236.g:463:4: (lv_term_2_0= ruleTerm )
            // InternalS78154S78236.g:464:5: lv_term_2_0= ruleTerm
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getTermTermParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_12);
            lv_term_2_0=ruleTerm();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleRule());
            					}
            					set(
            						current,
            						"term",
            						lv_term_2_0,
            						"beleg.S78154S78236.Term");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalS78154S78236.g:481:3: ( (lv_eterms_3_0= ruleETerm ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalS78154S78236.g:482:4: (lv_eterms_3_0= ruleETerm )
            	    {
            	    // InternalS78154S78236.g:482:4: (lv_eterms_3_0= ruleETerm )
            	    // InternalS78154S78236.g:483:5: lv_eterms_3_0= ruleETerm
            	    {

            	    					newCompositeNode(grammarAccess.getRuleAccess().getEtermsETermParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_eterms_3_0=ruleETerm();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRuleRule());
            	    					}
            	    					add(
            	    						current,
            	    						"eterms",
            	    						lv_eterms_3_0,
            	    						"beleg.S78154S78236.ETerm");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_4=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getRuleAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRulePredicate"
    // InternalS78154S78236.g:508:1: entryRulePredicate returns [EObject current=null] : iv_rulePredicate= rulePredicate EOF ;
    public final EObject entryRulePredicate() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicate = null;


        try {
            // InternalS78154S78236.g:508:50: (iv_rulePredicate= rulePredicate EOF )
            // InternalS78154S78236.g:509:2: iv_rulePredicate= rulePredicate EOF
            {
             newCompositeNode(grammarAccess.getPredicateRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePredicate=rulePredicate();

            state._fsp--;

             current =iv_rulePredicate; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePredicate"


    // $ANTLR start "rulePredicate"
    // InternalS78154S78236.g:515:1: rulePredicate returns [EObject current=null] : ( ( (lv_functor_0_0= ruleFunctor ) ) otherlv_1= '(' ( (lv_term_2_0= ruleTerm ) ) ( (lv_eterms_3_0= ruleETerm ) )* otherlv_4= ')' ) ;
    public final EObject rulePredicate() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_functor_0_0 = null;

        EObject lv_term_2_0 = null;

        EObject lv_eterms_3_0 = null;



        	enterRule();

        try {
            // InternalS78154S78236.g:521:2: ( ( ( (lv_functor_0_0= ruleFunctor ) ) otherlv_1= '(' ( (lv_term_2_0= ruleTerm ) ) ( (lv_eterms_3_0= ruleETerm ) )* otherlv_4= ')' ) )
            // InternalS78154S78236.g:522:2: ( ( (lv_functor_0_0= ruleFunctor ) ) otherlv_1= '(' ( (lv_term_2_0= ruleTerm ) ) ( (lv_eterms_3_0= ruleETerm ) )* otherlv_4= ')' )
            {
            // InternalS78154S78236.g:522:2: ( ( (lv_functor_0_0= ruleFunctor ) ) otherlv_1= '(' ( (lv_term_2_0= ruleTerm ) ) ( (lv_eterms_3_0= ruleETerm ) )* otherlv_4= ')' )
            // InternalS78154S78236.g:523:3: ( (lv_functor_0_0= ruleFunctor ) ) otherlv_1= '(' ( (lv_term_2_0= ruleTerm ) ) ( (lv_eterms_3_0= ruleETerm ) )* otherlv_4= ')'
            {
            // InternalS78154S78236.g:523:3: ( (lv_functor_0_0= ruleFunctor ) )
            // InternalS78154S78236.g:524:4: (lv_functor_0_0= ruleFunctor )
            {
            // InternalS78154S78236.g:524:4: (lv_functor_0_0= ruleFunctor )
            // InternalS78154S78236.g:525:5: lv_functor_0_0= ruleFunctor
            {

            					newCompositeNode(grammarAccess.getPredicateAccess().getFunctorFunctorParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_10);
            lv_functor_0_0=ruleFunctor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPredicateRule());
            					}
            					set(
            						current,
            						"functor",
            						lv_functor_0_0,
            						"beleg.S78154S78236.Functor");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getPredicateAccess().getLeftParenthesisKeyword_1());
            		
            // InternalS78154S78236.g:546:3: ( (lv_term_2_0= ruleTerm ) )
            // InternalS78154S78236.g:547:4: (lv_term_2_0= ruleTerm )
            {
            // InternalS78154S78236.g:547:4: (lv_term_2_0= ruleTerm )
            // InternalS78154S78236.g:548:5: lv_term_2_0= ruleTerm
            {

            					newCompositeNode(grammarAccess.getPredicateAccess().getTermTermParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_12);
            lv_term_2_0=ruleTerm();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPredicateRule());
            					}
            					set(
            						current,
            						"term",
            						lv_term_2_0,
            						"beleg.S78154S78236.Term");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalS78154S78236.g:565:3: ( (lv_eterms_3_0= ruleETerm ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==15) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalS78154S78236.g:566:4: (lv_eterms_3_0= ruleETerm )
            	    {
            	    // InternalS78154S78236.g:566:4: (lv_eterms_3_0= ruleETerm )
            	    // InternalS78154S78236.g:567:5: lv_eterms_3_0= ruleETerm
            	    {

            	    					newCompositeNode(grammarAccess.getPredicateAccess().getEtermsETermParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_eterms_3_0=ruleETerm();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPredicateRule());
            	    					}
            	    					add(
            	    						current,
            	    						"eterms",
            	    						lv_eterms_3_0,
            	    						"beleg.S78154S78236.ETerm");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_4=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getPredicateAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "rulePredicate"


    // $ANTLR start "entryRuleFunctor"
    // InternalS78154S78236.g:592:1: entryRuleFunctor returns [EObject current=null] : iv_ruleFunctor= ruleFunctor EOF ;
    public final EObject entryRuleFunctor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctor = null;


        try {
            // InternalS78154S78236.g:592:48: (iv_ruleFunctor= ruleFunctor EOF )
            // InternalS78154S78236.g:593:2: iv_ruleFunctor= ruleFunctor EOF
            {
             newCompositeNode(grammarAccess.getFunctorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunctor=ruleFunctor();

            state._fsp--;

             current =iv_ruleFunctor; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFunctor"


    // $ANTLR start "ruleFunctor"
    // InternalS78154S78236.g:599:1: ruleFunctor returns [EObject current=null] : ( (lv_ident_0_0= ruleIdent ) ) ;
    public final EObject ruleFunctor() throws RecognitionException {
        EObject current = null;

        EObject lv_ident_0_0 = null;



        	enterRule();

        try {
            // InternalS78154S78236.g:605:2: ( ( (lv_ident_0_0= ruleIdent ) ) )
            // InternalS78154S78236.g:606:2: ( (lv_ident_0_0= ruleIdent ) )
            {
            // InternalS78154S78236.g:606:2: ( (lv_ident_0_0= ruleIdent ) )
            // InternalS78154S78236.g:607:3: (lv_ident_0_0= ruleIdent )
            {
            // InternalS78154S78236.g:607:3: (lv_ident_0_0= ruleIdent )
            // InternalS78154S78236.g:608:4: lv_ident_0_0= ruleIdent
            {

            				newCompositeNode(grammarAccess.getFunctorAccess().getIdentIdentParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_ident_0_0=ruleIdent();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getFunctorRule());
            				}
            				set(
            					current,
            					"ident",
            					lv_ident_0_0,
            					"beleg.S78154S78236.Ident");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleFunctor"


    // $ANTLR start "entryRuleTerm"
    // InternalS78154S78236.g:628:1: entryRuleTerm returns [EObject current=null] : iv_ruleTerm= ruleTerm EOF ;
    public final EObject entryRuleTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerm = null;


        try {
            // InternalS78154S78236.g:628:45: (iv_ruleTerm= ruleTerm EOF )
            // InternalS78154S78236.g:629:2: iv_ruleTerm= ruleTerm EOF
            {
             newCompositeNode(grammarAccess.getTermRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTerm=ruleTerm();

            state._fsp--;

             current =iv_ruleTerm; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTerm"


    // $ANTLR start "ruleTerm"
    // InternalS78154S78236.g:635:1: ruleTerm returns [EObject current=null] : ( ( (lv_atom_0_0= ruleAtom ) ) | ( (lv_list_1_0= ruleList ) ) ) ;
    public final EObject ruleTerm() throws RecognitionException {
        EObject current = null;

        EObject lv_atom_0_0 = null;

        EObject lv_list_1_0 = null;



        	enterRule();

        try {
            // InternalS78154S78236.g:641:2: ( ( ( (lv_atom_0_0= ruleAtom ) ) | ( (lv_list_1_0= ruleList ) ) ) )
            // InternalS78154S78236.g:642:2: ( ( (lv_atom_0_0= ruleAtom ) ) | ( (lv_list_1_0= ruleList ) ) )
            {
            // InternalS78154S78236.g:642:2: ( ( (lv_atom_0_0= ruleAtom ) ) | ( (lv_list_1_0= ruleList ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=RULE_NUMBER1 && LA6_0<=RULE_VARIABLE)) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=19 && LA6_0<=20)) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalS78154S78236.g:643:3: ( (lv_atom_0_0= ruleAtom ) )
                    {
                    // InternalS78154S78236.g:643:3: ( (lv_atom_0_0= ruleAtom ) )
                    // InternalS78154S78236.g:644:4: (lv_atom_0_0= ruleAtom )
                    {
                    // InternalS78154S78236.g:644:4: (lv_atom_0_0= ruleAtom )
                    // InternalS78154S78236.g:645:5: lv_atom_0_0= ruleAtom
                    {

                    					newCompositeNode(grammarAccess.getTermAccess().getAtomAtomParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_atom_0_0=ruleAtom();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTermRule());
                    					}
                    					set(
                    						current,
                    						"atom",
                    						lv_atom_0_0,
                    						"beleg.S78154S78236.Atom");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalS78154S78236.g:663:3: ( (lv_list_1_0= ruleList ) )
                    {
                    // InternalS78154S78236.g:663:3: ( (lv_list_1_0= ruleList ) )
                    // InternalS78154S78236.g:664:4: (lv_list_1_0= ruleList )
                    {
                    // InternalS78154S78236.g:664:4: (lv_list_1_0= ruleList )
                    // InternalS78154S78236.g:665:5: lv_list_1_0= ruleList
                    {

                    					newCompositeNode(grammarAccess.getTermAccess().getListListParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_list_1_0=ruleList();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTermRule());
                    					}
                    					set(
                    						current,
                    						"list",
                    						lv_list_1_0,
                    						"beleg.S78154S78236.List");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleTerm"


    // $ANTLR start "entryRuleETerm"
    // InternalS78154S78236.g:686:1: entryRuleETerm returns [EObject current=null] : iv_ruleETerm= ruleETerm EOF ;
    public final EObject entryRuleETerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETerm = null;


        try {
            // InternalS78154S78236.g:686:46: (iv_ruleETerm= ruleETerm EOF )
            // InternalS78154S78236.g:687:2: iv_ruleETerm= ruleETerm EOF
            {
             newCompositeNode(grammarAccess.getETermRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleETerm=ruleETerm();

            state._fsp--;

             current =iv_ruleETerm; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleETerm"


    // $ANTLR start "ruleETerm"
    // InternalS78154S78236.g:693:1: ruleETerm returns [EObject current=null] : (otherlv_0= ',' ( (lv_term_1_0= ruleTerm ) ) ) ;
    public final EObject ruleETerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_term_1_0 = null;



        	enterRule();

        try {
            // InternalS78154S78236.g:699:2: ( (otherlv_0= ',' ( (lv_term_1_0= ruleTerm ) ) ) )
            // InternalS78154S78236.g:700:2: (otherlv_0= ',' ( (lv_term_1_0= ruleTerm ) ) )
            {
            // InternalS78154S78236.g:700:2: (otherlv_0= ',' ( (lv_term_1_0= ruleTerm ) ) )
            // InternalS78154S78236.g:701:3: otherlv_0= ',' ( (lv_term_1_0= ruleTerm ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getETermAccess().getCommaKeyword_0());
            		
            // InternalS78154S78236.g:705:3: ( (lv_term_1_0= ruleTerm ) )
            // InternalS78154S78236.g:706:4: (lv_term_1_0= ruleTerm )
            {
            // InternalS78154S78236.g:706:4: (lv_term_1_0= ruleTerm )
            // InternalS78154S78236.g:707:5: lv_term_1_0= ruleTerm
            {

            					newCompositeNode(grammarAccess.getETermAccess().getTermTermParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_term_1_0=ruleTerm();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getETermRule());
            					}
            					set(
            						current,
            						"term",
            						lv_term_1_0,
            						"beleg.S78154S78236.Term");
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
    // $ANTLR end "ruleETerm"


    // $ANTLR start "entryRuleAtom"
    // InternalS78154S78236.g:728:1: entryRuleAtom returns [EObject current=null] : iv_ruleAtom= ruleAtom EOF ;
    public final EObject entryRuleAtom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtom = null;


        try {
            // InternalS78154S78236.g:728:45: (iv_ruleAtom= ruleAtom EOF )
            // InternalS78154S78236.g:729:2: iv_ruleAtom= ruleAtom EOF
            {
             newCompositeNode(grammarAccess.getAtomRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAtom=ruleAtom();

            state._fsp--;

             current =iv_ruleAtom; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAtom"


    // $ANTLR start "ruleAtom"
    // InternalS78154S78236.g:735:1: ruleAtom returns [EObject current=null] : ( ( (lv_ident_0_0= ruleIdent ) ) | ( (lv_number_1_0= RULE_NUMBER1 ) ) | ( (lv_evar_2_0= ruleEVar ) ) ) ;
    public final EObject ruleAtom() throws RecognitionException {
        EObject current = null;

        Token lv_number_1_0=null;
        EObject lv_ident_0_0 = null;

        EObject lv_evar_2_0 = null;



        	enterRule();

        try {
            // InternalS78154S78236.g:741:2: ( ( ( (lv_ident_0_0= ruleIdent ) ) | ( (lv_number_1_0= RULE_NUMBER1 ) ) | ( (lv_evar_2_0= ruleEVar ) ) ) )
            // InternalS78154S78236.g:742:2: ( ( (lv_ident_0_0= ruleIdent ) ) | ( (lv_number_1_0= RULE_NUMBER1 ) ) | ( (lv_evar_2_0= ruleEVar ) ) )
            {
            // InternalS78154S78236.g:742:2: ( ( (lv_ident_0_0= ruleIdent ) ) | ( (lv_number_1_0= RULE_NUMBER1 ) ) | ( (lv_evar_2_0= ruleEVar ) ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt7=1;
                }
                break;
            case RULE_NUMBER1:
                {
                alt7=2;
                }
                break;
            case RULE_VARIABLE:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalS78154S78236.g:743:3: ( (lv_ident_0_0= ruleIdent ) )
                    {
                    // InternalS78154S78236.g:743:3: ( (lv_ident_0_0= ruleIdent ) )
                    // InternalS78154S78236.g:744:4: (lv_ident_0_0= ruleIdent )
                    {
                    // InternalS78154S78236.g:744:4: (lv_ident_0_0= ruleIdent )
                    // InternalS78154S78236.g:745:5: lv_ident_0_0= ruleIdent
                    {

                    					newCompositeNode(grammarAccess.getAtomAccess().getIdentIdentParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_ident_0_0=ruleIdent();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAtomRule());
                    					}
                    					set(
                    						current,
                    						"ident",
                    						lv_ident_0_0,
                    						"beleg.S78154S78236.Ident");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalS78154S78236.g:763:3: ( (lv_number_1_0= RULE_NUMBER1 ) )
                    {
                    // InternalS78154S78236.g:763:3: ( (lv_number_1_0= RULE_NUMBER1 ) )
                    // InternalS78154S78236.g:764:4: (lv_number_1_0= RULE_NUMBER1 )
                    {
                    // InternalS78154S78236.g:764:4: (lv_number_1_0= RULE_NUMBER1 )
                    // InternalS78154S78236.g:765:5: lv_number_1_0= RULE_NUMBER1
                    {
                    lv_number_1_0=(Token)match(input,RULE_NUMBER1,FOLLOW_2); 

                    					newLeafNode(lv_number_1_0, grammarAccess.getAtomAccess().getNumberNUMBER1TerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAtomRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"number",
                    						lv_number_1_0,
                    						"beleg.S78154S78236.NUMBER1");
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalS78154S78236.g:782:3: ( (lv_evar_2_0= ruleEVar ) )
                    {
                    // InternalS78154S78236.g:782:3: ( (lv_evar_2_0= ruleEVar ) )
                    // InternalS78154S78236.g:783:4: (lv_evar_2_0= ruleEVar )
                    {
                    // InternalS78154S78236.g:783:4: (lv_evar_2_0= ruleEVar )
                    // InternalS78154S78236.g:784:5: lv_evar_2_0= ruleEVar
                    {

                    					newCompositeNode(grammarAccess.getAtomAccess().getEvarEVarParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_evar_2_0=ruleEVar();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAtomRule());
                    					}
                    					set(
                    						current,
                    						"evar",
                    						lv_evar_2_0,
                    						"beleg.S78154S78236.EVar");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleAtom"


    // $ANTLR start "entryRuleList"
    // InternalS78154S78236.g:805:1: entryRuleList returns [EObject current=null] : iv_ruleList= ruleList EOF ;
    public final EObject entryRuleList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleList = null;


        try {
            // InternalS78154S78236.g:805:45: (iv_ruleList= ruleList EOF )
            // InternalS78154S78236.g:806:2: iv_ruleList= ruleList EOF
            {
             newCompositeNode(grammarAccess.getListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleList=ruleList();

            state._fsp--;

             current =iv_ruleList; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleList"


    // $ANTLR start "ruleList"
    // InternalS78154S78236.g:812:1: ruleList returns [EObject current=null] : ( ( (lv_empty_0_0= ruleEmptyList ) ) | ( (lv_nonEmptyList_1_0= ruleNonEmptyList ) ) ) ;
    public final EObject ruleList() throws RecognitionException {
        EObject current = null;

        EObject lv_empty_0_0 = null;

        EObject lv_nonEmptyList_1_0 = null;



        	enterRule();

        try {
            // InternalS78154S78236.g:818:2: ( ( ( (lv_empty_0_0= ruleEmptyList ) ) | ( (lv_nonEmptyList_1_0= ruleNonEmptyList ) ) ) )
            // InternalS78154S78236.g:819:2: ( ( (lv_empty_0_0= ruleEmptyList ) ) | ( (lv_nonEmptyList_1_0= ruleNonEmptyList ) ) )
            {
            // InternalS78154S78236.g:819:2: ( ( (lv_empty_0_0= ruleEmptyList ) ) | ( (lv_nonEmptyList_1_0= ruleNonEmptyList ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            else if ( (LA8_0==20) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalS78154S78236.g:820:3: ( (lv_empty_0_0= ruleEmptyList ) )
                    {
                    // InternalS78154S78236.g:820:3: ( (lv_empty_0_0= ruleEmptyList ) )
                    // InternalS78154S78236.g:821:4: (lv_empty_0_0= ruleEmptyList )
                    {
                    // InternalS78154S78236.g:821:4: (lv_empty_0_0= ruleEmptyList )
                    // InternalS78154S78236.g:822:5: lv_empty_0_0= ruleEmptyList
                    {

                    					newCompositeNode(grammarAccess.getListAccess().getEmptyEmptyListParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_empty_0_0=ruleEmptyList();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getListRule());
                    					}
                    					set(
                    						current,
                    						"empty",
                    						lv_empty_0_0,
                    						"beleg.S78154S78236.EmptyList");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalS78154S78236.g:840:3: ( (lv_nonEmptyList_1_0= ruleNonEmptyList ) )
                    {
                    // InternalS78154S78236.g:840:3: ( (lv_nonEmptyList_1_0= ruleNonEmptyList ) )
                    // InternalS78154S78236.g:841:4: (lv_nonEmptyList_1_0= ruleNonEmptyList )
                    {
                    // InternalS78154S78236.g:841:4: (lv_nonEmptyList_1_0= ruleNonEmptyList )
                    // InternalS78154S78236.g:842:5: lv_nonEmptyList_1_0= ruleNonEmptyList
                    {

                    					newCompositeNode(grammarAccess.getListAccess().getNonEmptyListNonEmptyListParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_nonEmptyList_1_0=ruleNonEmptyList();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getListRule());
                    					}
                    					set(
                    						current,
                    						"nonEmptyList",
                    						lv_nonEmptyList_1_0,
                    						"beleg.S78154S78236.NonEmptyList");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleList"


    // $ANTLR start "entryRuleEmptyList"
    // InternalS78154S78236.g:863:1: entryRuleEmptyList returns [EObject current=null] : iv_ruleEmptyList= ruleEmptyList EOF ;
    public final EObject entryRuleEmptyList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmptyList = null;


        try {
            // InternalS78154S78236.g:863:50: (iv_ruleEmptyList= ruleEmptyList EOF )
            // InternalS78154S78236.g:864:2: iv_ruleEmptyList= ruleEmptyList EOF
            {
             newCompositeNode(grammarAccess.getEmptyListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEmptyList=ruleEmptyList();

            state._fsp--;

             current =iv_ruleEmptyList; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEmptyList"


    // $ANTLR start "ruleEmptyList"
    // InternalS78154S78236.g:870:1: ruleEmptyList returns [EObject current=null] : ( () otherlv_1= '[]' ) ;
    public final EObject ruleEmptyList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalS78154S78236.g:876:2: ( ( () otherlv_1= '[]' ) )
            // InternalS78154S78236.g:877:2: ( () otherlv_1= '[]' )
            {
            // InternalS78154S78236.g:877:2: ( () otherlv_1= '[]' )
            // InternalS78154S78236.g:878:3: () otherlv_1= '[]'
            {
            // InternalS78154S78236.g:878:3: ()
            // InternalS78154S78236.g:879:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEmptyListAccess().getEmptyListAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getEmptyListAccess().getLeftSquareBracketRightSquareBracketKeyword_1());
            		

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
    // $ANTLR end "ruleEmptyList"


    // $ANTLR start "entryRuleNonEmptyList"
    // InternalS78154S78236.g:893:1: entryRuleNonEmptyList returns [EObject current=null] : iv_ruleNonEmptyList= ruleNonEmptyList EOF ;
    public final EObject entryRuleNonEmptyList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNonEmptyList = null;


        try {
            // InternalS78154S78236.g:893:53: (iv_ruleNonEmptyList= ruleNonEmptyList EOF )
            // InternalS78154S78236.g:894:2: iv_ruleNonEmptyList= ruleNonEmptyList EOF
            {
             newCompositeNode(grammarAccess.getNonEmptyListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNonEmptyList=ruleNonEmptyList();

            state._fsp--;

             current =iv_ruleNonEmptyList; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNonEmptyList"


    // $ANTLR start "ruleNonEmptyList"
    // InternalS78154S78236.g:900:1: ruleNonEmptyList returns [EObject current=null] : ( ( (lv_efolge_0_0= ruleEFolge ) ) | ( (lv_elist_1_0= ruleEList ) ) ) ;
    public final EObject ruleNonEmptyList() throws RecognitionException {
        EObject current = null;

        EObject lv_efolge_0_0 = null;

        EObject lv_elist_1_0 = null;



        	enterRule();

        try {
            // InternalS78154S78236.g:906:2: ( ( ( (lv_efolge_0_0= ruleEFolge ) ) | ( (lv_elist_1_0= ruleEList ) ) ) )
            // InternalS78154S78236.g:907:2: ( ( (lv_efolge_0_0= ruleEFolge ) ) | ( (lv_elist_1_0= ruleEList ) ) )
            {
            // InternalS78154S78236.g:907:2: ( ( (lv_efolge_0_0= ruleEFolge ) ) | ( (lv_elist_1_0= ruleEList ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                switch ( input.LA(2) ) {
                case RULE_ID:
                    {
                    int LA9_2 = input.LA(3);

                    if ( (LA9_2==15||LA9_2==21) ) {
                        alt9=1;
                    }
                    else if ( (LA9_2==22) ) {
                        alt9=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 2, input);

                        throw nvae;
                    }
                    }
                    break;
                case RULE_NUMBER1:
                    {
                    int LA9_3 = input.LA(3);

                    if ( (LA9_3==22) ) {
                        alt9=2;
                    }
                    else if ( (LA9_3==15||LA9_3==21) ) {
                        alt9=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 3, input);

                        throw nvae;
                    }
                    }
                    break;
                case RULE_VARIABLE:
                    {
                    int LA9_4 = input.LA(3);

                    if ( (LA9_4==22) ) {
                        alt9=2;
                    }
                    else if ( (LA9_4==15||LA9_4==21) ) {
                        alt9=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalS78154S78236.g:908:3: ( (lv_efolge_0_0= ruleEFolge ) )
                    {
                    // InternalS78154S78236.g:908:3: ( (lv_efolge_0_0= ruleEFolge ) )
                    // InternalS78154S78236.g:909:4: (lv_efolge_0_0= ruleEFolge )
                    {
                    // InternalS78154S78236.g:909:4: (lv_efolge_0_0= ruleEFolge )
                    // InternalS78154S78236.g:910:5: lv_efolge_0_0= ruleEFolge
                    {

                    					newCompositeNode(grammarAccess.getNonEmptyListAccess().getEfolgeEFolgeParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_efolge_0_0=ruleEFolge();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getNonEmptyListRule());
                    					}
                    					set(
                    						current,
                    						"efolge",
                    						lv_efolge_0_0,
                    						"beleg.S78154S78236.EFolge");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalS78154S78236.g:928:3: ( (lv_elist_1_0= ruleEList ) )
                    {
                    // InternalS78154S78236.g:928:3: ( (lv_elist_1_0= ruleEList ) )
                    // InternalS78154S78236.g:929:4: (lv_elist_1_0= ruleEList )
                    {
                    // InternalS78154S78236.g:929:4: (lv_elist_1_0= ruleEList )
                    // InternalS78154S78236.g:930:5: lv_elist_1_0= ruleEList
                    {

                    					newCompositeNode(grammarAccess.getNonEmptyListAccess().getElistEListParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_elist_1_0=ruleEList();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getNonEmptyListRule());
                    					}
                    					set(
                    						current,
                    						"elist",
                    						lv_elist_1_0,
                    						"beleg.S78154S78236.EList");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleNonEmptyList"


    // $ANTLR start "entryRuleFolge"
    // InternalS78154S78236.g:951:1: entryRuleFolge returns [EObject current=null] : iv_ruleFolge= ruleFolge EOF ;
    public final EObject entryRuleFolge() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFolge = null;


        try {
            // InternalS78154S78236.g:951:46: (iv_ruleFolge= ruleFolge EOF )
            // InternalS78154S78236.g:952:2: iv_ruleFolge= ruleFolge EOF
            {
             newCompositeNode(grammarAccess.getFolgeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFolge=ruleFolge();

            state._fsp--;

             current =iv_ruleFolge; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFolge"


    // $ANTLR start "ruleFolge"
    // InternalS78154S78236.g:958:1: ruleFolge returns [EObject current=null] : ( ( (lv_atom_0_0= ruleAtom ) ) ( (lv_eatoms_1_0= ruleEAtom ) )* ) ;
    public final EObject ruleFolge() throws RecognitionException {
        EObject current = null;

        EObject lv_atom_0_0 = null;

        EObject lv_eatoms_1_0 = null;



        	enterRule();

        try {
            // InternalS78154S78236.g:964:2: ( ( ( (lv_atom_0_0= ruleAtom ) ) ( (lv_eatoms_1_0= ruleEAtom ) )* ) )
            // InternalS78154S78236.g:965:2: ( ( (lv_atom_0_0= ruleAtom ) ) ( (lv_eatoms_1_0= ruleEAtom ) )* )
            {
            // InternalS78154S78236.g:965:2: ( ( (lv_atom_0_0= ruleAtom ) ) ( (lv_eatoms_1_0= ruleEAtom ) )* )
            // InternalS78154S78236.g:966:3: ( (lv_atom_0_0= ruleAtom ) ) ( (lv_eatoms_1_0= ruleEAtom ) )*
            {
            // InternalS78154S78236.g:966:3: ( (lv_atom_0_0= ruleAtom ) )
            // InternalS78154S78236.g:967:4: (lv_atom_0_0= ruleAtom )
            {
            // InternalS78154S78236.g:967:4: (lv_atom_0_0= ruleAtom )
            // InternalS78154S78236.g:968:5: lv_atom_0_0= ruleAtom
            {

            					newCompositeNode(grammarAccess.getFolgeAccess().getAtomAtomParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_7);
            lv_atom_0_0=ruleAtom();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFolgeRule());
            					}
            					set(
            						current,
            						"atom",
            						lv_atom_0_0,
            						"beleg.S78154S78236.Atom");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalS78154S78236.g:985:3: ( (lv_eatoms_1_0= ruleEAtom ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==15) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalS78154S78236.g:986:4: (lv_eatoms_1_0= ruleEAtom )
            	    {
            	    // InternalS78154S78236.g:986:4: (lv_eatoms_1_0= ruleEAtom )
            	    // InternalS78154S78236.g:987:5: lv_eatoms_1_0= ruleEAtom
            	    {

            	    					newCompositeNode(grammarAccess.getFolgeAccess().getEatomsEAtomParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_eatoms_1_0=ruleEAtom();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFolgeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"eatoms",
            	    						lv_eatoms_1_0,
            	    						"beleg.S78154S78236.EAtom");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


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
    // $ANTLR end "ruleFolge"


    // $ANTLR start "entryRuleEFolge"
    // InternalS78154S78236.g:1008:1: entryRuleEFolge returns [EObject current=null] : iv_ruleEFolge= ruleEFolge EOF ;
    public final EObject entryRuleEFolge() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEFolge = null;


        try {
            // InternalS78154S78236.g:1008:47: (iv_ruleEFolge= ruleEFolge EOF )
            // InternalS78154S78236.g:1009:2: iv_ruleEFolge= ruleEFolge EOF
            {
             newCompositeNode(grammarAccess.getEFolgeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEFolge=ruleEFolge();

            state._fsp--;

             current =iv_ruleEFolge; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEFolge"


    // $ANTLR start "ruleEFolge"
    // InternalS78154S78236.g:1015:1: ruleEFolge returns [EObject current=null] : (otherlv_0= '[' ( (lv_folge_1_0= ruleFolge ) ) otherlv_2= ']' ) ;
    public final EObject ruleEFolge() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_folge_1_0 = null;



        	enterRule();

        try {
            // InternalS78154S78236.g:1021:2: ( (otherlv_0= '[' ( (lv_folge_1_0= ruleFolge ) ) otherlv_2= ']' ) )
            // InternalS78154S78236.g:1022:2: (otherlv_0= '[' ( (lv_folge_1_0= ruleFolge ) ) otherlv_2= ']' )
            {
            // InternalS78154S78236.g:1022:2: (otherlv_0= '[' ( (lv_folge_1_0= ruleFolge ) ) otherlv_2= ']' )
            // InternalS78154S78236.g:1023:3: otherlv_0= '[' ( (lv_folge_1_0= ruleFolge ) ) otherlv_2= ']'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getEFolgeAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalS78154S78236.g:1027:3: ( (lv_folge_1_0= ruleFolge ) )
            // InternalS78154S78236.g:1028:4: (lv_folge_1_0= ruleFolge )
            {
            // InternalS78154S78236.g:1028:4: (lv_folge_1_0= ruleFolge )
            // InternalS78154S78236.g:1029:5: lv_folge_1_0= ruleFolge
            {

            					newCompositeNode(grammarAccess.getEFolgeAccess().getFolgeFolgeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_14);
            lv_folge_1_0=ruleFolge();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEFolgeRule());
            					}
            					set(
            						current,
            						"folge",
            						lv_folge_1_0,
            						"beleg.S78154S78236.Folge");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getEFolgeAccess().getRightSquareBracketKeyword_2());
            		

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
    // $ANTLR end "ruleEFolge"


    // $ANTLR start "entryRuleEList"
    // InternalS78154S78236.g:1054:1: entryRuleEList returns [EObject current=null] : iv_ruleEList= ruleEList EOF ;
    public final EObject entryRuleEList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEList = null;


        try {
            // InternalS78154S78236.g:1054:46: (iv_ruleEList= ruleEList EOF )
            // InternalS78154S78236.g:1055:2: iv_ruleEList= ruleEList EOF
            {
             newCompositeNode(grammarAccess.getEListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEList=ruleEList();

            state._fsp--;

             current =iv_ruleEList; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEList"


    // $ANTLR start "ruleEList"
    // InternalS78154S78236.g:1061:1: ruleEList returns [EObject current=null] : (otherlv_0= '[' ( (lv_atom_1_0= ruleAtom ) ) otherlv_2= '|' ( (lv_term_3_0= ruleTerm ) ) otherlv_4= ']' ) ;
    public final EObject ruleEList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_atom_1_0 = null;

        EObject lv_term_3_0 = null;



        	enterRule();

        try {
            // InternalS78154S78236.g:1067:2: ( (otherlv_0= '[' ( (lv_atom_1_0= ruleAtom ) ) otherlv_2= '|' ( (lv_term_3_0= ruleTerm ) ) otherlv_4= ']' ) )
            // InternalS78154S78236.g:1068:2: (otherlv_0= '[' ( (lv_atom_1_0= ruleAtom ) ) otherlv_2= '|' ( (lv_term_3_0= ruleTerm ) ) otherlv_4= ']' )
            {
            // InternalS78154S78236.g:1068:2: (otherlv_0= '[' ( (lv_atom_1_0= ruleAtom ) ) otherlv_2= '|' ( (lv_term_3_0= ruleTerm ) ) otherlv_4= ']' )
            // InternalS78154S78236.g:1069:3: otherlv_0= '[' ( (lv_atom_1_0= ruleAtom ) ) otherlv_2= '|' ( (lv_term_3_0= ruleTerm ) ) otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getEListAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalS78154S78236.g:1073:3: ( (lv_atom_1_0= ruleAtom ) )
            // InternalS78154S78236.g:1074:4: (lv_atom_1_0= ruleAtom )
            {
            // InternalS78154S78236.g:1074:4: (lv_atom_1_0= ruleAtom )
            // InternalS78154S78236.g:1075:5: lv_atom_1_0= ruleAtom
            {

            					newCompositeNode(grammarAccess.getEListAccess().getAtomAtomParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_15);
            lv_atom_1_0=ruleAtom();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEListRule());
            					}
            					set(
            						current,
            						"atom",
            						lv_atom_1_0,
            						"beleg.S78154S78236.Atom");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getEListAccess().getVerticalLineKeyword_2());
            		
            // InternalS78154S78236.g:1096:3: ( (lv_term_3_0= ruleTerm ) )
            // InternalS78154S78236.g:1097:4: (lv_term_3_0= ruleTerm )
            {
            // InternalS78154S78236.g:1097:4: (lv_term_3_0= ruleTerm )
            // InternalS78154S78236.g:1098:5: lv_term_3_0= ruleTerm
            {

            					newCompositeNode(grammarAccess.getEListAccess().getTermTermParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_14);
            lv_term_3_0=ruleTerm();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEListRule());
            					}
            					set(
            						current,
            						"term",
            						lv_term_3_0,
            						"beleg.S78154S78236.Term");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getEListAccess().getRightSquareBracketKeyword_4());
            		

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
    // $ANTLR end "ruleEList"


    // $ANTLR start "entryRuleEAtom"
    // InternalS78154S78236.g:1123:1: entryRuleEAtom returns [EObject current=null] : iv_ruleEAtom= ruleEAtom EOF ;
    public final EObject entryRuleEAtom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEAtom = null;


        try {
            // InternalS78154S78236.g:1123:46: (iv_ruleEAtom= ruleEAtom EOF )
            // InternalS78154S78236.g:1124:2: iv_ruleEAtom= ruleEAtom EOF
            {
             newCompositeNode(grammarAccess.getEAtomRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEAtom=ruleEAtom();

            state._fsp--;

             current =iv_ruleEAtom; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEAtom"


    // $ANTLR start "ruleEAtom"
    // InternalS78154S78236.g:1130:1: ruleEAtom returns [EObject current=null] : (otherlv_0= ',' ( (lv_atom_1_0= ruleAtom ) ) ) ;
    public final EObject ruleEAtom() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_atom_1_0 = null;



        	enterRule();

        try {
            // InternalS78154S78236.g:1136:2: ( (otherlv_0= ',' ( (lv_atom_1_0= ruleAtom ) ) ) )
            // InternalS78154S78236.g:1137:2: (otherlv_0= ',' ( (lv_atom_1_0= ruleAtom ) ) )
            {
            // InternalS78154S78236.g:1137:2: (otherlv_0= ',' ( (lv_atom_1_0= ruleAtom ) ) )
            // InternalS78154S78236.g:1138:3: otherlv_0= ',' ( (lv_atom_1_0= ruleAtom ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getEAtomAccess().getCommaKeyword_0());
            		
            // InternalS78154S78236.g:1142:3: ( (lv_atom_1_0= ruleAtom ) )
            // InternalS78154S78236.g:1143:4: (lv_atom_1_0= ruleAtom )
            {
            // InternalS78154S78236.g:1143:4: (lv_atom_1_0= ruleAtom )
            // InternalS78154S78236.g:1144:5: lv_atom_1_0= ruleAtom
            {

            					newCompositeNode(grammarAccess.getEAtomAccess().getAtomAtomParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_atom_1_0=ruleAtom();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEAtomRule());
            					}
            					set(
            						current,
            						"atom",
            						lv_atom_1_0,
            						"beleg.S78154S78236.Atom");
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
    // $ANTLR end "ruleEAtom"


    // $ANTLR start "entryRuleIdent"
    // InternalS78154S78236.g:1165:1: entryRuleIdent returns [EObject current=null] : iv_ruleIdent= ruleIdent EOF ;
    public final EObject entryRuleIdent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIdent = null;


        try {
            // InternalS78154S78236.g:1165:46: (iv_ruleIdent= ruleIdent EOF )
            // InternalS78154S78236.g:1166:2: iv_ruleIdent= ruleIdent EOF
            {
             newCompositeNode(grammarAccess.getIdentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIdent=ruleIdent();

            state._fsp--;

             current =iv_ruleIdent; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleIdent"


    // $ANTLR start "ruleIdent"
    // InternalS78154S78236.g:1172:1: ruleIdent returns [EObject current=null] : ( (lv_ident_0_0= RULE_ID ) ) ;
    public final EObject ruleIdent() throws RecognitionException {
        EObject current = null;

        Token lv_ident_0_0=null;


        	enterRule();

        try {
            // InternalS78154S78236.g:1178:2: ( ( (lv_ident_0_0= RULE_ID ) ) )
            // InternalS78154S78236.g:1179:2: ( (lv_ident_0_0= RULE_ID ) )
            {
            // InternalS78154S78236.g:1179:2: ( (lv_ident_0_0= RULE_ID ) )
            // InternalS78154S78236.g:1180:3: (lv_ident_0_0= RULE_ID )
            {
            // InternalS78154S78236.g:1180:3: (lv_ident_0_0= RULE_ID )
            // InternalS78154S78236.g:1181:4: lv_ident_0_0= RULE_ID
            {
            lv_ident_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_ident_0_0, grammarAccess.getIdentAccess().getIdentIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getIdentRule());
            				}
            				setWithLastConsumed(
            					current,
            					"ident",
            					lv_ident_0_0,
            					"beleg.S78154S78236.ID");
            			

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
    // $ANTLR end "ruleIdent"


    // $ANTLR start "entryRuleEVar"
    // InternalS78154S78236.g:1200:1: entryRuleEVar returns [EObject current=null] : iv_ruleEVar= ruleEVar EOF ;
    public final EObject entryRuleEVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEVar = null;


        try {
            // InternalS78154S78236.g:1200:45: (iv_ruleEVar= ruleEVar EOF )
            // InternalS78154S78236.g:1201:2: iv_ruleEVar= ruleEVar EOF
            {
             newCompositeNode(grammarAccess.getEVarRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEVar=ruleEVar();

            state._fsp--;

             current =iv_ruleEVar; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEVar"


    // $ANTLR start "ruleEVar"
    // InternalS78154S78236.g:1207:1: ruleEVar returns [EObject current=null] : ( (lv_variable_0_0= RULE_VARIABLE ) ) ;
    public final EObject ruleEVar() throws RecognitionException {
        EObject current = null;

        Token lv_variable_0_0=null;


        	enterRule();

        try {
            // InternalS78154S78236.g:1213:2: ( ( (lv_variable_0_0= RULE_VARIABLE ) ) )
            // InternalS78154S78236.g:1214:2: ( (lv_variable_0_0= RULE_VARIABLE ) )
            {
            // InternalS78154S78236.g:1214:2: ( (lv_variable_0_0= RULE_VARIABLE ) )
            // InternalS78154S78236.g:1215:3: (lv_variable_0_0= RULE_VARIABLE )
            {
            // InternalS78154S78236.g:1215:3: (lv_variable_0_0= RULE_VARIABLE )
            // InternalS78154S78236.g:1216:4: lv_variable_0_0= RULE_VARIABLE
            {
            lv_variable_0_0=(Token)match(input,RULE_VARIABLE,FOLLOW_2); 

            				newLeafNode(lv_variable_0_0, grammarAccess.getEVarAccess().getVariableVARIABLETerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getEVarRule());
            				}
            				setWithLastConsumed(
            					current,
            					"variable",
            					lv_variable_0_0,
            					"beleg.S78154S78236.VARIABLE");
            			

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
    // $ANTLR end "ruleEVar"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000180070L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});

}