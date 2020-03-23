package de.rs.simgro.tenantservice.core.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
@AllArgsConstructor
public class SimgroError {
    private HttpStatus status;
    private String message;
}
