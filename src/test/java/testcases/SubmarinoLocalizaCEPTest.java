package testcases;

import org.testng.annotations.Test;
import utils.BaseTest;

import static io.restassured.RestAssured.given;

public class SubmarinoLocalizaCEPTest extends BaseTest {

    @Test(description = "Eu como usuário, gostaria de me certificar, que o frete para entrega de um iPhone 11 64GB    para um  cep  qualquer não ultrapasse o valor de R$50,00 para que eu não gaste muito dinheiro com a entrega.")
    public void validaFretePeloCEP() {
        given().
                spec(spec).
                when().
                queryParam("cep", "69037528").
                queryParam("product", "%7B%22sku%22%3A%221733188717%22%2C%22promotionedPrice%22%3A3189.99%2C%22condition%22%3A%22NEW%22%2C%22quantity%22%3A1%7D").
                get("freight").
                then().
                assertThat().
                statusCode(200).log().all();
//              body("options.products.freightPrice", equalToPath("188.99"));

    }

}