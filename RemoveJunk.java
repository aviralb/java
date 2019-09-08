package coding1;

public class RemoveJunk {
	public static void main(String[] args) {
		String s=" @#$%!#@$@# I Am Aviral bhardwaj";
		
		String sr = s.replaceAll("[^a-zA-Z0-9 ]", "");
		
		System.out.println(sr);
	}
}
