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

public class Kitchen extends AppCompatActivity {
    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference teapotKitchenDB = database.getReference("KitchenTeapot");
    DatabaseReference socket1KitchenDB = database.getReference("KitchenSocket1");
    DatabaseReference socket2KitchenDB = database.getReference("KitchenSocket2");
    DatabaseReference socket3KitchenDB = database.getReference("KitchenSocket3");
    DatabaseReference lightKitchenDB = database.getReference("KitchenLight");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kitchen);

        Button btnFromKitchen = (Button) findViewById(R.id.btnFromKitchen);

        View.OnClickListener onClickBtnFromKitchen = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Kitchen.this, MainActivity.class);
                startActivity(intent);
            }
        };

        btnFromKitchen.setOnClickListener(onClickBtnFromKitchen);

        Button kitchenTeapot = (Button) findViewById(R.id.teapotKitchen);
        Button socket1Kitchen = (Button) findViewById(R.id.socket1Kitchen);
        Button socket2Kitchen = (Button) findViewById(R.id.socket2Kitchen);
        Button socket3Kitchen = (Button) findViewById(R.id.socket3Kitchen);
        Button lightKitchen = (Button) findViewById(R.id.lightKitchen);

        teapotKitchenDB.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // Получить значение узла
                Object value = dataSnapshot.getValue();
                // Обработать полученное значение
                int currentValue = Integer.parseInt((value.toString()));
                if (currentValue == 1) {
                    kitchenTeapot.setBackgroundColor(Color.rgb(254, 125, 3));
                } else {
                    kitchenTeapot.setBackgroundColor(Color.rgb(81, 81, 81));
                }
            }

            @Override
            public void onCancelled(DatabaseError error) {

            }
        });

        socket1KitchenDB.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // Получить значение узла
                Object value = dataSnapshot.getValue();
                // Обработать полученное значение
                int currentValue = Integer.parseInt((value.toString()));
                if (currentValue == 1) {
                    socket1Kitchen.setBackgroundColor(Color.rgb(254, 125, 3));
                } else {
                    socket1Kitchen.setBackgroundColor(Color.rgb(81, 81, 81));
                }
            }

            @Override
            public void onCancelled(DatabaseError error) {

            }
        });

        socket2KitchenDB.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // Получить значение узла
                Object value = dataSnapshot.getValue();
                // Обработать полученное значение
                int currentValue = Integer.parseInt((value.toString()));
                if (currentValue == 1) {
                    socket2Kitchen.setBackgroundColor(Color.rgb(254, 125, 3));
                } else {
                    socket2Kitchen.setBackgroundColor(Color.rgb(81, 81, 81));
                }
            }

            @Override
            public void onCancelled(DatabaseError error) {

            }
        });

        socket3KitchenDB.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // Получить значение узла
                Object value = dataSnapshot.getValue();
                // Обработать полученное значение
                int currentValue = Integer.parseInt((value.toString()));
                if (currentValue == 1) {
                    socket3Kitchen.setBackgroundColor(Color.rgb(254, 125, 3));
                } else {
                    socket3Kitchen.setBackgroundColor(Color.rgb(81, 81, 81));
                }
            }

            @Override
            public void onCancelled(DatabaseError error) {

            }
        });

        lightKitchenDB.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // Получить значение узла
                Object value = dataSnapshot.getValue();
                // Обработать полученное значение
                int currentValue = Integer.parseInt((value.toString()));
                if (currentValue == 1) {
                    lightKitchen.setBackgroundColor(Color.rgb(254, 125, 3));
                } else {
                    lightKitchen.setBackgroundColor(Color.rgb(81, 81, 81));
                }
            }

            @Override
            public void onCancelled(DatabaseError error) {

            }
        });
        
        kitchenTeapot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teapotKitchenDB.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        // Получить значение узла
                        Object value1 = dataSnapshot.getValue();
                        // Обработать полученное значение
                        int currentValue = Integer.parseInt((value1.toString()));
                        int newValue = 0;
                        if (currentValue == 0) {
                            kitchenTeapot.setBackgroundColor(Color.rgb(254, 125, 3));
                            newValue = 1;
                        } else {
                            kitchenTeapot.setBackgroundColor(Color.rgb(81, 81, 81));
                            newValue = 0;
                        }
                        teapotKitchenDB.setValue(newValue);
                    }
                    @Override
                    public void onCancelled(DatabaseError error) {

                    }
                });
            }
        });

        socket1Kitchen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                socket1KitchenDB.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        // Получить значение узла
                        Object value = dataSnapshot.getValue();
                        // Обработать полученное значение
                        int currentValue = Integer.parseInt((value.toString()));
                        int newValue;
                        if (currentValue == 0) {
                            socket1Kitchen.setBackgroundColor(Color.rgb(254, 125, 3));
                            newValue = 1;
                        } else {
                            socket1Kitchen.setBackgroundColor(Color.rgb(81, 81, 81));
                            newValue = 0;
                        }
                        socket1KitchenDB.setValue(newValue);
                    }
                    @Override
                    public void onCancelled(DatabaseError error) {

                    }
                });
            }
        });

        socket2Kitchen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                socket2KitchenDB.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        // Получить значение узла
                        Object value = dataSnapshot.getValue();
                        // Обработать полученное значение
                        int currentValue = Integer.parseInt((value.toString()));
                        int newValue;
                        if (currentValue == 0) {
                            socket2Kitchen.setBackgroundColor(Color.rgb(254, 125, 3));
                            newValue = 1;
                        } else {
                            socket2Kitchen.setBackgroundColor(Color.rgb(81, 81, 81));
                            newValue = 0;
                        }
                        socket2KitchenDB.setValue(newValue);
                    }
                    @Override
                    public void onCancelled(DatabaseError error) {

                    }
                });
            }
        });

        socket3Kitchen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                socket3KitchenDB.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        // Получить значение узла
                        Object value = dataSnapshot.getValue();
                        // Обработать полученное значение
                        int currentValue = Integer.parseInt((value.toString()));
                        int newValue;
                        if (currentValue == 0) {
                            socket3Kitchen.setBackgroundColor(Color.rgb(254, 125, 3));
                            newValue = 1;
                        } else {
                            socket3Kitchen.setBackgroundColor(Color.rgb(81, 81, 81));
                            newValue = 0;
                        }
                        socket3KitchenDB.setValue(newValue);
                    }
                    @Override
                    public void onCancelled(DatabaseError error) {

                    }
                });
            }
        });

        lightKitchen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lightKitchenDB.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        // Получить значение узла
                        Object value = dataSnapshot.getValue();
                        // Обработать полученное значение
                        int currentValue = Integer.parseInt((value.toString()));
                        int newValue;
                        if (currentValue == 0) {
                            lightKitchen.setBackgroundColor(Color.rgb(254, 125, 3));
                            newValue = 1;
                        } else {
                            lightKitchen.setBackgroundColor(Color.rgb(81, 81, 81));
                            newValue = 0;
                        }
                        lightKitchenDB.setValue(newValue);
                    }
                    @Override
                    public void onCancelled(DatabaseError error) {

                    }
                });
            }
        });
    }
}