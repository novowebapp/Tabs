package ecomax.tabs;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Toast;

/**
 * Created by aepedro.rodrigues on 06/07/2017.
 */

public class login extends Activity {

    SharedPreferences prefs = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Perhaps set content view here

        prefs = getSharedPreferences("com.mycompany.myAppName", MODE_PRIVATE);

    }

    @Override
    protected void onResume() {
        super.onResume();

        if (prefs.getBoolean("firstrun", true)) {
            // Do first run stuff here then set 'firstrun' as false
            // using the following line to edit/commit prefsR
            //Toast.makeText(this,"primeiro login",Toast.LENGTH_LONG).show();
            prefs.edit().putBoolean("firstrun", false).commit();
        }else {
            Toast.makeText(this,"usuário logado",Toast.LENGTH_LONG).show();

        }
    }
}