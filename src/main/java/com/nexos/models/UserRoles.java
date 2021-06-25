package com.nexos.models;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Table(name = "user_role")
public class UserRoles implements Serializable {

    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne()
    @JoinColumn(name = "id_user")
    private User user;

    @Column(name = "create_at")
    private long createAt;

    @Column(name = "update_at")
    private long updateAt;

    @Column(name = "delete_at")
    private long deleteAt;
}
