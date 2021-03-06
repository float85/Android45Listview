package com.android45.listviewdemoandroid45;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class AdapterContact extends BaseAdapter {
    List<ContactDemo> contactDemoList;

    public AdapterContact(List<ContactDemo> contactDemoList) {
        this.contactDemoList = contactDemoList;
    }

    @Override
    public int getCount() {
        return contactDemoList.size();
    }

    @Override
    public Object getItem(int position) {
        return contactDemoList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        View view =layoutInflater.inflate(R.layout.icon_contact,parent,false);

        TextView tvName=view.findViewById(R.id.tvName);
        TextView tvPhone=view.findViewById(R.id.tvPhone);

        ContactDemo contactDemo =contactDemoList.get(position);

        tvName.setText(contactDemo.getName());
        tvPhone.setText(String.valueOf(contactDemo.getPhoneNumber()));

       


        return view;
    }
}
