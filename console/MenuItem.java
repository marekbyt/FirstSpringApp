package pl.sda.firstspringapp.console;

import lombok.Builder;
import lombok.Data;
import org.springframework.stereotype.Component;
@Data
@Builder
public class MenuItem {
    private String label;
    private Runnable action;


}
