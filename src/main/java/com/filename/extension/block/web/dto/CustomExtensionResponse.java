package com.filename.extension.block.web.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public record CustomExtensionResponse(@JsonProperty("name") String name) {
}
