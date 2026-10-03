package com.ebook.management.fileuploadservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/files")
public class FileUploadController {

  @GetMapping("/status")
  public ResponseEntity<String> getStatus() {
    return ResponseEntity.ok("File upload service is running");
  }
}
