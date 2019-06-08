package com.example.android.sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private RelativeLayout body;
    private int bodyX,bodyY;
    private int k;
    private int cellWidth,cellHeight;
    private int a, b,c,d,e,f,g;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);
        body = findViewById (R.id.body);
        a=b=c=d=e=f=g=6;
        body.setOnTouchListener (new View.OnTouchListener () {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                bodyX = (int) event.getX ();
                bodyY=(int)event.getY ();
          cellHeight=cellWidth=150;

                RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(
                        RelativeLayout.LayoutParams.WRAP_CONTENT,
                        RelativeLayout.LayoutParams.WRAP_CONTENT);
                ImageView iv = new ImageView(getApplicationContext());
                for( k=1; k<8; k++) {

                    if ((bodyX >= (k - 1) * cellWidth && bodyX <= k * cellWidth)) {
                        if (k==1) {
                            a = a - 1;
                            Toast.makeText (MainActivity.this, "" + a, Toast.LENGTH_SHORT).show ();
                        }
                       else if (k == 2) {
                            b = b - 1;
                            Toast.makeText (MainActivity.this, "" + b, Toast.LENGTH_SHORT).show ();
                        }
                       else if (k == 3) {
                            c = c - 1;
                            Toast.makeText (MainActivity.this, "" + c, Toast.LENGTH_SHORT).show ();
                        }
                       else if (k == 4) {
                            d = d - 1;
                            Toast.makeText (MainActivity.this, "" + d, Toast.LENGTH_SHORT).show ();
                        }
                        else if (k == 5) {
                            e = e - 1;
                            Toast.makeText (MainActivity.this, "" + e, Toast.LENGTH_SHORT).show ();
                        }
                        else if (k == 6) {
                            f = f - 1;
                            Toast.makeText (MainActivity.this, "" + f, Toast.LENGTH_SHORT).show ();
                        }
                        else {
                            g = g - 1;
                            Toast.makeText (MainActivity.this, "" + g, Toast.LENGTH_SHORT).show ();
                        }
                    lp.setMargins ((k - 1) * cellWidth + 20, cellHeight, 0, 0);
                        iv.setLayoutParams (lp);

                    }}








                iv.setImageDrawable(getResources().getDrawable(
                        R.drawable.bluestone));
                ((ViewGroup) v).addView(iv);
return true;


        }});}}

