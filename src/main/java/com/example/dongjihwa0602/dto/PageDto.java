package com.example.dongjihwa0602.dto;

import lombok.Data;

@Data
public class PageDto {

    private int pageStart;
    private int pageEnd;

    /*이전, 다음 버튼 존재 유무*/
    private boolean next, prev;

    /*행 전체 개수*/
    private int total;

    private Criteria criteria;

    public PageDto(Criteria criteria, int total){
        this.criteria = criteria;
        this.total = total;

        this.pageEnd = (int) (Math.ceil(criteria.getPageNum()/10.0)) * 10;
        this.pageStart = this.pageEnd - 9;
        int realEnd = (int)(Math.ceil(total*1.0 / criteria.getAmount()));

        if(realEnd < pageEnd){
            this.pageEnd = realEnd;
        }

        /*이전 버튼값 초기화*/
        this.prev = this.pageStart > 1;

        /*다음 버튼값 초기화*/
        this.next = this.pageEnd < realEnd;
    }

}
