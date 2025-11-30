package cloud.cholewa.reporter.lufthansa.api;

import cloud.cholewa.reporter.lufthansa.model.CreateTaskRequest;
import cloud.cholewa.reporter.lufthansa.model.CreatedTaskResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@Slf4j
@RequiredArgsConstructor
@RestController()
@RequestMapping("/lufthansa")
public class LufthansaController {

    @PostMapping("/tasks")
    public Mono<ResponseEntity<CreatedTaskResponse>> createTask(@Valid @RequestBody CreateTaskRequest request) {
        return Mono.just(ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).body(CreatedTaskResponse.builder()
                .description("Not implemented yet")
                .build()))
            .doOnSubscribe(subscription -> log.info("Creating task for Lufthansa"));
    }
}
