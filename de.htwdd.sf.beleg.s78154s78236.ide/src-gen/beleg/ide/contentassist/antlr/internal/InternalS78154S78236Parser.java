package beleg.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import beleg.services.S78154S78236GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalS78154S78236Parser extends AbstractInternalContentAssistParser {
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

    	public void setGrammarAccess(S78154S78236GrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRulePrologDsl"
    // InternalS78154S78236.g:53:1: entryRulePrologDsl : rulePrologDsl EOF ;
    public final void entryRulePrologDsl() throws RecognitionException {
        try {
            // InternalS78154S78236.g:54:1: ( rulePrologDsl EOF )
            // InternalS78154S78236.g:55:1: rulePrologDsl EOF
            {
             before(grammarAccess.getPrologDslRule()); 
            pushFollow(FOLLOW_1);
            rulePrologDsl();

            state._fsp--;

             after(grammarAccess.getPrologDslRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePrologDsl"


    // $ANTLR start "rulePrologDsl"
    // InternalS78154S78236.g:62:1: rulePrologDsl : ( ( rule__PrologDsl__Group__0 ) ) ;
    public final void rulePrologDsl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:66:2: ( ( ( rule__PrologDsl__Group__0 ) ) )
            // InternalS78154S78236.g:67:2: ( ( rule__PrologDsl__Group__0 ) )
            {
            // InternalS78154S78236.g:67:2: ( ( rule__PrologDsl__Group__0 ) )
            // InternalS78154S78236.g:68:3: ( rule__PrologDsl__Group__0 )
            {
             before(grammarAccess.getPrologDslAccess().getGroup()); 
            // InternalS78154S78236.g:69:3: ( rule__PrologDsl__Group__0 )
            // InternalS78154S78236.g:69:4: rule__PrologDsl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PrologDsl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPrologDslAccess().getGroup()); 

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
    // $ANTLR end "rulePrologDsl"


    // $ANTLR start "entryRuleProgram"
    // InternalS78154S78236.g:78:1: entryRuleProgram : ruleProgram EOF ;
    public final void entryRuleProgram() throws RecognitionException {
        try {
            // InternalS78154S78236.g:79:1: ( ruleProgram EOF )
            // InternalS78154S78236.g:80:1: ruleProgram EOF
            {
             before(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            ruleProgram();

            state._fsp--;

             after(grammarAccess.getProgramRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalS78154S78236.g:87:1: ruleProgram : ( ( ( rule__Program__ClausesAssignment ) ) ( ( rule__Program__ClausesAssignment )* ) ) ;
    public final void ruleProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:91:2: ( ( ( ( rule__Program__ClausesAssignment ) ) ( ( rule__Program__ClausesAssignment )* ) ) )
            // InternalS78154S78236.g:92:2: ( ( ( rule__Program__ClausesAssignment ) ) ( ( rule__Program__ClausesAssignment )* ) )
            {
            // InternalS78154S78236.g:92:2: ( ( ( rule__Program__ClausesAssignment ) ) ( ( rule__Program__ClausesAssignment )* ) )
            // InternalS78154S78236.g:93:3: ( ( rule__Program__ClausesAssignment ) ) ( ( rule__Program__ClausesAssignment )* )
            {
            // InternalS78154S78236.g:93:3: ( ( rule__Program__ClausesAssignment ) )
            // InternalS78154S78236.g:94:4: ( rule__Program__ClausesAssignment )
            {
             before(grammarAccess.getProgramAccess().getClausesAssignment()); 
            // InternalS78154S78236.g:95:4: ( rule__Program__ClausesAssignment )
            // InternalS78154S78236.g:95:5: rule__Program__ClausesAssignment
            {
            pushFollow(FOLLOW_3);
            rule__Program__ClausesAssignment();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getClausesAssignment()); 

            }

            // InternalS78154S78236.g:98:3: ( ( rule__Program__ClausesAssignment )* )
            // InternalS78154S78236.g:99:4: ( rule__Program__ClausesAssignment )*
            {
             before(grammarAccess.getProgramAccess().getClausesAssignment()); 
            // InternalS78154S78236.g:100:4: ( rule__Program__ClausesAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalS78154S78236.g:100:5: rule__Program__ClausesAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Program__ClausesAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getProgramAccess().getClausesAssignment()); 

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
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleExquery"
    // InternalS78154S78236.g:110:1: entryRuleExquery : ruleExquery EOF ;
    public final void entryRuleExquery() throws RecognitionException {
        try {
            // InternalS78154S78236.g:111:1: ( ruleExquery EOF )
            // InternalS78154S78236.g:112:1: ruleExquery EOF
            {
             before(grammarAccess.getExqueryRule()); 
            pushFollow(FOLLOW_1);
            ruleExquery();

            state._fsp--;

             after(grammarAccess.getExqueryRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleExquery"


    // $ANTLR start "ruleExquery"
    // InternalS78154S78236.g:119:1: ruleExquery : ( ( rule__Exquery__Group__0 ) ) ;
    public final void ruleExquery() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:123:2: ( ( ( rule__Exquery__Group__0 ) ) )
            // InternalS78154S78236.g:124:2: ( ( rule__Exquery__Group__0 ) )
            {
            // InternalS78154S78236.g:124:2: ( ( rule__Exquery__Group__0 ) )
            // InternalS78154S78236.g:125:3: ( rule__Exquery__Group__0 )
            {
             before(grammarAccess.getExqueryAccess().getGroup()); 
            // InternalS78154S78236.g:126:3: ( rule__Exquery__Group__0 )
            // InternalS78154S78236.g:126:4: rule__Exquery__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Exquery__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExqueryAccess().getGroup()); 

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
    // $ANTLR end "ruleExquery"


    // $ANTLR start "entryRuleQuery"
    // InternalS78154S78236.g:135:1: entryRuleQuery : ruleQuery EOF ;
    public final void entryRuleQuery() throws RecognitionException {
        try {
            // InternalS78154S78236.g:136:1: ( ruleQuery EOF )
            // InternalS78154S78236.g:137:1: ruleQuery EOF
            {
             before(grammarAccess.getQueryRule()); 
            pushFollow(FOLLOW_1);
            ruleQuery();

            state._fsp--;

             after(grammarAccess.getQueryRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleQuery"


    // $ANTLR start "ruleQuery"
    // InternalS78154S78236.g:144:1: ruleQuery : ( ( rule__Query__Group__0 ) ) ;
    public final void ruleQuery() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:148:2: ( ( ( rule__Query__Group__0 ) ) )
            // InternalS78154S78236.g:149:2: ( ( rule__Query__Group__0 ) )
            {
            // InternalS78154S78236.g:149:2: ( ( rule__Query__Group__0 ) )
            // InternalS78154S78236.g:150:3: ( rule__Query__Group__0 )
            {
             before(grammarAccess.getQueryAccess().getGroup()); 
            // InternalS78154S78236.g:151:3: ( rule__Query__Group__0 )
            // InternalS78154S78236.g:151:4: rule__Query__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Query__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQueryAccess().getGroup()); 

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
    // $ANTLR end "ruleQuery"


    // $ANTLR start "entryRuleEPredicate"
    // InternalS78154S78236.g:160:1: entryRuleEPredicate : ruleEPredicate EOF ;
    public final void entryRuleEPredicate() throws RecognitionException {
        try {
            // InternalS78154S78236.g:161:1: ( ruleEPredicate EOF )
            // InternalS78154S78236.g:162:1: ruleEPredicate EOF
            {
             before(grammarAccess.getEPredicateRule()); 
            pushFollow(FOLLOW_1);
            ruleEPredicate();

            state._fsp--;

             after(grammarAccess.getEPredicateRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEPredicate"


    // $ANTLR start "ruleEPredicate"
    // InternalS78154S78236.g:169:1: ruleEPredicate : ( ( rule__EPredicate__Group__0 ) ) ;
    public final void ruleEPredicate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:173:2: ( ( ( rule__EPredicate__Group__0 ) ) )
            // InternalS78154S78236.g:174:2: ( ( rule__EPredicate__Group__0 ) )
            {
            // InternalS78154S78236.g:174:2: ( ( rule__EPredicate__Group__0 ) )
            // InternalS78154S78236.g:175:3: ( rule__EPredicate__Group__0 )
            {
             before(grammarAccess.getEPredicateAccess().getGroup()); 
            // InternalS78154S78236.g:176:3: ( rule__EPredicate__Group__0 )
            // InternalS78154S78236.g:176:4: rule__EPredicate__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EPredicate__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEPredicateAccess().getGroup()); 

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
    // $ANTLR end "ruleEPredicate"


    // $ANTLR start "entryRuleClause"
    // InternalS78154S78236.g:185:1: entryRuleClause : ruleClause EOF ;
    public final void entryRuleClause() throws RecognitionException {
        try {
            // InternalS78154S78236.g:186:1: ( ruleClause EOF )
            // InternalS78154S78236.g:187:1: ruleClause EOF
            {
             before(grammarAccess.getClauseRule()); 
            pushFollow(FOLLOW_1);
            ruleClause();

            state._fsp--;

             after(grammarAccess.getClauseRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleClause"


    // $ANTLR start "ruleClause"
    // InternalS78154S78236.g:194:1: ruleClause : ( ( rule__Clause__Group__0 ) ) ;
    public final void ruleClause() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:198:2: ( ( ( rule__Clause__Group__0 ) ) )
            // InternalS78154S78236.g:199:2: ( ( rule__Clause__Group__0 ) )
            {
            // InternalS78154S78236.g:199:2: ( ( rule__Clause__Group__0 ) )
            // InternalS78154S78236.g:200:3: ( rule__Clause__Group__0 )
            {
             before(grammarAccess.getClauseAccess().getGroup()); 
            // InternalS78154S78236.g:201:3: ( rule__Clause__Group__0 )
            // InternalS78154S78236.g:201:4: rule__Clause__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Clause__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClauseAccess().getGroup()); 

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
    // $ANTLR end "ruleClause"


    // $ANTLR start "entryRuleFact"
    // InternalS78154S78236.g:210:1: entryRuleFact : ruleFact EOF ;
    public final void entryRuleFact() throws RecognitionException {
        try {
            // InternalS78154S78236.g:211:1: ( ruleFact EOF )
            // InternalS78154S78236.g:212:1: ruleFact EOF
            {
             before(grammarAccess.getFactRule()); 
            pushFollow(FOLLOW_1);
            ruleFact();

            state._fsp--;

             after(grammarAccess.getFactRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFact"


    // $ANTLR start "ruleFact"
    // InternalS78154S78236.g:219:1: ruleFact : ( ( rule__Fact__Group__0 ) ) ;
    public final void ruleFact() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:223:2: ( ( ( rule__Fact__Group__0 ) ) )
            // InternalS78154S78236.g:224:2: ( ( rule__Fact__Group__0 ) )
            {
            // InternalS78154S78236.g:224:2: ( ( rule__Fact__Group__0 ) )
            // InternalS78154S78236.g:225:3: ( rule__Fact__Group__0 )
            {
             before(grammarAccess.getFactAccess().getGroup()); 
            // InternalS78154S78236.g:226:3: ( rule__Fact__Group__0 )
            // InternalS78154S78236.g:226:4: rule__Fact__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Fact__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFactAccess().getGroup()); 

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
    // $ANTLR end "ruleFact"


    // $ANTLR start "entryRuleRule"
    // InternalS78154S78236.g:235:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // InternalS78154S78236.g:236:1: ( ruleRule EOF )
            // InternalS78154S78236.g:237:1: ruleRule EOF
            {
             before(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getRuleRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalS78154S78236.g:244:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:248:2: ( ( ( rule__Rule__Group__0 ) ) )
            // InternalS78154S78236.g:249:2: ( ( rule__Rule__Group__0 ) )
            {
            // InternalS78154S78236.g:249:2: ( ( rule__Rule__Group__0 ) )
            // InternalS78154S78236.g:250:3: ( rule__Rule__Group__0 )
            {
             before(grammarAccess.getRuleAccess().getGroup()); 
            // InternalS78154S78236.g:251:3: ( rule__Rule__Group__0 )
            // InternalS78154S78236.g:251:4: rule__Rule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getGroup()); 

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
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRulePredicate"
    // InternalS78154S78236.g:260:1: entryRulePredicate : rulePredicate EOF ;
    public final void entryRulePredicate() throws RecognitionException {
        try {
            // InternalS78154S78236.g:261:1: ( rulePredicate EOF )
            // InternalS78154S78236.g:262:1: rulePredicate EOF
            {
             before(grammarAccess.getPredicateRule()); 
            pushFollow(FOLLOW_1);
            rulePredicate();

            state._fsp--;

             after(grammarAccess.getPredicateRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePredicate"


    // $ANTLR start "rulePredicate"
    // InternalS78154S78236.g:269:1: rulePredicate : ( ( rule__Predicate__Group__0 ) ) ;
    public final void rulePredicate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:273:2: ( ( ( rule__Predicate__Group__0 ) ) )
            // InternalS78154S78236.g:274:2: ( ( rule__Predicate__Group__0 ) )
            {
            // InternalS78154S78236.g:274:2: ( ( rule__Predicate__Group__0 ) )
            // InternalS78154S78236.g:275:3: ( rule__Predicate__Group__0 )
            {
             before(grammarAccess.getPredicateAccess().getGroup()); 
            // InternalS78154S78236.g:276:3: ( rule__Predicate__Group__0 )
            // InternalS78154S78236.g:276:4: rule__Predicate__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Predicate__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPredicateAccess().getGroup()); 

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
    // $ANTLR end "rulePredicate"


    // $ANTLR start "entryRuleFunctor"
    // InternalS78154S78236.g:285:1: entryRuleFunctor : ruleFunctor EOF ;
    public final void entryRuleFunctor() throws RecognitionException {
        try {
            // InternalS78154S78236.g:286:1: ( ruleFunctor EOF )
            // InternalS78154S78236.g:287:1: ruleFunctor EOF
            {
             before(grammarAccess.getFunctorRule()); 
            pushFollow(FOLLOW_1);
            ruleFunctor();

            state._fsp--;

             after(grammarAccess.getFunctorRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFunctor"


    // $ANTLR start "ruleFunctor"
    // InternalS78154S78236.g:294:1: ruleFunctor : ( ( rule__Functor__IdentAssignment ) ) ;
    public final void ruleFunctor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:298:2: ( ( ( rule__Functor__IdentAssignment ) ) )
            // InternalS78154S78236.g:299:2: ( ( rule__Functor__IdentAssignment ) )
            {
            // InternalS78154S78236.g:299:2: ( ( rule__Functor__IdentAssignment ) )
            // InternalS78154S78236.g:300:3: ( rule__Functor__IdentAssignment )
            {
             before(grammarAccess.getFunctorAccess().getIdentAssignment()); 
            // InternalS78154S78236.g:301:3: ( rule__Functor__IdentAssignment )
            // InternalS78154S78236.g:301:4: rule__Functor__IdentAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Functor__IdentAssignment();

            state._fsp--;


            }

             after(grammarAccess.getFunctorAccess().getIdentAssignment()); 

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
    // $ANTLR end "ruleFunctor"


    // $ANTLR start "entryRuleTerm"
    // InternalS78154S78236.g:310:1: entryRuleTerm : ruleTerm EOF ;
    public final void entryRuleTerm() throws RecognitionException {
        try {
            // InternalS78154S78236.g:311:1: ( ruleTerm EOF )
            // InternalS78154S78236.g:312:1: ruleTerm EOF
            {
             before(grammarAccess.getTermRule()); 
            pushFollow(FOLLOW_1);
            ruleTerm();

            state._fsp--;

             after(grammarAccess.getTermRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTerm"


    // $ANTLR start "ruleTerm"
    // InternalS78154S78236.g:319:1: ruleTerm : ( ( rule__Term__Alternatives ) ) ;
    public final void ruleTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:323:2: ( ( ( rule__Term__Alternatives ) ) )
            // InternalS78154S78236.g:324:2: ( ( rule__Term__Alternatives ) )
            {
            // InternalS78154S78236.g:324:2: ( ( rule__Term__Alternatives ) )
            // InternalS78154S78236.g:325:3: ( rule__Term__Alternatives )
            {
             before(grammarAccess.getTermAccess().getAlternatives()); 
            // InternalS78154S78236.g:326:3: ( rule__Term__Alternatives )
            // InternalS78154S78236.g:326:4: rule__Term__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Term__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTermAccess().getAlternatives()); 

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
    // $ANTLR end "ruleTerm"


    // $ANTLR start "entryRuleETerm"
    // InternalS78154S78236.g:335:1: entryRuleETerm : ruleETerm EOF ;
    public final void entryRuleETerm() throws RecognitionException {
        try {
            // InternalS78154S78236.g:336:1: ( ruleETerm EOF )
            // InternalS78154S78236.g:337:1: ruleETerm EOF
            {
             before(grammarAccess.getETermRule()); 
            pushFollow(FOLLOW_1);
            ruleETerm();

            state._fsp--;

             after(grammarAccess.getETermRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleETerm"


    // $ANTLR start "ruleETerm"
    // InternalS78154S78236.g:344:1: ruleETerm : ( ( rule__ETerm__Group__0 ) ) ;
    public final void ruleETerm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:348:2: ( ( ( rule__ETerm__Group__0 ) ) )
            // InternalS78154S78236.g:349:2: ( ( rule__ETerm__Group__0 ) )
            {
            // InternalS78154S78236.g:349:2: ( ( rule__ETerm__Group__0 ) )
            // InternalS78154S78236.g:350:3: ( rule__ETerm__Group__0 )
            {
             before(grammarAccess.getETermAccess().getGroup()); 
            // InternalS78154S78236.g:351:3: ( rule__ETerm__Group__0 )
            // InternalS78154S78236.g:351:4: rule__ETerm__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ETerm__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getETermAccess().getGroup()); 

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
    // $ANTLR end "ruleETerm"


    // $ANTLR start "entryRuleAtom"
    // InternalS78154S78236.g:360:1: entryRuleAtom : ruleAtom EOF ;
    public final void entryRuleAtom() throws RecognitionException {
        try {
            // InternalS78154S78236.g:361:1: ( ruleAtom EOF )
            // InternalS78154S78236.g:362:1: ruleAtom EOF
            {
             before(grammarAccess.getAtomRule()); 
            pushFollow(FOLLOW_1);
            ruleAtom();

            state._fsp--;

             after(grammarAccess.getAtomRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAtom"


    // $ANTLR start "ruleAtom"
    // InternalS78154S78236.g:369:1: ruleAtom : ( ( rule__Atom__Alternatives ) ) ;
    public final void ruleAtom() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:373:2: ( ( ( rule__Atom__Alternatives ) ) )
            // InternalS78154S78236.g:374:2: ( ( rule__Atom__Alternatives ) )
            {
            // InternalS78154S78236.g:374:2: ( ( rule__Atom__Alternatives ) )
            // InternalS78154S78236.g:375:3: ( rule__Atom__Alternatives )
            {
             before(grammarAccess.getAtomAccess().getAlternatives()); 
            // InternalS78154S78236.g:376:3: ( rule__Atom__Alternatives )
            // InternalS78154S78236.g:376:4: rule__Atom__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Atom__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAtomAccess().getAlternatives()); 

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
    // $ANTLR end "ruleAtom"


    // $ANTLR start "entryRuleList"
    // InternalS78154S78236.g:385:1: entryRuleList : ruleList EOF ;
    public final void entryRuleList() throws RecognitionException {
        try {
            // InternalS78154S78236.g:386:1: ( ruleList EOF )
            // InternalS78154S78236.g:387:1: ruleList EOF
            {
             before(grammarAccess.getListRule()); 
            pushFollow(FOLLOW_1);
            ruleList();

            state._fsp--;

             after(grammarAccess.getListRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleList"


    // $ANTLR start "ruleList"
    // InternalS78154S78236.g:394:1: ruleList : ( ( rule__List__Alternatives ) ) ;
    public final void ruleList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:398:2: ( ( ( rule__List__Alternatives ) ) )
            // InternalS78154S78236.g:399:2: ( ( rule__List__Alternatives ) )
            {
            // InternalS78154S78236.g:399:2: ( ( rule__List__Alternatives ) )
            // InternalS78154S78236.g:400:3: ( rule__List__Alternatives )
            {
             before(grammarAccess.getListAccess().getAlternatives()); 
            // InternalS78154S78236.g:401:3: ( rule__List__Alternatives )
            // InternalS78154S78236.g:401:4: rule__List__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__List__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getListAccess().getAlternatives()); 

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
    // $ANTLR end "ruleList"


    // $ANTLR start "entryRuleEmptyList"
    // InternalS78154S78236.g:410:1: entryRuleEmptyList : ruleEmptyList EOF ;
    public final void entryRuleEmptyList() throws RecognitionException {
        try {
            // InternalS78154S78236.g:411:1: ( ruleEmptyList EOF )
            // InternalS78154S78236.g:412:1: ruleEmptyList EOF
            {
             before(grammarAccess.getEmptyListRule()); 
            pushFollow(FOLLOW_1);
            ruleEmptyList();

            state._fsp--;

             after(grammarAccess.getEmptyListRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEmptyList"


    // $ANTLR start "ruleEmptyList"
    // InternalS78154S78236.g:419:1: ruleEmptyList : ( ( rule__EmptyList__Group__0 ) ) ;
    public final void ruleEmptyList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:423:2: ( ( ( rule__EmptyList__Group__0 ) ) )
            // InternalS78154S78236.g:424:2: ( ( rule__EmptyList__Group__0 ) )
            {
            // InternalS78154S78236.g:424:2: ( ( rule__EmptyList__Group__0 ) )
            // InternalS78154S78236.g:425:3: ( rule__EmptyList__Group__0 )
            {
             before(grammarAccess.getEmptyListAccess().getGroup()); 
            // InternalS78154S78236.g:426:3: ( rule__EmptyList__Group__0 )
            // InternalS78154S78236.g:426:4: rule__EmptyList__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EmptyList__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEmptyListAccess().getGroup()); 

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
    // $ANTLR end "ruleEmptyList"


    // $ANTLR start "entryRuleNonEmptyList"
    // InternalS78154S78236.g:435:1: entryRuleNonEmptyList : ruleNonEmptyList EOF ;
    public final void entryRuleNonEmptyList() throws RecognitionException {
        try {
            // InternalS78154S78236.g:436:1: ( ruleNonEmptyList EOF )
            // InternalS78154S78236.g:437:1: ruleNonEmptyList EOF
            {
             before(grammarAccess.getNonEmptyListRule()); 
            pushFollow(FOLLOW_1);
            ruleNonEmptyList();

            state._fsp--;

             after(grammarAccess.getNonEmptyListRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNonEmptyList"


    // $ANTLR start "ruleNonEmptyList"
    // InternalS78154S78236.g:444:1: ruleNonEmptyList : ( ( rule__NonEmptyList__Alternatives ) ) ;
    public final void ruleNonEmptyList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:448:2: ( ( ( rule__NonEmptyList__Alternatives ) ) )
            // InternalS78154S78236.g:449:2: ( ( rule__NonEmptyList__Alternatives ) )
            {
            // InternalS78154S78236.g:449:2: ( ( rule__NonEmptyList__Alternatives ) )
            // InternalS78154S78236.g:450:3: ( rule__NonEmptyList__Alternatives )
            {
             before(grammarAccess.getNonEmptyListAccess().getAlternatives()); 
            // InternalS78154S78236.g:451:3: ( rule__NonEmptyList__Alternatives )
            // InternalS78154S78236.g:451:4: rule__NonEmptyList__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__NonEmptyList__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNonEmptyListAccess().getAlternatives()); 

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
    // $ANTLR end "ruleNonEmptyList"


    // $ANTLR start "entryRuleFolge"
    // InternalS78154S78236.g:460:1: entryRuleFolge : ruleFolge EOF ;
    public final void entryRuleFolge() throws RecognitionException {
        try {
            // InternalS78154S78236.g:461:1: ( ruleFolge EOF )
            // InternalS78154S78236.g:462:1: ruleFolge EOF
            {
             before(grammarAccess.getFolgeRule()); 
            pushFollow(FOLLOW_1);
            ruleFolge();

            state._fsp--;

             after(grammarAccess.getFolgeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFolge"


    // $ANTLR start "ruleFolge"
    // InternalS78154S78236.g:469:1: ruleFolge : ( ( rule__Folge__Group__0 ) ) ;
    public final void ruleFolge() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:473:2: ( ( ( rule__Folge__Group__0 ) ) )
            // InternalS78154S78236.g:474:2: ( ( rule__Folge__Group__0 ) )
            {
            // InternalS78154S78236.g:474:2: ( ( rule__Folge__Group__0 ) )
            // InternalS78154S78236.g:475:3: ( rule__Folge__Group__0 )
            {
             before(grammarAccess.getFolgeAccess().getGroup()); 
            // InternalS78154S78236.g:476:3: ( rule__Folge__Group__0 )
            // InternalS78154S78236.g:476:4: rule__Folge__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Folge__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFolgeAccess().getGroup()); 

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
    // $ANTLR end "ruleFolge"


    // $ANTLR start "entryRuleEFolge"
    // InternalS78154S78236.g:485:1: entryRuleEFolge : ruleEFolge EOF ;
    public final void entryRuleEFolge() throws RecognitionException {
        try {
            // InternalS78154S78236.g:486:1: ( ruleEFolge EOF )
            // InternalS78154S78236.g:487:1: ruleEFolge EOF
            {
             before(grammarAccess.getEFolgeRule()); 
            pushFollow(FOLLOW_1);
            ruleEFolge();

            state._fsp--;

             after(grammarAccess.getEFolgeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEFolge"


    // $ANTLR start "ruleEFolge"
    // InternalS78154S78236.g:494:1: ruleEFolge : ( ( rule__EFolge__Group__0 ) ) ;
    public final void ruleEFolge() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:498:2: ( ( ( rule__EFolge__Group__0 ) ) )
            // InternalS78154S78236.g:499:2: ( ( rule__EFolge__Group__0 ) )
            {
            // InternalS78154S78236.g:499:2: ( ( rule__EFolge__Group__0 ) )
            // InternalS78154S78236.g:500:3: ( rule__EFolge__Group__0 )
            {
             before(grammarAccess.getEFolgeAccess().getGroup()); 
            // InternalS78154S78236.g:501:3: ( rule__EFolge__Group__0 )
            // InternalS78154S78236.g:501:4: rule__EFolge__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EFolge__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEFolgeAccess().getGroup()); 

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
    // $ANTLR end "ruleEFolge"


    // $ANTLR start "entryRuleEList"
    // InternalS78154S78236.g:510:1: entryRuleEList : ruleEList EOF ;
    public final void entryRuleEList() throws RecognitionException {
        try {
            // InternalS78154S78236.g:511:1: ( ruleEList EOF )
            // InternalS78154S78236.g:512:1: ruleEList EOF
            {
             before(grammarAccess.getEListRule()); 
            pushFollow(FOLLOW_1);
            ruleEList();

            state._fsp--;

             after(grammarAccess.getEListRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEList"


    // $ANTLR start "ruleEList"
    // InternalS78154S78236.g:519:1: ruleEList : ( ( rule__EList__Group__0 ) ) ;
    public final void ruleEList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:523:2: ( ( ( rule__EList__Group__0 ) ) )
            // InternalS78154S78236.g:524:2: ( ( rule__EList__Group__0 ) )
            {
            // InternalS78154S78236.g:524:2: ( ( rule__EList__Group__0 ) )
            // InternalS78154S78236.g:525:3: ( rule__EList__Group__0 )
            {
             before(grammarAccess.getEListAccess().getGroup()); 
            // InternalS78154S78236.g:526:3: ( rule__EList__Group__0 )
            // InternalS78154S78236.g:526:4: rule__EList__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EList__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEListAccess().getGroup()); 

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
    // $ANTLR end "ruleEList"


    // $ANTLR start "entryRuleEAtom"
    // InternalS78154S78236.g:535:1: entryRuleEAtom : ruleEAtom EOF ;
    public final void entryRuleEAtom() throws RecognitionException {
        try {
            // InternalS78154S78236.g:536:1: ( ruleEAtom EOF )
            // InternalS78154S78236.g:537:1: ruleEAtom EOF
            {
             before(grammarAccess.getEAtomRule()); 
            pushFollow(FOLLOW_1);
            ruleEAtom();

            state._fsp--;

             after(grammarAccess.getEAtomRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEAtom"


    // $ANTLR start "ruleEAtom"
    // InternalS78154S78236.g:544:1: ruleEAtom : ( ( rule__EAtom__Group__0 ) ) ;
    public final void ruleEAtom() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:548:2: ( ( ( rule__EAtom__Group__0 ) ) )
            // InternalS78154S78236.g:549:2: ( ( rule__EAtom__Group__0 ) )
            {
            // InternalS78154S78236.g:549:2: ( ( rule__EAtom__Group__0 ) )
            // InternalS78154S78236.g:550:3: ( rule__EAtom__Group__0 )
            {
             before(grammarAccess.getEAtomAccess().getGroup()); 
            // InternalS78154S78236.g:551:3: ( rule__EAtom__Group__0 )
            // InternalS78154S78236.g:551:4: rule__EAtom__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EAtom__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEAtomAccess().getGroup()); 

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
    // $ANTLR end "ruleEAtom"


    // $ANTLR start "entryRuleIdent"
    // InternalS78154S78236.g:560:1: entryRuleIdent : ruleIdent EOF ;
    public final void entryRuleIdent() throws RecognitionException {
        try {
            // InternalS78154S78236.g:561:1: ( ruleIdent EOF )
            // InternalS78154S78236.g:562:1: ruleIdent EOF
            {
             before(grammarAccess.getIdentRule()); 
            pushFollow(FOLLOW_1);
            ruleIdent();

            state._fsp--;

             after(grammarAccess.getIdentRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleIdent"


    // $ANTLR start "ruleIdent"
    // InternalS78154S78236.g:569:1: ruleIdent : ( ( rule__Ident__IdentAssignment ) ) ;
    public final void ruleIdent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:573:2: ( ( ( rule__Ident__IdentAssignment ) ) )
            // InternalS78154S78236.g:574:2: ( ( rule__Ident__IdentAssignment ) )
            {
            // InternalS78154S78236.g:574:2: ( ( rule__Ident__IdentAssignment ) )
            // InternalS78154S78236.g:575:3: ( rule__Ident__IdentAssignment )
            {
             before(grammarAccess.getIdentAccess().getIdentAssignment()); 
            // InternalS78154S78236.g:576:3: ( rule__Ident__IdentAssignment )
            // InternalS78154S78236.g:576:4: rule__Ident__IdentAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Ident__IdentAssignment();

            state._fsp--;


            }

             after(grammarAccess.getIdentAccess().getIdentAssignment()); 

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
    // $ANTLR end "ruleIdent"


    // $ANTLR start "entryRuleEVar"
    // InternalS78154S78236.g:585:1: entryRuleEVar : ruleEVar EOF ;
    public final void entryRuleEVar() throws RecognitionException {
        try {
            // InternalS78154S78236.g:586:1: ( ruleEVar EOF )
            // InternalS78154S78236.g:587:1: ruleEVar EOF
            {
             before(grammarAccess.getEVarRule()); 
            pushFollow(FOLLOW_1);
            ruleEVar();

            state._fsp--;

             after(grammarAccess.getEVarRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEVar"


    // $ANTLR start "ruleEVar"
    // InternalS78154S78236.g:594:1: ruleEVar : ( ( rule__EVar__VariableAssignment ) ) ;
    public final void ruleEVar() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:598:2: ( ( ( rule__EVar__VariableAssignment ) ) )
            // InternalS78154S78236.g:599:2: ( ( rule__EVar__VariableAssignment ) )
            {
            // InternalS78154S78236.g:599:2: ( ( rule__EVar__VariableAssignment ) )
            // InternalS78154S78236.g:600:3: ( rule__EVar__VariableAssignment )
            {
             before(grammarAccess.getEVarAccess().getVariableAssignment()); 
            // InternalS78154S78236.g:601:3: ( rule__EVar__VariableAssignment )
            // InternalS78154S78236.g:601:4: rule__EVar__VariableAssignment
            {
            pushFollow(FOLLOW_2);
            rule__EVar__VariableAssignment();

            state._fsp--;


            }

             after(grammarAccess.getEVarAccess().getVariableAssignment()); 

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
    // $ANTLR end "ruleEVar"


    // $ANTLR start "rule__Clause__Alternatives_1"
    // InternalS78154S78236.g:609:1: rule__Clause__Alternatives_1 : ( ( ( rule__Clause__FactAssignment_1_0 ) ) | ( ( rule__Clause__RuleAssignment_1_1 ) ) );
    public final void rule__Clause__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:613:1: ( ( ( rule__Clause__FactAssignment_1_0 ) ) | ( ( rule__Clause__RuleAssignment_1_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            else if ( (LA2_0==16) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalS78154S78236.g:614:2: ( ( rule__Clause__FactAssignment_1_0 ) )
                    {
                    // InternalS78154S78236.g:614:2: ( ( rule__Clause__FactAssignment_1_0 ) )
                    // InternalS78154S78236.g:615:3: ( rule__Clause__FactAssignment_1_0 )
                    {
                     before(grammarAccess.getClauseAccess().getFactAssignment_1_0()); 
                    // InternalS78154S78236.g:616:3: ( rule__Clause__FactAssignment_1_0 )
                    // InternalS78154S78236.g:616:4: rule__Clause__FactAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Clause__FactAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getClauseAccess().getFactAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalS78154S78236.g:620:2: ( ( rule__Clause__RuleAssignment_1_1 ) )
                    {
                    // InternalS78154S78236.g:620:2: ( ( rule__Clause__RuleAssignment_1_1 ) )
                    // InternalS78154S78236.g:621:3: ( rule__Clause__RuleAssignment_1_1 )
                    {
                     before(grammarAccess.getClauseAccess().getRuleAssignment_1_1()); 
                    // InternalS78154S78236.g:622:3: ( rule__Clause__RuleAssignment_1_1 )
                    // InternalS78154S78236.g:622:4: rule__Clause__RuleAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Clause__RuleAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getClauseAccess().getRuleAssignment_1_1()); 

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
    // $ANTLR end "rule__Clause__Alternatives_1"


    // $ANTLR start "rule__Term__Alternatives"
    // InternalS78154S78236.g:630:1: rule__Term__Alternatives : ( ( ( rule__Term__AtomAssignment_0 ) ) | ( ( rule__Term__ListAssignment_1 ) ) );
    public final void rule__Term__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:634:1: ( ( ( rule__Term__AtomAssignment_0 ) ) | ( ( rule__Term__ListAssignment_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=RULE_NUMBER && LA3_0<=RULE_VARIABLE)) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=19 && LA3_0<=20)) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalS78154S78236.g:635:2: ( ( rule__Term__AtomAssignment_0 ) )
                    {
                    // InternalS78154S78236.g:635:2: ( ( rule__Term__AtomAssignment_0 ) )
                    // InternalS78154S78236.g:636:3: ( rule__Term__AtomAssignment_0 )
                    {
                     before(grammarAccess.getTermAccess().getAtomAssignment_0()); 
                    // InternalS78154S78236.g:637:3: ( rule__Term__AtomAssignment_0 )
                    // InternalS78154S78236.g:637:4: rule__Term__AtomAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Term__AtomAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTermAccess().getAtomAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalS78154S78236.g:641:2: ( ( rule__Term__ListAssignment_1 ) )
                    {
                    // InternalS78154S78236.g:641:2: ( ( rule__Term__ListAssignment_1 ) )
                    // InternalS78154S78236.g:642:3: ( rule__Term__ListAssignment_1 )
                    {
                     before(grammarAccess.getTermAccess().getListAssignment_1()); 
                    // InternalS78154S78236.g:643:3: ( rule__Term__ListAssignment_1 )
                    // InternalS78154S78236.g:643:4: rule__Term__ListAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Term__ListAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getTermAccess().getListAssignment_1()); 

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
    // $ANTLR end "rule__Term__Alternatives"


    // $ANTLR start "rule__Atom__Alternatives"
    // InternalS78154S78236.g:651:1: rule__Atom__Alternatives : ( ( ( rule__Atom__IdentAssignment_0 ) ) | ( ( rule__Atom__NumberAssignment_1 ) ) | ( ( rule__Atom__EvarAssignment_2 ) ) );
    public final void rule__Atom__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:655:1: ( ( ( rule__Atom__IdentAssignment_0 ) ) | ( ( rule__Atom__NumberAssignment_1 ) ) | ( ( rule__Atom__EvarAssignment_2 ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt4=1;
                }
                break;
            case RULE_NUMBER:
                {
                alt4=2;
                }
                break;
            case RULE_VARIABLE:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalS78154S78236.g:656:2: ( ( rule__Atom__IdentAssignment_0 ) )
                    {
                    // InternalS78154S78236.g:656:2: ( ( rule__Atom__IdentAssignment_0 ) )
                    // InternalS78154S78236.g:657:3: ( rule__Atom__IdentAssignment_0 )
                    {
                     before(grammarAccess.getAtomAccess().getIdentAssignment_0()); 
                    // InternalS78154S78236.g:658:3: ( rule__Atom__IdentAssignment_0 )
                    // InternalS78154S78236.g:658:4: rule__Atom__IdentAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Atom__IdentAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomAccess().getIdentAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalS78154S78236.g:662:2: ( ( rule__Atom__NumberAssignment_1 ) )
                    {
                    // InternalS78154S78236.g:662:2: ( ( rule__Atom__NumberAssignment_1 ) )
                    // InternalS78154S78236.g:663:3: ( rule__Atom__NumberAssignment_1 )
                    {
                     before(grammarAccess.getAtomAccess().getNumberAssignment_1()); 
                    // InternalS78154S78236.g:664:3: ( rule__Atom__NumberAssignment_1 )
                    // InternalS78154S78236.g:664:4: rule__Atom__NumberAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Atom__NumberAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomAccess().getNumberAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalS78154S78236.g:668:2: ( ( rule__Atom__EvarAssignment_2 ) )
                    {
                    // InternalS78154S78236.g:668:2: ( ( rule__Atom__EvarAssignment_2 ) )
                    // InternalS78154S78236.g:669:3: ( rule__Atom__EvarAssignment_2 )
                    {
                     before(grammarAccess.getAtomAccess().getEvarAssignment_2()); 
                    // InternalS78154S78236.g:670:3: ( rule__Atom__EvarAssignment_2 )
                    // InternalS78154S78236.g:670:4: rule__Atom__EvarAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Atom__EvarAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomAccess().getEvarAssignment_2()); 

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
    // $ANTLR end "rule__Atom__Alternatives"


    // $ANTLR start "rule__List__Alternatives"
    // InternalS78154S78236.g:678:1: rule__List__Alternatives : ( ( ( rule__List__EmptyAssignment_0 ) ) | ( ( rule__List__NonEmptyListAssignment_1 ) ) );
    public final void rule__List__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:682:1: ( ( ( rule__List__EmptyAssignment_0 ) ) | ( ( rule__List__NonEmptyListAssignment_1 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            else if ( (LA5_0==20) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalS78154S78236.g:683:2: ( ( rule__List__EmptyAssignment_0 ) )
                    {
                    // InternalS78154S78236.g:683:2: ( ( rule__List__EmptyAssignment_0 ) )
                    // InternalS78154S78236.g:684:3: ( rule__List__EmptyAssignment_0 )
                    {
                     before(grammarAccess.getListAccess().getEmptyAssignment_0()); 
                    // InternalS78154S78236.g:685:3: ( rule__List__EmptyAssignment_0 )
                    // InternalS78154S78236.g:685:4: rule__List__EmptyAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__List__EmptyAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getListAccess().getEmptyAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalS78154S78236.g:689:2: ( ( rule__List__NonEmptyListAssignment_1 ) )
                    {
                    // InternalS78154S78236.g:689:2: ( ( rule__List__NonEmptyListAssignment_1 ) )
                    // InternalS78154S78236.g:690:3: ( rule__List__NonEmptyListAssignment_1 )
                    {
                     before(grammarAccess.getListAccess().getNonEmptyListAssignment_1()); 
                    // InternalS78154S78236.g:691:3: ( rule__List__NonEmptyListAssignment_1 )
                    // InternalS78154S78236.g:691:4: rule__List__NonEmptyListAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__List__NonEmptyListAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getListAccess().getNonEmptyListAssignment_1()); 

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
    // $ANTLR end "rule__List__Alternatives"


    // $ANTLR start "rule__NonEmptyList__Alternatives"
    // InternalS78154S78236.g:699:1: rule__NonEmptyList__Alternatives : ( ( ( rule__NonEmptyList__EfolgeAssignment_0 ) ) | ( ( rule__NonEmptyList__ElistAssignment_1 ) ) );
    public final void rule__NonEmptyList__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:703:1: ( ( ( rule__NonEmptyList__EfolgeAssignment_0 ) ) | ( ( rule__NonEmptyList__ElistAssignment_1 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                switch ( input.LA(2) ) {
                case RULE_ID:
                    {
                    int LA6_2 = input.LA(3);

                    if ( (LA6_2==22) ) {
                        alt6=2;
                    }
                    else if ( (LA6_2==15||LA6_2==21) ) {
                        alt6=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 2, input);

                        throw nvae;
                    }
                    }
                    break;
                case RULE_NUMBER:
                    {
                    int LA6_3 = input.LA(3);

                    if ( (LA6_3==22) ) {
                        alt6=2;
                    }
                    else if ( (LA6_3==15||LA6_3==21) ) {
                        alt6=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 3, input);

                        throw nvae;
                    }
                    }
                    break;
                case RULE_VARIABLE:
                    {
                    int LA6_4 = input.LA(3);

                    if ( (LA6_4==22) ) {
                        alt6=2;
                    }
                    else if ( (LA6_4==15||LA6_4==21) ) {
                        alt6=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalS78154S78236.g:704:2: ( ( rule__NonEmptyList__EfolgeAssignment_0 ) )
                    {
                    // InternalS78154S78236.g:704:2: ( ( rule__NonEmptyList__EfolgeAssignment_0 ) )
                    // InternalS78154S78236.g:705:3: ( rule__NonEmptyList__EfolgeAssignment_0 )
                    {
                     before(grammarAccess.getNonEmptyListAccess().getEfolgeAssignment_0()); 
                    // InternalS78154S78236.g:706:3: ( rule__NonEmptyList__EfolgeAssignment_0 )
                    // InternalS78154S78236.g:706:4: rule__NonEmptyList__EfolgeAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NonEmptyList__EfolgeAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNonEmptyListAccess().getEfolgeAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalS78154S78236.g:710:2: ( ( rule__NonEmptyList__ElistAssignment_1 ) )
                    {
                    // InternalS78154S78236.g:710:2: ( ( rule__NonEmptyList__ElistAssignment_1 ) )
                    // InternalS78154S78236.g:711:3: ( rule__NonEmptyList__ElistAssignment_1 )
                    {
                     before(grammarAccess.getNonEmptyListAccess().getElistAssignment_1()); 
                    // InternalS78154S78236.g:712:3: ( rule__NonEmptyList__ElistAssignment_1 )
                    // InternalS78154S78236.g:712:4: rule__NonEmptyList__ElistAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__NonEmptyList__ElistAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getNonEmptyListAccess().getElistAssignment_1()); 

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
    // $ANTLR end "rule__NonEmptyList__Alternatives"


    // $ANTLR start "rule__PrologDsl__Group__0"
    // InternalS78154S78236.g:720:1: rule__PrologDsl__Group__0 : rule__PrologDsl__Group__0__Impl rule__PrologDsl__Group__1 ;
    public final void rule__PrologDsl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:724:1: ( rule__PrologDsl__Group__0__Impl rule__PrologDsl__Group__1 )
            // InternalS78154S78236.g:725:2: rule__PrologDsl__Group__0__Impl rule__PrologDsl__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__PrologDsl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrologDsl__Group__1();

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
    // $ANTLR end "rule__PrologDsl__Group__0"


    // $ANTLR start "rule__PrologDsl__Group__0__Impl"
    // InternalS78154S78236.g:732:1: rule__PrologDsl__Group__0__Impl : ( ( rule__PrologDsl__ProgramAssignment_0 ) ) ;
    public final void rule__PrologDsl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:736:1: ( ( ( rule__PrologDsl__ProgramAssignment_0 ) ) )
            // InternalS78154S78236.g:737:1: ( ( rule__PrologDsl__ProgramAssignment_0 ) )
            {
            // InternalS78154S78236.g:737:1: ( ( rule__PrologDsl__ProgramAssignment_0 ) )
            // InternalS78154S78236.g:738:2: ( rule__PrologDsl__ProgramAssignment_0 )
            {
             before(grammarAccess.getPrologDslAccess().getProgramAssignment_0()); 
            // InternalS78154S78236.g:739:2: ( rule__PrologDsl__ProgramAssignment_0 )
            // InternalS78154S78236.g:739:3: rule__PrologDsl__ProgramAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__PrologDsl__ProgramAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPrologDslAccess().getProgramAssignment_0()); 

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
    // $ANTLR end "rule__PrologDsl__Group__0__Impl"


    // $ANTLR start "rule__PrologDsl__Group__1"
    // InternalS78154S78236.g:747:1: rule__PrologDsl__Group__1 : rule__PrologDsl__Group__1__Impl ;
    public final void rule__PrologDsl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:751:1: ( rule__PrologDsl__Group__1__Impl )
            // InternalS78154S78236.g:752:2: rule__PrologDsl__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrologDsl__Group__1__Impl();

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
    // $ANTLR end "rule__PrologDsl__Group__1"


    // $ANTLR start "rule__PrologDsl__Group__1__Impl"
    // InternalS78154S78236.g:758:1: rule__PrologDsl__Group__1__Impl : ( ( rule__PrologDsl__ExQueryAssignment_1 ) ) ;
    public final void rule__PrologDsl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:762:1: ( ( ( rule__PrologDsl__ExQueryAssignment_1 ) ) )
            // InternalS78154S78236.g:763:1: ( ( rule__PrologDsl__ExQueryAssignment_1 ) )
            {
            // InternalS78154S78236.g:763:1: ( ( rule__PrologDsl__ExQueryAssignment_1 ) )
            // InternalS78154S78236.g:764:2: ( rule__PrologDsl__ExQueryAssignment_1 )
            {
             before(grammarAccess.getPrologDslAccess().getExQueryAssignment_1()); 
            // InternalS78154S78236.g:765:2: ( rule__PrologDsl__ExQueryAssignment_1 )
            // InternalS78154S78236.g:765:3: rule__PrologDsl__ExQueryAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PrologDsl__ExQueryAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPrologDslAccess().getExQueryAssignment_1()); 

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
    // $ANTLR end "rule__PrologDsl__Group__1__Impl"


    // $ANTLR start "rule__Exquery__Group__0"
    // InternalS78154S78236.g:774:1: rule__Exquery__Group__0 : rule__Exquery__Group__0__Impl rule__Exquery__Group__1 ;
    public final void rule__Exquery__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:778:1: ( rule__Exquery__Group__0__Impl rule__Exquery__Group__1 )
            // InternalS78154S78236.g:779:2: rule__Exquery__Group__0__Impl rule__Exquery__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Exquery__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exquery__Group__1();

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
    // $ANTLR end "rule__Exquery__Group__0"


    // $ANTLR start "rule__Exquery__Group__0__Impl"
    // InternalS78154S78236.g:786:1: rule__Exquery__Group__0__Impl : ( '?-' ) ;
    public final void rule__Exquery__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:790:1: ( ( '?-' ) )
            // InternalS78154S78236.g:791:1: ( '?-' )
            {
            // InternalS78154S78236.g:791:1: ( '?-' )
            // InternalS78154S78236.g:792:2: '?-'
            {
             before(grammarAccess.getExqueryAccess().getQuestionMarkHyphenMinusKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getExqueryAccess().getQuestionMarkHyphenMinusKeyword_0()); 

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
    // $ANTLR end "rule__Exquery__Group__0__Impl"


    // $ANTLR start "rule__Exquery__Group__1"
    // InternalS78154S78236.g:801:1: rule__Exquery__Group__1 : rule__Exquery__Group__1__Impl rule__Exquery__Group__2 ;
    public final void rule__Exquery__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:805:1: ( rule__Exquery__Group__1__Impl rule__Exquery__Group__2 )
            // InternalS78154S78236.g:806:2: rule__Exquery__Group__1__Impl rule__Exquery__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Exquery__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exquery__Group__2();

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
    // $ANTLR end "rule__Exquery__Group__1"


    // $ANTLR start "rule__Exquery__Group__1__Impl"
    // InternalS78154S78236.g:813:1: rule__Exquery__Group__1__Impl : ( ( rule__Exquery__QueryAssignment_1 ) ) ;
    public final void rule__Exquery__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:817:1: ( ( ( rule__Exquery__QueryAssignment_1 ) ) )
            // InternalS78154S78236.g:818:1: ( ( rule__Exquery__QueryAssignment_1 ) )
            {
            // InternalS78154S78236.g:818:1: ( ( rule__Exquery__QueryAssignment_1 ) )
            // InternalS78154S78236.g:819:2: ( rule__Exquery__QueryAssignment_1 )
            {
             before(grammarAccess.getExqueryAccess().getQueryAssignment_1()); 
            // InternalS78154S78236.g:820:2: ( rule__Exquery__QueryAssignment_1 )
            // InternalS78154S78236.g:820:3: rule__Exquery__QueryAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Exquery__QueryAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExqueryAccess().getQueryAssignment_1()); 

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
    // $ANTLR end "rule__Exquery__Group__1__Impl"


    // $ANTLR start "rule__Exquery__Group__2"
    // InternalS78154S78236.g:828:1: rule__Exquery__Group__2 : rule__Exquery__Group__2__Impl ;
    public final void rule__Exquery__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:832:1: ( rule__Exquery__Group__2__Impl )
            // InternalS78154S78236.g:833:2: rule__Exquery__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Exquery__Group__2__Impl();

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
    // $ANTLR end "rule__Exquery__Group__2"


    // $ANTLR start "rule__Exquery__Group__2__Impl"
    // InternalS78154S78236.g:839:1: rule__Exquery__Group__2__Impl : ( '.' ) ;
    public final void rule__Exquery__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:843:1: ( ( '.' ) )
            // InternalS78154S78236.g:844:1: ( '.' )
            {
            // InternalS78154S78236.g:844:1: ( '.' )
            // InternalS78154S78236.g:845:2: '.'
            {
             before(grammarAccess.getExqueryAccess().getFullStopKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getExqueryAccess().getFullStopKeyword_2()); 

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
    // $ANTLR end "rule__Exquery__Group__2__Impl"


    // $ANTLR start "rule__Query__Group__0"
    // InternalS78154S78236.g:855:1: rule__Query__Group__0 : rule__Query__Group__0__Impl rule__Query__Group__1 ;
    public final void rule__Query__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:859:1: ( rule__Query__Group__0__Impl rule__Query__Group__1 )
            // InternalS78154S78236.g:860:2: rule__Query__Group__0__Impl rule__Query__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Query__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Query__Group__1();

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
    // $ANTLR end "rule__Query__Group__0"


    // $ANTLR start "rule__Query__Group__0__Impl"
    // InternalS78154S78236.g:867:1: rule__Query__Group__0__Impl : ( ( rule__Query__PredicateAssignment_0 ) ) ;
    public final void rule__Query__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:871:1: ( ( ( rule__Query__PredicateAssignment_0 ) ) )
            // InternalS78154S78236.g:872:1: ( ( rule__Query__PredicateAssignment_0 ) )
            {
            // InternalS78154S78236.g:872:1: ( ( rule__Query__PredicateAssignment_0 ) )
            // InternalS78154S78236.g:873:2: ( rule__Query__PredicateAssignment_0 )
            {
             before(grammarAccess.getQueryAccess().getPredicateAssignment_0()); 
            // InternalS78154S78236.g:874:2: ( rule__Query__PredicateAssignment_0 )
            // InternalS78154S78236.g:874:3: rule__Query__PredicateAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Query__PredicateAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getQueryAccess().getPredicateAssignment_0()); 

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
    // $ANTLR end "rule__Query__Group__0__Impl"


    // $ANTLR start "rule__Query__Group__1"
    // InternalS78154S78236.g:882:1: rule__Query__Group__1 : rule__Query__Group__1__Impl ;
    public final void rule__Query__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:886:1: ( rule__Query__Group__1__Impl )
            // InternalS78154S78236.g:887:2: rule__Query__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Query__Group__1__Impl();

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
    // $ANTLR end "rule__Query__Group__1"


    // $ANTLR start "rule__Query__Group__1__Impl"
    // InternalS78154S78236.g:893:1: rule__Query__Group__1__Impl : ( ( rule__Query__EpredicatesAssignment_1 )* ) ;
    public final void rule__Query__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:897:1: ( ( ( rule__Query__EpredicatesAssignment_1 )* ) )
            // InternalS78154S78236.g:898:1: ( ( rule__Query__EpredicatesAssignment_1 )* )
            {
            // InternalS78154S78236.g:898:1: ( ( rule__Query__EpredicatesAssignment_1 )* )
            // InternalS78154S78236.g:899:2: ( rule__Query__EpredicatesAssignment_1 )*
            {
             before(grammarAccess.getQueryAccess().getEpredicatesAssignment_1()); 
            // InternalS78154S78236.g:900:2: ( rule__Query__EpredicatesAssignment_1 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==15) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalS78154S78236.g:900:3: rule__Query__EpredicatesAssignment_1
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Query__EpredicatesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getQueryAccess().getEpredicatesAssignment_1()); 

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
    // $ANTLR end "rule__Query__Group__1__Impl"


    // $ANTLR start "rule__EPredicate__Group__0"
    // InternalS78154S78236.g:909:1: rule__EPredicate__Group__0 : rule__EPredicate__Group__0__Impl rule__EPredicate__Group__1 ;
    public final void rule__EPredicate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:913:1: ( rule__EPredicate__Group__0__Impl rule__EPredicate__Group__1 )
            // InternalS78154S78236.g:914:2: rule__EPredicate__Group__0__Impl rule__EPredicate__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__EPredicate__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EPredicate__Group__1();

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
    // $ANTLR end "rule__EPredicate__Group__0"


    // $ANTLR start "rule__EPredicate__Group__0__Impl"
    // InternalS78154S78236.g:921:1: rule__EPredicate__Group__0__Impl : ( ',' ) ;
    public final void rule__EPredicate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:925:1: ( ( ',' ) )
            // InternalS78154S78236.g:926:1: ( ',' )
            {
            // InternalS78154S78236.g:926:1: ( ',' )
            // InternalS78154S78236.g:927:2: ','
            {
             before(grammarAccess.getEPredicateAccess().getCommaKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getEPredicateAccess().getCommaKeyword_0()); 

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
    // $ANTLR end "rule__EPredicate__Group__0__Impl"


    // $ANTLR start "rule__EPredicate__Group__1"
    // InternalS78154S78236.g:936:1: rule__EPredicate__Group__1 : rule__EPredicate__Group__1__Impl ;
    public final void rule__EPredicate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:940:1: ( rule__EPredicate__Group__1__Impl )
            // InternalS78154S78236.g:941:2: rule__EPredicate__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EPredicate__Group__1__Impl();

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
    // $ANTLR end "rule__EPredicate__Group__1"


    // $ANTLR start "rule__EPredicate__Group__1__Impl"
    // InternalS78154S78236.g:947:1: rule__EPredicate__Group__1__Impl : ( ( rule__EPredicate__PredicateAssignment_1 ) ) ;
    public final void rule__EPredicate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:951:1: ( ( ( rule__EPredicate__PredicateAssignment_1 ) ) )
            // InternalS78154S78236.g:952:1: ( ( rule__EPredicate__PredicateAssignment_1 ) )
            {
            // InternalS78154S78236.g:952:1: ( ( rule__EPredicate__PredicateAssignment_1 ) )
            // InternalS78154S78236.g:953:2: ( rule__EPredicate__PredicateAssignment_1 )
            {
             before(grammarAccess.getEPredicateAccess().getPredicateAssignment_1()); 
            // InternalS78154S78236.g:954:2: ( rule__EPredicate__PredicateAssignment_1 )
            // InternalS78154S78236.g:954:3: rule__EPredicate__PredicateAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__EPredicate__PredicateAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEPredicateAccess().getPredicateAssignment_1()); 

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
    // $ANTLR end "rule__EPredicate__Group__1__Impl"


    // $ANTLR start "rule__Clause__Group__0"
    // InternalS78154S78236.g:963:1: rule__Clause__Group__0 : rule__Clause__Group__0__Impl rule__Clause__Group__1 ;
    public final void rule__Clause__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:967:1: ( rule__Clause__Group__0__Impl rule__Clause__Group__1 )
            // InternalS78154S78236.g:968:2: rule__Clause__Group__0__Impl rule__Clause__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Clause__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Clause__Group__1();

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
    // $ANTLR end "rule__Clause__Group__0"


    // $ANTLR start "rule__Clause__Group__0__Impl"
    // InternalS78154S78236.g:975:1: rule__Clause__Group__0__Impl : ( ( rule__Clause__PredicateAssignment_0 ) ) ;
    public final void rule__Clause__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:979:1: ( ( ( rule__Clause__PredicateAssignment_0 ) ) )
            // InternalS78154S78236.g:980:1: ( ( rule__Clause__PredicateAssignment_0 ) )
            {
            // InternalS78154S78236.g:980:1: ( ( rule__Clause__PredicateAssignment_0 ) )
            // InternalS78154S78236.g:981:2: ( rule__Clause__PredicateAssignment_0 )
            {
             before(grammarAccess.getClauseAccess().getPredicateAssignment_0()); 
            // InternalS78154S78236.g:982:2: ( rule__Clause__PredicateAssignment_0 )
            // InternalS78154S78236.g:982:3: rule__Clause__PredicateAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Clause__PredicateAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getClauseAccess().getPredicateAssignment_0()); 

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
    // $ANTLR end "rule__Clause__Group__0__Impl"


    // $ANTLR start "rule__Clause__Group__1"
    // InternalS78154S78236.g:990:1: rule__Clause__Group__1 : rule__Clause__Group__1__Impl ;
    public final void rule__Clause__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:994:1: ( rule__Clause__Group__1__Impl )
            // InternalS78154S78236.g:995:2: rule__Clause__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Clause__Group__1__Impl();

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
    // $ANTLR end "rule__Clause__Group__1"


    // $ANTLR start "rule__Clause__Group__1__Impl"
    // InternalS78154S78236.g:1001:1: rule__Clause__Group__1__Impl : ( ( rule__Clause__Alternatives_1 ) ) ;
    public final void rule__Clause__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1005:1: ( ( ( rule__Clause__Alternatives_1 ) ) )
            // InternalS78154S78236.g:1006:1: ( ( rule__Clause__Alternatives_1 ) )
            {
            // InternalS78154S78236.g:1006:1: ( ( rule__Clause__Alternatives_1 ) )
            // InternalS78154S78236.g:1007:2: ( rule__Clause__Alternatives_1 )
            {
             before(grammarAccess.getClauseAccess().getAlternatives_1()); 
            // InternalS78154S78236.g:1008:2: ( rule__Clause__Alternatives_1 )
            // InternalS78154S78236.g:1008:3: rule__Clause__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__Clause__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getClauseAccess().getAlternatives_1()); 

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
    // $ANTLR end "rule__Clause__Group__1__Impl"


    // $ANTLR start "rule__Fact__Group__0"
    // InternalS78154S78236.g:1017:1: rule__Fact__Group__0 : rule__Fact__Group__0__Impl rule__Fact__Group__1 ;
    public final void rule__Fact__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1021:1: ( rule__Fact__Group__0__Impl rule__Fact__Group__1 )
            // InternalS78154S78236.g:1022:2: rule__Fact__Group__0__Impl rule__Fact__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Fact__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fact__Group__1();

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
    // $ANTLR end "rule__Fact__Group__0"


    // $ANTLR start "rule__Fact__Group__0__Impl"
    // InternalS78154S78236.g:1029:1: rule__Fact__Group__0__Impl : ( () ) ;
    public final void rule__Fact__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1033:1: ( ( () ) )
            // InternalS78154S78236.g:1034:1: ( () )
            {
            // InternalS78154S78236.g:1034:1: ( () )
            // InternalS78154S78236.g:1035:2: ()
            {
             before(grammarAccess.getFactAccess().getFactAction_0()); 
            // InternalS78154S78236.g:1036:2: ()
            // InternalS78154S78236.g:1036:3: 
            {
            }

             after(grammarAccess.getFactAccess().getFactAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fact__Group__0__Impl"


    // $ANTLR start "rule__Fact__Group__1"
    // InternalS78154S78236.g:1044:1: rule__Fact__Group__1 : rule__Fact__Group__1__Impl ;
    public final void rule__Fact__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1048:1: ( rule__Fact__Group__1__Impl )
            // InternalS78154S78236.g:1049:2: rule__Fact__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Fact__Group__1__Impl();

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
    // $ANTLR end "rule__Fact__Group__1"


    // $ANTLR start "rule__Fact__Group__1__Impl"
    // InternalS78154S78236.g:1055:1: rule__Fact__Group__1__Impl : ( '.' ) ;
    public final void rule__Fact__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1059:1: ( ( '.' ) )
            // InternalS78154S78236.g:1060:1: ( '.' )
            {
            // InternalS78154S78236.g:1060:1: ( '.' )
            // InternalS78154S78236.g:1061:2: '.'
            {
             before(grammarAccess.getFactAccess().getFullStopKeyword_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getFactAccess().getFullStopKeyword_1()); 

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
    // $ANTLR end "rule__Fact__Group__1__Impl"


    // $ANTLR start "rule__Rule__Group__0"
    // InternalS78154S78236.g:1071:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1075:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // InternalS78154S78236.g:1076:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Rule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__1();

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
    // $ANTLR end "rule__Rule__Group__0"


    // $ANTLR start "rule__Rule__Group__0__Impl"
    // InternalS78154S78236.g:1083:1: rule__Rule__Group__0__Impl : ( ':-' ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1087:1: ( ( ':-' ) )
            // InternalS78154S78236.g:1088:1: ( ':-' )
            {
            // InternalS78154S78236.g:1088:1: ( ':-' )
            // InternalS78154S78236.g:1089:2: ':-'
            {
             before(grammarAccess.getRuleAccess().getColonHyphenMinusKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getColonHyphenMinusKeyword_0()); 

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
    // $ANTLR end "rule__Rule__Group__0__Impl"


    // $ANTLR start "rule__Rule__Group__1"
    // InternalS78154S78236.g:1098:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1102:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // InternalS78154S78236.g:1103:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Rule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__2();

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
    // $ANTLR end "rule__Rule__Group__1"


    // $ANTLR start "rule__Rule__Group__1__Impl"
    // InternalS78154S78236.g:1110:1: rule__Rule__Group__1__Impl : ( ( rule__Rule__QueryAssignment_1 ) ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1114:1: ( ( ( rule__Rule__QueryAssignment_1 ) ) )
            // InternalS78154S78236.g:1115:1: ( ( rule__Rule__QueryAssignment_1 ) )
            {
            // InternalS78154S78236.g:1115:1: ( ( rule__Rule__QueryAssignment_1 ) )
            // InternalS78154S78236.g:1116:2: ( rule__Rule__QueryAssignment_1 )
            {
             before(grammarAccess.getRuleAccess().getQueryAssignment_1()); 
            // InternalS78154S78236.g:1117:2: ( rule__Rule__QueryAssignment_1 )
            // InternalS78154S78236.g:1117:3: rule__Rule__QueryAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Rule__QueryAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getQueryAssignment_1()); 

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
    // $ANTLR end "rule__Rule__Group__1__Impl"


    // $ANTLR start "rule__Rule__Group__2"
    // InternalS78154S78236.g:1125:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1129:1: ( rule__Rule__Group__2__Impl )
            // InternalS78154S78236.g:1130:2: rule__Rule__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group__2__Impl();

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
    // $ANTLR end "rule__Rule__Group__2"


    // $ANTLR start "rule__Rule__Group__2__Impl"
    // InternalS78154S78236.g:1136:1: rule__Rule__Group__2__Impl : ( '.' ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1140:1: ( ( '.' ) )
            // InternalS78154S78236.g:1141:1: ( '.' )
            {
            // InternalS78154S78236.g:1141:1: ( '.' )
            // InternalS78154S78236.g:1142:2: '.'
            {
             before(grammarAccess.getRuleAccess().getFullStopKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getFullStopKeyword_2()); 

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
    // $ANTLR end "rule__Rule__Group__2__Impl"


    // $ANTLR start "rule__Predicate__Group__0"
    // InternalS78154S78236.g:1152:1: rule__Predicate__Group__0 : rule__Predicate__Group__0__Impl rule__Predicate__Group__1 ;
    public final void rule__Predicate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1156:1: ( rule__Predicate__Group__0__Impl rule__Predicate__Group__1 )
            // InternalS78154S78236.g:1157:2: rule__Predicate__Group__0__Impl rule__Predicate__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Predicate__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Predicate__Group__1();

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
    // $ANTLR end "rule__Predicate__Group__0"


    // $ANTLR start "rule__Predicate__Group__0__Impl"
    // InternalS78154S78236.g:1164:1: rule__Predicate__Group__0__Impl : ( ( rule__Predicate__FunctorAssignment_0 ) ) ;
    public final void rule__Predicate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1168:1: ( ( ( rule__Predicate__FunctorAssignment_0 ) ) )
            // InternalS78154S78236.g:1169:1: ( ( rule__Predicate__FunctorAssignment_0 ) )
            {
            // InternalS78154S78236.g:1169:1: ( ( rule__Predicate__FunctorAssignment_0 ) )
            // InternalS78154S78236.g:1170:2: ( rule__Predicate__FunctorAssignment_0 )
            {
             before(grammarAccess.getPredicateAccess().getFunctorAssignment_0()); 
            // InternalS78154S78236.g:1171:2: ( rule__Predicate__FunctorAssignment_0 )
            // InternalS78154S78236.g:1171:3: rule__Predicate__FunctorAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Predicate__FunctorAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPredicateAccess().getFunctorAssignment_0()); 

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
    // $ANTLR end "rule__Predicate__Group__0__Impl"


    // $ANTLR start "rule__Predicate__Group__1"
    // InternalS78154S78236.g:1179:1: rule__Predicate__Group__1 : rule__Predicate__Group__1__Impl rule__Predicate__Group__2 ;
    public final void rule__Predicate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1183:1: ( rule__Predicate__Group__1__Impl rule__Predicate__Group__2 )
            // InternalS78154S78236.g:1184:2: rule__Predicate__Group__1__Impl rule__Predicate__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Predicate__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Predicate__Group__2();

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
    // $ANTLR end "rule__Predicate__Group__1"


    // $ANTLR start "rule__Predicate__Group__1__Impl"
    // InternalS78154S78236.g:1191:1: rule__Predicate__Group__1__Impl : ( '(' ) ;
    public final void rule__Predicate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1195:1: ( ( '(' ) )
            // InternalS78154S78236.g:1196:1: ( '(' )
            {
            // InternalS78154S78236.g:1196:1: ( '(' )
            // InternalS78154S78236.g:1197:2: '('
            {
             before(grammarAccess.getPredicateAccess().getLeftParenthesisKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getPredicateAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__Predicate__Group__1__Impl"


    // $ANTLR start "rule__Predicate__Group__2"
    // InternalS78154S78236.g:1206:1: rule__Predicate__Group__2 : rule__Predicate__Group__2__Impl rule__Predicate__Group__3 ;
    public final void rule__Predicate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1210:1: ( rule__Predicate__Group__2__Impl rule__Predicate__Group__3 )
            // InternalS78154S78236.g:1211:2: rule__Predicate__Group__2__Impl rule__Predicate__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__Predicate__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Predicate__Group__3();

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
    // $ANTLR end "rule__Predicate__Group__2"


    // $ANTLR start "rule__Predicate__Group__2__Impl"
    // InternalS78154S78236.g:1218:1: rule__Predicate__Group__2__Impl : ( ( rule__Predicate__TermAssignment_2 ) ) ;
    public final void rule__Predicate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1222:1: ( ( ( rule__Predicate__TermAssignment_2 ) ) )
            // InternalS78154S78236.g:1223:1: ( ( rule__Predicate__TermAssignment_2 ) )
            {
            // InternalS78154S78236.g:1223:1: ( ( rule__Predicate__TermAssignment_2 ) )
            // InternalS78154S78236.g:1224:2: ( rule__Predicate__TermAssignment_2 )
            {
             before(grammarAccess.getPredicateAccess().getTermAssignment_2()); 
            // InternalS78154S78236.g:1225:2: ( rule__Predicate__TermAssignment_2 )
            // InternalS78154S78236.g:1225:3: rule__Predicate__TermAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Predicate__TermAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPredicateAccess().getTermAssignment_2()); 

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
    // $ANTLR end "rule__Predicate__Group__2__Impl"


    // $ANTLR start "rule__Predicate__Group__3"
    // InternalS78154S78236.g:1233:1: rule__Predicate__Group__3 : rule__Predicate__Group__3__Impl rule__Predicate__Group__4 ;
    public final void rule__Predicate__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1237:1: ( rule__Predicate__Group__3__Impl rule__Predicate__Group__4 )
            // InternalS78154S78236.g:1238:2: rule__Predicate__Group__3__Impl rule__Predicate__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__Predicate__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Predicate__Group__4();

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
    // $ANTLR end "rule__Predicate__Group__3"


    // $ANTLR start "rule__Predicate__Group__3__Impl"
    // InternalS78154S78236.g:1245:1: rule__Predicate__Group__3__Impl : ( ( rule__Predicate__EtermsAssignment_3 )* ) ;
    public final void rule__Predicate__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1249:1: ( ( ( rule__Predicate__EtermsAssignment_3 )* ) )
            // InternalS78154S78236.g:1250:1: ( ( rule__Predicate__EtermsAssignment_3 )* )
            {
            // InternalS78154S78236.g:1250:1: ( ( rule__Predicate__EtermsAssignment_3 )* )
            // InternalS78154S78236.g:1251:2: ( rule__Predicate__EtermsAssignment_3 )*
            {
             before(grammarAccess.getPredicateAccess().getEtermsAssignment_3()); 
            // InternalS78154S78236.g:1252:2: ( rule__Predicate__EtermsAssignment_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==15) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalS78154S78236.g:1252:3: rule__Predicate__EtermsAssignment_3
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Predicate__EtermsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getPredicateAccess().getEtermsAssignment_3()); 

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
    // $ANTLR end "rule__Predicate__Group__3__Impl"


    // $ANTLR start "rule__Predicate__Group__4"
    // InternalS78154S78236.g:1260:1: rule__Predicate__Group__4 : rule__Predicate__Group__4__Impl ;
    public final void rule__Predicate__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1264:1: ( rule__Predicate__Group__4__Impl )
            // InternalS78154S78236.g:1265:2: rule__Predicate__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Predicate__Group__4__Impl();

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
    // $ANTLR end "rule__Predicate__Group__4"


    // $ANTLR start "rule__Predicate__Group__4__Impl"
    // InternalS78154S78236.g:1271:1: rule__Predicate__Group__4__Impl : ( ')' ) ;
    public final void rule__Predicate__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1275:1: ( ( ')' ) )
            // InternalS78154S78236.g:1276:1: ( ')' )
            {
            // InternalS78154S78236.g:1276:1: ( ')' )
            // InternalS78154S78236.g:1277:2: ')'
            {
             before(grammarAccess.getPredicateAccess().getRightParenthesisKeyword_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getPredicateAccess().getRightParenthesisKeyword_4()); 

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
    // $ANTLR end "rule__Predicate__Group__4__Impl"


    // $ANTLR start "rule__ETerm__Group__0"
    // InternalS78154S78236.g:1287:1: rule__ETerm__Group__0 : rule__ETerm__Group__0__Impl rule__ETerm__Group__1 ;
    public final void rule__ETerm__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1291:1: ( rule__ETerm__Group__0__Impl rule__ETerm__Group__1 )
            // InternalS78154S78236.g:1292:2: rule__ETerm__Group__0__Impl rule__ETerm__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__ETerm__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ETerm__Group__1();

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
    // $ANTLR end "rule__ETerm__Group__0"


    // $ANTLR start "rule__ETerm__Group__0__Impl"
    // InternalS78154S78236.g:1299:1: rule__ETerm__Group__0__Impl : ( ',' ) ;
    public final void rule__ETerm__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1303:1: ( ( ',' ) )
            // InternalS78154S78236.g:1304:1: ( ',' )
            {
            // InternalS78154S78236.g:1304:1: ( ',' )
            // InternalS78154S78236.g:1305:2: ','
            {
             before(grammarAccess.getETermAccess().getCommaKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getETermAccess().getCommaKeyword_0()); 

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
    // $ANTLR end "rule__ETerm__Group__0__Impl"


    // $ANTLR start "rule__ETerm__Group__1"
    // InternalS78154S78236.g:1314:1: rule__ETerm__Group__1 : rule__ETerm__Group__1__Impl ;
    public final void rule__ETerm__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1318:1: ( rule__ETerm__Group__1__Impl )
            // InternalS78154S78236.g:1319:2: rule__ETerm__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ETerm__Group__1__Impl();

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
    // $ANTLR end "rule__ETerm__Group__1"


    // $ANTLR start "rule__ETerm__Group__1__Impl"
    // InternalS78154S78236.g:1325:1: rule__ETerm__Group__1__Impl : ( ( rule__ETerm__TermAssignment_1 ) ) ;
    public final void rule__ETerm__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1329:1: ( ( ( rule__ETerm__TermAssignment_1 ) ) )
            // InternalS78154S78236.g:1330:1: ( ( rule__ETerm__TermAssignment_1 ) )
            {
            // InternalS78154S78236.g:1330:1: ( ( rule__ETerm__TermAssignment_1 ) )
            // InternalS78154S78236.g:1331:2: ( rule__ETerm__TermAssignment_1 )
            {
             before(grammarAccess.getETermAccess().getTermAssignment_1()); 
            // InternalS78154S78236.g:1332:2: ( rule__ETerm__TermAssignment_1 )
            // InternalS78154S78236.g:1332:3: rule__ETerm__TermAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ETerm__TermAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getETermAccess().getTermAssignment_1()); 

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
    // $ANTLR end "rule__ETerm__Group__1__Impl"


    // $ANTLR start "rule__EmptyList__Group__0"
    // InternalS78154S78236.g:1341:1: rule__EmptyList__Group__0 : rule__EmptyList__Group__0__Impl rule__EmptyList__Group__1 ;
    public final void rule__EmptyList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1345:1: ( rule__EmptyList__Group__0__Impl rule__EmptyList__Group__1 )
            // InternalS78154S78236.g:1346:2: rule__EmptyList__Group__0__Impl rule__EmptyList__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__EmptyList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EmptyList__Group__1();

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
    // $ANTLR end "rule__EmptyList__Group__0"


    // $ANTLR start "rule__EmptyList__Group__0__Impl"
    // InternalS78154S78236.g:1353:1: rule__EmptyList__Group__0__Impl : ( () ) ;
    public final void rule__EmptyList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1357:1: ( ( () ) )
            // InternalS78154S78236.g:1358:1: ( () )
            {
            // InternalS78154S78236.g:1358:1: ( () )
            // InternalS78154S78236.g:1359:2: ()
            {
             before(grammarAccess.getEmptyListAccess().getEmptyListAction_0()); 
            // InternalS78154S78236.g:1360:2: ()
            // InternalS78154S78236.g:1360:3: 
            {
            }

             after(grammarAccess.getEmptyListAccess().getEmptyListAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmptyList__Group__0__Impl"


    // $ANTLR start "rule__EmptyList__Group__1"
    // InternalS78154S78236.g:1368:1: rule__EmptyList__Group__1 : rule__EmptyList__Group__1__Impl ;
    public final void rule__EmptyList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1372:1: ( rule__EmptyList__Group__1__Impl )
            // InternalS78154S78236.g:1373:2: rule__EmptyList__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EmptyList__Group__1__Impl();

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
    // $ANTLR end "rule__EmptyList__Group__1"


    // $ANTLR start "rule__EmptyList__Group__1__Impl"
    // InternalS78154S78236.g:1379:1: rule__EmptyList__Group__1__Impl : ( '[]' ) ;
    public final void rule__EmptyList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1383:1: ( ( '[]' ) )
            // InternalS78154S78236.g:1384:1: ( '[]' )
            {
            // InternalS78154S78236.g:1384:1: ( '[]' )
            // InternalS78154S78236.g:1385:2: '[]'
            {
             before(grammarAccess.getEmptyListAccess().getLeftSquareBracketRightSquareBracketKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getEmptyListAccess().getLeftSquareBracketRightSquareBracketKeyword_1()); 

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
    // $ANTLR end "rule__EmptyList__Group__1__Impl"


    // $ANTLR start "rule__Folge__Group__0"
    // InternalS78154S78236.g:1395:1: rule__Folge__Group__0 : rule__Folge__Group__0__Impl rule__Folge__Group__1 ;
    public final void rule__Folge__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1399:1: ( rule__Folge__Group__0__Impl rule__Folge__Group__1 )
            // InternalS78154S78236.g:1400:2: rule__Folge__Group__0__Impl rule__Folge__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Folge__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Folge__Group__1();

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
    // $ANTLR end "rule__Folge__Group__0"


    // $ANTLR start "rule__Folge__Group__0__Impl"
    // InternalS78154S78236.g:1407:1: rule__Folge__Group__0__Impl : ( ( rule__Folge__AtomAssignment_0 ) ) ;
    public final void rule__Folge__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1411:1: ( ( ( rule__Folge__AtomAssignment_0 ) ) )
            // InternalS78154S78236.g:1412:1: ( ( rule__Folge__AtomAssignment_0 ) )
            {
            // InternalS78154S78236.g:1412:1: ( ( rule__Folge__AtomAssignment_0 ) )
            // InternalS78154S78236.g:1413:2: ( rule__Folge__AtomAssignment_0 )
            {
             before(grammarAccess.getFolgeAccess().getAtomAssignment_0()); 
            // InternalS78154S78236.g:1414:2: ( rule__Folge__AtomAssignment_0 )
            // InternalS78154S78236.g:1414:3: rule__Folge__AtomAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Folge__AtomAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFolgeAccess().getAtomAssignment_0()); 

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
    // $ANTLR end "rule__Folge__Group__0__Impl"


    // $ANTLR start "rule__Folge__Group__1"
    // InternalS78154S78236.g:1422:1: rule__Folge__Group__1 : rule__Folge__Group__1__Impl ;
    public final void rule__Folge__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1426:1: ( rule__Folge__Group__1__Impl )
            // InternalS78154S78236.g:1427:2: rule__Folge__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Folge__Group__1__Impl();

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
    // $ANTLR end "rule__Folge__Group__1"


    // $ANTLR start "rule__Folge__Group__1__Impl"
    // InternalS78154S78236.g:1433:1: rule__Folge__Group__1__Impl : ( ( rule__Folge__EatomsAssignment_1 )* ) ;
    public final void rule__Folge__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1437:1: ( ( ( rule__Folge__EatomsAssignment_1 )* ) )
            // InternalS78154S78236.g:1438:1: ( ( rule__Folge__EatomsAssignment_1 )* )
            {
            // InternalS78154S78236.g:1438:1: ( ( rule__Folge__EatomsAssignment_1 )* )
            // InternalS78154S78236.g:1439:2: ( rule__Folge__EatomsAssignment_1 )*
            {
             before(grammarAccess.getFolgeAccess().getEatomsAssignment_1()); 
            // InternalS78154S78236.g:1440:2: ( rule__Folge__EatomsAssignment_1 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==15) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalS78154S78236.g:1440:3: rule__Folge__EatomsAssignment_1
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Folge__EatomsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getFolgeAccess().getEatomsAssignment_1()); 

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
    // $ANTLR end "rule__Folge__Group__1__Impl"


    // $ANTLR start "rule__EFolge__Group__0"
    // InternalS78154S78236.g:1449:1: rule__EFolge__Group__0 : rule__EFolge__Group__0__Impl rule__EFolge__Group__1 ;
    public final void rule__EFolge__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1453:1: ( rule__EFolge__Group__0__Impl rule__EFolge__Group__1 )
            // InternalS78154S78236.g:1454:2: rule__EFolge__Group__0__Impl rule__EFolge__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__EFolge__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EFolge__Group__1();

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
    // $ANTLR end "rule__EFolge__Group__0"


    // $ANTLR start "rule__EFolge__Group__0__Impl"
    // InternalS78154S78236.g:1461:1: rule__EFolge__Group__0__Impl : ( '[' ) ;
    public final void rule__EFolge__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1465:1: ( ( '[' ) )
            // InternalS78154S78236.g:1466:1: ( '[' )
            {
            // InternalS78154S78236.g:1466:1: ( '[' )
            // InternalS78154S78236.g:1467:2: '['
            {
             before(grammarAccess.getEFolgeAccess().getLeftSquareBracketKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getEFolgeAccess().getLeftSquareBracketKeyword_0()); 

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
    // $ANTLR end "rule__EFolge__Group__0__Impl"


    // $ANTLR start "rule__EFolge__Group__1"
    // InternalS78154S78236.g:1476:1: rule__EFolge__Group__1 : rule__EFolge__Group__1__Impl rule__EFolge__Group__2 ;
    public final void rule__EFolge__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1480:1: ( rule__EFolge__Group__1__Impl rule__EFolge__Group__2 )
            // InternalS78154S78236.g:1481:2: rule__EFolge__Group__1__Impl rule__EFolge__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__EFolge__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EFolge__Group__2();

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
    // $ANTLR end "rule__EFolge__Group__1"


    // $ANTLR start "rule__EFolge__Group__1__Impl"
    // InternalS78154S78236.g:1488:1: rule__EFolge__Group__1__Impl : ( ( rule__EFolge__FolgeAssignment_1 ) ) ;
    public final void rule__EFolge__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1492:1: ( ( ( rule__EFolge__FolgeAssignment_1 ) ) )
            // InternalS78154S78236.g:1493:1: ( ( rule__EFolge__FolgeAssignment_1 ) )
            {
            // InternalS78154S78236.g:1493:1: ( ( rule__EFolge__FolgeAssignment_1 ) )
            // InternalS78154S78236.g:1494:2: ( rule__EFolge__FolgeAssignment_1 )
            {
             before(grammarAccess.getEFolgeAccess().getFolgeAssignment_1()); 
            // InternalS78154S78236.g:1495:2: ( rule__EFolge__FolgeAssignment_1 )
            // InternalS78154S78236.g:1495:3: rule__EFolge__FolgeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__EFolge__FolgeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEFolgeAccess().getFolgeAssignment_1()); 

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
    // $ANTLR end "rule__EFolge__Group__1__Impl"


    // $ANTLR start "rule__EFolge__Group__2"
    // InternalS78154S78236.g:1503:1: rule__EFolge__Group__2 : rule__EFolge__Group__2__Impl ;
    public final void rule__EFolge__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1507:1: ( rule__EFolge__Group__2__Impl )
            // InternalS78154S78236.g:1508:2: rule__EFolge__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EFolge__Group__2__Impl();

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
    // $ANTLR end "rule__EFolge__Group__2"


    // $ANTLR start "rule__EFolge__Group__2__Impl"
    // InternalS78154S78236.g:1514:1: rule__EFolge__Group__2__Impl : ( ']' ) ;
    public final void rule__EFolge__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1518:1: ( ( ']' ) )
            // InternalS78154S78236.g:1519:1: ( ']' )
            {
            // InternalS78154S78236.g:1519:1: ( ']' )
            // InternalS78154S78236.g:1520:2: ']'
            {
             before(grammarAccess.getEFolgeAccess().getRightSquareBracketKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getEFolgeAccess().getRightSquareBracketKeyword_2()); 

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
    // $ANTLR end "rule__EFolge__Group__2__Impl"


    // $ANTLR start "rule__EList__Group__0"
    // InternalS78154S78236.g:1530:1: rule__EList__Group__0 : rule__EList__Group__0__Impl rule__EList__Group__1 ;
    public final void rule__EList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1534:1: ( rule__EList__Group__0__Impl rule__EList__Group__1 )
            // InternalS78154S78236.g:1535:2: rule__EList__Group__0__Impl rule__EList__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__EList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EList__Group__1();

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
    // $ANTLR end "rule__EList__Group__0"


    // $ANTLR start "rule__EList__Group__0__Impl"
    // InternalS78154S78236.g:1542:1: rule__EList__Group__0__Impl : ( '[' ) ;
    public final void rule__EList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1546:1: ( ( '[' ) )
            // InternalS78154S78236.g:1547:1: ( '[' )
            {
            // InternalS78154S78236.g:1547:1: ( '[' )
            // InternalS78154S78236.g:1548:2: '['
            {
             before(grammarAccess.getEListAccess().getLeftSquareBracketKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getEListAccess().getLeftSquareBracketKeyword_0()); 

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
    // $ANTLR end "rule__EList__Group__0__Impl"


    // $ANTLR start "rule__EList__Group__1"
    // InternalS78154S78236.g:1557:1: rule__EList__Group__1 : rule__EList__Group__1__Impl rule__EList__Group__2 ;
    public final void rule__EList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1561:1: ( rule__EList__Group__1__Impl rule__EList__Group__2 )
            // InternalS78154S78236.g:1562:2: rule__EList__Group__1__Impl rule__EList__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__EList__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EList__Group__2();

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
    // $ANTLR end "rule__EList__Group__1"


    // $ANTLR start "rule__EList__Group__1__Impl"
    // InternalS78154S78236.g:1569:1: rule__EList__Group__1__Impl : ( ( rule__EList__AtomAssignment_1 ) ) ;
    public final void rule__EList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1573:1: ( ( ( rule__EList__AtomAssignment_1 ) ) )
            // InternalS78154S78236.g:1574:1: ( ( rule__EList__AtomAssignment_1 ) )
            {
            // InternalS78154S78236.g:1574:1: ( ( rule__EList__AtomAssignment_1 ) )
            // InternalS78154S78236.g:1575:2: ( rule__EList__AtomAssignment_1 )
            {
             before(grammarAccess.getEListAccess().getAtomAssignment_1()); 
            // InternalS78154S78236.g:1576:2: ( rule__EList__AtomAssignment_1 )
            // InternalS78154S78236.g:1576:3: rule__EList__AtomAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__EList__AtomAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEListAccess().getAtomAssignment_1()); 

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
    // $ANTLR end "rule__EList__Group__1__Impl"


    // $ANTLR start "rule__EList__Group__2"
    // InternalS78154S78236.g:1584:1: rule__EList__Group__2 : rule__EList__Group__2__Impl rule__EList__Group__3 ;
    public final void rule__EList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1588:1: ( rule__EList__Group__2__Impl rule__EList__Group__3 )
            // InternalS78154S78236.g:1589:2: rule__EList__Group__2__Impl rule__EList__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__EList__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EList__Group__3();

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
    // $ANTLR end "rule__EList__Group__2"


    // $ANTLR start "rule__EList__Group__2__Impl"
    // InternalS78154S78236.g:1596:1: rule__EList__Group__2__Impl : ( '|' ) ;
    public final void rule__EList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1600:1: ( ( '|' ) )
            // InternalS78154S78236.g:1601:1: ( '|' )
            {
            // InternalS78154S78236.g:1601:1: ( '|' )
            // InternalS78154S78236.g:1602:2: '|'
            {
             before(grammarAccess.getEListAccess().getVerticalLineKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getEListAccess().getVerticalLineKeyword_2()); 

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
    // $ANTLR end "rule__EList__Group__2__Impl"


    // $ANTLR start "rule__EList__Group__3"
    // InternalS78154S78236.g:1611:1: rule__EList__Group__3 : rule__EList__Group__3__Impl rule__EList__Group__4 ;
    public final void rule__EList__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1615:1: ( rule__EList__Group__3__Impl rule__EList__Group__4 )
            // InternalS78154S78236.g:1616:2: rule__EList__Group__3__Impl rule__EList__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__EList__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EList__Group__4();

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
    // $ANTLR end "rule__EList__Group__3"


    // $ANTLR start "rule__EList__Group__3__Impl"
    // InternalS78154S78236.g:1623:1: rule__EList__Group__3__Impl : ( ( rule__EList__TermAssignment_3 ) ) ;
    public final void rule__EList__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1627:1: ( ( ( rule__EList__TermAssignment_3 ) ) )
            // InternalS78154S78236.g:1628:1: ( ( rule__EList__TermAssignment_3 ) )
            {
            // InternalS78154S78236.g:1628:1: ( ( rule__EList__TermAssignment_3 ) )
            // InternalS78154S78236.g:1629:2: ( rule__EList__TermAssignment_3 )
            {
             before(grammarAccess.getEListAccess().getTermAssignment_3()); 
            // InternalS78154S78236.g:1630:2: ( rule__EList__TermAssignment_3 )
            // InternalS78154S78236.g:1630:3: rule__EList__TermAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__EList__TermAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEListAccess().getTermAssignment_3()); 

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
    // $ANTLR end "rule__EList__Group__3__Impl"


    // $ANTLR start "rule__EList__Group__4"
    // InternalS78154S78236.g:1638:1: rule__EList__Group__4 : rule__EList__Group__4__Impl ;
    public final void rule__EList__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1642:1: ( rule__EList__Group__4__Impl )
            // InternalS78154S78236.g:1643:2: rule__EList__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EList__Group__4__Impl();

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
    // $ANTLR end "rule__EList__Group__4"


    // $ANTLR start "rule__EList__Group__4__Impl"
    // InternalS78154S78236.g:1649:1: rule__EList__Group__4__Impl : ( ']' ) ;
    public final void rule__EList__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1653:1: ( ( ']' ) )
            // InternalS78154S78236.g:1654:1: ( ']' )
            {
            // InternalS78154S78236.g:1654:1: ( ']' )
            // InternalS78154S78236.g:1655:2: ']'
            {
             before(grammarAccess.getEListAccess().getRightSquareBracketKeyword_4()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getEListAccess().getRightSquareBracketKeyword_4()); 

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
    // $ANTLR end "rule__EList__Group__4__Impl"


    // $ANTLR start "rule__EAtom__Group__0"
    // InternalS78154S78236.g:1665:1: rule__EAtom__Group__0 : rule__EAtom__Group__0__Impl rule__EAtom__Group__1 ;
    public final void rule__EAtom__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1669:1: ( rule__EAtom__Group__0__Impl rule__EAtom__Group__1 )
            // InternalS78154S78236.g:1670:2: rule__EAtom__Group__0__Impl rule__EAtom__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__EAtom__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EAtom__Group__1();

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
    // $ANTLR end "rule__EAtom__Group__0"


    // $ANTLR start "rule__EAtom__Group__0__Impl"
    // InternalS78154S78236.g:1677:1: rule__EAtom__Group__0__Impl : ( ',' ) ;
    public final void rule__EAtom__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1681:1: ( ( ',' ) )
            // InternalS78154S78236.g:1682:1: ( ',' )
            {
            // InternalS78154S78236.g:1682:1: ( ',' )
            // InternalS78154S78236.g:1683:2: ','
            {
             before(grammarAccess.getEAtomAccess().getCommaKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getEAtomAccess().getCommaKeyword_0()); 

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
    // $ANTLR end "rule__EAtom__Group__0__Impl"


    // $ANTLR start "rule__EAtom__Group__1"
    // InternalS78154S78236.g:1692:1: rule__EAtom__Group__1 : rule__EAtom__Group__1__Impl ;
    public final void rule__EAtom__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1696:1: ( rule__EAtom__Group__1__Impl )
            // InternalS78154S78236.g:1697:2: rule__EAtom__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EAtom__Group__1__Impl();

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
    // $ANTLR end "rule__EAtom__Group__1"


    // $ANTLR start "rule__EAtom__Group__1__Impl"
    // InternalS78154S78236.g:1703:1: rule__EAtom__Group__1__Impl : ( ( rule__EAtom__AtomAssignment_1 ) ) ;
    public final void rule__EAtom__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1707:1: ( ( ( rule__EAtom__AtomAssignment_1 ) ) )
            // InternalS78154S78236.g:1708:1: ( ( rule__EAtom__AtomAssignment_1 ) )
            {
            // InternalS78154S78236.g:1708:1: ( ( rule__EAtom__AtomAssignment_1 ) )
            // InternalS78154S78236.g:1709:2: ( rule__EAtom__AtomAssignment_1 )
            {
             before(grammarAccess.getEAtomAccess().getAtomAssignment_1()); 
            // InternalS78154S78236.g:1710:2: ( rule__EAtom__AtomAssignment_1 )
            // InternalS78154S78236.g:1710:3: rule__EAtom__AtomAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__EAtom__AtomAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEAtomAccess().getAtomAssignment_1()); 

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
    // $ANTLR end "rule__EAtom__Group__1__Impl"


    // $ANTLR start "rule__PrologDsl__ProgramAssignment_0"
    // InternalS78154S78236.g:1719:1: rule__PrologDsl__ProgramAssignment_0 : ( ruleProgram ) ;
    public final void rule__PrologDsl__ProgramAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1723:1: ( ( ruleProgram ) )
            // InternalS78154S78236.g:1724:2: ( ruleProgram )
            {
            // InternalS78154S78236.g:1724:2: ( ruleProgram )
            // InternalS78154S78236.g:1725:3: ruleProgram
            {
             before(grammarAccess.getPrologDslAccess().getProgramProgramParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleProgram();

            state._fsp--;

             after(grammarAccess.getPrologDslAccess().getProgramProgramParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__PrologDsl__ProgramAssignment_0"


    // $ANTLR start "rule__PrologDsl__ExQueryAssignment_1"
    // InternalS78154S78236.g:1734:1: rule__PrologDsl__ExQueryAssignment_1 : ( ruleExquery ) ;
    public final void rule__PrologDsl__ExQueryAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1738:1: ( ( ruleExquery ) )
            // InternalS78154S78236.g:1739:2: ( ruleExquery )
            {
            // InternalS78154S78236.g:1739:2: ( ruleExquery )
            // InternalS78154S78236.g:1740:3: ruleExquery
            {
             before(grammarAccess.getPrologDslAccess().getExQueryExqueryParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExquery();

            state._fsp--;

             after(grammarAccess.getPrologDslAccess().getExQueryExqueryParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__PrologDsl__ExQueryAssignment_1"


    // $ANTLR start "rule__Program__ClausesAssignment"
    // InternalS78154S78236.g:1749:1: rule__Program__ClausesAssignment : ( ruleClause ) ;
    public final void rule__Program__ClausesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1753:1: ( ( ruleClause ) )
            // InternalS78154S78236.g:1754:2: ( ruleClause )
            {
            // InternalS78154S78236.g:1754:2: ( ruleClause )
            // InternalS78154S78236.g:1755:3: ruleClause
            {
             before(grammarAccess.getProgramAccess().getClausesClauseParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleClause();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getClausesClauseParserRuleCall_0()); 

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
    // $ANTLR end "rule__Program__ClausesAssignment"


    // $ANTLR start "rule__Exquery__QueryAssignment_1"
    // InternalS78154S78236.g:1764:1: rule__Exquery__QueryAssignment_1 : ( ruleQuery ) ;
    public final void rule__Exquery__QueryAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1768:1: ( ( ruleQuery ) )
            // InternalS78154S78236.g:1769:2: ( ruleQuery )
            {
            // InternalS78154S78236.g:1769:2: ( ruleQuery )
            // InternalS78154S78236.g:1770:3: ruleQuery
            {
             before(grammarAccess.getExqueryAccess().getQueryQueryParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQuery();

            state._fsp--;

             after(grammarAccess.getExqueryAccess().getQueryQueryParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Exquery__QueryAssignment_1"


    // $ANTLR start "rule__Query__PredicateAssignment_0"
    // InternalS78154S78236.g:1779:1: rule__Query__PredicateAssignment_0 : ( rulePredicate ) ;
    public final void rule__Query__PredicateAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1783:1: ( ( rulePredicate ) )
            // InternalS78154S78236.g:1784:2: ( rulePredicate )
            {
            // InternalS78154S78236.g:1784:2: ( rulePredicate )
            // InternalS78154S78236.g:1785:3: rulePredicate
            {
             before(grammarAccess.getQueryAccess().getPredicatePredicateParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulePredicate();

            state._fsp--;

             after(grammarAccess.getQueryAccess().getPredicatePredicateParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Query__PredicateAssignment_0"


    // $ANTLR start "rule__Query__EpredicatesAssignment_1"
    // InternalS78154S78236.g:1794:1: rule__Query__EpredicatesAssignment_1 : ( ruleEPredicate ) ;
    public final void rule__Query__EpredicatesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1798:1: ( ( ruleEPredicate ) )
            // InternalS78154S78236.g:1799:2: ( ruleEPredicate )
            {
            // InternalS78154S78236.g:1799:2: ( ruleEPredicate )
            // InternalS78154S78236.g:1800:3: ruleEPredicate
            {
             before(grammarAccess.getQueryAccess().getEpredicatesEPredicateParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEPredicate();

            state._fsp--;

             after(grammarAccess.getQueryAccess().getEpredicatesEPredicateParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Query__EpredicatesAssignment_1"


    // $ANTLR start "rule__EPredicate__PredicateAssignment_1"
    // InternalS78154S78236.g:1809:1: rule__EPredicate__PredicateAssignment_1 : ( rulePredicate ) ;
    public final void rule__EPredicate__PredicateAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1813:1: ( ( rulePredicate ) )
            // InternalS78154S78236.g:1814:2: ( rulePredicate )
            {
            // InternalS78154S78236.g:1814:2: ( rulePredicate )
            // InternalS78154S78236.g:1815:3: rulePredicate
            {
             before(grammarAccess.getEPredicateAccess().getPredicatePredicateParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePredicate();

            state._fsp--;

             after(grammarAccess.getEPredicateAccess().getPredicatePredicateParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__EPredicate__PredicateAssignment_1"


    // $ANTLR start "rule__Clause__PredicateAssignment_0"
    // InternalS78154S78236.g:1824:1: rule__Clause__PredicateAssignment_0 : ( rulePredicate ) ;
    public final void rule__Clause__PredicateAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1828:1: ( ( rulePredicate ) )
            // InternalS78154S78236.g:1829:2: ( rulePredicate )
            {
            // InternalS78154S78236.g:1829:2: ( rulePredicate )
            // InternalS78154S78236.g:1830:3: rulePredicate
            {
             before(grammarAccess.getClauseAccess().getPredicatePredicateParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulePredicate();

            state._fsp--;

             after(grammarAccess.getClauseAccess().getPredicatePredicateParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Clause__PredicateAssignment_0"


    // $ANTLR start "rule__Clause__FactAssignment_1_0"
    // InternalS78154S78236.g:1839:1: rule__Clause__FactAssignment_1_0 : ( ruleFact ) ;
    public final void rule__Clause__FactAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1843:1: ( ( ruleFact ) )
            // InternalS78154S78236.g:1844:2: ( ruleFact )
            {
            // InternalS78154S78236.g:1844:2: ( ruleFact )
            // InternalS78154S78236.g:1845:3: ruleFact
            {
             before(grammarAccess.getClauseAccess().getFactFactParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleFact();

            state._fsp--;

             after(grammarAccess.getClauseAccess().getFactFactParserRuleCall_1_0_0()); 

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
    // $ANTLR end "rule__Clause__FactAssignment_1_0"


    // $ANTLR start "rule__Clause__RuleAssignment_1_1"
    // InternalS78154S78236.g:1854:1: rule__Clause__RuleAssignment_1_1 : ( ruleRule ) ;
    public final void rule__Clause__RuleAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1858:1: ( ( ruleRule ) )
            // InternalS78154S78236.g:1859:2: ( ruleRule )
            {
            // InternalS78154S78236.g:1859:2: ( ruleRule )
            // InternalS78154S78236.g:1860:3: ruleRule
            {
             before(grammarAccess.getClauseAccess().getRuleRuleParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getClauseAccess().getRuleRuleParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Clause__RuleAssignment_1_1"


    // $ANTLR start "rule__Rule__QueryAssignment_1"
    // InternalS78154S78236.g:1869:1: rule__Rule__QueryAssignment_1 : ( ruleQuery ) ;
    public final void rule__Rule__QueryAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1873:1: ( ( ruleQuery ) )
            // InternalS78154S78236.g:1874:2: ( ruleQuery )
            {
            // InternalS78154S78236.g:1874:2: ( ruleQuery )
            // InternalS78154S78236.g:1875:3: ruleQuery
            {
             before(grammarAccess.getRuleAccess().getQueryQueryParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQuery();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getQueryQueryParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Rule__QueryAssignment_1"


    // $ANTLR start "rule__Predicate__FunctorAssignment_0"
    // InternalS78154S78236.g:1884:1: rule__Predicate__FunctorAssignment_0 : ( ruleFunctor ) ;
    public final void rule__Predicate__FunctorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1888:1: ( ( ruleFunctor ) )
            // InternalS78154S78236.g:1889:2: ( ruleFunctor )
            {
            // InternalS78154S78236.g:1889:2: ( ruleFunctor )
            // InternalS78154S78236.g:1890:3: ruleFunctor
            {
             before(grammarAccess.getPredicateAccess().getFunctorFunctorParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleFunctor();

            state._fsp--;

             after(grammarAccess.getPredicateAccess().getFunctorFunctorParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Predicate__FunctorAssignment_0"


    // $ANTLR start "rule__Predicate__TermAssignment_2"
    // InternalS78154S78236.g:1899:1: rule__Predicate__TermAssignment_2 : ( ruleTerm ) ;
    public final void rule__Predicate__TermAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1903:1: ( ( ruleTerm ) )
            // InternalS78154S78236.g:1904:2: ( ruleTerm )
            {
            // InternalS78154S78236.g:1904:2: ( ruleTerm )
            // InternalS78154S78236.g:1905:3: ruleTerm
            {
             before(grammarAccess.getPredicateAccess().getTermTermParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTerm();

            state._fsp--;

             after(grammarAccess.getPredicateAccess().getTermTermParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Predicate__TermAssignment_2"


    // $ANTLR start "rule__Predicate__EtermsAssignment_3"
    // InternalS78154S78236.g:1914:1: rule__Predicate__EtermsAssignment_3 : ( ruleETerm ) ;
    public final void rule__Predicate__EtermsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1918:1: ( ( ruleETerm ) )
            // InternalS78154S78236.g:1919:2: ( ruleETerm )
            {
            // InternalS78154S78236.g:1919:2: ( ruleETerm )
            // InternalS78154S78236.g:1920:3: ruleETerm
            {
             before(grammarAccess.getPredicateAccess().getEtermsETermParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleETerm();

            state._fsp--;

             after(grammarAccess.getPredicateAccess().getEtermsETermParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Predicate__EtermsAssignment_3"


    // $ANTLR start "rule__Functor__IdentAssignment"
    // InternalS78154S78236.g:1929:1: rule__Functor__IdentAssignment : ( ruleIdent ) ;
    public final void rule__Functor__IdentAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1933:1: ( ( ruleIdent ) )
            // InternalS78154S78236.g:1934:2: ( ruleIdent )
            {
            // InternalS78154S78236.g:1934:2: ( ruleIdent )
            // InternalS78154S78236.g:1935:3: ruleIdent
            {
             before(grammarAccess.getFunctorAccess().getIdentIdentParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleIdent();

            state._fsp--;

             after(grammarAccess.getFunctorAccess().getIdentIdentParserRuleCall_0()); 

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
    // $ANTLR end "rule__Functor__IdentAssignment"


    // $ANTLR start "rule__Term__AtomAssignment_0"
    // InternalS78154S78236.g:1944:1: rule__Term__AtomAssignment_0 : ( ruleAtom ) ;
    public final void rule__Term__AtomAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1948:1: ( ( ruleAtom ) )
            // InternalS78154S78236.g:1949:2: ( ruleAtom )
            {
            // InternalS78154S78236.g:1949:2: ( ruleAtom )
            // InternalS78154S78236.g:1950:3: ruleAtom
            {
             before(grammarAccess.getTermAccess().getAtomAtomParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAtom();

            state._fsp--;

             after(grammarAccess.getTermAccess().getAtomAtomParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Term__AtomAssignment_0"


    // $ANTLR start "rule__Term__ListAssignment_1"
    // InternalS78154S78236.g:1959:1: rule__Term__ListAssignment_1 : ( ruleList ) ;
    public final void rule__Term__ListAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1963:1: ( ( ruleList ) )
            // InternalS78154S78236.g:1964:2: ( ruleList )
            {
            // InternalS78154S78236.g:1964:2: ( ruleList )
            // InternalS78154S78236.g:1965:3: ruleList
            {
             before(grammarAccess.getTermAccess().getListListParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleList();

            state._fsp--;

             after(grammarAccess.getTermAccess().getListListParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Term__ListAssignment_1"


    // $ANTLR start "rule__ETerm__TermAssignment_1"
    // InternalS78154S78236.g:1974:1: rule__ETerm__TermAssignment_1 : ( ruleTerm ) ;
    public final void rule__ETerm__TermAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1978:1: ( ( ruleTerm ) )
            // InternalS78154S78236.g:1979:2: ( ruleTerm )
            {
            // InternalS78154S78236.g:1979:2: ( ruleTerm )
            // InternalS78154S78236.g:1980:3: ruleTerm
            {
             before(grammarAccess.getETermAccess().getTermTermParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTerm();

            state._fsp--;

             after(grammarAccess.getETermAccess().getTermTermParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__ETerm__TermAssignment_1"


    // $ANTLR start "rule__Atom__IdentAssignment_0"
    // InternalS78154S78236.g:1989:1: rule__Atom__IdentAssignment_0 : ( ruleIdent ) ;
    public final void rule__Atom__IdentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1993:1: ( ( ruleIdent ) )
            // InternalS78154S78236.g:1994:2: ( ruleIdent )
            {
            // InternalS78154S78236.g:1994:2: ( ruleIdent )
            // InternalS78154S78236.g:1995:3: ruleIdent
            {
             before(grammarAccess.getAtomAccess().getIdentIdentParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleIdent();

            state._fsp--;

             after(grammarAccess.getAtomAccess().getIdentIdentParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Atom__IdentAssignment_0"


    // $ANTLR start "rule__Atom__NumberAssignment_1"
    // InternalS78154S78236.g:2004:1: rule__Atom__NumberAssignment_1 : ( RULE_NUMBER ) ;
    public final void rule__Atom__NumberAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:2008:1: ( ( RULE_NUMBER ) )
            // InternalS78154S78236.g:2009:2: ( RULE_NUMBER )
            {
            // InternalS78154S78236.g:2009:2: ( RULE_NUMBER )
            // InternalS78154S78236.g:2010:3: RULE_NUMBER
            {
             before(grammarAccess.getAtomAccess().getNumberNUMBERTerminalRuleCall_1_0()); 
            match(input,RULE_NUMBER,FOLLOW_2); 
             after(grammarAccess.getAtomAccess().getNumberNUMBERTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Atom__NumberAssignment_1"


    // $ANTLR start "rule__Atom__EvarAssignment_2"
    // InternalS78154S78236.g:2019:1: rule__Atom__EvarAssignment_2 : ( ruleEVar ) ;
    public final void rule__Atom__EvarAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:2023:1: ( ( ruleEVar ) )
            // InternalS78154S78236.g:2024:2: ( ruleEVar )
            {
            // InternalS78154S78236.g:2024:2: ( ruleEVar )
            // InternalS78154S78236.g:2025:3: ruleEVar
            {
             before(grammarAccess.getAtomAccess().getEvarEVarParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEVar();

            state._fsp--;

             after(grammarAccess.getAtomAccess().getEvarEVarParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Atom__EvarAssignment_2"


    // $ANTLR start "rule__List__EmptyAssignment_0"
    // InternalS78154S78236.g:2034:1: rule__List__EmptyAssignment_0 : ( ruleEmptyList ) ;
    public final void rule__List__EmptyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:2038:1: ( ( ruleEmptyList ) )
            // InternalS78154S78236.g:2039:2: ( ruleEmptyList )
            {
            // InternalS78154S78236.g:2039:2: ( ruleEmptyList )
            // InternalS78154S78236.g:2040:3: ruleEmptyList
            {
             before(grammarAccess.getListAccess().getEmptyEmptyListParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEmptyList();

            state._fsp--;

             after(grammarAccess.getListAccess().getEmptyEmptyListParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__List__EmptyAssignment_0"


    // $ANTLR start "rule__List__NonEmptyListAssignment_1"
    // InternalS78154S78236.g:2049:1: rule__List__NonEmptyListAssignment_1 : ( ruleNonEmptyList ) ;
    public final void rule__List__NonEmptyListAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:2053:1: ( ( ruleNonEmptyList ) )
            // InternalS78154S78236.g:2054:2: ( ruleNonEmptyList )
            {
            // InternalS78154S78236.g:2054:2: ( ruleNonEmptyList )
            // InternalS78154S78236.g:2055:3: ruleNonEmptyList
            {
             before(grammarAccess.getListAccess().getNonEmptyListNonEmptyListParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNonEmptyList();

            state._fsp--;

             after(grammarAccess.getListAccess().getNonEmptyListNonEmptyListParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__List__NonEmptyListAssignment_1"


    // $ANTLR start "rule__NonEmptyList__EfolgeAssignment_0"
    // InternalS78154S78236.g:2064:1: rule__NonEmptyList__EfolgeAssignment_0 : ( ruleEFolge ) ;
    public final void rule__NonEmptyList__EfolgeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:2068:1: ( ( ruleEFolge ) )
            // InternalS78154S78236.g:2069:2: ( ruleEFolge )
            {
            // InternalS78154S78236.g:2069:2: ( ruleEFolge )
            // InternalS78154S78236.g:2070:3: ruleEFolge
            {
             before(grammarAccess.getNonEmptyListAccess().getEfolgeEFolgeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEFolge();

            state._fsp--;

             after(grammarAccess.getNonEmptyListAccess().getEfolgeEFolgeParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__NonEmptyList__EfolgeAssignment_0"


    // $ANTLR start "rule__NonEmptyList__ElistAssignment_1"
    // InternalS78154S78236.g:2079:1: rule__NonEmptyList__ElistAssignment_1 : ( ruleEList ) ;
    public final void rule__NonEmptyList__ElistAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:2083:1: ( ( ruleEList ) )
            // InternalS78154S78236.g:2084:2: ( ruleEList )
            {
            // InternalS78154S78236.g:2084:2: ( ruleEList )
            // InternalS78154S78236.g:2085:3: ruleEList
            {
             before(grammarAccess.getNonEmptyListAccess().getElistEListParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEList();

            state._fsp--;

             after(grammarAccess.getNonEmptyListAccess().getElistEListParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__NonEmptyList__ElistAssignment_1"


    // $ANTLR start "rule__Folge__AtomAssignment_0"
    // InternalS78154S78236.g:2094:1: rule__Folge__AtomAssignment_0 : ( ruleAtom ) ;
    public final void rule__Folge__AtomAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:2098:1: ( ( ruleAtom ) )
            // InternalS78154S78236.g:2099:2: ( ruleAtom )
            {
            // InternalS78154S78236.g:2099:2: ( ruleAtom )
            // InternalS78154S78236.g:2100:3: ruleAtom
            {
             before(grammarAccess.getFolgeAccess().getAtomAtomParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAtom();

            state._fsp--;

             after(grammarAccess.getFolgeAccess().getAtomAtomParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Folge__AtomAssignment_0"


    // $ANTLR start "rule__Folge__EatomsAssignment_1"
    // InternalS78154S78236.g:2109:1: rule__Folge__EatomsAssignment_1 : ( ruleEAtom ) ;
    public final void rule__Folge__EatomsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:2113:1: ( ( ruleEAtom ) )
            // InternalS78154S78236.g:2114:2: ( ruleEAtom )
            {
            // InternalS78154S78236.g:2114:2: ( ruleEAtom )
            // InternalS78154S78236.g:2115:3: ruleEAtom
            {
             before(grammarAccess.getFolgeAccess().getEatomsEAtomParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEAtom();

            state._fsp--;

             after(grammarAccess.getFolgeAccess().getEatomsEAtomParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Folge__EatomsAssignment_1"


    // $ANTLR start "rule__EFolge__FolgeAssignment_1"
    // InternalS78154S78236.g:2124:1: rule__EFolge__FolgeAssignment_1 : ( ruleFolge ) ;
    public final void rule__EFolge__FolgeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:2128:1: ( ( ruleFolge ) )
            // InternalS78154S78236.g:2129:2: ( ruleFolge )
            {
            // InternalS78154S78236.g:2129:2: ( ruleFolge )
            // InternalS78154S78236.g:2130:3: ruleFolge
            {
             before(grammarAccess.getEFolgeAccess().getFolgeFolgeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFolge();

            state._fsp--;

             after(grammarAccess.getEFolgeAccess().getFolgeFolgeParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__EFolge__FolgeAssignment_1"


    // $ANTLR start "rule__EList__AtomAssignment_1"
    // InternalS78154S78236.g:2139:1: rule__EList__AtomAssignment_1 : ( ruleAtom ) ;
    public final void rule__EList__AtomAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:2143:1: ( ( ruleAtom ) )
            // InternalS78154S78236.g:2144:2: ( ruleAtom )
            {
            // InternalS78154S78236.g:2144:2: ( ruleAtom )
            // InternalS78154S78236.g:2145:3: ruleAtom
            {
             before(grammarAccess.getEListAccess().getAtomAtomParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAtom();

            state._fsp--;

             after(grammarAccess.getEListAccess().getAtomAtomParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__EList__AtomAssignment_1"


    // $ANTLR start "rule__EList__TermAssignment_3"
    // InternalS78154S78236.g:2154:1: rule__EList__TermAssignment_3 : ( ruleTerm ) ;
    public final void rule__EList__TermAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:2158:1: ( ( ruleTerm ) )
            // InternalS78154S78236.g:2159:2: ( ruleTerm )
            {
            // InternalS78154S78236.g:2159:2: ( ruleTerm )
            // InternalS78154S78236.g:2160:3: ruleTerm
            {
             before(grammarAccess.getEListAccess().getTermTermParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleTerm();

            state._fsp--;

             after(grammarAccess.getEListAccess().getTermTermParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__EList__TermAssignment_3"


    // $ANTLR start "rule__EAtom__AtomAssignment_1"
    // InternalS78154S78236.g:2169:1: rule__EAtom__AtomAssignment_1 : ( ruleAtom ) ;
    public final void rule__EAtom__AtomAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:2173:1: ( ( ruleAtom ) )
            // InternalS78154S78236.g:2174:2: ( ruleAtom )
            {
            // InternalS78154S78236.g:2174:2: ( ruleAtom )
            // InternalS78154S78236.g:2175:3: ruleAtom
            {
             before(grammarAccess.getEAtomAccess().getAtomAtomParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAtom();

            state._fsp--;

             after(grammarAccess.getEAtomAccess().getAtomAtomParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__EAtom__AtomAssignment_1"


    // $ANTLR start "rule__Ident__IdentAssignment"
    // InternalS78154S78236.g:2184:1: rule__Ident__IdentAssignment : ( RULE_ID ) ;
    public final void rule__Ident__IdentAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:2188:1: ( ( RULE_ID ) )
            // InternalS78154S78236.g:2189:2: ( RULE_ID )
            {
            // InternalS78154S78236.g:2189:2: ( RULE_ID )
            // InternalS78154S78236.g:2190:3: RULE_ID
            {
             before(grammarAccess.getIdentAccess().getIdentIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getIdentAccess().getIdentIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Ident__IdentAssignment"


    // $ANTLR start "rule__EVar__VariableAssignment"
    // InternalS78154S78236.g:2199:1: rule__EVar__VariableAssignment : ( RULE_VARIABLE ) ;
    public final void rule__EVar__VariableAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:2203:1: ( ( RULE_VARIABLE ) )
            // InternalS78154S78236.g:2204:2: ( RULE_VARIABLE )
            {
            // InternalS78154S78236.g:2204:2: ( RULE_VARIABLE )
            // InternalS78154S78236.g:2205:3: RULE_VARIABLE
            {
             before(grammarAccess.getEVarAccess().getVariableVARIABLETerminalRuleCall_0()); 
            match(input,RULE_VARIABLE,FOLLOW_2); 
             after(grammarAccess.getEVarAccess().getVariableVARIABLETerminalRuleCall_0()); 

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
    // $ANTLR end "rule__EVar__VariableAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000180070L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});

}