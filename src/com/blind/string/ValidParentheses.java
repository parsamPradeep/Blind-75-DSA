package com.blind.string;

import java.util.Stack;

public class ValidParentheses {
	 public static boolean isValid(String s) {
	        //char arr=s.toCharArray();
	        Stack<Character> stack=new Stack<Character>();

	        for(int i=0;i<s.length();i++){
	           if(stack.empty()){
	               stack.push(s.charAt(i));
	           }else{
	               char top=stack.peek();
	               char cur=s.charAt(i);
	               if(cur-top==1||cur-top==2){
	                   stack.pop();
	               }else{
	                   stack.push(s.charAt(i));
	               }
	           }
	        }
	        return stack.empty()?true:false;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
