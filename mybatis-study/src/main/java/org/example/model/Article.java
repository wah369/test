package org.example.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 联想
 * Date: 2021-01-21
 * Time: 15:25
 */
@Getter
@Setter
@ToString
public class Article {
    private Integer id;
    private String title;
    private String content;
    private String viewCount;
    private Integer userId;
    private Date createTime;

}
