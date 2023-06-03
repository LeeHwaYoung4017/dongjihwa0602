package com.example.dongjihwa0602.mapper;


import com.example.dongjihwa0602.dto.Criteria;
import com.example.dongjihwa0602.dto.Notice;

import java.util.List;

public class NoticeMapper {
    List<Notice> getNoticeList(Criteria criteria);

    int noticeTotalCount(Criteria criteria);

    void saveNotice(Notice notice);

    Notice getNoticeOne(String id);
}
