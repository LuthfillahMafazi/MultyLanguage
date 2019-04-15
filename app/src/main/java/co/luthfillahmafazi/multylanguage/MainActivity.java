package co.luthfillahmafazi.multylanguage;

import android.content.Intent;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtView = findViewById(R.id.txtView);
        txtView.setText(getResources().getString(R.string.hello_word));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.action_change_setting) {
            Intent intent = new Intent(Settings.ACTION_LOCALE_SETTINGS);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}
