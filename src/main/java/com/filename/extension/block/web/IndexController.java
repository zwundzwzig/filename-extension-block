package com.filename.extension.block.web;

import com.filename.extension.block.service.IndexService;
import com.filename.extension.block.web.dto.CustomExtensionResponse;
import com.filename.extension.block.web.dto.DefaultExtensionResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class IndexController {
  private final IndexService indexService;

  @GetMapping("")
  public String index(Model model) {
    List<DefaultExtensionResponse> defaultList = indexService.getDefaultExtensionStatus();
    List<CustomExtensionResponse> customList = indexService.getCustomExtensionList();

    model.addAttribute("defaultList", defaultList);
    model.addAttribute("customList", customList);
    model.addAttribute("NumberOfCustom", customList.size());
    return "index";
  }
}
