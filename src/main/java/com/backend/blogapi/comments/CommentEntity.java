package com.backend.blogapi.comments;

import com.backend.blogapi.blogs.BlogEntity;
import com.backend.blogapi.common.BaseEntity;
import com.backend.blogapi.users.UserEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

@Entity(name = "comments")
public class CommentEntity extends BaseEntity {
    @Column(nullable = false, length = 150)
    String title;
    @Column(nullable = false, length = 550)
    String body;


    @ManyToOne
    UserEntity author;

    @ManyToOne
    BlogEntity blog;
}
