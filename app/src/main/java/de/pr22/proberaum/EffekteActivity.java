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

public class EffekteActivity extends Refactoring
        implements NavigationView.OnNavigationItemSelectedListener {

    static Map mapSQLNeu = new HashMap();
    private Button buttonRandomAn;
    private Button buttonRandomAus;
    private Button buttonBlauesLichtAn;
    private Button buttonBlauesLichtAus;
    private Button buttonLichtorgelAn;
    private Button buttonLichtorgelAus;
    private Button buttonTrexAn;
    private Button buttonTrexAus;
    private Button buttonMushroomAn;
    private Button buttonMushroomAus;
    private Button buttonSpiegelkugelAn;
    private Button buttonSpiegelkugelAus;
    private Button buttonMadeintaiwanAn;
    private Button buttonMadeintaiwanAus;
    private Button buttonStroboskopAn;
    private Button buttonStroboskopAus;
    private Button buttonNebelmaschineAn;
    private Button buttonNebelmaschineAus;
    private Button buttonNebelAn;
    private Button buttonNebelAus;

    public EffekteActivity() {
    }

    public EffekteActivity(sql sql) {
        super();
        mapSQLNeu.putAll(sql.mapSQL);

    }

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
        buttonRandomAn = (Button) findViewById(R.id.buttonRandomAn);
        buttonRandomAus = (Button) findViewById(R.id.buttonRandomAus);
        if (mapSQLNeu.get("random").equals("1")) {
            buttonRandomAn.getBackground().setColorFilter(Color.rgb(255,20,147), PorterDuff.Mode.MULTIPLY);
        }
        else {
            buttonRandomAus.getBackground().setColorFilter(Color.rgb(255,20,147), PorterDuff.Mode.MULTIPLY);
        }
        buttonBlauesLichtAn = (Button) findViewById(R.id.buttonBlauesLichtAn);
        buttonBlauesLichtAus = (Button) findViewById(R.id.buttonBlauesLichtAus);
        if (mapSQLNeu.get("blauesLicht").equals("1")) {
            buttonBlauesLichtAn.getBackground().setColorFilter(Color.rgb(255,20,147), PorterDuff.Mode.MULTIPLY);
        }
        else {
            buttonBlauesLichtAus.getBackground().setColorFilter(Color.rgb(255,20,147), PorterDuff.Mode.MULTIPLY);
        }
        buttonLichtorgelAn = (Button) findViewById(R.id.buttonLichtorgelAn);
        buttonLichtorgelAus = (Button) findViewById(R.id.buttonLichtorgelAus);
        if (mapSQLNeu.get("lichtorgel").equals("1")) {
            buttonLichtorgelAn.getBackground().setColorFilter(Color.rgb(255,20,147), PorterDuff.Mode.MULTIPLY);
        }
        else {
            buttonLichtorgelAus.getBackground().setColorFilter(Color.rgb(255,20,147), PorterDuff.Mode.MULTIPLY);
        }
        buttonTrexAn = (Button) findViewById(R.id.buttonTrexAn);
        buttonTrexAus = (Button) findViewById(R.id.buttonTrexAus);
        if (mapSQLNeu.get("trex").equals("1")) {
            buttonTrexAn.getBackground().setColorFilter(Color.rgb(255,20,147), PorterDuff.Mode.MULTIPLY);
        }
        else {
            buttonTrexAus.getBackground().setColorFilter(Color.rgb(255,20,147), PorterDuff.Mode.MULTIPLY);
        }
        buttonMushroomAn = (Button) findViewById(R.id.buttonMushroomAn);
        buttonMushroomAus = (Button) findViewById(R.id.buttonMushroomAus);
        if (mapSQLNeu.get("mushroom").equals("1")) {
            buttonMushroomAn.getBackground().setColorFilter(Color.rgb(255,20,147), PorterDuff.Mode.MULTIPLY);
        }
        else {
            buttonMushroomAus.getBackground().setColorFilter(Color.rgb(255,20,147), PorterDuff.Mode.MULTIPLY);
        }
        buttonSpiegelkugelAn = (Button) findViewById(R.id.buttonSpiegelkugelAn);
        buttonSpiegelkugelAus = (Button) findViewById(R.id.buttonSpiegelkugelAus);
        if (mapSQLNeu.get("spiegelkugel").equals("1")) {
            buttonSpiegelkugelAn.getBackground().setColorFilter(Color.rgb(255,20,147), PorterDuff.Mode.MULTIPLY);
        }
        else {
            buttonSpiegelkugelAus.getBackground().setColorFilter(Color.rgb(255,20,147), PorterDuff.Mode.MULTIPLY);
        }
        buttonMadeintaiwanAn = (Button) findViewById(R.id.buttonMadeintaiwanAn);
        buttonMadeintaiwanAus = (Button) findViewById(R.id.buttonMadeintaiwanAus);
        if (mapSQLNeu.get("madeintaiwan").equals("1")) {
            buttonMadeintaiwanAn.getBackground().setColorFilter(Color.rgb(255,20,147), PorterDuff.Mode.MULTIPLY);
        }
        else {
            buttonMadeintaiwanAus.getBackground().setColorFilter(Color.rgb(255,20,147), PorterDuff.Mode.MULTIPLY);
        }
        buttonStroboskopAn = (Button) findViewById(R.id.buttonStroboskopAn);
        buttonStroboskopAus = (Button) findViewById(R.id.buttonStroboskopAus);
        if (mapSQLNeu.get("stroboskop").equals("1")) {
            buttonStroboskopAn.getBackground().setColorFilter(Color.rgb(255,20,147), PorterDuff.Mode.MULTIPLY);
        }
        else {
            buttonStroboskopAus.getBackground().setColorFilter(Color.rgb(255,20,147), PorterDuff.Mode.MULTIPLY);
        }
        buttonNebelmaschineAn = (Button) findViewById(R.id.buttonNebelmaschineAn);
        buttonNebelmaschineAus = (Button) findViewById(R.id.buttonNebelmaschineAus);
        if (mapSQLNeu.get("nebelmaschine").equals("1")) {
            buttonNebelmaschineAn.getBackground().setColorFilter(Color.rgb(255,20,147), PorterDuff.Mode.MULTIPLY);
        }
        else {
            buttonNebelmaschineAus.getBackground().setColorFilter(Color.rgb(255,20,147), PorterDuff.Mode.MULTIPLY);
        }
        buttonNebelAn = (Button) findViewById(R.id.buttonNebelAn);
        buttonNebelAus = (Button) findViewById(R.id.buttonNebelAus);
        if (mapSQLNeu.get("nebel").equals("1")) {
            buttonNebelAn.getBackground().setColorFilter(Color.rgb(255,20,147), PorterDuff.Mode.MULTIPLY);
        }
        else {
            buttonNebelAus.getBackground().setColorFilter(Color.rgb(255,20,147), PorterDuff.Mode.MULTIPLY);
        }

        buttonRandomAn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/random.php?randoman=Random an";
                connect(urlLink, v);
                buttonChangeColor(buttonRandomAn);
                buttonChangeColor2(buttonRandomAus);
            }

        });
        buttonRandomAus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/randomaus.php?randomaus=Random aus";
                connect(urlLink, v);
                buttonChangeColor(buttonRandomAus);
                buttonChangeColor2(buttonRandomAn);
            }

        });
        buttonBlauesLichtAn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/lichter.php?3blauan=ON";
                connect(urlLink, v);
                buttonChangeColor(buttonBlauesLichtAn);
                buttonChangeColor2(buttonBlauesLichtAus);
            }

        });
        buttonBlauesLichtAus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/lichter.php?3blauaus=OFF";
                connect(urlLink, v);
                buttonChangeColor(buttonBlauesLichtAus);
                buttonChangeColor2(buttonBlauesLichtAn);
            }

        });
        buttonLichtorgelAn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/effekte.php?lichtorkelan=ON";
                connect(urlLink, v);
                buttonChangeColor(buttonLichtorgelAn);
                buttonChangeColor2(buttonLichtorgelAus);
            }

        });
        buttonLichtorgelAus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/effekte.php?lichtorkelaus=OFF";
                connect(urlLink, v);
                buttonChangeColor(buttonLichtorgelAus);
                buttonChangeColor2(buttonLichtorgelAn);
            }

        });
        buttonTrexAn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/effekte.php?trexan=ON";
                connect(urlLink, v);
                buttonChangeColor(buttonTrexAn);
                buttonChangeColor2(buttonTrexAus);
            }

        });
        buttonTrexAus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/effekte.php?trexaus=OFF";
                connect(urlLink, v);
                buttonChangeColor(buttonTrexAus);
                buttonChangeColor2(buttonTrexAn);
            }

        });
        buttonMushroomAn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/effekte.php?mushrooman=ON";
                connect(urlLink, v);
                buttonChangeColor(buttonMushroomAn);
                buttonChangeColor2(buttonMushroomAus);
            }

        });
        buttonMushroomAus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/effekte.php?mushroomaus=OFF";
                connect(urlLink, v);
                buttonChangeColor(buttonMushroomAus);
                buttonChangeColor2(buttonMushroomAn);
            }

        });
        buttonSpiegelkugelAn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/effekte.php?spiegelkugelan=ON";
                connect(urlLink, v);
                buttonChangeColor(buttonSpiegelkugelAn);
                buttonChangeColor2(buttonSpiegelkugelAus);
            }

        });
        buttonSpiegelkugelAus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/effekte.php?spiegelkugelaus=OFF";
                connect(urlLink, v);
                buttonChangeColor(buttonSpiegelkugelAus);
                buttonChangeColor2(buttonSpiegelkugelAn);
            }

        });
        buttonMadeintaiwanAn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/effekte.php?madeintaiwanan=ON";
                connect(urlLink, v);
                buttonChangeColor(buttonMadeintaiwanAn);
                buttonChangeColor2(buttonMadeintaiwanAus);
            }

        });
        buttonMadeintaiwanAus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/effekte.php?madeintaiwanaus=OFF";
                connect(urlLink, v);
                buttonChangeColor(buttonMadeintaiwanAus);
                buttonChangeColor2(buttonMadeintaiwanAn);
            }

        });
        buttonStroboskopAn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/effekte.php?stroboskopan=ON";
                connect(urlLink, v);
                buttonChangeColor(buttonStroboskopAn);
                buttonChangeColor2(buttonStroboskopAus);
            }

        });
        buttonStroboskopAus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/effekte.php?stroboskopaus=OFF";
                connect(urlLink, v);
                buttonChangeColor(buttonStroboskopAus);
                buttonChangeColor2(buttonStroboskopAn);
            }

        });
        buttonNebelmaschineAn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/nebelmaschinean.php?an=ON";
                connect(urlLink, v);
                buttonChangeColor(buttonNebelmaschineAn);
                buttonChangeColor2(buttonNebelmaschineAus);
            }

        });
        buttonNebelmaschineAus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/nebelmaschineaus.php?aus=OFF";
                connect(urlLink, v);
                buttonChangeColor(buttonNebelmaschineAus);
                buttonChangeColor2(buttonNebelmaschineAn);
            }

        });
        buttonNebelAn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/nebelan.php?an=ON";
                connect(urlLink, v);
                buttonChangeColor(buttonNebelAn);
                buttonChangeColor2(buttonNebelAus);
            }

        });
        buttonNebelAus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/nebelaus.php?aus=OFF";
                connect(urlLink, v);
                buttonChangeColor(buttonNebelAus);
                buttonChangeColor2(buttonNebelAn);
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
