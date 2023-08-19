//package com.example.aimind.Model;
//
//import com.fasterxml.jackson.annotation.JsonIgnore;
//import com.fasterxml.jackson.annotation.JsonManagedReference;
//import com.fasterxml.jackson.annotation.JsonProperty;
//import jakarta.persistence.*;
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.List;
//
//
//@AllArgsConstructor
//@NoArgsConstructor
//@Getter
//@Setter
//@Entity
//@Table(name = "users")
//public class User {
//    @Id
//    @JsonProperty("id")
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//
//    @JsonProperty("username")
//    @Column(nullable = false, unique = true)
//    private String username;
//
//    @JsonIgnore
//    @Column(nullable = false)
//    private String password;
//
//
//    @JsonProperty("email")
//    @Column(nullable = false, unique = true)
//    private String email;
//
//    @JsonProperty("firstName")
//    @Column(nullable = false)
//    private String firstName;
//
//    @JsonProperty("dob")
//    @Column(nullable = false)
//    private Date dateOfBirth;
//
//    @JsonProperty("lastName")
//    @Column(nullable = false)
//    private String lastName;
//    @JsonProperty("location")
//    @Column(nullable = false)
//    private String location;
//
//    @JsonProperty("gender")
//    @Column(nullable = false)
//    private String gender;
//
//
//
//    // This is known as a copy constructor, which will make a clone of the user object.
//    public User(User copy) {
//        this.id = copy.id;
//        this.email = copy.email;
//        this.username = copy.username;
//        this.password = copy.password;
//        this.firstName = copy.firstName;
//        this.lastName = copy.lastName;
//    }
//
//    // Getter and Setter for profilePicture
//    public String getProfilePicture() {
//        return profilePicture;
//    }
//
//    public void setProfilePicture(String profilePicture) {
//        this.profilePicture = profilePicture;
//    }
//
//    // Relationship Entity
//
//    @JsonManagedReference
//    @OneToMany(mappedBy = "user")
//    private List<Followers> userInterests = new ArrayList<>();
//    @JsonManagedReference
//    @OneToMany(mappedBy = "user")
//    private List<Post> discussions = new ArrayList<>();
//
////    @JsonManagedReference
////    @OneToMany(mappedBy = "user")
////    private List<Comment>comments = new ArrayList<>();
////
////
//////    @OneToMany(mappedBy = "host")
////
////    @JsonManagedReference
////    @OneToMany(mappedBy = "user")
////
////    private List<Event> events = new ArrayList<>();
//
//    @JsonManagedReference
//    @OneToMany(mappedBy = "user")
//    private List<Comment> comments = new ArrayList<>();
//
//
//    @JsonManagedReference
//    @OneToMany(mappedBy = "host", cascade = CascadeType.ALL)
//    private List<Event> events = new ArrayList<>();
//
//
//
//    @JsonManagedReference
//    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
//    private List<Attendee> attendees = new ArrayList<>();
//
//    @JsonManagedReference
//    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
//    private List<Review> reviews = new ArrayList<>();
//
//
//
//
//
//
//}