package sg.edu.rp.c346.contactlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvcontact;
    ArrayList<Contactitem> alContactlist;
    CustomAdaptor caContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvcontact = findViewById(R.id.listViewContact);
        alContactlist = new ArrayList<>();

        Contactitem con1 = new Contactitem("Mary","+65",65442334);
        Contactitem con2 = new Contactitem("Ken","+65",97442437);

        alContactlist.add(con1);
        alContactlist.add(con2);

        caContact = new CustomAdaptor(this, R.layout.contact_item, alContactlist);

        lvcontact.setAdapter(caContact);
    }
}
