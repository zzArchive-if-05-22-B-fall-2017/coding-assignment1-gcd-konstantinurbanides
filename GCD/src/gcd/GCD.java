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
        int gcdOne = gcdPrimeFactors(digitOne, digitTwo);
        System.out.println(gcdOne);
        int gcdTwo = gcdEucledian(digitOne,digitTwo);
        System.out.println(gcdTwo);
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
        
        while(a % divider == 0){
            a /= divider;
            listDividerOne.addLast(divider);
            while(a % divider != 0){
                if (a == 1) {
                    break;
                }
                divider++;
            }
        }
        divider = 2;
        while(b % divider == 0){
            b /= divider;
            listDividerTwo.addLast(divider);
            while(b % divider != 0){
                if(b == 1){
                    break;
                }
                divider++;
            }
        }
        
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
        int biggerNumber = b;
        int littlerNumber = a;
        int buffer = 0;
        
        if (a > b) {
            biggerNumber = a;
            littlerNumber = b;
        }
        do {
            buffer = biggerNumber % littlerNumber;
            biggerNumber = littlerNumber;
            littlerNumber = buffer;
        } while (littlerNumber != 0);
        return biggerNumber;
    }
}
