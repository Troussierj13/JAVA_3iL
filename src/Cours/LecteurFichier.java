package Cours;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedList;

public class LecteurFichier {
    private String pathDir;
    private String nameFile;
    private int nbrOctets;
    private int nbrCaract;
    private int nbrNum;
    private int nbrAlpha;
    private int nbrWhiteSpace;
    private LinkedList<Character> specialCarat;
    private LinkedList<String> lineRead;


    public LecteurFichier(String dir, String name) {
        Path localPath = FileSystems.getDefault().getPath(dir, name);
        Path path = localPath.toAbsolutePath();

        pathDir = path.toString().split("/"+name)[0];
        specialCarat = new LinkedList<>();
        lineRead = new LinkedList<>();
        nameFile = name;
    }

    private void readFileLine(){
        resetInfo();

        try (BufferedReader buffer = Files.newBufferedReader(Paths.get(pathDir+"/"+nameFile))) {
            String line = buffer.readLine();

            while (line != null) {
                nbrCaract += line.length();
                nbrOctets += line.getBytes("utf-8").length;
                lineRead.add(new String("Lu : " + line + " (" + line.length()+ ")"));
                line = buffer.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void readFileChar(){
        resetInfo();

        try (BufferedReader buffer = Files.newBufferedReader(Paths.get(pathDir+"/"+nameFile))) {
            int caract = buffer.read();

            while (caract != -1) {
                nbrOctets++;
                nbrCaract++;
                if (Character.isDigit((char)caract)) {
                    nbrNum++;
                } else if (Character.isAlphabetic((char)caract)) {
                    nbrAlpha++;
                } else if (Character.isWhitespace((char)caract)) {
                    nbrWhiteSpace++;
                } else {
                    if(!specialCarat.contains((char)caract)) {
                        specialCarat.add((char)caract);
                    }
                }
                caract = buffer.read();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void resetInfo() {
        nbrOctets = 0;
        nbrCaract = 0;
        nbrNum = 0;
        nbrAlpha = 0;
        nbrWhiteSpace = 0;
    }

    public String GetInfoByLine() {
        readFileLine();

        String str = "";

        for(String s : lineRead) {
            str += s + "\n";
        }

        return new String("Le fichier "+ nameFile + " contient "+ nbrOctets + " octets\n" + str + "Lu " + lineRead.size() + "\n" + "soit " + nbrCaract + " caractères");
    }

    public String GetInfoByChar() {
        readFileChar();

        return new String("Répertoire : " + pathDir + "\n" +"Le fichier " + nameFile + " contient "+ nbrOctets + " octets\n"+
                nbrCaract + " caractères\n" +
                nbrNum + " caractères numériques\n" +
                nbrAlpha + " caractères alphabétiques\n" +
                nbrWhiteSpace + " caractères séparateurs\n" +
                String.format("%.2f", nbrNum*100.f/nbrCaract) + "% de numériques\n" +
                "Caractères spéciaux : " + GetSpecialCaract());
    }

    public String GetSpecialCaract(){
        String str = "";

        for(Character c : specialCarat) {
            str += c + " ";
        }

        return str;
    }
}
