package gcl.kzl.mybatis.service;

import org.jasypt.encryption.StringEncryptor;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EncryptorTest
{
    @Autowired
    StringEncryptor encryptor;

    @Test
    public void getPass()
    {
        String url = encryptor.encrypt("jdbc:mysql://192.168.138.128:3306/mybatisdb");
        String name = encryptor.encrypt("root");
        String password = encryptor.encrypt("870428");
        System.out.println(url);
        System.out.println(name);
        System.out.println(password);
        System.out.println(encryptor.decrypt(password));
        Assert.assertTrue(name.length() > 0);
        Assert.assertTrue(password.length() > 0);
    }
}
