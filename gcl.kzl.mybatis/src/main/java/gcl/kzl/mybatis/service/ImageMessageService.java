package gcl.kzl.mybatis.service;

import gcl.kzl.mybatis.model.MSG_TYPE;
import gcl.kzl.mybatis.model.MessageInfo;
import gcl.kzl.mybatis.model.MsgTypeHandler;
import org.springframework.stereotype.Service;

@Service
@MsgTypeHandler(MSG_TYPE.IMAGE)
public class ImageMessageService implements MessageService
{
    @Override
    public void handleMessage(MessageInfo messageInfo)
    {
        System.out.println("处理图片消息:" + messageInfo.getContent());
    }
}
