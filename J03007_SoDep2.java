package javaptit;
import java.util.Scanner;


public class J03007_SoDep2 {

    public static Scanner ip = new Scanner(System.in);
    
    public static int tn(String a){
        if(a.charAt(0)!='8' || a.charAt(a.length()-1)!='8')
        {
            
            return 0;
        }
        int sum=0;
        for(int i=0;i<a.length();i++)
        {
            sum+=(int)(a.charAt(i)) - (int)('0');
            if(a.charAt(i) != a.charAt(a.length()-1-i))
            {
                
                return 0;
            }            
        }
        if(sum%10!=0) 
        {
            
            return 0;
        }
        return 1;
        
    }

    public static void main(String args[]) {
        int t = ip.nextInt();
        ip.nextLine();
        while(t-->0){
            String s = ip.nextLine();      
            if(tn(s)==1){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
