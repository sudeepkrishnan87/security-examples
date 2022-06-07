package com.myechexp.security.springbasicsecurity.controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
@ExtendWith(SpringExtension.class)
@WebMvcTest(WelcomeController.class)
public class WelcomeControllerTest {
    @Autowired
    private MockMvc mvc;
    @WithMockUser(value="sudeep")
    @Test
    public void testSecurityWorksFine() throws Exception
    {
    mvc.perform(get("/welcome")).andExpect(status().isOk());
    }                           
}
