package com.springapp.mvc.mapper;

import com.springapp.mvc.domain.PushLog;
import com.springapp.mvc.domain.PushLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PushLogMapper {
    int countByExample(PushLogExample example);

    int deleteByExample(PushLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PushLog record);

    int insertSelective(PushLog record);

    List<PushLog> selectByExample(PushLogExample example);

    PushLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PushLog record, @Param("example") PushLogExample example);

    int updateByExample(@Param("record") PushLog record, @Param("example") PushLogExample example);

    int updateByPrimaryKeySelective(PushLog record);

    int updateByPrimaryKey(PushLog record);
}