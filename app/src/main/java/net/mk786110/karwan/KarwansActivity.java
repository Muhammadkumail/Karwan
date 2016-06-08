package net.mk786110.karwan;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import net.mk786110.karwan.Adapter.KarwansAdapter;
import net.mk786110.karwan.Datasource.KarwansDatasource;
import net.mk786110.karwan.Model.Karwans;

import java.util.ArrayList;

public class KarwansActivity extends AppCompatActivity {

    KarwansDatasource mkarwansDatasource;
    ListView karwansListView;
    Context context;
    KarwansAdapter mkarwansAdapter;
    ArrayList<Karwans> mKarwanArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context = this;
        setContentView(R.layout.activity_karwans);

        karwansListView = (ListView) findViewById(R.id.karwan_listview);
        mkarwansDatasource = new KarwansDatasource();
        mKarwanArrayList = mkarwansDatasource.getArrayListKarwan();


        mkarwansAdapter=new KarwansAdapter(context,R.layout.activity_karwans_row,mKarwanArrayList);
        karwansListView.setAdapter(mkarwansAdapter);

    }

}
