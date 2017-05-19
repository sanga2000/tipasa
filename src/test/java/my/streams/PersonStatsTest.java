package my.streams;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import my.domain.Person;
import org.junit.Test;

/**
 * Created by 212441280 on 5/19/17.
 */
public class PersonStatsTest {

  Person sara = new Person("Sara", 4);
  Person viktor = new Person("Viktor", 40);
  Person eva = new Person("Eva", 42);
  List<Person> collection = asList(sara, eva, viktor);

  @Test
  public void getStatsShouldReturnAverageAge() {
    assertThat(PersonStats.getStats(collection).getAverageAge())
        .isEqualTo((double)(4 + 40 + 42) / 3);
  }

  @Test
  public void getStatsShouldReturnNumberOfPeople() {
    assertThat(PersonStats.getStats(collection).getCount())
        .isEqualTo(3);
  }

  @Test
  public void getStatsShouldReturnMaximumAge() {
    assertThat(PersonStats.getStats(collection).getMaxAge())
        .isEqualTo(42);
  }

  @Test
  public void getStatsShouldReturnMinimumAge() {
    assertThat(PersonStats.getStats(collection).getMinAge())
        .isEqualTo(4);
  }

  @Test
  public void getStatsShouldReturnSumOfAllAges() {
    assertThat(PersonStats.getStats(collection).getTotalAge())
        .isEqualTo(40 + 42 + 4);
  }

}
