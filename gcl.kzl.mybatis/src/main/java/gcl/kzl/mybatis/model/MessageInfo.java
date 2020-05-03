package gcl.kzl.mybatis.model;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author gchliangcd
 */
@Data
@AllArgsConstructor
public class MessageInfo
{
    private Integer type;

    private String content;
}
