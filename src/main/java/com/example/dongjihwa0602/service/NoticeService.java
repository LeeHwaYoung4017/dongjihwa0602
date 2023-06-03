package com.example.dongjihwa0602.service;

import com.example.dongjihwa0602.dto.Notice;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoticeService {

    @Autowired
    private NoticeMapper noticeMapper;

    public List<Notice> NoticeList(){
        return noticeRepository.selectAll();
    }

}
