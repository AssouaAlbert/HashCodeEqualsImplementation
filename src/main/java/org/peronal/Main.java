package org.peronal;

public class Main {
    public static void main(String[] args) {
        Money income = new Money(55, "USD");
        Money expenses = new Money(55, "USD");
        System.out.println("========================================================================");
        System.out.println("Object.equals() and obj1.equals(obj2) compares By Reference address");
        System.out.println("========================================================================");
        boolean balanced1 = income.equals(expenses);
        System.out.println(balanced1);
        boolean balanced2 = income == expenses;
        System.out.println(balanced2);
        System.out.println("========================================================================");
        System.out.println("Example Using WrongVoucher");
        System.out.println("========================================================================");
        Money cash = new Money(42, "USD");
        WrongVoucher voucher = new WrongVoucher(42, "USD", "Amazon");
        System.out.println(voucher.equals(cash));// => false // As expected.
        System.out.println(cash.equals(voucher));// => true // That's wrong.
        System.out.println("========================================================================");
        System.out.println("Fixing Axample Above Using Voucher");
        System.out.println("========================================================================");
        Money cash1 = new Money(42, "USD");
        Voucher voucher1 = new Voucher(42, "USD", "Amazon");
        System.out.println(voucher1.equals(cash1));
        System.out.println(cash1.equals(voucher1));
    }
}