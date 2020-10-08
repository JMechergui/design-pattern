package tn.design.pattern.Decorator;

public class Test {

	public static void main(String[] args) {

		Data text = new Data(" juiededKefoefghef");

		System.out.println(new UpperCaseHelper(new TrimHelper(new LowerCaseHelper(text))).execute());
	}

}
