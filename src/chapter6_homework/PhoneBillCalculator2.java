package chapter6_homework;

/**
 * Enhance the Phone Bill exercise by redoing it in an object-oriented style.
 * A phone bill should have an id, base cost, number of allotted minutes, and
 * number of minutes used. One should also be able to calculate the overage,
 * tax, and total on a phone bill, and also be able to print an itemized bill.
 * Include the following constructors: default, id-only, all fields. No matter
 * which constructor is used, all fields should be set.
 * Create a class that instantiates a phone bill and prints the itemized bill.
 */

public class PhoneBillCalculator2 {

    public static void main(String args[]){
        PhoneBill bill = new PhoneBill(123456);
        bill.setUsedMinutes(1000);
        bill.printItemizedBill();
    }
}
