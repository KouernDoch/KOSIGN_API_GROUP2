package com.example.firstjpa.ResponseApi;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class ResponsefromApi<T> {
    private T payload;
    private LocalDateTime date;
    private boolean success;
}


