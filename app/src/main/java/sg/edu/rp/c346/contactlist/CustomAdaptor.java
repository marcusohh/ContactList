package sg.edu.rp.c346.contactlist;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 16020089 on 23/7/2018.
 */

public class CustomAdaptor extends ArrayAdapter {
    Context parent_context;
    int layout_id;
    ArrayList<Contactitem> contactList;


    public CustomAdaptor(@NonNull Context context, int resource, @NonNull ArrayList<Contactitem> objects) {
        super(context, resource, objects);
        parent_context = context;
        layout_id = resource;
        contactList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(layout_id,parent, false );
        TextView tvname = rowView.findViewById(R.id.textViewName);
        TextView tvCC = rowView.findViewById(R.id.textViewCC);
        TextView tvNumber = rowView.findViewById(R.id.textViewnumber);

        Contactitem currentItem = contactList.get(position);

        String name = currentItem.getName();
        String cc = currentItem.getCountrycode();
        Integer number = currentItem.getNumber();
        tvname.setText(name);
        tvCC.setText(cc);
        tvNumber.setText("" +number);
        return rowView;

    }
}
