package com.example.dongjihwa0602.service;

import com.example.dongjihwa0602.dto.Criteria;
import com.example.dongjihwa0602.dto.Notice;
import com.example.dongjihwa0602.mapper.NoticeMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class NoticeService {

    @Autowired
    private NoticeMapper noticeMapper;

    public List<Notice> getNoticeList(Criteria criteria){
        return noticeMapper.getNoticeList(criteria);
    }

    public int noticeTotalCount(Criteria criteria){
        return noticeMapper.noticeTotalCount(criteria);
    }

    @Transactional
    public void saveNotice(Notice notice){
        noticeMapper.saveNotice(notice);
    }

    public Notice getNoticeOne(String id){
        return noticeMapper.getNoticeOne(id);
    }

    public int getReadNoticeCntCount(String no){
        return noticeMapper.getReadNoticeCntCount(no);
    }

}
