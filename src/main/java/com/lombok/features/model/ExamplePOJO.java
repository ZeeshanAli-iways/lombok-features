package com.lombok.features.model;

import java.util.Arrays;

public class ExamplePOJO {
  private final String name;
  private int age;
  private double score;
  private String[] tags;

  public ExamplePOJO(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  void setAge(int age) {
    this.age = age;
  }

  public int getAge() {
    return this.age;
  }

  public void setScore(double score) {
    this.score = score;
  }

  public double getScore() {
    return this.score;
  }

  public String[] getTags() {
    return this.tags;
  }

  public void setTags(String[] tags) {
    this.tags = tags;
  }

  @Override
  public String toString() {
    return "ExamplePOJO(" + this.getName() + ", " + this.getAge() + ", " + this.getScore() + ", " + Arrays.deepToString(this.getTags()) + ")";
  }

  protected boolean canEqual(Object other) {
    return other instanceof ExamplePOJO;
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) return true;
    if (!(o instanceof ExamplePOJO)) return false;
    ExamplePOJO other = (ExamplePOJO) o;
    if (!other.canEqual(this)) return false;
    if (this.getName() == null ? other.getName() != null : !this.getName().equals(other.getName())) return false;
    if (this.getAge() != other.getAge()) return false;
    if (Double.compare(this.getScore(), other.getScore()) != 0) return false;
    return Arrays.deepEquals(this.getTags(), other.getTags());
  }

  @Override
  public int hashCode() {
    final int PRIME = 59;
    int result = 1;
    final long temp1 = Double.doubleToLongBits(this.getScore());
    result = (result * PRIME) + (this.getName() == null ? 43 : this.getName().hashCode());
    result = (result * PRIME) + this.getAge();
    result = (result * PRIME) + (int) (temp1 ^ (temp1 >>> 32));
    result = (result * PRIME) + Arrays.deepHashCode(this.getTags());
    return result;
  }
}