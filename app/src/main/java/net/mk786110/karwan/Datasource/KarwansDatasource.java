package net.mk786110.karwan.Datasource;

import net.mk786110.karwan.Model.Karwans;

import java.util.ArrayList;

/**
 * Created by developer on 6/8/16.
 */
public class KarwansDatasource {

    ArrayList<Karwans> arrayListKarwan = new ArrayList<>();

    public ArrayList<Karwans> getArrayListKarwan() {


        Karwans karwans = new Karwans();

        karwans.setKarwan_id("" + 1);
        karwans.setKarwan_contac_no("0341" + 1 * 20 + "452" + 1 * 76);
        karwans.setKarwan_name("Htc one" + " " + 82 * 1);
        karwans.setKarwan_pakages(1 + "nasir");
        karwans.setKarwan_salar("nokia" + " " + 1);
        arrayListKarwan.add(karwans);


        Karwans karwans1 = new Karwans();

        karwans1.setKarwan_id("" + 2);
        karwans1.setKarwan_contac_no("0341" + 2 * 20 + "452" + 2 * 76);
        karwans1.setKarwan_name("Htc Desire" + " " + 82 * 2);
        karwans1.setKarwan_pakages(2 + "naveed");
        karwans1.setKarwan_salar("nokia" + " " + 2);
        arrayListKarwan.add(karwans1);

        Karwans karwans2 = new Karwans();

        karwans2.setKarwan_id("" + 3);
        karwans2.setKarwan_contac_no("0341" + 3 * 20 + "452" + 3 * 76);
        karwans2.setKarwan_name("lumia" + " " + 82 * 3);
        karwans2.setKarwan_pakages(3 + "pakages");
        karwans2.setKarwan_salar("kumail" + " " + 3);
        arrayListKarwan.add(karwans2);



        return arrayListKarwan;
    }


}
