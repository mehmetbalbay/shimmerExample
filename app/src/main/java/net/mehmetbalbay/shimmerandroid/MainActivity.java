package net.mehmetbalbay.shimmerandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.facebook.shimmer.ShimmerFrameLayout;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    static int counter = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        starttask();

    }

    @Override
    protected void onPause() {
        super.onPause();
        stoptask();
    }

    private void starttask() {
        // Shimmer animation defination
        ShimmerFrameLayout shimmerFrameLayout = findViewById(R.id.shimmer_view_container);
        // animation start function
        shimmerFrameLayout.startShimmerAnimation();
    }

    private void stoptask() {
        // Shimmer animation defination
        ShimmerFrameLayout shimmerFrameLayout = findViewById(R.id.shimmer_view_container);
        // animation start function
        shimmerFrameLayout.stopShimmerAnimation();
    }
}
