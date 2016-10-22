package stock.dal.mapper;

import org.apache.ibatis.annotations.Param;
import stock.dal.model.FeatureRule;
import stock.dal.model.FeatureRuleExample;

import java.util.List;

public interface FeatureRuleMapper {
    int countByExample(FeatureRuleExample example);

    int deleteByExample(FeatureRuleExample example);

    int deleteByPrimaryKey(String ruleId);

    int insert(FeatureRule record);

    int insertSelective(FeatureRule record);

    List<FeatureRule> selectByExample(FeatureRuleExample example);

    FeatureRule selectByPrimaryKey(String ruleId);

    int updateByExampleSelective(@Param("record") FeatureRule record, @Param("example") FeatureRuleExample example);

    int updateByExample(@Param("record") FeatureRule record, @Param("example") FeatureRuleExample example);

    int updateByPrimaryKeySelective(FeatureRule record);

    int updateByPrimaryKey(FeatureRule record);
}