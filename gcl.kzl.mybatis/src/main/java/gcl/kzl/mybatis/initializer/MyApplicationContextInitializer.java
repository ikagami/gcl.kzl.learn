package gcl.kzl.mybatis.initializer;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.annotation.Order;

import static org.springframework.core.Ordered.HIGHEST_PRECEDENCE;

/**
 * @author gchliangcd
 */
@Order(HIGHEST_PRECEDENCE)
public class MyApplicationContextInitializer implements ApplicationContextInitializer
{
    @Override
    public void initialize(ConfigurableApplicationContext applicationContext)
    {
        System.out.println("MyApplicationContextInitializer start...");
    }
}
