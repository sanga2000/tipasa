package my.streams;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import my.domain.Person;
import org.junit.Test;

/**
 * Created by 212441280 on 5/18/17.
 */
public class StreamPracticeTest {

  StreamPractice subject = new StreamPractice();

  @Test
  public void transformShouldConvertCollectionElementsToUpperCase() {
    List<String> collection = asList("My", "name", "is", "John", "Doe");
    List<String> expected = asList("MY", "NAME", "IS", "JOHN", "DOE");
    assertThat(subject.toUpper(collection)).hasSameElementsAs(expected);
  }

  @Test
  public void transformShouldFilterCollection() {
    List<String> collection = asList("My", "name", "is", "John", "Doe");
    List<String> expected = asList("My", "is", "Doe");
    assertThat(subject.removeLengthMoreThan4(collection)).hasSameElementsAs(expected);
  }

  @Test
  public void transformShouldFlattenCollection() {
    List<List<String>> collection = asList(asList("Viktor", "Farcic"), asList("John", "Doe", "Third"));
    List<String> expected = asList("Viktor", "Farcic", "John", "Doe", "Third");
    assertThat(subject.mergeListOfList(collection)).hasSameElementsAs(expected);
  }

  @Test
  public void getOldestPersonShouldReturnOldestPerson() {
    Person sara = new Person("Sara", 4);
    Person viktor = new Person("Viktor", 40);
    Person eva = new Person("Eva", 42);
    List<Person> collection = asList(sara, eva, viktor);
    assertThat(subject.getOldestPerson(collection)).isEqualToComparingFieldByField(eva);
  }

  @Test
  public void findSumOfElementsinIntList() {
    List<Integer> numbers = asList(1, 2, 3, 4, 5);
    assertThat(subject.sum(numbers)).isEqualTo(1 + 2 + 3 + 4 + 5);
  }

  @Test
  public void getKidNameWhoAreBelow18() {
    Person sara = new Person("Sara", 4);
    Person viktor = new Person("Viktor", 40);
    Person eva = new Person("Eva", 42);
    Person anna = new Person("Anna", 5);
    List<Person> collection = asList(sara, eva, viktor, anna);
    assertThat(subject.getKidNameWhoAreBelow18(collection)).contains("Sara", "Anna")
        .doesNotContain("Viktor", "Eva");
  }
}
