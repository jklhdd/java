/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

/**
 *
 * @author Long
 */
public class News implements INews{
    private int ID;
    private String Title;
    private String PublishDate;
    private String Author;
    private String Content;
    private float AverageRate;

    public News() {
    }

    public News(int ID, String Title, String PublishDate, String Author, String Content) {
        this.ID = ID;
        this.Title = Title;
        this.PublishDate = PublishDate;
        this.Author = Author;
        this.Content = Content;
    }
       
    
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public String getPublishDate() {
        return PublishDate;
    }

    public void setPublishDate(String PublishDate) {
        this.PublishDate = PublishDate;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String Author) {
        this.Author = Author;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String Content) {
        this.Content = Content;
    }

    public float getAverageRate() {
        return AverageRate;
    }

    @Override
    public void Display(){
        System.out.println("News: ");
        System.out.println("Title \t PublishDate \t Author \t Content ");
        System.out.println(Title +"\t" + PublishDate +"\t" + Author + "\t" + Content );        
    }
    
    public void calculate(int ...a ){
        this.AverageRate = (a[0]+a[1]+a[2])/3;
    }
    
}
