package gcl.kzl.mybatis.listener;

import gcl.kzl.mybatis.model.MsgTypeHandler;
import gcl.kzl.mybatis.service.MessageService;
import gcl.kzl.mybatis.service.MessageServiceContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author gchliangcd
 */
@Component
public class MessageServiceListener implements ApplicationListener<ContextRefreshedEvent>
{
    @Override
    public void onApplicationEvent(ContextRefreshedEvent event)
    {
        System.out.println("MessageServiceListener start...");
        Map<String, Object> messageService = event.getApplicationContext().getBeansWithAnnotation(MsgTypeHandler.class);
        MessageServiceContext messageServiceContext = event.getApplicationContext().getBean(MessageServiceContext.class);
        messageService.forEach((name, bean) -> {
            MsgTypeHandler typeHandler = bean.getClass().getAnnotation(MsgTypeHandler.class);
            messageServiceContext.putMessageService(typeHandler.value().code, (MessageService) bean);
        });
    }
}
