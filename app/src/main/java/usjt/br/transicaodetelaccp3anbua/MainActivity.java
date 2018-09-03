
/**

 *RA: 816114937
 *NOME: Matheus Moura Borges Silva

 */

package usjt.br.transicaodetelaccp3anbua;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {
    public final  static String  mensagem= "br.usjt.TransicaoDeTelaCCP3ANBUA.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view){
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText)findViewById(R.id.edit_message);
        String message = editText.getText().toString();
        intent.putExtra(mensagem, message);
        startActivity(intent);

    }
}
