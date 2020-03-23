package de.rs.simgro.productservice.core.util;

import io.vavr.control.Either;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

@ControllerAdvice
public class EitherSupportAdvice implements ResponseBodyAdvice<Either<?, ?>> {

    @Override
    public boolean supports(MethodParameter methodParameter,
                            Class<? extends HttpMessageConverter<?>> aClass) {
        return Either.class.isAssignableFrom(methodParameter.getParameterType());
    }

    @Override
    public Either<?, ?> beforeBodyWrite(Either<?, ?> object,
                                        MethodParameter methodParameter,
                                        MediaType mediaType, Class<? extends HttpMessageConverter<?>> aClass,
                                        ServerHttpRequest serverHttpRequest,
                                        ServerHttpResponse serverHttpResponse) {
        if(object.isLeft()) {
            Object left = object.getLeft();

            if(left instanceof SimgroError) {
                SimgroError err = (SimgroError)left;
                serverHttpResponse.setStatusCode(err.getStatus());
            }

        }

        return object;
    }
}
