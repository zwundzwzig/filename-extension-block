package com.filename.extension.block.web;

import com.filename.extension.block.service.ExtensionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class ApiController {
  private final ExtensionService extensionService;

  @PostMapping("/put-default")
  public ResponseEntity<Void> addDefaultExtension(@RequestParam String extension) {
    extensionService.addDefaultExtension(extension);
    return ResponseEntity.ok().build();
  }

  @PostMapping("/put-custom")
  public ResponseEntity<Void> addCustomExtension(@RequestParam String extension) {
    extensionService.addCustomExtension(extension);
    return ResponseEntity.ok().build();
  }

  @DeleteMapping("/delete-custom")
  public ResponseEntity<Void> removeCustomExtension(@RequestParam String extension) {
    extensionService.removeCustomExtension(extension);
    return ResponseEntity.notFound().build();
  }
}
