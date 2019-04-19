package com.example.recycler;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.recycler.adapter.ContactAdapter;
import com.example.recycler.model.Contact;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recyclerView);

        List<Contact> contactList=new ArrayList<>();
        contactList.add(new Contact("Alex", "9843799603", R.drawable.alex,"alex@fmail.com", "Shantinagar"));
        contactList.add(new Contact("Blex", "9813686496", R.drawable.blex, "Blex@fmail.com", "Shantinagar ko Najik"));
        contactList.add(new Contact("Megan", "9841740182", R.drawable.megan, "Megan@fmail.com", "Shantinagar Bhitra Tira"));

        ContactAdapter contactAdapter=new ContactAdapter(this, contactList);
        recyclerView.setAdapter(contactAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}
