package com.example.a20140550.countryprofile;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
private Button BangladeshButton,IndiaButton, PakistanButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BangladeshButton= (Button) findViewById(R.id.BangladeshButton);
        IndiaButton= (Button) findViewById(R.id.IndiaButton);
        PakistanButton= (Button) findViewById(R.id.PakistanButton);

        BangladeshButton.setOnClickListener(this);
        IndiaButton.setOnClickListener(this);
        PakistanButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
       if(v.getId()==R.id.BangladeshButton)
        {
            Intent inta =new Intent(MainActivity.this,ProfileActivity.class);
            inta.putExtra("name","bangladesh");
            startActivity(inta);

        }
        else if(v.getId()==R.id.IndiaButton)
        {
            Intent inta =new Intent(MainActivity.this,ProfileActivity.class);
            inta.putExtra("name","india");
            startActivity(inta);

        }
        else if(v.getId()==R.id.PakistanButton)
        {
            Intent inta =new Intent(MainActivity.this,ProfileActivity.class);
            inta.putExtra("name","pakistan");
            startActivity(inta);

        }

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        AlertDialog.Builder alb;
        alb=new AlertDialog.Builder(MainActivity.this);
        alb.setIcon(R.drawable.al);
        alb.setTitle(R.string.title_Txt);
        alb.setMessage(R.string.message_Txt);
        alb.setCancelable(false);
        alb.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
            finish();
            }
        });


        alb.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
          dialog.cancel();
            }
        });
        
        AlertDialog al=alb.create();
        al.show();
    }
}
