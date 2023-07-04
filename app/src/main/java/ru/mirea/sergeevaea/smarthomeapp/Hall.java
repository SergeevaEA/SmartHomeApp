package ru.mirea.sergeevaea.smarthomeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Hall extends AppCompatActivity {
    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference socketHallDB = database.getReference("HallSocket");
    DatabaseReference lightHallDB = database.getReference("HallLight");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hall);

        Button btnFromHall = (Button) findViewById(R.id.btnFromHall);

        View.OnClickListener onClickBtnFromHall = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Hall.this, MainActivity.class);
                startActivity(intent);
            }
        };

        btnFromHall.setOnClickListener(onClickBtnFromHall);

        Button socketHall = (Button) findViewById(R.id.socketHall);
        Button lightHall = (Button) findViewById(R.id.lightHall);

        socketHallDB.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // Получить значение узла
                Object value = dataSnapshot.getValue();
                // Обработать полученное значение
                int currentValue = Integer.parseInt((value.toString()));
                if (currentValue == 1) {
                    socketHall.setBackgroundColor(Color.rgb(254, 125, 3));
                } else {
                    socketHall.setBackgroundColor(Color.rgb(81, 81, 81));
                }
            }

            @Override
            public void onCancelled(DatabaseError error) {

            }
        });

        lightHallDB.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // Получить значение узла
                Object value = dataSnapshot.getValue();
                // Обработать полученное значение
                int currentValue = Integer.parseInt((value.toString()));
                if (currentValue == 1) {
                    lightHall.setBackgroundColor(Color.rgb(254, 125, 3));
                } else {
                    lightHall.setBackgroundColor(Color.rgb(81, 81, 81));
                }
            }

            @Override
            public void onCancelled(DatabaseError error) {

            }
        });

        socketHall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                socketHallDB.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        // Получить значение узла
                        Object value1 = dataSnapshot.getValue();
                        // Обработать полученное значение
                        int currentValue = Integer.parseInt((value1.toString()));
                        int newValue = 0;
                        if (currentValue == 0) {
                            socketHall.setBackgroundColor(Color.rgb(254, 125, 3));
                            newValue = 1;
                        } else {
                            socketHall.setBackgroundColor(Color.rgb(81, 81, 81));
                            newValue = 0;
                        }
                        socketHallDB.setValue(newValue);
                    }
                    @Override
                    public void onCancelled(DatabaseError error) {

                    }
                });
            }
        });

        lightHall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lightHallDB.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        // Получить значение узла
                        Object value1 = dataSnapshot.getValue();
                        // Обработать полученное значение
                        int currentValue = Integer.parseInt((value1.toString()));
                        int newValue = 0;
                        if (currentValue == 0) {
                            lightHall.setBackgroundColor(Color.rgb(254, 125, 3));
                            newValue = 1;
                        } else {
                            lightHall.setBackgroundColor(Color.rgb(81, 81, 81));
                            newValue = 0;
                        }
                        lightHallDB.setValue(newValue);
                    }
                    @Override
                    public void onCancelled(DatabaseError error) {

                    }
                });
            }
        });
    }
}