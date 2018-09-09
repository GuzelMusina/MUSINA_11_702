package ru.itis.taxi.repositories;

import ru.itis.taxi.models.User;

import java.util.Optional;

/**
 * 05.09.2018
 * UserRepository
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public interface UserRepository extends CrudRepositories<User ,Long> {
    Optional<User> findByPhone(String phone);
}