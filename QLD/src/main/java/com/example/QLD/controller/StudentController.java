package com.example.QLD.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.example.QLD.model.Award;
import com.example.QLD.model.Grade;
import com.example.QLD.model.StudentAccount;
import com.example.QLD.service.AwardService;
import com.example.QLD.service.GradeService;
import com.example.QLD.service.StudentAccountService;

import ch.qos.logback.core.model.Model;
import jakarta.servlet.http.HttpSession;

@Controller
public class StudentController {
    @Autowired
    private HttpSession session;
    @Autowired
    StudentAccountService studentAccountService;
    @Autowired
    AwardService awardService;
    @Autowired
    GradeService gradeService;

    @Autowired
    StudentAccount studentAccount;

    @RequestMapping("/login")
    public String showLogin() {
        return "login";
}

@GetMapping("/list")
public String dashboard(ModelMap model) {
    List<Grade> searchResults = gradeService.findAll();
    model.addAttribute("students", searchResults);
    return "dashboard";
}

@PostMapping("/checkLogin")
public String checkLogin(
        @RequestParam("username") String username,
        @RequestParam("password") String password,
        HttpSession session,
        ModelMap model) {

    if (studentAccountService.checkLogin(username, password)) {
        session.setAttribute("USERNAME", username);
        System.out.println("Thanh cong");
        return "dashboard";
    } else {
        model.addAttribute("ERROR", "Username or password not exist");
        System.out.println("That bai");
        return "login";
    }
}


@GetMapping("/grades/{studentId}")
    public String viewGrades(@PathVariable("studentId") String studentId, ModelMap model) {
        Optional<Grade> gradeOptional = gradeService.findById(studentId);
        if (gradeOptional.isPresent()) {
            Grade grade = gradeOptional.get();
            model.addAttribute("grade", grade);
            return "grades";
        } else {
            model.addAttribute("ERROR", "Grades not found for student ID: " + studentId);
            return "dashboard";
        }
    }

// @GetMapping("/grades/{studentId}")
// public String viewGrades(@PathVariable("studentId") String studentId, ModelMap model) {
//     Optional<StudentAccount> studentAccountOptional = studentAccountService.findById(studentId);
//     if (studentAccountOptional.isPresent()) {
//         StudentAccount studentAccount = studentAccountOptional.get();
//         Grade grade = studentAccount.getGrade(); // Lấy điểm của sinh viên từ tài khoản sinh viên
//         if (grade != null) {
//             model.addAttribute("grade", grade);
//             return "grades";
//         } else {
//             model.addAttribute("ERROR", "Grades not found for student ID: " + studentId);
//             return "dashboard";
//         }
//     } else {
//         model.addAttribute("ERROR", "Student not found for ID: " + studentId);
//         return "dashboard";
//     }
// }




@GetMapping("/awards/{studentId}")
public String viewAwards(@PathVariable("studentId") String studentId, ModelMap model) {
    Optional<Award> awardOptional = awardService.findById(studentId);
    if (awardOptional.isPresent()) {
        Award award = awardOptional.get();
        model.addAttribute("award", award);
        return "awards";
    } else {
        model.addAttribute("ERROR", "Awards not found for student ID: " + studentId);
        return "dashboard";
    }
}

    

    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.removeAttribute("USERNAME");
        return "login";
    }
}

    
