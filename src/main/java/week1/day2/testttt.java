package week1.day2;


public class testttt {

	public static void main(String[] args) {

		String s1="java class string is the class";  
		String concat = s1.concat(" is immutable");  
		System.out.println("1. Concadination : " +concat);  
		char s2=s1.charAt(0);
		char s3=s1.charAt(s1.length()-3);
		System.out.println( "2. CharAt 0 : "+s2);
		System.out.println("2. CharAt 0 : "+s3);
		if(s1.startsWith("j")&&s1.endsWith("s")) {
			System.out.println("Startswith and Ends with is eqauls to string: "+ s1);
		}
		
		String name="what do you know about me";  
		System.out.println("3. Contains or not : " +name.contains( "u k"));
		System.out.println("4. Starts with or not : " +name.startsWith("u K"));
		System.out.println("5. Ends with or not : " +name.endsWith("what do you know about me"));
		
		String s5="JAVATPOINT";  
		String s4="javaTpoint";
		System.out.println("6. Equals or not : "+s5.equals(s4));
		System.out.println("7. Equals or not with ignore case: "+s5.equalsIgnoreCase(s4));
		System.out.println("8. To lower case : " +s5.toLowerCase());
		System.out.println("9. To upper case : " +s4.toUpperCase());
		
		/*compare to 
		char[] cc=new char[15];
		char[] ch=s1.getChars(1, 9, cc, 0);
		replace and replace all doubt
		== doubt if stored in two memory
		store the string in array ing split and how to print the same and how to passs the index of the word.
		*/
		System.out.println("10. index of substring : "+s1.indexOf("ss"));
		System.out.println("10. index of substring after index 10 : "+s1.indexOf("ss",10));
		System.out.println("10. index of char : "+ s1.indexOf('s'));
		
		String s6 = new String ("Javatpoint");  
        String s7 = s6.intern();
        String s8= "Javatpoint";
        System.out.println(s6==s7);
        System.out.println("11 . Intern : "+s7);
        boolean ggg=s7==s8;
        System.out.println("11 . Intern with e1uals: "+ggg);
                
        String s9= "";
        System.out.println("12.Is Empty : " +s9.isEmpty());
        
        String join= String.join("_", s4,s5,s6,s7);
        System.out.println("13. Join : "+join);
        
		System.out.println("14. Last  index of substring : "+s1.lastIndexOf('s'));
		System.out.println("14. Last  index of substring brfore 25 : "+s1.lastIndexOf('s',25));

        if (s6.length()>0) {
        	System.out.println("15. String is not empty and the lenth is : "+s6.length());
        }
        if(s9.length()==0) {
        	System.out.println("15. String is empty now");
        }
        
        String re = s6.replace('a', 'e');
        System.out.println("16 . Replace : "+re);
        
        String s10="My name is Khan. My name is Bob. My name is Sonoo.";  
        String ree = s10.replace(" ", "");
        System.out.println("17 . Replace All : "+ree);

        String[] Words = s10.split("\\s");
        
        System.out.println("18 Split and lenth of array : "+Words.length);
        
        String s11= "Javatpoint";
        char[] chaa = s11.toCharArray();
        System.out.print("19. To char array : ");
        for (int i=s11.length()-1; i >= 0; i--) {
        	System.out.print(chaa[i]);
			
		}
    	System.out.println();

        String s12= "    Java t point    ";
        String trim = s12.trim();
        System.out.println("20. After trim result is : "+trim);
        
        int num=30;
        String sss=String.valueOf(num);
        System.out.println("21. concatenating string with 10  uing balue of :"+sss+10);
        

        
        
        
	}

}
