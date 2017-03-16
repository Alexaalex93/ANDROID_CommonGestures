package com.example.cice.commongestures;

import android.support.v4.view.GestureDetectorCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements  GestureDetector.OnDoubleTapListener, GestureDetector.OnGestureListener{

    TextView gestureText;
    GestureDetectorCompat gestureDetectorCompat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gestureText = (TextView) findViewById(R.id.textview);
        this.gestureDetectorCompat = new GestureDetectorCompat(this, this);
        gestureDetectorCompat.setOnDoubleTapListener(this);

    }

    @Override
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        gestureText.setText("On SingleTapConfirmed");
        return true;    }

    @Override
    public boolean onDoubleTap(MotionEvent motionEvent) {
        gestureText.setText("On DoubleTap");
        return true;    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        gestureText.setText("On DoubleTapEvent");
        return true;    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        gestureText.setText("On down");
        return true;
    }

    @Override
    public void onShowPress(MotionEvent motionEvent) {
        gestureText.setText("On ShowPress");
    }

    @Override
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        gestureText.setText("On SingleTapUp");
        return true;    }

    @Override
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
        gestureText.setText("On Scroll");
        return true;    }

    @Override
    public void onLongPress(MotionEvent motionEvent) {
        gestureText.setText("On LongPress");
    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
        gestureText.setText("On Fling");
        return true;
    }
}
