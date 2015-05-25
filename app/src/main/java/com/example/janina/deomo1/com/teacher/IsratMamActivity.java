package com.example.janina.deomo1.com.teacher;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.janina.deomo1.R;

public class IsratMamActivity extends ActionBarActivity {

    ImageView isratMamImage;
    TextView isratMamDetails;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_israt_mam);

        isratMamImage = (ImageView)findViewById(R.id.israt_mam);
        isratMamDetails = (TextView)findViewById(R.id.israt_mam_details);

        isratMamDetails.setText("????? ?????\n" +
                "??? ???????\n" +
                "????? ? ??.??.?\n" +
                "???????????? ?????????????\n" +
                "??? ?  2134131431\n" +
                "?-???? ? sdfjhksdjf@gmail.com\n");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_israt_mam, menu);
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
