package coding1;

public class CodingReverseString {
         public static void main(String[] args) {
			String s="I Am Aviral bhardwaj";
			
			int len=s.length();
			String rev="";
			
			for (int i=len-1;i>=0;i--) {
				rev+=s.charAt(i);
				
			}
			System.out.println(s);
			System.out.println(rev);
         }
         
}
