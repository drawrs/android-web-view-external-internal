package id.rizalhilman.webviewandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    // Deklarasi Variable
    Button btnExternal;
    Button btnInternal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Inisialisasi
        btnExternal = findViewById(R.id.btnWebExternal);
        btnInternal = findViewById(R.id.btnWebInternal);
        // set OnClick
        btnExternal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // mulai activitty baru
                startActivity(new Intent(MainActivity.this, WebExternalActivity.class));
            }
        });
        // event klik lagi
        btnInternal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // mulai
                startActivity(new Intent(MainActivity.this, WebInternalActivity.class));
            }
        });

    }
}
