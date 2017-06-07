package com.saija.android.intents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CreateMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_message);
    }

    public void onSendMessage(View view){
        EditText editor = (EditText)findViewById(R.id.message);
        String mensaje = editor.getText().toString();

        Intent intecional = new Intent(this, ReceiveMessageActivity.class);
        intecional.putExtra(ReceiveMessageActivity.ENVIO_MENSAJE,mensaje);

        startActivity(intecional);

    }

    public void onSendMessageIntentAction(View view){
        EditText editor = (EditText)findViewById(R.id.message);
        String mensaje = editor.getText().toString();
        String tituloChooser = getString(R.string.chooser);

        Intent intencional = new Intent(Intent.ACTION_SEND);
        intencional.setType("text/plain");
        intencional.putExtra(Intent.EXTRA_TEXT,mensaje);

        Intent chooser = Intent.createChooser(intencional,tituloChooser);


        startActivity(chooser);

    }
}
