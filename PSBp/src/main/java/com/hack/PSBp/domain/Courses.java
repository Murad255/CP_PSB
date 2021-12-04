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
@Table(name = "Courses")
@Entity
public class Courses {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  long id;

    private  String courseName;
    private  String department;
    private  int raiting;
}
