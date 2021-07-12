package lord.apps.calculadoradecamellos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.content.Intent;

public class Resultados extends AppCompatActivity {

    TextView result;
    int pnts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resultados);

        TextView result = findViewById(R.id.resultados);

        Intent intent = getIntent();
        String str = getIntent().getStringExtra("message_key");
        result.setText(str);
    }

    public void repetir(View view){
        Intent intent = new Intent(this, Gender.class);
        startActivity(intent);
    }
}