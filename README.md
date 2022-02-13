# TDD

- to create a testclass for integration testing, use the `@RunWith(SpringRunner.class)` annotation
- the `@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)` can be used to run the application at a random port
- the `@ActiveProfile("test")` annotation allows us to run the Spring application in a certain test configuration and configure depencies individually for development and production
- testing method naming can follow one of many approaches and schemes. here we use the schema of `methodName_condition_expectedBehaviour`
- to send an instance of a class to a server endpoint, the `TestRestTemplate` class can be used, which is provided by Spring and can be `@Autowired`
- to assert a test result use `org.assertj.core.api.Assertions.assertThat` to compare the actual test outcome with the expected result. the syntax looks like this: `assertThat(responseEntity.getStatusCode()).isEqualTo(HttpStatus.OK);`
- the advantage of *constructor injection* (as in `UserService`) over *field injection* (via `@Autowired` as in `UserController`) is that we can still create instances of a class ourselves during testing.
- with `@FixMethodOrder(MethodSorters.NAME_ASCENDING)` the test class can be forced to run the tests in a predefined order. this can be beneficial in some scenarios, but may lead to hiding problems in our test code (as unwanted dependencies of individual tests)
- a `cleanup()` method can be added to a testclass to clean the database before each test by adding it to the class with the `@Before` annotation

# Lombok

- instead of creating constructors, getters and setters manually, one can just use the `@Data` annotation from lombok to have all that created automatically for all fields of a DTO