package pl.com.tt.arithmetic.starter;

import java.util.Scanner;

import pl.com.tt.arithmetic.parser.Parser;

public class Starter {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String x = input.nextLine();
		Parser p = new Parser();
		System.out.println(p.parse(x).calculate());
	}
}
