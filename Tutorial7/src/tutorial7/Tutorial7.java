/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial7;
import java.util.Scanner;
public class Tutorial7 {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner bill = new Scanner(System.in);
        double fnum, snum, answer;
        System.out.println("Enter first num: ");
        fnum = bill.nextDouble();
        System.out.println("Enter second num: ");
        snum = bill.nextDouble();
        answer = fnum + snum;
        System.out.println(answer);
    }
    
}
