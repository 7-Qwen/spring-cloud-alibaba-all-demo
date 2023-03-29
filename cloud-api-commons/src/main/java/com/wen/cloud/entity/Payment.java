package com.wen.cloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: 7wen
 * @Date: 2023-03-01 18:57
 * @description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Payment {
    private Long id;
    private String serial;
}
