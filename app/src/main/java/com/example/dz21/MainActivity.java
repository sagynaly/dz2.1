package com.example.dz21;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.ContextMenu;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.dz21.R;

import java.lang.reflect.GenericArrayType;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private EditText EditText_email, EditText_password;
    private Button button;
    private TextView textView;


    String email = "admin@gmail.com";
    String password = "admin";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText_email = findViewById(R.id.login);
        EditText_password = findViewById(R.id.pass);
        button = findViewById(R.id.signin);
        textView = findViewById(R.id.tv_3




        );
        button.setOnClickListener(view -> {
            ;
            if (EditText_email.getText().toString().equals(email) && EditText_password.getText().toString().equals(password)) {
                EditText_password.setVisibility(View.GONE);
                EditText_email.setVisibility(View.GONE);
                button.setVisibility(View.GONE);
                textView.setVisibility(View.GONE);
                Toast.makeText(this, "Вы успешно вошли!", Toast.LENGTH_LONG).show();

            } else if (EditText_email.getText().toString().isEmpty() && EditText_password.getText().toString().isEmpty()) {
                Toast.makeText(this,"Поля пустые, Пожалуйста ввидите данные!", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Неправильные данные!", Toast.LENGTH_SHORT).show();
            }
        });
        EditText_email.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (EditText_email.getText().toString().isEmpty()){
                    ;
                    button.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.dc));
                }else {
                    button.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.orange));

                }
            }
        });
        EditText_password.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (EditText_password.getText().toString().isEmpty()){

                    button.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.dc));
                }else {
                    button.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.orange));
                }

            }
        });

        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
    }

}
