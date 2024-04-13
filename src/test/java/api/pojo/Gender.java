package api.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import lombok.extern.jackson.Jacksonized;
@Value
@Getter
@Builder
@Jacksonized
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Gender {

      @JsonProperty("count")
      int count;
     @JsonProperty("name")
      String name;
     @JsonProperty("gender")
      String gender;
     @JsonProperty("probability")
      float probability;

}
