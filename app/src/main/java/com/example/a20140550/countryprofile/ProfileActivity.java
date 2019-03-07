package com.example.a20140550.countryprofile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {
    private ImageView imageView;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        imageView= (ImageView) findViewById(R.id.imageViewID);
        textView= (TextView) findViewById(R.id.TextID);

        Bundle bl=getIntent().getExtras();
        if(bl !=null)
        {
            String CountryName=bl.getString("name");
            showDetails(CountryName);
        }

    }
    void showDetails(String CountryName)
    {
        if(CountryName.equals("bangladesh"))
    {
        imageView.setImageResource(R.drawable.parlament);
        textView.setText(R.string.Bangladesh_Text);
    }if(CountryName.equals("india"))
    {
        imageView.setImageResource(R.drawable.tajmohal);
        textView.setText(R.string.India_Text);
    }if(CountryName.equals("pakistan"))
    {
        imageView.setImageResource(R.drawable.wazirkhan);
        textView.setText(R.string.Pakistan_Text);
    }
}
}
