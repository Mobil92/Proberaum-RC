package de.pr22.proberaum;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.widget.Button;

public class DrawActivity extends Refactoring
        implements NavigationView.OnNavigationItemSelectedListener {

    private Button buttonLichtAn;
    private Button buttonLichtAus;
    private Button buttonLüfter15Min;
    private Button buttonLuefterAn;
    private Button buttonLuefterAus;
    private Button buttonAllesAus;
    private Button buttonPcAn;
    private Button buttonPcAus;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_draw);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        sql sql = new sql();
        sql.sqlSelect();
        LichtActivity licht = new LichtActivity(sql);
        MultimediaActivity multimedia = new MultimediaActivity(sql);
        VerstaerkerActivity verstaerker = new VerstaerkerActivity(sql);
        EffekteActivity effekte = new EffekteActivity(sql);

        try {
            getSupportActionBar().setTitle("Allgemein");
        } catch (Exception e) {
            Log.e("setTitle", Log.getStackTraceString(e));
        }
        ActivityRegistry.register(this);
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        buttonLichtAn = (Button) findViewById(R.id.buttonLichtAn);
        buttonLichtAus = (Button) findViewById(R.id.buttonLichtAus);
        if (sql.mapSQL.get("licht").equals("1")) {
            buttonLichtAn.getBackground().setColorFilter(Color.rgb(255,20,147), PorterDuff.Mode.MULTIPLY);
        }
        else {
            buttonLichtAus.getBackground().setColorFilter(Color.rgb(255,20,147), PorterDuff.Mode.MULTIPLY);
        }
        Button buttonTuerOeffner = (Button) findViewById(R.id.buttonTuerOeffner);
        Button buttonNotaus = (Button) findViewById(R.id.buttonNotaus);
        buttonLüfter15Min = (Button) findViewById(R.id.buttonLüfter15Min);
        if (sql.mapSQL.get("luefter15min").equals("1")) {
            buttonLüfter15Min.getBackground().setColorFilter(Color.rgb(255,20,147), PorterDuff.Mode.MULTIPLY);
        }
        buttonLuefterAn = (Button) findViewById(R.id.buttonLuefterAn);
        buttonLuefterAus = (Button) findViewById(R.id.buttonLuefteraus);
        if (sql.mapSQL.get("luefter").equals("1")) {
            buttonLuefterAn.getBackground().setColorFilter(Color.rgb(255,20,147), PorterDuff.Mode.MULTIPLY);
        }
        else {
            buttonLuefterAus.getBackground().setColorFilter(Color.rgb(255,20,147), PorterDuff.Mode.MULTIPLY);
        }
        buttonAllesAus = (Button) findViewById(R.id.buttonAllesAus);
        if (sql.mapSQL.get("allesAus").equals("1")) {
            buttonAllesAus.getBackground().setColorFilter(Color.rgb(255,20,147), PorterDuff.Mode.MULTIPLY);
        }
        buttonPcAn = (Button) findViewById(R.id.buttonPcAn);
        buttonPcAus = (Button) findViewById(R.id.buttonPcAus);
        if (sql.mapSQL.get("pc").equals("1")) {
            buttonPcAn.getBackground().setColorFilter(Color.rgb(255,20,147), PorterDuff.Mode.MULTIPLY);
        }
        else {
            buttonPcAus.getBackground().setColorFilter(Color.rgb(255,20,147), PorterDuff.Mode.MULTIPLY);
        }

        buttonLichtAn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/lichtan.php?an=Licht an!";
                connect(urlLink, v);
                buttonChangeColor(buttonLichtAn);
                buttonChangeColor2(buttonLichtAus);
            }

        });
        buttonLichtAus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/lichtaus.php?aus=Licht aus!";
                connect(urlLink, v);
                buttonChangeColor(buttonLichtAus);
                buttonChangeColor2(buttonLichtAn);
            }

        });
        buttonTuerOeffner.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/tuerauf.php?an=Tür auf!";
                connect(urlLink, v);
            }

        });
        buttonNotaus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/notaus.php?aus=Notaus!";
                connect(urlLink, v);
            }

        });
        buttonLüfter15Min.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/lüfteran.php?anlang=Lüfter 15min!";
                connect(urlLink, v);
                buttonChangeColor(buttonLüfter15Min);
                leisteLuefter();
            }

        });
        buttonLuefterAn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/lüfteran.php?an=ON";
                connect(urlLink, v);
                buttonChangeColor(buttonLuefterAn);
                buttonChangeColor2(buttonLuefterAus);
            }

        });
        buttonLuefterAus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/lüfteraus.php?aus=OFF";
                connect(urlLink, v);
                buttonChangeColor(buttonLuefterAus);
                buttonChangeColor2(buttonLuefterAn);
                buttonChangeColor2(buttonLüfter15Min);
            }

        });
        buttonAllesAus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/ausschalten.php?aus=Alles Ausschalten!";
                connect(urlLink, v);
                buttonChangeColor(buttonAllesAus);
                leisteShutdown();
            }

        });
        buttonPcAn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/pcan.php?an=ON";
                connect(urlLink, v);
                buttonChangeColor(buttonPcAn);
                buttonChangeColor2(buttonPcAus);
            }

        });
        buttonPcAus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                urlLink = "http://192.168.1.37:80/pcaus.php?aus=OFF";
                connect(urlLink, v);
                buttonChangeColor(buttonPcAus);
                buttonChangeColor2(buttonPcAn);
            }

        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.draw, menu);
        return true;
    }


    private void leisteLuefter() {
        leisteLuefter2(this);
    }

    private void leisteLuefter2(final Context context) {
        Runnable runnableLeisteLuefter = new Runnable() {
            public void run() {
                int i = 15;
                while (i <= 15) {
                    NotifiLuefter(context, "Lüfter: " + i + " Minuten");
                    i--;
                    try {
                        Thread.sleep(60000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if (i == 0) {
                        NotificationManager mNotificationManagerLuefter = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
                        mNotificationManagerLuefter.cancel(666);
                        break;
                    }
                }

            }
        };
        Thread mythreadLeisteLuefter = new Thread(runnableLeisteLuefter);
        mythreadLeisteLuefter.start();
    }

    private void leisteShutdown() {
        leisteShutdown2(this);
    }

    private void leisteShutdown2(final Context context) {
        Runnable runnableShutdown = new Runnable() {
            public void run() {
                int i = 170;
                while (i <= 170) {
                    NotifiShutdown(context, "Shutdown in: " + i + " Sekunden");
                    i--;
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if (i == 0) {
                        NotificationManager mNotificationManagerShutdown = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
                        mNotificationManagerShutdown.cancel(667);
                        break;
                    }
                }

            }
        };
        Thread mythreadShutdown = new Thread(runnableShutdown);
        mythreadShutdown.start();
    }

    private void NotifiLuefter(Context context, String Nachricht) {
        final Intent notificationIntent = new Intent(context, DrawActivity.class);
        final PendingIntent pi = PendingIntent.getActivity(context, 0, notificationIntent, 0);
        NotificationCompat.Builder mBuilder =
                (NotificationCompat.Builder) new NotificationCompat.Builder(context)
                        .setSmallIcon(R.drawable.logo2)
                        .setContentTitle("Proberaum RC - Lüfter")
                        .setContentIntent(pi)
                        .setContentText(Nachricht);
        NotificationManager mNotificationManagerLuefter = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
        mNotificationManagerLuefter.notify(666, mBuilder.build());
    }

    private void NotifiShutdown(Context context, String Nachricht) {
        final Intent notificationIntent = new Intent(context, DrawActivity.class);
        final PendingIntent pi = PendingIntent.getActivity(context, 0, notificationIntent, 0);
        NotificationCompat.Builder mBuilder =
                (NotificationCompat.Builder) new NotificationCompat.Builder(context)
                        .setSmallIcon(R.drawable.logo2)
                        .setContentTitle("Proberaum RC - Shutdown")
                        .setContentIntent(pi)
                        .setContentText(Nachricht);
        NotificationManager mNotificationManagerShutdown = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
        mNotificationManagerShutdown.notify(667, mBuilder.build());
    }
}