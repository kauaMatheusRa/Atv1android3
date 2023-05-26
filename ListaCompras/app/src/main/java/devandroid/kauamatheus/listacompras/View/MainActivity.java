package devandroid.kauamatheus.listacompras.View;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import devandroid.kauamatheus.listacompras.model.Compra;
import devandroid.kauamatheus.listacompras.R;

public class MainActivity extends AppCompatActivity {

    Compra compra;
    Compra outracompra;

    EditText editNome;
    EditText editQuantidade;
    EditText editLocalidade;

    Button btnbutton_Salvar;
    Button btnbutton_Limpar;
    Button btnbutton_Finalizar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        compra = new Compra();

        outracompra = new Compra();

        editNome = findViewById(R.id.editTextNome);
        editQuantidade = findViewById(R.id.editTextQuantidade);
        editLocalidade = findViewById(R.id.editTextLocalidade);

        btnbutton_Limpar = findViewById(R.id.button_limpar);
        btnbutton_Finalizar = findViewById(R.id.button_finalizar);
        btnbutton_Salvar = findViewById(R.id.button_salvar);

        editNome.setText(compra.getNome());
        editQuantidade.setText(compra.getQuantidade());
        editLocalidade.setText(compra.getLocal());

        btnbutton_Limpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editNome.setText("");
                editQuantidade.setText("");
                editLocalidade.setText("");
            }
        });

        btnbutton_Salvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compra.setNome(editNome.getText().toString());
                compra.setQuantidade(editQuantidade.getText().toString());
                compra.setLocal(editLocalidade.getText().toString());
                Toast.makeText(MainActivity.this, "Salvo na cesta de compras ✔\n" + compra.toString(), Toast.LENGTH_LONG).show();
            }
        });

        btnbutton_Finalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Compra realizada com sucesso ✔", Toast.LENGTH_LONG).show();
            }
        });

    }
}