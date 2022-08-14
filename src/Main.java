import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static StringBuilder log = new StringBuilder();

    public static void main(String[] args) {
        File src = new File("Games//src");
        log.append(src.mkdir()).append("\r\n");
        File res = new File("Games//res");
        log.append(res.mkdirs()).append("\r\n");
        File saveGames = new File("Games//savegames");
        log.append(saveGames.mkdirs()).append("\r\n");
        File temp = new File("Games//temp");
        log.append(temp.mkdirs()).append("\r\n");

        File dirSrc1 = new File("Games//src//main");
        log.append(dirSrc1.mkdirs()).append("\r\n");
        File dirSrc2 = new File("Games//src//test");
        log.append(dirSrc2.mkdirs()).append("\r\n");

        File fileMain1 = new File("Games//src//main//Main.java");
        try {
            log.append(fileMain1.createNewFile()).append("\r\n");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        File fileMain2 = new File("Games//src//main//Utils.java");
        try {
            log.append(fileMain2.createNewFile()).append("\r\n");
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        File drawables = new File("Games//res//drawables");
        log.append(drawables.mkdir()).append("\r\n");
        File vectors = new File("Games//res//vectors");
        log.append(vectors.mkdir()).append("\r\n");
        File icons = new File("Games//res//icons");
        log.append(icons.mkdir()).append("\r\n");

        File tempTxt = new File("Games//temp//temp.txt");
        try {
            log.append(tempTxt.createNewFile()).append("\r\n");
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        try {
            FileWriter toTemp = new FileWriter(tempTxt, false);
            toTemp.write(String.valueOf(log));
            toTemp.flush();
            toTemp.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }


    }
}
