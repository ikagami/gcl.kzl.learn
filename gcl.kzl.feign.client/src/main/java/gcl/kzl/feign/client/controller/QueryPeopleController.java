package gcl.kzl.feign.client.controller;

import gcl.kzl.feign.client.response.PeopleInfoResponse;
import gcl.kzl.feign.client.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/people")
public class QueryPeopleController
{
    private final PersonService personService;

    @Autowired
    public QueryPeopleController(PersonService personService)
    {
        this.personService = personService;
    }

    @RequestMapping(value = "info/{id}", method = RequestMethod.GET)
    public ResponseEntity<PeopleInfoResponse> queryPeopleInfo(@PathVariable String id)
    {
        return new ResponseEntity<>(personService.query(id), HttpStatus.OK);
    }
}
