package com.example.anhminh.codiachat;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class ActivityRegister extends AppCompatActivity  {
    EditText edtusername , edtpassword;
    Button bsignup , bcancel;
    private FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Anhxa();
    }

    private void Anhxa() {

        edtusername = findViewById(R.id.edit_email);
        edtpassword = findViewById(R.id.edt_register);
        bsignup = findViewById(R.id.btn_signup);
         bcancel = findViewById(R.id.btn_cancel);
         bsignup.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 DangKy();
             }
         });



    }

    private  void DangKy(){
       String email = edtusername.getText().toString();
       String password = edtpassword.getText().toString();
        mAuth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            Toast.makeText(ActivityRegister.this, "Dang ky thanh cong ", Toast.LENGTH_SHORT).show();

                        } else {
                            Toast.makeText(ActivityRegister.this, "Loi" , Toast.LENGTH_SHORT).show();

                        }

                        // ...
                    }
                });
    }


}
