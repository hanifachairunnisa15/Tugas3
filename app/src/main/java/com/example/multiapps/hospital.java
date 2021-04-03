package com.example.multiapps;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class hospital extends ListActivity {
    protected void onCreate (Bundle icicle){
        super.onCreate(icicle);
        String[] listHospital = new String[] {"Rumah Sakit Awal Bros", "Puskesmas", "Puskesmas Pembantu", "Klinik Dr. Encik"};
        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,listHospital));
    }

    protected void onListItemClick (ListView l, View v, int position, long id){
        super.onListItemClick(l, v, position, id);
        Object o = this.getListAdapter().getItem(position);
        String pilih = o.toString();
        tampil(pilih);
    }

    private void tampil(String pilih) {
        try {
            Intent a = null;
            if  (pilih.equals("Rumah Sakit Awal Bros"))
            {
                a = new Intent(this, RSAwalBros.class);
            }
            else if (pilih.equals("Puskesmas"))
            {

            }
            else if (pilih.equals("Puskesmas Pembantu"))
            {

            }
            else if (pilih.equals("Klinik Dr. Encik"))
            {

            }

            startActivity(a);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
