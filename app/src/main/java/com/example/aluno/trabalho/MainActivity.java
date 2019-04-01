package com.example.aluno.trabalho;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText valor1;
    private EditText valor2;
    private Button mais;
    private Button menos;
    private Button vezes;
    private Button result;
    private TextView textoResult;
    private Button apagar;//aaaaaaaaaaaaaaaaaaaaaa
 //private + tipo + nome da variavel


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        valor1 = (EditText) findViewById(R.id.valor1);
        valor2 = (EditText) findViewById(R.id.valor2);
        mais = (Button) findViewById(R.id.mais);
        menos = (Button) findViewById(R.id.menos);
        vezes = (Button) findViewById(R.id.vezes);
        apagar = (Button) findViewById(R.id.apagar);//aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa

        textoResult = (TextView) findViewById(R.id.textoResult);
        //nome da variavel = (converter o tipo da variavel) + findViewById(R.id.-nome do id-);

        mais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try{

                    // Busca o valor digitado como String e converte pra Double
                     Double v1 = Double.parseDouble(valor1.getText().toString());
                     Double v2 = Double.parseDouble(valor2.getText().toString());

                     //fazendo a conta do botão mais
                    Double total = v1+v2;

                    textoResult.setText("O resultado é: "+total);
                    Toast.makeText(MainActivity.this, "Concluido", Toast.LENGTH_LONG).show();
                } catch (Exception E){
                    Toast.makeText(MainActivity.this, "Houve um erro! Tente novamente!", Toast.LENGTH_LONG).show();
                }
            }
        });
        menos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try{

                    // Busca o valor digitado como String e converte pra Double
                    Double v1 = Double.parseDouble(valor1.getText().toString());
                    Double v2 = Double.parseDouble(valor2.getText().toString());

                    //fazendo a conta do botão mais
                    Double total = v1-v2;

                    textoResult.setText("O resultado é: "+total);
                    Toast.makeText(MainActivity.this, "Concluido", Toast.LENGTH_LONG).show();
                } catch (Exception E){
                    Toast.makeText(MainActivity.this, "Houve um erro! Tente novamente!", Toast.LENGTH_LONG).show();
                }

            }
        });
        vezes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{

                    // Busca o valor digitado como String e converte pra Double
                    Double v1 = Double.parseDouble(valor1.getText().toString());
                    Double v2 = Double.parseDouble(valor2.getText().toString());

                    //fazendo a conta do botão mais
                    Double total = v1*v2;

                    textoResult.setText("O resultado é: "+total);
                    Toast.makeText(MainActivity.this, "Concluido", Toast.LENGTH_LONG).show();
                } catch (Exception E){
                    Toast.makeText(MainActivity.this, "Houve um erro! Tente novamente!", Toast.LENGTH_LONG).show();
                }
            }
        });

        apagar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{

                    valor1.setText("");
                    valor2.setText("");

                    textoResult.setText("");

                    Toast.makeText(MainActivity.this, "Apagado!", Toast.LENGTH_LONG).show();

                }catch(Exception E){
                    Toast.makeText(MainActivity.this, "Houve um erro! Tente novamente!", Toast.LENGTH_LONG).show();

                }
            }
        });

    }
}
