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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_NUMBER", "RULE_ID", "RULE_VARIABLE", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'?-'", "'.'", "','", "':-'", "'('", "')'", "'[]'", "'['", "']'", "'|'"
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
    public static final int RULE_NUMBER=4;
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
        	return "PrologDsl";
       	}

       	@Override
       	protected S78154S78236GrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRulePrologDsl"
    // InternalS78154S78236.g:64:1: entryRulePrologDsl returns [EObject current=null] : iv_rulePrologDsl= rulePrologDsl EOF ;
    public final EObject entryRulePrologDsl() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrologDsl = null;


        try {
            // InternalS78154S78236.g:64:50: (iv_rulePrologDsl= rulePrologDsl EOF )
            // InternalS78154S78236.g:65:2: iv_rulePrologDsl= rulePrologDsl EOF
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
    // InternalS78154S78236.g:71:1: rulePrologDsl returns [EObject current=null] : ( ( (lv_program_0_0= ruleProgram ) ) ( (lv_exQuery_1_0= ruleExquery ) ) ) ;
    public final EObject rulePrologDsl() throws RecognitionException {
        EObject current = null;

        EObject lv_program_0_0 = null;

        EObject lv_exQuery_1_0 = null;



        	enterRule();

        try {
            // InternalS78154S78236.g:77:2: ( ( ( (lv_program_0_0= ruleProgram ) ) ( (lv_exQuery_1_0= ruleExquery ) ) ) )
            // InternalS78154S78236.g:78:2: ( ( (lv_program_0_0= ruleProgram ) ) ( (lv_exQuery_1_0= ruleExquery ) ) )
            {
            // InternalS78154S78236.g:78:2: ( ( (lv_program_0_0= ruleProgram ) ) ( (lv_exQuery_1_0= ruleExquery ) ) )
            // InternalS78154S78236.g:79:3: ( (lv_program_0_0= ruleProgram ) ) ( (lv_exQuery_1_0= ruleExquery ) )
            {
            // InternalS78154S78236.g:79:3: ( (lv_program_0_0= ruleProgram ) )
            // InternalS78154S78236.g:80:4: (lv_program_0_0= ruleProgram )
            {
            // InternalS78154S78236.g:80:4: (lv_program_0_0= ruleProgram )
            // InternalS78154S78236.g:81:5: lv_program_0_0= ruleProgram
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

            // InternalS78154S78236.g:98:3: ( (lv_exQuery_1_0= ruleExquery ) )
            // InternalS78154S78236.g:99:4: (lv_exQuery_1_0= ruleExquery )
            {
            // InternalS78154S78236.g:99:4: (lv_exQuery_1_0= ruleExquery )
            // InternalS78154S78236.g:100:5: lv_exQuery_1_0= ruleExquery
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
    // InternalS78154S78236.g:121:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // InternalS78154S78236.g:121:48: (iv_ruleProgram= ruleProgram EOF )
            // InternalS78154S78236.g:122:2: iv_ruleProgram= ruleProgram EOF
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
    // InternalS78154S78236.g:128:1: ruleProgram returns [EObject current=null] : ( (lv_clauses_0_0= ruleClause ) )+ ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        EObject lv_clauses_0_0 = null;



        	enterRule();

        try {
            // InternalS78154S78236.g:134:2: ( ( (lv_clauses_0_0= ruleClause ) )+ )
            // InternalS78154S78236.g:135:2: ( (lv_clauses_0_0= ruleClause ) )+
            {
            // InternalS78154S78236.g:135:2: ( (lv_clauses_0_0= ruleClause ) )+
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
            	    // InternalS78154S78236.g:136:3: (lv_clauses_0_0= ruleClause )
            	    {
            	    // InternalS78154S78236.g:136:3: (lv_clauses_0_0= ruleClause )
            	    // InternalS78154S78236.g:137:4: lv_clauses_0_0= ruleClause
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
    // InternalS78154S78236.g:157:1: entryRuleExquery returns [EObject current=null] : iv_ruleExquery= ruleExquery EOF ;
    public final EObject entryRuleExquery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExquery = null;


        try {
            // InternalS78154S78236.g:157:48: (iv_ruleExquery= ruleExquery EOF )
            // InternalS78154S78236.g:158:2: iv_ruleExquery= ruleExquery EOF
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
    // InternalS78154S78236.g:164:1: ruleExquery returns [EObject current=null] : (otherlv_0= '?-' ( (lv_query_1_0= ruleQuery ) ) otherlv_2= '.' ) ;
    public final EObject ruleExquery() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_query_1_0 = null;



        	enterRule();

        try {
            // InternalS78154S78236.g:170:2: ( (otherlv_0= '?-' ( (lv_query_1_0= ruleQuery ) ) otherlv_2= '.' ) )
            // InternalS78154S78236.g:171:2: (otherlv_0= '?-' ( (lv_query_1_0= ruleQuery ) ) otherlv_2= '.' )
            {
            // InternalS78154S78236.g:171:2: (otherlv_0= '?-' ( (lv_query_1_0= ruleQuery ) ) otherlv_2= '.' )
            // InternalS78154S78236.g:172:3: otherlv_0= '?-' ( (lv_query_1_0= ruleQuery ) ) otherlv_2= '.'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getExqueryAccess().getQuestionMarkHyphenMinusKeyword_0());
            		
            // InternalS78154S78236.g:176:3: ( (lv_query_1_0= ruleQuery ) )
            // InternalS78154S78236.g:177:4: (lv_query_1_0= ruleQuery )
            {
            // InternalS78154S78236.g:177:4: (lv_query_1_0= ruleQuery )
            // InternalS78154S78236.g:178:5: lv_query_1_0= ruleQuery
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
    // InternalS78154S78236.g:203:1: entryRuleQuery returns [EObject current=null] : iv_ruleQuery= ruleQuery EOF ;
    public final EObject entryRuleQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuery = null;


        try {
            // InternalS78154S78236.g:203:46: (iv_ruleQuery= ruleQuery EOF )
            // InternalS78154S78236.g:204:2: iv_ruleQuery= ruleQuery EOF
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
    // InternalS78154S78236.g:210:1: ruleQuery returns [EObject current=null] : ( ( (lv_predicate_0_0= rulePredicate ) ) ( (lv_epredicates_1_0= ruleEPredicate ) )* ) ;
    public final EObject ruleQuery() throws RecognitionException {
        EObject current = null;

        EObject lv_predicate_0_0 = null;

        EObject lv_epredicates_1_0 = null;



        	enterRule();

        try {
            // InternalS78154S78236.g:216:2: ( ( ( (lv_predicate_0_0= rulePredicate ) ) ( (lv_epredicates_1_0= ruleEPredicate ) )* ) )
            // InternalS78154S78236.g:217:2: ( ( (lv_predicate_0_0= rulePredicate ) ) ( (lv_epredicates_1_0= ruleEPredicate ) )* )
            {
            // InternalS78154S78236.g:217:2: ( ( (lv_predicate_0_0= rulePredicate ) ) ( (lv_epredicates_1_0= ruleEPredicate ) )* )
            // InternalS78154S78236.g:218:3: ( (lv_predicate_0_0= rulePredicate ) ) ( (lv_epredicates_1_0= ruleEPredicate ) )*
            {
            // InternalS78154S78236.g:218:3: ( (lv_predicate_0_0= rulePredicate ) )
            // InternalS78154S78236.g:219:4: (lv_predicate_0_0= rulePredicate )
            {
            // InternalS78154S78236.g:219:4: (lv_predicate_0_0= rulePredicate )
            // InternalS78154S78236.g:220:5: lv_predicate_0_0= rulePredicate
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

            // InternalS78154S78236.g:237:3: ( (lv_epredicates_1_0= ruleEPredicate ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalS78154S78236.g:238:4: (lv_epredicates_1_0= ruleEPredicate )
            	    {
            	    // InternalS78154S78236.g:238:4: (lv_epredicates_1_0= ruleEPredicate )
            	    // InternalS78154S78236.g:239:5: lv_epredicates_1_0= ruleEPredicate
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
    // InternalS78154S78236.g:260:1: entryRuleEPredicate returns [EObject current=null] : iv_ruleEPredicate= ruleEPredicate EOF ;
    public final EObject entryRuleEPredicate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEPredicate = null;


        try {
            // InternalS78154S78236.g:260:51: (iv_ruleEPredicate= ruleEPredicate EOF )
            // InternalS78154S78236.g:261:2: iv_ruleEPredicate= ruleEPredicate EOF
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
    // InternalS78154S78236.g:267:1: ruleEPredicate returns [EObject current=null] : (otherlv_0= ',' ( (lv_predicate_1_0= rulePredicate ) ) ) ;
    public final EObject ruleEPredicate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_predicate_1_0 = null;



        	enterRule();

        try {
            // InternalS78154S78236.g:273:2: ( (otherlv_0= ',' ( (lv_predicate_1_0= rulePredicate ) ) ) )
            // InternalS78154S78236.g:274:2: (otherlv_0= ',' ( (lv_predicate_1_0= rulePredicate ) ) )
            {
            // InternalS78154S78236.g:274:2: (otherlv_0= ',' ( (lv_predicate_1_0= rulePredicate ) ) )
            // InternalS78154S78236.g:275:3: otherlv_0= ',' ( (lv_predicate_1_0= rulePredicate ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getEPredicateAccess().getCommaKeyword_0());
            		
            // InternalS78154S78236.g:279:3: ( (lv_predicate_1_0= rulePredicate ) )
            // InternalS78154S78236.g:280:4: (lv_predicate_1_0= rulePredicate )
            {
            // InternalS78154S78236.g:280:4: (lv_predicate_1_0= rulePredicate )
            // InternalS78154S78236.g:281:5: lv_predicate_1_0= rulePredicate
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
    // InternalS78154S78236.g:302:1: entryRuleClause returns [EObject current=null] : iv_ruleClause= ruleClause EOF ;
    public final EObject entryRuleClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClause = null;


        try {
            // InternalS78154S78236.g:302:47: (iv_ruleClause= ruleClause EOF )
            // InternalS78154S78236.g:303:2: iv_ruleClause= ruleClause EOF
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
    // InternalS78154S78236.g:309:1: ruleClause returns [EObject current=null] : ( ( (lv_predicate_0_0= rulePredicate ) ) ( ( (lv_fact_1_0= ruleFact ) ) | ( (lv_rule_2_0= ruleRule ) ) ) ) ;
    public final EObject ruleClause() throws RecognitionException {
        EObject current = null;

        EObject lv_predicate_0_0 = null;

        EObject lv_fact_1_0 = null;

        EObject lv_rule_2_0 = null;



        	enterRule();

        try {
            // InternalS78154S78236.g:315:2: ( ( ( (lv_predicate_0_0= rulePredicate ) ) ( ( (lv_fact_1_0= ruleFact ) ) | ( (lv_rule_2_0= ruleRule ) ) ) ) )
            // InternalS78154S78236.g:316:2: ( ( (lv_predicate_0_0= rulePredicate ) ) ( ( (lv_fact_1_0= ruleFact ) ) | ( (lv_rule_2_0= ruleRule ) ) ) )
            {
            // InternalS78154S78236.g:316:2: ( ( (lv_predicate_0_0= rulePredicate ) ) ( ( (lv_fact_1_0= ruleFact ) ) | ( (lv_rule_2_0= ruleRule ) ) ) )
            // InternalS78154S78236.g:317:3: ( (lv_predicate_0_0= rulePredicate ) ) ( ( (lv_fact_1_0= ruleFact ) ) | ( (lv_rule_2_0= ruleRule ) ) )
            {
            // InternalS78154S78236.g:317:3: ( (lv_predicate_0_0= rulePredicate ) )
            // InternalS78154S78236.g:318:4: (lv_predicate_0_0= rulePredicate )
            {
            // InternalS78154S78236.g:318:4: (lv_predicate_0_0= rulePredicate )
            // InternalS78154S78236.g:319:5: lv_predicate_0_0= rulePredicate
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

            // InternalS78154S78236.g:336:3: ( ( (lv_fact_1_0= ruleFact ) ) | ( (lv_rule_2_0= ruleRule ) ) )
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
                    // InternalS78154S78236.g:337:4: ( (lv_fact_1_0= ruleFact ) )
                    {
                    // InternalS78154S78236.g:337:4: ( (lv_fact_1_0= ruleFact ) )
                    // InternalS78154S78236.g:338:5: (lv_fact_1_0= ruleFact )
                    {
                    // InternalS78154S78236.g:338:5: (lv_fact_1_0= ruleFact )
                    // InternalS78154S78236.g:339:6: lv_fact_1_0= ruleFact
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
                    // InternalS78154S78236.g:357:4: ( (lv_rule_2_0= ruleRule ) )
                    {
                    // InternalS78154S78236.g:357:4: ( (lv_rule_2_0= ruleRule ) )
                    // InternalS78154S78236.g:358:5: (lv_rule_2_0= ruleRule )
                    {
                    // InternalS78154S78236.g:358:5: (lv_rule_2_0= ruleRule )
                    // InternalS78154S78236.g:359:6: lv_rule_2_0= ruleRule
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
    // InternalS78154S78236.g:381:1: entryRuleFact returns [EObject current=null] : iv_ruleFact= ruleFact EOF ;
    public final EObject entryRuleFact() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFact = null;


        try {
            // InternalS78154S78236.g:381:45: (iv_ruleFact= ruleFact EOF )
            // InternalS78154S78236.g:382:2: iv_ruleFact= ruleFact EOF
            {
             newCompositeNode(grammarAccess.getFactRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFact=ruleFact();

            state._fsp--;

             current =iv_ruleFact; 
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
    // InternalS78154S78236.g:388:1: ruleFact returns [EObject current=null] : ( () otherlv_1= '.' ) ;
    public final EObject ruleFact() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalS78154S78236.g:394:2: ( ( () otherlv_1= '.' ) )
            // InternalS78154S78236.g:395:2: ( () otherlv_1= '.' )
            {
            // InternalS78154S78236.g:395:2: ( () otherlv_1= '.' )
            // InternalS78154S78236.g:396:3: () otherlv_1= '.'
            {
            // InternalS78154S78236.g:396:3: ()
            // InternalS78154S78236.g:397:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFactAccess().getFactAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getFactAccess().getFullStopKeyword_1());
            		

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
    // $ANTLR end "ruleFact"


    // $ANTLR start "entryRuleRule"
    // InternalS78154S78236.g:411:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalS78154S78236.g:411:45: (iv_ruleRule= ruleRule EOF )
            // InternalS78154S78236.g:412:2: iv_ruleRule= ruleRule EOF
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
    // InternalS78154S78236.g:418:1: ruleRule returns [EObject current=null] : (otherlv_0= ':-' ( (lv_query_1_0= ruleQuery ) ) otherlv_2= '.' ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_query_1_0 = null;



        	enterRule();

        try {
            // InternalS78154S78236.g:424:2: ( (otherlv_0= ':-' ( (lv_query_1_0= ruleQuery ) ) otherlv_2= '.' ) )
            // InternalS78154S78236.g:425:2: (otherlv_0= ':-' ( (lv_query_1_0= ruleQuery ) ) otherlv_2= '.' )
            {
            // InternalS78154S78236.g:425:2: (otherlv_0= ':-' ( (lv_query_1_0= ruleQuery ) ) otherlv_2= '.' )
            // InternalS78154S78236.g:426:3: otherlv_0= ':-' ( (lv_query_1_0= ruleQuery ) ) otherlv_2= '.'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getRuleAccess().getColonHyphenMinusKeyword_0());
            		
            // InternalS78154S78236.g:430:3: ( (lv_query_1_0= ruleQuery ) )
            // InternalS78154S78236.g:431:4: (lv_query_1_0= ruleQuery )
            {
            // InternalS78154S78236.g:431:4: (lv_query_1_0= ruleQuery )
            // InternalS78154S78236.g:432:5: lv_query_1_0= ruleQuery
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getQueryQueryParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_6);
            lv_query_1_0=ruleQuery();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleRule());
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

            			newLeafNode(otherlv_2, grammarAccess.getRuleAccess().getFullStopKeyword_2());
            		

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
    // InternalS78154S78236.g:457:1: entryRulePredicate returns [EObject current=null] : iv_rulePredicate= rulePredicate EOF ;
    public final EObject entryRulePredicate() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicate = null;


        try {
            // InternalS78154S78236.g:457:50: (iv_rulePredicate= rulePredicate EOF )
            // InternalS78154S78236.g:458:2: iv_rulePredicate= rulePredicate EOF
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
    // InternalS78154S78236.g:464:1: rulePredicate returns [EObject current=null] : ( ( (lv_functor_0_0= ruleFunctor ) ) otherlv_1= '(' ( (lv_term_2_0= ruleTerm ) ) ( (lv_eterms_3_0= ruleETerm ) )* otherlv_4= ')' ) ;
    public final EObject rulePredicate() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_functor_0_0 = null;

        EObject lv_term_2_0 = null;

        EObject lv_eterms_3_0 = null;



        	enterRule();

        try {
            // InternalS78154S78236.g:470:2: ( ( ( (lv_functor_0_0= ruleFunctor ) ) otherlv_1= '(' ( (lv_term_2_0= ruleTerm ) ) ( (lv_eterms_3_0= ruleETerm ) )* otherlv_4= ')' ) )
            // InternalS78154S78236.g:471:2: ( ( (lv_functor_0_0= ruleFunctor ) ) otherlv_1= '(' ( (lv_term_2_0= ruleTerm ) ) ( (lv_eterms_3_0= ruleETerm ) )* otherlv_4= ')' )
            {
            // InternalS78154S78236.g:471:2: ( ( (lv_functor_0_0= ruleFunctor ) ) otherlv_1= '(' ( (lv_term_2_0= ruleTerm ) ) ( (lv_eterms_3_0= ruleETerm ) )* otherlv_4= ')' )
            // InternalS78154S78236.g:472:3: ( (lv_functor_0_0= ruleFunctor ) ) otherlv_1= '(' ( (lv_term_2_0= ruleTerm ) ) ( (lv_eterms_3_0= ruleETerm ) )* otherlv_4= ')'
            {
            // InternalS78154S78236.g:472:3: ( (lv_functor_0_0= ruleFunctor ) )
            // InternalS78154S78236.g:473:4: (lv_functor_0_0= ruleFunctor )
            {
            // InternalS78154S78236.g:473:4: (lv_functor_0_0= ruleFunctor )
            // InternalS78154S78236.g:474:5: lv_functor_0_0= ruleFunctor
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
            		
            // InternalS78154S78236.g:495:3: ( (lv_term_2_0= ruleTerm ) )
            // InternalS78154S78236.g:496:4: (lv_term_2_0= ruleTerm )
            {
            // InternalS78154S78236.g:496:4: (lv_term_2_0= ruleTerm )
            // InternalS78154S78236.g:497:5: lv_term_2_0= ruleTerm
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

            // InternalS78154S78236.g:514:3: ( (lv_eterms_3_0= ruleETerm ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalS78154S78236.g:515:4: (lv_eterms_3_0= ruleETerm )
            	    {
            	    // InternalS78154S78236.g:515:4: (lv_eterms_3_0= ruleETerm )
            	    // InternalS78154S78236.g:516:5: lv_eterms_3_0= ruleETerm
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
            	    break loop4;
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
    // InternalS78154S78236.g:541:1: entryRuleFunctor returns [EObject current=null] : iv_ruleFunctor= ruleFunctor EOF ;
    public final EObject entryRuleFunctor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctor = null;


        try {
            // InternalS78154S78236.g:541:48: (iv_ruleFunctor= ruleFunctor EOF )
            // InternalS78154S78236.g:542:2: iv_ruleFunctor= ruleFunctor EOF
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
    // InternalS78154S78236.g:548:1: ruleFunctor returns [EObject current=null] : ( (lv_ident_0_0= ruleIdent ) ) ;
    public final EObject ruleFunctor() throws RecognitionException {
        EObject current = null;

        EObject lv_ident_0_0 = null;



        	enterRule();

        try {
            // InternalS78154S78236.g:554:2: ( ( (lv_ident_0_0= ruleIdent ) ) )
            // InternalS78154S78236.g:555:2: ( (lv_ident_0_0= ruleIdent ) )
            {
            // InternalS78154S78236.g:555:2: ( (lv_ident_0_0= ruleIdent ) )
            // InternalS78154S78236.g:556:3: (lv_ident_0_0= ruleIdent )
            {
            // InternalS78154S78236.g:556:3: (lv_ident_0_0= ruleIdent )
            // InternalS78154S78236.g:557:4: lv_ident_0_0= ruleIdent
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
    // InternalS78154S78236.g:577:1: entryRuleTerm returns [EObject current=null] : iv_ruleTerm= ruleTerm EOF ;
    public final EObject entryRuleTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerm = null;


        try {
            // InternalS78154S78236.g:577:45: (iv_ruleTerm= ruleTerm EOF )
            // InternalS78154S78236.g:578:2: iv_ruleTerm= ruleTerm EOF
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
    // InternalS78154S78236.g:584:1: ruleTerm returns [EObject current=null] : ( ( (lv_atom_0_0= ruleAtom ) ) | ( (lv_list_1_0= ruleList ) ) ) ;
    public final EObject ruleTerm() throws RecognitionException {
        EObject current = null;

        EObject lv_atom_0_0 = null;

        EObject lv_list_1_0 = null;



        	enterRule();

        try {
            // InternalS78154S78236.g:590:2: ( ( ( (lv_atom_0_0= ruleAtom ) ) | ( (lv_list_1_0= ruleList ) ) ) )
            // InternalS78154S78236.g:591:2: ( ( (lv_atom_0_0= ruleAtom ) ) | ( (lv_list_1_0= ruleList ) ) )
            {
            // InternalS78154S78236.g:591:2: ( ( (lv_atom_0_0= ruleAtom ) ) | ( (lv_list_1_0= ruleList ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=RULE_NUMBER && LA5_0<=RULE_VARIABLE)) ) {
                alt5=1;
            }
            else if ( ((LA5_0>=19 && LA5_0<=20)) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalS78154S78236.g:592:3: ( (lv_atom_0_0= ruleAtom ) )
                    {
                    // InternalS78154S78236.g:592:3: ( (lv_atom_0_0= ruleAtom ) )
                    // InternalS78154S78236.g:593:4: (lv_atom_0_0= ruleAtom )
                    {
                    // InternalS78154S78236.g:593:4: (lv_atom_0_0= ruleAtom )
                    // InternalS78154S78236.g:594:5: lv_atom_0_0= ruleAtom
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
                    // InternalS78154S78236.g:612:3: ( (lv_list_1_0= ruleList ) )
                    {
                    // InternalS78154S78236.g:612:3: ( (lv_list_1_0= ruleList ) )
                    // InternalS78154S78236.g:613:4: (lv_list_1_0= ruleList )
                    {
                    // InternalS78154S78236.g:613:4: (lv_list_1_0= ruleList )
                    // InternalS78154S78236.g:614:5: lv_list_1_0= ruleList
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
    // InternalS78154S78236.g:635:1: entryRuleETerm returns [EObject current=null] : iv_ruleETerm= ruleETerm EOF ;
    public final EObject entryRuleETerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETerm = null;


        try {
            // InternalS78154S78236.g:635:46: (iv_ruleETerm= ruleETerm EOF )
            // InternalS78154S78236.g:636:2: iv_ruleETerm= ruleETerm EOF
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
    // InternalS78154S78236.g:642:1: ruleETerm returns [EObject current=null] : (otherlv_0= ',' ( (lv_term_1_0= ruleTerm ) ) ) ;
    public final EObject ruleETerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_term_1_0 = null;



        	enterRule();

        try {
            // InternalS78154S78236.g:648:2: ( (otherlv_0= ',' ( (lv_term_1_0= ruleTerm ) ) ) )
            // InternalS78154S78236.g:649:2: (otherlv_0= ',' ( (lv_term_1_0= ruleTerm ) ) )
            {
            // InternalS78154S78236.g:649:2: (otherlv_0= ',' ( (lv_term_1_0= ruleTerm ) ) )
            // InternalS78154S78236.g:650:3: otherlv_0= ',' ( (lv_term_1_0= ruleTerm ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getETermAccess().getCommaKeyword_0());
            		
            // InternalS78154S78236.g:654:3: ( (lv_term_1_0= ruleTerm ) )
            // InternalS78154S78236.g:655:4: (lv_term_1_0= ruleTerm )
            {
            // InternalS78154S78236.g:655:4: (lv_term_1_0= ruleTerm )
            // InternalS78154S78236.g:656:5: lv_term_1_0= ruleTerm
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
    // InternalS78154S78236.g:677:1: entryRuleAtom returns [EObject current=null] : iv_ruleAtom= ruleAtom EOF ;
    public final EObject entryRuleAtom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtom = null;


        try {
            // InternalS78154S78236.g:677:45: (iv_ruleAtom= ruleAtom EOF )
            // InternalS78154S78236.g:678:2: iv_ruleAtom= ruleAtom EOF
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
    // InternalS78154S78236.g:684:1: ruleAtom returns [EObject current=null] : ( ( (lv_ident_0_0= ruleIdent ) ) | ( (lv_number_1_0= RULE_NUMBER ) ) | ( (lv_evar_2_0= ruleEVar ) ) ) ;
    public final EObject ruleAtom() throws RecognitionException {
        EObject current = null;

        Token lv_number_1_0=null;
        EObject lv_ident_0_0 = null;

        EObject lv_evar_2_0 = null;



        	enterRule();

        try {
            // InternalS78154S78236.g:690:2: ( ( ( (lv_ident_0_0= ruleIdent ) ) | ( (lv_number_1_0= RULE_NUMBER ) ) | ( (lv_evar_2_0= ruleEVar ) ) ) )
            // InternalS78154S78236.g:691:2: ( ( (lv_ident_0_0= ruleIdent ) ) | ( (lv_number_1_0= RULE_NUMBER ) ) | ( (lv_evar_2_0= ruleEVar ) ) )
            {
            // InternalS78154S78236.g:691:2: ( ( (lv_ident_0_0= ruleIdent ) ) | ( (lv_number_1_0= RULE_NUMBER ) ) | ( (lv_evar_2_0= ruleEVar ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt6=1;
                }
                break;
            case RULE_NUMBER:
                {
                alt6=2;
                }
                break;
            case RULE_VARIABLE:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalS78154S78236.g:692:3: ( (lv_ident_0_0= ruleIdent ) )
                    {
                    // InternalS78154S78236.g:692:3: ( (lv_ident_0_0= ruleIdent ) )
                    // InternalS78154S78236.g:693:4: (lv_ident_0_0= ruleIdent )
                    {
                    // InternalS78154S78236.g:693:4: (lv_ident_0_0= ruleIdent )
                    // InternalS78154S78236.g:694:5: lv_ident_0_0= ruleIdent
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
                    // InternalS78154S78236.g:712:3: ( (lv_number_1_0= RULE_NUMBER ) )
                    {
                    // InternalS78154S78236.g:712:3: ( (lv_number_1_0= RULE_NUMBER ) )
                    // InternalS78154S78236.g:713:4: (lv_number_1_0= RULE_NUMBER )
                    {
                    // InternalS78154S78236.g:713:4: (lv_number_1_0= RULE_NUMBER )
                    // InternalS78154S78236.g:714:5: lv_number_1_0= RULE_NUMBER
                    {
                    lv_number_1_0=(Token)match(input,RULE_NUMBER,FOLLOW_2); 

                    					newLeafNode(lv_number_1_0, grammarAccess.getAtomAccess().getNumberNUMBERTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAtomRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"number",
                    						lv_number_1_0,
                    						"beleg.S78154S78236.NUMBER");
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalS78154S78236.g:731:3: ( (lv_evar_2_0= ruleEVar ) )
                    {
                    // InternalS78154S78236.g:731:3: ( (lv_evar_2_0= ruleEVar ) )
                    // InternalS78154S78236.g:732:4: (lv_evar_2_0= ruleEVar )
                    {
                    // InternalS78154S78236.g:732:4: (lv_evar_2_0= ruleEVar )
                    // InternalS78154S78236.g:733:5: lv_evar_2_0= ruleEVar
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
    // InternalS78154S78236.g:754:1: entryRuleList returns [EObject current=null] : iv_ruleList= ruleList EOF ;
    public final EObject entryRuleList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleList = null;


        try {
            // InternalS78154S78236.g:754:45: (iv_ruleList= ruleList EOF )
            // InternalS78154S78236.g:755:2: iv_ruleList= ruleList EOF
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
    // InternalS78154S78236.g:761:1: ruleList returns [EObject current=null] : ( ( (lv_empty_0_0= ruleEmptyList ) ) | ( (lv_nonEmptyList_1_0= ruleNonEmptyList ) ) ) ;
    public final EObject ruleList() throws RecognitionException {
        EObject current = null;

        EObject lv_empty_0_0 = null;

        EObject lv_nonEmptyList_1_0 = null;



        	enterRule();

        try {
            // InternalS78154S78236.g:767:2: ( ( ( (lv_empty_0_0= ruleEmptyList ) ) | ( (lv_nonEmptyList_1_0= ruleNonEmptyList ) ) ) )
            // InternalS78154S78236.g:768:2: ( ( (lv_empty_0_0= ruleEmptyList ) ) | ( (lv_nonEmptyList_1_0= ruleNonEmptyList ) ) )
            {
            // InternalS78154S78236.g:768:2: ( ( (lv_empty_0_0= ruleEmptyList ) ) | ( (lv_nonEmptyList_1_0= ruleNonEmptyList ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            else if ( (LA7_0==20) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalS78154S78236.g:769:3: ( (lv_empty_0_0= ruleEmptyList ) )
                    {
                    // InternalS78154S78236.g:769:3: ( (lv_empty_0_0= ruleEmptyList ) )
                    // InternalS78154S78236.g:770:4: (lv_empty_0_0= ruleEmptyList )
                    {
                    // InternalS78154S78236.g:770:4: (lv_empty_0_0= ruleEmptyList )
                    // InternalS78154S78236.g:771:5: lv_empty_0_0= ruleEmptyList
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
                    // InternalS78154S78236.g:789:3: ( (lv_nonEmptyList_1_0= ruleNonEmptyList ) )
                    {
                    // InternalS78154S78236.g:789:3: ( (lv_nonEmptyList_1_0= ruleNonEmptyList ) )
                    // InternalS78154S78236.g:790:4: (lv_nonEmptyList_1_0= ruleNonEmptyList )
                    {
                    // InternalS78154S78236.g:790:4: (lv_nonEmptyList_1_0= ruleNonEmptyList )
                    // InternalS78154S78236.g:791:5: lv_nonEmptyList_1_0= ruleNonEmptyList
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
    // InternalS78154S78236.g:812:1: entryRuleEmptyList returns [EObject current=null] : iv_ruleEmptyList= ruleEmptyList EOF ;
    public final EObject entryRuleEmptyList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmptyList = null;


        try {
            // InternalS78154S78236.g:812:50: (iv_ruleEmptyList= ruleEmptyList EOF )
            // InternalS78154S78236.g:813:2: iv_ruleEmptyList= ruleEmptyList EOF
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
    // InternalS78154S78236.g:819:1: ruleEmptyList returns [EObject current=null] : ( () otherlv_1= '[]' ) ;
    public final EObject ruleEmptyList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalS78154S78236.g:825:2: ( ( () otherlv_1= '[]' ) )
            // InternalS78154S78236.g:826:2: ( () otherlv_1= '[]' )
            {
            // InternalS78154S78236.g:826:2: ( () otherlv_1= '[]' )
            // InternalS78154S78236.g:827:3: () otherlv_1= '[]'
            {
            // InternalS78154S78236.g:827:3: ()
            // InternalS78154S78236.g:828:4: 
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
    // InternalS78154S78236.g:842:1: entryRuleNonEmptyList returns [EObject current=null] : iv_ruleNonEmptyList= ruleNonEmptyList EOF ;
    public final EObject entryRuleNonEmptyList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNonEmptyList = null;


        try {
            // InternalS78154S78236.g:842:53: (iv_ruleNonEmptyList= ruleNonEmptyList EOF )
            // InternalS78154S78236.g:843:2: iv_ruleNonEmptyList= ruleNonEmptyList EOF
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
    // InternalS78154S78236.g:849:1: ruleNonEmptyList returns [EObject current=null] : ( ( (lv_efolge_0_0= ruleEFolge ) ) | ( (lv_elist_1_0= ruleEList ) ) ) ;
    public final EObject ruleNonEmptyList() throws RecognitionException {
        EObject current = null;

        EObject lv_efolge_0_0 = null;

        EObject lv_elist_1_0 = null;



        	enterRule();

        try {
            // InternalS78154S78236.g:855:2: ( ( ( (lv_efolge_0_0= ruleEFolge ) ) | ( (lv_elist_1_0= ruleEList ) ) ) )
            // InternalS78154S78236.g:856:2: ( ( (lv_efolge_0_0= ruleEFolge ) ) | ( (lv_elist_1_0= ruleEList ) ) )
            {
            // InternalS78154S78236.g:856:2: ( ( (lv_efolge_0_0= ruleEFolge ) ) | ( (lv_elist_1_0= ruleEList ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                switch ( input.LA(2) ) {
                case RULE_ID:
                    {
                    int LA8_2 = input.LA(3);

                    if ( (LA8_2==22) ) {
                        alt8=2;
                    }
                    else if ( (LA8_2==15||LA8_2==21) ) {
                        alt8=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 2, input);

                        throw nvae;
                    }
                    }
                    break;
                case RULE_NUMBER:
                    {
                    int LA8_3 = input.LA(3);

                    if ( (LA8_3==15||LA8_3==21) ) {
                        alt8=1;
                    }
                    else if ( (LA8_3==22) ) {
                        alt8=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 3, input);

                        throw nvae;
                    }
                    }
                    break;
                case RULE_VARIABLE:
                    {
                    int LA8_4 = input.LA(3);

                    if ( (LA8_4==22) ) {
                        alt8=2;
                    }
                    else if ( (LA8_4==15||LA8_4==21) ) {
                        alt8=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalS78154S78236.g:857:3: ( (lv_efolge_0_0= ruleEFolge ) )
                    {
                    // InternalS78154S78236.g:857:3: ( (lv_efolge_0_0= ruleEFolge ) )
                    // InternalS78154S78236.g:858:4: (lv_efolge_0_0= ruleEFolge )
                    {
                    // InternalS78154S78236.g:858:4: (lv_efolge_0_0= ruleEFolge )
                    // InternalS78154S78236.g:859:5: lv_efolge_0_0= ruleEFolge
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
                    // InternalS78154S78236.g:877:3: ( (lv_elist_1_0= ruleEList ) )
                    {
                    // InternalS78154S78236.g:877:3: ( (lv_elist_1_0= ruleEList ) )
                    // InternalS78154S78236.g:878:4: (lv_elist_1_0= ruleEList )
                    {
                    // InternalS78154S78236.g:878:4: (lv_elist_1_0= ruleEList )
                    // InternalS78154S78236.g:879:5: lv_elist_1_0= ruleEList
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
    // InternalS78154S78236.g:900:1: entryRuleFolge returns [EObject current=null] : iv_ruleFolge= ruleFolge EOF ;
    public final EObject entryRuleFolge() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFolge = null;


        try {
            // InternalS78154S78236.g:900:46: (iv_ruleFolge= ruleFolge EOF )
            // InternalS78154S78236.g:901:2: iv_ruleFolge= ruleFolge EOF
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
    // InternalS78154S78236.g:907:1: ruleFolge returns [EObject current=null] : ( ( (lv_atom_0_0= ruleAtom ) ) ( (lv_eatoms_1_0= ruleEAtom ) )* ) ;
    public final EObject ruleFolge() throws RecognitionException {
        EObject current = null;

        EObject lv_atom_0_0 = null;

        EObject lv_eatoms_1_0 = null;



        	enterRule();

        try {
            // InternalS78154S78236.g:913:2: ( ( ( (lv_atom_0_0= ruleAtom ) ) ( (lv_eatoms_1_0= ruleEAtom ) )* ) )
            // InternalS78154S78236.g:914:2: ( ( (lv_atom_0_0= ruleAtom ) ) ( (lv_eatoms_1_0= ruleEAtom ) )* )
            {
            // InternalS78154S78236.g:914:2: ( ( (lv_atom_0_0= ruleAtom ) ) ( (lv_eatoms_1_0= ruleEAtom ) )* )
            // InternalS78154S78236.g:915:3: ( (lv_atom_0_0= ruleAtom ) ) ( (lv_eatoms_1_0= ruleEAtom ) )*
            {
            // InternalS78154S78236.g:915:3: ( (lv_atom_0_0= ruleAtom ) )
            // InternalS78154S78236.g:916:4: (lv_atom_0_0= ruleAtom )
            {
            // InternalS78154S78236.g:916:4: (lv_atom_0_0= ruleAtom )
            // InternalS78154S78236.g:917:5: lv_atom_0_0= ruleAtom
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

            // InternalS78154S78236.g:934:3: ( (lv_eatoms_1_0= ruleEAtom ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==15) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalS78154S78236.g:935:4: (lv_eatoms_1_0= ruleEAtom )
            	    {
            	    // InternalS78154S78236.g:935:4: (lv_eatoms_1_0= ruleEAtom )
            	    // InternalS78154S78236.g:936:5: lv_eatoms_1_0= ruleEAtom
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
            	    break loop9;
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
    // InternalS78154S78236.g:957:1: entryRuleEFolge returns [EObject current=null] : iv_ruleEFolge= ruleEFolge EOF ;
    public final EObject entryRuleEFolge() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEFolge = null;


        try {
            // InternalS78154S78236.g:957:47: (iv_ruleEFolge= ruleEFolge EOF )
            // InternalS78154S78236.g:958:2: iv_ruleEFolge= ruleEFolge EOF
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
    // InternalS78154S78236.g:964:1: ruleEFolge returns [EObject current=null] : (otherlv_0= '[' ( (lv_folge_1_0= ruleFolge ) ) otherlv_2= ']' ) ;
    public final EObject ruleEFolge() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_folge_1_0 = null;



        	enterRule();

        try {
            // InternalS78154S78236.g:970:2: ( (otherlv_0= '[' ( (lv_folge_1_0= ruleFolge ) ) otherlv_2= ']' ) )
            // InternalS78154S78236.g:971:2: (otherlv_0= '[' ( (lv_folge_1_0= ruleFolge ) ) otherlv_2= ']' )
            {
            // InternalS78154S78236.g:971:2: (otherlv_0= '[' ( (lv_folge_1_0= ruleFolge ) ) otherlv_2= ']' )
            // InternalS78154S78236.g:972:3: otherlv_0= '[' ( (lv_folge_1_0= ruleFolge ) ) otherlv_2= ']'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getEFolgeAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalS78154S78236.g:976:3: ( (lv_folge_1_0= ruleFolge ) )
            // InternalS78154S78236.g:977:4: (lv_folge_1_0= ruleFolge )
            {
            // InternalS78154S78236.g:977:4: (lv_folge_1_0= ruleFolge )
            // InternalS78154S78236.g:978:5: lv_folge_1_0= ruleFolge
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
    // InternalS78154S78236.g:1003:1: entryRuleEList returns [EObject current=null] : iv_ruleEList= ruleEList EOF ;
    public final EObject entryRuleEList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEList = null;


        try {
            // InternalS78154S78236.g:1003:46: (iv_ruleEList= ruleEList EOF )
            // InternalS78154S78236.g:1004:2: iv_ruleEList= ruleEList EOF
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
    // InternalS78154S78236.g:1010:1: ruleEList returns [EObject current=null] : (otherlv_0= '[' ( (lv_atom_1_0= ruleAtom ) ) otherlv_2= '|' ( (lv_term_3_0= ruleTerm ) ) otherlv_4= ']' ) ;
    public final EObject ruleEList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_atom_1_0 = null;

        EObject lv_term_3_0 = null;



        	enterRule();

        try {
            // InternalS78154S78236.g:1016:2: ( (otherlv_0= '[' ( (lv_atom_1_0= ruleAtom ) ) otherlv_2= '|' ( (lv_term_3_0= ruleTerm ) ) otherlv_4= ']' ) )
            // InternalS78154S78236.g:1017:2: (otherlv_0= '[' ( (lv_atom_1_0= ruleAtom ) ) otherlv_2= '|' ( (lv_term_3_0= ruleTerm ) ) otherlv_4= ']' )
            {
            // InternalS78154S78236.g:1017:2: (otherlv_0= '[' ( (lv_atom_1_0= ruleAtom ) ) otherlv_2= '|' ( (lv_term_3_0= ruleTerm ) ) otherlv_4= ']' )
            // InternalS78154S78236.g:1018:3: otherlv_0= '[' ( (lv_atom_1_0= ruleAtom ) ) otherlv_2= '|' ( (lv_term_3_0= ruleTerm ) ) otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getEListAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalS78154S78236.g:1022:3: ( (lv_atom_1_0= ruleAtom ) )
            // InternalS78154S78236.g:1023:4: (lv_atom_1_0= ruleAtom )
            {
            // InternalS78154S78236.g:1023:4: (lv_atom_1_0= ruleAtom )
            // InternalS78154S78236.g:1024:5: lv_atom_1_0= ruleAtom
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
            		
            // InternalS78154S78236.g:1045:3: ( (lv_term_3_0= ruleTerm ) )
            // InternalS78154S78236.g:1046:4: (lv_term_3_0= ruleTerm )
            {
            // InternalS78154S78236.g:1046:4: (lv_term_3_0= ruleTerm )
            // InternalS78154S78236.g:1047:5: lv_term_3_0= ruleTerm
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
    // InternalS78154S78236.g:1072:1: entryRuleEAtom returns [EObject current=null] : iv_ruleEAtom= ruleEAtom EOF ;
    public final EObject entryRuleEAtom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEAtom = null;


        try {
            // InternalS78154S78236.g:1072:46: (iv_ruleEAtom= ruleEAtom EOF )
            // InternalS78154S78236.g:1073:2: iv_ruleEAtom= ruleEAtom EOF
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
    // InternalS78154S78236.g:1079:1: ruleEAtom returns [EObject current=null] : (otherlv_0= ',' ( (lv_atom_1_0= ruleAtom ) ) ) ;
    public final EObject ruleEAtom() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_atom_1_0 = null;



        	enterRule();

        try {
            // InternalS78154S78236.g:1085:2: ( (otherlv_0= ',' ( (lv_atom_1_0= ruleAtom ) ) ) )
            // InternalS78154S78236.g:1086:2: (otherlv_0= ',' ( (lv_atom_1_0= ruleAtom ) ) )
            {
            // InternalS78154S78236.g:1086:2: (otherlv_0= ',' ( (lv_atom_1_0= ruleAtom ) ) )
            // InternalS78154S78236.g:1087:3: otherlv_0= ',' ( (lv_atom_1_0= ruleAtom ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getEAtomAccess().getCommaKeyword_0());
            		
            // InternalS78154S78236.g:1091:3: ( (lv_atom_1_0= ruleAtom ) )
            // InternalS78154S78236.g:1092:4: (lv_atom_1_0= ruleAtom )
            {
            // InternalS78154S78236.g:1092:4: (lv_atom_1_0= ruleAtom )
            // InternalS78154S78236.g:1093:5: lv_atom_1_0= ruleAtom
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
    // InternalS78154S78236.g:1114:1: entryRuleIdent returns [EObject current=null] : iv_ruleIdent= ruleIdent EOF ;
    public final EObject entryRuleIdent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIdent = null;


        try {
            // InternalS78154S78236.g:1114:46: (iv_ruleIdent= ruleIdent EOF )
            // InternalS78154S78236.g:1115:2: iv_ruleIdent= ruleIdent EOF
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
    // InternalS78154S78236.g:1121:1: ruleIdent returns [EObject current=null] : ( (lv_ident_0_0= RULE_ID ) ) ;
    public final EObject ruleIdent() throws RecognitionException {
        EObject current = null;

        Token lv_ident_0_0=null;


        	enterRule();

        try {
            // InternalS78154S78236.g:1127:2: ( ( (lv_ident_0_0= RULE_ID ) ) )
            // InternalS78154S78236.g:1128:2: ( (lv_ident_0_0= RULE_ID ) )
            {
            // InternalS78154S78236.g:1128:2: ( (lv_ident_0_0= RULE_ID ) )
            // InternalS78154S78236.g:1129:3: (lv_ident_0_0= RULE_ID )
            {
            // InternalS78154S78236.g:1129:3: (lv_ident_0_0= RULE_ID )
            // InternalS78154S78236.g:1130:4: lv_ident_0_0= RULE_ID
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
    // InternalS78154S78236.g:1149:1: entryRuleEVar returns [EObject current=null] : iv_ruleEVar= ruleEVar EOF ;
    public final EObject entryRuleEVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEVar = null;


        try {
            // InternalS78154S78236.g:1149:45: (iv_ruleEVar= ruleEVar EOF )
            // InternalS78154S78236.g:1150:2: iv_ruleEVar= ruleEVar EOF
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
    // InternalS78154S78236.g:1156:1: ruleEVar returns [EObject current=null] : ( (lv_variable_0_0= RULE_VARIABLE ) ) ;
    public final EObject ruleEVar() throws RecognitionException {
        EObject current = null;

        Token lv_variable_0_0=null;


        	enterRule();

        try {
            // InternalS78154S78236.g:1162:2: ( ( (lv_variable_0_0= RULE_VARIABLE ) ) )
            // InternalS78154S78236.g:1163:2: ( (lv_variable_0_0= RULE_VARIABLE ) )
            {
            // InternalS78154S78236.g:1163:2: ( (lv_variable_0_0= RULE_VARIABLE ) )
            // InternalS78154S78236.g:1164:3: (lv_variable_0_0= RULE_VARIABLE )
            {
            // InternalS78154S78236.g:1164:3: (lv_variable_0_0= RULE_VARIABLE )
            // InternalS78154S78236.g:1165:4: lv_variable_0_0= RULE_VARIABLE
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