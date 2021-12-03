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
public class Answer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  long id;

    private  long userId;
    private  String question;
    private  String userAnswer;
    private  String tag;

}
