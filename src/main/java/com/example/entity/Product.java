package com.example.entity;

import javax.persistence.*;

@Entity
@Table(name = "t_product")
public class Product {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 名称
     */
    @Column(name = "name")
    private String name;

    @Column(name = "content")
    private String content;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
         this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
         this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
         this.content = content;
    }

}