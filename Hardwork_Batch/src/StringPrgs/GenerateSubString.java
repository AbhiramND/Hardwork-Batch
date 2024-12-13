package StringPrgs;

public class GenerateSubString {
	public static void main(String[] args) {
	      String s="Bangalore";
	      for(int i=0;i<=s.length()-1;i++){
	        for(int j=i+1;j<=s.length();j++){
	          String s1=s.substring(i,j);
	          if(s1.length()>1)
	          System.out.print(s1+" ");
	        }
	        
	      }
	  }
}
