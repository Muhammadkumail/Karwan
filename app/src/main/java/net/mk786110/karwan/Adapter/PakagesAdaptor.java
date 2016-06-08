package net.mk786110.karwan.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import net.mk786110.karwan.Model.Pakages;
import net.mk786110.karwan.R;

import java.util.ArrayList;

/**
 * Created by developer on 6/8/16.
 */
public class PakagesAdaptor extends ArrayAdapter<Pakages> {
    Context context;

    public PakagesAdaptor(Context _context, int resource, ArrayList<Pakages> objects) {
        super(_context, resource, objects);
        this.context=_context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Pakages items=getItem(position);

        LayoutInflater inflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView=inflater.inflate(R.layout.activity_karwans_pakage_row,parent,false);

        TextView pakage_name=(TextView)rowView.findViewById(R.id.karwans_pakage_row_textView_PakageName);
        TextView pakage_price=(TextView)rowView.findViewById(R.id.karwans_pakage_row_textView_price);
        TextView pakage_date=(TextView)rowView.findViewById(R.id.karwans_pakage_row_textView_date);
        TextView pakage_days=(TextView)rowView.findViewById(R.id.karwans_pakage_row_textView_Days);


        pakage_name.setText(items.getPakage_name());
        pakage_date.setText(items.getPakage_date());
        pakage_price.setText(items.getPakage_price());
        pakage_days.setText(items.getPakage_days());

        return rowView;

    }
}
