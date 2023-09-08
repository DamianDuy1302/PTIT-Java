
package javaptit;
import java.util.Scanner;

public class J03008_Sodep3 {

    public static Scanner ip = new Scanner(System.in);
    
    public static int nt(int a){
        if(a<2) return 0;
        for(int i=2; i<=Math.sqrt(a);i++)
        {
            if(a%i==0)
            {
                return 0;
            }
        }
        return 1;
    }
    public static int tn(String a){
        for(int i=0;i<a.length();i++)
        {
            if((a.charAt(i)!=a.charAt(a.length()-1-i)))
            {
                return 0;
            }
        }
        
        for(int j=0;j<a.length();j++)
        {
            if((nt((int)a.charAt(j)-48))==0)
            {
                
                return 0;
            }    
        }
        return 1;
    }
    public static void main(String args[]) 
    {
       int t = ip.nextInt();
       ip.nextLine();
       while(t-->0)
       {
           String s = ip.nextLine();
           if(tn(s)==1){
               System.out.println("YES");
           }
           else System.out.println("NO");
       }
    }
}
