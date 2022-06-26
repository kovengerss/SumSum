package com.example.kovengerss.domain.vo;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
public class Page1DTO {
    private Integer startPage;
    private Integer endPage;
    private Integer realEnd;
    private boolean next, prev;
    private Integer total;
    private Criteria1 criteria1;

    public Page1DTO(Criteria1 criteria1, Integer total){
        this.criteria1 = criteria1;
        this.total = total;

        this.endPage = (int)(Math.ceil(criteria1.getPageNum() / (double)criteria1.getAmount())) * criteria1.getAmount();
        this.startPage = this.endPage - 9;
        this.realEnd = (int)Math.ceil(total / (double)criteria1.getAmount());

        if(realEnd < this.endPage){
            this.endPage = realEnd;
        }

        this.prev = this.startPage > 1;
        this.next = this.endPage < realEnd;
    }

}
