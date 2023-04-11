package StringsinJava;

public class stringsinJava {

	public static void main(String[] args) {
		// String Syntax
		
		String s =new String("Welcome");
		String sr="Welcome";
		System.out.println(sr);
		System.out.println(sr.length());
		
		//Concatenation concat()
		
		String s1="Welcome ";
		String s2="to Java";
		String s3=" automation";
		
		System.out.println(s1+s2+s3);
		System.out.println(s1.concat(s2).concat(s3));
		
		//trim()
		
		String s4="     neval     ";
		String trimmed= s4.trim();
		System.out.println(trimmed);
		
		
		//charAt()
		
		String a="Munir";
		
		System.out.println(a.charAt(0));
		
		//Contains (case sensitive)
		
		System.out.println(a.contains("n"));
		
		//equals() equalsIgnoreCase() - compare 2 strings
		
		String m="Munir";
		String mn="MUNIR";
		
		System.out.println(m.equals(mn));
		System.out.println(m.equalsIgnoreCase(mn));
		
		
		//replace()
		
		String x="hello world welcome to java selenium test automation";
		System.out.println(x.replace('o', 'O'));
		System.out.println(x.replace("java","JAVA"));
		
		
		//substring() 
		//Delimiter cannot be : * $ ^ . ? + - 

		String z="welcome";
		System.out.println(z.substring(3,7));
		
		//split()

		String spl="abc@gmail.com";
		String p[]= spl.split("@");
		System.out.println(p[0]);
		System.out.println(p[1]);
		
		
		//toUpperCase(), toLowerCase()
		
		String t="Tea or Coffee";
		System.out.println(t.toUpperCase());
		System.out.println(t.toLowerCase());
		
		
		//String Comparisons (equals or  == )
		// Comparing non-primitive data types with equals
		// == compares the objects but equals compares the values of objects
		
		String w=new String ("welcome");
		String y=new String ("welcome");
		String o="hello";
		String h="hello";
		System.out.println(w==y);   //returns false because it looks for the objects themselves
		System.out.println(w.equals(y)); //returns true because it looks for the values of the objects
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
