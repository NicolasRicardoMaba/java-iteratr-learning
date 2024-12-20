package com.iteratrlearning.shu_book;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class BankStatementAnalyzer {

	private static final String RESOURCES = "src/resources/";

//    para rodar sem a necessidade de executar com args[0]
	public void analyze(final String fileName, final BankStatementParser bankStatementParser) throws IOException {
		final Path path = Paths.get(RESOURCES + fileName);
		final List<String> lines = Files.readAllLines(path);

		final List<BankTransaction> bankTransactions = bankStatementParser.parseLinesFrom(lines);
		final BankStatementProcessor bankStatementProcessor = new BankStatementProcessor(bankTransactions);
		collectSummary(bankStatementProcessor);
	}

	private void collectSummary(BankStatementProcessor bankStatementProcessor) {
		// TODO Auto-generated method stub

	}
}