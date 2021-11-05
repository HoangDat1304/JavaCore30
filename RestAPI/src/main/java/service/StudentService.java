package service;

import dao.StudentDao;
import dto.StudentDto;
import model.Student;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.List;

public class StudentService {
    StudentDao studentDao = new StudentDao();
    public List<Student> getListStudent() {
        return studentDao.getAll();
    }

    public List<Student> getListStudentName(String name){
        return studentDao.getStudentName(name);
    }

    public List<Student> getListStudentGender(String gender){
        return studentDao.getStudentGender(gender);
    }

    public List<Student> getListStudentHometown(String hometown){
        return studentDao.getStudentHometown(hometown);
    }

    public List<Student> getListStudentClassName(String className){
        return studentDao.getStudentClassName(className);
    }

    public List<Student> getListStudentMajor(String major){
        return studentDao.getStudentMajor(major);
    }

    public List<Student> getListStudentAverageMark(double min, double max){
        return studentDao.getStudentAverageMark(min,max);
    }

    public boolean add(StudentDto studentDto) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Student student = new Student();
        try {
            student.setBirthday(sdf.parse(studentDto.getBirthday()));
        } catch (Exception e) {
            e.printStackTrace();
        }

        student.setName(studentDto.getFullName());
        student.setGender(studentDto.getGender());
        student.setClassname(studentDto.getClassName());
        student.setHometown(studentDto.getHometown());
        student.setMajor(studentDto.getMajor());
        student.setMark((int) studentDto.getMark());
        if (student.getName() == null){
            return false;
        }
        if (student.getClassname() == null || student.getClassname().length() > 50 || student.getClassname().length() < 1){
            return false;
        }
        if (student.getMajor() == null){
            return false;
        }
        if (student.getBirthday() == null){
            return false;
        }
        if (student.getHometown() == null){
            return false;
        }
        if (student.getGender() == null){
            return false;
        }
        if (student.getMark() > 10 || student.getMark() < 0){
            return false;
        }
        return studentDao.addStudent(student);
    }

    public boolean update(Student student) {
        if(student.getId() <= 0){
            return false;
        }
        if (student.getName() == null){
            return false;
        }
        if (student.getBirthday() == null){
            return false;
        }else {
            Period period = Period.between(LocalDate.ofEpochDay(student.getBirthday().getDate()), LocalDate.now());
            if(period.getYears() > 100 || period.getYears() < 0){
                return false;
            }
        }
        if (student.getClassname() == null || student.getClassname().length() > 50 || student.getClassname().length() < 1){
            return false;
        }
        if (student.getMajor() == null){
            return false;
        }
        if (student.getHometown() == null){
            return false;
        }
        if (student.getGender() == null){
            return false;
        }
        if (student.getMark() > 10 || student.getMark() < 0){
            return false;
        }
        return studentDao.updateStudent(student);
    }

    public boolean delete(int id) {
        return studentDao.deleteStudent(id);
    }
}
