package com.example.demo;

import java.util.List;

public interface AttendanceService {

    List<Attendance> getAllAttendance();


    Attendance getAttendanceById(int id);

    void markPresent(int id);

    void markAbsent(int id);

	Attendance save(Attendance attendance);

	


}

