package com.react.test.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@NoArgsConstructor
public class TemplateDto {
    private Integer id;
    private String author;
    private String title;
    private String boardcontent;
    private boolean viewoption;
    private Timestamp createtime;
    private String createuser;
    private Timestamp updatetime;
    private String updateuser;
}