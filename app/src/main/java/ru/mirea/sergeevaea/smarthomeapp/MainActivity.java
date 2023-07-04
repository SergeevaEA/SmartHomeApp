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

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnToKitchen = (Button) findViewById(R.id.btnToKitchen);
        Button btnToBedroom = (Button) findViewById(R.id.btnToBedroom);
        Button btnToLivingRoom = (Button) findViewById(R.id.btnToLivingRoom);
        Button btnToHall = (Button) findViewById(R.id.btnToHall);

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference teapotKitchenDB = database.getReference("KitchenTeapot");
        DatabaseReference socket1KitchenDB = database.getReference("KitchenSocket1");
        DatabaseReference socket2KitchenDB = database.getReference("KitchenSocket2");
        DatabaseReference socket3KitchenDB = database.getReference("KitchenSocket3");
        DatabaseReference lightKitchenDB = database.getReference("KitchenLight");
        DatabaseReference socketHallDB = database.getReference("HallSocket");
        DatabaseReference lightHallDB = database.getReference("HallLight");
        DatabaseReference conditionerBedroomDB = database.getReference("BedroomConditioner");
        DatabaseReference socket1BedroomDB = database.getReference("BedroomSocket1");
        DatabaseReference socket2BedroomDB = database.getReference("BedroomSocket2");
        DatabaseReference lightBedroomDB = database.getReference("BedroomLight");
        DatabaseReference TVLivingRoomDB = database.getReference("LivingRoomTV");
        DatabaseReference socket1LivingRoomDB = database.getReference("LivingRoomSocket1");
        DatabaseReference socket2LivingRoomDB = database.getReference("LivingRoomSocket2");
        DatabaseReference lightLivingRoomDB = database.getReference("LivingRoomLight");


        teapotKitchenDB.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // Получить значение узла
                Object value = dataSnapshot.getValue();
                // Обработать полученное значение
                int currentValue = Integer.parseInt((value.toString()));
                if (currentValue == 1) {
                    btnToKitchen.setBackgroundColor(Color.rgb(254, 125, 3));
                }
            }
            @Override
            public void onCancelled(DatabaseError error) { }
        });

        socket1KitchenDB.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // Получить значение узла
                Object value = dataSnapshot.getValue();
                // Обработать полученное значение
                int currentValue = Integer.parseInt((value.toString()));
                if (currentValue == 1) {
                    btnToKitchen.setBackgroundColor(Color.rgb(254, 125, 3));
                }
            }
            @Override
            public void onCancelled(DatabaseError error) { }
        });

        socket2KitchenDB.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // Получить значение узла
                Object value = dataSnapshot.getValue();
                // Обработать полученное значение
                int currentValue = Integer.parseInt((value.toString()));
                if (currentValue == 1) {
                    btnToKitchen.setBackgroundColor(Color.rgb(254, 125, 3));
                }
            }
            @Override
            public void onCancelled(DatabaseError error) { }
        });

        socket3KitchenDB.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // Получить значение узла
                Object value = dataSnapshot.getValue();
                // Обработать полученное значение
                int currentValue = Integer.parseInt((value.toString()));
                if (currentValue == 1) {
                    btnToKitchen.setBackgroundColor(Color.rgb(254, 125, 3));
                }
            }
            @Override
            public void onCancelled(DatabaseError error) { }
        });

        lightKitchenDB.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // Получить значение узла
                Object value = dataSnapshot.getValue();
                // Обработать полученное значение
                int currentValue = Integer.parseInt((value.toString()));
                if (currentValue == 1) {
                    btnToKitchen.setBackgroundColor(Color.rgb(254, 125, 3));
                }
            }
            @Override
            public void onCancelled(DatabaseError error) { }
        });

        socketHallDB.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // Получить значение узла
                Object value = dataSnapshot.getValue();
                // Обработать полученное значение
                int currentValue = Integer.parseInt((value.toString()));
                if (currentValue == 1) {
                    btnToHall.setBackgroundColor(Color.rgb(254, 125, 3));
                }
            }
            @Override
            public void onCancelled(DatabaseError error) { }
        });

        lightHallDB.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // Получить значение узла
                Object value = dataSnapshot.getValue();
                // Обработать полученное значение
                int currentValue = Integer.parseInt((value.toString()));
                if (currentValue == 1) {
                    btnToHall.setBackgroundColor(Color.rgb(254, 125, 3));
                }
            }
            @Override
            public void onCancelled(DatabaseError error) { }
        });

        conditionerBedroomDB.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // Получить значение узла
                Object value = dataSnapshot.getValue();
                // Обработать полученное значение
                int currentValue = Integer.parseInt((value.toString()));
                if (currentValue == 1) {
                    btnToBedroom.setBackgroundColor(Color.rgb(254, 125, 3));
                }
            }
            @Override
            public void onCancelled(DatabaseError error) { }
        });

        socket1BedroomDB.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // Получить значение узла
                Object value = dataSnapshot.getValue();
                // Обработать полученное значение
                int currentValue = Integer.parseInt((value.toString()));
                if (currentValue == 1) {
                    btnToBedroom.setBackgroundColor(Color.rgb(254, 125, 3));
                }
            }
            @Override
            public void onCancelled(DatabaseError error) { }
        });

        socket2BedroomDB.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // Получить значение узла
                Object value = dataSnapshot.getValue();
                // Обработать полученное значение
                int currentValue = Integer.parseInt((value.toString()));
                if (currentValue == 1) {
                    btnToBedroom.setBackgroundColor(Color.rgb(254, 125, 3));
                }
            }
            @Override
            public void onCancelled(DatabaseError error) { }
        });

        lightBedroomDB.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // Получить значение узла
                Object value = dataSnapshot.getValue();
                // Обработать полученное значение
                int currentValue = Integer.parseInt((value.toString()));
                if (currentValue == 1) {
                    btnToBedroom.setBackgroundColor(Color.rgb(254, 125, 3));
                }
            }
            @Override
            public void onCancelled(DatabaseError error) { }
        });

        TVLivingRoomDB.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // Получить значение узла
                Object value = dataSnapshot.getValue();
                // Обработать полученное значение
                int currentValue = Integer.parseInt((value.toString()));
                if (currentValue == 1) {
                    btnToLivingRoom.setBackgroundColor(Color.rgb(254, 125, 3));
                }
            }
            @Override
            public void onCancelled(DatabaseError error) { }
        });

        socket1LivingRoomDB.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // Получить значение узла
                Object value = dataSnapshot.getValue();
                // Обработать полученное значение
                int currentValue = Integer.parseInt((value.toString()));
                if (currentValue == 1) {
                    btnToLivingRoom.setBackgroundColor(Color.rgb(254, 125, 3));
                }
            }
            @Override
            public void onCancelled(DatabaseError error) { }
        });

        socket2LivingRoomDB.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // Получить значение узла
                Object value = dataSnapshot.getValue();
                // Обработать полученное значение
                int currentValue = Integer.parseInt((value.toString()));
                if (currentValue == 1) {
                    btnToLivingRoom.setBackgroundColor(Color.rgb(254, 125, 3));
                }
            }
            @Override
            public void onCancelled(DatabaseError error) { }
        });

        lightLivingRoomDB.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // Получить значение узла
                Object value = dataSnapshot.getValue();
                // Обработать полученное значение
                int currentValue = Integer.parseInt((value.toString()));
                if (currentValue == 1) {
                    btnToLivingRoom.setBackgroundColor(Color.rgb(254, 125, 3));
                }
            }
            @Override
            public void onCancelled(DatabaseError error) { }
        });

        View.OnClickListener onClickBtnToKitchen = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Kitchen.class);
                startActivity(intent);
            }
        };

        View.OnClickListener onClickBtnToBedroom = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Bedroom.class);
                startActivity(intent);
            }
        };

        View.OnClickListener onClickBtnToLivingRoom = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LivingRoom.class);
                startActivity(intent);
            }
        };

        View.OnClickListener onClickBtnToHall = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Hall.class);
                startActivity(intent);
            }
        };

        btnToKitchen.setOnClickListener(onClickBtnToKitchen);
        btnToBedroom.setOnClickListener(onClickBtnToBedroom);
        btnToLivingRoom.setOnClickListener(onClickBtnToLivingRoom);
        btnToHall.setOnClickListener(onClickBtnToHall);
    }
}