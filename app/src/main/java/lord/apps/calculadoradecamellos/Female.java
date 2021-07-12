package lord.apps.calculadoradecamellos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class Female extends AppCompatActivity {

    public int pnts = 50;
    public Button calcularM;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.female_app);

        calcularM = (Button)findViewById(R.id.calcularM);

        calcularM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String llevo = Integer.toString(pnts);

                Intent intent = new Intent(getApplicationContext(), Resultados.class);

                intent.putExtra("message_key", llevo);

                startActivity(intent);
            }
        });
    }

    public void mEdad(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.edad1:
                if (checked)
                    pnts = pnts - 5;
                break;
            case R.id.edad2:
                if (checked)
                    pnts = pnts + 10;
                break;
            case R.id.edad3:
                if (checked)
                    pnts = pnts + 5;
                break;
            case R.id.edad4:
                if (checked)
                    pnts = pnts + 0;
                break;
            case R.id.edad5:
                if (checked)
                    pnts = pnts - 10;
                break;
            case R.id.edad6:
                if (checked)
                    pnts = pnts - 20;
                break;
        }
    }

    public void mAltura(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.altura1:
                if (checked)
                    pnts = pnts;
                break;
            case R.id.altura2:
                if (checked)
                    pnts = pnts + 5;
                break;
            case R.id.altura3:
                if (checked)
                    pnts = pnts + 10;
                break;
            case R.id.altura4:
                if (checked)
                    pnts = pnts - 5;
                break;
            case R.id.altura5:
                if (checked)
                    pnts = pnts - 10;
                break;
            case R.id.altura6:
                if (checked)
                    pnts = pnts - 15;
                break;
        }
    }

    public void mCuerpo(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.cuerpo1:
                if (checked)
                    pnts = pnts - 10;
                break;
            case R.id.cuerpo2:
                if (checked)
                    pnts = pnts + 5 ;
                break;
            case R.id.cuerpo3:
                if (checked)
                    pnts = pnts - 5;
                break;
            case R.id.cuerpo4:
                if (checked)
                    pnts = pnts + 10;
                break;
            case R.id.cuerpo5:
                if (checked)
                    pnts = pnts;
                break;
        }
    }

    public void mLargo(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.largo1:
                if (checked)
                    pnts = pnts - 15;
                break;
            case R.id.largo2:
                if (checked)
                    pnts = pnts - 5;
                break;
            case R.id.largo3:
                if (checked)
                    pnts = pnts;
                break;
            case R.id.largo4:
                if (checked)
                    pnts = pnts + 5;
                break;
        }
    }

    public void mPelo(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.pelo1:
                if (checked)
                    pnts = pnts;
                break;
            case R.id.pelo2:
                if (checked)
                    pnts = pnts;
                break;
            case R.id.pelo3:
                if (checked)
                    pnts = pnts + 5;
                break;
            case R.id.pelo4:
                if (checked)
                    pnts = pnts + 5;
                break;
            case R.id.pelo5:
                if (checked)
                    pnts = pnts - 10;
                break;
        }
    }

    public void mOjos(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.ojos1:
                if (checked)
                    pnts = pnts;
                break;
            case R.id.ojos2:
                if (checked)
                    pnts = pnts - 5;
                break;
            case R.id.ojos3:
                if (checked)
                    pnts = pnts + 10;
                break;
            case R.id.ojos4:
                if (checked)
                    pnts = pnts + 5;
                break;
            case R.id.ojos5:
                if (checked)
                    pnts = pnts;
                break;
        }
    }

}