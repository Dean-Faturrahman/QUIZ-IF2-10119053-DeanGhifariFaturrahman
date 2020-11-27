/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.if2.pkg10119053.deanghifarifaturrahman;

import model.Customer;
import java.util.Scanner;
/**
 *
 * @author Dean
 * Nama  : Dean Ghifari Faturrahman
 * Kelas : PBOIF2
 * NIM   : 10119053
 * Deskripsi Program : Program ini berisi program Rock n Roll Haircut
 */
public class QUIZIF210119053DEANGHIFARIFATURRAHMAN {

    public static void main(String[] args) {
        Customer customer = new Customer();
        Scanner input = new Scanner(System.in);
        
        System.out.println("====Program Kasir Rock n Roll Haircut====");
        System.out.print("Customer Name : "); customer.setName(input.nextLine());
        System.out.print("Customer Email : "); customer.setEmail(input.next());
        customer.displayService(); customer.getPrice(input.nextInt());
        System.out.print("Are you Member (yes/no) : "); customer.checkMemberStatus(input.next());
                
        System.out.println("\n\n#*******************************#");
        System.out.println("#********CUSTOMER INVOICE*******#");
        System.out.println("Date Transacntion : "); customer.currentTime();
        System.out.print("Service Price : Rp.");
        System.out.println(customer.getPriceService());
        System.out.println("Discount : Rp. ");
        System.out.print("Total Pay : Rp. ");
        System.out.println(customer.getTotalPay(customer.getPriceService(), 0));
    }
    
}
