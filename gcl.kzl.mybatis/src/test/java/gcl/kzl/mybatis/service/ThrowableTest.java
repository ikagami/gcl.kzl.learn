package gcl.kzl.mybatis.service;

import org.junit.Test;

public class ThrowableTest
{
    @Test
    public void testThrowable()
    {
        try
        {
            throw new Throwable("root error");
        }
        catch (Throwable t)
        {
            System.out.println(t.getMessage());
            for (StackTraceElement stackTraceElement : t.getStackTrace())
            {
                System.out.println(stackTraceElement);
            }
        }
    }
}
