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

public class LivingRoom extends AppCompatActivity {
    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference TVLivingRoomDB = database.getReference("LivingRoomTV");
    DatabaseReference socket1LivingRoomDB = database.getReference("LivingRoomSocket1");
    DatabaseReference socket2LivingRoomDB = database.getReference("LivingRoomSocket2");
    DatabaseReference lightLivingRoomDB = database.getReference("LivingRoomLight");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_living_room);

        Button btnFromLivingRoom = (Button) findViewById(R.id.btnFromLivingRoom);

        View.OnClickListener onClickBtnFromLivingRoom = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LivingRoom.this, MainActivity.class);
                startActivity(intent);
            }
        };

        btnFromLivingRoom.setOnClickListener(onClickBtnFromLivingRoom);

        Button TVLivingRoom = (Button) findViewById(R.id.TVLivingRoom);
        Button socket1LivingRoom = (Button) findViewById(R.id.socket1LivingRoom);
        Button socket2LivingRoom = (Button) findViewById(R.id.socket2LivingRoom);
        Button lightLivingRoom = (Button) findViewById(R.id.lightLivingRoom);

        TVLivingRoomDB.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // Получить значение узла
                Object value = dataSnapshot.getValue();
                // Обработать полученное значение
                int currentValue = Integer.parseInt((value.toString()));
                if (currentValue == 1) {
                    TVLivingRoom.setBackgroundColor(Color.rgb(254, 125, 3));
                } else {
                    TVLivingRoom.setBackgroundColor(Color.rgb(81, 81, 81));
                }
            }

            @Override
            public void onCancelled(DatabaseError error) {

            }
        });

        socket1LivingRoomDB.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // Получить значение узла
                Object value = dataSnapshot.getValue();
                // Обработать полученное значение
                int currentValue = Integer.parseInt((value.toString()));
                if (currentValue == 1) {
                    socket1LivingRoom.setBackgroundColor(Color.rgb(254, 125, 3));
                } else {
                    socket1LivingRoom.setBackgroundColor(Color.rgb(81, 81, 81));
                }
            }

            @Override
            public void onCancelled(DatabaseError error) {

            }
        });

        socket2LivingRoomDB.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // Получить значение узла
                Object value = dataSnapshot.getValue();
                // Обработать полученное значение
                int currentValue = Integer.parseInt((value.toString()));
                if (currentValue == 1) {
                    socket2LivingRoom.setBackgroundColor(Color.rgb(254, 125, 3));
                } else {
                    socket2LivingRoom.setBackgroundColor(Color.rgb(81, 81, 81));
                }
            }

            @Override
            public void onCancelled(DatabaseError error) {

            }
        });

        lightLivingRoomDB.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // Получить значение узла
                Object value = dataSnapshot.getValue();
                // Обработать полученное значение
                int currentValue = Integer.parseInt((value.toString()));
                if (currentValue == 1) {
                    lightLivingRoom.setBackgroundColor(Color.rgb(254, 125, 3));
                } else {
                    lightLivingRoom.setBackgroundColor(Color.rgb(81, 81, 81));
                }
            }

            @Override
            public void onCancelled(DatabaseError error) {

            }
        });

        TVLivingRoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TVLivingRoomDB.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        // Получить значение узла
                        Object value = dataSnapshot.getValue();
                        // Обработать полученное значение
                        int currentValue = Integer.parseInt((value.toString()));
                        int newValue;
                        if (currentValue == 0) {
                            TVLivingRoom.setBackgroundColor(Color.rgb(254, 125, 3));
                            newValue = 1;
                        } else {
                            TVLivingRoom.setBackgroundColor(Color.rgb(81, 81, 81));
                            newValue = 0;
                        }
                        TVLivingRoomDB.setValue(newValue);
                    }
                    @Override
                    public void onCancelled(DatabaseError error) {

                    }
                });
            }
        });

        socket1LivingRoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                socket1LivingRoomDB.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        // Получить значение узла
                        Object value = dataSnapshot.getValue();
                        // Обработать полученное значение
                        int currentValue = Integer.parseInt((value.toString()));
                        int newValue;
                        if (currentValue == 0) {
                            socket1LivingRoom.setBackgroundColor(Color.rgb(254, 125, 3));
                            newValue = 1;
                        } else {
                            socket1LivingRoom.setBackgroundColor(Color.rgb(81, 81, 81));
                            newValue = 0;
                        }
                        socket1LivingRoomDB.setValue(newValue);
                    }
                    @Override
                    public void onCancelled(DatabaseError error) {

                    }
                });
            }
        });

        socket2LivingRoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                socket2LivingRoomDB.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        // Получить значение узла
                        Object value = dataSnapshot.getValue();
                        // Обработать полученное значение
                        int currentValue = Integer.parseInt((value.toString()));
                        int newValue;
                        if (currentValue == 0) {
                            socket2LivingRoom.setBackgroundColor(Color.rgb(254, 125, 3));
                            newValue = 1;
                        } else {
                            socket2LivingRoom.setBackgroundColor(Color.rgb(81, 81, 81));
                            newValue = 0;
                        }
                        socket2LivingRoomDB.setValue(newValue);
                    }
                    @Override
                    public void onCancelled(DatabaseError error) {

                    }
                });
            }
        });

        lightLivingRoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lightLivingRoomDB.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        // Получить значение узла
                        Object value = dataSnapshot.getValue();
                        // Обработать полученное значение
                        int currentValue = Integer.parseInt((value.toString()));
                        int newValue;
                        if (currentValue == 0) {
                            lightLivingRoom.setBackgroundColor(Color.rgb(254, 125, 3));
                            newValue = 1;
                        } else {
                            lightLivingRoom.setBackgroundColor(Color.rgb(81, 81, 81));
                            newValue = 0;
                        }
                        lightLivingRoomDB.setValue(newValue);
                    }
                    @Override
                    public void onCancelled(DatabaseError error) {

                    }
                });
            }
        });
    }
}