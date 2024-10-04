package ipa.tcs.com;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String string=scanner.nextLine();
		int count=0;
		for (int i = 0; i < string.length(); i++) {
			char ch=string.charAt(i);
			if(ch>='a' && ch<='z') {
				count++;
			}
		}
		if(count>0) {
			System.out.println(count);
		}
		else {
			System.out.println("NO Lower case charachters present");
		}

	}

}
