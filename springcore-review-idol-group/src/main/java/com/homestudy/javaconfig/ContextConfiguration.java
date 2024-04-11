package com.homestudy.javaconfig;

import com.homestudy.common.IdolGroupDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ContextConfiguration {

    @Bean(name="idolGroup5")
    public IdolGroupDTO getIdolGroup() {

        return new IdolGroupDTO(5, "코요태", 3, "KYT엔터테인먼트", "순정", "태두리", "1998", "", 'N');

    }

}
