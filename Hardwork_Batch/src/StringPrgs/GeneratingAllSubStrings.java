package StringPrgs;

public class GeneratingAllSubStrings {

	public static void main(String[] args) {
		String s="Maps";//M Ma Map Maps a ap aps p ps s
		
		for(int i=0;i<=s.length();i++) {
			for(int j=1+i;j<=s.length();j++) {
				System.out.print(s.substring(i,j)+" ");
			}
		}
	}
}
/*
 * Maps---->Ma Map Maps ap aps ps
 * generate all substring with length greater than 2
 * aabbaab generate substring---> aa bb  abba baab
 * 
 * Bangalore -->ore is there in the given string
 */


