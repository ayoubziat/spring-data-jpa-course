package com.example.demo.model;

import jakarta.persistence.*;

@Entity(name = "Student")
@Table(name = "students", uniqueConstraints = {
        @UniqueConstraint(name = "student_email_unique", columnNames = "student_email")  // a constraint will be added
})
public class Student {

    @Id
    @SequenceGenerator(
            name = "student_id_sequence",
            sequenceName = "student_id_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            generator = "student_id_sequence",
            strategy = GenerationType.SEQUENCE
    )
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id", updatable = false)
    private Long id;  // Big serial data type

    @Column(name = "first_name", nullable = false, columnDefinition = "TEXT")
    private String firstName;

    @Column(name = "last_name", nullable = false, columnDefinition = "TEXT")
    private String lastName;

    @Column(name = "student_email", nullable = false, columnDefinition = "TEXT")
    private String email;

    @Column(name = "student_age", nullable = false)
    private Integer age;

    public Student() {
    }

    public Student(Long id, String firstName, String lastName, String email, Integer age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }
}
