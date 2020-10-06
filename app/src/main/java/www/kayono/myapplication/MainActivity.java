package www.kayono.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void tampilkan(View view) {
        EditText namaEditText=findViewById(R.id.namaEditText);
        String nama=namaEditText.getText().toString();
        TextView namaTextView= findViewById(R.id.namaTextView);
        namaTextView.setText("Nama Anda :"+ nama);
    }
}