package org.example.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.example.model.User;
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
public interface UserMapper {
    User selectById(Integer id);

    List<User> selectByCondition(@Param("username") String username,
                                 @Param("sid") Integer sid,
                                 @Param("eid") Integer eid);

    List<User> selectByCondition2(String username);
    List<User> selectByCondition3(User user);

    int insert(User user);



}
