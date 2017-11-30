package dev.uublabs.listandrecyclerviews;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
{

    private ListView lvMain;
    private ListView lvCelebrity;
    private List<Celebrity> celebrityList;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvMain = findViewById(R.id.lvMain);
        lvCelebrity = findViewById(R.id.celebList);

        List<String> stringList = new ArrayList<>();
        stringList.add("First");
        stringList.add("Second");
        stringList.add("Third");
        stringList.add("Fourth");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1, stringList);
        lvMain.setAdapter(arrayAdapter);

        celebrityList = new ArrayList<>();
        celebrityList.add(new Celebrity("Drake", 32, 200));
        celebrityList.add(new Celebrity("Jennifer Aniston", 50, 130));
        celebrityList.add(new Celebrity("Tom Cruise", 54, 200));

        CelebrityListAdapter celebrityListAdapter = new CelebrityListAdapter(this,
                R.layout.celebrity_list_item,
                celebrityList);
        lvCelebrity.setAdapter(celebrityListAdapter);

    }

    public void goToRecycler(View view)
    {
        startActivity(new Intent(this, RecyclerActivity.class));
    }
}
