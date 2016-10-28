package com.epam.course.java.se.annotations;

import com.epam.course.java.se.data.annotations.Person;
import com.epam.course.java.se.data.enums.Gender;
import org.junit.Test;

public class LombokTest {
    @Test
    public void test() {
        final Person person = new Person("John", "Doe", 33, Gender.FEMALE);
        final Person person2 = new Person("John", "Doe", 33, Gender.FEMALE);
        final Person person3 = new Person("John", "Doe", 33, Gender.MALE);
        System.out.println(person.getFirstName());
        System.out.println(person);

        System.out.println(person.equals(person2));
        System.out.println(person.equals(person3));
    }
}
