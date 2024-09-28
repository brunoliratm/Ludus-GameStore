package com.ludus.control;

import com.ludus.repository.userRepository;
import com.ludus.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @Autowired
    private userRepository userRepository;

    @PostMapping("/loginUser")
    public String login(@RequestParam("email") String email, @RequestParam("password") String password, Model model) {
        User user = userRepository.findByEmail(email);

        if (user != null && user.getSenha().equals(password)) {
            return "redirect:/store";
        } else {
            model.addAttribute("errorMessage", "Email ou senha incorretos.");
            return "index";
        }
    }
}

