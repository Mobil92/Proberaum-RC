package de.pr22.proberaum;

import android.os.Bundle;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.widget.Button;

public class EffekteActivity extends Refactoring
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_effekte);
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
        Button buttonRandomAn = (Button) findViewById(R.id.buttonRandomAn);
        Button buttonRandomAus = (Button) findViewById(R.id.buttonRandomAus);
        Button buttonBlauesLichtAn = (Button) findViewById(R.id.buttonBlauesLichtAn);
        Button buttonBlauesLichtAus = (Button) findViewById(R.id.buttonBlauesLichtAus);
        Button buttonLichtorgelAn = (Button) findViewById(R.id.buttonLichtorgelAn);
        Button buttonLichtorgelAus = (Button) findViewById(R.id.buttonLichtorgelAus);
        Button buttonTrexAn = (Button) findViewById(R.id.buttonTrexAn);
        Button buttonTrexAus = (Button) findViewById(R.id.buttonTrexAus);
        Button buttonMushroomAn = (Button) findViewById(R.id.buttonMushroomAn);
        Button buttonMushroomAus = (Button) findViewById(R.id.buttonMushroomAus);
        Button buttonSpiegelkugelAn = (Button) findViewById(R.id.buttonSpiegelkugelAn);
        Button buttonSpiegelkugelAus = (Button) findViewById(R.id.buttonSpiegelkugelAus);
        Button buttonMadeintaiwanAn = (Button) findViewById(R.id.buttonMadeintaiwanAn);
        Button buttonMadeintaiwanAus = (Button) findViewById(R.id.buttonMadeintaiwanAus);
        Button buttonStroboskopAn = (Button) findViewById(R.id.buttonStroboskopAn);
        Button buttonStroboskopAus = (Button) findViewById(R.id.buttonStroboskopAus);
        Button buttonNebelmaschineAn = (Button) findViewById(R.id.buttonNebelmaschineAn);
        Button buttonNebelmaschineAus = (Button) findViewById(R.id.buttonNebelmaschineAus);
        Button buttonNebelAn = (Button) findViewById(R.id.buttonNebelAn);
        Button buttonNebelAus = (Button) findViewById(R.id.buttonNebelAus);

        buttonRandomAn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/random.php?randoman=Random an";
                connect(urlLink, v);
            }

        });
        buttonRandomAus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/randomaus.php?randomaus=Random aus";
                connect(urlLink, v);
            }

        });
        buttonBlauesLichtAn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/lichter.php?3blauan=ON";
                connect(urlLink, v);
            }

        });
        buttonBlauesLichtAus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/lichter.php?3blauaus=OFF";
                connect(urlLink, v);
            }

        });
        buttonLichtorgelAn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/effekte.php?lichtorkelan=ON";
                connect(urlLink, v);
            }

        });
        buttonLichtorgelAus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/effekte.php?lichtorkelaus=OFF";
                connect(urlLink, v);
            }

        });
        buttonTrexAn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/effekte.php?trexan=ON";
                connect(urlLink, v);
            }

        });
        buttonTrexAus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/effekte.php?trexaus=OFF";
                connect(urlLink, v);
            }

        });
        buttonMushroomAn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/effekte.php?mushrooman=ON";
                connect(urlLink, v);
            }

        });
        buttonMushroomAus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/effekte.php?mushroomaus=OFF";
                connect(urlLink, v);
            }

        });
        buttonSpiegelkugelAn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/effekte.php?spiegelkugelan=ON";
                connect(urlLink, v);
            }

        });
        buttonSpiegelkugelAus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/effekte.php?spiegelkugelaus=OFF";
                connect(urlLink, v);
            }

        });
        buttonMadeintaiwanAn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/effekte.php?madeintaiwanan=ON";
                connect(urlLink, v);
            }

        });
        buttonMadeintaiwanAus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/effekte.php?madeintaiwanaus=OFF";
                connect(urlLink, v);
            }

        });
        buttonStroboskopAn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/effekte.php?stroboskopan=ON";
                connect(urlLink, v);
            }

        });
        buttonStroboskopAus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/effekte.php?stroboskopaus=OFF";
                connect(urlLink, v);
            }

        });
        buttonNebelmaschineAn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/nebelmaschinean.php?an=ON";
                connect(urlLink, v);
            }

        });
        buttonNebelmaschineAus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/nebelmaschineaus.php?aus=OFF";
                connect(urlLink, v);
            }

        });
        buttonNebelAn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/nebelan.php?an=ON";
                connect(urlLink, v);
            }

        });
        buttonNebelAus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/nebelaus.php?aus=OFF";
                connect(urlLink, v);
            }

        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.effekte, menu);
        return true;
    }
}
