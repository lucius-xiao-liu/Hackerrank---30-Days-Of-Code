//https://www.hackerrank.com/challenges/30-dictionaries-and-maps/problem

//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        HashMap<String, String> phoneList = new HashMap<String, String>();
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            phoneList.put(name,Integer.toString(phone));
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            if(phoneList.containsKey(s)) {System.out.println(s + "=" + phoneList.get(s));} 
            else{System.out.println("Not found");}
        }
        in.close();

    }
}

