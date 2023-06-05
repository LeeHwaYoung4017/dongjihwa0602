package com.example.dongjihwa0602.mapper;


import com.example.dongjihwa0602.dto.Criteria;
import com.example.dongjihwa0602.dto.Notice;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface NoticeMapper {

    List<Notice> getNoticeList(Criteria criteria);

    int noticeTotalCount(Criteria criteria);

    void saveNotice(Notice notice);

    List<Notice> getNoticeList();

    int noticeTotalCount();

    Notice getNoticeOne(String id);

}
