package com.example.janina.deomo1.com.teacher;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.janina.deomo1.MainActivityDemo1;
import com.example.janina.deomo1.R;
import com.example.janina.deomo1.com.home.HomeActivity;
import com.example.janina.deomo1.com.student.StudentActivity;

public class TeacherActivity extends Activity {

    TextView sorif_sir,zahid_sir,hanif_sir,imdad_sir,jugul_sir;
    TextView hk_sir,gm_sir,liton_sir,choyn_sir,israt_mam;
    TextView sonjit_sir,tori_mam,tanjila_mam;
    Button nextTeacher,menuTeacher;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher);

        sorif_sir = (TextView)findViewById(R.id.shorif_sir);
        zahid_sir = (TextView)findViewById(R.id.zahid_sir);
        hanif_sir = (TextView)findViewById(R.id.hanif_sir);
        imdad_sir = (TextView)findViewById(R.id.imdad_sir);
        jugul_sir = (TextView)findViewById(R.id.jugul_sir);
        hk_sir = (TextView)findViewById(R.id.hk_sir);
        gm_sir = (TextView)findViewById(R.id.gm_sir);
        liton_sir = (TextView)findViewById(R.id.liton_sir);
        choyn_sir = (TextView)findViewById(R.id.choyn_sir);
        israt_mam = (TextView)findViewById(R.id.israt_mam);
        sonjit_sir = (TextView)findViewById(R.id.sonjit_sir);
        tori_mam = (TextView)findViewById(R.id.tori_mam);
        tanjila_mam = (TextView)findViewById(R.id.tanjila_mam);

        nextTeacher = (Button)findViewById(R.id.nextTeacher);
        menuTeacher = (Button)findViewById(R.id.menuTeacher);

        sorif_sir.setOnClickListener(

               new TextView.OnClickListener() {

            public void onClick (View v){
                Intent startSorifSir = new Intent(getApplicationContext(), ShorifSirActivity.class);
                startActivity(startSorifSir);
            }
        }

        );

        zahid_sir.setOnClickListener(
                new TextView.OnClickListener(){
                    public void onClick(View v){
                        Intent startZahidSir = new Intent(getApplicationContext(),ZahidSirActivity.class);
                        startActivity(startZahidSir);
                    }
                }
        );

        hanif_sir.setOnClickListener(
                new TextView.OnClickListener(){
                    public void onClick(View v){
                        Intent startHanifSir = new Intent(getApplicationContext(),HanifSirActivity.class);
                        startActivity(startHanifSir);
                    }
                }
        );

        jugul_sir.setOnClickListener(
                new TextView.OnClickListener(){
                    public void onClick(View v){
                        Intent startJugulSir = new Intent(getApplicationContext(),JugulSirActivity.class);
                        startActivity(startJugulSir);
                    }
                }
        );

        imdad_sir.setOnClickListener(
                new TextView.OnClickListener(){
                    public void onClick(View v){
                        Intent startImdadSir = new Intent(getApplicationContext(),ImdadSirActivity.class);
                        startActivity(startImdadSir);
                    }
                }
        );

        hk_sir.setOnClickListener(
                new TextView.OnClickListener(){
                    public void onClick(View v){
                        Intent startHkSir = new Intent(getApplicationContext(),HkSirActivity.class);
                        startActivity(startHkSir);
                    }
                }
        );

        gm_sir.setOnClickListener(
                new TextView.OnClickListener() {
                    public void onClick(View v) {
                        Intent startGmSir = new Intent(getApplicationContext(), GmSirActivity.class);
                        startActivity(startGmSir);
                    }
                }
        );

        liton_sir.setOnClickListener(
                new TextView.OnClickListener() {
                    public void onClick(View v) {
                        Intent startLitonSir = new Intent(getApplicationContext(), LitonSirActivity.class);
                        startActivity(startLitonSir);
                    }
                }
        );

        choyn_sir.setOnClickListener(
                new TextView.OnClickListener() {
                    public void onClick(View v) {
                        Intent startChoynSir = new Intent(getApplicationContext(), ChoynSirActivity.class);
                        startActivity(startChoynSir);
                    }
                }
        );

        israt_mam.setOnClickListener(
                new TextView.OnClickListener() {
                    public void onClick(View v) {
                        Intent startIsratMam = new Intent(getApplicationContext(), IsratMamActivity.class);
                        startActivity(startIsratMam);
                    }
                }
        );

        sonjit_sir.setOnClickListener(
                new TextView.OnClickListener() {
                    public void onClick(View v) {
                        Intent starSonjitSir = new Intent(getApplicationContext(), SonjitSirActivity.class);
                        startActivity(starSonjitSir);
                    }
                }
        );

        tanjila_mam.setOnClickListener(
                new TextView.OnClickListener() {
                    public void onClick(View v) {
                        Intent startTanjilaMam = new Intent(getApplicationContext(), TanjilaMamActivity.class);
                        startActivity(startTanjilaMam);
                    }
                }
        );

        tori_mam.setOnClickListener(
                new TextView.OnClickListener() {
                    public void onClick(View v) {
                        Intent startToriMam = new Intent(getApplicationContext(), ToriMamActivity.class);
                        startActivity(startToriMam);
                    }
                }
        );
        nextTeacher.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        Intent next = new Intent(getApplicationContext(), StudentActivity.class);
                        startActivity(next);
                    }
                }
        );
        menuTeacher.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        Intent menu = new Intent(getApplicationContext(), MainActivityDemo1.class);
                        startActivity(menu);

                    }
                }
        );



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_teacher, menu);
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
