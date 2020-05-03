package gcl.kzl.mybatis.mapper;

import gcl.kzl.mybatis.model.db.PersonDo;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author gchliangcd
 */
@Mapper
public interface PersonDao
{
    PersonDo query(String id);
}