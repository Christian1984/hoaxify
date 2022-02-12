# TDD

- to create a testclass for integration testing, use the `@RunWith(SpringRunner.class)` annotation
- the `@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)` can be used to run the application at a random port
- the `@ActiveProfile("test")` annotation allows us to run the Spring application in a certain test configuration and configure depencies individually for development and production
- testing method naming can follow one of many approaches and schemes. here we use the schema of `methodName_condition_expectedBehaviour`
- to send an instance of a class to a server endpoint, the `TestRestTemplate` class can be used, which is provided by Spring and can be `@Autowired`
- to assert a test result use `org.assertj.core.api.Assertions.assertThat` to compare the actual test outcome with the expected result. the syntax looks like this: `assertThat(responseEntity.getStatusCode()).isEqualTo(HttpStatus.OK);`

# Lombok

- instead of creating constructors, getters and setters manually, one can just use the `@Data` annotation from lombok to have all that created automatically for all fields of a DTO