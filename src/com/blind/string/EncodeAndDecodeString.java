package com.blind.string;

public class EncodeAndDecodeString {
	public static String encode(String[] str) {
		String s="";
		for(int i=0;i<str.length;i++) {
			s+=str[i].length()+"#"+str[i];
		}
	return s;
	}
	public static String[] decode(String str, int len) {
		String res[]=new String[len];
		int k=0;
			for(int i=0;i<str.length();i++) {
				int j=i;
				while(str.charAt(j)!='#')
					j+=1;
				int strlen=Integer.parseInt(str.substring(i, j));
				String s=str.substring(j+1, j+strlen+1);
				res[k++]=s;
				i=j+strlen;
			}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[]= {"lint","code","love","you"};
		String s=encode(str);
		System.out.println(s);
		str=decode(s, str.length);
		System.out.println(str);
	}

}
