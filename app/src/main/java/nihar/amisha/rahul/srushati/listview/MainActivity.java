package nihar.amisha.rahul.srushati.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.widget.ListView;
import android.widget.ResourceCursorAdapter;

import com.google.android.material.animation.AnimationUtils;

public class MainActivity extends AppCompatActivity {


    ListView Listview;
    Animation animation;
    String title;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        Listview=findViewById(R.id.list_view);
        title=getResources().getStringArray(R.array.title);
        MainAdapter adapter=new MainActivity(MainActivity.this,title);
        animation= 


    }
}