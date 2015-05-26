package com.example.janina.deomo1.com.home;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.janina.deomo1.MainActivityDemo1;
import com.example.janina.deomo1.R;
import com.example.janina.deomo1.com.teacher.TeacherActivity;

public class HomeActivity extends Activity {

    ImageView homeImage;
    TextView homeDescription;
    Button main_menu,next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        homeImage = (ImageView)findViewById(R.id.home);
        homeDescription = (TextView)findViewById(R.id.homeDescription);
        main_menu = (Button)findViewById(R.id.main_menu);
        next = (Button)findViewById(R.id.nextTeacher);
        show();

        //going tomain menu by clicking

        main_menu.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        Intent menu = new Intent(getApplicationContext(), MainActivityDemo1.class);
                        startActivity(menu);
                    }
                }
        );

        //going to next page;

        next.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        Intent nextIntent = new Intent(getApplicationContext(),TeacherActivity.class);
                        startActivity(nextIntent);
                    }
                }
        );



    }

    private void show() {
        homeDescription.setText(R.string.description_cse_ju);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_home, menu);
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
