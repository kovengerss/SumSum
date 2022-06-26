package com.example.kovengerss.domain.vo;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
public class Page2DTO {
    private Integer startPage;
    private Integer endPage;
    private Integer realEnd;
    private boolean next, prev;
    private Integer total;
    private Criteria2 criteria2;

    public Page2DTO(Criteria2 criteria2, Integer total){
        this.criteria2 = criteria2;
        this.total = total;

        this.endPage = (int)(Math.ceil(criteria2.getPageNum() / (double)criteria2.getAmount())) * criteria2.getAmount();
        this.startPage = this.endPage - 9;
        this.realEnd = (int)Math.ceil(total / (double)criteria2.getAmount());

        if(realEnd < this.endPage){
            this.endPage = realEnd;
        }

        this.prev = this.startPage > 1;
        this.next = this.endPage < realEnd;
    }

}
