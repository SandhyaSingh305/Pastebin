package com.arch.pastebin.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table
@Data
public class Paste {
    @Id
    @GeneratedValue
    Integer id;
    String pasteId;
    String content;
    String title;
    String expiryTime;
    String url;
    String format;
    String accessMode;   
}

