package gcl.kzl.mybatis.controller;

import gcl.kzl.mybatis.mapper.PersonDao;
import gcl.kzl.mybatis.model.Person;
import gcl.kzl.mybatis.model.db.PersonDo;
import gcl.kzl.mybatis.response.PeopleInfoResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author gchliangcd
 */
@RestController
@RequestMapping("/people")
public class QueryPeopleController
{
    private final static Logger INTERFACE_LOGGER = LoggerFactory.getLogger("interfaceLogger");

    private final static Logger RUN_LOGGER = LoggerFactory.getLogger("runLogger");

    private final static Logger DEBUG_LOGGER = LoggerFactory.getLogger("debugLogger");

    private static final Logger LOGGER = LoggerFactory.getLogger(QueryPeopleController.class);

    private final PersonDao personDao;

    @Autowired
    public QueryPeopleController(PersonDao personDao)
    {
        this.personDao = personDao;
    }

    @RequestMapping(value = "info/{id}", method = RequestMethod.GET)
    public ResponseEntity<PeopleInfoResponse> queryPeopleInfo(@PathVariable String id)
    {
        INTERFACE_LOGGER.debug("id1 is " + id);
        RUN_LOGGER.debug("id1 is " + id);
        DEBUG_LOGGER.debug("id1 is " + id);
        LOGGER.debug("id1 is " + id);
        INTERFACE_LOGGER.info("id2 is " + id);
        RUN_LOGGER.info("id2 is " + id);
        DEBUG_LOGGER.info("id2 is " + id);
        LOGGER.info("id2 is " + id);
        INTERFACE_LOGGER.error("id3 is " + id);
        RUN_LOGGER.error("id3 is " + id);
        DEBUG_LOGGER.error("id3 is " + id);
        LOGGER.error("id3 is " + id);
        PeopleInfoResponse response = new PeopleInfoResponse();
        PersonDo personDo = personDao.query(id);
        Person person = new Person();
        BeanUtils.copyProperties(personDo, person);
        response.getPeople().add(person);

        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
