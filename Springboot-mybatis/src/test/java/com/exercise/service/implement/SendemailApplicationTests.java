package com.exercise.service.implement;

import com.exercise.service.IMailService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;

/*
    @author: rasa
    @date:2024/10/10下午4:20
*/
@SpringBootTest
public class SendemailApplicationTests {

    /**
     * 注入发送邮件的接口
     */
    @Autowired
    private IMailService mailService;

    /**
     * 测试发送文本邮件
     */
    @Test
    public void sendmailTest() {
        mailService.sendSimpleMail("2738926962@qq.com","主题：你好普通邮件","内容：第一封邮件");
    }

    @Test
    public void sendmailHtmlTest() throws Exception {
        mailService.sendHtmlMail("2738926962@qq.com","主题：你好html邮件","<h1>内容：第一封html邮件</h1>");
    }

    @Test
    public void sendAttachmentsMailTest() throws Exception {
        mailService.sendAttachmentsMail("2738926962@qq.com","主题：你好，有附件",
                "<h1>内容：第一封附件邮件</h1>","E:\\南工\\哎嘿.jpg");
    }

    @Test
    public void sendInlineMailTest() throws Exception {
        String content =  "<html>" +
                "<body>" +
                "<div><img src=\"cid:img1\" width=\"800\" height=\"500\"></div>" +
                "<div><img src=\"cid:img2\" width=\"800\" height=\"500\"></div>" +
                "</body></html>";
        HashMap<String, String> imgMap = new HashMap<>();
        imgMap.put("img1","E:\\南工\\哎嘿.jpg");
        imgMap.put("img2","E:\\南工\\哎嘿.jpg");
        mailService.sendInlineMail("2738926962@qq.com","主题：你好，看看这个",
                content , imgMap);
    }
}

