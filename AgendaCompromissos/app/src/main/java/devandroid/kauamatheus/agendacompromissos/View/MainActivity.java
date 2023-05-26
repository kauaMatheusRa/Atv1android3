package devandroid.kauamatheus.agendacompromissos.View;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import devandroid.kauamatheus.agendacompromissos.model.Compromisso;
import devandroid.kauamatheus.agendacompromissos.R;

public class MainActivity extends AppCompatActivity {

    Compromisso compromisso;

    EditText editTitulo;
    EditText editData;
    EditText editHorario;
    EditText editLocal;

    Button btnbutton_Salvar;
    Button btnbutton_Limpar;
    Button btnbutton_Finalizar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        compromisso = new Compromisso();

        editTitulo = findViewById(R.id.editTextTitulo);
        editData = findViewById(R.id.editTextData);
        editHorario = findViewById(R.id.editTextHorario);
        editLocal = findViewById(R.id.editTextLocal);

        btnbutton_Finalizar = findViewById(R.id.button_finalizar);
        btnbutton_Limpar = findViewById(R.id.button_limpar);
        btnbutton_Salvar = findViewById(R.id.button_salvar);

        editTitulo.setText(compromisso.getTitulo());
        editData.setText(compromisso.getData());
        editHorario.setText(compromisso.getHorario());
        editLocal.setText(compromisso.getLocal());

        btnbutton_Limpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTitulo.setText("");
                editData.setText("");
                editHorario.setText("");
                editLocal.setText("");
            }
        });

        btnbutton_Salvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compromisso.setTitulo(editTitulo.getText().toString());
                compromisso.setData(editData.getText().toString());
                compromisso.setHorario(editHorario.getText().toString());
                compromisso.setLocal(editLocal.getText().toString());
                Toast.makeText(MainActivity.this, "Compromisso agendado ✔", Toast.LENGTH_LONG).show();
            }
        });

        btnbutton_Finalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Compromisso concluído ✔", Toast.LENGTH_LONG).show();
            }
        });


    }
}