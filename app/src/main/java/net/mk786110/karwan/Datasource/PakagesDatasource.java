package net.mk786110.karwan.Datasource;

import net.mk786110.karwan.Model.Karwans;
import net.mk786110.karwan.Model.Pakages;

import java.util.ArrayList;

/**
 * Created by developer on 6/8/16.
 */
public class PakagesDatasource {

    ArrayList<Pakages> arrayListKarwan = new ArrayList<>();

    public ArrayList<Pakages> getArrayListPakages() {


        Pakages pakages=new Pakages();

        pakages.setPakage_id("" + 1);
        pakages.setPakage_name("australia");
        pakages.setPakage_location("k1 l1");
        pakages.setPakage_days("34 days");
        pakages.setPakage_date("10/20/16");
        pakages.setPakage_price("1200$");

        arrayListKarwan.add(pakages);

        Pakages pakages2=new Pakages();

        pakages2.setPakage_id("" + 2);
        pakages2.setPakage_name("canada");
        pakages2.setPakage_location("k2 l2");
        pakages2.setPakage_days("30 days");
        pakages2.setPakage_date("11/25/16");
        pakages2.setPakage_price("11000$");

        arrayListKarwan.add(pakages2);

        Pakages pakages3=new Pakages();

        pakages3.setPakage_id("" + 3);
        pakages3.setPakage_name("pakistan");
        pakages3.setPakage_location("k3 l3");
        pakages3.setPakage_days("10 days");
        pakages3.setPakage_date("11/5/16");
        pakages3.setPakage_price("1050$");
        arrayListKarwan.add(pakages3);

        Pakages pakages4=new Pakages();

        pakages4.setPakage_id("" + 3);
        pakages4.setPakage_name("india");
        pakages4.setPakage_location("k3 l3");
        pakages4.setPakage_days("20 days");
        pakages4.setPakage_date("16/5/16");
        pakages4.setPakage_price("1000$");
        arrayListKarwan.add(pakages4);





        return arrayListKarwan;
    }


}
