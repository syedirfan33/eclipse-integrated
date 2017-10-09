package fafafafa;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) throws IOException {
		
		List<Integer> numbers = new ArrayList<>();
	    Scanner scanner = new Scanner(System.in);
	    int num = scanner.nextInt();
	    

	    // Get the input
	    while(scanner.hasNextInt()) {
	        numbers.add(scanner.nextInt());
	        System.in.close();
	    }
	    
	    outPut(numbers,num);

	}
	
	public static void outPut(List<Integer> arr , int num)
	{
		
		if(num<=arr.size())
		{
			int k = arr.size()-num;
			System.out.println(arr.get(k));
		}
		else
		{
			System.out.println("NIL");
		}
	}

}
