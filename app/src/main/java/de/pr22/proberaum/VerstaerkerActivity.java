package de.pr22.proberaum;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.widget.Button;

import java.util.HashMap;
import java.util.Map;

public class VerstaerkerActivity extends Refactoring
        implements NavigationView.OnNavigationItemSelectedListener {

    static Map mapSQLNeu = new HashMap();
    private Button buttonVerstaerkerAn;
    private Button buttonVerstaerkerAus;
    private Button buttonEingaengePc;
    private Button buttonEingaengeBt;
    private Button buttonStereoLogic7;
    private Button buttonStereoStereo;
    private Button buttonSurroundDolby;

    public VerstaerkerActivity() {
    }

    public VerstaerkerActivity(sql sql) {
        super();
        mapSQLNeu.putAll(sql.mapSQL);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verstaerker);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActivityRegistry.register(this);
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        buttonVerstaerkerAn = (Button) findViewById(R.id.buttonVerstaerkerAn);
        buttonVerstaerkerAus = (Button) findViewById(R.id.buttonVerstaerkerAus);
        if (mapSQLNeu.get("verstaerker").equals("1")) {
            buttonVerstaerkerAn.getBackground().setColorFilter(Color.rgb(255,20,147), PorterDuff.Mode.MULTIPLY);
        }
        else {
            buttonVerstaerkerAus.getBackground().setColorFilter(Color.rgb(255,20,147), PorterDuff.Mode.MULTIPLY);
        }
        Button buttonVolume1Down = (Button) findViewById(R.id.buttonVolume1Down);
        Button buttonVolume1Up = (Button) findViewById(R.id.buttonVolume1Up);
        Button buttonVolume4Down = (Button) findViewById(R.id.buttonVolume4Down);
        Button buttonVolume4Up = (Button) findViewById(R.id.buttonVolume4Up);
        Button buttonPcVolumeMiddle = (Button) findViewById(R.id.buttonPcVolumeMiddle);
        Button buttonPcVolumeMax = (Button) findViewById(R.id.buttonPcVolumeMax);
        Button buttonMute = (Button) findViewById(R.id.buttonMute);
        Button buttonPlay = (Button) findViewById(R.id.buttonPlay);
        buttonEingaengePc = (Button) findViewById(R.id.buttonEingaengePc);
        buttonEingaengeBt = (Button) findViewById(R.id.buttonEingaengeBt);
        if (mapSQLNeu.get("eingaenge").equals("1")) {
            buttonEingaengePc.getBackground().setColorFilter(Color.rgb(255,20,147), PorterDuff.Mode.MULTIPLY);
        }
        else {
            buttonEingaengeBt.getBackground().setColorFilter(Color.rgb(255,20,147), PorterDuff.Mode.MULTIPLY);
        }
        buttonStereoLogic7 = (Button) findViewById(R.id.buttonStereoLogic7);
        buttonStereoStereo = (Button) findViewById(R.id.buttonStereoStereo);
        if (mapSQLNeu.get("stereo").equals("1")) {
            buttonStereoLogic7.getBackground().setColorFilter(Color.rgb(255,20,147), PorterDuff.Mode.MULTIPLY);
        }
        else if(mapSQLNeu.get("stereo").equals("2")) {

        }
        else {
            buttonStereoStereo.getBackground().setColorFilter(Color.rgb(255,20,147), PorterDuff.Mode.MULTIPLY);
        }
        buttonSurroundDolby = (Button) findViewById(R.id.buttonSurroundDolby);
        if (mapSQLNeu.get("dolby").equals("1")) {
            buttonSurroundDolby.getBackground().setColorFilter(Color.rgb(255,20,147), PorterDuff.Mode.MULTIPLY);
        }


        buttonVerstaerkerAn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/verstärker.php?ein=ON";
                connect(urlLink, v);
                buttonChangeColor(buttonVerstaerkerAn);
                buttonChangeColor2(buttonVerstaerkerAus);
            }

        });
        buttonVerstaerkerAus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/verstärker.php?aus=OFF";
                connect(urlLink, v);
                buttonChangeColor(buttonVerstaerkerAus);
                buttonChangeColor2(buttonVerstaerkerAn);
            }

        });
        buttonVolume1Down.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/verstärker.php?leiser1=- 1";
                connect(urlLink, v);
            }

        });
        buttonVolume1Up.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/verstärker.php?lauter1=+ 1";
                connect(urlLink, v);
            }

        });
        buttonVolume4Down.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/verstärker.php?leiser4=- 4";
                connect(urlLink, v);
            }

        });
        buttonVolume4Up.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/verstärker.php?lauter4=+ 4";
                connect(urlLink, v);
            }

        });
        buttonPcVolumeMiddle.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/pcsound.php?pcmiddle=Middle";
                connect(urlLink, v);
            }

        });
        buttonPcVolumeMax.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/pcsound.php?pcmax=Max";
                connect(urlLink, v);
            }

        });
        buttonMute.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/verstärker.php?mute=Mute";
                connect(urlLink, v);
            }

        });
        buttonPlay.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/verstärker.php?mute=Play";
                connect(urlLink, v);
            }

        });
        buttonEingaengePc.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/verstärker.php?video1=PC";
                connect(urlLink, v);
                buttonChangeColor(buttonEingaengePc);
                buttonChangeColor2(buttonEingaengeBt);
            }

        });
        buttonEingaengeBt.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/verstärker.php?video2=BT";
                connect(urlLink, v);
                buttonChangeColor(buttonEingaengeBt);
                buttonChangeColor2(buttonEingaengePc);
            }

        });
        buttonStereoLogic7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/verstärker.php?logic7=Logic7";
                connect(urlLink, v);
                buttonChangeColor(buttonStereoLogic7 );
                buttonChangeColor2(buttonStereoStereo);
                buttonChangeColor2(buttonSurroundDolby);
            }

        });
        buttonStereoStereo.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/verstärker.php?stereo=Stereo";
                connect(urlLink, v);
                buttonChangeColor(buttonStereoStereo);
                buttonChangeColor2(buttonStereoLogic7);
                buttonChangeColor2(buttonSurroundDolby);
            }

        });
        buttonSurroundDolby.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/verstärker.php?dolby=Dolby";
                connect(urlLink, v);
                buttonChangeColor(buttonSurroundDolby);
                buttonChangeColor2(buttonStereoLogic7);
                buttonChangeColor2(buttonStereoStereo);
            }

        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.verstaerker, menu);
        return true;
    }
}
