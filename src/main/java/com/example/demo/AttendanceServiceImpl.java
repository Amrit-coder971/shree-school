package com.example.demo;


import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class AttendanceServiceImpl implements AttendanceService {

    private final AttendanceRepository attendanceRepository;

    public AttendanceServiceImpl(AttendanceRepository attendanceRepository) {
        this.attendanceRepository = attendanceRepository;
    }

    @Override
    public List<Attendance> getAllAttendance() {
        return attendanceRepository.findAll();
    }

    
    @Override
    public Attendance getAttendanceById(int id) {
        return attendanceRepository.findById(id).orElse(null);
    }

    @Override
    public Attendance save(Attendance attendance) {
        return attendanceRepository.save(attendance); // save to DB
    }

    
	@Override
	public void markPresent(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void markAbsent(int id) {
		// TODO Auto-generated method stub
		
	}
}
