package stock.dal.mapper;

import org.apache.ibatis.annotations.Param;
import stock.dal.model.CrawlerLog;
import stock.dal.model.CrawlerLogExample;

import java.util.List;

public interface CrawlerLogMapper {
    int countByExample(CrawlerLogExample example);

    int deleteByExample(CrawlerLogExample example);

    int deleteByPrimaryKey(String id);

    int insert(CrawlerLog record);

    int insertSelective(CrawlerLog record);

    List<CrawlerLog> selectByExample(CrawlerLogExample example);

    CrawlerLog selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") CrawlerLog record, @Param("example") CrawlerLogExample example);

    int updateByExample(@Param("record") CrawlerLog record, @Param("example") CrawlerLogExample example);

    int updateByPrimaryKeySelective(CrawlerLog record);

    int updateByPrimaryKey(CrawlerLog record);
}