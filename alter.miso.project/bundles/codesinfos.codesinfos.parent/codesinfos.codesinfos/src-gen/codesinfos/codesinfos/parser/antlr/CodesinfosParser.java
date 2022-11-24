/*
 * generated by Xtext 2.23.0
 */
package codesinfos.codesinfos.parser.antlr;

import codesinfos.codesinfos.parser.antlr.internal.InternalCodesinfosParser;
import codesinfos.codesinfos.services.CodesinfosGrammarAccess;
import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class CodesinfosParser extends AbstractAntlrParser {

	@Inject
	private CodesinfosGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalCodesinfosParser createParser(XtextTokenStream stream) {
		return new InternalCodesinfosParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "CodesinfosRoot";
	}

	public CodesinfosGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(CodesinfosGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
