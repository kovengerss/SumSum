package com.example.kovengerss.domain.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;
import org.springframework.web.util.UriComponentsBuilder;

@Component
@Data
@AllArgsConstructor
public class Criteria3 {
    private Integer pageNum;
    private Integer amount;
    private String type;
    private String keyword;

    public Criteria3() {
        this(1, 10);
    }

    public Criteria3(Integer pageNum, Integer amount) {
        this.pageNum = pageNum;
        this.amount = amount;
    }

    public String[] getTypes(){
        return type == null ? new String[]{} : type.split("");
    }

    public String getListLink() {
        UriComponentsBuilder builder = UriComponentsBuilder.fromPath("")
                .queryParam("pageNum", this.pageNum)
                .queryParam("amount", this.amount)
                .queryParam("keyword", this.keyword)
                .queryParam("type", type);

        return builder.toUriString();
    }
}

