package com.shotinuniverse.fourthfloorgame;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document("users")
public class User {

    @Id
    @Field(name="_id")
    private String id;

    @Field(name="username")
    private String username;
    @Field(name="password")
    private String password;
    @Field(name="name")
    private String name;
    @Field(name="second_name")
    private String secondName;
    @Field(name="middle_name")
    private String middleName;

    public User(String id, String username, String password, String name, String secondName, String middleName) {
        super();
        this.id = id;
        this.username = username;
        this.password = password;
        this.name = name;
        this.secondName = secondName;
        this.middleName = middleName;
    }
}
