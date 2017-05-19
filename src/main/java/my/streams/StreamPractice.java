package my.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import my.domain.Person;

/**
 * Created by 212441280 on 5/18/17.
 */
public class StreamPractice {
  public List<String> toUpper(List<String> collection) {
    List<String> returnList = collection.stream().map(e -> e.toUpperCase()).collect(Collectors.toList());
    return returnList;
  }

  public List<String> removeLengthMoreThan4(List<String> collection) {
    return collection.stream().filter(e -> e.length() < 4).collect(Collectors.toList());
  }

  public List<String> mergeListOfList(List<List<String>> collection) {
    return collection.stream().flatMap(a -> a.stream()).collect(Collectors.toList());
  }

  public Person getOldestPerson(List<Person> collection) {
    return collection.stream().max(Comparator.comparing(Person::getAge)).get();
  }

  public Integer sum(List<Integer> numbers) {
    return numbers.stream().reduce(0, (total, number) -> total + number);
  }

  public List<String> getKidNameWhoAreBelow18(List<Person> collection) {
    return collection.stream().filter(p -> p.getAge() < 18).map(p -> p.getName()).collect(Collectors.toList());
  }
}
