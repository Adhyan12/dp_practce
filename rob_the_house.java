import java.io.*;
import java.util.*;

public class rob_the_house {

    static Hashtable<Integer, Integer> ht = new Hashtable<>();
    static int a[] = {9,2,11,8};
    public static void main(String[]args)throws IOException{
    
        int i=0,n = a.length;
        System.out.print(rob(i,n));

        
    }
    public static int rob(int i,int n){
        if(i>=n)return 0;
        else{
            if(ht.get(i)!=null)return ht.get(i);
            else{
                ht.put(i, Math.max(a[i]+rob(i+2,n),rob(i+1,n)));
                return ht.get(i);
            }
        }
    }
}

