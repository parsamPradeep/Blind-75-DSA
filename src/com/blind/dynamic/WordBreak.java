package com.blind.dynamic;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordBreak {
	 public static boolean wordBreak(String s, List<String> wordDict) {
		  boolean dp[]=new boolean[s.length()+1];
	        dp[0]=true;
	        Set<String> set=new HashSet<String>();
	        set.addAll(wordDict);
	        for(int i=1;i<=s.length();i++){
	            for(int j=0;j<i;j++){
	                if(dp[j] && set.contains(s.substring(j,i))){
	                    dp[i]=true;
	                    break;
	                }
	            }
	        }
	        return dp[s.length()];
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String  s = "bb";
		List<String> wordDict = new ArrayList<String>();
		wordDict.add("a");
		wordDict.add("b");
		wordDict.add("bbb");
		wordDict.add("bbbb");
		wordBreak(s, wordDict);
	}

}
