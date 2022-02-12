package com.hoaxify.hoaxify;

import com.hoaxify.hoaxify.user.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@ActiveProfiles("test")
public class UserControllerTest {
    @Autowired
    TestRestTemplate testRestTemplate;

    @Test
    public void postUser_whenUserIsValid_receiveOk() {
        User user = new User();
        user.setUsername("test-name");
        user.setDisplayName("test_display");
        user.setPassword("P4ssword");

        ResponseEntity<Object> responseEntity = testRestTemplate.postForEntity("/api/v1/users", user, Object.class);

        assertThat(responseEntity.getStatusCode()).isEqualTo(HttpStatus.OK);
    }
}