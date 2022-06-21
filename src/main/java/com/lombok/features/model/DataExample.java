package com.lombok.features.model;

import lombok.Data;

@Data
public class DataExample {
  private final String name;
  private final int age;
  private final double score;
  private String[] tags;
}