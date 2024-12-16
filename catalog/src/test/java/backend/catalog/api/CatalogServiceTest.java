package backend.catalog.api;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.BeforeEach;



@SuppressWarnings("ALL")
@QuarkusTest
//@TestSecurity(user = "Test User", roles = {SYSTEM})
class CatalogServiceTest {

    @BeforeEach
    void setUO() {

    }

    /*@Test
    void getAllCountries() {

        mockFindAll(countryRepo, countries().stream());

        var country = catalogService.getAllCountries();

        assertThat(country,
                hasItem(hasProperty("name", is("Brazil"))));
    }

    @Test
    void getCountry() {
        mockFindAll(countryRepo, countries().stream());

        var countryId = 2L;
        var countryDTO = catalogService.getCountry(countryId);

        assertEquals(countryId, countryDTO.getId());
    }

    @Test
    void getCountryByName() {
        mockFindAll(countryRepo, countries().stream());

        var name = "Brazil";
        var countryDTO = catalogService.getCountry(NameFilter.builder().name(name).build());

        assertEquals(name, countryDTO.getName());
    }

    @Test
    void getCountryByISOCode() {
        mockFindAll(countryRepo, countries().stream());

        var isoCode = "BR";
        var countryDTO = catalogService.getCountry(CountryISOCodeFilter.builder().isoCode(isoCode).build());

        assertEquals(isoCode, countryDTO.getIsoCode());
    }

    @Test
    void getAllCurrencies() {
        mockFindAll(currencyRepo, currencies().stream());

        var currency = catalogService.getAllCurrencies();

        assertThat(currency,
                hasItem(hasProperty("name", is("Brazilian Real"))));
    }

    @Test
    void getCurrency() {
        mockFindAll(currencyRepo, currencies().stream());

        var currencyId = 1L;
        var currencyDTO = catalogService.getCurrency(currencyId);

        assertEquals("Brazilian Real", currencyDTO.getName());
    }

    @Test
    void getCurrencyByName() {
        mockFindAll(currencyRepo, currencies().stream());

        var name = "Brazilian Real";
        var currencyDTO = catalogService.getCurrency(NameFilter.builder().name(name).build());

        assertEquals(name, currencyDTO.getName());
    }

    @Test
    void getCurrencyByISOCode() {
        mockFindAll(currencyRepo, currencies().stream());

        var isoCode = "BRL";
        var currencyDTO = catalogService.getCurrency(CurrencyISOCodeFilter.builder().isoCode(isoCode).build());

        assertEquals(isoCode, currencyDTO.getISOCode());
    }

    @Test
    void getAllLineOfBusiness() {
        mockFindAll(lineOfBusinessRepo, lineOfBusinesses().stream());

        var lineOfBusiness = catalogService.getLineOfBusiness();


        assertThat(lineOfBusiness,
                hasItem(hasProperty("name", is("DCI / Small Commercial"))));
    }

    @Test
    void getLineOfBusiness() {
        mockFindAll(lineOfBusinessRepo, lineOfBusinesses().stream());

        var name = "DCI / Small Commercial";
        var lineOfBusiness = catalogService.getLineOfBusiness(NameFilter.builder().name(name).build());

        assertEquals(name, lineOfBusiness.getName());
    }

    @Test
    void getAllMajorLob() {
        mockFindAll(lineOfBusinessRepo, majorLobs().stream());

        var majorLobs = catalogService.getAllMajorLob();

        assertThat(majorLobs,
                hasItem(hasProperty("name", is("Major LOB"))));
    }

    @Test
    void getMajorLob() {
        mockFindAll(lineOfBusinessRepo, majorLobs().stream());

        var name = "Major LOB";
        var majorLob = catalogService.getMajorLob(NameFilter.builder().name(name).build());

        assertEquals(name, majorLob.getName());
    }

    @Test
    void getAllInsuranceBranches() {
        mockFindAll(insuranceBranchRepo, insuranceBranches().stream());

        var insuranceBranches = catalogService.getAllInsuranceBranch();

        assertThat(insuranceBranches,
                hasItem(hasProperty("name", is("ROUBO"))));
    }

    @Test
    void getInsuranceBranch() {
        mockFindAll(insuranceBranchRepo, insuranceBranches().stream());

        var name = "PESOAS";
        var insuranceBranch = catalogService.getInsuranceBranch(NameFilter.builder().name(name).build());

        assertEquals(name, insuranceBranch.getName());
    }

    @Test
    void getAllBusinessSizes() {
        mockFindAll(businessSizeRepo, businessSizes().stream());

        var businessSizes = catalogService.getAllBusinessSizes();

        assertThat(businessSizes,
                hasItem(hasProperty("name", is("PYME PROPERTY ONLY - PACKAGE"))));
    }

    @Test
    void getBusinessSize() {
        mockFindAll(businessSizeRepo, businessSizes().stream());

        var name = "JUMBO";
        var businessSize = catalogService.getBusinessSize(NameFilter.builder().name(name).build());

        assertEquals(name, businessSize.getName());
    }

    @Test
    void getAllBusinessTypes() {
        mockFindAll(businessTypeRepo, businessTypes().stream());

        var businessTypes = catalogService.getAllBusinessTypes();


        assertThat(businessTypes,
                hasItem(hasProperty("name", is("CUENTAS LOCALES"))));
    }

    @Test
    void getBusinessType() {
        mockFindAll(businessTypeRepo, businessTypes().stream());

        var name = "CUENTAS LOCALES";
        var businessType = catalogService.getBusinessType(NameFilter.builder().name(name).build());

        assertEquals(name, businessType.getName());
    }

    @Test
    void getAllPortfolioSegments() {
        mockFindAll(portfolioSegmentRepo, portfolioSegments().stream());

        var portfolioSegments = catalogService.getAllPortfolioSegments();

        assertThat(portfolioSegments,
                hasItem(hasProperty("name", is("Corporate / Middle Market"))));
    }

    @Test
    void getPortfolioSegment() {
        mockFindAll(portfolioSegmentRepo, portfolioSegments().stream());

        var name = "SME / SMALL";
        var PortfolioSegment = catalogService.getPortfolioSegment(NameFilter.builder().name(name).build());

        assertEquals(name, PortfolioSegment.getName());
    }*/
}