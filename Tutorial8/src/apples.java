/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bill
 */
import java.util.Scanner;

public class apples {
    public static void main(String args[]) {
        Scanner bill = new Scanner(System.in);
        
        int girls, boys;
        int people;
        girls = 7;
        boys = 3;
        people = girls % boys;
        System.out.println(people);
    }
}
