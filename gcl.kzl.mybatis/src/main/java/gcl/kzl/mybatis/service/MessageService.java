package gcl.kzl.mybatis.service;

import gcl.kzl.mybatis.model.MessageInfo;

/**
 * @author gchliangcd
 */
public interface MessageService
{
    void handleMessage(MessageInfo messageInfo);
}
