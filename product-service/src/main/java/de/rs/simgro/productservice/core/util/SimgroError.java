package de.rs.simgro.productservice.core.util;

import lombok.Builder;
import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
@Builder
public class SimgroError {

    private HttpStatus status;
    private String message;

    public static SimgroError internal(String message) {
        return SimgroError.builder()
                .status(HttpStatus.INTERNAL_SERVER_ERROR)
                .message(message)
                .build();
    }

    public static SimgroError internal() {
        return internal("internal error");
    }


}
