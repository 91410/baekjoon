package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number2441 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
        int a = 0;
        
        a = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= a; i++){
            for(int j = 1; j <= a; j++){
            	if(i<=j) {
                System.out.print("*");  
            	}else {
            		System.out.print(" ");
				}	
            }System.out.println();
		}
	}
}
