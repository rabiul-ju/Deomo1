package com.example.janina.deomo1.com.teacher;

import android.app.Activity;
import android.graphics.Typeface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.janina.deomo1.R;

public class ImdadSirActivity extends Activity {

    ImageView imdadSirImage;
    TextView imdadSirDetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imdad_sir);

        imdadSirImage = (ImageView)findViewById(R.id.imdad_sir);
        imdadSirDetails = (TextView)findViewById(R.id.imdad_sir_details);

        Typeface tf  = Typeface.createFromAsset(getAssets(),"font/Rupali.ttf");
        imdadSirDetails.setTypeface(tf);

        imdadSirDetails.setText("??? ????? ?????\n" +
                "???????\n" +
                "????? ? ??.??.?\n" +
                "???????????? ?????????????\n" +
                "??? ?  ???????????\n" +
                "?-???? ?  imdad@gmail.com\n");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_imdad_sir, menu);
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
