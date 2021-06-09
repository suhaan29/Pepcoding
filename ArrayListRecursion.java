package pepcoding.arrayQ;

import java.util.ArrayList;
import java.util.Scanner;


public class ArrayListRecursion {
	
	public static ArrayList<String> printSub(String a)
	{
		if(a.length() == 0)
		{
			ArrayList<String> bes  = new ArrayList<>();
			bes.add("");
			return bes;
		}
		
		char ch = a.charAt(0);
		String ros = a.substring(1);
			ArrayList<String> res = printSub(ros);
			ArrayList<String> mres = new ArrayList<>();
		
		for(String f : res) {
			mres.add("" + f);
			mres.add(ch + f);
		}
		
		return mres;
		
	}
	
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		String a = scn.next();
		ArrayList<String> res = printSub(a);
		System.out.println(res);
	}

}
