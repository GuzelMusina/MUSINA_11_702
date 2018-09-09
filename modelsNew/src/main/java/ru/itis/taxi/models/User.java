package ru.itis.taxi.models;

import lombok.*;

import java.net.URL;
import java.util.Objects;

/**
 * 05.09.2018
 * User
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
@Getter
@Setter
@Builder
@EqualsAndHashCode
@ToString
public class User {

    private Long id;

    private String phone;
    private String hashPassword;

    private String firstName;
    private String lastName;
    private String email;
    private URL photo;
}
