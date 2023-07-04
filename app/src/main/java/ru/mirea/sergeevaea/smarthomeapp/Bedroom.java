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

public class Bedroom extends AppCompatActivity {
    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference conditionerBedroomDB = database.getReference("BedroomConditioner");
    DatabaseReference socket1BedroomDB = database.getReference("BedroomSocket1");
    DatabaseReference socket2BedroomDB = database.getReference("BedroomSocket2");
    DatabaseReference lightBedroomDB = database.getReference("BedroomLight");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bedroom);

        Button btnFromBedroom = (Button) findViewById(R.id.btnFromBedroom);

        View.OnClickListener onClickBtnFromBedroom = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Bedroom.this, MainActivity.class);
                startActivity(intent);
            }
        };

        btnFromBedroom.setOnClickListener(onClickBtnFromBedroom);

        Button conditionerBedroom = (Button) findViewById(R.id.conditionerBedroom);
        Button socket1Bedroom = (Button) findViewById(R.id.socket1Bedroom);
        Button socket2Bedroom = (Button) findViewById(R.id.socket2Bedroom);
        Button lightBedroom = (Button) findViewById(R.id.lightBedroom);

        conditionerBedroomDB.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // Получить значение узла
                Object value = dataSnapshot.getValue();
                // Обработать полученное значение
                int currentValue = Integer.parseInt((value.toString()));
                if (currentValue == 1) {
                    conditionerBedroom.setBackgroundColor(Color.rgb(254, 125, 3));
                } else {
                    conditionerBedroom.setBackgroundColor(Color.rgb(81, 81, 81));
                }
            }

            @Override
            public void onCancelled(DatabaseError error) {

            }
        });

        socket1BedroomDB.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // Получить значение узла
                Object value = dataSnapshot.getValue();
                // Обработать полученное значение
                int currentValue = Integer.parseInt((value.toString()));
                if (currentValue == 1) {
                    socket1Bedroom.setBackgroundColor(Color.rgb(254, 125, 3));
                } else {
                    socket1Bedroom.setBackgroundColor(Color.rgb(81, 81, 81));
                }
            }

            @Override
            public void onCancelled(DatabaseError error) {

            }
        });

        socket2BedroomDB.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // Получить значение узла
                Object value = dataSnapshot.getValue();
                // Обработать полученное значение
                int currentValue = Integer.parseInt((value.toString()));
                if (currentValue == 1) {
                    socket2Bedroom.setBackgroundColor(Color.rgb(254, 125, 3));
                } else {
                    socket2Bedroom.setBackgroundColor(Color.rgb(81, 81, 81));
                }
            }

            @Override
            public void onCancelled(DatabaseError error) {

            }
        });

        lightBedroomDB.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // Получить значение узла
                Object value = dataSnapshot.getValue();
                // Обработать полученное значение
                int currentValue = Integer.parseInt((value.toString()));
                if (currentValue == 1) {
                    lightBedroom.setBackgroundColor(Color.rgb(254, 125, 3));
                } else {
                    lightBedroom.setBackgroundColor(Color.rgb(81, 81, 81));
                }
            }

            @Override
            public void onCancelled(DatabaseError error) {

            }
        });

        conditionerBedroom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                conditionerBedroomDB.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        // Получить значение узла
                        Object value1 = dataSnapshot.getValue();
                        // Обработать полученное значение
                        int currentValue = Integer.parseInt((value1.toString()));
                        int newValue = 0;
                        if (currentValue == 0) {
                            conditionerBedroom.setBackgroundColor(Color.rgb(254, 125, 3));
                            newValue = 1;
                        } else {
                            conditionerBedroom.setBackgroundColor(Color.rgb(81, 81, 81));
                            newValue = 0;
                        }
                        conditionerBedroomDB.setValue(newValue);
                    }
                    @Override
                    public void onCancelled(DatabaseError error) {

                    }
                });
            }
        });

        socket1Bedroom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                socket1BedroomDB.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        // Получить значение узла
                        Object value1 = dataSnapshot.getValue();
                        // Обработать полученное значение
                        int currentValue = Integer.parseInt((value1.toString()));
                        int newValue = 0;
                        if (currentValue == 0) {
                            socket1Bedroom.setBackgroundColor(Color.rgb(254, 125, 3));
                            newValue = 1;
                        } else {
                            socket1Bedroom.setBackgroundColor(Color.rgb(81, 81, 81));
                            newValue = 0;
                        }
                        socket1BedroomDB.setValue(newValue);
                    }
                    @Override
                    public void onCancelled(DatabaseError error) {

                    }
                });
            }
        });

        socket2Bedroom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                socket2BedroomDB.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        // Получить значение узла
                        Object value1 = dataSnapshot.getValue();
                        // Обработать полученное значение
                        int currentValue = Integer.parseInt((value1.toString()));
                        int newValue = 0;
                        if (currentValue == 0) {
                            socket2Bedroom.setBackgroundColor(Color.rgb(254, 125, 3));
                            newValue = 1;
                        } else {
                            socket2Bedroom.setBackgroundColor(Color.rgb(81, 81, 81));
                            newValue = 0;
                        }
                        socket2BedroomDB.setValue(newValue);
                    }
                    @Override
                    public void onCancelled(DatabaseError error) {

                    }
                });
            }
        });

        lightBedroom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lightBedroomDB.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        // Получить значение узла
                        Object value1 = dataSnapshot.getValue();
                        // Обработать полученное значение
                        int currentValue = Integer.parseInt((value1.toString()));
                        int newValue = 0;
                        if (currentValue == 0) {
                            lightBedroom.setBackgroundColor(Color.rgb(254, 125, 3));
                            newValue = 1;
                        } else {
                            lightBedroom.setBackgroundColor(Color.rgb(81, 81, 81));
                            newValue = 0;
                        }
                        lightBedroomDB.setValue(newValue);
                    }
                    @Override
                    public void onCancelled(DatabaseError error) {

                    }
                });
            }
        });
    }
}