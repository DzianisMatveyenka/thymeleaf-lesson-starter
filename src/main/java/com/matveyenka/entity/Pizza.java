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
public class Pizza {

    private String name;
    private boolean thickDough;
    private List<Ingredient> ingredients = new ArrayList<>();
    private Cuisine cuisine;
}
