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
@Table(name = "HelpData")
@Entity
public class HelpData {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  long id;

    private  String message;
    private  int departamentId;
    private  String heading;
}
