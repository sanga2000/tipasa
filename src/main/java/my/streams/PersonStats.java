package my.streams;

import java.util.Comparator;
import java.util.List;

import my.domain.Person;

/**
 * Created by 212441280 on 5/19/17.
 */
public final class PersonStats {
  private int count;
  private int maxAge;
  private int minAge;
  private int totalAge;
  private double averageAge;

  private PersonStats(int count, int maxAge, int minAge, int totalAge, double averageAge) {
    this.count = count;
    this.maxAge = maxAge;
    this.minAge = minAge;
    this.totalAge = totalAge;
    this.averageAge = averageAge;
  }

  public static PersonStats getStats(List<Person> persons) {
    Person eldestPerson = persons.stream().max(Comparator.comparing(Person::getAge)).get();
    Person youngestPerson = persons.stream().min(Comparator.comparing(Person::getAge)).get();
    int sum = persons.stream().map(p -> p.getAge()).reduce(0, (total, number) -> total + number).intValue();
    double average = (double) sum / persons.size();
    return new PersonStats(persons.size(), eldestPerson.getAge(), youngestPerson.getAge(), sum, average);
  }

  public int getCount() {
    return count;
  }

  public int getMaxAge() {
    return maxAge;
  }

  public int getMinAge() {
    return minAge;
  }

  public int getTotalAge() {
    return totalAge;
  }

  public double getAverageAge() {
    return averageAge;
  }
}
