package com.backend.blogapi.users;

import com.backend.blogapi.common.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Column;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString
@Setter
@Entity(name = "users")
public class UserEntity extends BaseEntity {
    @Column(nullable = false, unique = true, length = 30)
    String username;
    @Column(nullable = false, unique = true, length = 50)
    String email;
    @Column(nullable = false, length = 100)
    String password;  // TODO: Hash this password

    @Column(length = 100)
    String bio;
}
