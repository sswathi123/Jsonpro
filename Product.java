
package com.mycompany.grootp.entities;

import javax.persistence.*;

@Entity
public class Product {
    @Id
    private String pname;
    private int page;
    private long datemax;
    private String gender;
    private String plang;
    private String pcolor;
    private String ppic;
    private String email;
    private String time;
    private String url;
    private String title;
    private int cgpa;

    public Product() {
    }

    public Product(String pname, int page, long datemax, String gender, String plang, String pcolor, String ppic, String email, String time, String url, String title, int cgpa) {
        this.pname = pname;
        this.page = page;
        this.datemax = datemax;
        this.gender = gender;
        this.plang = plang;
        this.pcolor = pcolor;
        this.ppic = ppic;
        this.email = email;
        this.time = time;
        this.url = url;
        this.title = title;
        this.cgpa = cgpa;
    }

    public String getPname() {
        return pname;
    }

    public int getPage() {
        return page;
    }

    public long getDatemax() {
        return datemax;
    }

    public String getGender() {
        return gender;
    }

    public String getPlang() {
        return plang;
    }

    public String getPcolor() {
        return pcolor;
    }

    public String getPpic() {
        return ppic;
    }

    public String getEmail() {
        return email;
    }

    public String getTime() {
        return time;
    }

    public String getUrl() {
        return url;
    }

    public String getTitle() {
        return title;
    }

    public int getCgpa() {
        return cgpa;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public void setDatemax(long datemax) {
        this.datemax = datemax;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setPlang(String plang) {
        this.plang = plang;
    }

    public void setPcolor(String pcolor) {
        this.pcolor = pcolor;
    }

    public void setPpic(String ppic) {
        this.ppic = ppic;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCgpa(int cgpa) {
        this.cgpa = cgpa;
    }

    @Override
    public String toString() {
        return "Product{" + "pname=" + pname + ", page=" + page + ", datemax=" + datemax + ", gender=" + gender + ", plang=" + plang + ", pcolor=" + pcolor + ", ppic=" + ppic + ", email=" + email + ", time=" + time + ", url=" + url + ", title=" + title + ", cgpa=" + cgpa + '}';
    }
    
   
   
}
