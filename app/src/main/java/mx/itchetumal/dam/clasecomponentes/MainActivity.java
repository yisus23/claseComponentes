package mx.itchetumal.dam.clasecomponentes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void GenerarRFC(View v) {
        //tomar la primera letra y primer vocal del apellido paterno
        EditText edtApellidoPaterno = (EditText) findViewById(R.id.edtApellidoPaterno);
        char primeraLetraP = edtApellidoPaterno.getText().charAt(0);


       char [] Vocales = {'A' ,'E' ,'I' ,'O' ,'U' ,'a' ,'e' ,'i' ,'o' ,'u', 'á' ,'é' ,'í' ,'ó' ,'ú'};
        //tomar la ptimera letra el apelido materno

        //tomar la primera letra del nombre

        //tomar los ultimos digitos del año de nacimiento


        //tomar los dos digitos del mes de nacimiento


        // tomar los dos digitos del dia del nacimiento

        // generar  3 caracteres (Letras mayusculas o numeros )para la homonimia



        //concatenar lo anterior y mostrar el RFC
    }








}
