package com.example.aj.dar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ServerActivity extends AppCompatActivity {

    Server server;
    EditText sub,branch;
    TextView ip,port;
    Button startServer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_server);

        sub = (EditText)findViewById(R.id.subText);
        branch = (EditText)findViewById(R.id.branchInfo);

    }
}
