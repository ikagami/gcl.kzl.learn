package gcl.kzl.mybatis.model;

import java.lang.annotation.*;

/**
 * @author gchliangcd
 */
@Documented
@Inherited
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface MsgTypeHandler
{
    MSG_TYPE value();
}
