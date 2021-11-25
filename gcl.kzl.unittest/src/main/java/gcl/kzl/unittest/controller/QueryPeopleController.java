package gcl.kzl.unittest.controller;

import gcl.kzl.unittest.model.Person;
import gcl.kzl.unittest.response.PeopleInfoResponse;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author gchliangcd
 */
@RestController
@RequestMapping("/people")
public class QueryPeopleController {
    @RequestMapping(value = "info", method = RequestMethod.GET)
    public ResponseEntity<PeopleInfoResponse> queryPeopleInfo() {
        PeopleInfoResponse response = new PeopleInfoResponse();
        Person person = new Person("1", "p1", "female", 16);
        response.getPeople().add(person);

        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
