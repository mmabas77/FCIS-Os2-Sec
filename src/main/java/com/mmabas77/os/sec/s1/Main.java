/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mmabas77.os.sec.s1;

import com.mmabas77.os.sec.s1.pojo.Employee;

/**
 *
 * @author mmabas77
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Employee employee = new Employee(
                "Mahmoud",
                21,
                9,
                30,
                50
        );
        System.out.println("Employee Should Receive : "+employee.getPayment());
    }
    
}
