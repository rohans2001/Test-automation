package ddt;

import generic.generic_fetch;

public class Fetch_data {

	public static void main(String[] args) {
	
		String value = generic_fetch.Fetch_data("Sheet1", 1, 0);
		System.out.println(value);
	}

}
