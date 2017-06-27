package Percistance;

import Business.Getraenk;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wizlamar on 24.06.17.
 */
public class Getraenke {
     ArrayList<Getraenk> getreankeliste = new ArrayList<Getraenk>();

    public Getraenke() {
    }

    /**
     * Returnt die Liste
     * @return getreankelist
     */
    public List<Getraenk> getList(){
        return getreankeliste;
    }

    /**
     * Fügt ein Getränke vom Typ drinkmorealkInt hinzu
     * @param e
     */
    public void addGetraenk(Getraenk e){
        getreankeliste.add(e);
    }


}

