package com.example.ServiceFirst;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();
    User saveUser(User user);
    void deleteUser(Long id);
    void updateUser(Long id,User user);
    User findByIdUser(Long id);
    User findByPasportUser(String pasport);
    String sumCredit(String pasport);
}
