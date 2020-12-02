package ru.itsjava.iostreams;

import java.io.*;

public class IOStreamsPractice {
    public static void main(String[] args) {
        File file1 = new File("src/main/resources/file1.txt");
        File file2 = new File("src/main/resources/file2.txt");

        try (PrintWriter printWriter1 = new PrintWriter(file1)){
            printWriter1.println("строка1");
            printWriter1.println("строка2");
            printWriter1.println("строка3");
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }

        try (PrintWriter printWriter2 = new PrintWriter(file2)){
            printWriter2.println("строка4");
            printWriter2.println("строка5");
            printWriter2.println("строка6");
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }

        try (BufferedReader bufferedReader1 = new BufferedReader(new FileReader(file1))) {
            bufferedReader1.readLine();

        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file2))) {
            bufferedReader2.readLine();

        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }





    }
}
