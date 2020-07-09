package com.mx.esmms.modules.article.respones;

import lombok.Data;

@Data
public class RArticle {
    private Integer id;
    private String year;
    private String title;
    private String author;
    private String material;
    private String content;
    private String strategy;
    private Integer firstCycleId;
    private Integer defineC;
}
