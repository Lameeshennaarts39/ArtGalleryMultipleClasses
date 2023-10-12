import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CustomerTest {

    Customer mike;

// Given
@BeforeEach
public void setUp(){
mike = new Customer("Mike", 100);

}

@Test
public void getName(){
// When || Then
assertThat(mike.getName()).isEqualTo("Mike");

}
@Test
    public void getWallet() {
//    When || Then
    assertThat(mike.getWallet()).isEqualTo(100);
}

} //last curly brackets
