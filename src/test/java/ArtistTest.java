import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
public class ArtistTest {

    Artist john;


    //Given
    @BeforeEach
    public void setUp() {
         john = new Artist("John");
    }

    @Test
    public void hasName(){
        assertThat(john.getName()).isEqualTo("John");
    }



}
