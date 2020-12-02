package ru.itsjava.iostreams;


import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor

public class User {
    public final String login;
    public final transient String password;
}
