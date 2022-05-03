package gcl.kzl.unittest.controller;

import gcl.kzl.unittest.model.Person;
import gcl.kzl.unittest.response.PeopleInfoResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gchliangcd
 */
@RestController
@RequestMapping("/people")
public class QueryPeopleController {
    private static final Logger logger = LoggerFactory.getLogger(QueryPeopleController.class);

    @RequestMapping(value = "info", method = RequestMethod.GET)
    public ResponseEntity<PeopleInfoResponse> queryPeopleInfo() {
        PeopleInfoResponse response = new PeopleInfoResponse();
        Person person = new Person("1", "p1", "female", 16);
        logger.info("person id is {}, name is {}", person.getId(), person.getName());
        response.getPeople().add(person);

        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
