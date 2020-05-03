package gcl.kzl.mybatis.service;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @author gchliangcd
 */
@Component
public class MessageServiceContext
{
    private final Map<Integer, MessageService> handlerMap = new HashMap<>(2);

    public MessageService getMessageService(Integer type)
    {
        return handlerMap.get(type);
    }

    public void putMessageService(Integer type, MessageService messageService)
    {
        handlerMap.put(type, messageService);
    }
}
