package stock.dal.mapper;

import org.apache.ibatis.annotations.Param;
import stock.dal.model.StockFeature;
import stock.dal.model.StockFeatureExample;

import java.util.List;

public interface StockFeatureMapper {
    int countByExample(StockFeatureExample example);

    int deleteByExample(StockFeatureExample example);

    int deleteByPrimaryKey(String featureId);

    int insert(StockFeature record);

    int insertSelective(StockFeature record);

    List<StockFeature> selectByExample(StockFeatureExample example);

    StockFeature selectByPrimaryKey(String featureId);

    int updateByExampleSelective(@Param("record") StockFeature record, @Param("example") StockFeatureExample example);

    int updateByExample(@Param("record") StockFeature record, @Param("example") StockFeatureExample example);

    int updateByPrimaryKeySelective(StockFeature record);

    int updateByPrimaryKey(StockFeature record);
}