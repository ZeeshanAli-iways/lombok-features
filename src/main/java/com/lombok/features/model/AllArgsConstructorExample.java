package com.lombok.features.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Setter
@Getter
@ToString
public class AllArgsConstructorExample {
  private final String name;
  private final int age;
  private final double score;
  private String[] tags;
}