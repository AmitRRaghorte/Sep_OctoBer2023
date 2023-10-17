package string_Class;

public class Sample_4 {

	public static void main(String[] args) {

		String s1 = "velocity"; // 8 : Total number of characters
		String p = "velo city"; // 9 : space consider
		String s2 = "ABCD";
		String s3 = "abcd";
		String s4 = "my name is abc";
		String s5 = "abcabccab";

// Method 1 : Length

		System.out.println(s1.length()); //
		System.out.println(p.length());

		System.out.println("************************");

// Method 2 : to verify string have data or it is empty ==> not empty reurn false ==>empty return True

		System.out.println(s1.isEmpty()); // False
		System.out.println(s1.isBlank()); // False

		System.out.println("************************");

// Method 3 : To convert in uppercase : This change is temporary 
		// if we want to convert it permantly then ist we convert it into uppercase then
		// we reinilitise it

		System.out.println(s1.toUpperCase());
		System.out.println(s1);

		// s1=s1.toUpperCase();
		// System.out.println(s1);

		System.out.println("************************");

// Method 4 : lowercase 
		System.out.println(s2.toLowerCase()); // Temporary change

		// s2=s2.toLowerCase(); // Permant change
		// System.out.println (s2);

		System.out.println("************************");

// Method 5 : Method compare 2 string (s2 & s3)

		// Working : 1st it check whether both string have same information or not
		// 2nd check whether the string have " same case " or not.
		// return True or False

		System.out.println(s2.equals(s3)); // Fasle ==> info same but case diff

		System.out.println("************************");

// Method 6 :comapring two string by ignoring case 

		System.out.println(s2.equalsIgnoreCase(s3)); // True : only check data same or not .ignore case

		System.out.println("************************");

// Method 7 : To verify string contain word or not ==> Return True or false
		// case sensitive
		// sequence of word does not matter here

		System.out.println(s4.contains("name")); // TRUE
		System.out.println(s4.contains("Name")); // FALSE

		System.out.println("************************");

// Method 8 :To verify word present or not on specific position
		// like word present at statrting or ending of sentence
		// Return true Or False

		System.out.println(s4.startsWith("my")); // T
		System.out.println(s4.startsWith("is")); // F
		System.out.println(s4.startsWith("My")); // F

		System.out.println("************************");

		System.out.println(s4.endsWith("abc")); // T

		System.out.println("************************");

// Method 9 : Replace : Replace charatcters
		// remove 1 character and add multiple character vice versa

		System.out.println(s4.replace("abc", "amit"));

		System.out.println("************************");

// Method 10 : concate 
		System.out.println(s2 + " : " + s3);
		System.out.println(s2.concat(s4));
		System.out.println("************************");

// Method 11 :Method to print any character using index

		System.out.println(s1.charAt(0));
		System.out.println(s1.charAt(6));
		System.out.println(s1.charAt(3));

		System.out.println("************************");

// Method 12 : Method to print any index using characters ==> start checking from 0 position
		// it will get index of 1st character occurence

		System.out.println(s5.indexOf('c')); // 2
		System.out.println(s5.indexOf('b')); // 1

		// if charcter present multiple time in if wewant index of last character then

		System.out.println(s5.lastIndexOf('c')); // 6
		System.out.println(s5.lastIndexOf('b')); // 8

		System.out.println("************************");

// Method 13 : Substring : to get middle character 
		// it will all the charcter from mwntion index

		System.out.println(s1.substring(4)); // city
		System.out.println(s1.substring(6)); // ty

		// if we want to print character between index only then
		// here if we want to print character between 3 & 5 index then in code i have to mention 3 &6 index

		System.out.println(s1.substring(3, 6));// oci



	}
}
