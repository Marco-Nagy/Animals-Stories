package com.example.animalsstorys;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.graphics.Typeface;
import android.media.MediaParser;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.TextView;

import java.util.ArrayList;

class ListStories extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);
        // setting type face font
        TextView textView =findViewById(R.id.text_list);
        Typeface typeface= ResourcesCompat.getFont(this,R.font.giraffella);
        textView.setTypeface(typeface);
      final ArrayList<Story> stories =new ArrayList<>();
      stories.add(new Story(R.drawable.ant_dove,R.raw.ant,"ant_dove","story_ant_dove"));
      stories.add(new Story(R.drawable.hare_tortoise,R.raw.ant,"hare_tortoise","story_hare_tortoise"));
      stories.add(new Story(R.drawable.lion_mouse,R.raw.ant,"lion_mouse","story_lion_mouse"));
      stories.add(new Story(R.drawable.fox_grapes,R.raw.ant,"fox_grapes","story_fox_grapes"));
      stories.add(new Story(R.drawable.wolf_sheeps,R.raw.ant,"wolf_sheeps","story_wolf_sheeps"));
      stories.add(new Story(R.drawable.town_mouse_country,R.raw.ant,"town_mouse_country","story_town_mouse_country"));
       final CustomAdapter  adapter = new CustomAdapter(this, stories);
        android.widget.ListView listView =findViewById(R.id.lv);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                MediaPlayer mediaParser= MediaPlayer.create(ListStories.this,stories.get(position).getSound());
                mediaParser.start();
            }
        });


    }
}