package com.blog13.model;

import javax.persistence.*;

@Entity
@Table(name = "post")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "title", nullable = false, length = 100)
    private String title;

    @Column(name = "content", nullable = false, length = 1000)
    private String content;

    @Column(name = "descriprion", nullable = false)
    private String descriprion;

    public String getDescriprion() {
        return descriprion;
    }

    public void setDescriprion(String descriprion) {
        this.descriprion = descriprion;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}