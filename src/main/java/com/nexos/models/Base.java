package com.nexos.models;


import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Base {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "create_at")
    private long createAt;

    @Column(name = "update_at")
    private long updateApp;

    @Column(name = "delete_at")
    private long deleteAt;
}
