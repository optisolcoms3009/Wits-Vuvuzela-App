package com.example.wits_vuvuzela_app;

import android.media.Image;

import java.util.ArrayList;
import java.util.Date;

public class Article {

    String ArticleImage;
    String ArticleTitle;
    String ArticleAutherName;

    public Image getArticleImage() {
        return ArticleImage;
    }

    public void setArticleImage(Image articleImage) {
        ArticleImage = articleImage;
    }

    public String getArticleTitle() {
        return ArticleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        ArticleTitle = articleTitle;
    }

    public String getArticleAutherName() {
        return ArticleAutherName;
    }

    public void setArticleAutherName(String articleAutherName) {
        ArticleAutherName = articleAutherName;
    }

    public Date getArticleDateUploaded() {
        return ArticleDateUploaded;
    }

    public void setArticleDateUploaded(Date articleDateUploaded) {
        ArticleDateUploaded = articleDateUploaded;
    }


    public void AddComment(String addComment){
        ArticleComments.add(addComment);
    }
}
