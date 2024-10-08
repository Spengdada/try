package com.exercise.controller;

import com.exercise.Bean.UserVO;
import com.exercise.exception.ServiceException;
import com.exercise.exception.ServiceExceptionEnum;
import com.exercise.result.CommonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/*
    @author: rasa
    @date:2024/10/8下午2:59
*/
@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {

    /**
     * 获得指定用户编号的用户
     * @param id 用户编号
     * @return 用户
     */
    @GetMapping("/get/{id}")
    public UserVO get(@PathVariable("id") Integer id) {
        // 查询并返回用户
        return new UserVO(id, UUID.randomUUID().toString());
    }

    /**
     * 获得指定用户编号的用户
     * @param id 用户编号
     * @return 用户
     */
    @GetMapping("/get2/{id}")
    public CommonResult<UserVO> get2(@PathVariable("id") Integer id) {
        // 查询用户
        UserVO user = new UserVO(id,UUID.randomUUID().toString());
        CommonResult<UserVO> result = new CommonResult<>();
        result.setData(user);
        // 返回结果
        return result;
    }
    /**
     * 测试抛出 NullPointerException 异常
     */
    @GetMapping("/exception-01")
    public UserVO exception01() {
        throw new NullPointerException("没有粗面鱼丸");
    }

    /**
     * 测试抛出 ServiceException 异常
     */
    @GetMapping("/exception-02")
    public UserVO exception02() {
        throw new ServiceException(ServiceExceptionEnum.USER_NOT_FOUND);
    }

    @GetMapping("/do_something")
    public void doSomething() {
        log.info("[doSomething]");
    }

}
