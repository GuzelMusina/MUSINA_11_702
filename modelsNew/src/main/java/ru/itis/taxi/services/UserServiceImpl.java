package ru.itis.taxi.services;

import org.springframework.security.authentication.encoding.PasswordEncoder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import ru.itis.taxi.models.User;
import ru.itis.taxi.repositories.UserRepository;

import java.net.URL;
import java.util.Optional;

/**
 * 05.09.2018
 * UserServiceImpl
 *
 * @author Guzel Musina (ITIS)
 * @version v1.0
 */
public class UserServiceImpl implements UserService {

        private UserRepository usersRepository;

        private PasswordEncoder passwordEncoder;

        public UserServiceImpl(UserRepository usersRepository) {
            this.usersRepository = usersRepository;
            this.passwordEncoder = new BCryptPasswordEncoder();
        }

        @Override
        public void register(String phone, String password) {
            User user = User.builder()
                    .phone(phone)
                    .hashPassword(passwordEncoder.encode(password))
                    .build();
            usersRepository.save(user);
        }

        @Override
        public URL getPhotoByPhone(String phone) {
            Optional<User> user = usersRepository.findByPhone(phone);
            return user.map(User::getPhoto).orElse(null);
        }

        @Override
        public User findByPhone(String phone) {
            return usersRepository.findByPhone(phone).orElse(null);
        }

        @Override
        public boolean isRegistered(String phone, String password) {
            Optional<User> candidateUser = usersRepository.findByPhone(phone);
            return candidateUser.filter(user -> passwordEncoder.matches(password, user.getHashPassword())).isPresent();
        }

    }