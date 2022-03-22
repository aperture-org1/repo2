package com.paloaltonetworks.prisma.saas.apps.github.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

import java.time.Instant;

@Value
@Builder
@Jacksonized
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class GitHubRepository {
	@JsonProperty("id")
	long id;


	@JsonProperty("node_id_new")
	String nodeIdNew;

   
	@JsonProperty("node_id")
	String nodeId;

	@JsonProperty("name")
	String name;

	@JsonProperty("full_name")
	String fullName;

	@JsonProperty("private")
	boolean isPrivate;

	@JsonProperty("html_url")
	String htmlUrl;

	@JsonProperty("created_at")
	Instant createdAt;

	@JsonProperty("updated_at")
	Instant updatedAt;
}
