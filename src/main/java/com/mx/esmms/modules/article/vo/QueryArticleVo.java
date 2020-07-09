package com.mx.esmms.modules.article.vo;
import lombok.Data;

@Data
public class QueryArticleVo {
    private String query;
    private Integer pageNum;
    private Integer pageSize;
}
