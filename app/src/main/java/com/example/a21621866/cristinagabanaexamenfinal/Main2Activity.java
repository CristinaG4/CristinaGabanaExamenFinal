package com.example.a21621866.cristinagabanaexamenfinal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.*;

public class Main2Activity extends AppCompatActivity {

    ImageView btnTwitter, btnYoutube, btnInstagram, btnFacebook;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btnTwitter= findViewById(R.id.btnTwitter);
        btnYoutube= findViewById(R.id.btnYoutube);
        btnInstagram= findViewById(R.id.btnInstagram);
        btnFacebook = findViewById(R.id.btnFacebook);

        btnTwitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(Main2Activity.this,"going Twitter", Toast.LENGTH_LONG );
                toast.show();
            }
        });

        btnYoutube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(Main2Activity.this,"going Youtube", Toast.LENGTH_LONG );
                toast.show();
            }
        });

        btnInstagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(Main2Activity.this,"going Instagram", Toast.LENGTH_LONG );
                toast.show();
            }
        });

        btnFacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(Main2Activity.this,"going Facebook", Toast.LENGTH_LONG );
                toast.show();
            }
        });

    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
// Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_appbar, menu);
        return true;
    }

    //APPBAR
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.book)
        {
            Toast toast = Toast.makeText(this,"going BOOK", Toast.LENGTH_LONG );
            toast.show();
        }
        if (id == R.id.laptop)
        {
            Toast toast = Toast.makeText(this,"going LAPTOP", Toast.LENGTH_LONG );
            toast.show();
        }
        if (id == R.id.alumni)
        {
            Toast toast = Toast.makeText(this,"going Alumni", Toast.LENGTH_LONG );
            toast.show();
        }
        if (id == R.id.perfil)
        {
            Toast toast = Toast.makeText(this,"going Perfil", Toast.LENGTH_LONG );
            toast.show();
        }

        return super.onOptionsItemSelected(item);
    }
}
