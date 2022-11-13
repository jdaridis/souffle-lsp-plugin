import com.google.gson.annotations.SerializedName;

import java.util.List;

public class SouffleLintRule {
    String name;
    @SerializedName("short")
    String shortDescription;
    @SerializedName("long")
    String longDescription;
    boolean captures;
    boolean slow;
    List<String> queries;
    List<SouffleLintExample> examples;


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