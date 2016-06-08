package net.mk786110.karwan;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import net.mk786110.karwan.Adapter.PakagesAdaptor;
import net.mk786110.karwan.Datasource.PakagesDatasource;
import net.mk786110.karwan.Model.Pakages;

import java.util.ArrayList;

public class KarwansPakagesActivity extends AppCompatActivity {


    PakagesDatasource mpakagesDatasource;
    PakagesAdaptor mpakagesAdaptor;
    Context context;
    ArrayList<Pakages> mPakageArrayList;
    ListView mPakagesListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context = this;
        setContentView(R.layout.activity_karwans_pakages);

        mPakagesListView=(ListView) findViewById(R.id.karwan_pakages_listview);

        mpakagesDatasource = new PakagesDatasource();
        mPakageArrayList = mpakagesDatasource.getArrayListPakages();

        mpakagesAdaptor=new PakagesAdaptor(context,R.layout.activity_karwans_pakage_row,mPakageArrayList);

        mPakagesListView.setAdapter(mpakagesAdaptor);


    }
}
