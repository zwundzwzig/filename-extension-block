package com.filename.extension.block.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DefaultExtensionRepository extends JpaRepository<DefaultExtension, Long> {
  DefaultExtension findByName(String extension);
}
