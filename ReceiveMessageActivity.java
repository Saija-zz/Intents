package com.saija.android.intents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ReceiveMessageActivity extends AppCompatActivity {

    public static final String ENVIO_MENSAJE = "ENVIA_MENSAJE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive_message);

        Intent intencion = getIntent();
        String mensaje = intencion.getStringExtra(ENVIO_MENSAJE);
        TextView txtOutput = (TextView)findViewById(R.id.receptor);
        txtOutput.setText(mensaje);

    }
}
