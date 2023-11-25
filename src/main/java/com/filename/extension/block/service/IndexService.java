package com.filename.extension.block.service;

import com.filename.extension.block.domain.CustomExtension;
import com.filename.extension.block.domain.CustomExtensionRepository;
import com.filename.extension.block.domain.DefaultExtension;
import com.filename.extension.block.domain.DefaultExtensionRepository;
import com.filename.extension.block.web.dto.CustomExtensionResponse;
import com.filename.extension.block.web.dto.DefaultExtensionResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class IndexService {
  private final DefaultExtensionRepository defaultExtensionRepository;
  private final CustomExtensionRepository customExtensionRepository;

  public List<DefaultExtensionResponse> getDefaultExtensionStatus() {
    return defaultExtensionRepository.findAll().stream()
            .map(DefaultExtension::toResponse)
            .toList();
  }

  public List<CustomExtensionResponse> getCustomExtensionList() {
    return customExtensionRepository.findAll().stream()
            .map(CustomExtension::toResponse)
            .toList();
  }
}
