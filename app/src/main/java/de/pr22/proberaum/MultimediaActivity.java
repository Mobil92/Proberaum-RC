package de.pr22.proberaum;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.widget.Button;

import java.util.HashMap;
import java.util.Map;

public class MultimediaActivity extends Refactoring
        implements NavigationView.OnNavigationItemSelectedListener {

    static Map mapSQLNeu = new HashMap();
    private Button buttonKinoModusAn;
    private Button buttonKinoModusAus;
    private Button buttonFilmStart;
    private Button buttonFilmPause;
    private Button buttonPcAn;
    private Button buttonPcAus;
    private Button buttonPcMonitorAn;
    private Button buttonPcMonitorAus;
    private Button buttonTvMonitorAn;
    private Button buttonTvMonitorAus;
    private Button buttonBeamerAn;
    private Button buttonBeamerAus;
    private Button buttonLeinwandAn;
    private Button buttonLeinwandAus;
    private Button buttonVerstaerkerAn;
    private Button buttonVerstaerkerAus;
    private Button buttonIpadAn;
    private Button buttonIpadAus;

    public MultimediaActivity() {
    }

    public MultimediaActivity(sql sql) {
        super();

        mapSQLNeu.putAll(sql.mapSQL);
    }

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

        buttonKinoModusAn = (Button) findViewById(R.id.buttonKinoModusAn);
        buttonKinoModusAus = (Button) findViewById(R.id.buttonKinoModusAus);
        if (mapSQLNeu.get("kinoModus").equals("1")) {
            buttonKinoModusAn.getBackground().setColorFilter(Color.rgb(255,20,147), PorterDuff.Mode.MULTIPLY);
        }
        else {
            buttonKinoModusAus.getBackground().setColorFilter(Color.rgb(255,20,147), PorterDuff.Mode.MULTIPLY);
        }
        buttonFilmStart = (Button) findViewById(R.id.buttonFilmStart);
        buttonFilmPause = (Button) findViewById(R.id.buttonFilmPause);
        if (mapSQLNeu.get("film").equals("1")) {
            buttonFilmStart.getBackground().setColorFilter(Color.rgb(255,20,147), PorterDuff.Mode.MULTIPLY);
        }
        else {
            buttonFilmPause.getBackground().setColorFilter(Color.rgb(255,20,147), PorterDuff.Mode.MULTIPLY);
        }
        buttonPcAn = (Button) findViewById(R.id.buttonPcAn);
        buttonPcAus = (Button) findViewById(R.id.buttonPcAus);
        if (mapSQLNeu.get("pc").equals("1")) {
            buttonPcAn.getBackground().setColorFilter(Color.rgb(255,20,147), PorterDuff.Mode.MULTIPLY);
        }
        else {
            buttonPcAus.getBackground().setColorFilter(Color.rgb(255,20,147), PorterDuff.Mode.MULTIPLY);
        }
        buttonPcMonitorAn = (Button) findViewById(R.id.buttonPcMonitorAn);
        buttonPcMonitorAus = (Button) findViewById(R.id.buttonPcMonitorAus);
        if (mapSQLNeu.get("pcMonitor").equals("1")) {
            buttonPcMonitorAn.getBackground().setColorFilter(Color.rgb(255,20,147), PorterDuff.Mode.MULTIPLY);
        }
        else {
            buttonPcMonitorAus.getBackground().setColorFilter(Color.rgb(255,20,147), PorterDuff.Mode.MULTIPLY);
        }
        buttonTvMonitorAn = (Button) findViewById(R.id.buttonTvMonitorAn);
        buttonTvMonitorAus = (Button) findViewById(R.id.buttonTvMonitorAus);
        if (mapSQLNeu.get("tvMonitor").equals("1")) {
            buttonTvMonitorAn.getBackground().setColorFilter(Color.rgb(255,20,147), PorterDuff.Mode.MULTIPLY);
        }
        else {
            buttonTvMonitorAus.getBackground().setColorFilter(Color.rgb(255,20,147), PorterDuff.Mode.MULTIPLY);
        }
        buttonBeamerAn = (Button) findViewById(R.id.buttonBeamerAn);
        buttonBeamerAus = (Button) findViewById(R.id.buttonBeamerAus);
        if (mapSQLNeu.get("beamer").equals("1")) {
            buttonBeamerAn.getBackground().setColorFilter(Color.rgb(255,20,147), PorterDuff.Mode.MULTIPLY);
        }
        else {
            buttonBeamerAus.getBackground().setColorFilter(Color.rgb(255,20,147), PorterDuff.Mode.MULTIPLY);
        }
        buttonLeinwandAn = (Button) findViewById(R.id.buttonLeinwandAn);
        buttonLeinwandAus = (Button) findViewById(R.id.buttonLeinwandAus);
        if (mapSQLNeu.get("leinwand").equals("1")) {
            buttonLeinwandAn.getBackground().setColorFilter(Color.rgb(255,20,147), PorterDuff.Mode.MULTIPLY);
        }
        else {
            buttonLeinwandAus.getBackground().setColorFilter(Color.rgb(255,20,147), PorterDuff.Mode.MULTIPLY);
        }
        buttonVerstaerkerAn = (Button) findViewById(R.id.buttonVerstaerkerAn);
        buttonVerstaerkerAus = (Button) findViewById(R.id.buttonVerstaerkerAus);
        if (mapSQLNeu.get("verstaerker").equals("1")) {
            buttonVerstaerkerAn.getBackground().setColorFilter(Color.rgb(255,20,147), PorterDuff.Mode.MULTIPLY);
        }
        else {
            buttonVerstaerkerAus.getBackground().setColorFilter(Color.rgb(255,20,147), PorterDuff.Mode.MULTIPLY);
        }
        buttonIpadAn = (Button) findViewById(R.id.buttonIpadAn);
        buttonIpadAus = (Button) findViewById(R.id.buttonIpadAus);
        if (mapSQLNeu.get("ipad").equals("1")) {
            buttonIpadAn.getBackground().setColorFilter(Color.rgb(255,20,147), PorterDuff.Mode.MULTIPLY);
        }
        else {
            buttonIpadAus.getBackground().setColorFilter(Color.rgb(255,20,147), PorterDuff.Mode.MULTIPLY);
        }

        buttonKinoModusAn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/kinoan.php?an=Kino an!";
                kinoAbfrage(urlLink,v);
            }

        });
        buttonKinoModusAus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/kinoaus.php?aus=Kino aus!";
                connect(urlLink, v);
                buttonChangeColor(buttonKinoModusAus);
                buttonChangeColor2(buttonKinoModusAn);
                buttonChangeColor(buttonPcMonitorAn);
                buttonChangeColor2(buttonPcMonitorAus);
                buttonChangeColor(buttonBeamerAus);
                buttonChangeColor2(buttonBeamerAn);
                buttonChangeColor(buttonLeinwandAus);
                buttonChangeColor2(buttonLeinwandAn);
                buttonChangeColor(buttonFilmPause);
                buttonChangeColor2(buttonFilmStart);
                mapSQLNeu.put("kinoModus","0");
                mapSQLNeu.put("pcMonitor","1");
                mapSQLNeu.put("beamer","0");
                mapSQLNeu.put("leinwand","0");
                mapSQLNeu.put("film","0");
            }

        });
        buttonFilmStart.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/filmstart.php?an=Film Start!";
                connect(urlLink, v);
                buttonChangeColor(buttonFilmStart);
                buttonChangeColor2(buttonFilmPause);
                buttonChangeColor(buttonPcMonitorAus);
                buttonChangeColor2(buttonPcMonitorAn);
                mapSQLNeu.put("film","1");
                mapSQLNeu.put("pcMonitor","0");
            }

        });
        buttonFilmPause.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/kinopause.php?aus=Kino Pause!";
                connect(urlLink, v);
                buttonChangeColor(buttonFilmPause);
                buttonChangeColor2(buttonFilmStart);
                buttonChangeColor(buttonPcMonitorAn);
                buttonChangeColor2(buttonPcMonitorAus);
                mapSQLNeu.put("film","0");
                mapSQLNeu.put("pcMonitor","1");
            }

        });
        buttonPcAn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/pcan.php?an=ON";
                connect(urlLink, v);
                buttonChangeColor(buttonPcAn);
                buttonChangeColor2(buttonPcAus);
                buttonChangeColor(buttonPcMonitorAn);
                buttonChangeColor2(buttonPcMonitorAus);
                mapSQLNeu.put("pc","1");
                mapSQLNeu.put("pcMonitor","1");
            }

        });
        buttonPcAus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/pcaus.php?aus=OFF";
                connect(urlLink, v);
                buttonChangeColor(buttonPcAus);
                buttonChangeColor2(buttonPcAn);
                mapSQLNeu.put("pc","0");
            }

        });
        buttonPcMonitorAn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/pcmonitoran.php?an=ON";
                connect(urlLink, v);
                buttonChangeColor(buttonPcMonitorAn);
                buttonChangeColor2(buttonPcMonitorAus);
                mapSQLNeu.put("pcMonitor","1");
            }

        });
        buttonPcMonitorAus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/pcmonitoraus.php?aus=OFF";
                connect(urlLink, v);
                buttonChangeColor(buttonPcMonitorAus);
                buttonChangeColor2(buttonPcMonitorAn);
                mapSQLNeu.put("pcMonitor","0");
            }

        });
        buttonTvMonitorAn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/tvmonitoran.php?an=ON";
                connect(urlLink, v);
                buttonChangeColor(buttonTvMonitorAn);
                buttonChangeColor2(buttonTvMonitorAus);
                mapSQLNeu.put("tvMonitor","1");
            }

        });
        buttonTvMonitorAus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/tvmonitoraus.php?aus=OFF";
                connect(urlLink, v);
                buttonChangeColor(buttonTvMonitorAus);
                buttonChangeColor2(buttonTvMonitorAn);
                mapSQLNeu.put("tvMonitor","0");
            }

        });
        buttonBeamerAn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/beameran.php?an=ON";
                connect(urlLink, v);
                buttonChangeColor(buttonBeamerAn);
                buttonChangeColor2(buttonBeamerAus);
                mapSQLNeu.put("beamer","1");
            }

        });
        buttonBeamerAus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/beameraus.php?aus=OFF";
                connect(urlLink, v);
                buttonChangeColor(buttonBeamerAus);
                buttonChangeColor2(buttonBeamerAn);
                mapSQLNeu.put("beamer","0");
            }

        });
        buttonLeinwandAn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/leinwandrunter.php?an=Down";
                leinwandAbfrage(urlLink,v);
            }

        });
        buttonLeinwandAus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/leinwandhoch.php?aus=Up";
                connect(urlLink, v);
                buttonChangeColor(buttonLeinwandAus);
                buttonChangeColor2(buttonLeinwandAn);
                mapSQLNeu.put("leinwand","0");
            }

        });
        buttonVerstaerkerAn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/verstärker.php?ein=ON";
                connect(urlLink, v);
                buttonChangeColor(buttonVerstaerkerAn);
                buttonChangeColor2(buttonVerstaerkerAus);
                mapSQLNeu.put("verstaerker","1");
            }

        });
        buttonVerstaerkerAus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/verstärker.php?aus=OFF";
                connect(urlLink, v);
                buttonChangeColor(buttonVerstaerkerAus);
                buttonChangeColor2(buttonVerstaerkerAn );
                mapSQLNeu.put("verstaerker","0");
            }

        });
        buttonIpadAn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/ipad.php?an=ON";
                connect(urlLink, v);
                buttonChangeColor(buttonIpadAn);
                buttonChangeColor2(buttonIpadAus);
                mapSQLNeu.put("ipad","1");
            }

        });
        buttonIpadAus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/ipad.php?aus=OFF";
                connect(urlLink, v);
                buttonChangeColor(buttonIpadAus);
                buttonChangeColor2(buttonIpadAn);
                mapSQLNeu.put("ipad","0");
            }

        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.multimedia, menu);
        return true;
    }

    private void kinoAbfrage(final String urlLink, final View v) {
        Context context = this;
        new AlertDialog.Builder(context)
                .setTitle("Kinomodus")
                .setMessage("Alles Frei? Verstärker auf Dolby?")
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        connect(urlLink,v);
                        buttonChangeColor(buttonKinoModusAn);
                        buttonChangeColor2(buttonKinoModusAus);
                        buttonChangeColor(buttonLeinwandAn);
                        buttonChangeColor2(buttonLeinwandAus);
                        buttonChangeColor(buttonVerstaerkerAn);
                        buttonChangeColor2(buttonVerstaerkerAus);
                        buttonChangeColor(buttonPcAn);
                        buttonChangeColor2(buttonPcAus);
                        buttonChangeColor(buttonBeamerAn);
                        buttonChangeColor2(buttonBeamerAus);
                        buttonChangeColor(buttonTvMonitorAus);
                        buttonChangeColor2(buttonTvMonitorAn);
                        buttonChangeColor(buttonPcMonitorAn);
                        buttonChangeColor2(buttonPcMonitorAus);
                        mapSQLNeu.put("kinoModus","1");
                        mapSQLNeu.put("leinwand","1");
                        mapSQLNeu.put("verstaerker","1");
                        mapSQLNeu.put("pc","1");
                        mapSQLNeu.put("beamer","1");
                        mapSQLNeu.put("tvMonitor","0");
                        mapSQLNeu.put("pcMonitor","1");
                    }
                })
                .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // do nothing
                    }
                })
                .setIcon(android.R.drawable.ic_dialog_alert)
                .show();
    }

    private void leinwandAbfrage(final String urlLink, final View v) {
        Context context = this;
        new AlertDialog.Builder(context)
                .setTitle("Leinwand runter")
                .setMessage("Alles Frei? Verstärker auf Dolby?")
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        connect(urlLink,v);
                        buttonChangeColor(buttonLeinwandAn);
                        buttonChangeColor2(buttonLeinwandAus);
                        mapSQLNeu.put("leinwand","1");
                    }
                })
                .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // do nothing
                    }
                })
                .setIcon(android.R.drawable.ic_dialog_alert)
                .show();
    }
}
