package ru.itis.taxi.services;

import ru.itis.taxi.models.User;

import java.net.URL;

/**
 * 05.09.2018
 * UserService
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public interface UserService {
    void register(String phone, String password);
    URL getPhotoByPhone(String phone);
    User findByPhone(String phone);
    boolean isRegistered(String phone, String password);
}