package guru.springframework.sbmbreweryclient.web.client;

import guru.springframework.sbmbreweryclient.web.model.BeerDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.net.URI;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BreweryClientTest {

    @Autowired
    BreweryClient client;

    @Test
    void test_getBeerById() {
        BeerDto beerDto = client.getBeerById(UUID.randomUUID());

        assertNotNull(beerDto);
    }

    @Test
    void test_saveNewBeer() {
        BeerDto beerDto = BeerDto.builder().build();
        URI uri = client.saveNewBeer(beerDto);

        assertNotNull(uri);
    }
}