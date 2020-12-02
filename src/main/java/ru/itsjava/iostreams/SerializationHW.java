package ru.itsjava.iostreams;

import java.io.*;

public class SerializationHW {
    public static void main(String[] args) {
        User user = new User("GordonRamsey", "Prikol123");
        try (ObjectOutputStream outputStream = new ObjectOutputStream(
                new FileOutputStream("src/main/resources/user.out"))) {
            outputStream.writeObject(user.getLogin());
            outputStream.writeObject(user.getPassword());
        } catch (IOException exception) {
            exception.printStackTrace();
        }

        try (ObjectInputStream inputStream = new ObjectInputStream(
                new FileInputStream("src/main/resources/user.out"))) {

            Object userLogin = inputStream.readObject();
            Object userPassword = inputStream.readObject();
            System.out.println(" UserLogin = " + userLogin + " , UserPassword = " + userPassword);
        } catch (IOException | ClassNotFoundException exception) {
            exception.printStackTrace();
        }


    }
}
