package com.example.certificate.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = ("certificate"))
public class Certificate {
    @Id
    @SequenceGenerator(name = ("certificate_id"), sequenceName = ("certificate_id"))
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = ("certificate_id"))
    private  Integer id;

    @ManyToOne
    @JoinColumn(name = ("user_id"),insertable = false,updatable = false)
    private User user;
    @Column(name = ("user_id"))
    private Integer userId;

    private String token;
    private String url;
    private String urlQR;
    private String path;

    @ManyToOne
    @JoinColumn(name = ("direction_id"),insertable = false,updatable = false)
    private Direction direction;
    @Column(name = ("direction_id"))
    private Integer directionId;

    @Column(name = ("finished_at"))
    private LocalDate finishedAt;

    private Boolean status;
    @Column(name = ("created_at"))
    private LocalDateTime createdAt;
    @Column(name = ("deleted_At"))
    private LocalDateTime deletedAt;
}
