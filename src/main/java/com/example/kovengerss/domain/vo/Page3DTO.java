package com.example.kovengerss.domain.vo;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
public class Page3DTO {
    private Integer startPage;
    private Integer endPage;
    private Integer realEnd;
    private boolean next, prev;
    private Integer total;
    private Criteria3 criteria3;

    public Page3DTO(Criteria3 criteria3, Integer total){
        this.criteria3 = criteria3;
        this.total = total;

        this.endPage = (int)(Math.ceil(criteria3.getPageNum() / (double)criteria3.getAmount())) * criteria3.getAmount();
        this.startPage = this.endPage - 9;
        this.realEnd = (int)Math.ceil(total / (double)criteria3.getAmount());

        if(realEnd < this.endPage){
            this.endPage = realEnd;
        }

        this.prev = this.startPage > 1;
        this.next = this.endPage < realEnd;
    }

}
