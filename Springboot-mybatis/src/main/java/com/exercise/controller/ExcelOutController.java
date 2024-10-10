package com.exercise.controller;

import com.alibaba.excel.EasyExcel;
import com.exercise.bean.Member;
import com.exercise.service.MemberService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/*
    @author: rasa
    @date:2024/10/10下午4:43
*/
@Controller
@Slf4j
public class ExcelOutController {

    @Autowired
    MemberService memberService;


    @RequestMapping("/export1")
    public void exportMembers1(HttpServletResponse response) throws IOException {
        List<Member> members = memberService.getAllMember();

        // 设置文本类型
        response.setContentType("application/vnd.ms-excel");
        // 设置字符编码
        response.setCharacterEncoding("utf-8");
        // 设置响应头
        response.setHeader("Content-disposition", "attachment;filename=demo.xlsx");
        EasyExcel.write(response.getOutputStream(), Member.class).sheet("成员列表").doWrite(members);
    }
}
