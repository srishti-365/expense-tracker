package com.projects.expense_tracker.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Map;

@Data
@AllArgsConstructor
public class MonthlySummaryResponse {

    private int month;
    private int year;
    private BigDecimal totalAmount;
    private Map<String, BigDecimal> byCategory;
}
