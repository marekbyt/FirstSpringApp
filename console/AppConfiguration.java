package pl.sda.firstspringapp.console;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class AppConfiguration {

    @Bean
    List<MenuItem> items() {
        return List.of(
                MenuItem.builder()
                        .label("Dodaj adres")
                        .action(() -> {
                        })
                        .build(),
                MenuItem.builder()
                        .label("Wyszukaj")
                        .action(() -> {
                        })
                        .build(),
                MenuItem.builder()
                        .label("Koniec")
                        .action(() -> {
                        })
                        .build()

        );

    }

    @Bean
    List<MenuItem> MenuItem() {
        return null;
    }
}
