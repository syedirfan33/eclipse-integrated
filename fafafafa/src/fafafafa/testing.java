package fafafafa;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class testing {

	public static void main(String[] args) throws IOException {
		 Scanner in = new Scanner(System.in);
	       // final String fileName = System.getenv("OUTPUT_PATH");
	       // BufferedWriter bw = new BufferedWriter();
	        int[] res;
	        int _l;
	        _l = Integer.parseInt(in.nextLine().trim());
	        
	        int _r;
	        _r = Integer.parseInt(in.nextLine().trim());
	        
	        res = oddNumbers(_l, _r);
	        for(int res_i=0; res_i < res.length; res_i++) {
	            System.out.println(String.valueOf(res[res_i]));
	           
	        }
	        
	      

	}
	
	static int[] oddNumbers(int l, int r) {
		
		int count=0;
		for(int m=l;m<=r;m++)
		{
			count++;
		}
		
	       int[] oddNumbers = new int[count/2];
	        int k=0;
	        
	        for(int i=l;i<=r;i++)
	        {
	            if(i%2==1)
	            {
	                oddNumbers[k]=i;
	                k++;
	            }
	        }
	        return oddNumbers;
	}

}
