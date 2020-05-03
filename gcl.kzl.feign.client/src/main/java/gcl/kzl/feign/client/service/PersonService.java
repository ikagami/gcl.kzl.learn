package gcl.kzl.feign.client.service;

import gcl.kzl.feign.client.response.PeopleInfoResponse;
import org.springframework.stereotype.Component;

@Component
public class PersonService
{
    private final PersonFeignClient personFeignClient;

    public PersonService(PersonFeignClient personFeignClient)
    {
        this.personFeignClient = personFeignClient;
    }

    public PeopleInfoResponse query(String id)
    {
        return personFeignClient.queryPeopleInfo(id);
    }
}
