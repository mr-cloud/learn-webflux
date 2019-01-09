package uni.akilis.webflux.router;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;
import uni.akilis.webflux.handler.EmployeeHandler;

@Configuration
public class EmployeeRouter {
    @Bean
    public RouterFunction<ServerResponse> route(EmployeeHandler employeeHandler) {
        return RouterFunctions.route(RequestPredicates.GET("/employees/{id}")
                .and(RequestPredicates.accept(MediaType.APPLICATION_JSON)),
                employeeHandler::getEmployeeById);
    }
}
