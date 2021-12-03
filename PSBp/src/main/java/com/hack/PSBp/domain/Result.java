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
@Table(name = "Result")
@Entity
public class Result {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  long id;

    private  long userId;
    private  int rating;
    private  String tag;
}
