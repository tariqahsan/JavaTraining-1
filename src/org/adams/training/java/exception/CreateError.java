package org.adams.training.java.exception;

import java.util.ArrayList;
import java.util.Iterator;

public class CreateError {

	public static void main(String[] args) {
		ArrayList<String> company = new ArrayList();
		company.add("eBay");
		company.add("Paypal");
		company.add("Google");
		Iterator comapnyIterator = company.iterator();

		int i = 1;
		while (comapnyIterator.hasNext()) {
//			String companyName = (String) comapnyIterator.next();
			System.out.print(i + " ");
//			System.out.println(companyName);
			i++;
		}
	}
}
