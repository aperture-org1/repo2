//This is sample Context Listener 

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

@Value
@Builder
@Jacksonized
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContextListener {
   @JsonProperty("id")
   long id;

   @JsonProperty("account")
   Account account;

   @Value
   @Builder
   @Jacksonized
   @JsonInclude(JsonInclude.Include.NON_NULL)
   @JsonIgnoreProperties(ignoreUnknown = true)
   public static class Account {
      @JsonProperty("id")
      long id;

      @JsonProperty("login")
      String login;
   }
}

 
}
