package de.pr22.proberaum;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.StrictMode;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

class Refactoring extends AppCompatActivity {

    String urlLink = "";

    @SuppressWarnings("StatementWithEmptyBody")
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        //if(ActivityRegistry.query().contains("DrawActivity")) {
        //finish();
        //}
        //ActivityRegistry.register("DrawActivity");
        if (id == R.id.nav_allgemein) {
            Intent intent = new Intent(this, DrawActivity.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
        } else if (id == R.id.nav_licht) {
            Intent intent = new Intent(this, LichtActivity.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
        } else if (id == R.id.nav_multimedia) {
            Intent intent = new Intent(this, MultimediaActivity.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
        } else if (id == R.id.nav_verstaerker) {
            Intent intent = new Intent(this, VerstaerkerActivity.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
        } else if (id == R.id.nav_effekte) {
            Intent intent = new Intent(this, EffekteActivity.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
        } else if (id == R.id.nav_ueber) {
            Intent intent = new Intent(this, UeberActivity.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
        } else if (id == R.id.nav_beenden) {
            ActivityRegistry.finishAll();
        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    void connect(final String urlLink, final View v) {
        Runnable runnable = new Runnable() {
            public void run() {
                StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
                StrictMode.setThreadPolicy(policy);

                try {
                    URL url = new URL(urlLink);
                    URLConnection conn = url.openConnection();
                    InputStream is = conn.getInputStream();
                    is.close();
                    Snackbar.make(v, "Erfolgreich", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                } catch (IOException ex) {
                    Log.e("httptest", Log.getStackTraceString(ex));
                    Snackbar.make(v, "Fehler", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                }
            }
        };
        Thread mythread = new Thread(runnable);
        mythread.start();
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            ActivityRegistry.finishAll();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void buttonChangeColor(Button button) {
        button.getBackground().setColorFilter(Color.rgb(255,20,147), PorterDuff.Mode.MULTIPLY);
    }

    public void buttonChangeColor2(Button button) {
        button.getBackground().setColorFilter(Color.rgb(207,207,207), PorterDuff.Mode.MULTIPLY);
    }
}
