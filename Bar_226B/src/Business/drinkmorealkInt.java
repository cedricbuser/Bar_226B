package Business;

import java.util.ArrayList;


public interface drinkmorealkInt {
    public double getPrice();
    public void setPrice(double price);
    public int getAlcoholPegel();
    public void setAlcoholPegel(int alcoholPegel);
    public ArrayList<Getraenk> addList(Getraenk g);
}