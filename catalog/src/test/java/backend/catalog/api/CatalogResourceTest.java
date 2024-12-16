package backend.catalog.api;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.BeforeEach;

@QuarkusTest
//@QuarkusTestResource(WiremockResource.class)
class CatalogResourceTest  {
   // @InjectMock
    //CatalogService catalogService;

    @BeforeEach
    void setUp() {

    }
/*
    @Test
    void getAllCountries() {
        when(catalogService.getAllCountries())
                .thenReturn(countryDTOs());

        var response = given()
                .headers(headersFor(MediaType.APPLICATION_JSON))
                .when()
                .get("/countries")
                .then()
                .statusCode(200)
                .extract()
                .body()
                .as(new TypeRef<ResultCollection<CountryDTO>>() {
                });

        assertThat(response.getData(),
                hasItem(hasProperty("name", is("Brazil"))));
    }

    @Test
    void getCountry() {
        when(catalogService.getCountry(2L))
                .thenReturn(brazilCountryDTO());

        var response = given()
                .headers(headersFor(MediaType.APPLICATION_JSON))
                .when()
                .pathParam("id", 2)
                .get("/country/{id}")
                .then()
                .statusCode(200)
                .extract()
                .body()
                .as(new TypeRef<Result<CountryDTO>>() {
                });

        assertEquals("Brazil", response.getData().getName());
    }

    @Test
    void getCountryByName() {
        var name = "Brazil";

        when(catalogService.getCountry(any(NameFilter.class)))
                .thenReturn(brazilCountryDTO());

        Result<CountryDTO> response = given()
                .headers(headersFor(MediaType.APPLICATION_JSON))
                .body(JsonUtils.asJson(NameFilter.builder().name(name).build()))
                .when()
                .post("/country/name")
                .then()
                .statusCode(200)
                .extract()
                .body()
                .as(new TypeRef<Result<CountryDTO>>() {
                });

        assertEquals(name, response.getData().getName());
    }

    @Test
    void getCountryByISOCode() {
        var isoCode = "BR";

        when(catalogService.getCountry(any(CountryISOCodeFilter.class)))
                .thenReturn(brazilCountryDTO());

        Result<CountryDTO> response = given()
                .headers(headersFor(MediaType.APPLICATION_JSON))
                .body(JsonUtils.asJson(CountryISOCodeFilter.builder().isoCode(isoCode).build()))
                .when()
                .post("/country/isocode")
                .then()
                .statusCode(200)
                .extract()
                .body()
                .as(new TypeRef<Result<CountryDTO>>() {
                });

        assertEquals(isoCode, response.getData().getIsoCode());
    }

    @Test
    void getAllCurrencies() {
        when(catalogService.getAllCurrencies())
                .thenReturn(currencyDTOs());

        ResultCollection<CurrencyDTO> response = given()
                .headers(headersFor(MediaType.APPLICATION_JSON))
                .when()
                .get("/currencies")
                .then()
                .statusCode(200)
                .extract()
                .body()
                .as(new TypeRef<ResultCollection<CurrencyDTO>>() {
                });

        assertThat(response.getData(),
                hasItem(hasProperty("name", is("Brazilian Real"))));
    }

    @Test
    void getCurrencyByName() {
        var name = "Brazilian Real";

        when(catalogService.getCurrency(any(NameFilter.class)))
                .thenReturn(brazilCurrencyDTO());

        var response = given()
                .headers(headersFor(MediaType.APPLICATION_JSON))
                .body(JsonUtils.asJson(NameFilter.builder().name(name).build()))
                .when()
                .post("/currency/name")
                .then()
                .statusCode(200)
                .extract()
                .body()
                .as(new TypeRef<Result<CurrencyDTO>>() {
                });

        assertEquals(name, response.getData().getName());
    }

    @Test
    void getCurrency() {
        var id = 2L;

        when(catalogService.getCurrency(id))
                .thenReturn(brazilCurrencyDTO());

        var response = given()
                .headers(headersFor(MediaType.APPLICATION_JSON))
                .when()
                .pathParam("id", id)
                .get("/currency/{id}")
                .then()
                .statusCode(200)
                .extract()
                .body()
                .as(new TypeRef<Result<CurrencyDTO>>() {
                });

        assertEquals(id, response.getData().getId());
    }

    @Test
    void getCurrencyByISOCode() {
        var isoCode = "BRL";

        when(catalogService.getCurrency(any(CurrencyISOCodeFilter.class)))
                .thenReturn(brazilCurrencyDTO());

        Result<CurrencyDTO> response = given()
                .headers(headersFor(MediaType.APPLICATION_JSON))
                .body(JsonUtils.asJson(CurrencyISOCodeFilter.builder().isoCode(isoCode).build()))
                .when()
                .post("/currency/isocode")
                .then()
                .statusCode(200)
                .extract()
                .body()
                .as(new TypeRef<Result<CurrencyDTO>>() {
                });

        assertEquals("BRL", response.getData().getISOCode());
    }

    @Test
    void getAllLineOfBusiness() {
        when(catalogService.getLineOfBusiness())
                .thenReturn(lineOfBusinessDTOs());

        var response = given()
                .headers(headersFor(MediaType.APPLICATION_JSON))
                .when()
                .get("/line-of-businesses")
                .then()
                .statusCode(200)
                .extract()
                .body()
                .as(new TypeRef<ResultCollection<LineOfBusinessDTO>>() {
                });

        assertThat(response.getData(),
                hasItem(hasProperty("name", is("DCI / Small Commercial"))));
    }

    @Test
    void getLineOfBusinessByName() {
        String name = "DCI / Small Commercial";

        when(catalogService.getLineOfBusiness(any(NameFilter.class)))
                .thenReturn(lineOfBusinessDTO());

        var response = given()
                .headers(headersFor(MediaType.APPLICATION_JSON))
                .body(JsonUtils.asJson(NameFilter.builder().name(name).build()))
                .when()
                .post("/line-of-business/name")
                .then()
                .statusCode(200)
                .extract()
                .body()
                .as(new TypeRef<Result<LineOfBusinessDTO>>() {
                });

        assertEquals("DCI / Small Commercial", response.getData().getName());
    }

    @Test
    void getAllMajorLob() {
        when(catalogService.getAllMajorLob())
                .thenReturn(majorLobDTOs());

        var response = given()
                .headers(headersFor(MediaType.APPLICATION_JSON))
                .when()
                .get("/major-lobs")
                .then()
                .statusCode(200)
                .extract()
                .body()
                .as(new TypeRef<ResultCollection<MajorLobDTO>>() {
                });

        assertThat(response.getData(),
                hasItem(hasProperty("name", is("Major LOB 3"))));
    }

    @Test
    void getMajorLobByName() {
        String name = "Major LOB";

        when(catalogService.getMajorLob(any(NameFilter.class)))
                .thenReturn(majorLobDTO());

        var response = given()
                .headers(headersFor(MediaType.APPLICATION_JSON))
                .body(JsonUtils.asJson(NameFilter.builder().name(name).build()))
                .when()
                .post("/major-lob/name")
                .then()
                .statusCode(200)
                .extract()
                .body()
                .as(new TypeRef<Result<MajorLobDTO>>() {
                });

        assertEquals(name, response.getData().getName());
    }

    @Test
    void getAllInsuranceBranch() {
        when(catalogService.getAllInsuranceBranch())
                .thenReturn(insuranceBranchDTOs());

        var response = given()
                .headers(headersFor(MediaType.APPLICATION_JSON))
                .when()
                .get("/insurance-branches")
                .then()
                .statusCode(200)
                .extract()
                .body()
                .as(new TypeRef<ResultCollection<InsuranceBranchDTO>>() {
                });

        assertEquals("PESOAS", response.getData().stream().toList().getFirst().getName());
    }

    @Test
    void getInsuranceBranchByName() {
        String name = "PESOAS";

        when(catalogService.getInsuranceBranch(any(NameFilter.class)))
                .thenReturn(insuranceBranchDTO());

        var response = given()
                .headers(headersFor(MediaType.APPLICATION_JSON))
                .body(JsonUtils.asJson(NameFilter.builder().name(name).build()))
                .when()
                .post("/insurance-branch/name")
                .then()
                .statusCode(200)
                .extract()
                .body()
                .as(new TypeRef<Result<InsuranceBranchDTO>>() {
                });

        assertEquals(name, response.getData().getName());
    }

    @Test
    void getAllBusinessSizes() {
        when(catalogService.getAllBusinessSizes())
                .thenReturn(businessSizeDTOs());

        ResultCollection<BusinessSizeDTO> response = given()
                .headers(headersFor(MediaType.APPLICATION_JSON))
                .when()
                .get("/business-sizes")
                .then()
                .statusCode(200)
                .extract()
                .body()
                .as(new TypeRef<ResultCollection<BusinessSizeDTO>>() {
                });

        assertThat(response.getData(),
                hasItem(hasProperty("name", is("PYME PROPERTY ONLY - PACKAGE"))));
    }

    @Test
    void getBusinessSizeByName() {
        String name = "PYME PROPERTY ONLY - PACKAGE";

        when(catalogService.getBusinessSize(any(NameFilter.class)))
                .thenReturn(businessSizeDTO());

        var response = given()
                .headers(headersFor(MediaType.APPLICATION_JSON))
                .body(JsonUtils.asJson(NameFilter.builder().name(name).build()))
                .when()
                .post("/business-size/name")
                .then()
                .statusCode(200)
                .extract()
                .body()
                .as(new TypeRef<Result<BusinessSizeDTO>>() {
                });

        assertEquals(name, response.getData().getName());
    }

    @Test
    void getAllBusinessTypes() {
        when(catalogService.getAllBusinessTypes())
                .thenReturn(businessTypesDTOs());

        var response = given()
                .headers(headersFor(MediaType.APPLICATION_JSON))
                .when()
                .get("/business-types")
                .then()
                .statusCode(200)
                .extract()
                .body()
                .as(new TypeRef<ResultCollection<BusinessTypeDTO>>() {
                });

        assertThat(response.getData(),
                hasItem(hasProperty("name", is("LINEAS PERSONALES"))));
    }

    @Test
    void getBusinessTypeByName() {
        String name = "CUENTAS LOCALES";

        when(catalogService.getBusinessType(any(NameFilter.class)))
                .thenReturn(businessTypeDTO());

        var response = given()
                .headers(headersFor(MediaType.APPLICATION_JSON))
                .body(JsonUtils.asJson(NameFilter.builder().name(name).build()))
                .when()
                .post("/business-type/name")
                .then()
                .statusCode(200)
                .extract()
                .body()
                .as(new TypeRef<Result<BusinessTypeDTO>>() {
                });

        assertEquals("CUENTAS LOCALES", response.getData().getName());
    }

    @Test
    void getAllPortfolioSegments() {
        when(catalogService.getAllPortfolioSegments())
                .thenReturn(portfolioSegmentsDTOs());

        var response = given()
                .headers(headersFor(MediaType.APPLICATION_JSON))
                .when()
                .get("/portfolio-segments")
                .then()
                .statusCode(200)
                .extract()
                .body()
                .as(new TypeRef<ResultCollection<PortfolioSegmentDTO>>() {
                });

        assertThat(response.getData(),
                hasItem(hasProperty("name", is("Corporate / Middle Market"))));
    }

    @Test
    void getPortfolioSegmentByName() {
        var name = "SME / SMALL";

        when(catalogService.getPortfolioSegment(any(NameFilter.class)))
                .thenReturn(portfolioSegmentDTO());

        Result<PortfolioSegmentDTO> response = given()
                .headers(headersFor(MediaType.APPLICATION_JSON))
                .body(JsonUtils.asJson(NameFilter.builder().name(name).build()))
                .when()
                .post("/portfolio-segment/name")
                .then()
                .statusCode(200)
                .extract()
                .body()
                .as(new TypeRef<Result<PortfolioSegmentDTO>>() {
                });

        assertEquals(name, response.getData().getName());
    }*/
}