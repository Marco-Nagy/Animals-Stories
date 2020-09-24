package com.example.animalsstorys;

public class Story {
    int pic;
    int sound;
    String name;
    String story;

    public int getPic() {
        return pic;
    }

    public int getSound() {
        return sound;
    }

    public String getName() {
        return name;
    }




    public String getStory() {
        return story;
    }

    public Story(int pic, int sound, String name, String story) {
        this.pic = pic;
        this.sound = sound;
        this.name = name;
        this.story = story;

    }
}
