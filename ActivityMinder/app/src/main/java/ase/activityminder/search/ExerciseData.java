package ase.activityminder.search;


import java.util.HashMap;

/**
 * Created by Steven on 7/30/2015.
 */

// CONTAINS INFORMATION FOR ALL EXERCISE DATA


public class ExerciseData {
    //    String name, rating, type, muscle, otherMuscles, equipment, mechanics, level, guide, url;
    public static final String[] HASH_KEYS = {"name", "rating", "type", "muscle", "otherMuscles", "equipment", "mechanics", "level", "guide", "url"};
    public static final String[] ALL_TABLE_COLUMNS = {"_id", "name", "rating", "type", "muscle", "otherMuscles", "equipment", "mechanics", "level", "guide", "url"};
    public HashMap<String, String> info = new HashMap<>();


    public ExerciseData(String n, String r, String t, String m, String o, String e, String mu, String l, String g, String u) {
        info.put("name", n);
        info.put("rating", r);
        info.put("type", t);
        info.put("muscle", mu);
        info.put("otherMuscles", o);
        info.put("equipment", e);
        info.put("mechanics", m);
        info.put("level", l);
        info.put("guide", g);
        info.put("url", u);
    }
}
