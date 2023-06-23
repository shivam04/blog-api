package com.backend.blogapi.blogs;

import com.backend.blogapi.common.BaseEntity;
import com.backend.blogapi.users.UserEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

@Entity(name = "blogs")
public class BlogEntity extends BaseEntity {
    @Column(nullable = false, length = 150)
    String title;
    @Column(nullable = false, length = 150)
    String slug;
    @Column(nullable = false, length = 50)
    String subtitle;
    @Column(nullable = false, length = 5000)
    String body;

    @ManyToOne
    UserEntity author;
}
