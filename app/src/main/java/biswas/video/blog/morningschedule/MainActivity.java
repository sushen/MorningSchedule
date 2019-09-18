package biswas.video.blog.morningschedule;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int day1 = 15;
        int day2 = 22;
        int day3 = 18;
        display((day1 + day2 + day3 )/ 3);
    }
    public void display(float i){
        TextView textView = (TextView)findViewById(R.id.display_text_view);
        textView.setText(""+i);
    }
}
