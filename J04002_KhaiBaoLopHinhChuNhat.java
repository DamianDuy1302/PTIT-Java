package javaptit;

import java.util.Scanner;

class rectangle{
    public double a, b;
    public String color;
    
    public rectangle(double a, double b, String color){
        this.a=a;
        this.b=b;
        this.color = color;
    }
    public double findArea(){
        return a*b;
    }
    public double findPerimeter(){
        return (a+b)*2;
    }
    
    public String getColor(){
        String ans = color.substring(0, 1).toUpperCase() + color.substring(1).toLowerCase();
        return ans;
    }
    @Override
    public String toString(){
        return String.format("%d %d %s", (int) findPerimeter(), (int) findArea(), getColor());
    }
}

public class J04002_KhaiBaoLopHinhChuNhat
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        String color = sc.next();
            
        if(a>0 && b>0){
            rectangle t = new rectangle(a, b, color);
            System.out.println(t);
        }
        else{
            System.out.println("INVALID");
        }
        
    }
    
}