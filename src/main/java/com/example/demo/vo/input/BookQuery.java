package com.example.demo.vo.input;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.math.BigDecimal;

@Schema(description = "book list query parameters")
@Data
public class BookQuery {
    @Schema(description = "title")
    private String title;
    @Schema(description = "author")
    private String author;
    @Schema(description = "minPrice")
    private BigDecimal minPrice;
    @Schema(description = "maxPrice")
    private BigDecimal maxPrice;
    @Schema(description = "type")
    private Integer type;
}
