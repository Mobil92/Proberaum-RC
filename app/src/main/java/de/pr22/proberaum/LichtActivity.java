package de.pr22.proberaum;

import android.os.Bundle;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.widget.Button;

public class LichtActivity extends Refactoring
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_licht);
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

        Button buttonHauptAn = (Button) findViewById(R.id.buttonHauptAn);
        Button buttonHauptAus = (Button) findViewById(R.id.buttonHauptAus);
        Button buttonRoehreLeinwandAn = (Button) findViewById(R.id.buttonRoehreLeinwandAn);
        Button buttonRoehreLeinwandAus = (Button) findViewById(R.id.buttonRoehreLeinwandAus);
        Button buttonRoehreSofaAn = (Button) findViewById(R.id.buttonRoehreSofaAn);
        Button buttonRoehreSofaAus = (Button) findViewById(R.id.buttonRoehreSofaAus);
        Button buttonEckeGelbAn = (Button) findViewById(R.id.buttonEckeGelbAn);
        Button buttonEckeGelbAus = (Button) findViewById(R.id.buttonEckeGelbAus);
        Button buttonEckeRotAn = (Button) findViewById(R.id.buttonEckeRotAn);
        Button buttonEckeRotAus = (Button) findViewById(R.id.buttonEckeRotAus);
        Button buttonEckeBlauAn = (Button) findViewById(R.id.buttonEckeBlauAn);
        Button buttonEckeBlauAus = (Button) findViewById(R.id.buttonEckeBlauAus);
        Button buttonSchwarzlichtAn = (Button) findViewById(R.id.buttonSchwarzlichtAn);
        Button buttonSchwarzlichtAus = (Button) findViewById(R.id.buttonSchwarzlichtAus);
        Button buttonAntiFliegenAn = (Button) findViewById(R.id.buttonAntiFliegenAn);
        Button buttonAntiFliegenAus = (Button) findViewById(R.id.buttonAntiFliegenAus);
        Button buttonGetraenkeautomatAn = (Button) findViewById(R.id.buttonGetraenkeautomatAn);
        Button buttonGetraenkeautomatAus = (Button) findViewById(R.id.buttonGetraenkeautomatAus);
        Button buttonLichtAussenAn = (Button) findViewById(R.id.buttonLichtAussenAn);
        Button buttonLichtAussenAus = (Button) findViewById(R.id.buttonLichtAussenAus);
        Button buttonLichtGrillAn = (Button) findViewById(R.id.buttonLichtGrillAn);
        Button buttonLichtGrillAus = (Button) findViewById(R.id.buttonLichtGrillAus);

        buttonHauptAn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/lichter.php?hauptlampean=ON";
                connect(urlLink,v);
            }

        });
        buttonHauptAus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/lichter.php?hauptlampeaus=OFF";
                connect(urlLink,v);
            }

        });
        buttonRoehreLeinwandAn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/lichter.php?rleinwandan=ON";
                connect(urlLink,v);
            }

        });
        buttonRoehreLeinwandAus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/lichter.php?rleinwandaus=OFF";
                connect(urlLink,v);
            }

        });
        buttonRoehreSofaAn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/lichter.php?rsofaan=ON";
                connect(urlLink,v);
            }

        });
        buttonRoehreSofaAus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/lichter.php?rsofaaus=ON";
                connect(urlLink,v);
            }

        });
        buttonEckeGelbAn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/lichter.php?gelban=ON";
                connect(urlLink,v);
            }

        });
        buttonEckeGelbAus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/lichter.php?gelbaus=OFF";
                connect(urlLink,v);
            }

        });
        buttonEckeRotAn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/lichter.php?rotan=ON";
                connect(urlLink,v);
            }

        });
        buttonEckeRotAus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/lichter.php?rotaus=OFF";
                connect(urlLink,v);
            }

        });
        buttonEckeBlauAn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/lichter.php?blauan=ON";
                connect(urlLink,v);
            }

        });
        buttonEckeBlauAus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/lichter.php?blauaus=ON";
                connect(urlLink,v);
            }

        });
        buttonSchwarzlichtAn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/lichter.php?schwarzan=ON";
                connect(urlLink,v);
            }

        });
        buttonSchwarzlichtAus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/lichter.php?schwarzaus=OFF";
                connect(urlLink,v);
            }

        });
        buttonAntiFliegenAn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/lichter.php?fliegean=ON";
                connect(urlLink,v);
            }

        });
        buttonAntiFliegenAus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/lichter.php?fliegeaus=OFF";
                connect(urlLink,v);
            }

        });
        buttonGetraenkeautomatAn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/lichter.php?gautomatan=ON";
                connect(urlLink,v);
            }

        });
        buttonGetraenkeautomatAus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/lichter.php?gautomataus=OFF";
                connect(urlLink,v);
            }

        });
        buttonLichtAussenAn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/lichter.php?außenan=ON";
                connect(urlLink,v);
            }

        });
        buttonLichtAussenAus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/lichter.php?außenaus=OFF";
                connect(urlLink,v);
            }

        });
        buttonLichtGrillAn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/lichter.php?grillan=ON";
                connect(urlLink,v);
            }

        });
        buttonLichtGrillAus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/lichter.php?grillaus=ON";
                connect(urlLink,v);
            }

        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.licht, menu);
        return true;
    }
}
