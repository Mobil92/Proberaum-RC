package de.pr22.proberaum;

import android.os.Bundle;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.widget.Button;

public class MultimediaActivity extends Refactoring
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multimedia);
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

        Button buttonKinoModusAn = (Button) findViewById(R.id.buttonKinoModusAn);
        Button buttonKinoModusAus = (Button) findViewById(R.id.buttonKinoModusAus);
        Button buttonFilmStart = (Button) findViewById(R.id.buttonFilmStart);
        Button buttonFilmPause = (Button) findViewById(R.id.buttonFilmPause);
        Button buttonPcAn = (Button) findViewById(R.id.buttonPcAn);
        Button buttonPcAus = (Button) findViewById(R.id.buttonPcAus);
        Button buttonPcMonitorAn = (Button) findViewById(R.id.buttonPcMonitorAn);
        Button buttonPcMonitorAus = (Button) findViewById(R.id.buttonPcMonitorAus);
        Button buttonTvMonitorAn = (Button) findViewById(R.id.buttonTvMonitorAn);
        Button buttonTvMonitorAus = (Button) findViewById(R.id.buttonTvMonitorAus);
        Button buttonBeamerAn = (Button) findViewById(R.id.buttonBeamerAn);
        Button buttonBeamerAus = (Button) findViewById(R.id.buttonBeamerAus);
        Button buttonLeinwandAn = (Button) findViewById(R.id.buttonLeinwandAn);
        Button buttonLeinwandAus = (Button) findViewById(R.id.buttonLeinwandAus);
        Button buttonVerstaerkerAn = (Button) findViewById(R.id.buttonVerstaerkerAn);
        Button buttonVerstaerkerAus = (Button) findViewById(R.id.buttonVerstaerkerAus);
        Button buttonIpadAn = (Button) findViewById(R.id.buttonIpadAn);
        Button buttonIpadAus = (Button) findViewById(R.id.buttonIpadAus);

        buttonKinoModusAn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/kinoan.php?an=Kino an!";
                connect(urlLink, v);
            }

        });
        buttonKinoModusAus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/kinoaus.php?aus=Kino aus!";
                connect(urlLink, v);
            }

        });
        buttonFilmStart.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/filmstart.php?an=Film Start!";
                connect(urlLink, v);
            }

        });
        buttonFilmPause.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/kinopause.php?aus=Kino Pause!";
                connect(urlLink, v);
            }

        });
        buttonPcAn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/pcan.php?an=ON";
                connect(urlLink, v);
            }

        });
        buttonPcAus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/pcaus.php?aus=OFF";
                connect(urlLink, v);
            }

        });
        buttonPcMonitorAn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/pcmonitoran.php?an=ON";
                connect(urlLink, v);
            }

        });
        buttonPcMonitorAus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/pcmonitoraus.php?aus=OFF";
                connect(urlLink, v);
            }

        });
        buttonTvMonitorAn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/tvmonitoran.php?an=ON";
                connect(urlLink, v);
            }

        });
        buttonTvMonitorAus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/tvmonitoraus.php?aus=OFF";
                connect(urlLink, v);
            }

        });
        buttonBeamerAn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/beameran.php?an=ON";
                connect(urlLink, v);
            }

        });
        buttonBeamerAus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/beameraus.php?aus=OFF";
                connect(urlLink, v);
            }

        });
        buttonLeinwandAn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/leinwandrunter.php?an=Down";
                connect(urlLink, v);
            }

        });
        buttonLeinwandAus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/leinwandhoch.php?aus=Up";
                connect(urlLink, v);
            }

        });
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
        buttonIpadAn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/ipad.php?an=ON";
                connect(urlLink, v);
            }

        });
        buttonIpadAus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/ipad.php?aus=OFF";
                connect(urlLink, v);
            }

        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.multimedia, menu);
        return true;
    }
}
