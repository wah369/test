package org.example.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.model.Article;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 联想
 * Date: 2021-01-21
 * Time: 15:26
 */
@Mapper
@Component
public interface ArticleMapper {

    int deleteByUsername(String username);

    List<Article> selectAll(String orderBy);

}
