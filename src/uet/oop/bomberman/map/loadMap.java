package uet.oop.bomberman.map;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public abstract class loadMap {
    private static File file;
    private static BufferedReader br;
    private static String path;

    protected static List<String> load(int level) {
        List<String> map = new ArrayList<>();
        try {
            path = "res\\map\\Level" + level + ".txt";
            file = new File(path);
            br = new BufferedReader(new FileReader(file));
            String line = br.readLine();
            while (!line.equals("")) {
                map.add(line);
                line = br.readLine();
                // doc file txt luu vao list
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return (map);
    }
}
