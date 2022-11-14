package souffleLint;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class SouffleLintRule {
    public String name;
    @SerializedName("short")
    public String shortDescription;
    @SerializedName("long")
    public String longDescription;
    public boolean captures;
    public boolean slow;
    public List<String> queries;
    public List<SouffleLintExample> examples;


    public String getExamples(){
        StringBuilder stringBuilder = new StringBuilder();
        for (SouffleLintExample example: examples){
            stringBuilder.append(example.before);
            stringBuilder.append(example.after.trim());
            stringBuilder.append(",\n");
        }
        stringBuilder.deleteCharAt(stringBuilder.length() - 2);
        return stringBuilder.toString();
    }
}