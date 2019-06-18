package casariego.jorge.createpdf;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    private Button crearPdf1;
    private Button crearPdf2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        crearPdf1 = (Button) findViewById(R.id.crear1);
        crearPdf1.setOnClickListener(this);

        crearPdf2 = (Button) findViewById(R.id.crear2);
        crearPdf2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i = null;

        switch (v.getId()){
            case R.id.crear1:
                i = new Intent(this, Pdf1Activity.class);
                break;
            case R.id.crear2:
                i = new Intent(this, Pdf2Activity.class);
                break;
        }

        startActivity(i);
    }
}
