package com.cinema.model;

import com.cinema.model.Film;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@Entity
@Table(name = "schedule")
public class Schedule {

    @Id
    @GeneratedValue
    private Long id;

    @Column(columnDefinition = "DATE")
    private LocalDateTime date;


    @OneToOne
    @JoinColumn(name = "film_id", referencedColumnName = "id")
    private Film film;
}
