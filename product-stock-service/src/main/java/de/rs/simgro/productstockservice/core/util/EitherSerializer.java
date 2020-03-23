package de.rs.simgro.productstockservice.core.util;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import io.vavr.control.Either;
import org.springframework.boot.jackson.JsonComponent;

import java.io.IOException;

@JsonComponent
public class EitherSerializer extends JsonSerializer<Either> {


    @Override
    public void serialize(Either e,
                          JsonGenerator gen,
                          SerializerProvider serializerProvider) throws IOException {

        if(e.isLeft()) {
            gen.writeObject(e.getLeft());
        } else {
            gen.writeObject(e.get());
        }

    }

    @Override
    public Class<Either> handledType() {
        return Either.class;
    }
}