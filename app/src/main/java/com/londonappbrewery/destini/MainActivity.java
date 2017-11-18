package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    // TODO: Steps 4 & 8 - Declare member variables here:
            TextView myText ;
            Button topBtn;
            Button botBtn;
            int wichLane=0;
            int turns=0;
 @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
            myText = (TextView) findViewById(R.id.storyTextView);
            topBtn = (Button) findViewById(R.id.buttonTop);
            botBtn= (Button) findViewById(R.id.buttonBottom);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
            topBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(turns==0){
                        wichLane =1;
                        myText.setText(R.string.T3_Story);
                        topBtn.setText(R.string.T3_Ans1);
                        botBtn.setText(R.string.T3_Ans2);
                    }else if(turns==1 && wichLane ==1){
                        myText.setText(R.string.T6_End);
                        topBtn.setVisibility(View.INVISIBLE);
                        botBtn.setVisibility(View.INVISIBLE);
                    }else if(turns==1 && wichLane==2){
                        myText.setText(R.string.T3_Story);
                        topBtn.setText(R.string.T3_Ans1);
                        botBtn.setText(R.string.T3_Ans2);
                    }else if(turns==2 && wichLane==2){
                        myText.setText(R.string.T6_End);
                        topBtn.setVisibility(View.INVISIBLE);
                        botBtn.setVisibility(View.INVISIBLE);
                    }
                    turns++;

                }
            });



        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
            botBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(turns==0){
                    wichLane = 2;
                    myText.setText(R.string.T2_Story);
                    topBtn.setText(R.string.T2_Ans1);
                    botBtn.setText(R.string.T2_Ans2);
                }else if(turns==1&&wichLane==1){
                    myText.setText(R.string.T5_End);
                    topBtn.setVisibility(View.INVISIBLE);
                    botBtn.setVisibility(View.INVISIBLE);
                }else if (turns==1&&wichLane==2){
                    myText.setText(R.string.T4_End);
                    topBtn.setVisibility(View.INVISIBLE);
                    botBtn.setVisibility(View.INVISIBLE);
                }else if(turns==2&&wichLane==2){
                    myText.setText(R.string.T5_End);
                    topBtn.setVisibility(View.INVISIBLE);
                    botBtn.setVisibility(View.INVISIBLE);


                }

                turns++;
                }
            });

    }
}
