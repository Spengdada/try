package com.exercise.service;

import com.exercise.bean.Member;

import java.util.List;

/*
    @author: rasa
    @date:2024/10/10下午4:38
*/
public interface MemberService {

    /**
     * 获取所有的成员信息
     * @return 成员信息列表
     */
    List<Member> getAllMember();

}

