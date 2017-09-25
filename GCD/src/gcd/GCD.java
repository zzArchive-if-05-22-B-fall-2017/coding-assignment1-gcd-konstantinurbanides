/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gcd;
import java.util.Scanner;
import java.util.LinkedList;
//import jdk.nashorn.internal.objects.annotations.Constructor;
/**
 *
 * @author konst
 */
public class GCD {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int digitOne, digitTwo;
        System.out.print("First Number: ");
        digitOne = input.nextInt();
        System.out.print("Second Number: ");
        digitTwo = input.nextInt();
        System.out.println(gcdPrimeFactors(digitOne, digitTwo));
        System.out.println(gcdEucledian(digitOne,digitTwo));
    }
    
    /**
     *
     * @param a
     * @param b
     * @return
     */
    public static int gcdPrimeFactors(int a, int b){
        LinkedList<Integer> listDividerOne = new LinkedList<>();
        LinkedList<Integer> listDividerTwo = new LinkedList<>();
        int gcd = 1;
        int divider = 2;
        if (a == 0 || b == 0) {
            return 0;
        }
        if(a == 1 || b == 1){
            return 1;
        }
        
        do {
            while(a % divider != 0){
                if (a == 1) {
                    break;
                }
                divider++;
            }
            a /= divider;
            listDividerOne.addLast(divider);
        } while (a != 1);
        divider = 2;
        do {
            while(b % divider != 0){
                if (b == 1) {
                    break;
                }
                divider++;
            }
            b /= divider;
            listDividerTwo.addLast(divider);
            
        } while (b != 1);
        
        for(Integer i : listDividerOne){
            for(Integer j : listDividerTwo){
                if(i == j){
                 listDividerTwo.remove(j);
                 gcd *= i;
                 break;
                }  
            }
        }
        return gcd;
    }
    
    public static int gcdEucledian(int a, int b){
        if(b == 0){
            return a;
        }
            return gcdEucledian(b, a % b);
    }
}
