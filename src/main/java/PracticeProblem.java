import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
		q7();
		q8();
		q9();
		q10();
		q11();
		q12();
	}

	public static void q1() {
		Scanner s = new Scanner(System.in);
    	System.out.print("Input a number: ");
    	Double x = s.nextDouble();
    	System.out.println(Math.abs(x));
		
	}

	public static void q2() {
		Scanner s = new Scanner(System.in);
    	System.out.print("Input a number: ");
    	Double x = s.nextDouble();
    	System.out.print("Input another number: ");
    	Double y = s.nextDouble();
    	System.out.println(Math.floor(x/y));
    	System.out.println(Math.ceil(x/y));

		
	}

	public static void q3() {
		Scanner s = new Scanner(System.in);
    	System.out.print("Input a number: ");
    	Double x = s.nextDouble();
    	System.out.println(Math.round(Math.sqrt(x)));
		
	}

	public static void q4() {
		Scanner s = new Scanner(System.in);
       System.out.print("Input a number: ");
       Double x = s.nextDouble();
       System.out.print("Input another number: ");
       Double y = s.nextDouble();
       System.out.println(Math.pow(x,y));

		
	}

	public static void q5() {
		Scanner s = new Scanner(System.in);
       System.out.print("Input a number: ");
       Double x = s.nextDouble();
       System.out.print("Input another number: ");
       Double y = s.nextDouble();
       System.out.print("Input one more number: ");
       Double z = s.nextDouble();
       System.out.println(Math.max(Math.max(x,y),z));
       System.out.println(Math.min(Math.min(x,y),z));
		
	}
	public static void q6() {
		Scanner s = new Scanner(System.in);
       System.out.print("Input a sentence: ");
       String x = s.nextLine();
       System.out.println(x.contains("on"));
		
	}
	public static void q7() {
		Scanner s = new Scanner(System.in);
       System.out.print("Input the word mango: ");
       String x = s.nextLine();
       System.out.println(x.equalsIgnoreCase("mango"));
		
	}
	public static void q8() {
		Scanner s = new Scanner(System.in);
       System.out.print("Input a word: ");
       String x = s.nextLine();
       System.out.print("Input a letter: ");
       String y = s.nextLine();
       System.out.println(x.indexOf(y));
       System.out.println(x.lastIndexOf(y));
		
	}

	public static void q9() {
		Scanner s = new Scanner(System.in);
       System.out.print("Input a sentence: ");
       String x = s.nextLine();
       System.out.println("Your sentence is "+x.length()+" characters long");
		
	}
	public static void q10() {
		Scanner s = new Scanner(System.in);
       System.out.print("Input a sentence: ");
       String x = s.nextLine();
       System.out.print("Input a word to replace: ");
       String y = s.nextLine();
       System.out.print("What word would you like to replace it with: ");
       String z = s.nextLine();
       x=x.replaceAll(y,z);
       System.out.println(x);
		
	}

	public static void q11() {
		Scanner s = new Scanner(System.in);
       System.out.print("Input a sentence: ");
       String x = s.nextLine();
       System.out.println((x.toUpperCase()).trim());
       System.out.println((x.toLowerCase()).trim());
		
	}

	public static void q12() {
		Scanner s = new Scanner(System.in);
       System.out.print("Input a word: ");
       String x = s.nextLine();
       System.out.println(x.substring(0,4));
       int y=x.length();
       System.out.println(x.substring(y-4,y));
		
	}
	

}
