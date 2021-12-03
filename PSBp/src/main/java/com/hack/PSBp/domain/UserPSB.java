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

}
