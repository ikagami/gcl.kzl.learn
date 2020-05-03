package gcl.kzl.unittest.response;

import gcl.kzl.unittest.model.Person;
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
