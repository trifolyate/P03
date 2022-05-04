package sg.edu.rp.c346.id21008946.p03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    Button btn;
    EditText et;
    TextView tv;
    ToggleButton tb;
    RadioGroup rg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btn1);
        et = findViewById(R.id.et1);
        tv = findViewById(R.id.tv1);
        tb = findViewById(R.id.toggleButton);
        rg = findViewById(R.id.rgGender);


        tb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tb.isChecked())
                {
                    et.setEnabled(true);
                }
                else
                {
                    et.setEnabled(false);
                }
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String txt = "";
                int checkedRadioId = rg.getCheckedRadioButtonId();
                if(checkedRadioId == R.id.rbMale)
                {
                    txt = "He says " + (et.getText().toString());
                }
                else
                {
                    txt = "She says" + (et.getText().toString());
                }
                tv.setText(txt);
            }
        });

    }
}