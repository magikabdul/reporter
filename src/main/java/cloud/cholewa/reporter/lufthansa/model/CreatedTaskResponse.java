package cloud.cholewa.reporter.lufthansa.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"category", "description"})
public class CreatedTaskResponse {
    @NotNull
    private TaskCategory category;
    private String description;
}
