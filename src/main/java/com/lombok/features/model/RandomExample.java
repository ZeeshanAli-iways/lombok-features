package com.lombok.features.model;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;


/**
 * Random Example class to demonstrate random lombok features.
 */
@Setter
@Getter
@ToString
public class RandomExample {
  @NonNull
  private String name;
  private int age;
  private double score;
  @NonNull
  private String[] tags;
}