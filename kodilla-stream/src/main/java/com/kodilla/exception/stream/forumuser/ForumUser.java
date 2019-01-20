package com.kodilla.exception.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
    private final int IDNumber;
    private String name;
    private char sex;
    private LocalDate birthdayDate;
    private int postsNumber;

    public ForumUser(int IDNumber, String name, char sex, LocalDate birthdayDate, int postsQty) {
        this.IDNumber = IDNumber;
        this.name = name;
        this.sex = sex;
        this.birthdayDate = birthdayDate;
        this.postsNumber = postsQty;
    }

    public int getIDNumber() {
        return IDNumber;
    }

    public String getName() {
        return name;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthdayDate() {
        return birthdayDate;
    }

    public int getPostsQty() {
        return postsNumber;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "IDNumber=" + IDNumber +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", birthdayDate=" + birthdayDate +
                ", postsNumber=" + postsNumber +
                '}';
    }
}
