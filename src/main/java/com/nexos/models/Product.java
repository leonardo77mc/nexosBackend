package com.nexos.models;

import com.sun.istack.*;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Table(name = "products")
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @NotNull
    private int quantity;

    private double price;

    @ManyToOne
    @JoinColumn(name="id_user")
    private User user;

    @ManyToOne
    @JoinColumn(name="id_user_config")
    private User userConfig;

    @Column(name = "create_at")
    private long createAt;

    @Column(name = "update_at")
    private long updateApp;

    @Column(name = "delete_at")
    private long deleteAt;

}
