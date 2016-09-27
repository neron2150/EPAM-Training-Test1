package by.nikita.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnChange;
    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnChange = (Button)findViewById(R.id.button);
        txt =       (TextView)findViewById(R.id.txt);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txt.getText() == getString(R.string.label_text1))
                    txt.setText(R.string.label_text2);
                else
                    txt.setText(R.string.label_text1);

            }
        };
        btnChange.setOnClickListener(listener);

    }
}
