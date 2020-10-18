package com.artkls.articles.models;

import lombok.*;
import javax.persistence.*;

@Entity
@Data
@Table(name = "users")
@NoArgsConstructor
@AllArgsConstructor

public class User extends BaseEntity {
    @Column(unique = true, length = 50)
    private String username;

    @Column
    private String password;

    @Column
    private String email;


}
