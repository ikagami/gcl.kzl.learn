package gcl.kzl.mybatis.response;

import gcl.kzl.mybatis.model.Person;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author gchliangcd
 */
@Data
public class PeopleInfoResponse
{
    private List<Person> people = new ArrayList<>();
}
