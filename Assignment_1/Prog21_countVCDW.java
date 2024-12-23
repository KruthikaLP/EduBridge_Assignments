package Assignment1;

import java.util.Scanner;

//11) Write a program to find the number of vowels, consonents, 
//digits and white space characters in a string.
public class Prog21_countVCDW {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String s = sc.nextLine();
	s= s.toLowerCase();
	int vowel=0,cons =0,white=0,digit=0,SpecialChar=0;
	for(int i=0;i<s.length();i++) {
		char c = s.charAt(i);
		if(c>='a' && c<='z'){
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				vowel++;
			}
			else {
				cons++;
			}
		}
		else if(c>='0' && c<='9') {
			digit++;
		}
		else if(c==' ') {
			white++;
		}
		else {
			SpecialChar++;
		}
	}
	System.out.println("VowelCount :"+vowel);
	System.out.println("ConsonentsCount :"+cons);
	System.out.println("DigitCount :"+digit);
	System.out.println("WhiteCount :"+white);
	System.out.println("SpecialCharacter :"+SpecialChar);
}
}
