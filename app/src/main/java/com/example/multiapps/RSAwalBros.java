package com.example.multiapps;

import android.app.ListActivity;
import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class RSAwalBros extends ListActivity {
    protected void onCreate (Bundle icicle){
        super.onCreate(icicle);
        String[] listHospitalAct = new String[] {"Call Center", "SMS", "Direction", "Web Page", "Google Info", "Exit"};
        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,listHospitalAct));
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
            if  (pilih.equals("Call Center"))
            {
                String callAwalBros = "tel:0761-7364347";
                a = new Intent(Intent.ACTION_DIAL, Uri.parse(callAwalBros));
            }
            else if (pilih.equals("SMS"))
            {
                String msgAwalBros = "Hanifa";
                a = new Intent(Intent.ACTION_VIEW);
                a.setData(Uri.parse("sms:081234567891"));
                a.putExtra("sms_body",msgAwalBros);
            }
            else if (pilih.equals("Direction"))
            {
                String locAwalBros = "google.navigation:q=1.1236007,104.0165679";
                a = new Intent(Intent.ACTION_VIEW,Uri.parse(locAwalBros));
            }
            else if (pilih.equals("Web Page"))
            {
                String webAwalBros = "http://awalbros.com/branch/pekanbaru/";
                a = new Intent(Intent.ACTION_VIEW,Uri.parse(webAwalBros));
            }
            else if (pilih.equals("Google Info"))
            {
                a = new Intent(Intent.ACTION_WEB_SEARCH);
                a.putExtra(SearchManager.QUERY,"Rumah Sakit Awal Bros");
            }
            startActivity(a);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
