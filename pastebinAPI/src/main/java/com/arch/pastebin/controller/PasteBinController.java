package com.arch.pastebin.controller;

import com.arch.pastebin.entity.Paste;
import com.arch.pastebin.model.PasteBinRequest;
import com.arch.pastebin.service.PasteBinService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/pastebin/")
public class PasteBinController {

@Autowired
private PasteBinService pasteBinService;

    @PostMapping("/paste")
    public ResponseEntity<Object> createPaste(@RequestBody @Valid PasteBinRequest pasteBinRequest) {
        System.out.println("Pastebin Req"+pasteBinRequest);
        pasteBinService.createPaste(pasteBinRequest);
        return ResponseEntity.status(200).body("Paste Created");
    }

    @GetMapping("/paste/{pasteId}")
    public ResponseEntity<Object> getPaste(@PathVariable Integer pasteId) {
        Paste paste  =pasteBinService.getPasteById(pasteId);
        return ResponseEntity.status(200).body(paste);
    }

    @PutMapping("/paste/{pasteId}")
    public ResponseEntity<Object> updatePasteById(@PathVariable Integer pasteId, @RequestBody PasteBinRequest paste) {
        pasteBinService.updatePaste(pasteId,paste);
        return ResponseEntity.status(200).body("Updated Successfully");
    }

    @DeleteMapping("/paste/{pasteId}")
    public ResponseEntity<Object> deletePaste(@PathVariable Integer pasteId) {
        pasteBinService.deletePasteById(pasteId);
        return ResponseEntity.status(200).body("Deleted");
    }
}

