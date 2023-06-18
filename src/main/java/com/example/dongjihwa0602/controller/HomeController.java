package com.example.dongjihwa0602.controller;

import com.example.dongjihwa0602.dto.Criteria;
import com.example.dongjihwa0602.dto.Notice;
import com.example.dongjihwa0602.dto.PageDto;
import com.example.dongjihwa0602.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
public class HomeController {
    // 1. Field injection
    // 2. Setter injection

    // 3. Constructor injection ****
    private final NoticeService noticeService;

    public HomeController (NoticeService noticeService){
        this.noticeService = noticeService;
    }
    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("/location")
    public String location(){
        return "location";
    }

    @RequestMapping("/operationGuide")
    public String operationGuide(){
        return "operationGuide";
    }

    @RequestMapping("/preview")
    public String preview(){
        return "preview";
    }

    @RequestMapping("/managerLogin")
    public String managerLogin(){
        return "managerLogin";
    }

    @GetMapping("/managerHome")
    public String managerHome(Criteria criteria, Model model){
        List<Notice> noticeList = noticeService.getNoticeList(criteria);
        model.addAttribute("notice", noticeList);

        int total = noticeService.noticeTotalCount(criteria);
        PageDto pageDto = new PageDto(criteria, total);
        model.addAttribute("page", pageDto);
        return "managerHome";
    }

}
