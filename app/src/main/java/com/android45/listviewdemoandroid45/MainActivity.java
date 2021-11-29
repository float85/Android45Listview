package com.android45.listviewdemoandroid45;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView lvContact;
    List<ContactDemo> contactDemoList;
    ContactDemo contact01, contact02, contact03, contact04, contact05;

    RelativeLayout btnAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvContact = findViewById(R.id.lvContact);
        btnAdd = findViewById(R.id.btnAdd);
        contactDemoList=new ArrayList<>();

        contact01=new ContactDemo("Adnroid", 999999,false);
        contact02=new ContactDemo("IOS", 888888,false);
        contact03=new ContactDemo(".Net", 333333,false);
        contact04=new ContactDemo("PHP", 222222,false);
        contact05=new ContactDemo("Flutter", 55555,false);

        contactDemoList.add(contact01);
        contactDemoList.add(contact02);
        contactDemoList.add(contact03);
        contactDemoList.add(contact04);
        contactDemoList.add(contact05);

        AdapterContact adapterContact=new AdapterContact(contactDemoList);

        lvContact.setAdapter(adapterContact);

        Intent intent=new Intent(getBaseContext(),AddContactActivity.class);


        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                intent.putExtra("KeyName","Android Studio");
                intent.putExtra("abc",false);

                startActivity(intent);
            }
        });

        lvContact.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                ContactDemo contactDemo=contactDemoList.get(i);

                intent.putExtra("phoneNumber",contactDemo.getPhoneNumber());
                intent.putExtra("abc",true );

                startActivity(intent);

            }
        });

    }
}