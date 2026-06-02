package com.arch.pastebin.model;

import lombok.Data;

@Data
public class PasteBinRequest {

    String id;
    String content;
    String title;
    String expiryTime;
    String url;
    String format;
    String accessMode;



}
