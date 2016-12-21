package ixtapa.com.mx.ixtapazihua.WelcomeTabbed;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import ixtapa.com.mx.ixtapazihua.R;

public class EventsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        // Codigo para activar el retroceso
        getSupportActionBar().setDisplayShowTitleEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
