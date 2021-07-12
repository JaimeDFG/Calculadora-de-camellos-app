package lord.apps.calculadoradecamellos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class Gender extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gender);
    }
    public void maleButton(View view){
        Intent intent = new Intent(this, Male.class);
        startActivity(intent);
    }
    public void femaleButton(View view){
        Intent intent = new Intent(this, Female.class);
        startActivity(intent);
    }
}