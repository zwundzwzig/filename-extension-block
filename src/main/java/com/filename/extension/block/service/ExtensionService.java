package com.filename.extension.block.service;

import com.filename.extension.block.domain.CustomExtension;
import com.filename.extension.block.domain.CustomExtensionRepository;
import com.filename.extension.block.domain.DefaultExtension;
import com.filename.extension.block.domain.DefaultExtensionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ExtensionService {
  private final CustomExtensionRepository customExtensionRepository;
  private final DefaultExtensionRepository defaultExtensionRepository;

  public void addDefaultExtension(String extension) {
    DefaultExtension defaultExtension = defaultExtensionRepository.findByName(extension);
    defaultExtension.setIsChecked(!defaultExtension.getIsChecked());
    defaultExtensionRepository.save(defaultExtension);
  }

  public void addCustomExtension(String extension) {
    if (extension.isBlank()) throw new RuntimeException("빈칸은 올 수 없어요!");
    if (extension.length() > 20) throw new RuntimeException("확장자 최대 입력 길이는 20자에요!");

    Optional<CustomExtension> customExtension = customExtensionRepository.findByName(extension);
    if (!customExtension.isPresent()) {
      CustomExtension entity = CustomExtension.builder().name(extension).build();
      customExtensionRepository.save(entity);
    } else throw new RuntimeException("이미 추가된 확장자에요");
  }

  public void removeCustomExtension(String extension) {
    Optional<CustomExtension> customExtension = customExtensionRepository.findByName(extension);
    if (customExtension.isPresent()) customExtensionRepository.delete(customExtension.get());
  }
}
