package hungryduck.com.recycle;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView horizontal_recycler_view;
    HorizontalAdapter horizontalAdapter;
    private ArrayList<DTO> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        horizontal_recycler_view = (RecyclerView) findViewById(R.id.horizontal_recycler_view);

        data = fill_with_data();

        horizontalAdapter = new HorizontalAdapter(data, getApplication());

        LinearLayoutManager horizontalLayoutManager = new LinearLayoutManager(MainActivity.this, LinearLayoutManager.HORIZONTAL, false);
        horizontal_recycler_view.setLayoutManager(horizontalLayoutManager);
        horizontal_recycler_view.setAdapter(horizontalAdapter);

    }

    public ArrayList<DTO> fill_with_data() {

        ArrayList<DTO> data = new ArrayList<>();

        data.add(new DTO(R.drawable.asdf, "Image 1"));
        data.add(new DTO(R.drawable.asdfg, "Image 2"));
        data.add(new DTO(R.drawable.qwer, "Image 3"));
        data.add(new DTO(R.drawable.asdf, "Image 1"));
        data.add(new DTO(R.drawable.asdfg, "Image 2"));
        data.add(new DTO(R.drawable.qwer, "Image 3"));

        return data;
    }


}
