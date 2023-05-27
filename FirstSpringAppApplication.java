package pl.sda.firstspringapp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pl.sda.firstspringapp.console.Header;
import pl.sda.firstspringapp.console.Menu;

@SpringBootApplication
public class FirstSpringAppApplication implements CommandLineRunner {
    private final Header header;

    private final Menu menu;

    public FirstSpringAppApplication(Header header, Menu menu) {
        this.header = header;
        this.menu = menu;
    }

    public static void main(String[] args) {
        SpringApplication.run(FirstSpringAppApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        if (menu != null) {
            header.print();
            menu.print();
        } else {
            System.out.println("Brak menu!");
        }
    }

    // C:\Users\marek\IdeaProjects\pierwszyProjectSpring\firstSpringApp\src\main\java\pl\sda\firstspringapp

}
