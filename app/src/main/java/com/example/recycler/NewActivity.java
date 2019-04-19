package com.example.recycler;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class NewActivity extends AppCompatActivity {
    CircleImageView circImga;
    TextView tvFullName, tvPhoneNo,tvAddress, tvEmail;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_activity);

        circImga=findViewById(R.id.profile);
        tvFullName=findViewById(R.id.tvdName);
        tvPhoneNo=findViewById(R.id.tvdPhone);
        tvEmail=findViewById(R.id.tvdEmail);
        tvAddress=findViewById(R.id.tvdAddress);

        Bundle bundle=getIntent().getExtras();

        if (bundle !=null){
            circImga.setImageResource(bundle.getInt("image"));
            tvFullName.setText(bundle.getString("name"));
            tvPhoneNo.setText(bundle.getString("phoneNo"));
            tvEmail.setText(bundle.getString("email"));
            tvAddress.setText(bundle.getString("address"));
        }


    }
}
