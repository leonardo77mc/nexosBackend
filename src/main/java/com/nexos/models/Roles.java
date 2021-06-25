package com.nexos.models;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Data
@Table(name = "roles")
public class Roles implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_role")
    private List<UserRoles> userRoles;

    @Column(name = "create_at")
    private long createAt;

    @Column(name = "update_at")
    private long updateAt;

    @Column(name = "delete_at")
    private long deleteAt;

}
