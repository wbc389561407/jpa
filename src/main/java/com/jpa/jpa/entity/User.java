package com.jpa.jpa.entity;

import javax.persistence.*;

//配置映射关系
@Entity //这是一个实体类（和数据表映射的类）
@Table(name = "tbl_user")//指定和数据库哪个表的对应，如果不写就是类名小写user
public class User {
    @Id //标记这个是一个主键
    @GeneratedValue(strategy = GenerationType.IDENTITY) //自增主键
    private Integer id;

    @Column(name = "last_name",length = 50) //映射表中字段和长度
    private String lastName;
    @Column//不设置默认列名就是属性名
    private String email;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
