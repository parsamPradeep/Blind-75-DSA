package com.blind.string;

public class ValidPalindrome {
	public static boolean isPalindrome1(String s) {
        s=s.replaceAll("[^a-zA-Z0-9]", "");
        String res="";
        for(int i=s.length()-1;i>=0;i--)
            res+=s.charAt(i);
        return s.equalsIgnoreCase(res)?true:false;
    }
	
	public static boolean isPalindrome2(String s) {
        int head=0,tail=s.length()-1;
        while(head<=tail){
            char cHead=s.charAt(head);
            char cTail=s.charAt(tail);
            if(!Character.isLetterOrDigit(cHead))
                head++;
            else if(!Character.isLetterOrDigit(cTail))
                tail--;
            else {
                if(Character.toLowerCase(cHead)!=Character.toLowerCase(cTail))
                    return false;
                else{
                    head++;
                    tail--;
                }
                  }
        }
        return true;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
