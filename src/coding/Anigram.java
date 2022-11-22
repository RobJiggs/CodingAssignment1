package coding;

import java.util.HashMap;
import java.util.Map;

public class Anigram {
    static Boolean Ag(String a,String b) {
    	
    	boolean anigram=false;
		a=a.toLowerCase();
		b=b.toLowerCase();
		a=a.replaceAll("\\s", "");
		b=b.replaceAll("\\s", "");
		
		if(a.length()!= b.length()) {
			anigram=false;
			
			
		}
		else {
			Map<Character,Integer> s1map= new HashMap<Character,Integer>();
			Map<Character,Integer> s2map= new HashMap<Character,Integer>();
			
			for(int i=0;i<a.length();i++) {
				if (s1map.containsKey(a.charAt(i))) {
					s1map.put(a.charAt(i), s1map.get(a.charAt(i)) + 1);
					
					
				}
				
				else {
					s1map.put(a.charAt(i),1);
					
					
				}
				
				
				
				
				
				
				
				
				
			}
			
			
		for(int i=0;i<b.length();i++) {
			if (s2map.containsKey(b.charAt(i))) {
				s2map.put(b.charAt(i), s2map.get(b.charAt(i)) + 1);
				
				
			}
			
			else {
				s2map.put(b.charAt(i),1);
				
				
			}
			
		}
   
    	
    	if(s1map.equals(s2map)) {
    		
    		anigram=true;
    		
    		
    	}
    }
		
		
		
		
		return anigram;
    }
	
	
	public static void main(String[] args) {
		
	System.out.println(Ag( "motor"  ,"rotom")
	);
			
	}

}
