package com.kodilla.exception.stream.forumuser;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> forumUserList = new ArrayList<>();

    public Forum() {
        forumUserList.add(new ForumUser(1, "Andrzej", 'M', LocalDate.of(1998, Month.JANUARY, 1),1));
        forumUserList.add(new ForumUser(2, "Jarosław", 'M', LocalDate.of(1999, Month.FEBRUARY, 2),2));
        forumUserList.add(new ForumUser(3, "Zbigniew", 'M', LocalDate.of(2000, Month.MARCH, 3),3));
        forumUserList.add(new ForumUser(4, "Patryk", 'M', LocalDate.of(2001, Month.APRIL, 4),4));
        forumUserList.add(new ForumUser(5, "Krystyna", 'F', LocalDate.of(2002, Month.MAY, 5),5));
        forumUserList.add(new ForumUser(6, "Lech", 'M', LocalDate.of(1998, Month.JUNE, 11),6));
        forumUserList.add(new ForumUser(7, "Donald", 'M', LocalDate.of(1999, Month.JULY, 22),7));
        forumUserList.add(new ForumUser(8, "Radoslaw", 'M', LocalDate.of(2000, Month.AUGUST, 31),8));
        forumUserList.add(new ForumUser(9, "Roman", 'M', LocalDate.of(2001, Month.SEPTEMBER, 11),9));
        forumUserList.add(new ForumUser(10, "Rafal", 'M', LocalDate.of(2002, Month.OCTOBER, 15),0));
    }

    public List<ForumUser> getForumUserList() {
        return new ArrayList<>(forumUserList);
    }
}

