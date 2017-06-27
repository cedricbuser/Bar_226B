package Business;

import java.util.*;


public class Person {
    private int height;
    private double weight;

    public int individuellpegel;

    public Person(int height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    public int getHigh() {
        return height;
    }

    public void setHigh(int high) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

        public double berechneIndividuellpegel(){
        	
        	Random random = new Random();
        	int randomNum = random.nextInt(6) + 5;
        	
        individuellpegel = (int) (height + weight / randomNum + 100);
        System.out.println(individuellpegel);
        return individuellpegel;
    }

}
