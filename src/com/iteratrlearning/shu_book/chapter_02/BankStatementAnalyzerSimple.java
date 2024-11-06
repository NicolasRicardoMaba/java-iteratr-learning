package com.iteratrlearning.shu_book.chapter_02;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class BankStatementAnalyzerSimple {

    private static final String RESOURCES = "src/resources/";

    public static void main(final String[] args) throws Exception {
//        	final Path path = Paths.get(RESOURCES + args[0]);
          final Path path = Paths.get(RESOURCES + "bank-data-simple.csv");
          final List<String> lines = Files.readAllLines(path);
          BankStatementCSVParser bankStatementCSVParser = new BankStatementCSVParser();
          List<BankTransaction> bankTransaction = bankStatementCSVParser.parseLinesFromCSV(lines);
          BankStatementProcessor bankStatementProcessor = new BankStatementProcessor(bankTransaction);
            System.out.println("The total for all transactions is " + bankStatementProcessor.calculateTotalAmount());	
            System.out.println("Transactions in January " + bankStatementProcessor.selectInMonth(Month.JANUARY));	
    }
	} 