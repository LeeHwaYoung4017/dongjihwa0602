package com.example.dongjihwa0602.controller;

import com.example.dongjihwa0602.dto.Criteria;
import com.example.dongjihwa0602.dto.Notice;
import com.example.dongjihwa0602.dto.PageDto;
import com.example.dongjihwa0602.mapper.NoticeMapper;
import com.example.dongjihwa0602.service.NoticeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.SimpleTimeZone;

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

    @GetMapping("/readNotice/{no}")
    public String readNotice(@PathVariable("no") String no, Model model){
        Notice notice = noticeService.getNoticeOne(no);
        noticeService.getReadNoticeCntCount(no);
        model.addAttribute("notice",notice);

        return "readNotice";
    }

    @PostMapping("/saveNotice")
    public String saveNotice(@RequestBody Notice notice){
        noticeService.saveNotice(notice);
        return "createNotice";
    }

    @RequestMapping("/createNotice")
    public String createNotice(){
        return "createNotice";
    }

}
