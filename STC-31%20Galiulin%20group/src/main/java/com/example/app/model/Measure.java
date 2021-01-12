package com.example.app.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@RequiredArgsConstructor
public class Measure {
    private int measureId;
    @NonNull
    private String value;
}
