package com.stevebrains.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button one,two,Three,Four,Five,Six,Seven,Eight,Nine,start;
int turn=1;
boolean end=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        one = findViewById(R.id.One);
        two = findViewById(R.id.Two);
        Three = findViewById(R.id.Three);
        Four = findViewById(R.id.Four);
        Five = findViewById(R.id.Five);
        Six = findViewById(R.id.Six);
        Seven = findViewById(R.id.Seven);
        Eight = findViewById(R.id.Eight);
        Nine = findViewById(R.id.Nine);
        start = findViewById(R.id.start);


        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check(one);

            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check(two);
            }
        });
        Three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check(Three);
            }
        });
        Four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check(Four);
            }
        });
        Five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check(Five);
            }
        });
        Six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check(Six);
            }
        });
        Seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check(Seven);
            }
        });
        Eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check(Eight);
            }
        });
        Nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check(Nine);
            }
        });
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(start.getText().toString().equals("Start")){

                    start.setText("Reset");
                    recreate();

                }else{

                    start.setText("Start");

                }
            }
        });
    }
    public void check(Button btn){

        if(!end){
        if (btn.getText().toString().equals("")) {
            if (turn == 1) {
                btn.setText("X");
                turn = 2;
            } else {
                btn.setText("O");
                turn = 1;
            }
        }
        game();
        }

    }
public void game() {
    String b1, b2, b3, b4, b5, b6, b7, b8, b9;
    b1 = one.getText().toString();
    b2 = two.getText().toString();
    b3 = Three.getText().toString();
    b4 = Four.getText().toString();
    b5 = Five.getText().toString();
    b6 = Six.getText().toString();
    b7 = Seven.getText().toString();
    b8 = Eight.getText().toString();
    b9 = Nine.getText().toString();
    if (!end) {

        if ((b1.equals("X") && b2.equals("X") && b3.equals("X")) || (b4.equals("X") && b5.equals("X") && b6.equals("X")) || (b7.equals("X") && b8.equals("X") && b9.equals("X"))) {
            end = true;
            Toast.makeText(this, "X Win", Toast.LENGTH_SHORT).show();
        } if ((b1.equals("X") && b4.equals("X") && b7.equals("X")) || (b2.equals("X") && b5.equals("X") && b8.equals("X")) || (b3.equals("X") && b6.equals("X") && b9.equals("X"))) {
            end = true;
            Toast.makeText(this, "X Win", Toast.LENGTH_SHORT).show();
        }
         if ((b1.equals("X") && b4.equals("X") && b7.equals("X")) || (b2.equals("X") && b5.equals("X") && b8.equals("X")) || (b3.equals("X") && b6.equals("X") && b9.equals("X"))) {
            end = true;
            Toast.makeText(this, "X Win", Toast.LENGTH_SHORT).show();
        }

          if ((b1.equals("X") && b5.equals("X") && b9.equals("X")) || (b3.equals("X") && b5.equals("X") && b7.equals("X"))) {
        end = true;
        Toast.makeText(this, "X Win", Toast.LENGTH_SHORT).show();
    }
         if ((b1.equals("O") && b2.equals("O") && b3.equals("O")) || (b4.equals("O") && b5.equals("O") && b6.equals("O")) || (b7.equals("O") && b8.equals("O") && b9.equals("O"))) {
        end = true;
        Toast.makeText(this, "O Win", Toast.LENGTH_SHORT).show();
    }
         if ((b1.equals("O") && b4.equals("O") && b7.equals("O")) || (b2.equals("O") && b5.equals("O") && b8.equals("O")) || (b3.equals("O") && b6.equals("O") && b9.equals("O"))) {
        end = true;
        Toast.makeText(this, "O Win", Toast.LENGTH_SHORT).show();
    }
         if ((b1.equals("O") && b4.equals("O") && b7.equals("O")) || (b2.equals("O") && b5.equals("O") && b8.equals("O")) || (b3.equals("O") && b6.equals("O") && b9.equals("O"))) {
        end = true;
        Toast.makeText(this, "O Win", Toast.LENGTH_SHORT).show();
    }
         if ((b1.equals("O") && b5.equals("O") && b9.equals("O")) || (b3.equals("O") && b5.equals("O") && b7.equals("O"))) {
        end = true;
        Toast.makeText(this, "O Win", Toast.LENGTH_SHORT).show();
    }


}
}

}