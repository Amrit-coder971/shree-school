package com.example.demo;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AttendanceController {

    private AttendanceService attendanceService;

    public AttendanceController(AttendanceService attendanceService) {
        this.attendanceService = attendanceService;
    }

    @GetMapping("/attendance")
    public String listAttendance(Model model) {
        model.addAttribute("attendanceList", attendanceService.getAllAttendance());
        return "attendance";
    }
    @GetMapping("/add_student")
    public String showAddStudentForm(Model model) {
        model.addAttribute("attendance", new Attendance());
        return "add_student"; 
    }

    @PostMapping("/add_student/save")
    public String saveStudent(@ModelAttribute Attendance attendance) {
        attendanceService.save(attendance); 
        return "redirect:/attendance"; 
    }
    @GetMapping("/attendance/view/{id}")
    public String viewAttendance(@PathVariable int id, Model model) {
        Attendance attendance = attendanceService.getAttendanceById(id);
        model.addAttribute("attendance", attendance);
        return "view_attendance";
    }
    
    @GetMapping("/view_attendance")
    public String viewAttendance(Model model) {
        model.addAttribute("attendanceList", attendanceService.getAllAttendance());
        return "view_attendance"; 
    }

}





