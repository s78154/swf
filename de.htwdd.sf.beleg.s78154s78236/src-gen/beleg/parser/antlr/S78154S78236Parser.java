/*
 * generated by Xtext 2.13.0
 */
package beleg.parser.antlr;

import beleg.parser.antlr.internal.InternalS78154S78236Parser;
import beleg.services.S78154S78236GrammarAccess;
import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class S78154S78236Parser extends AbstractAntlrParser {

	@Inject
	private S78154S78236GrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalS78154S78236Parser createParser(XtextTokenStream stream) {
		return new InternalS78154S78236Parser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "PrologDsl";
	}

	public S78154S78236GrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(S78154S78236GrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
