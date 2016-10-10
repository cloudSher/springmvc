package com.springapp.mvc.mapper;

import com.springapp.mvc.domain.MessageResponse;
import com.springapp.mvc.domain.MessageResponseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MessageResponseMapper {
    int countByExample(MessageResponseExample example);

    int deleteByExample(MessageResponseExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MessageResponse record);

    int insertSelective(MessageResponse record);

    List<MessageResponse> selectByExampleWithBLOBs(MessageResponseExample example);

    List<MessageResponse> selectByExample(MessageResponseExample example);

    MessageResponse selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MessageResponse record, @Param("example") MessageResponseExample example);

    int updateByExampleWithBLOBs(@Param("record") MessageResponse record, @Param("example") MessageResponseExample example);

    int updateByExample(@Param("record") MessageResponse record, @Param("example") MessageResponseExample example);

    int updateByPrimaryKeySelective(MessageResponse record);

    int updateByPrimaryKeyWithBLOBs(MessageResponse record);

    int updateByPrimaryKey(MessageResponse record);
}