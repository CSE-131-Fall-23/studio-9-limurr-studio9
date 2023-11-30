package studio9;

import java.util.LinkedList;


public class Polynomial {

    private LinkedList<Double> list;

    /**
     * Constructs a Polynomial with no terms yet.
     */
    public Polynomial() {
        list = new LinkedList<>();
    }

 
    public void addTerm(double coeff) {
        list.add(coeff);
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        int power = list.size() - 1;

        for (double coeff : list) {
            if (power == 0) {
                result.append(coeff);
            } else {
                result.append(coeff).append("x^").append(power).append(" + ");
            }
            power--;
        }

        return result.toString();
    }

    /**
     * Evaluates the polynomial for a given value of x.
     *
     * @param x the value at which to evaluate the polynomial
     * @return the value of the polynomial at the given x
     */
    public double evaluate(double x) {
        double result = 0;
        int power = list.size() - 1;

        for (double coeff : list) {
            result += coeff * Math.pow(x, power);
            power--;
        }

        return result;
    }

    /**
     * Computes the derivative of the polynomial.
     *
     * @return a new Polynomial representing the derivative
     */
    public Polynomial derivative() {
        Polynomial derivative = new Polynomial();

        int power = list.size() - 1;
        for (int i = 0; i < list.size() - 1; i++) {
            double coeff = list.get(i) * power;
            derivative.addTerm(coeff);
            power--;
        }

        return derivative;
    }

    /**
     * This is the "equals" method that is called by assertEquals(...) from your
     * JUnit test code.
     * 
     * It compares the Polynomial objects for equality based on their coefficients.
     */
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (!(obj instanceof Polynomial))
            return false;

        Polynomial other = (Polynomial) obj;

        return this.list.equals(other.list);
    }
}