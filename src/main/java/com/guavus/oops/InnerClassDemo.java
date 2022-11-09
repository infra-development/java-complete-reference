package com.guavus.oops;

public class InnerClassDemo {
    public static void main(String[] args) {
        Bank b1 = new Bank(11);
        System.out.println("Final interest per year : "+b1.computeInterestPerYear(100000));
        System.out.println("Final interest per month : "+b1.computeInterestPerMonth(100000));
    }
}

/* No other class can access the object of Inner class InterestRate
Only outer class Bank can create its object
Modification to the InterestRate is only possible from Bank class only.
 */
class Bank {
    // This field can be accessible by inner class
    private double rate;

    Bank(int rate) {
        this.rate = rate;
    }

    public double computeInterestPerYear(int amount) {
        // Calling inner class method through inner class object
        InterestRate ir = new InterestRate(1);
        return ir.calculateInterest(amount);
    }

    public double computeInterestPerMonth(int amount) {
        // Calling inner class method through inner class object
        InterestRate ir = new InterestRate(0.0833);
        return ir.calculateInterest(amount);
    }

    class InterestRate {
        // This field is not accessible to outer class
        private double timeInterval=0.0833;
        InterestRate(double timeInterval) {
            this.timeInterval = timeInterval;

        }
        double calculateInterest(int amount) {
            return (amount * rate * timeInterval) / 100;
        }
    }

}
