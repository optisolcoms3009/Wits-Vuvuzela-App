package com.example.wits_vuvuzela_app;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArticleTest {

    @Test
    public void getArticleLikes() {

        String Input = "6";
        String Actual = "";
        String Expected = "6";

        Article article = new Article();
        article.setArticleLikes(Input);

        Actual = article.getArticleLikes();

        assertEquals(Expected,Actual);
    }

    @Test
    public void setArticleLikes() {

        String Input = "10";

        Article article = new Article();

        article.setArticleLikes(Input);

        String Expected = "10";
        String Actual = article.getArticleLikes();

        assertEquals(Expected,Actual);

    }

    @Test
    public void getArticleDislikes() {

        String Input = "30";
        String Actual = "";
        String Expected = "30";

        Article article = new Article();
        article.setArticleDislikes(Input);

        Actual = article.getArticleDislikes();

        assertEquals(Expected,Actual);

    }

    @Test
    public void setArticleDislikes() {

        String Input = "40";

        Article article = new Article();

        article.setArticleDislikes(Input);

        String Expected = "40";
        String Actual = article.getArticleDislikes();

        assertEquals(Expected,Actual);

    }

    @Test
    public void getArticleComments() {

        String Input = "User1-Comment1/User2-Comment2";
        String Actual = "";
        String Expected = "User1-Comment1/User2-Comment2";

        Article article = new Article();
        article.setArticleComments(Input);

        Actual = article.getArticleComments();

        assertEquals(Expected,Actual);

    }

    @Test
    public void setArticleComments() {

        String Input = "Setting a new Comment";

        Article article = new Article();

        article.setArticleComments(Input);

        String Expected = "Setting a new Comment";
        String Actual = article.getArticleComments();

        assertEquals(Expected,Actual);

    }

    @Test
    public void getArticleLink() {

        String Input = "http://www.google.com";
        String Actual = "";
        String Expected = "http://www.google.com";

        Article article = new Article();
        article.setArticleLink(Input);

        Actual = article.getArticleLink();

        assertEquals(Expected,Actual);

    }

    @Test
    public void setArticleLink() {

        String Input = "http://www.google.com";

        Article article = new Article();

        article.setArticleLink(Input);

        String Expected = "http://www.google.com";
        String Actual = article.getArticleLink();

        assertEquals(Expected,Actual);

    }

    @Test
    public void getArticleImage() {

        String Input = "www.gmail.com/image.jpg";
        String Actual = "";
        String Expected = "www.gmail.com/image.jpg";

        Article article = new Article();
        article.setArticleTitle(Input);

        Actual = article.getArticleTitle();

        assertEquals(Expected,Actual);

    }

    @Test
    public void setArticleImage() {

        String Input = "http://www.google.com/image";

        Article article = new Article();

        article.setArticleImage(Input);

        String Expected = "http://www.google.com/image";
        String Actual = article.getArticleImage();

        assertEquals(Expected,Actual);

    }

    @Test
    public void getArticleTitle() {

        String Input = "Wits University Hunger Strike";
        String Actual = "";
        String Expected = "Wits University Hunger Strike";

        Article article = new Article();
        article.setArticleTitle(Input);

        Actual = article.getArticleTitle();

        assertEquals(Expected,Actual);

    }

    @Test
    public void setArticleTitle() {

        String Input = "Students Preparing For the June Exams";

        Article article = new Article();

        article.setArticleTitle(Input);

        String Expected = "Students Preparing For the June Exams";
        String Actual = article.getArticleTitle();

        assertEquals(Expected,Actual);

    }

    @Test
    public void getArticleAutherName() {

        String Input = "Patrick Jane";
        String Actual = "";
        String Expected = "Patrick Jane";

        Article article = new Article();
        article.setArticleAutherName(Input);

        Actual = article.getArticleAutherName();

        assertEquals(Expected,Actual);

    }

    @Test
    public void setArticleAutherName() {

        String Input = "Sheldon Cooper";

        Article article = new Article();

        article.setArticleAutherName(Input);

        String Expected = "Sheldon Cooper";
        String Actual = article.getArticleAutherName();

        assertEquals(Expected,Actual);

    }

    @Test
    public void getArticleDateUploaded() {

        String Input = "8 April 2019";
        String Actual = "";
        String Expected = "8 April 2019";

        Article article = new Article();
        article.setArticleDateUploaded(Input);

        Actual = article.getArticleDateUploaded();

        assertEquals(Expected,Actual);

    }

    @Test
    public void setArticleDateUploaded() {

        String Input = "29 April 2019";

        Article article = new Article();

        article.setArticleDateUploaded(Input);

        String Expected = "29 April 2019";
        String Actual = article.getArticleDateUploaded();

        assertEquals(Expected,Actual);

    }

    @Test
    public void LikeAnArticle() {

        Article article = new Article();

        String User = "Abdullah";

        article.setArticleLikedList("Abdullah/Ayo/Edwin");

        article.setArticleLikes("1");
        article.setArticleDislikes("2");

        article.LikeAnArticle(User);

        String ActualLikes = "0";
        String ExpectedLikes = article.getArticleLikes() ;

        String ActualDislikes = "2";
        String ExpectedDislikes = article.getArticleDislikes();

        assertEquals(ExpectedLikes,ActualLikes);
        assertEquals(ExpectedDislikes,ActualDislikes);

        Article article2 = new Article();

        String User2 = "Joseph";

        article2.setArticleDislikedList("Abd/Ay/Edw/Joseph");

        article2.setArticleLikes("1");
        article2.setArticleDislikes("2");

        article2.LikeAnArticle(User2);

        String ActualLikes2 = "2";
        String ExpectedLikes2 = article2.getArticleLikes() ;

        String ActualDislikes2 = "1";
        String ExpectedDislikes2 = article2.getArticleDislikes();

        assertEquals(ExpectedLikes2,ActualLikes2);
        assertEquals(ExpectedDislikes2,ActualDislikes2);

        Article article3 = new Article();

        String User3 = "Joseph";

        article3.setArticleLikedList("Abdullah/Ayo/Edwin");
        article3.setArticleDislikedList("Abdullah/Ayo/Edwin");

        article3.setArticleLikes("1");
        article3.setArticleDislikes("2");

        article3.LikeAnArticle(User3);

        String ActualLikes3 = "2";
        String ExpectedLikes3 = article3.getArticleLikes() ;

        String ActualDislikes3 = "2";
        String ExpectedDislikes3 = article3.getArticleDislikes();

        assertEquals(ExpectedLikes3,ActualLikes3);
        assertEquals(ExpectedDislikes3,ActualDislikes3);
    }

    @Test
    public void DislikeAnArticle() {

        Article article = new Article();

        String User = "Abdullah";

        article.setArticleDislikedList("Abdullah/Ayo/Edwin");

        article.setArticleLikes("1");
        article.setArticleDislikes("2");

        article.DislikeAnArticle(User);

        String ActualLikes = "1";
        String ExpectedLikes = article.getArticleLikes() ;

        String ActualDislikes = "1";
        String ExpectedDislikes = article.getArticleDislikes();

        assertEquals(ExpectedLikes,ActualLikes);
        assertEquals(ExpectedDislikes,ActualDislikes);

        Article article2 = new Article();

        String User2 = "Joseph";

        article2.setArticleLikedList("Abd/Ay/Edw/Joseph");

        article2.setArticleLikes("1");
        article2.setArticleDislikes("2");

        article2.DislikeAnArticle(User2);

        String ActualLikes2 = "0";
        String ExpectedLikes2 = article2.getArticleLikes() ;

        String ActualDislikes2 = "3";
        String ExpectedDislikes2 = article2.getArticleDislikes();

        assertEquals(ExpectedLikes2,ActualLikes2);
        assertEquals(ExpectedDislikes2,ActualDislikes2);

        Article article3 = new Article();

        String User3 = "Joseph";

        article3.setArticleLikedList("Abdullah/Ayo/Edwin");
        article3.setArticleDislikedList("Abdullah/Ayo/Edwin");

        article3.setArticleLikes("1");
        article3.setArticleDislikes("2");

        article3.DislikeAnArticle(User3);

        String ActualLikes3 = "1";
        String ExpectedLikes3 = article3.getArticleLikes() ;

        String ActualDislikes3 = "3";
        String ExpectedDislikes3 = article3.getArticleDislikes();

        assertEquals(ExpectedLikes3,ActualLikes3);
        assertEquals(ExpectedDislikes3,ActualDislikes3);
    }

    @Test
    public void RemoveUserFromLikedArticleList() {

        String User = "Sheldon";

        Article article = new Article();

        article.setArticleLikedList("Sheldon/Cooper/Leornard");

        String Actual = "User/Cooper/Leornard";

        String Expected = article.RemoveUserFromLikedArticleList(User);

        assertEquals(Expected,Actual);

    }

    @Test
    public void RemoveUserFromDislikedArticleList() {

        String User = "Sheldon";

        Article article = new Article();

        article.setArticleDislikedList("Sheldon/Cooper/Leornard");

        String Actual = "User1/Cooper/Leornard";

        String Expected = article.RemoveUserFromDislikedArticleList(User);

        assertEquals(Expected,Actual);

        String User2 = "Cooper";

        Article article2 = new Article();

        article2.setArticleDislikedList("");

        String Expected2 = article2.RemoveUserFromDislikedArticleList(User2);

        String Actual2 = "User1/";

        assertEquals(Expected2,Actual2);

    }

    @Test
    public void  AddUserToDislikedList() {

        String User = "Abdullah";

        Article article = new Article();

        article.setArticleDislikedList("Francisc/Mansur");

        article.AddUserToDislikedList(User);

        String Actual = "Francisc/Mansur/Abdullah";

        String Expected = article.getArticleDislikedList();

        assertEquals(Expected,Actual);

        String User2 = "James";

        Article article2 = new Article();

        article2.setArticleDislikedList("");

        article2.AddUserToDislikedList(User2);

        String Actual2 = "James";

        String Expected2 = article2.getArticleDislikedList();

        assertEquals(Expected2,Actual2);

    }

    @Test
    public void  AddUserToLikedList() {

        String User = "Abdullah";

        Article article = new Article();

        article.setArticleLikedList("Francisc/Mansur");

        article.AddUserToLikedList(User);

        String Actual = "Francisc/Mansur/Abdullah";

        String Expected = article.getArticleLikedList();

        assertEquals(Expected,Actual);

        String User2 = "Gordon";

        Article article2 = new Article();

        article2.setArticleLikedList("");

        article2.AddUserToLikedList(User2);

        String Actual2 = "Gordon";

        String Expected2 = article2.getArticleLikedList();

        assertEquals(Expected2,Actual2);

    }
}