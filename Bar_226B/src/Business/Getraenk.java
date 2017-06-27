package Business;

import Percistance.*;

import java.util.ArrayList;

/**
 * Created by wizlamar on 24.06.17.
 */
public class Getraenk implements drinkmorealkInt{
    private double price;
    protected int alcoholPegel;


    public Getraenk(double price, int alcoholPegel) {
        super();
        this.price = price;
        this.alcoholPegel = alcoholPegel;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setAlcoholPegel(int alcoholPegel) {
        this.alcoholPegel = alcoholPegel;
    }

    @Override
    public ArrayList<Getraenk> addList(Getraenk g) {
        return null;
    }

    public double getPrice() {
        return price;
    }

    public int getAlcoholPegel() {
        return alcoholPegel;
    }
}