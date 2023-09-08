
package javaptit;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Vector;

class Pair{
    int t, d;   
    public Pair(int t, int d){
        this.t = t;
        this.d = d;
    }  
}


public class J02009_XepHang {

    static Scanner ip = new Scanner(System.in);
    
    public static void main(String args[]) {
        int n = ip.nextInt();
        Vector<Pair> v = new Vector<>();
        for(int i=0;i<n;i++){
            int t = ip.nextInt();
            int d = ip.nextInt();
            Pair x = new Pair(t, d);
            v.add(x);
        }
        
        Collections.sort(v, new Comparator<Pair>(){
            @Override
            public int compare(Pair a, Pair b){
                if(a.t > b.t){
                    return 1;
                }
                else { 
                    return -1;
                }
            }
        });
        int s=0;
        for(int i=0;i<n;i++){
            if(s<v.get(i).t){
                s = v.get(i).t;
            }
            s+= v.get(i).d;
        }
        System.out.println(s);
        
    }
}
