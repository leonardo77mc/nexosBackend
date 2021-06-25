package com.nexos.models;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Data
@Table(name = "users")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private int age;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<UserRoles> userRoles;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Product> products;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Product> productsConfig;

    @Column(name = "create_at")
    private long createAt;

    @Column(name = "update_at")
    private long updateAt;

    @Column(name = "delete_at")
    private long deleteAt;
}
