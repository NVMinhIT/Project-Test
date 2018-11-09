package com.example.anhminh.codiachat;

import android.content.Intent;
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
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
     // DatabaseReference mData;

    EditText edtusername , edtpassword;
    Button bsignin;
    private FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        init();



//        mData = FirebaseDatabase.getInstance().getReference();
//        mData.child("Hoten").push().setValue("Nghiem Van Minh");
//
//         User user = new User("nghiemminh","abc", "nvminh0906");
//         mData.child("User").setValue(user);
//    }
    }

    private void init() {
        edtusername = findViewById(R.id.edit_username);
        edtpassword = findViewById(R.id.edit_password);
        bsignin = findViewById(R.id.btn_signin);
        bsignin.setOnClickListener(this);

    }
    private void DangKy(){

        String email = edtusername.getText().toString();
        String password = edtpassword.getText().toString();
        mAuth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            Toast.makeText(MainActivity.this, "thanhcong", Toast.LENGTH_SHORT).show();

                        } else {
                            Toast.makeText(MainActivity.this, "thatbai", Toast.LENGTH_SHORT).show();


                        }

                        // ...
                    }
                });

    }

    @Override
    public void onClick(View v) {
        DangKy();
    }
}
