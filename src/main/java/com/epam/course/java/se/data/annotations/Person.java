package com.epam.course.java.se.data.annotations;

import com.epam.course.java.se.data.enums.Gender;
import lombok.*;

@AllArgsConstructor
@Getter
@EqualsAndHashCode
@ToString
public class Person {
    @NonNull private final String firstName;
    @NonNull private final String lastName;
    private final int age;
    @NonNull private final Gender gender;

}
