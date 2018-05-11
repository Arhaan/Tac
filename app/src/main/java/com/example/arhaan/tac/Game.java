package com.example.arhaan.tac;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Game extends AppCompatActivity {
    boolean circle = false;
    int[][] arr = new int[3][3];
    int a,b;

    private void imgButtonListener(ImageButton ib, int a1, int b1){
        a = a1;
        b= b1;
        ib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageButton ib = (ImageButton) v;
                if(!circle){
                    ib.setImageResource(R.drawable.cross);
                    arr[a][b] = 1;
                }
                else if(circle){
                    ib.setImageResource(R.drawable.ic_circle);
                    arr[a][b] = 2;
                }
                circle = !circle;
                ib.setOnClickListener(null);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        for (int i = 0 ;i<3; i++){
            for (int j = 0; j<3;j++){
                arr[i][j]=0;
            }
        }
        ImageButton but00 = findViewById(R.id.img00);
        ImageButton but01 = findViewById(R.id.img01);
        ImageButton but02 = findViewById(R.id.img02);
        ImageButton but10 = findViewById(R.id.img10);
        ImageButton but11 = findViewById(R.id.img11);
        ImageButton but12 = findViewById(R.id.img12);
        ImageButton but20 = findViewById(R.id.img20);
        ImageButton but21 = findViewById(R.id.img21);
        ImageButton but22 = findViewById(R.id.img22);

        imgButtonListener(but00,0,0);
        imgButtonListener(but01,0,1);
        imgButtonListener(but02,0,2);
        imgButtonListener(but10,1,0);
        imgButtonListener(but11,1,1);
        imgButtonListener(but12,1,2);
        imgButtonListener(but20,2,0);
        imgButtonListener(but21,2,1);
        imgButtonListener(but22,2,2);

    }
}

