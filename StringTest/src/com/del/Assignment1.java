package com.del;

public class Assignment1 {

	public static void main(String[] args) {
		
		int rows = 8;
		int half = rows/2;
		String star = "*";
		String spaces = " ";
		
		for(int i=0;i<=half;i++)
		{
			for(int j=0;j<=(rows-i);j++)
			{
				System.out.println(spaces + " ");
			}
		
		for(int k=0;k<=i;k++)
		{
			System.out.println(star + " ");
		}
		System.out.println();
		}
		
	}

}
