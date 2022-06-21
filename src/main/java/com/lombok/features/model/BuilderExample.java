package com.lombok.features.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Singular;
import lombok.ToString;

import java.util.List;
import java.util.Map;

@Builder
@ToString
@Getter
public class BuilderExample {
  private final String name;
  private final int age;
  private final double score;
  @Singular("interest")
  private final List<String> interests;
  @Singular("interestScore")
  private final Map<String, Integer> interestScore;
  private String[] tags;
}