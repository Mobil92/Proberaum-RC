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



public class LichtActivity extends Refactoring
        implements NavigationView.OnNavigationItemSelectedListener {

    static Map mapSQLNeu = new HashMap();
    private Button buttonHauptAn;
    private Button buttonHauptAus;
    private Button buttonRoehreLeinwandAn;
    private Button buttonRoehreLeinwandAus;
    private Button buttonRoehreSofaAn;
    private Button buttonRoehreSofaAus;
    private Button buttonEckeGelbAn;
    private Button buttonEckeGelbAus;
    private Button buttonEckeRotAn;
    private Button buttonEckeRotAus;
    private Button buttonEckeBlauAn;
    private Button buttonEckeBlauAus;
    private Button buttonSchwarzlichtAn;
    private Button buttonSchwarzlichtAus;
    private Button buttonAntiFliegenAn;
    private Button buttonAntiFliegenAus;
    private Button buttonGetraenkeautomatAn;
    private Button buttonGetraenkeautomatAus;
    private Button buttonLichtAussenAn;
    private Button buttonLichtAussenAus;
    private Button buttonLichtGrillAn;
    private Button buttonLichtGrillAus;



    public LichtActivity() {
    }

    public LichtActivity(sql sql) {
        super();
        mapSQLNeu.putAll(sql.mapSQL);
    }


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

        buttonHauptAn = (Button) findViewById(R.id.buttonHauptAn);
        buttonHauptAus = (Button) findViewById(R.id.buttonHauptAus);
        if (mapSQLNeu.get("haupt").equals("1")) {
            buttonHauptAn.getBackground().setColorFilter(Color.rgb(255,20,147), PorterDuff.Mode.MULTIPLY);
        }
        else {
            buttonHauptAus.getBackground().setColorFilter(Color.rgb(255,20,147), PorterDuff.Mode.MULTIPLY);
        }
        buttonRoehreLeinwandAn = (Button) findViewById(R.id.buttonRoehreLeinwandAn);
        buttonRoehreLeinwandAus = (Button) findViewById(R.id.buttonRoehreLeinwandAus);
        if (mapSQLNeu.get("roehreLeinwand").equals("1")) {
            buttonRoehreLeinwandAn.getBackground().setColorFilter(Color.rgb(255,20,147), PorterDuff.Mode.MULTIPLY);
        }
        else {
            buttonRoehreLeinwandAus.getBackground().setColorFilter(Color.rgb(255,20,147), PorterDuff.Mode.MULTIPLY);
        }
        buttonRoehreSofaAn = (Button) findViewById(R.id.buttonRoehreSofaAn);
        buttonRoehreSofaAus = (Button) findViewById(R.id.buttonRoehreSofaAus);
        if (mapSQLNeu.get("roehreSofa").equals("1")) {
            buttonRoehreSofaAn.getBackground().setColorFilter(Color.rgb(255,20,147), PorterDuff.Mode.MULTIPLY);
        }
        else {
            buttonRoehreSofaAus.getBackground().setColorFilter(Color.rgb(255,20,147), PorterDuff.Mode.MULTIPLY);
        }
        buttonEckeGelbAn = (Button) findViewById(R.id.buttonEckeGelbAn);
        buttonEckeGelbAus = (Button) findViewById(R.id.buttonEckeGelbAus);
        if (mapSQLNeu.get("eckeGelb").equals("1")) {
            buttonEckeGelbAn.getBackground().setColorFilter(Color.rgb(255,20,147), PorterDuff.Mode.MULTIPLY);
        }
        else {
            buttonEckeGelbAus.getBackground().setColorFilter(Color.rgb(255,20,147), PorterDuff.Mode.MULTIPLY);
        }
        buttonEckeRotAn = (Button) findViewById(R.id.buttonEckeRotAn);
        buttonEckeRotAus = (Button) findViewById(R.id.buttonEckeRotAus);
        if (mapSQLNeu.get("eckeRot").equals("1")) {
            buttonEckeRotAn.getBackground().setColorFilter(Color.rgb(255,20,147), PorterDuff.Mode.MULTIPLY);
        }
        else {
            buttonEckeRotAus.getBackground().setColorFilter(Color.rgb(255,20,147), PorterDuff.Mode.MULTIPLY);
        }
        buttonEckeBlauAn = (Button) findViewById(R.id.buttonEckeBlauAn);
        buttonEckeBlauAus = (Button) findViewById(R.id.buttonEckeBlauAus);
        if (mapSQLNeu.get("eckeBlau").equals("1")) {
            buttonEckeBlauAn.getBackground().setColorFilter(Color.rgb(255,20,147), PorterDuff.Mode.MULTIPLY);
        }
        else {
            buttonEckeBlauAus.getBackground().setColorFilter(Color.rgb(255,20,147), PorterDuff.Mode.MULTIPLY);
        }
        buttonSchwarzlichtAn = (Button) findViewById(R.id.buttonSchwarzlichtAn);
        buttonSchwarzlichtAus = (Button) findViewById(R.id.buttonSchwarzlichtAus);
        if (mapSQLNeu.get("schwarzlicht").equals("1")) {
            buttonSchwarzlichtAn.getBackground().setColorFilter(Color.rgb(255,20,147), PorterDuff.Mode.MULTIPLY);
        }
        else {
            buttonSchwarzlichtAus.getBackground().setColorFilter(Color.rgb(255,20,147), PorterDuff.Mode.MULTIPLY);
        }
        buttonAntiFliegenAn = (Button) findViewById(R.id.buttonAntiFliegenAn);
        buttonAntiFliegenAus = (Button) findViewById(R.id.buttonAntiFliegenAus);
        if (mapSQLNeu.get("antiFliegen").equals("1")) {
            buttonAntiFliegenAn.getBackground().setColorFilter(Color.rgb(255,20,147), PorterDuff.Mode.MULTIPLY);
        }
        else {
            buttonAntiFliegenAus.getBackground().setColorFilter(Color.rgb(255,20,147), PorterDuff.Mode.MULTIPLY);
        }
        buttonGetraenkeautomatAn = (Button) findViewById(R.id.buttonGetraenkeautomatAn);
        buttonGetraenkeautomatAus = (Button) findViewById(R.id.buttonGetraenkeautomatAus);
        if (mapSQLNeu.get("getraenkeautomat").equals("1")) {
            buttonGetraenkeautomatAn.getBackground().setColorFilter(Color.rgb(255,20,147), PorterDuff.Mode.MULTIPLY);
        }
        else {
            buttonGetraenkeautomatAus.getBackground().setColorFilter(Color.rgb(255,20,147), PorterDuff.Mode.MULTIPLY);
        }
        buttonLichtAussenAn = (Button) findViewById(R.id.buttonLichtAussenAn);
        buttonLichtAussenAus = (Button) findViewById(R.id.buttonLichtAussenAus);
        if (mapSQLNeu.get("lichtAussen").equals("1")) {
            buttonLichtAussenAn.getBackground().setColorFilter(Color.rgb(255,20,147), PorterDuff.Mode.MULTIPLY);
        }
        else {
            buttonLichtAussenAus.getBackground().setColorFilter(Color.rgb(255,20,147), PorterDuff.Mode.MULTIPLY);
        }
        buttonLichtGrillAn = (Button) findViewById(R.id.buttonLichtGrillAn);
        buttonLichtGrillAus = (Button) findViewById(R.id.buttonLichtGrillAus);
        if (mapSQLNeu.get("lichtGrill").equals("1")) {
            buttonLichtGrillAn.getBackground().setColorFilter(Color.rgb(255,20,147), PorterDuff.Mode.MULTIPLY);
        }
        else {
            buttonLichtGrillAus.getBackground().setColorFilter(Color.rgb(255,20,147), PorterDuff.Mode.MULTIPLY);
        }


        buttonHauptAn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/lichter.php?hauptlampean=ON";
                connect(urlLink,v);
                buttonChangeColor(buttonHauptAn);
                buttonChangeColor2(buttonHauptAus);
                mapSQLNeu.put("haupt","1");
            }
        });
        buttonHauptAus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/lichter.php?hauptlampeaus=OFF";
                connect(urlLink,v);
                buttonChangeColor(buttonHauptAus);
                buttonChangeColor2(buttonHauptAn);
                mapSQLNeu.put("haupt","0");
            }

        });
        buttonRoehreLeinwandAn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/lichter.php?rleinwandan=ON";
                connect(urlLink,v);
                buttonChangeColor(buttonRoehreLeinwandAn);
                buttonChangeColor2(buttonRoehreLeinwandAus);
                mapSQLNeu.put("roehreLeinwand","1");
            }

        });
        buttonRoehreLeinwandAus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/lichter.php?rleinwandaus=OFF";
                connect(urlLink,v);
                buttonChangeColor(buttonRoehreLeinwandAus);
                buttonChangeColor2(buttonRoehreLeinwandAn);
                mapSQLNeu.put("roehreLeinwand","0");
            }

        });
        buttonRoehreSofaAn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/lichter.php?rsofaan=ON";
                connect(urlLink,v);
                buttonChangeColor(buttonRoehreSofaAn);
                buttonChangeColor2(buttonRoehreSofaAus);
                mapSQLNeu.put("roehreSofa","1");
            }

        });
        buttonRoehreSofaAus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/lichter.php?rsofaaus=ON";
                connect(urlLink,v);
                buttonChangeColor(buttonRoehreSofaAus);
                buttonChangeColor2(buttonRoehreSofaAn);
                mapSQLNeu.put("roehreSofa","0");
            }

        });
        buttonEckeGelbAn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/lichter.php?gelban=ON";
                connect(urlLink,v);
                buttonChangeColor(buttonEckeGelbAn);
                buttonChangeColor2(buttonEckeGelbAus);
                mapSQLNeu.put("eckeGelb","1");
            }

        });
        buttonEckeGelbAus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/lichter.php?gelbaus=OFF";
                connect(urlLink,v);
                buttonChangeColor(buttonEckeGelbAus);
                buttonChangeColor2(buttonEckeGelbAn);
                mapSQLNeu.put("eckeGelb","0");
            }

        });
        buttonEckeRotAn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/lichter.php?rotan=ON";
                connect(urlLink,v);
                buttonChangeColor(buttonEckeRotAn);
                buttonChangeColor2(buttonEckeRotAus);
                mapSQLNeu.put("eckeRot","1");
            }

        });
        buttonEckeRotAus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/lichter.php?rotaus=OFF";
                connect(urlLink,v);
                buttonChangeColor(buttonEckeRotAus);
                buttonChangeColor2(buttonEckeRotAn);
                mapSQLNeu.put("eckeRot","0");
            }

        });
        buttonEckeBlauAn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/lichter.php?blauan=ON";
                connect(urlLink,v);
                buttonChangeColor(buttonEckeBlauAn);
                buttonChangeColor2(buttonEckeBlauAus);
                mapSQLNeu.put("eckeBlau","1");
            }

        });
        buttonEckeBlauAus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/lichter.php?blauaus=ON";
                connect(urlLink,v);
                buttonChangeColor(buttonEckeBlauAus);
                buttonChangeColor2(buttonEckeBlauAn);
                mapSQLNeu.put("eckeBlau","0");
            }

        });
        buttonSchwarzlichtAn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/lichter.php?schwarzan=ON";
                connect(urlLink,v);
                buttonChangeColor(buttonSchwarzlichtAn);
                buttonChangeColor2(buttonSchwarzlichtAus);
                mapSQLNeu.put("schwarzlicht","1");
            }

        });
        buttonSchwarzlichtAus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/lichter.php?schwarzaus=OFF";
                connect(urlLink,v);
                buttonChangeColor(buttonSchwarzlichtAus);
                buttonChangeColor2(buttonSchwarzlichtAn);
                mapSQLNeu.put("schwarzlicht","0");
            }

        });
        buttonAntiFliegenAn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/lichter.php?fliegean=ON";
                connect(urlLink,v);
                buttonChangeColor(buttonAntiFliegenAn);
                buttonChangeColor2(buttonAntiFliegenAus);
                mapSQLNeu.put("antiFliegen","1");
            }

        });
        buttonAntiFliegenAus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/lichter.php?fliegeaus=OFF";
                connect(urlLink,v);
                buttonChangeColor(buttonAntiFliegenAus);
                buttonChangeColor2(buttonAntiFliegenAn);
                mapSQLNeu.put("antiFliegen","0");
            }

        });
        buttonGetraenkeautomatAn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/lichter.php?gautomatan=ON";
                connect(urlLink,v);
                buttonChangeColor(buttonGetraenkeautomatAn);
                buttonChangeColor2(buttonGetraenkeautomatAus);
                mapSQLNeu.put("getraenkeautomat","1");
            }

        });
        buttonGetraenkeautomatAus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/lichter.php?gautomataus=OFF";
                connect(urlLink,v);
                buttonChangeColor(buttonGetraenkeautomatAus);
                buttonChangeColor2(buttonGetraenkeautomatAn);
                mapSQLNeu.put("getraenkeautomat","0");
            }

        });
        buttonLichtAussenAn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/lichter.php?außenan=ON";
                connect(urlLink,v);
                buttonChangeColor(buttonLichtAussenAn);
                buttonChangeColor2(buttonLichtAussenAus);
                mapSQLNeu.put("lichtAussen","1");
            }

        });
        buttonLichtAussenAus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/lichter.php?außenaus=OFF";
                connect(urlLink,v);
                buttonChangeColor(buttonLichtAussenAus);
                buttonChangeColor2(buttonLichtAussenAn);
                mapSQLNeu.put("lichtAussen","0");
            }

        });
        buttonLichtGrillAn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/lichter.php?grillan=ON";
                connect(urlLink,v);
                buttonChangeColor(buttonLichtGrillAn);
                buttonChangeColor2(buttonLichtGrillAus);
                mapSQLNeu.put("lichtGrill","1");
            }

        });
        buttonLichtGrillAus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/lichter.php?grillaus=ON";
                connect(urlLink,v);
                buttonChangeColor(buttonLichtGrillAus);
                buttonChangeColor2(buttonLichtGrillAn);
                mapSQLNeu.put("lichtGrill","0");
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
