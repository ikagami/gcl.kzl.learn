package gcl.kzl.mybatis.service;

import gcl.kzl.mybatis.model.MSG_TYPE;
import gcl.kzl.mybatis.model.MessageInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MessageServiceTest
{
    @Autowired
    MessageServiceContext messageServiceContext;

    @Test
    public void test_textMessageService()
    {
        MessageInfo messageInfo = new MessageInfo(MSG_TYPE.TEXT.code, "消息内容");
        MessageService messageService = messageServiceContext.getMessageService(messageInfo.getType());
        messageService.handleMessage(messageInfo);
    }

    @Test
    public void test_imageMessageService()
    {
        MessageInfo messageInfo = new MessageInfo(MSG_TYPE.IMAGE.code, "消息内容");
        MessageService messageService = messageServiceContext.getMessageService(messageInfo.getType());
        messageService.handleMessage(messageInfo);
    }
}
