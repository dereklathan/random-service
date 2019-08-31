/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.derek.randomservice.rest;

import com.derek.randomservice.rest.response.RandomResponse;
import java.security.SecureRandom;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author derek
 */
@RestController
@RequestMapping("/random")
public class RandomRestController {
    private final SecureRandom secureRandom;
    
    public RandomRestController() {
        secureRandom = new SecureRandom();
    }
    
    @RequestMapping("getRandom")
    public RandomResponse getRandom() {
        RandomResponse response = new RandomResponse();
        response.setRandom(secureRandom.nextInt());
        return response;
    }
}
