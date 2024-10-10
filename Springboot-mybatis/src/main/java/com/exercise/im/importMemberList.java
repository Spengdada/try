package com.exercise.im;

import com.alibaba.excel.EasyExcel;
import com.exercise.bean.Member;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

/*
    @author: rasa
    @date:2024/10/10下午5:24
*/
@Controller
@Slf4j
@RequestMapping("/member")
public class importMemberList {
    //没有具体文件！！！！！！
    /**
     * 从Excel导入会员列表
     */
    @RequestMapping(value = "/import1", method = RequestMethod.POST)
    @ResponseBody
    public void importMemberList(@RequestPart("file") MultipartFile file) throws IOException {
        List<Member> list = EasyExcel.read(file.getInputStream())
                .head(Member.class)
                .sheet()
                .doReadSync();
        for (Member member : list) {
            System.out.println(member);
        }
    }


}
