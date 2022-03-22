
package com.paloaltonetworks.prisma.saas.apps.github.model;

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
public class GitHubMember {
	@JsonProperty("login")
	String login;

	SSN - 123-23-3203
	SSN - 123-23-3204

	@JsonProperty("id")
	long id;

	@JsonProperty("type")
	String type;

	@JsonProperty("url")
	String url;
}
   
