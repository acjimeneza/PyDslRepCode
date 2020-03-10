/*
 * generated by Xtext 2.18.0.M3
 */
package edu.ulibertadores.parser.antlr;

import com.google.inject.Inject;
import edu.ulibertadores.parser.antlr.internal.InternalPyDslRepParser;
import edu.ulibertadores.services.PyDslRepGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class PyDslRepParser extends AbstractAntlrParser {

	@Inject
	private PyDslRepGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalPyDslRepParser createParser(XtextTokenStream stream) {
		return new InternalPyDslRepParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}

	public PyDslRepGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(PyDslRepGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
