package com.cjy.cms.dao.mapper;

import com.cjy.cms.dao.model.CmsCategory;
import com.cjy.cms.dao.model.CmsCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmsCategoryMapper {
    int countByExample(CmsCategoryExample example);

    int deleteByExample(CmsCategoryExample example);

    int deleteByPrimaryKey(Integer categoryId);

    int insert(CmsCategory record);

    int insertSelective(CmsCategory record);

    List<CmsCategory> selectByExample(CmsCategoryExample example);

    CmsCategory selectByPrimaryKey(Integer categoryId);

    int updateByExampleSelective(@Param("record") CmsCategory record, @Param("example") CmsCategoryExample example);

    int updateByExample(@Param("record") CmsCategory record, @Param("example") CmsCategoryExample example);

    int updateByPrimaryKeySelective(CmsCategory record);

    int updateByPrimaryKey(CmsCategory record);
}