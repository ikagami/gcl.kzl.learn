package gcl.kzl.unittest.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author gchliangcd
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person implements Serializable
{
    private static final long serialVersionUID = -8250514752608932336L;

    private String id;

    private String name;

    private String sex;

    private Integer age;
}
