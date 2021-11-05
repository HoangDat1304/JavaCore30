package controller;

import dto.StudentDto;
import model.Student;
import service.StudentService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/student")
public class StudentController {
    StudentService studentService = new StudentService();

    @GET
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Student> getListStudent()
    {
        return studentService.getListStudent();
    }

    @POST
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public String addNewStudent(StudentDto studentDto) {
        return studentService.add(studentDto) ? "thêm mới thành công" : "thêm mới thất bại";
    }

    @PUT
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public String UpdateStudent(Student student){
        return studentService.update(student) ? "sửa thành công " : "sửa thất bại";
    }
    @DELETE
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public String Delete(@PathParam("id") int id){
        return studentService.delete(id) ? "xóa thành công" : "xóa thất bại";
    }
    @GET
    @Path("/birthday")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public List<Student> Birthday(){
        return studentService.getListStudent();
    }
    @GET
    @Path("/search-name/{name}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public List<Student> searchName(@PathParam("name") String name){
        return studentService.getListStudentName(name);
    }

    @GET
    @Path("/search-gender/{gender}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public List<Student> searchGender(@PathParam("gender") String gender){
        return studentService.getListStudentGender(gender);
    }

    @GET
    @Path("/search-major/{major}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public List<Student> searchMajor(@PathParam("major") String major){
        return studentService.getListStudentMajor(major);
    }

    @GET
    @Path("/search-class-name/{classname}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public List<Student> searchClassName(@PathParam("classname") String className){
        return studentService.getListStudentClassName(className);
    }

    @GET
    @Path("/search-hometown/{hometown}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public List<Student> searchHometown(@PathParam("hometown") String hometown){
        return studentService.getListStudentHometown(hometown);
    }
    @GET
    @Path("/search-dtb/{min}/{max}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public List<Student> searchDTB(@PathParam("min") double min, @PathParam("min") double max){
        return studentService.getListStudentAverageMark(min,max);
    }



}
