package com.androidcodehub.floatinglabel;

import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextInputLayout lNameLayout = (TextInputLayout) findViewById(R.id
                .view);
        lNameLayout.setErrorEnabled(true);
        lNameLayout.setError("Min 2 chars required");

        //Displaying EditText Error
        EditText name = (EditText) findViewById(R.id.edit1);
        name.setError("Required");

        //Displaying both TextInputLayout and EditText Errors
        final TextInputLayout email = (TextInputLayout) findViewById(R.id
                .view1);

        final EditText email1 = (EditText) findViewById(R.id.edit2);






email1.addTextChangedListener(new TextWatcher() {
    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {


    }

    @Override
    public void afterTextChanged(Editable s) {


        Pattern EMAIL_ADDRESS_PATTERN = Pattern
                .compile("[a-zA-Z0-9+._%-+]{1,256}" + "@"
                        + "[a-zA-Z0-9][a-zA-Z0-9-]{0,64}" + "(" + "."
                        + "[a-zA-Z0-9][a-zA-Z0-9-]{0,25}" + ")+");


        System.out.println("sssssssssss"+s);
        String s1=email1.getText().toString();

        if(!EMAIL_ADDRESS_PATTERN.matcher(s1).matches())
        {
            email.setError("valid email id is required");
            email.setErrorEnabled(true);
            //     s1=email1.getText().toString();

        } else {
            email.setError(null);
            //       s1=email1.getText().toString();
        }



    }
});

    }
}
