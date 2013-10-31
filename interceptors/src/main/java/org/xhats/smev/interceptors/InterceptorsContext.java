/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.xhats.smev.interceptors;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.xhats.smev.factory.Factory;

/**
 *
 * @author Гаврилов АН
 */
@Configurable
public class InterceptorsContext {

    @Bean
    public Map<String, Factory> messagePool() {
        return Collections.synchronizedMap(new HashMap());
    }
}
