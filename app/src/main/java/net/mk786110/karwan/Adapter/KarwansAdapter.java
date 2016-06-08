package net.mk786110.karwan.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import net.mk786110.karwan.Model.Karwans;
import net.mk786110.karwan.R;

import java.util.ArrayList;

/**
 * Created by developer on 6/8/16.
 */
public class KarwansAdapter extends ArrayAdapter<Karwans> {
    Context context;

    public KarwansAdapter(Context _context, int resource, ArrayList<Karwans> objects) {
        super(_context, resource, objects);
        this.context = _context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Karwans items = getItem(position);
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.activity_karwans_row, parent, false);

        TextView karwan_name=(TextView) rowView.findViewById(R.id.karwans_row_textView_karwan_name);
        TextView karwan_salarNmae=(TextView) rowView.findViewById(R.id.karwans_row_textView_karwan_salarName);
        TextView karwan_contactNo=(TextView) rowView.findViewById(R.id.karwans_row_textView_karwan_contactNo);
        TextView karwan_pakages=(TextView) rowView.findViewById(R.id.karwans_row_textView_karwan_pakages);

        karwan_name.setText(items.getKarwan_name());
        karwan_salarNmae.setText(items.getKarwan_salar());
        karwan_contactNo.setText(items.getKarwan_contac_no());
        karwan_pakages.setText(items.getKarwan_pakages());

        return rowView;
    }
}
