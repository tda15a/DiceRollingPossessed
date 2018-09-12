package com.example.uncletroy.myapplication;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private MediaPlayer Sound;
    public TextView DieText;
    private ImageView imageViewDie;
    private Random rng = new Random();
    private int hasPlayed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hasPlayed = 0;
        imageViewDie = findViewById(R.id.image_view_die);
        imageViewDie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rollDie();
            }
        });
    }
}

    private void playRandomRoll() {
        int r1 = rng.nextInt(2);
        if (r1 == 0) {
            Sound = MediaPlayer.create(this, R.raw.roll1);
        } else if (r1 == 1) {
            Sound = MediaPlayer.create(this, R.raw.roll2);
        } else {
            Sound = MediaPlayer.create(this, R.raw.roll3);
        }
        Sound.start();
        hasPlayed = 1;
    }

    public void rollDie() {
        if (hasPlayed == 1) {
            if (Sound.isPlaying()) {
                Sound.stop();
            }
            Sound.reset();
        }
        //}

        DieText = findViewById(R.id.DieTextDisplay);
        DieText.setText("");
        int randomNumber = rng.nextInt(19) + 1;


        switch (randomNumber) {
            case 1:
                imageViewDie.setImageResource(R.drawable.die1);
                DieText.setText("Critical Failure!");

                //final MediaPlayer Sound;
                Sound = MediaPlayer.create(this, R.raw.fail);
                Sound.start();
                hasPlayed = 1;
                break;
            case 2:
                imageViewDie.setImageResource(R.drawable.die2);
                playRandomRoll();
                break;
            case 3:
                imageViewDie.setImageResource(R.drawable.die3);
                playRandomRoll();
                break;
            case 4:
                imageViewDie.setImageResource(R.drawable.die4);
                playRandomRoll();
                break;
            case 5:
                imageViewDie.setImageResource(R.drawable.die5);
                playRandomRoll();
                break;
            case 6:
                imageViewDie.setImageResource(R.drawable.die6);
                playRandomRoll();
                break;
            case 7:
                imageViewDie.setImageResource(R.drawable.die7);
                playRandomRoll();
                break;
            case 8:
                imageViewDie.setImageResource(R.drawable.die8);
                playRandomRoll();
                break;
            case 9:
                imageViewDie.setImageResource(R.drawable.die9);
                playRandomRoll();
                break;
            case 10:
                imageViewDie.setImageResource(R.drawable.die10);
                playRandomRoll();
                break;
            case 11:
                imageViewDie.setImageResource(R.drawable.die11);
                playRandomRoll();
                break;
            case 12:
                imageViewDie.setImageResource(R.drawable.die12);
                playRandomRoll();
                break;
            case 13:
                imageViewDie.setImageResource(R.drawable.die13);
                playRandomRoll();
                break;
            case 14:
                imageViewDie.setImageResource(R.drawable.die14);
                playRandomRoll();
                break;
            case 15:
                imageViewDie.setImageResource(R.drawable.die15);
                playRandomRoll();
                break;
            case 16:
                imageViewDie.setImageResource(R.drawable.die16);
                playRandomRoll();
                break;
            case 17:
                imageViewDie.setImageResource(R.drawable.die17);
                playRandomRoll();
                break;
            case 18:
                imageViewDie.setImageResource(R.drawable.die18);
                playRandomRoll();
                break;
            case 19:
                imageViewDie.setImageResource(R.drawable.die19);
                playRandomRoll();
                break;
            case 20:
                imageViewDie.setImageResource(R.drawable.die20);
                DieText.setText("Critical Success!");

                int r2 = rng.nextInt(2);
                if (r2 == 0) {
                    Sound = MediaPlayer.create(this, R.raw.crit1);
                } else if (r2 == 1) {
                    Sound = MediaPlayer.create(this, R.raw.crit2);
                } else {
                    Sound = MediaPlayer.create(this, R.raw.crit3);
                }
                Sound.start();
                hasPlayed = 1;
                break;
        }
    }
}
