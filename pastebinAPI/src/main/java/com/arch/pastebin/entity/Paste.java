package com.arch.pastebin.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table
@Data
public class Paste {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String pasteId;
    String content;
    String title;
    String expiryTime;
    String url;
    String format;
    String accessMode;   
}

