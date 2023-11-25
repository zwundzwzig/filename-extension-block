package com.filename.extension.block.web.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DefaultExtensionResponse {
  private String name;
  private Boolean isChecked;
}
