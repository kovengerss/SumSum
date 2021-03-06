package com.example.kovengerss.domain.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReplyPageDTO {
    private List<ReplyDTO> list;
    private int total;
}
