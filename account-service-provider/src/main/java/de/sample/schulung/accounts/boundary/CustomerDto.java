package de.sample.schulung.accounts.boundary;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;
import java.util.UUID;

public class CustomerDto {

  @JsonProperty(access = JsonProperty.Access.READ_ONLY)
  private UUID uuid;
  @Size(min = 3, max = 100)
  private String name;
  @JsonProperty("birthdate")
  private LocalDate dateOfBirth;
  private String state;

  public UUID getUuid() {
    return uuid;
  }

  public CustomerDto setUuid(UUID uuid) {
    this.uuid = uuid;
    return this;
  }

  public String getName() {
    return name;
  }

  public CustomerDto setName(String name) {
    this.name = name;
    return this;
  }

  public LocalDate getDateOfBirth() {
    return dateOfBirth;
  }

  public CustomerDto setDateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
    return this;
  }

  public String getState() {
    return state;
  }

  public CustomerDto setState(String state) {
    this.state = state;
    return this;
  }
}
