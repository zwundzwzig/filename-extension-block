package com.filename.extension.block.domain;

import com.filename.extension.block.web.dto.CustomExtensionResponse;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "custom_list")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Data
@AllArgsConstructor
@Builder
public class CustomExtension {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(unique = true, nullable = false, updatable = false, length = 20)
  private String name;

  public CustomExtensionResponse toResponse() {
    return new CustomExtensionResponse(name);
  }
}
