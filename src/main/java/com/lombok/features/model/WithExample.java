package com.lombok.features.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;
import lombok.With;

@AllArgsConstructor
@ToString
@Getter
@With
public class WithExample {
  private final String name;
  private final int age;
  //    @With
  private final double score;
  private String[] tags;
}