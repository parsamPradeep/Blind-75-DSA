package com.blind.string;
// https://www.youtube.com/watch?v=b9OgfHDFNlo
import java.util.HashMap;

public class MinimumWindowSubstring {
	 public static String minWindow(String s, String t) {
		 if(s.length()<t.length())
	            return "";
	        if(s.length()==1 && t.length()==1)
	            return s.charAt(0)==t.charAt(0)? t : "";

	        HashMap<Character, Integer> hash=new HashMap<Character, Integer>();
	        for(int i=0;i<t.length();i++)
	            hash.put(t.charAt(i), hash.getOrDefault(t.charAt(i),0)+1);
	        
	        int l=0;
	        int r=0;
	        int expected=0;
	        int res[]={-1,0,0};
	        HashMap<Character, Integer> window=new HashMap<Character, Integer>();
	        while(r<s.length()){
	            char c=s.charAt(r);
	            window.put(c, window.getOrDefault(c,0)+1);
	            if(hash.containsKey(c) && window.get(c).intValue()==hash.get(c).intValue()){
	                expected++;
	            }
	     
	           while(l<=r && expected == hash.size()){
	               if(res[0]==-1 || res[0]>(r-l)+1){
	                   res[0]=(r-l)+1;
	                   res[1]=l;
	                   res[2]=r;
	               }
	                c = s.charAt(l);
	               window.put(c, window.get(c)-1);
	               if(hash.containsKey(c) && window.get(c).intValue() < hash.get(c).intValue()){
	                   expected--;
	               }
	               
	               l++;
	           }
	            r++;
	        }
	  
	        return res[0]==-1?"":s.substring(res[1],res[2]+1);
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "ab";
		String t="b";
		minWindow(s, t);
	}

}
