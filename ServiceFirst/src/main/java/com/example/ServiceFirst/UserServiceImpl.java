package com.example.ServiceFirst;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository  userRepository;

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public void updateUser(Long id, User user) {
        User user1 = userRepository.findById(id).get();
        user1.setPasportSn(user.getPasportSn());
        user1.setLastName(user.getLastName());
        user1.setFirstName(user.getFirstName());
        user1.setZarpPlata(user.getZarpPlata());
        user1.setCreditSummasi(user.getCreditSummasi());
        userRepository.save(user1);
    }

    @Override
    public User findByIdUser(Long id) {
        return userRepository.findById(id).get();
    }

    @Override
    public User findByPasportUser(String pasport) {
        return userRepository.findByPasport(pasport);
    }

    @Override
    public String sumCredit(String pasport) {

        User user = userRepository.findByPasport(pasport);
        Integer zprasshet = user.getZarpPlata()-(((user.getZarpPlata()*30)/100)*12);
        if (zprasshet<user.getCreditSummasi()){

            return "bizning hizmatdan foydalanganizgiz uchun rahmat";
        }else {
            Integer polojeno = user.getCreditSummasi()-zprasshet;
            return "kechirasiz sizning darimadingizga quyidagi summani bera olamiz: "+polojeno;
        }
    }
}
