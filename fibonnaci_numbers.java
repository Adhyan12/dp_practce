 import java.util.*;
 import java.io.*;

 class Main{

    public static void main(String[]args)throws IOException{
        BufferedReader k = new BufferedReader(new InputStreamReader(System.in));
        int n;
        System.out.print("Enter value: ");
        n = Integer.parseInt(k.readLine());
        System.out.println("The fibo number is: "+fibo(n));

    }
    static Hashtable<Integer,Integer> ht = new Hashtable<>();

    public static int fibo(int n){
        if(n==1||n==2){
            return 1;

        }
        else{
            if(ht.get(n)!=null){
                return ht.get(n);
            }
            else{
                ht.put(n,fibo(n-1)+fibo(n-2));
                return ht.get(n);
            }
        }
    }
 }