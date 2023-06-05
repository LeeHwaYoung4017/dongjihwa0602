package com.example.dongjihwa0602.controller;

import com.example.dongjihwa0602.dto.Criteria;
import com.example.dongjihwa0602.dto.Notice;
import com.example.dongjihwa0602.dto.PageDto;
import com.example.dongjihwa0602.service.NoticeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class NoticeController {

    @Autowired
    private NoticeService noticeService;

    @GetMapping("/notice")
    public String getNoticeList(Criteria criteria, Model model){

        List<Notice> noticeList = noticeService.getNoticeList(criteria);
        model.addAttribute("notice", noticeList);

        int total = noticeService.noticeTotalCount(criteria);
        PageDto pageDto = new PageDto(criteria, total);
        model.addAttribute("page", pageDto);

        return "notice";
    }

}
