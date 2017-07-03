package ecomax.tabs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

public class formulario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.formulario_layout);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        String s = getIntent().getStringExtra("EXTRA_SESSION_ID");
        //Toast.makeText(this,s,Toast.LENGTH_SHORT).show();


    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
