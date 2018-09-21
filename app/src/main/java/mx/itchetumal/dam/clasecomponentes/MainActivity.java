package mx.itchetumal.dam.clasecomponentes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public String adecuarCadena(String cadena){
        String cadAux = cadena.toUpperCase().trim();
        char [] vocalesAcentuadas = {'Á' ,'É' ,'Í' ,'Ó' ,'Ú' };
        char [] vocales = {'A' ,'E' ,'I' ,'O' ,'U' };
        for (byte pos  = 0; pos < vocalesAcentuadas.length; pos++){
        cadAux.replace(vocalesAcentuadas[pos],vocales[pos]);

        }
        return cadAux;
    }

    public void generarRFC(View v) {
        //tomar la primera letra y primer vocal del apellido paterno
        EditText edtApellidoPaterno = (EditText) findViewById(R.id.edtApellidoPaterno);
        String apPaterno  = adecuarCadena(edtApellidoPaterno.getText().toString());


       Toast.makeText(this, "Cadena convertida" + apPaterno, Toast.LENGTH_LONG).show();


        char primeraLetraP = apPaterno.charAt(0);
        char[] vocales = {'A' ,'E' ,'I' ,'O' ,'U' };
        char primeravocal = ' ';
        byte pos;
        boolean encontrada = false;
        for (pos  = 0; pos < vocales.length; pos++){
            if (apPaterno.indexOf(vocales[pos])>=0){
                encontrada = true;
                break;
            }
        }
        if (encontrada){
            primeravocal = vocales[pos];
        }



         //tomar la ptimera letra el apelido materno
        EditText edtApellidoMaterno = (EditText) findViewById(R.id.edtApellidoMaterno);
        char primeraLetraM  = edtApellidoMaterno.getText().charAt(0);
        //tomar la primera letra del nombre
        EditText edtNombre = (EditText) findViewById(R.id.edtNombre);
        char primeraLetraNombre = edtNombre.getText().charAt(0);
        //tomar los ultimos digitos del año de nacimiento


        //tomar los dos digitos del mes de nacimiento


        // tomar los dos digitos del dia del nacimiento

         // generar  3 caracteres (Letras mayusculas o numeros )para la homonimia



        //concatenar lo anterior y mostrar el RFC
    }








}
