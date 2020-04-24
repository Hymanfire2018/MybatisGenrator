package com.sinosoft.cbs.bill.dao;

import com.sinosoft.cloud.batch.vo.TLogs;
import com.sinosoft.cloud.batch.vo.TLogsQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TLogsMapper {
    int countByExample(TLogsQuery example);

    int deleteByExample(TLogsQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(TLogs record);

    int insertSelective(TLogs record);

    List<TLogs> selectByExample(TLogsQuery example);

    TLogs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TLogs record, @Param("example") TLogsQuery example);

    int updateByExample(@Param("record") TLogs record, @Param("example") TLogsQuery example);

    int updateByPrimaryKeySelective(TLogs record);

    int updateByPrimaryKey(TLogs record);
}