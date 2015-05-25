package com.example.janina.deomo1.com.teacher;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.janina.deomo1.R;

public class ChoynSirActivity extends ActionBarActivity {
    ImageView choynSirImage;
    TextView choynSirDetails;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choyn_sir);

        choynSirImage = (ImageView)findViewById(R.id.choyn_sir);
        choynSirDetails = (TextView)findViewById(R.id.choyn_sir_details);

        choynSirDetails.setText("??????????? ????? \n" +
                " ??? ??????? \n" +
                "????? ? ??.??.?\n" +
                "???????????? ?????????????\n" +
                "??? ?  3521321321321\n" +
                "?-???? ? fcghfdhtf@gmail.com\n");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_choyn_sir, menu);
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
