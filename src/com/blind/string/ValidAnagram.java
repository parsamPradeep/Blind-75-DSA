package com.blind.string;

public class ValidAnagram {
	 public static boolean isAnagram(String s, String t) { 
	        if(s.length()!=t.length())
	            return false;
	   
	        int[] alphabet = new int[26];
	        for (int i = 0; i < s.length(); i++){
	            alphabet[s.charAt(i) - 'a']++;
	            alphabet[t.charAt(i) - 'a']--;
	        } 
	     
	        for (int i : alphabet) if (i != 0) return false;
	        return true;

	    }
	public static void main(String[] args) {
		System.out.println(isAnagram( "anagram","nagaram"));

	}

}
