package com.apress.demo.springblog.domain;

import com.apress.demo.springblog.validation.BlogPostTitleAlreadyExists;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@BlogPostTitleAlreadyExists
@Document
public class Post {
    @Id
    private String id;
    @NotNull
    @Size(min = 3, max = 50, message = "Title must be minimum 3 characters, and maximum 50 characters long")
    private String title;
    @NotNull
    @Size(min = 3, max = 500, message = "Description must be minimum 3 characters, and maximum 500 characters long")
    private String description;
    @NotNull
    @Size(min = 3, max = 5000, message = "Body must be minimum 3 characters, and maximum 5000 characters long")
    private String body;
    private String slug;
    private PostStatus postStatus;
    private LocalDateTime createdOn;
    private LocalDateTime updatedOn;
    private List<Comment> comments;
}
