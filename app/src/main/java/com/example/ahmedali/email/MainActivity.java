package com.example.ahmedali.email;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AnalogClock;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AnalogClock a1 = (AnalogClock) findViewById(R.id.analogClock);

        final EditText e1 = (EditText) findViewById(R.id.emailet);
        final EditText e2 = (EditText) findViewById(R.id.Pnameet);
        final EditText e3 = (EditText) findViewById(R.id.Pinfoet);
        final EditText e4 = (EditText) findViewById(R.id.Pthingset);
        final EditText e5 = (EditText) findViewById(R.id.Subjectet);
        Button b = (Button) findViewById(R.id.sendbnt);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String  emailaddress [] ={e1.getText().toString()};

                String message = "My Name is" + e2.getText().toString() + "My info" + e3.getText().toString() +
                                "I am doing " +e4.getText().toString()+ "w shokrn ";


                Intent i=new Intent(Intent.ACTION_SEND);
                i.putExtra(Intent.EXTRA_EMAIL,emailaddress);
                i.putExtra(Intent.EXTRA_SUBJECT,e5.getText().toString());

                i.setType("plan/text");

                i.putExtra(Intent.EXTRA_TEXT,message);

                startActivity(i);
                Toast.makeText(MainActivity.this,"send Successfuly",Toast.LENGTH_LONG).show();



            }
        });





    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
