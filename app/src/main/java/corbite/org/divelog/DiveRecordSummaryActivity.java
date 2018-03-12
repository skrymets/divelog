package corbite.org.divelog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class DiveRecordSummaryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dive_record_summary);

        Toolbar toolbar = (Toolbar) findViewById(R.id.dive_record_toolbar);
        setSupportActionBar(toolbar);
    }
}
