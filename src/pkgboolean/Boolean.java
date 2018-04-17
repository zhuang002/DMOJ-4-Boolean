/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgboolean;

import java.util.Scanner;

/**
 *
 * @author zhuan
 */
public class Boolean {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        String s="";
        int i=0;
        do {
            s=sc.next().toLowerCase();
            i++;
        } while (s.equals("not"));
        
        if (i%2==0) {
            System.out.print(!s.equals("true"));
        } else {
            System.out.print(s.equals("true"));
        }
    }
    
}
