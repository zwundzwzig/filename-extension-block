package com.filename.extension.block.domain;

import com.filename.extension.block.web.dto.DefaultExtensionResponse;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "default_list")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Data
@AllArgsConstructor
@Builder
public class DefaultExtension {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(unique = true, nullable = false, updatable = false, insertable = false)
  private String name;

  @Column(columnDefinition = "BOOLEAN DEFAULT FALSE")
  private Boolean isChecked;

  public DefaultExtensionResponse toResponse() {
    return DefaultExtensionResponse.builder()
            .name(name)
            .isChecked(isChecked)
            .build();
  }
}
