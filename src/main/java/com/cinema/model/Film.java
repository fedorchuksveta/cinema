package com.cinema.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Data
@NoArgsConstructor
@Entity
@Table(name = "film")
public class Film {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @OneToOne(mappedBy = "film")
    private Schedule schedule;

    @ManyToMany(mappedBy = "filmSet")
    private Set<User> userSet;

}
