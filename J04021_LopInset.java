/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package javaptit;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

class IntSet{
    TreeSet<Integer> s;
    
    public IntSet(){
        this.s = new TreeSet<>();
    }
    public IntSet(int a[]){
        this.s = new TreeSet<>();
        for(int i=0;i<a.length;i++){
            s.add(a[i]);
        }
    }
    public IntSet union(IntSet a){
        IntSet c = new IntSet();
        for(Integer i:a.s){
            c.s.add(i);
        }
        for(Integer i:this.s){
            c.s.add(i);
        }
        return c;
    }
    
    @Override
    public String toString(){
        String g = "";
        for(Integer i:this.s){
            g+= i + " ";
        }
        return g;
    }
}

public class J04021_LopInset {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
        for(int i = 0; i<n; i++) a[i] = sc.nextInt();
        for(int i = 0; i<m; i++) b[i] = sc.nextInt();
        IntSet s1 = new IntSet(a);
        IntSet s2 = new IntSet(b);
        IntSet s3 = s1.union(s2);
        System.out.println(s3);
    }
}
