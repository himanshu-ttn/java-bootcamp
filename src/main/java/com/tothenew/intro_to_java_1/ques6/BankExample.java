package com.tothenew.intro_to_java_1.ques6;

public class BankExample {
    static void main(String[] args) {
        SBI sbi = new SBI("Noida SBI", "Mumbai Office", "XYZ", 541, 6.2, 9.5, 7.3, 10000);
        Bank x = new ICICI("Noida ICICI", "Mumbai Office", "ABC", 451, 4.5, 10.5, 8.6, 50000);
        BOI boi = new BOI("Delhi BOI", "Delhi Main Offic", "MNO", 651, 4.5, 10.5, 8.6, 25000);

        System.out.println(sbi.toString());
        System.out.println(x.toString());
        System.out.println(boi.toString());
    }
}
