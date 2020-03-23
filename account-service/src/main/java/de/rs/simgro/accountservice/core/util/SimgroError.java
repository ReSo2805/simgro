package de.rs.simgro.accountservice.core.util;

import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
public class SimgroError {
    private HttpStatus status;
    private String message;
}
