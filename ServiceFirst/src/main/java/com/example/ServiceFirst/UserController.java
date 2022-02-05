package com.example.ServiceFirst;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> allUsers(){
        return userService.getAllUsers();
    }

    @PostMapping
    public User createUser(@RequestBody User user){
        return userService.saveUser(user);
    }

    @GetMapping("/findbyid/{id}")
    public User findByIdUser(@PathVariable Long id){
        return userService.findByIdUser(id);
    }

    @GetMapping("/pasport/{pasport}")
    public User findByPasportUser(@PathVariable String pasport){
        return userService.findByPasportUser(pasport);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<User> updateUser(@RequestBody User user, @PathVariable Long id){
        userService.updateUser(id,user);
        return new ResponseEntity<>(userService.findByIdUser(id), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id){
        userService.deleteUser(id);
    }

    @GetMapping("/credit/{pasport}")
    public String sumCredit(@PathVariable String pasport){

        return userService.sumCredit(pasport);
    }




}
