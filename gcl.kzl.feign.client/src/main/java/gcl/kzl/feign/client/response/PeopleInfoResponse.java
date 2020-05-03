package gcl.kzl.feign.client.response;

import gcl.kzl.feign.client.model.Person;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class PeopleInfoResponse
{
    private List<Person> people = new ArrayList<>();
}
