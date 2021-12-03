package com.hack.PSBp.domain;


import lombok.*;

import javax.persistence.*;


@EqualsAndHashCode
@Data
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Builder
@AllArgsConstructor
@Table(name = "UserPSB")
@Entity
public class UserPSB {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  long id;

    private  int rating;
    private  int courseAlumnusId;
    private  String department;
    private  String role;
    private  String tag;
    private  String name;
    private  String surname;
    private  String patronymic;     //отчество
    private  String workPhoneNumbers;
    private  String homePhoneNumbers;
    private  String login;
    private  String pass;
    private  String email;
    private  String address;

//
//
//    public UserPSB() {
//    }
//
//    public UserPSB(int rating, int courseAlumnusId, String department, String role, String tag) {
//        this.rating = rating;
//        this.courseAlumnusId = courseAlumnusId;
//        this.department = department;
//        this.role = role;
//        this.tag = tag;
//    }
//
//    public long getId() {
//        return id;
//    }
//
//    public int getRating() {
//        return rating;
//    }
//
//    public int getCourseAlumnusId() {
//        return courseAlumnusId;
//    }
//
//    public String getDepartment() {
//        return department;
//    }
//
//    public String getRole() {
//        return role;
//    }
//
//    public String getTag() {
//        return tag;
//    }
//
//    public void setId(long id) {
//        this.id = id;
//    }
//
//    public void setRating(int rating) {
//        this.rating = rating;
//    }
//
//    public void setCourseAlumnusId(int courseAlumnusId) {
//        this.courseAlumnusId = courseAlumnusId;
//    }
//
//    public void setDepartment(String department) {
//        this.department = department;
//    }
//
//    public void setRole(String role) {
//        this.role = role;
//    }
//
//    public void setTag(String tag) {
//        this.tag = tag;
//    }
}
