package com.col.data.entity;


import javax.persistence.*;

/**
 * Created by zhirayrg on 5/2/2017.
 */
@Entity
@Table(name = "data")
public class DataEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name = "edid")
    private String edid;

    @Column(name = "fbid")
    private Long fbid;

    @Column(name = "articleTitle")
    private String articleTitle;

    @Column(name = "articleCategory")
    private String articleCategory;

    public String getEdid() {
        return edid;
    }

    public void setEdid(String edid) {
        this.edid = edid;
    }

    public Long getFbid() {
        return fbid;
    }

    public void setFbid(Long fbid) {
        this.fbid = fbid;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }

    public String getArticleCategory() {
        return articleCategory;
    }

    public void setArticleCategory(String articleCategory) {
        this.articleCategory = articleCategory;
    }
}
