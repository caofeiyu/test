package com.pojo;

public class User {
    private Integer id;
    private String name;
    private String sex;
    private String eMail;
    private String passWord;
    private String idName;
    public User() {
    }

    public User(Integer id, String name, String sex, String eMail, String passWord,String idName) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.eMail = eMail;
        this.passWord = passWord;
        this.idName = idName;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", eMail='" + eMail + '\'' +
                ", passWord='" + passWord + '\'' +
                ", idName='" + idName + '\'' +
                '}';
    }

    public String getIdName() {
        return idName;
    }

    public void setIdName(String idName) {
        this.idName = idName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}
