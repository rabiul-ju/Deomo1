package com.example.janina.deomo1;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.example.janina.deomo1.com.home.HomeActivity;
import com.example.janina.deomo1.com.teacher.TeacherActivity;


public class MainActivityDemo1 extends Activity {

    Button home,teacher,communication,emcs,vobon,achivement,courses,student;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity_demo1);

        home = (Button)findViewById(R.id.home);
        teacher = (Button)findViewById(R.id.teacher);
        communication = (Button)findViewById(R.id.communication);
        emcs = (Button)findViewById(R.id.emcs);
        vobon = (Button)findViewById(R.id.vobon);
        achivement = (Button)findViewById(R.id.achivement);
        courses = (Button)findViewById(R.id.courses);
        student= (Button)findViewById(R.id.student);

        home.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        Intent homeIntent = new Intent(getApplicationContext(), HomeActivity.class);
                        startActivity(homeIntent);
                    }
                }

        );

        teacher.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        Intent teacherIntent = new Intent(getApplicationContext(), TeacherActivity.class);
                        startActivity(teacherIntent);
                    }
                }
        );
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_activity_demo1, menu);
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
