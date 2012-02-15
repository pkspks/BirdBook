package com.pk.birdbook;

import android.os.Bundle;
import android.widget.TextView;
import com.pk.birdbook.util.CurrentTime;
import com.google.inject.Inject;
import roboguice.activity.RoboActivity;
import roboguice.inject.InjectView;

public class StarterActivity extends RoboActivity {
    @InjectView(R.id.title)
    TextView title;

    @InjectView(R.id.current_time)
    TextView currentTimeText;

    @Inject
    private CurrentTime currentTime;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
        title.setText("Hello World");
        currentTimeText.setText(String.valueOf(currentTime.currentTimeMillis()));
    }
}
