package stock.dal.mapper;

import org.apache.ibatis.annotations.Param;
import stock.dal.model.StockAnalyse;
import stock.dal.model.StockAnalyseExample;

import java.util.List;

public interface StockAnalyseMapper {
    int countByExample(StockAnalyseExample example);

    int deleteByExample(StockAnalyseExample example);

    int deleteByPrimaryKey(String analyseId);

    int insert(StockAnalyse record);

    int insertSelective(StockAnalyse record);

    List<StockAnalyse> selectByExample(StockAnalyseExample example);

    StockAnalyse selectByPrimaryKey(String analyseId);

    int updateByExampleSelective(@Param("record") StockAnalyse record, @Param("example") StockAnalyseExample example);

    int updateByExample(@Param("record") StockAnalyse record, @Param("example") StockAnalyseExample example);

    int updateByPrimaryKeySelective(StockAnalyse record);

    int updateByPrimaryKey(StockAnalyse record);
}