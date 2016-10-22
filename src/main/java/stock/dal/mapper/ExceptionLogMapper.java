package stock.dal.mapper;

import org.apache.ibatis.annotations.Param;
import stock.dal.model.ExceptionLog;
import stock.dal.model.ExceptionLogExample;

import java.util.List;

public interface ExceptionLogMapper {
    int countByExample(ExceptionLogExample example);

    int deleteByExample(ExceptionLogExample example);

    int deleteByPrimaryKey(String id);

    int insert(ExceptionLog record);

    int insertSelective(ExceptionLog record);

    List<ExceptionLog> selectByExample(ExceptionLogExample example);

    ExceptionLog selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ExceptionLog record, @Param("example") ExceptionLogExample example);

    int updateByExample(@Param("record") ExceptionLog record, @Param("example") ExceptionLogExample example);

    int updateByPrimaryKeySelective(ExceptionLog record);

    int updateByPrimaryKey(ExceptionLog record);
}