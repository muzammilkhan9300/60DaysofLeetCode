//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int choice = Integer.parseInt(in.readLine());
            String a[] = in.readLine().trim().split("\\s+");
            List<Double> arr = new ArrayList<Double>();
            for(int i = 0;i < choice;i++)
                arr.add(Double.parseDouble(a[i]));
            
            Solution ob = new Solution();
            if(choice == 1)
                System.out.println(String.format("%.2f", ob.switchCase(choice, arr)));
            else
                System.out.println((int)ob.switchCase(choice, arr));
        }
    }
}
// } Driver Code Ends


// Back-end complete function Template for Java

class Solution{
    // function to calculate value based on choice and input array
    static double switchCase(int choice, List<Double> arr){
        double value = 0.0;
        switch(choice) {
            case 1:
                // calculating area of a circle
                value = Math.PI*arr.get(0)*arr.get(0);
                break;
            case 2:
                // calculating area of a rectangle
                value = arr.get(0)*arr.get(1);
                break;
        }
        return value;
    }
}