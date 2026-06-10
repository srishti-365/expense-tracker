package com.projects.expense_tracker.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
public class ExpenseRequest {

    @NotNull(message = "Amount is required.")
    @Positive(message = "Amount must be greater than zero.")
    private BigDecimal amount;

    @NotBlank(message = "Description is required.")
    private String description;

    @NotNull(message = "Date is required.")
    private LocalDate date;

    @NotNull(message = "Category is required.")
    private Long categoryId;
}
