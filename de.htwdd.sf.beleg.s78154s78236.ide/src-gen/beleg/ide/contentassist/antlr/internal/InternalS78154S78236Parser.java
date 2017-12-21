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



    // $ANTLR start "entryRuleModel"
    // InternalS78154S78236.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalS78154S78236.g:54:1: ( ruleModel EOF )
            // InternalS78154S78236.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalS78154S78236.g:62:1: ruleModel : ( ( rule__Model__ModelAssignment ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:66:2: ( ( ( rule__Model__ModelAssignment ) ) )
            // InternalS78154S78236.g:67:2: ( ( rule__Model__ModelAssignment ) )
            {
            // InternalS78154S78236.g:67:2: ( ( rule__Model__ModelAssignment ) )
            // InternalS78154S78236.g:68:3: ( rule__Model__ModelAssignment )
            {
             before(grammarAccess.getModelAccess().getModelAssignment()); 
            // InternalS78154S78236.g:69:3: ( rule__Model__ModelAssignment )
            // InternalS78154S78236.g:69:4: rule__Model__ModelAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Model__ModelAssignment();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getModelAssignment()); 

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


    // $ANTLR start "entryRulePrologDsl"
    // InternalS78154S78236.g:78:1: entryRulePrologDsl : rulePrologDsl EOF ;
    public final void entryRulePrologDsl() throws RecognitionException {
        try {
            // InternalS78154S78236.g:79:1: ( rulePrologDsl EOF )
            // InternalS78154S78236.g:80:1: rulePrologDsl EOF
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
    // InternalS78154S78236.g:87:1: rulePrologDsl : ( ( rule__PrologDsl__Group__0 ) ) ;
    public final void rulePrologDsl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:91:2: ( ( ( rule__PrologDsl__Group__0 ) ) )
            // InternalS78154S78236.g:92:2: ( ( rule__PrologDsl__Group__0 ) )
            {
            // InternalS78154S78236.g:92:2: ( ( rule__PrologDsl__Group__0 ) )
            // InternalS78154S78236.g:93:3: ( rule__PrologDsl__Group__0 )
            {
             before(grammarAccess.getPrologDslAccess().getGroup()); 
            // InternalS78154S78236.g:94:3: ( rule__PrologDsl__Group__0 )
            // InternalS78154S78236.g:94:4: rule__PrologDsl__Group__0
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
    // InternalS78154S78236.g:103:1: entryRuleProgram : ruleProgram EOF ;
    public final void entryRuleProgram() throws RecognitionException {
        try {
            // InternalS78154S78236.g:104:1: ( ruleProgram EOF )
            // InternalS78154S78236.g:105:1: ruleProgram EOF
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
    // InternalS78154S78236.g:112:1: ruleProgram : ( ( ( rule__Program__ClausesAssignment ) ) ( ( rule__Program__ClausesAssignment )* ) ) ;
    public final void ruleProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:116:2: ( ( ( ( rule__Program__ClausesAssignment ) ) ( ( rule__Program__ClausesAssignment )* ) ) )
            // InternalS78154S78236.g:117:2: ( ( ( rule__Program__ClausesAssignment ) ) ( ( rule__Program__ClausesAssignment )* ) )
            {
            // InternalS78154S78236.g:117:2: ( ( ( rule__Program__ClausesAssignment ) ) ( ( rule__Program__ClausesAssignment )* ) )
            // InternalS78154S78236.g:118:3: ( ( rule__Program__ClausesAssignment ) ) ( ( rule__Program__ClausesAssignment )* )
            {
            // InternalS78154S78236.g:118:3: ( ( rule__Program__ClausesAssignment ) )
            // InternalS78154S78236.g:119:4: ( rule__Program__ClausesAssignment )
            {
             before(grammarAccess.getProgramAccess().getClausesAssignment()); 
            // InternalS78154S78236.g:120:4: ( rule__Program__ClausesAssignment )
            // InternalS78154S78236.g:120:5: rule__Program__ClausesAssignment
            {
            pushFollow(FOLLOW_3);
            rule__Program__ClausesAssignment();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getClausesAssignment()); 

            }

            // InternalS78154S78236.g:123:3: ( ( rule__Program__ClausesAssignment )* )
            // InternalS78154S78236.g:124:4: ( rule__Program__ClausesAssignment )*
            {
             before(grammarAccess.getProgramAccess().getClausesAssignment()); 
            // InternalS78154S78236.g:125:4: ( rule__Program__ClausesAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalS78154S78236.g:125:5: rule__Program__ClausesAssignment
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
    // InternalS78154S78236.g:135:1: entryRuleExquery : ruleExquery EOF ;
    public final void entryRuleExquery() throws RecognitionException {
        try {
            // InternalS78154S78236.g:136:1: ( ruleExquery EOF )
            // InternalS78154S78236.g:137:1: ruleExquery EOF
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
    // InternalS78154S78236.g:144:1: ruleExquery : ( ( rule__Exquery__Group__0 ) ) ;
    public final void ruleExquery() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:148:2: ( ( ( rule__Exquery__Group__0 ) ) )
            // InternalS78154S78236.g:149:2: ( ( rule__Exquery__Group__0 ) )
            {
            // InternalS78154S78236.g:149:2: ( ( rule__Exquery__Group__0 ) )
            // InternalS78154S78236.g:150:3: ( rule__Exquery__Group__0 )
            {
             before(grammarAccess.getExqueryAccess().getGroup()); 
            // InternalS78154S78236.g:151:3: ( rule__Exquery__Group__0 )
            // InternalS78154S78236.g:151:4: rule__Exquery__Group__0
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
    // InternalS78154S78236.g:160:1: entryRuleQuery : ruleQuery EOF ;
    public final void entryRuleQuery() throws RecognitionException {
        try {
            // InternalS78154S78236.g:161:1: ( ruleQuery EOF )
            // InternalS78154S78236.g:162:1: ruleQuery EOF
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
    // InternalS78154S78236.g:169:1: ruleQuery : ( ( rule__Query__Group__0 ) ) ;
    public final void ruleQuery() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:173:2: ( ( ( rule__Query__Group__0 ) ) )
            // InternalS78154S78236.g:174:2: ( ( rule__Query__Group__0 ) )
            {
            // InternalS78154S78236.g:174:2: ( ( rule__Query__Group__0 ) )
            // InternalS78154S78236.g:175:3: ( rule__Query__Group__0 )
            {
             before(grammarAccess.getQueryAccess().getGroup()); 
            // InternalS78154S78236.g:176:3: ( rule__Query__Group__0 )
            // InternalS78154S78236.g:176:4: rule__Query__Group__0
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
    // InternalS78154S78236.g:185:1: entryRuleEPredicate : ruleEPredicate EOF ;
    public final void entryRuleEPredicate() throws RecognitionException {
        try {
            // InternalS78154S78236.g:186:1: ( ruleEPredicate EOF )
            // InternalS78154S78236.g:187:1: ruleEPredicate EOF
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
    // InternalS78154S78236.g:194:1: ruleEPredicate : ( ( rule__EPredicate__Group__0 ) ) ;
    public final void ruleEPredicate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:198:2: ( ( ( rule__EPredicate__Group__0 ) ) )
            // InternalS78154S78236.g:199:2: ( ( rule__EPredicate__Group__0 ) )
            {
            // InternalS78154S78236.g:199:2: ( ( rule__EPredicate__Group__0 ) )
            // InternalS78154S78236.g:200:3: ( rule__EPredicate__Group__0 )
            {
             before(grammarAccess.getEPredicateAccess().getGroup()); 
            // InternalS78154S78236.g:201:3: ( rule__EPredicate__Group__0 )
            // InternalS78154S78236.g:201:4: rule__EPredicate__Group__0
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
    // InternalS78154S78236.g:210:1: entryRuleClause : ruleClause EOF ;
    public final void entryRuleClause() throws RecognitionException {
        try {
            // InternalS78154S78236.g:211:1: ( ruleClause EOF )
            // InternalS78154S78236.g:212:1: ruleClause EOF
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
    // InternalS78154S78236.g:219:1: ruleClause : ( ( rule__Clause__Group__0 ) ) ;
    public final void ruleClause() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:223:2: ( ( ( rule__Clause__Group__0 ) ) )
            // InternalS78154S78236.g:224:2: ( ( rule__Clause__Group__0 ) )
            {
            // InternalS78154S78236.g:224:2: ( ( rule__Clause__Group__0 ) )
            // InternalS78154S78236.g:225:3: ( rule__Clause__Group__0 )
            {
             before(grammarAccess.getClauseAccess().getGroup()); 
            // InternalS78154S78236.g:226:3: ( rule__Clause__Group__0 )
            // InternalS78154S78236.g:226:4: rule__Clause__Group__0
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
    // InternalS78154S78236.g:235:1: entryRuleFact : ruleFact EOF ;
    public final void entryRuleFact() throws RecognitionException {
        try {
            // InternalS78154S78236.g:236:1: ( ruleFact EOF )
            // InternalS78154S78236.g:237:1: ruleFact EOF
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
    // InternalS78154S78236.g:244:1: ruleFact : ( ( rule__Fact__FactAssignment ) ) ;
    public final void ruleFact() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:248:2: ( ( ( rule__Fact__FactAssignment ) ) )
            // InternalS78154S78236.g:249:2: ( ( rule__Fact__FactAssignment ) )
            {
            // InternalS78154S78236.g:249:2: ( ( rule__Fact__FactAssignment ) )
            // InternalS78154S78236.g:250:3: ( rule__Fact__FactAssignment )
            {
             before(grammarAccess.getFactAccess().getFactAssignment()); 
            // InternalS78154S78236.g:251:3: ( rule__Fact__FactAssignment )
            // InternalS78154S78236.g:251:4: rule__Fact__FactAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Fact__FactAssignment();

            state._fsp--;


            }

             after(grammarAccess.getFactAccess().getFactAssignment()); 

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
    // InternalS78154S78236.g:260:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // InternalS78154S78236.g:261:1: ( ruleRule EOF )
            // InternalS78154S78236.g:262:1: ruleRule EOF
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
    // InternalS78154S78236.g:269:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:273:2: ( ( ( rule__Rule__Group__0 ) ) )
            // InternalS78154S78236.g:274:2: ( ( rule__Rule__Group__0 ) )
            {
            // InternalS78154S78236.g:274:2: ( ( rule__Rule__Group__0 ) )
            // InternalS78154S78236.g:275:3: ( rule__Rule__Group__0 )
            {
             before(grammarAccess.getRuleAccess().getGroup()); 
            // InternalS78154S78236.g:276:3: ( rule__Rule__Group__0 )
            // InternalS78154S78236.g:276:4: rule__Rule__Group__0
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
    // InternalS78154S78236.g:285:1: entryRulePredicate : rulePredicate EOF ;
    public final void entryRulePredicate() throws RecognitionException {
        try {
            // InternalS78154S78236.g:286:1: ( rulePredicate EOF )
            // InternalS78154S78236.g:287:1: rulePredicate EOF
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
    // InternalS78154S78236.g:294:1: rulePredicate : ( ( rule__Predicate__Group__0 ) ) ;
    public final void rulePredicate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:298:2: ( ( ( rule__Predicate__Group__0 ) ) )
            // InternalS78154S78236.g:299:2: ( ( rule__Predicate__Group__0 ) )
            {
            // InternalS78154S78236.g:299:2: ( ( rule__Predicate__Group__0 ) )
            // InternalS78154S78236.g:300:3: ( rule__Predicate__Group__0 )
            {
             before(grammarAccess.getPredicateAccess().getGroup()); 
            // InternalS78154S78236.g:301:3: ( rule__Predicate__Group__0 )
            // InternalS78154S78236.g:301:4: rule__Predicate__Group__0
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
    // InternalS78154S78236.g:310:1: entryRuleFunctor : ruleFunctor EOF ;
    public final void entryRuleFunctor() throws RecognitionException {
        try {
            // InternalS78154S78236.g:311:1: ( ruleFunctor EOF )
            // InternalS78154S78236.g:312:1: ruleFunctor EOF
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
    // InternalS78154S78236.g:319:1: ruleFunctor : ( ( rule__Functor__IdentAssignment ) ) ;
    public final void ruleFunctor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:323:2: ( ( ( rule__Functor__IdentAssignment ) ) )
            // InternalS78154S78236.g:324:2: ( ( rule__Functor__IdentAssignment ) )
            {
            // InternalS78154S78236.g:324:2: ( ( rule__Functor__IdentAssignment ) )
            // InternalS78154S78236.g:325:3: ( rule__Functor__IdentAssignment )
            {
             before(grammarAccess.getFunctorAccess().getIdentAssignment()); 
            // InternalS78154S78236.g:326:3: ( rule__Functor__IdentAssignment )
            // InternalS78154S78236.g:326:4: rule__Functor__IdentAssignment
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
    // InternalS78154S78236.g:335:1: entryRuleTerm : ruleTerm EOF ;
    public final void entryRuleTerm() throws RecognitionException {
        try {
            // InternalS78154S78236.g:336:1: ( ruleTerm EOF )
            // InternalS78154S78236.g:337:1: ruleTerm EOF
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
    // InternalS78154S78236.g:344:1: ruleTerm : ( ( rule__Term__Alternatives ) ) ;
    public final void ruleTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:348:2: ( ( ( rule__Term__Alternatives ) ) )
            // InternalS78154S78236.g:349:2: ( ( rule__Term__Alternatives ) )
            {
            // InternalS78154S78236.g:349:2: ( ( rule__Term__Alternatives ) )
            // InternalS78154S78236.g:350:3: ( rule__Term__Alternatives )
            {
             before(grammarAccess.getTermAccess().getAlternatives()); 
            // InternalS78154S78236.g:351:3: ( rule__Term__Alternatives )
            // InternalS78154S78236.g:351:4: rule__Term__Alternatives
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
    // InternalS78154S78236.g:360:1: entryRuleETerm : ruleETerm EOF ;
    public final void entryRuleETerm() throws RecognitionException {
        try {
            // InternalS78154S78236.g:361:1: ( ruleETerm EOF )
            // InternalS78154S78236.g:362:1: ruleETerm EOF
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
    // InternalS78154S78236.g:369:1: ruleETerm : ( ( rule__ETerm__Group__0 ) ) ;
    public final void ruleETerm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:373:2: ( ( ( rule__ETerm__Group__0 ) ) )
            // InternalS78154S78236.g:374:2: ( ( rule__ETerm__Group__0 ) )
            {
            // InternalS78154S78236.g:374:2: ( ( rule__ETerm__Group__0 ) )
            // InternalS78154S78236.g:375:3: ( rule__ETerm__Group__0 )
            {
             before(grammarAccess.getETermAccess().getGroup()); 
            // InternalS78154S78236.g:376:3: ( rule__ETerm__Group__0 )
            // InternalS78154S78236.g:376:4: rule__ETerm__Group__0
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
    // InternalS78154S78236.g:385:1: entryRuleAtom : ruleAtom EOF ;
    public final void entryRuleAtom() throws RecognitionException {
        try {
            // InternalS78154S78236.g:386:1: ( ruleAtom EOF )
            // InternalS78154S78236.g:387:1: ruleAtom EOF
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
    // InternalS78154S78236.g:394:1: ruleAtom : ( ( rule__Atom__Alternatives ) ) ;
    public final void ruleAtom() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:398:2: ( ( ( rule__Atom__Alternatives ) ) )
            // InternalS78154S78236.g:399:2: ( ( rule__Atom__Alternatives ) )
            {
            // InternalS78154S78236.g:399:2: ( ( rule__Atom__Alternatives ) )
            // InternalS78154S78236.g:400:3: ( rule__Atom__Alternatives )
            {
             before(grammarAccess.getAtomAccess().getAlternatives()); 
            // InternalS78154S78236.g:401:3: ( rule__Atom__Alternatives )
            // InternalS78154S78236.g:401:4: rule__Atom__Alternatives
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
    // InternalS78154S78236.g:410:1: entryRuleList : ruleList EOF ;
    public final void entryRuleList() throws RecognitionException {
        try {
            // InternalS78154S78236.g:411:1: ( ruleList EOF )
            // InternalS78154S78236.g:412:1: ruleList EOF
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
    // InternalS78154S78236.g:419:1: ruleList : ( ( rule__List__Alternatives ) ) ;
    public final void ruleList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:423:2: ( ( ( rule__List__Alternatives ) ) )
            // InternalS78154S78236.g:424:2: ( ( rule__List__Alternatives ) )
            {
            // InternalS78154S78236.g:424:2: ( ( rule__List__Alternatives ) )
            // InternalS78154S78236.g:425:3: ( rule__List__Alternatives )
            {
             before(grammarAccess.getListAccess().getAlternatives()); 
            // InternalS78154S78236.g:426:3: ( rule__List__Alternatives )
            // InternalS78154S78236.g:426:4: rule__List__Alternatives
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
    // InternalS78154S78236.g:435:1: entryRuleEmptyList : ruleEmptyList EOF ;
    public final void entryRuleEmptyList() throws RecognitionException {
        try {
            // InternalS78154S78236.g:436:1: ( ruleEmptyList EOF )
            // InternalS78154S78236.g:437:1: ruleEmptyList EOF
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
    // InternalS78154S78236.g:444:1: ruleEmptyList : ( ( rule__EmptyList__Group__0 ) ) ;
    public final void ruleEmptyList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:448:2: ( ( ( rule__EmptyList__Group__0 ) ) )
            // InternalS78154S78236.g:449:2: ( ( rule__EmptyList__Group__0 ) )
            {
            // InternalS78154S78236.g:449:2: ( ( rule__EmptyList__Group__0 ) )
            // InternalS78154S78236.g:450:3: ( rule__EmptyList__Group__0 )
            {
             before(grammarAccess.getEmptyListAccess().getGroup()); 
            // InternalS78154S78236.g:451:3: ( rule__EmptyList__Group__0 )
            // InternalS78154S78236.g:451:4: rule__EmptyList__Group__0
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
    // InternalS78154S78236.g:460:1: entryRuleNonEmptyList : ruleNonEmptyList EOF ;
    public final void entryRuleNonEmptyList() throws RecognitionException {
        try {
            // InternalS78154S78236.g:461:1: ( ruleNonEmptyList EOF )
            // InternalS78154S78236.g:462:1: ruleNonEmptyList EOF
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
    // InternalS78154S78236.g:469:1: ruleNonEmptyList : ( ( rule__NonEmptyList__Alternatives ) ) ;
    public final void ruleNonEmptyList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:473:2: ( ( ( rule__NonEmptyList__Alternatives ) ) )
            // InternalS78154S78236.g:474:2: ( ( rule__NonEmptyList__Alternatives ) )
            {
            // InternalS78154S78236.g:474:2: ( ( rule__NonEmptyList__Alternatives ) )
            // InternalS78154S78236.g:475:3: ( rule__NonEmptyList__Alternatives )
            {
             before(grammarAccess.getNonEmptyListAccess().getAlternatives()); 
            // InternalS78154S78236.g:476:3: ( rule__NonEmptyList__Alternatives )
            // InternalS78154S78236.g:476:4: rule__NonEmptyList__Alternatives
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
    // InternalS78154S78236.g:485:1: entryRuleFolge : ruleFolge EOF ;
    public final void entryRuleFolge() throws RecognitionException {
        try {
            // InternalS78154S78236.g:486:1: ( ruleFolge EOF )
            // InternalS78154S78236.g:487:1: ruleFolge EOF
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
    // InternalS78154S78236.g:494:1: ruleFolge : ( ( rule__Folge__Group__0 ) ) ;
    public final void ruleFolge() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:498:2: ( ( ( rule__Folge__Group__0 ) ) )
            // InternalS78154S78236.g:499:2: ( ( rule__Folge__Group__0 ) )
            {
            // InternalS78154S78236.g:499:2: ( ( rule__Folge__Group__0 ) )
            // InternalS78154S78236.g:500:3: ( rule__Folge__Group__0 )
            {
             before(grammarAccess.getFolgeAccess().getGroup()); 
            // InternalS78154S78236.g:501:3: ( rule__Folge__Group__0 )
            // InternalS78154S78236.g:501:4: rule__Folge__Group__0
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
    // InternalS78154S78236.g:510:1: entryRuleEFolge : ruleEFolge EOF ;
    public final void entryRuleEFolge() throws RecognitionException {
        try {
            // InternalS78154S78236.g:511:1: ( ruleEFolge EOF )
            // InternalS78154S78236.g:512:1: ruleEFolge EOF
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
    // InternalS78154S78236.g:519:1: ruleEFolge : ( ( rule__EFolge__Group__0 ) ) ;
    public final void ruleEFolge() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:523:2: ( ( ( rule__EFolge__Group__0 ) ) )
            // InternalS78154S78236.g:524:2: ( ( rule__EFolge__Group__0 ) )
            {
            // InternalS78154S78236.g:524:2: ( ( rule__EFolge__Group__0 ) )
            // InternalS78154S78236.g:525:3: ( rule__EFolge__Group__0 )
            {
             before(grammarAccess.getEFolgeAccess().getGroup()); 
            // InternalS78154S78236.g:526:3: ( rule__EFolge__Group__0 )
            // InternalS78154S78236.g:526:4: rule__EFolge__Group__0
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
    // InternalS78154S78236.g:535:1: entryRuleEList : ruleEList EOF ;
    public final void entryRuleEList() throws RecognitionException {
        try {
            // InternalS78154S78236.g:536:1: ( ruleEList EOF )
            // InternalS78154S78236.g:537:1: ruleEList EOF
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
    // InternalS78154S78236.g:544:1: ruleEList : ( ( rule__EList__Group__0 ) ) ;
    public final void ruleEList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:548:2: ( ( ( rule__EList__Group__0 ) ) )
            // InternalS78154S78236.g:549:2: ( ( rule__EList__Group__0 ) )
            {
            // InternalS78154S78236.g:549:2: ( ( rule__EList__Group__0 ) )
            // InternalS78154S78236.g:550:3: ( rule__EList__Group__0 )
            {
             before(grammarAccess.getEListAccess().getGroup()); 
            // InternalS78154S78236.g:551:3: ( rule__EList__Group__0 )
            // InternalS78154S78236.g:551:4: rule__EList__Group__0
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
    // InternalS78154S78236.g:560:1: entryRuleEAtom : ruleEAtom EOF ;
    public final void entryRuleEAtom() throws RecognitionException {
        try {
            // InternalS78154S78236.g:561:1: ( ruleEAtom EOF )
            // InternalS78154S78236.g:562:1: ruleEAtom EOF
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
    // InternalS78154S78236.g:569:1: ruleEAtom : ( ( rule__EAtom__Group__0 ) ) ;
    public final void ruleEAtom() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:573:2: ( ( ( rule__EAtom__Group__0 ) ) )
            // InternalS78154S78236.g:574:2: ( ( rule__EAtom__Group__0 ) )
            {
            // InternalS78154S78236.g:574:2: ( ( rule__EAtom__Group__0 ) )
            // InternalS78154S78236.g:575:3: ( rule__EAtom__Group__0 )
            {
             before(grammarAccess.getEAtomAccess().getGroup()); 
            // InternalS78154S78236.g:576:3: ( rule__EAtom__Group__0 )
            // InternalS78154S78236.g:576:4: rule__EAtom__Group__0
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
    // InternalS78154S78236.g:585:1: entryRuleIdent : ruleIdent EOF ;
    public final void entryRuleIdent() throws RecognitionException {
        try {
            // InternalS78154S78236.g:586:1: ( ruleIdent EOF )
            // InternalS78154S78236.g:587:1: ruleIdent EOF
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
    // InternalS78154S78236.g:594:1: ruleIdent : ( ( rule__Ident__IdentAssignment ) ) ;
    public final void ruleIdent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:598:2: ( ( ( rule__Ident__IdentAssignment ) ) )
            // InternalS78154S78236.g:599:2: ( ( rule__Ident__IdentAssignment ) )
            {
            // InternalS78154S78236.g:599:2: ( ( rule__Ident__IdentAssignment ) )
            // InternalS78154S78236.g:600:3: ( rule__Ident__IdentAssignment )
            {
             before(grammarAccess.getIdentAccess().getIdentAssignment()); 
            // InternalS78154S78236.g:601:3: ( rule__Ident__IdentAssignment )
            // InternalS78154S78236.g:601:4: rule__Ident__IdentAssignment
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
    // InternalS78154S78236.g:610:1: entryRuleEVar : ruleEVar EOF ;
    public final void entryRuleEVar() throws RecognitionException {
        try {
            // InternalS78154S78236.g:611:1: ( ruleEVar EOF )
            // InternalS78154S78236.g:612:1: ruleEVar EOF
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
    // InternalS78154S78236.g:619:1: ruleEVar : ( ( rule__EVar__VariableAssignment ) ) ;
    public final void ruleEVar() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:623:2: ( ( ( rule__EVar__VariableAssignment ) ) )
            // InternalS78154S78236.g:624:2: ( ( rule__EVar__VariableAssignment ) )
            {
            // InternalS78154S78236.g:624:2: ( ( rule__EVar__VariableAssignment ) )
            // InternalS78154S78236.g:625:3: ( rule__EVar__VariableAssignment )
            {
             before(grammarAccess.getEVarAccess().getVariableAssignment()); 
            // InternalS78154S78236.g:626:3: ( rule__EVar__VariableAssignment )
            // InternalS78154S78236.g:626:4: rule__EVar__VariableAssignment
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
    // InternalS78154S78236.g:634:1: rule__Clause__Alternatives_1 : ( ( ( rule__Clause__FactAssignment_1_0 ) ) | ( ( rule__Clause__RuleAssignment_1_1 ) ) );
    public final void rule__Clause__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:638:1: ( ( ( rule__Clause__FactAssignment_1_0 ) ) | ( ( rule__Clause__RuleAssignment_1_1 ) ) )
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
                    // InternalS78154S78236.g:639:2: ( ( rule__Clause__FactAssignment_1_0 ) )
                    {
                    // InternalS78154S78236.g:639:2: ( ( rule__Clause__FactAssignment_1_0 ) )
                    // InternalS78154S78236.g:640:3: ( rule__Clause__FactAssignment_1_0 )
                    {
                     before(grammarAccess.getClauseAccess().getFactAssignment_1_0()); 
                    // InternalS78154S78236.g:641:3: ( rule__Clause__FactAssignment_1_0 )
                    // InternalS78154S78236.g:641:4: rule__Clause__FactAssignment_1_0
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
                    // InternalS78154S78236.g:645:2: ( ( rule__Clause__RuleAssignment_1_1 ) )
                    {
                    // InternalS78154S78236.g:645:2: ( ( rule__Clause__RuleAssignment_1_1 ) )
                    // InternalS78154S78236.g:646:3: ( rule__Clause__RuleAssignment_1_1 )
                    {
                     before(grammarAccess.getClauseAccess().getRuleAssignment_1_1()); 
                    // InternalS78154S78236.g:647:3: ( rule__Clause__RuleAssignment_1_1 )
                    // InternalS78154S78236.g:647:4: rule__Clause__RuleAssignment_1_1
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
    // InternalS78154S78236.g:655:1: rule__Term__Alternatives : ( ( ( rule__Term__AtomAssignment_0 ) ) | ( ( rule__Term__ListAssignment_1 ) ) );
    public final void rule__Term__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:659:1: ( ( ( rule__Term__AtomAssignment_0 ) ) | ( ( rule__Term__ListAssignment_1 ) ) )
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
                    // InternalS78154S78236.g:660:2: ( ( rule__Term__AtomAssignment_0 ) )
                    {
                    // InternalS78154S78236.g:660:2: ( ( rule__Term__AtomAssignment_0 ) )
                    // InternalS78154S78236.g:661:3: ( rule__Term__AtomAssignment_0 )
                    {
                     before(grammarAccess.getTermAccess().getAtomAssignment_0()); 
                    // InternalS78154S78236.g:662:3: ( rule__Term__AtomAssignment_0 )
                    // InternalS78154S78236.g:662:4: rule__Term__AtomAssignment_0
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
                    // InternalS78154S78236.g:666:2: ( ( rule__Term__ListAssignment_1 ) )
                    {
                    // InternalS78154S78236.g:666:2: ( ( rule__Term__ListAssignment_1 ) )
                    // InternalS78154S78236.g:667:3: ( rule__Term__ListAssignment_1 )
                    {
                     before(grammarAccess.getTermAccess().getListAssignment_1()); 
                    // InternalS78154S78236.g:668:3: ( rule__Term__ListAssignment_1 )
                    // InternalS78154S78236.g:668:4: rule__Term__ListAssignment_1
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
    // InternalS78154S78236.g:676:1: rule__Atom__Alternatives : ( ( ( rule__Atom__IdentAssignment_0 ) ) | ( ( rule__Atom__NumberAssignment_1 ) ) | ( ( rule__Atom__EvarAssignment_2 ) ) );
    public final void rule__Atom__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:680:1: ( ( ( rule__Atom__IdentAssignment_0 ) ) | ( ( rule__Atom__NumberAssignment_1 ) ) | ( ( rule__Atom__EvarAssignment_2 ) ) )
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
                    // InternalS78154S78236.g:681:2: ( ( rule__Atom__IdentAssignment_0 ) )
                    {
                    // InternalS78154S78236.g:681:2: ( ( rule__Atom__IdentAssignment_0 ) )
                    // InternalS78154S78236.g:682:3: ( rule__Atom__IdentAssignment_0 )
                    {
                     before(grammarAccess.getAtomAccess().getIdentAssignment_0()); 
                    // InternalS78154S78236.g:683:3: ( rule__Atom__IdentAssignment_0 )
                    // InternalS78154S78236.g:683:4: rule__Atom__IdentAssignment_0
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
                    // InternalS78154S78236.g:687:2: ( ( rule__Atom__NumberAssignment_1 ) )
                    {
                    // InternalS78154S78236.g:687:2: ( ( rule__Atom__NumberAssignment_1 ) )
                    // InternalS78154S78236.g:688:3: ( rule__Atom__NumberAssignment_1 )
                    {
                     before(grammarAccess.getAtomAccess().getNumberAssignment_1()); 
                    // InternalS78154S78236.g:689:3: ( rule__Atom__NumberAssignment_1 )
                    // InternalS78154S78236.g:689:4: rule__Atom__NumberAssignment_1
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
                    // InternalS78154S78236.g:693:2: ( ( rule__Atom__EvarAssignment_2 ) )
                    {
                    // InternalS78154S78236.g:693:2: ( ( rule__Atom__EvarAssignment_2 ) )
                    // InternalS78154S78236.g:694:3: ( rule__Atom__EvarAssignment_2 )
                    {
                     before(grammarAccess.getAtomAccess().getEvarAssignment_2()); 
                    // InternalS78154S78236.g:695:3: ( rule__Atom__EvarAssignment_2 )
                    // InternalS78154S78236.g:695:4: rule__Atom__EvarAssignment_2
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
    // InternalS78154S78236.g:703:1: rule__List__Alternatives : ( ( ( rule__List__EmptyAssignment_0 ) ) | ( ( rule__List__NonEmptyListAssignment_1 ) ) );
    public final void rule__List__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:707:1: ( ( ( rule__List__EmptyAssignment_0 ) ) | ( ( rule__List__NonEmptyListAssignment_1 ) ) )
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
                    // InternalS78154S78236.g:708:2: ( ( rule__List__EmptyAssignment_0 ) )
                    {
                    // InternalS78154S78236.g:708:2: ( ( rule__List__EmptyAssignment_0 ) )
                    // InternalS78154S78236.g:709:3: ( rule__List__EmptyAssignment_0 )
                    {
                     before(grammarAccess.getListAccess().getEmptyAssignment_0()); 
                    // InternalS78154S78236.g:710:3: ( rule__List__EmptyAssignment_0 )
                    // InternalS78154S78236.g:710:4: rule__List__EmptyAssignment_0
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
                    // InternalS78154S78236.g:714:2: ( ( rule__List__NonEmptyListAssignment_1 ) )
                    {
                    // InternalS78154S78236.g:714:2: ( ( rule__List__NonEmptyListAssignment_1 ) )
                    // InternalS78154S78236.g:715:3: ( rule__List__NonEmptyListAssignment_1 )
                    {
                     before(grammarAccess.getListAccess().getNonEmptyListAssignment_1()); 
                    // InternalS78154S78236.g:716:3: ( rule__List__NonEmptyListAssignment_1 )
                    // InternalS78154S78236.g:716:4: rule__List__NonEmptyListAssignment_1
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
    // InternalS78154S78236.g:724:1: rule__NonEmptyList__Alternatives : ( ( ( rule__NonEmptyList__EfolgeAssignment_0 ) ) | ( ( rule__NonEmptyList__ElistAssignment_1 ) ) );
    public final void rule__NonEmptyList__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:728:1: ( ( ( rule__NonEmptyList__EfolgeAssignment_0 ) ) | ( ( rule__NonEmptyList__ElistAssignment_1 ) ) )
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

                    if ( (LA6_3==15||LA6_3==21) ) {
                        alt6=1;
                    }
                    else if ( (LA6_3==22) ) {
                        alt6=2;
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

                    if ( (LA6_4==15||LA6_4==21) ) {
                        alt6=1;
                    }
                    else if ( (LA6_4==22) ) {
                        alt6=2;
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
                    // InternalS78154S78236.g:729:2: ( ( rule__NonEmptyList__EfolgeAssignment_0 ) )
                    {
                    // InternalS78154S78236.g:729:2: ( ( rule__NonEmptyList__EfolgeAssignment_0 ) )
                    // InternalS78154S78236.g:730:3: ( rule__NonEmptyList__EfolgeAssignment_0 )
                    {
                     before(grammarAccess.getNonEmptyListAccess().getEfolgeAssignment_0()); 
                    // InternalS78154S78236.g:731:3: ( rule__NonEmptyList__EfolgeAssignment_0 )
                    // InternalS78154S78236.g:731:4: rule__NonEmptyList__EfolgeAssignment_0
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
                    // InternalS78154S78236.g:735:2: ( ( rule__NonEmptyList__ElistAssignment_1 ) )
                    {
                    // InternalS78154S78236.g:735:2: ( ( rule__NonEmptyList__ElistAssignment_1 ) )
                    // InternalS78154S78236.g:736:3: ( rule__NonEmptyList__ElistAssignment_1 )
                    {
                     before(grammarAccess.getNonEmptyListAccess().getElistAssignment_1()); 
                    // InternalS78154S78236.g:737:3: ( rule__NonEmptyList__ElistAssignment_1 )
                    // InternalS78154S78236.g:737:4: rule__NonEmptyList__ElistAssignment_1
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
    // InternalS78154S78236.g:745:1: rule__PrologDsl__Group__0 : rule__PrologDsl__Group__0__Impl rule__PrologDsl__Group__1 ;
    public final void rule__PrologDsl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:749:1: ( rule__PrologDsl__Group__0__Impl rule__PrologDsl__Group__1 )
            // InternalS78154S78236.g:750:2: rule__PrologDsl__Group__0__Impl rule__PrologDsl__Group__1
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
    // InternalS78154S78236.g:757:1: rule__PrologDsl__Group__0__Impl : ( ( rule__PrologDsl__ProgramAssignment_0 ) ) ;
    public final void rule__PrologDsl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:761:1: ( ( ( rule__PrologDsl__ProgramAssignment_0 ) ) )
            // InternalS78154S78236.g:762:1: ( ( rule__PrologDsl__ProgramAssignment_0 ) )
            {
            // InternalS78154S78236.g:762:1: ( ( rule__PrologDsl__ProgramAssignment_0 ) )
            // InternalS78154S78236.g:763:2: ( rule__PrologDsl__ProgramAssignment_0 )
            {
             before(grammarAccess.getPrologDslAccess().getProgramAssignment_0()); 
            // InternalS78154S78236.g:764:2: ( rule__PrologDsl__ProgramAssignment_0 )
            // InternalS78154S78236.g:764:3: rule__PrologDsl__ProgramAssignment_0
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
    // InternalS78154S78236.g:772:1: rule__PrologDsl__Group__1 : rule__PrologDsl__Group__1__Impl ;
    public final void rule__PrologDsl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:776:1: ( rule__PrologDsl__Group__1__Impl )
            // InternalS78154S78236.g:777:2: rule__PrologDsl__Group__1__Impl
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
    // InternalS78154S78236.g:783:1: rule__PrologDsl__Group__1__Impl : ( ( rule__PrologDsl__ExQueryAssignment_1 ) ) ;
    public final void rule__PrologDsl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:787:1: ( ( ( rule__PrologDsl__ExQueryAssignment_1 ) ) )
            // InternalS78154S78236.g:788:1: ( ( rule__PrologDsl__ExQueryAssignment_1 ) )
            {
            // InternalS78154S78236.g:788:1: ( ( rule__PrologDsl__ExQueryAssignment_1 ) )
            // InternalS78154S78236.g:789:2: ( rule__PrologDsl__ExQueryAssignment_1 )
            {
             before(grammarAccess.getPrologDslAccess().getExQueryAssignment_1()); 
            // InternalS78154S78236.g:790:2: ( rule__PrologDsl__ExQueryAssignment_1 )
            // InternalS78154S78236.g:790:3: rule__PrologDsl__ExQueryAssignment_1
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
    // InternalS78154S78236.g:799:1: rule__Exquery__Group__0 : rule__Exquery__Group__0__Impl rule__Exquery__Group__1 ;
    public final void rule__Exquery__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:803:1: ( rule__Exquery__Group__0__Impl rule__Exquery__Group__1 )
            // InternalS78154S78236.g:804:2: rule__Exquery__Group__0__Impl rule__Exquery__Group__1
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
    // InternalS78154S78236.g:811:1: rule__Exquery__Group__0__Impl : ( '?-' ) ;
    public final void rule__Exquery__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:815:1: ( ( '?-' ) )
            // InternalS78154S78236.g:816:1: ( '?-' )
            {
            // InternalS78154S78236.g:816:1: ( '?-' )
            // InternalS78154S78236.g:817:2: '?-'
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
    // InternalS78154S78236.g:826:1: rule__Exquery__Group__1 : rule__Exquery__Group__1__Impl rule__Exquery__Group__2 ;
    public final void rule__Exquery__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:830:1: ( rule__Exquery__Group__1__Impl rule__Exquery__Group__2 )
            // InternalS78154S78236.g:831:2: rule__Exquery__Group__1__Impl rule__Exquery__Group__2
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
    // InternalS78154S78236.g:838:1: rule__Exquery__Group__1__Impl : ( ( rule__Exquery__QueryAssignment_1 ) ) ;
    public final void rule__Exquery__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:842:1: ( ( ( rule__Exquery__QueryAssignment_1 ) ) )
            // InternalS78154S78236.g:843:1: ( ( rule__Exquery__QueryAssignment_1 ) )
            {
            // InternalS78154S78236.g:843:1: ( ( rule__Exquery__QueryAssignment_1 ) )
            // InternalS78154S78236.g:844:2: ( rule__Exquery__QueryAssignment_1 )
            {
             before(grammarAccess.getExqueryAccess().getQueryAssignment_1()); 
            // InternalS78154S78236.g:845:2: ( rule__Exquery__QueryAssignment_1 )
            // InternalS78154S78236.g:845:3: rule__Exquery__QueryAssignment_1
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
    // InternalS78154S78236.g:853:1: rule__Exquery__Group__2 : rule__Exquery__Group__2__Impl ;
    public final void rule__Exquery__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:857:1: ( rule__Exquery__Group__2__Impl )
            // InternalS78154S78236.g:858:2: rule__Exquery__Group__2__Impl
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
    // InternalS78154S78236.g:864:1: rule__Exquery__Group__2__Impl : ( '.' ) ;
    public final void rule__Exquery__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:868:1: ( ( '.' ) )
            // InternalS78154S78236.g:869:1: ( '.' )
            {
            // InternalS78154S78236.g:869:1: ( '.' )
            // InternalS78154S78236.g:870:2: '.'
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
    // InternalS78154S78236.g:880:1: rule__Query__Group__0 : rule__Query__Group__0__Impl rule__Query__Group__1 ;
    public final void rule__Query__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:884:1: ( rule__Query__Group__0__Impl rule__Query__Group__1 )
            // InternalS78154S78236.g:885:2: rule__Query__Group__0__Impl rule__Query__Group__1
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
    // InternalS78154S78236.g:892:1: rule__Query__Group__0__Impl : ( ( rule__Query__PredicateAssignment_0 ) ) ;
    public final void rule__Query__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:896:1: ( ( ( rule__Query__PredicateAssignment_0 ) ) )
            // InternalS78154S78236.g:897:1: ( ( rule__Query__PredicateAssignment_0 ) )
            {
            // InternalS78154S78236.g:897:1: ( ( rule__Query__PredicateAssignment_0 ) )
            // InternalS78154S78236.g:898:2: ( rule__Query__PredicateAssignment_0 )
            {
             before(grammarAccess.getQueryAccess().getPredicateAssignment_0()); 
            // InternalS78154S78236.g:899:2: ( rule__Query__PredicateAssignment_0 )
            // InternalS78154S78236.g:899:3: rule__Query__PredicateAssignment_0
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
    // InternalS78154S78236.g:907:1: rule__Query__Group__1 : rule__Query__Group__1__Impl ;
    public final void rule__Query__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:911:1: ( rule__Query__Group__1__Impl )
            // InternalS78154S78236.g:912:2: rule__Query__Group__1__Impl
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
    // InternalS78154S78236.g:918:1: rule__Query__Group__1__Impl : ( ( rule__Query__EpredicatesAssignment_1 )* ) ;
    public final void rule__Query__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:922:1: ( ( ( rule__Query__EpredicatesAssignment_1 )* ) )
            // InternalS78154S78236.g:923:1: ( ( rule__Query__EpredicatesAssignment_1 )* )
            {
            // InternalS78154S78236.g:923:1: ( ( rule__Query__EpredicatesAssignment_1 )* )
            // InternalS78154S78236.g:924:2: ( rule__Query__EpredicatesAssignment_1 )*
            {
             before(grammarAccess.getQueryAccess().getEpredicatesAssignment_1()); 
            // InternalS78154S78236.g:925:2: ( rule__Query__EpredicatesAssignment_1 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==15) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalS78154S78236.g:925:3: rule__Query__EpredicatesAssignment_1
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
    // InternalS78154S78236.g:934:1: rule__EPredicate__Group__0 : rule__EPredicate__Group__0__Impl rule__EPredicate__Group__1 ;
    public final void rule__EPredicate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:938:1: ( rule__EPredicate__Group__0__Impl rule__EPredicate__Group__1 )
            // InternalS78154S78236.g:939:2: rule__EPredicate__Group__0__Impl rule__EPredicate__Group__1
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
    // InternalS78154S78236.g:946:1: rule__EPredicate__Group__0__Impl : ( ',' ) ;
    public final void rule__EPredicate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:950:1: ( ( ',' ) )
            // InternalS78154S78236.g:951:1: ( ',' )
            {
            // InternalS78154S78236.g:951:1: ( ',' )
            // InternalS78154S78236.g:952:2: ','
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
    // InternalS78154S78236.g:961:1: rule__EPredicate__Group__1 : rule__EPredicate__Group__1__Impl ;
    public final void rule__EPredicate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:965:1: ( rule__EPredicate__Group__1__Impl )
            // InternalS78154S78236.g:966:2: rule__EPredicate__Group__1__Impl
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
    // InternalS78154S78236.g:972:1: rule__EPredicate__Group__1__Impl : ( ( rule__EPredicate__PredicateAssignment_1 ) ) ;
    public final void rule__EPredicate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:976:1: ( ( ( rule__EPredicate__PredicateAssignment_1 ) ) )
            // InternalS78154S78236.g:977:1: ( ( rule__EPredicate__PredicateAssignment_1 ) )
            {
            // InternalS78154S78236.g:977:1: ( ( rule__EPredicate__PredicateAssignment_1 ) )
            // InternalS78154S78236.g:978:2: ( rule__EPredicate__PredicateAssignment_1 )
            {
             before(grammarAccess.getEPredicateAccess().getPredicateAssignment_1()); 
            // InternalS78154S78236.g:979:2: ( rule__EPredicate__PredicateAssignment_1 )
            // InternalS78154S78236.g:979:3: rule__EPredicate__PredicateAssignment_1
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
    // InternalS78154S78236.g:988:1: rule__Clause__Group__0 : rule__Clause__Group__0__Impl rule__Clause__Group__1 ;
    public final void rule__Clause__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:992:1: ( rule__Clause__Group__0__Impl rule__Clause__Group__1 )
            // InternalS78154S78236.g:993:2: rule__Clause__Group__0__Impl rule__Clause__Group__1
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
    // InternalS78154S78236.g:1000:1: rule__Clause__Group__0__Impl : ( ( rule__Clause__PredicateAssignment_0 ) ) ;
    public final void rule__Clause__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1004:1: ( ( ( rule__Clause__PredicateAssignment_0 ) ) )
            // InternalS78154S78236.g:1005:1: ( ( rule__Clause__PredicateAssignment_0 ) )
            {
            // InternalS78154S78236.g:1005:1: ( ( rule__Clause__PredicateAssignment_0 ) )
            // InternalS78154S78236.g:1006:2: ( rule__Clause__PredicateAssignment_0 )
            {
             before(grammarAccess.getClauseAccess().getPredicateAssignment_0()); 
            // InternalS78154S78236.g:1007:2: ( rule__Clause__PredicateAssignment_0 )
            // InternalS78154S78236.g:1007:3: rule__Clause__PredicateAssignment_0
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
    // InternalS78154S78236.g:1015:1: rule__Clause__Group__1 : rule__Clause__Group__1__Impl ;
    public final void rule__Clause__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1019:1: ( rule__Clause__Group__1__Impl )
            // InternalS78154S78236.g:1020:2: rule__Clause__Group__1__Impl
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
    // InternalS78154S78236.g:1026:1: rule__Clause__Group__1__Impl : ( ( rule__Clause__Alternatives_1 ) ) ;
    public final void rule__Clause__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1030:1: ( ( ( rule__Clause__Alternatives_1 ) ) )
            // InternalS78154S78236.g:1031:1: ( ( rule__Clause__Alternatives_1 ) )
            {
            // InternalS78154S78236.g:1031:1: ( ( rule__Clause__Alternatives_1 ) )
            // InternalS78154S78236.g:1032:2: ( rule__Clause__Alternatives_1 )
            {
             before(grammarAccess.getClauseAccess().getAlternatives_1()); 
            // InternalS78154S78236.g:1033:2: ( rule__Clause__Alternatives_1 )
            // InternalS78154S78236.g:1033:3: rule__Clause__Alternatives_1
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


    // $ANTLR start "rule__Rule__Group__0"
    // InternalS78154S78236.g:1042:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1046:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // InternalS78154S78236.g:1047:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalS78154S78236.g:1054:1: rule__Rule__Group__0__Impl : ( ':-' ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1058:1: ( ( ':-' ) )
            // InternalS78154S78236.g:1059:1: ( ':-' )
            {
            // InternalS78154S78236.g:1059:1: ( ':-' )
            // InternalS78154S78236.g:1060:2: ':-'
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
    // InternalS78154S78236.g:1069:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1073:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // InternalS78154S78236.g:1074:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalS78154S78236.g:1081:1: rule__Rule__Group__1__Impl : ( '(' ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1085:1: ( ( '(' ) )
            // InternalS78154S78236.g:1086:1: ( '(' )
            {
            // InternalS78154S78236.g:1086:1: ( '(' )
            // InternalS78154S78236.g:1087:2: '('
            {
             before(grammarAccess.getRuleAccess().getLeftParenthesisKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getLeftParenthesisKeyword_1()); 

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
    // InternalS78154S78236.g:1096:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl rule__Rule__Group__3 ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1100:1: ( rule__Rule__Group__2__Impl rule__Rule__Group__3 )
            // InternalS78154S78236.g:1101:2: rule__Rule__Group__2__Impl rule__Rule__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__Rule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__3();

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
    // InternalS78154S78236.g:1108:1: rule__Rule__Group__2__Impl : ( ( rule__Rule__TermAssignment_2 ) ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1112:1: ( ( ( rule__Rule__TermAssignment_2 ) ) )
            // InternalS78154S78236.g:1113:1: ( ( rule__Rule__TermAssignment_2 ) )
            {
            // InternalS78154S78236.g:1113:1: ( ( rule__Rule__TermAssignment_2 ) )
            // InternalS78154S78236.g:1114:2: ( rule__Rule__TermAssignment_2 )
            {
             before(grammarAccess.getRuleAccess().getTermAssignment_2()); 
            // InternalS78154S78236.g:1115:2: ( rule__Rule__TermAssignment_2 )
            // InternalS78154S78236.g:1115:3: rule__Rule__TermAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Rule__TermAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getTermAssignment_2()); 

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


    // $ANTLR start "rule__Rule__Group__3"
    // InternalS78154S78236.g:1123:1: rule__Rule__Group__3 : rule__Rule__Group__3__Impl rule__Rule__Group__4 ;
    public final void rule__Rule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1127:1: ( rule__Rule__Group__3__Impl rule__Rule__Group__4 )
            // InternalS78154S78236.g:1128:2: rule__Rule__Group__3__Impl rule__Rule__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__Rule__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__4();

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
    // $ANTLR end "rule__Rule__Group__3"


    // $ANTLR start "rule__Rule__Group__3__Impl"
    // InternalS78154S78236.g:1135:1: rule__Rule__Group__3__Impl : ( ( rule__Rule__EtermsAssignment_3 )* ) ;
    public final void rule__Rule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1139:1: ( ( ( rule__Rule__EtermsAssignment_3 )* ) )
            // InternalS78154S78236.g:1140:1: ( ( rule__Rule__EtermsAssignment_3 )* )
            {
            // InternalS78154S78236.g:1140:1: ( ( rule__Rule__EtermsAssignment_3 )* )
            // InternalS78154S78236.g:1141:2: ( rule__Rule__EtermsAssignment_3 )*
            {
             before(grammarAccess.getRuleAccess().getEtermsAssignment_3()); 
            // InternalS78154S78236.g:1142:2: ( rule__Rule__EtermsAssignment_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==15) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalS78154S78236.g:1142:3: rule__Rule__EtermsAssignment_3
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Rule__EtermsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getRuleAccess().getEtermsAssignment_3()); 

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
    // $ANTLR end "rule__Rule__Group__3__Impl"


    // $ANTLR start "rule__Rule__Group__4"
    // InternalS78154S78236.g:1150:1: rule__Rule__Group__4 : rule__Rule__Group__4__Impl ;
    public final void rule__Rule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1154:1: ( rule__Rule__Group__4__Impl )
            // InternalS78154S78236.g:1155:2: rule__Rule__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group__4__Impl();

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
    // $ANTLR end "rule__Rule__Group__4"


    // $ANTLR start "rule__Rule__Group__4__Impl"
    // InternalS78154S78236.g:1161:1: rule__Rule__Group__4__Impl : ( ')' ) ;
    public final void rule__Rule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1165:1: ( ( ')' ) )
            // InternalS78154S78236.g:1166:1: ( ')' )
            {
            // InternalS78154S78236.g:1166:1: ( ')' )
            // InternalS78154S78236.g:1167:2: ')'
            {
             before(grammarAccess.getRuleAccess().getRightParenthesisKeyword_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getRightParenthesisKeyword_4()); 

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
    // $ANTLR end "rule__Rule__Group__4__Impl"


    // $ANTLR start "rule__Predicate__Group__0"
    // InternalS78154S78236.g:1177:1: rule__Predicate__Group__0 : rule__Predicate__Group__0__Impl rule__Predicate__Group__1 ;
    public final void rule__Predicate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1181:1: ( rule__Predicate__Group__0__Impl rule__Predicate__Group__1 )
            // InternalS78154S78236.g:1182:2: rule__Predicate__Group__0__Impl rule__Predicate__Group__1
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
    // InternalS78154S78236.g:1189:1: rule__Predicate__Group__0__Impl : ( ( rule__Predicate__FunctorAssignment_0 ) ) ;
    public final void rule__Predicate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1193:1: ( ( ( rule__Predicate__FunctorAssignment_0 ) ) )
            // InternalS78154S78236.g:1194:1: ( ( rule__Predicate__FunctorAssignment_0 ) )
            {
            // InternalS78154S78236.g:1194:1: ( ( rule__Predicate__FunctorAssignment_0 ) )
            // InternalS78154S78236.g:1195:2: ( rule__Predicate__FunctorAssignment_0 )
            {
             before(grammarAccess.getPredicateAccess().getFunctorAssignment_0()); 
            // InternalS78154S78236.g:1196:2: ( rule__Predicate__FunctorAssignment_0 )
            // InternalS78154S78236.g:1196:3: rule__Predicate__FunctorAssignment_0
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
    // InternalS78154S78236.g:1204:1: rule__Predicate__Group__1 : rule__Predicate__Group__1__Impl rule__Predicate__Group__2 ;
    public final void rule__Predicate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1208:1: ( rule__Predicate__Group__1__Impl rule__Predicate__Group__2 )
            // InternalS78154S78236.g:1209:2: rule__Predicate__Group__1__Impl rule__Predicate__Group__2
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
    // InternalS78154S78236.g:1216:1: rule__Predicate__Group__1__Impl : ( '(' ) ;
    public final void rule__Predicate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1220:1: ( ( '(' ) )
            // InternalS78154S78236.g:1221:1: ( '(' )
            {
            // InternalS78154S78236.g:1221:1: ( '(' )
            // InternalS78154S78236.g:1222:2: '('
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
    // InternalS78154S78236.g:1231:1: rule__Predicate__Group__2 : rule__Predicate__Group__2__Impl rule__Predicate__Group__3 ;
    public final void rule__Predicate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1235:1: ( rule__Predicate__Group__2__Impl rule__Predicate__Group__3 )
            // InternalS78154S78236.g:1236:2: rule__Predicate__Group__2__Impl rule__Predicate__Group__3
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
    // InternalS78154S78236.g:1243:1: rule__Predicate__Group__2__Impl : ( ( rule__Predicate__TermAssignment_2 ) ) ;
    public final void rule__Predicate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1247:1: ( ( ( rule__Predicate__TermAssignment_2 ) ) )
            // InternalS78154S78236.g:1248:1: ( ( rule__Predicate__TermAssignment_2 ) )
            {
            // InternalS78154S78236.g:1248:1: ( ( rule__Predicate__TermAssignment_2 ) )
            // InternalS78154S78236.g:1249:2: ( rule__Predicate__TermAssignment_2 )
            {
             before(grammarAccess.getPredicateAccess().getTermAssignment_2()); 
            // InternalS78154S78236.g:1250:2: ( rule__Predicate__TermAssignment_2 )
            // InternalS78154S78236.g:1250:3: rule__Predicate__TermAssignment_2
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
    // InternalS78154S78236.g:1258:1: rule__Predicate__Group__3 : rule__Predicate__Group__3__Impl rule__Predicate__Group__4 ;
    public final void rule__Predicate__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1262:1: ( rule__Predicate__Group__3__Impl rule__Predicate__Group__4 )
            // InternalS78154S78236.g:1263:2: rule__Predicate__Group__3__Impl rule__Predicate__Group__4
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
    // InternalS78154S78236.g:1270:1: rule__Predicate__Group__3__Impl : ( ( rule__Predicate__EtermsAssignment_3 )* ) ;
    public final void rule__Predicate__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1274:1: ( ( ( rule__Predicate__EtermsAssignment_3 )* ) )
            // InternalS78154S78236.g:1275:1: ( ( rule__Predicate__EtermsAssignment_3 )* )
            {
            // InternalS78154S78236.g:1275:1: ( ( rule__Predicate__EtermsAssignment_3 )* )
            // InternalS78154S78236.g:1276:2: ( rule__Predicate__EtermsAssignment_3 )*
            {
             before(grammarAccess.getPredicateAccess().getEtermsAssignment_3()); 
            // InternalS78154S78236.g:1277:2: ( rule__Predicate__EtermsAssignment_3 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==15) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalS78154S78236.g:1277:3: rule__Predicate__EtermsAssignment_3
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Predicate__EtermsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalS78154S78236.g:1285:1: rule__Predicate__Group__4 : rule__Predicate__Group__4__Impl ;
    public final void rule__Predicate__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1289:1: ( rule__Predicate__Group__4__Impl )
            // InternalS78154S78236.g:1290:2: rule__Predicate__Group__4__Impl
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
    // InternalS78154S78236.g:1296:1: rule__Predicate__Group__4__Impl : ( ')' ) ;
    public final void rule__Predicate__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1300:1: ( ( ')' ) )
            // InternalS78154S78236.g:1301:1: ( ')' )
            {
            // InternalS78154S78236.g:1301:1: ( ')' )
            // InternalS78154S78236.g:1302:2: ')'
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
    // InternalS78154S78236.g:1312:1: rule__ETerm__Group__0 : rule__ETerm__Group__0__Impl rule__ETerm__Group__1 ;
    public final void rule__ETerm__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1316:1: ( rule__ETerm__Group__0__Impl rule__ETerm__Group__1 )
            // InternalS78154S78236.g:1317:2: rule__ETerm__Group__0__Impl rule__ETerm__Group__1
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
    // InternalS78154S78236.g:1324:1: rule__ETerm__Group__0__Impl : ( ',' ) ;
    public final void rule__ETerm__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1328:1: ( ( ',' ) )
            // InternalS78154S78236.g:1329:1: ( ',' )
            {
            // InternalS78154S78236.g:1329:1: ( ',' )
            // InternalS78154S78236.g:1330:2: ','
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
    // InternalS78154S78236.g:1339:1: rule__ETerm__Group__1 : rule__ETerm__Group__1__Impl ;
    public final void rule__ETerm__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1343:1: ( rule__ETerm__Group__1__Impl )
            // InternalS78154S78236.g:1344:2: rule__ETerm__Group__1__Impl
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
    // InternalS78154S78236.g:1350:1: rule__ETerm__Group__1__Impl : ( ( rule__ETerm__TermAssignment_1 ) ) ;
    public final void rule__ETerm__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1354:1: ( ( ( rule__ETerm__TermAssignment_1 ) ) )
            // InternalS78154S78236.g:1355:1: ( ( rule__ETerm__TermAssignment_1 ) )
            {
            // InternalS78154S78236.g:1355:1: ( ( rule__ETerm__TermAssignment_1 ) )
            // InternalS78154S78236.g:1356:2: ( rule__ETerm__TermAssignment_1 )
            {
             before(grammarAccess.getETermAccess().getTermAssignment_1()); 
            // InternalS78154S78236.g:1357:2: ( rule__ETerm__TermAssignment_1 )
            // InternalS78154S78236.g:1357:3: rule__ETerm__TermAssignment_1
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
    // InternalS78154S78236.g:1366:1: rule__EmptyList__Group__0 : rule__EmptyList__Group__0__Impl rule__EmptyList__Group__1 ;
    public final void rule__EmptyList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1370:1: ( rule__EmptyList__Group__0__Impl rule__EmptyList__Group__1 )
            // InternalS78154S78236.g:1371:2: rule__EmptyList__Group__0__Impl rule__EmptyList__Group__1
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
    // InternalS78154S78236.g:1378:1: rule__EmptyList__Group__0__Impl : ( () ) ;
    public final void rule__EmptyList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1382:1: ( ( () ) )
            // InternalS78154S78236.g:1383:1: ( () )
            {
            // InternalS78154S78236.g:1383:1: ( () )
            // InternalS78154S78236.g:1384:2: ()
            {
             before(grammarAccess.getEmptyListAccess().getEmptyListAction_0()); 
            // InternalS78154S78236.g:1385:2: ()
            // InternalS78154S78236.g:1385:3: 
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
    // InternalS78154S78236.g:1393:1: rule__EmptyList__Group__1 : rule__EmptyList__Group__1__Impl ;
    public final void rule__EmptyList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1397:1: ( rule__EmptyList__Group__1__Impl )
            // InternalS78154S78236.g:1398:2: rule__EmptyList__Group__1__Impl
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
    // InternalS78154S78236.g:1404:1: rule__EmptyList__Group__1__Impl : ( '[]' ) ;
    public final void rule__EmptyList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1408:1: ( ( '[]' ) )
            // InternalS78154S78236.g:1409:1: ( '[]' )
            {
            // InternalS78154S78236.g:1409:1: ( '[]' )
            // InternalS78154S78236.g:1410:2: '[]'
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
    // InternalS78154S78236.g:1420:1: rule__Folge__Group__0 : rule__Folge__Group__0__Impl rule__Folge__Group__1 ;
    public final void rule__Folge__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1424:1: ( rule__Folge__Group__0__Impl rule__Folge__Group__1 )
            // InternalS78154S78236.g:1425:2: rule__Folge__Group__0__Impl rule__Folge__Group__1
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
    // InternalS78154S78236.g:1432:1: rule__Folge__Group__0__Impl : ( ( rule__Folge__AtomAssignment_0 ) ) ;
    public final void rule__Folge__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1436:1: ( ( ( rule__Folge__AtomAssignment_0 ) ) )
            // InternalS78154S78236.g:1437:1: ( ( rule__Folge__AtomAssignment_0 ) )
            {
            // InternalS78154S78236.g:1437:1: ( ( rule__Folge__AtomAssignment_0 ) )
            // InternalS78154S78236.g:1438:2: ( rule__Folge__AtomAssignment_0 )
            {
             before(grammarAccess.getFolgeAccess().getAtomAssignment_0()); 
            // InternalS78154S78236.g:1439:2: ( rule__Folge__AtomAssignment_0 )
            // InternalS78154S78236.g:1439:3: rule__Folge__AtomAssignment_0
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
    // InternalS78154S78236.g:1447:1: rule__Folge__Group__1 : rule__Folge__Group__1__Impl ;
    public final void rule__Folge__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1451:1: ( rule__Folge__Group__1__Impl )
            // InternalS78154S78236.g:1452:2: rule__Folge__Group__1__Impl
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
    // InternalS78154S78236.g:1458:1: rule__Folge__Group__1__Impl : ( ( rule__Folge__EatomsAssignment_1 )* ) ;
    public final void rule__Folge__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1462:1: ( ( ( rule__Folge__EatomsAssignment_1 )* ) )
            // InternalS78154S78236.g:1463:1: ( ( rule__Folge__EatomsAssignment_1 )* )
            {
            // InternalS78154S78236.g:1463:1: ( ( rule__Folge__EatomsAssignment_1 )* )
            // InternalS78154S78236.g:1464:2: ( rule__Folge__EatomsAssignment_1 )*
            {
             before(grammarAccess.getFolgeAccess().getEatomsAssignment_1()); 
            // InternalS78154S78236.g:1465:2: ( rule__Folge__EatomsAssignment_1 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==15) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalS78154S78236.g:1465:3: rule__Folge__EatomsAssignment_1
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Folge__EatomsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalS78154S78236.g:1474:1: rule__EFolge__Group__0 : rule__EFolge__Group__0__Impl rule__EFolge__Group__1 ;
    public final void rule__EFolge__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1478:1: ( rule__EFolge__Group__0__Impl rule__EFolge__Group__1 )
            // InternalS78154S78236.g:1479:2: rule__EFolge__Group__0__Impl rule__EFolge__Group__1
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
    // InternalS78154S78236.g:1486:1: rule__EFolge__Group__0__Impl : ( '[' ) ;
    public final void rule__EFolge__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1490:1: ( ( '[' ) )
            // InternalS78154S78236.g:1491:1: ( '[' )
            {
            // InternalS78154S78236.g:1491:1: ( '[' )
            // InternalS78154S78236.g:1492:2: '['
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
    // InternalS78154S78236.g:1501:1: rule__EFolge__Group__1 : rule__EFolge__Group__1__Impl rule__EFolge__Group__2 ;
    public final void rule__EFolge__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1505:1: ( rule__EFolge__Group__1__Impl rule__EFolge__Group__2 )
            // InternalS78154S78236.g:1506:2: rule__EFolge__Group__1__Impl rule__EFolge__Group__2
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
    // InternalS78154S78236.g:1513:1: rule__EFolge__Group__1__Impl : ( ( rule__EFolge__FolgeAssignment_1 ) ) ;
    public final void rule__EFolge__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1517:1: ( ( ( rule__EFolge__FolgeAssignment_1 ) ) )
            // InternalS78154S78236.g:1518:1: ( ( rule__EFolge__FolgeAssignment_1 ) )
            {
            // InternalS78154S78236.g:1518:1: ( ( rule__EFolge__FolgeAssignment_1 ) )
            // InternalS78154S78236.g:1519:2: ( rule__EFolge__FolgeAssignment_1 )
            {
             before(grammarAccess.getEFolgeAccess().getFolgeAssignment_1()); 
            // InternalS78154S78236.g:1520:2: ( rule__EFolge__FolgeAssignment_1 )
            // InternalS78154S78236.g:1520:3: rule__EFolge__FolgeAssignment_1
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
    // InternalS78154S78236.g:1528:1: rule__EFolge__Group__2 : rule__EFolge__Group__2__Impl ;
    public final void rule__EFolge__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1532:1: ( rule__EFolge__Group__2__Impl )
            // InternalS78154S78236.g:1533:2: rule__EFolge__Group__2__Impl
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
    // InternalS78154S78236.g:1539:1: rule__EFolge__Group__2__Impl : ( ']' ) ;
    public final void rule__EFolge__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1543:1: ( ( ']' ) )
            // InternalS78154S78236.g:1544:1: ( ']' )
            {
            // InternalS78154S78236.g:1544:1: ( ']' )
            // InternalS78154S78236.g:1545:2: ']'
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
    // InternalS78154S78236.g:1555:1: rule__EList__Group__0 : rule__EList__Group__0__Impl rule__EList__Group__1 ;
    public final void rule__EList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1559:1: ( rule__EList__Group__0__Impl rule__EList__Group__1 )
            // InternalS78154S78236.g:1560:2: rule__EList__Group__0__Impl rule__EList__Group__1
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
    // InternalS78154S78236.g:1567:1: rule__EList__Group__0__Impl : ( '[' ) ;
    public final void rule__EList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1571:1: ( ( '[' ) )
            // InternalS78154S78236.g:1572:1: ( '[' )
            {
            // InternalS78154S78236.g:1572:1: ( '[' )
            // InternalS78154S78236.g:1573:2: '['
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
    // InternalS78154S78236.g:1582:1: rule__EList__Group__1 : rule__EList__Group__1__Impl rule__EList__Group__2 ;
    public final void rule__EList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1586:1: ( rule__EList__Group__1__Impl rule__EList__Group__2 )
            // InternalS78154S78236.g:1587:2: rule__EList__Group__1__Impl rule__EList__Group__2
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
    // InternalS78154S78236.g:1594:1: rule__EList__Group__1__Impl : ( ( rule__EList__AtomAssignment_1 ) ) ;
    public final void rule__EList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1598:1: ( ( ( rule__EList__AtomAssignment_1 ) ) )
            // InternalS78154S78236.g:1599:1: ( ( rule__EList__AtomAssignment_1 ) )
            {
            // InternalS78154S78236.g:1599:1: ( ( rule__EList__AtomAssignment_1 ) )
            // InternalS78154S78236.g:1600:2: ( rule__EList__AtomAssignment_1 )
            {
             before(grammarAccess.getEListAccess().getAtomAssignment_1()); 
            // InternalS78154S78236.g:1601:2: ( rule__EList__AtomAssignment_1 )
            // InternalS78154S78236.g:1601:3: rule__EList__AtomAssignment_1
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
    // InternalS78154S78236.g:1609:1: rule__EList__Group__2 : rule__EList__Group__2__Impl rule__EList__Group__3 ;
    public final void rule__EList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1613:1: ( rule__EList__Group__2__Impl rule__EList__Group__3 )
            // InternalS78154S78236.g:1614:2: rule__EList__Group__2__Impl rule__EList__Group__3
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
    // InternalS78154S78236.g:1621:1: rule__EList__Group__2__Impl : ( '|' ) ;
    public final void rule__EList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1625:1: ( ( '|' ) )
            // InternalS78154S78236.g:1626:1: ( '|' )
            {
            // InternalS78154S78236.g:1626:1: ( '|' )
            // InternalS78154S78236.g:1627:2: '|'
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
    // InternalS78154S78236.g:1636:1: rule__EList__Group__3 : rule__EList__Group__3__Impl rule__EList__Group__4 ;
    public final void rule__EList__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1640:1: ( rule__EList__Group__3__Impl rule__EList__Group__4 )
            // InternalS78154S78236.g:1641:2: rule__EList__Group__3__Impl rule__EList__Group__4
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
    // InternalS78154S78236.g:1648:1: rule__EList__Group__3__Impl : ( ( rule__EList__TermAssignment_3 ) ) ;
    public final void rule__EList__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1652:1: ( ( ( rule__EList__TermAssignment_3 ) ) )
            // InternalS78154S78236.g:1653:1: ( ( rule__EList__TermAssignment_3 ) )
            {
            // InternalS78154S78236.g:1653:1: ( ( rule__EList__TermAssignment_3 ) )
            // InternalS78154S78236.g:1654:2: ( rule__EList__TermAssignment_3 )
            {
             before(grammarAccess.getEListAccess().getTermAssignment_3()); 
            // InternalS78154S78236.g:1655:2: ( rule__EList__TermAssignment_3 )
            // InternalS78154S78236.g:1655:3: rule__EList__TermAssignment_3
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
    // InternalS78154S78236.g:1663:1: rule__EList__Group__4 : rule__EList__Group__4__Impl ;
    public final void rule__EList__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1667:1: ( rule__EList__Group__4__Impl )
            // InternalS78154S78236.g:1668:2: rule__EList__Group__4__Impl
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
    // InternalS78154S78236.g:1674:1: rule__EList__Group__4__Impl : ( ']' ) ;
    public final void rule__EList__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1678:1: ( ( ']' ) )
            // InternalS78154S78236.g:1679:1: ( ']' )
            {
            // InternalS78154S78236.g:1679:1: ( ']' )
            // InternalS78154S78236.g:1680:2: ']'
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
    // InternalS78154S78236.g:1690:1: rule__EAtom__Group__0 : rule__EAtom__Group__0__Impl rule__EAtom__Group__1 ;
    public final void rule__EAtom__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1694:1: ( rule__EAtom__Group__0__Impl rule__EAtom__Group__1 )
            // InternalS78154S78236.g:1695:2: rule__EAtom__Group__0__Impl rule__EAtom__Group__1
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
    // InternalS78154S78236.g:1702:1: rule__EAtom__Group__0__Impl : ( ',' ) ;
    public final void rule__EAtom__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1706:1: ( ( ',' ) )
            // InternalS78154S78236.g:1707:1: ( ',' )
            {
            // InternalS78154S78236.g:1707:1: ( ',' )
            // InternalS78154S78236.g:1708:2: ','
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
    // InternalS78154S78236.g:1717:1: rule__EAtom__Group__1 : rule__EAtom__Group__1__Impl ;
    public final void rule__EAtom__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1721:1: ( rule__EAtom__Group__1__Impl )
            // InternalS78154S78236.g:1722:2: rule__EAtom__Group__1__Impl
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
    // InternalS78154S78236.g:1728:1: rule__EAtom__Group__1__Impl : ( ( rule__EAtom__AtomAssignment_1 ) ) ;
    public final void rule__EAtom__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1732:1: ( ( ( rule__EAtom__AtomAssignment_1 ) ) )
            // InternalS78154S78236.g:1733:1: ( ( rule__EAtom__AtomAssignment_1 ) )
            {
            // InternalS78154S78236.g:1733:1: ( ( rule__EAtom__AtomAssignment_1 ) )
            // InternalS78154S78236.g:1734:2: ( rule__EAtom__AtomAssignment_1 )
            {
             before(grammarAccess.getEAtomAccess().getAtomAssignment_1()); 
            // InternalS78154S78236.g:1735:2: ( rule__EAtom__AtomAssignment_1 )
            // InternalS78154S78236.g:1735:3: rule__EAtom__AtomAssignment_1
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


    // $ANTLR start "rule__Model__ModelAssignment"
    // InternalS78154S78236.g:1744:1: rule__Model__ModelAssignment : ( rulePrologDsl ) ;
    public final void rule__Model__ModelAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1748:1: ( ( rulePrologDsl ) )
            // InternalS78154S78236.g:1749:2: ( rulePrologDsl )
            {
            // InternalS78154S78236.g:1749:2: ( rulePrologDsl )
            // InternalS78154S78236.g:1750:3: rulePrologDsl
            {
             before(grammarAccess.getModelAccess().getModelPrologDslParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePrologDsl();

            state._fsp--;

             after(grammarAccess.getModelAccess().getModelPrologDslParserRuleCall_0()); 

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
    // $ANTLR end "rule__Model__ModelAssignment"


    // $ANTLR start "rule__PrologDsl__ProgramAssignment_0"
    // InternalS78154S78236.g:1759:1: rule__PrologDsl__ProgramAssignment_0 : ( ruleProgram ) ;
    public final void rule__PrologDsl__ProgramAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1763:1: ( ( ruleProgram ) )
            // InternalS78154S78236.g:1764:2: ( ruleProgram )
            {
            // InternalS78154S78236.g:1764:2: ( ruleProgram )
            // InternalS78154S78236.g:1765:3: ruleProgram
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
    // InternalS78154S78236.g:1774:1: rule__PrologDsl__ExQueryAssignment_1 : ( ruleExquery ) ;
    public final void rule__PrologDsl__ExQueryAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1778:1: ( ( ruleExquery ) )
            // InternalS78154S78236.g:1779:2: ( ruleExquery )
            {
            // InternalS78154S78236.g:1779:2: ( ruleExquery )
            // InternalS78154S78236.g:1780:3: ruleExquery
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
    // InternalS78154S78236.g:1789:1: rule__Program__ClausesAssignment : ( ruleClause ) ;
    public final void rule__Program__ClausesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1793:1: ( ( ruleClause ) )
            // InternalS78154S78236.g:1794:2: ( ruleClause )
            {
            // InternalS78154S78236.g:1794:2: ( ruleClause )
            // InternalS78154S78236.g:1795:3: ruleClause
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
    // InternalS78154S78236.g:1804:1: rule__Exquery__QueryAssignment_1 : ( ruleQuery ) ;
    public final void rule__Exquery__QueryAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1808:1: ( ( ruleQuery ) )
            // InternalS78154S78236.g:1809:2: ( ruleQuery )
            {
            // InternalS78154S78236.g:1809:2: ( ruleQuery )
            // InternalS78154S78236.g:1810:3: ruleQuery
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
    // InternalS78154S78236.g:1819:1: rule__Query__PredicateAssignment_0 : ( rulePredicate ) ;
    public final void rule__Query__PredicateAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1823:1: ( ( rulePredicate ) )
            // InternalS78154S78236.g:1824:2: ( rulePredicate )
            {
            // InternalS78154S78236.g:1824:2: ( rulePredicate )
            // InternalS78154S78236.g:1825:3: rulePredicate
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
    // InternalS78154S78236.g:1834:1: rule__Query__EpredicatesAssignment_1 : ( ruleEPredicate ) ;
    public final void rule__Query__EpredicatesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1838:1: ( ( ruleEPredicate ) )
            // InternalS78154S78236.g:1839:2: ( ruleEPredicate )
            {
            // InternalS78154S78236.g:1839:2: ( ruleEPredicate )
            // InternalS78154S78236.g:1840:3: ruleEPredicate
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
    // InternalS78154S78236.g:1849:1: rule__EPredicate__PredicateAssignment_1 : ( rulePredicate ) ;
    public final void rule__EPredicate__PredicateAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1853:1: ( ( rulePredicate ) )
            // InternalS78154S78236.g:1854:2: ( rulePredicate )
            {
            // InternalS78154S78236.g:1854:2: ( rulePredicate )
            // InternalS78154S78236.g:1855:3: rulePredicate
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
    // InternalS78154S78236.g:1864:1: rule__Clause__PredicateAssignment_0 : ( rulePredicate ) ;
    public final void rule__Clause__PredicateAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1868:1: ( ( rulePredicate ) )
            // InternalS78154S78236.g:1869:2: ( rulePredicate )
            {
            // InternalS78154S78236.g:1869:2: ( rulePredicate )
            // InternalS78154S78236.g:1870:3: rulePredicate
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
    // InternalS78154S78236.g:1879:1: rule__Clause__FactAssignment_1_0 : ( ruleFact ) ;
    public final void rule__Clause__FactAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1883:1: ( ( ruleFact ) )
            // InternalS78154S78236.g:1884:2: ( ruleFact )
            {
            // InternalS78154S78236.g:1884:2: ( ruleFact )
            // InternalS78154S78236.g:1885:3: ruleFact
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
    // InternalS78154S78236.g:1894:1: rule__Clause__RuleAssignment_1_1 : ( ruleRule ) ;
    public final void rule__Clause__RuleAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1898:1: ( ( ruleRule ) )
            // InternalS78154S78236.g:1899:2: ( ruleRule )
            {
            // InternalS78154S78236.g:1899:2: ( ruleRule )
            // InternalS78154S78236.g:1900:3: ruleRule
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


    // $ANTLR start "rule__Fact__FactAssignment"
    // InternalS78154S78236.g:1909:1: rule__Fact__FactAssignment : ( ( '.' ) ) ;
    public final void rule__Fact__FactAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1913:1: ( ( ( '.' ) ) )
            // InternalS78154S78236.g:1914:2: ( ( '.' ) )
            {
            // InternalS78154S78236.g:1914:2: ( ( '.' ) )
            // InternalS78154S78236.g:1915:3: ( '.' )
            {
             before(grammarAccess.getFactAccess().getFactFullStopKeyword_0()); 
            // InternalS78154S78236.g:1916:3: ( '.' )
            // InternalS78154S78236.g:1917:4: '.'
            {
             before(grammarAccess.getFactAccess().getFactFullStopKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getFactAccess().getFactFullStopKeyword_0()); 

            }

             after(grammarAccess.getFactAccess().getFactFullStopKeyword_0()); 

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
    // $ANTLR end "rule__Fact__FactAssignment"


    // $ANTLR start "rule__Rule__TermAssignment_2"
    // InternalS78154S78236.g:1928:1: rule__Rule__TermAssignment_2 : ( ruleTerm ) ;
    public final void rule__Rule__TermAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1932:1: ( ( ruleTerm ) )
            // InternalS78154S78236.g:1933:2: ( ruleTerm )
            {
            // InternalS78154S78236.g:1933:2: ( ruleTerm )
            // InternalS78154S78236.g:1934:3: ruleTerm
            {
             before(grammarAccess.getRuleAccess().getTermTermParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTerm();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getTermTermParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Rule__TermAssignment_2"


    // $ANTLR start "rule__Rule__EtermsAssignment_3"
    // InternalS78154S78236.g:1943:1: rule__Rule__EtermsAssignment_3 : ( ruleETerm ) ;
    public final void rule__Rule__EtermsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1947:1: ( ( ruleETerm ) )
            // InternalS78154S78236.g:1948:2: ( ruleETerm )
            {
            // InternalS78154S78236.g:1948:2: ( ruleETerm )
            // InternalS78154S78236.g:1949:3: ruleETerm
            {
             before(grammarAccess.getRuleAccess().getEtermsETermParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleETerm();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getEtermsETermParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Rule__EtermsAssignment_3"


    // $ANTLR start "rule__Predicate__FunctorAssignment_0"
    // InternalS78154S78236.g:1958:1: rule__Predicate__FunctorAssignment_0 : ( ruleFunctor ) ;
    public final void rule__Predicate__FunctorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1962:1: ( ( ruleFunctor ) )
            // InternalS78154S78236.g:1963:2: ( ruleFunctor )
            {
            // InternalS78154S78236.g:1963:2: ( ruleFunctor )
            // InternalS78154S78236.g:1964:3: ruleFunctor
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
    // InternalS78154S78236.g:1973:1: rule__Predicate__TermAssignment_2 : ( ruleTerm ) ;
    public final void rule__Predicate__TermAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1977:1: ( ( ruleTerm ) )
            // InternalS78154S78236.g:1978:2: ( ruleTerm )
            {
            // InternalS78154S78236.g:1978:2: ( ruleTerm )
            // InternalS78154S78236.g:1979:3: ruleTerm
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
    // InternalS78154S78236.g:1988:1: rule__Predicate__EtermsAssignment_3 : ( ruleETerm ) ;
    public final void rule__Predicate__EtermsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:1992:1: ( ( ruleETerm ) )
            // InternalS78154S78236.g:1993:2: ( ruleETerm )
            {
            // InternalS78154S78236.g:1993:2: ( ruleETerm )
            // InternalS78154S78236.g:1994:3: ruleETerm
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
    // InternalS78154S78236.g:2003:1: rule__Functor__IdentAssignment : ( ruleIdent ) ;
    public final void rule__Functor__IdentAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:2007:1: ( ( ruleIdent ) )
            // InternalS78154S78236.g:2008:2: ( ruleIdent )
            {
            // InternalS78154S78236.g:2008:2: ( ruleIdent )
            // InternalS78154S78236.g:2009:3: ruleIdent
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
    // InternalS78154S78236.g:2018:1: rule__Term__AtomAssignment_0 : ( ruleAtom ) ;
    public final void rule__Term__AtomAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:2022:1: ( ( ruleAtom ) )
            // InternalS78154S78236.g:2023:2: ( ruleAtom )
            {
            // InternalS78154S78236.g:2023:2: ( ruleAtom )
            // InternalS78154S78236.g:2024:3: ruleAtom
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
    // InternalS78154S78236.g:2033:1: rule__Term__ListAssignment_1 : ( ruleList ) ;
    public final void rule__Term__ListAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:2037:1: ( ( ruleList ) )
            // InternalS78154S78236.g:2038:2: ( ruleList )
            {
            // InternalS78154S78236.g:2038:2: ( ruleList )
            // InternalS78154S78236.g:2039:3: ruleList
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
    // InternalS78154S78236.g:2048:1: rule__ETerm__TermAssignment_1 : ( ruleTerm ) ;
    public final void rule__ETerm__TermAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:2052:1: ( ( ruleTerm ) )
            // InternalS78154S78236.g:2053:2: ( ruleTerm )
            {
            // InternalS78154S78236.g:2053:2: ( ruleTerm )
            // InternalS78154S78236.g:2054:3: ruleTerm
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
    // InternalS78154S78236.g:2063:1: rule__Atom__IdentAssignment_0 : ( ruleIdent ) ;
    public final void rule__Atom__IdentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:2067:1: ( ( ruleIdent ) )
            // InternalS78154S78236.g:2068:2: ( ruleIdent )
            {
            // InternalS78154S78236.g:2068:2: ( ruleIdent )
            // InternalS78154S78236.g:2069:3: ruleIdent
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
    // InternalS78154S78236.g:2078:1: rule__Atom__NumberAssignment_1 : ( RULE_NUMBER ) ;
    public final void rule__Atom__NumberAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:2082:1: ( ( RULE_NUMBER ) )
            // InternalS78154S78236.g:2083:2: ( RULE_NUMBER )
            {
            // InternalS78154S78236.g:2083:2: ( RULE_NUMBER )
            // InternalS78154S78236.g:2084:3: RULE_NUMBER
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
    // InternalS78154S78236.g:2093:1: rule__Atom__EvarAssignment_2 : ( ruleEVar ) ;
    public final void rule__Atom__EvarAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:2097:1: ( ( ruleEVar ) )
            // InternalS78154S78236.g:2098:2: ( ruleEVar )
            {
            // InternalS78154S78236.g:2098:2: ( ruleEVar )
            // InternalS78154S78236.g:2099:3: ruleEVar
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
    // InternalS78154S78236.g:2108:1: rule__List__EmptyAssignment_0 : ( ruleEmptyList ) ;
    public final void rule__List__EmptyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:2112:1: ( ( ruleEmptyList ) )
            // InternalS78154S78236.g:2113:2: ( ruleEmptyList )
            {
            // InternalS78154S78236.g:2113:2: ( ruleEmptyList )
            // InternalS78154S78236.g:2114:3: ruleEmptyList
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
    // InternalS78154S78236.g:2123:1: rule__List__NonEmptyListAssignment_1 : ( ruleNonEmptyList ) ;
    public final void rule__List__NonEmptyListAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:2127:1: ( ( ruleNonEmptyList ) )
            // InternalS78154S78236.g:2128:2: ( ruleNonEmptyList )
            {
            // InternalS78154S78236.g:2128:2: ( ruleNonEmptyList )
            // InternalS78154S78236.g:2129:3: ruleNonEmptyList
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
    // InternalS78154S78236.g:2138:1: rule__NonEmptyList__EfolgeAssignment_0 : ( ruleEFolge ) ;
    public final void rule__NonEmptyList__EfolgeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:2142:1: ( ( ruleEFolge ) )
            // InternalS78154S78236.g:2143:2: ( ruleEFolge )
            {
            // InternalS78154S78236.g:2143:2: ( ruleEFolge )
            // InternalS78154S78236.g:2144:3: ruleEFolge
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
    // InternalS78154S78236.g:2153:1: rule__NonEmptyList__ElistAssignment_1 : ( ruleEList ) ;
    public final void rule__NonEmptyList__ElistAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:2157:1: ( ( ruleEList ) )
            // InternalS78154S78236.g:2158:2: ( ruleEList )
            {
            // InternalS78154S78236.g:2158:2: ( ruleEList )
            // InternalS78154S78236.g:2159:3: ruleEList
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
    // InternalS78154S78236.g:2168:1: rule__Folge__AtomAssignment_0 : ( ruleAtom ) ;
    public final void rule__Folge__AtomAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:2172:1: ( ( ruleAtom ) )
            // InternalS78154S78236.g:2173:2: ( ruleAtom )
            {
            // InternalS78154S78236.g:2173:2: ( ruleAtom )
            // InternalS78154S78236.g:2174:3: ruleAtom
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
    // InternalS78154S78236.g:2183:1: rule__Folge__EatomsAssignment_1 : ( ruleEAtom ) ;
    public final void rule__Folge__EatomsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:2187:1: ( ( ruleEAtom ) )
            // InternalS78154S78236.g:2188:2: ( ruleEAtom )
            {
            // InternalS78154S78236.g:2188:2: ( ruleEAtom )
            // InternalS78154S78236.g:2189:3: ruleEAtom
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
    // InternalS78154S78236.g:2198:1: rule__EFolge__FolgeAssignment_1 : ( ruleFolge ) ;
    public final void rule__EFolge__FolgeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:2202:1: ( ( ruleFolge ) )
            // InternalS78154S78236.g:2203:2: ( ruleFolge )
            {
            // InternalS78154S78236.g:2203:2: ( ruleFolge )
            // InternalS78154S78236.g:2204:3: ruleFolge
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
    // InternalS78154S78236.g:2213:1: rule__EList__AtomAssignment_1 : ( ruleAtom ) ;
    public final void rule__EList__AtomAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:2217:1: ( ( ruleAtom ) )
            // InternalS78154S78236.g:2218:2: ( ruleAtom )
            {
            // InternalS78154S78236.g:2218:2: ( ruleAtom )
            // InternalS78154S78236.g:2219:3: ruleAtom
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
    // InternalS78154S78236.g:2228:1: rule__EList__TermAssignment_3 : ( ruleTerm ) ;
    public final void rule__EList__TermAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:2232:1: ( ( ruleTerm ) )
            // InternalS78154S78236.g:2233:2: ( ruleTerm )
            {
            // InternalS78154S78236.g:2233:2: ( ruleTerm )
            // InternalS78154S78236.g:2234:3: ruleTerm
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
    // InternalS78154S78236.g:2243:1: rule__EAtom__AtomAssignment_1 : ( ruleAtom ) ;
    public final void rule__EAtom__AtomAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:2247:1: ( ( ruleAtom ) )
            // InternalS78154S78236.g:2248:2: ( ruleAtom )
            {
            // InternalS78154S78236.g:2248:2: ( ruleAtom )
            // InternalS78154S78236.g:2249:3: ruleAtom
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
    // InternalS78154S78236.g:2258:1: rule__Ident__IdentAssignment : ( RULE_ID ) ;
    public final void rule__Ident__IdentAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:2262:1: ( ( RULE_ID ) )
            // InternalS78154S78236.g:2263:2: ( RULE_ID )
            {
            // InternalS78154S78236.g:2263:2: ( RULE_ID )
            // InternalS78154S78236.g:2264:3: RULE_ID
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
    // InternalS78154S78236.g:2273:1: rule__EVar__VariableAssignment : ( RULE_VARIABLE ) ;
    public final void rule__EVar__VariableAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalS78154S78236.g:2277:1: ( ( RULE_VARIABLE ) )
            // InternalS78154S78236.g:2278:2: ( RULE_VARIABLE )
            {
            // InternalS78154S78236.g:2278:2: ( RULE_VARIABLE )
            // InternalS78154S78236.g:2279:3: RULE_VARIABLE
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