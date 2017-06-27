package Business;

import Percistance.*;

import java.util.ArrayList;
import java.util.List;

public class DrinkLogic {

	Double Guthabenwert = 300.0;

	Getraenke liste1 = new Getraenke();

	public void addGetraenk(Getraenk g) {
		liste1.addGetraenk(g);
	}

	/**
	 * @return liste1
	 */
	public List<Getraenk> getList() {
		return liste1.getList();
	}
	

}