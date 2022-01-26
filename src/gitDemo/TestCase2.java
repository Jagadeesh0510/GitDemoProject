package gitDemo;

import javax.lang.model.element.NestingKind;

public class TestCase2 {

	public static void main(String[] args) {
	
		String str="Welcome";
		char ch;
		String reversestr ="";
		
		for(int i=0; i<str.length();i++) {
		ch=	str.charAt(i);
		reversestr = ch+ reversestr;
		}
		System.out.println("Reversed String: "+reversestr);
		
	}
}
