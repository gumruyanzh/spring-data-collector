package com.col.web.dto;

/**
 * Created by zhirayrg on 5/2/2017.
 */
public class DataDto {
    private String edid;
    private long fbid;
    private String articleTitle;
    private String articleCategory;

    public String getEdid() {
        return edid;
    }

    public void setEdid(String edid) {
        this.edid = edid;
    }

    public long getFbid() {
        return fbid;
    }

    public void setFbid(long fbid) {
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
