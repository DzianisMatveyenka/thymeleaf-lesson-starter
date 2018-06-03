package com.matveyenka.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Account {

    private Integer number;
    private boolean active;
    private List<AccountType> types = new ArrayList<>();
}
