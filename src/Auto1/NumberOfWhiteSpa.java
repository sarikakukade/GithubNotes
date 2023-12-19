package Auto1;

public class NumberOfWhiteSpa {

	public static void main(String[] args) {
		String s1=" s b s s c d ";
		int count=0;
		for(int i=0;i<=s1.length()-1;i++) {
			char ch=s1.charAt(i);
			if(ch==' ')
			{
				count++; 
				
			}
		}
		System.out.println("number of white spaces :"+count);

	}

}
