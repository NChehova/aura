package com.aura.chhvclb.controller;

import com.aura.chhvclb.config.EclipseLinkJpaConfiguration;
import com.aura.chhvclb.service.UserService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestBuilders.logout;
import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.httpBasic;
import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.user;
import static org.springframework.security.test.web.servlet.setup.SecurityMockMvcConfigurers.springSecurity;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = RegistrationController.class)
@ContextConfiguration(classes = {UserService.class,
        EclipseLinkJpaConfiguration.class,
        BCryptPasswordEncoder.class})
@AutoConfigureMockMvc
public class RegistrationControllerTest {

    private final String URL = "/registration";

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private WebApplicationContext context;

    @Before
    public void setup() {
        mockMvc = MockMvcBuilders
                .webAppContextSetup(context)
                .apply(springSecurity())
                .build();
    }

    @Test
    public void addUserTest() throws Exception {
        mockMvc.perform(get(URL)).andExpect(status().isUnauthorized());
    }

    @Test
    @WithMockUser
    public void getWithMockUser() {
        mockMvc = MockMvcBuilders
                .webAppContextSetup(context)
                .defaultRequest(get(URL).with(user("user").roles("ADMIN")))
                .apply(springSecurity())
                .build();
    }

    @Test
    @WithMockUser
    public void getBasicAuthentication()  throws Exception {
        mockMvc.perform(post(URL)
                .with(httpBasic("user","password")))
                .andExpect(status().isOk());
    }

//    @Test
//    @WithMockUser
//    public void getLogout()  throws Exception {
//        mockMvc.perform(logout())
//                .andExpect(status().isOk());
//    }

}
