package pl.com.tt.arithmetic.parser;

import pl.com.tt.arithmetic.tree.DoubleArgOperator;
import pl.com.tt.arithmetic.tree.Node;
import pl.com.tt.arithmetic.tree.SingleArgOperator;
import pl.com.tt.arithmetic.tree.Value;

public class Parser {

	public Node parse(String exp) {
		int i = 0;
		int x = 0;
		int y = 0;
		boolean nawias = false;

		if (exp.equals(""))
			return new Value(0);

		while (exp.charAt(i) != '+' || nawias) {

			if (exp.charAt(i) == '(')
				x++;
			if (exp.charAt(i) == ')')
				y++;
			if (x != y)
				nawias = true;
			else
				nawias = false;
			if (i == exp.length() - 1)
				break;
			i++;
		}

		if (exp.charAt(i) == '+' && !nawias) {
			String beforeChar = exp.substring(0, i);
			String afterChar = exp.substring(i + 1, exp.length());

			return new DoubleArgOperator(parse(beforeChar), parse(afterChar), "+");

		}
		i = exp.length() - 1;
		x = 0;
		y = 0;
		while (exp.charAt(i) != '-' || nawias) {
			if (exp.charAt(i) == '(')
				x++;
			if (exp.charAt(i) == ')')
				y++;
			if (x != y)
				nawias = true;
			else
				nawias = false;
			if (i == 0)
				break;
			i--;
		}

		if (exp.charAt(i) == '-' && !nawias) {
			String beforeChar = exp.substring(0, i);
			String afterChar = exp.substring(i + 1, exp.length());

			return new DoubleArgOperator(parse(beforeChar), parse(afterChar), "-");

		}

		i = 0;
		x = 0;
		y = 0;
		while (exp.charAt(i) != '*' || nawias) {
			if (exp.charAt(i) == '(')
				x++;
			if (exp.charAt(i) == ')')
				y++;
			if (x != y)
				nawias = true;
			else
				nawias = false;
			if (i == exp.length() - 1)
				break;
			i++;
		}

		if (exp.charAt(i) == '*' && !nawias) {
			String beforeChar = exp.substring(0, i);
			String afterChar = exp.substring(i + 1, exp.length());

			return new DoubleArgOperator(parse(beforeChar), parse(afterChar), "*");

		}

		i = exp.length() - 1;
		x = 0;
		y = 0;
		while (exp.charAt(i) != '/' || nawias) {
			if (exp.charAt(i) == '(')
				x++;
			if (exp.charAt(i) == ')')
				y++;
			if (x != y)
				nawias = true;
			else
				nawias = false;
			if (i == 0)
				break;
			i--;
		}

		if (exp.charAt(i) == '/' && !nawias) {
			String beforeChar = exp.substring(0, i);
			String afterChar = exp.substring(i + 1, exp.length());

			return new DoubleArgOperator(parse(beforeChar), parse(afterChar), "/");

		}

		i = exp.length() - 1;
		x = 0;
		y = 0;
		while (exp.charAt(i) != '^' || nawias) {
			if (exp.charAt(i) == '(')
				x++;
			if (exp.charAt(i) == ')')
				y++;
			if (x != y)
				nawias = true;
			else
				nawias = false;
			if (i == 0)
				break;
			i--;
		}

		if (exp.charAt(i) == '^' && !nawias) {
			String beforeChar = exp.substring(0, i);
			String afterChar = exp.substring(i + 1, exp.length());

			return new DoubleArgOperator(parse(beforeChar), parse(afterChar), "^");

		}

		if (exp.charAt(exp.length() - 1) == ')') {
			if (exp.charAt(0) == '(')
				return parse(exp.substring(1, exp.length() - 1));

			if (exp.charAt(0) == 's') {
				if (exp.charAt(1) == 'q')
					return new SingleArgOperator(parse(exp.substring(5, exp.length() - 1)), "sqrt");
				else if (exp.charAt(1) == 'i')
					return new SingleArgOperator(parse(exp.substring(4, exp.length() - 1)), "sin");
			} else if (exp.charAt(0) == 'c')
				return new SingleArgOperator(parse(exp.substring(4, exp.length() - 1)), "cos");
			else if (exp.charAt(0) == 'a')
				return new SingleArgOperator(parse(exp.substring(4, exp.length() - 1)), "abs");

		}

		return new Value(Double.valueOf(exp));

	}

}
