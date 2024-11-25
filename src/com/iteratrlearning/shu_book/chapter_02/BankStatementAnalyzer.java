package com.iteratrlearning.shu_book.chapter_02;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class BankStatementAnalyzer {

    private static final String RESOURCES = "src/resources/";	
//    para rodar sem a necessidade de executar com args[0]
    public void analyze(final String fileName, final BankStatementParser bankStatementParser)
    	throws IOException{
    	final Path path = Paths.get(RESOURCES +fileName);
    	final List<String> lines = Files.readAllLines(path);
    	
    	final List<BankTransaction> bankTransactions = bankStatementParser.parseLinesFrom(lines);
    	final BankStatementProcessor bankStatementProcessor = new BankStatementProcessor(bankTransactions);
    	collectSummary(bankStatementProcessor);
    }
  
//	public static void main(final String[] args) throws Exception {
////        	final Path path = Paths.get(RESOURCES + args[0]);
//          final Path path = Paths.get(RESOURCES + "bank-data-simple.csv");
//          final List<String> lines = Files.readAllLines(path);
//          BankStatementCSVParser bankStatementCSVParser = new BankStatementCSVParser();
//          List<BankTransaction> bankTransaction = bankStatementCSVParser.parseLinesFrom(lines);
//          BankStatementProcessor bankStatementProcessor = new BankStatementProcessor(bankTransaction);
//            System.out.println("The total for all transactions is " + bankStatementProcessor.calculateTotalAmount());	
//            System.out.println("Transactions in January " + bankStatementProcessor.selectInMonth(Month.JANUARY));	
//    }
	  private void collectSummary(BankStatementProcessor bankStatementProcessor) {
			// TODO Auto-generated method stub
			
		}
	} 