package com.springapp.mvc.mapper;

import com.springapp.mvc.domain.Caller;
import com.springapp.mvc.domain.CallerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CallerMapper {
    int countByExample(CallerExample example);

    int deleteByExample(CallerExample example);

    int deleteByPrimaryKey(Integer callerid);

    int insert(Caller record);

    int insertSelective(Caller record);

    List<Caller> selectByExample(CallerExample example);

    Caller selectByPrimaryKey(Integer callerid);

    int updateByExampleSelective(@Param("record") Caller record, @Param("example") CallerExample example);

    int updateByExample(@Param("record") Caller record, @Param("example") CallerExample example);

    int updateByPrimaryKeySelective(Caller record);

    int updateByPrimaryKey(Caller record);
}