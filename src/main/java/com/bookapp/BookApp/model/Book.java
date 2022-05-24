package com.bookapp.BookApp.model;

import lombok.*;

import javax.persistence.*;

@ToString
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id")
    private Integer id;
    @Column(name = "title")
    private String title;
    @Column(name = "name_author")
    private String nameAuthor;
    @Column(name = "year_manufacture")
    private Integer yearManufacture;
    @Column(name = "style")
    private String style;
    @Column(name = "number_pages")
    private Integer numberPages;
    @Column(name = "description")
    private String description;

}
