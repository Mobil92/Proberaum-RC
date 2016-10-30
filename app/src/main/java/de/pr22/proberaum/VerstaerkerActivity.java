package de.pr22.proberaum;

import android.os.Bundle;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.widget.Button;

public class VerstaerkerActivity extends Refactoring
        implements NavigationView.OnNavigationItemSelectedListener {

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

        Button buttonVerstaerkerAn = (Button) findViewById(R.id.buttonVerstaerkerAn);
        Button buttonVerstaerkerAus = (Button) findViewById(R.id.buttonVerstaerkerAus);
        Button buttonVolume1Down = (Button) findViewById(R.id.buttonVolume1Down);
        Button buttonVolume1Up = (Button) findViewById(R.id.buttonVolume1Up);
        Button buttonVolume4Down = (Button) findViewById(R.id.buttonVolume4Down);
        Button buttonVolume4Up = (Button) findViewById(R.id.buttonVolume4Up);
        Button buttonPcVolumeMiddle = (Button) findViewById(R.id.buttonPcVolumeMiddle);
        Button buttonPcVolumeMax = (Button) findViewById(R.id.buttonPcVolumeMax);
        Button buttonMute = (Button) findViewById(R.id.buttonMute);
        Button buttonPlay = (Button) findViewById(R.id.buttonPlay);
        Button buttonEingaengePc = (Button) findViewById(R.id.buttonEingaengePc);
        Button buttonEingaengeBt = (Button) findViewById(R.id.buttonEingaengeBt);
        Button buttonStereoLogic7 = (Button) findViewById(R.id.buttonStereoLogic7);
        Button buttonStereoStereo = (Button) findViewById(R.id.buttonStereoStereo);
        Button buttonSurroundDolby = (Button) findViewById(R.id.buttonSurroundDolby);

        buttonVerstaerkerAn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/verstärker.php?ein=ON";
                connect(urlLink, v);
            }

        });
        buttonVerstaerkerAus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/verstärker.php?aus=OFF";
                connect(urlLink, v);
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
            }

        });
        buttonEingaengeBt.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/verstärker.php?video2=BT";
                connect(urlLink, v);
            }

        });
        buttonStereoLogic7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/verstärker.php?logic7=Logic7";
                connect(urlLink, v);
            }

        });
        buttonStereoStereo.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/verstärker.php?stereo=Stereo";
                connect(urlLink, v);
            }

        });
        buttonSurroundDolby.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/verstärker.php?dolby=Dolby";
                connect(urlLink, v);
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
