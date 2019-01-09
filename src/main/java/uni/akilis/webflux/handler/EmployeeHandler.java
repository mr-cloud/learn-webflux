package uni.akilis.webflux.handler;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;
import uni.akilis.webflux.pojo.Employee;

@Component
public class EmployeeHandler {
    public Mono<ServerResponse> getEmployeeById(ServerRequest request) {
        return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON)
                .body(BodyInserters.fromObject(new Employee(request.pathVariable("id"), "Leo")));
    }
}
