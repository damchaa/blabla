package com.example.app.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@RequiredArgsConstructor
public class Store {
    private int storeId;
    @NonNull
    private String name;
    @NonNull
    private String address;

}
