package devandroid.kauamatheus.applistatarefas.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import devandroid.kauamatheus.applistatarefas.model.Tarefas;
import devandroid.kauamatheus.applistatarefas.R;

public class MainActivity extends AppCompatActivity {

    Tarefas tarefas;
    Tarefas outratarefa;

    EditText editTitulo;
    EditText editObservacao;
    EditText editData;

    Button btnbutton_Salvar;
    Button btnbutton_Limpar;
    Button btnbutton_Finalizar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tarefas = new Tarefas();

        outratarefa = new Tarefas();

        editTitulo = findViewById(R.id.editTextTitulo);
        editObservacao = findViewById(R.id.editTextObservacao);
        editData = findViewById(R.id.editTextDate);

        btnbutton_Salvar = findViewById(R.id.button_salvar);
        btnbutton_Limpar = findViewById(R.id.button_limpar);
        btnbutton_Finalizar = findViewById(R.id.button_finalizar);

        editTitulo.setText(tarefas.getTitulo());
        editObservacao.setText(tarefas.getObservacoes());
        editData.setText(tarefas.getData());

        btnbutton_Limpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTitulo.setText("");
                editObservacao.setText("");
                editData.setText("");
            }
        });


        btnbutton_Finalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Concluida ✔", Toast.LENGTH_LONG).show();
            }
        });

        btnbutton_Salvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                outratarefa.setTitulo(editTitulo.getText().toString());
                outratarefa.setObservacoes(editObservacao.getText().toString());
                outratarefa.setData(editData.getText().toString());

                Toast.makeText(MainActivity.this, "Dados salvos ✔\n" + outratarefa.toString(), Toast.LENGTH_LONG).show();
            }
        });

    }
}