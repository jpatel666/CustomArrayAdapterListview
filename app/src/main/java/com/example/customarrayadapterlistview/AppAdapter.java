package com.example.customarrayadapterlistview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class AppAdapter extends BaseAdapter {    //Alt+Enter

    // In ListView & GridView:-extends BaseAdapter {....}

    MainActivity mainActivity;

    String[] appname;

    int[] appicon;

    public AppAdapter(MainActivity mainActivity, String[] appname, int[] appicon) {

        this.mainActivity = mainActivity;

        this.appname = appname;

        this.appicon = appicon;
    }

    @Override
    public int getCount() {
        return appicon.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {  //convertView  //parent

            //                                                                             //
        convertView = LayoutInflater.from(mainActivity).inflate(R.layout.app_item_layout,parent,false);

        ImageView ivAppicon = convertView.findViewById(R.id.ivAppicon);
        TextView tvAppname = convertView.findViewById(R.id.tvAppname);

        String str = appname[position];
        tvAppname.setText(str);

        int img = appicon[position];
        ivAppicon.setImageResource(img);

        return convertView;
    }
}
