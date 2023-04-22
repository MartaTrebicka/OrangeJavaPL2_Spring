package pl.sda.OrangeJavaPL2.configuration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@Data
@Configuration
@ConfigurationProperties(prefix = "welcome-message")
// @Value od data różni się ze dane są niemutowalne
public class WelcomeMessage {


    private String value;
}


//Value jest immutable wersja data. tworzy private final.  zawsze lepiejw rzucać value niż data