package com.arch.pastebin.service;

import com.arch.pastebin.entity.Paste;
import com.arch.pastebin.model.PasteBinRequest;
import com.arch.pastebin.repository.PasteBinRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class PasteBinService {

    @Autowired
    PasteBinRepo pasteBinRepo;

    public void createPaste(PasteBinRequest pasteBinRequest) {
        Paste paste = new Paste();
      //  paste.setId(1);
        paste.setPasteId(String.valueOf(UUID.randomUUID()));
        paste.setContent(pasteBinRequest.getContent());
        paste.setFormat(pasteBinRequest.getFormat());
        paste.setTitle(pasteBinRequest.getTitle());
        paste.setUrl(pasteBinRequest.getUrl());
        paste.setAccessMode(pasteBinRequest.getAccessMode());
        paste.setExpiryTime(paste.getExpiryTime());
        pasteBinRepo.save(paste);
    }

    public Paste getPasteById(Integer pasteId) {
        return pasteBinRepo.findById(pasteId).get();
    }

    public void updatePaste(Integer pasteId,PasteBinRequest pasteBinRequest) {
        Paste paste = pasteBinRepo.findById(pasteId).get();
        paste.setPasteId(String.valueOf(UUID.randomUUID()));
        paste.setContent(pasteBinRequest.getContent());
        paste.setFormat(pasteBinRequest.getFormat());
        paste.setTitle(pasteBinRequest.getTitle());
        paste.setUrl(pasteBinRequest.getUrl());
        paste.setAccessMode(pasteBinRequest.getAccessMode());
        paste.setExpiryTime(paste.getExpiryTime());
        pasteBinRepo.save(paste);
    }

    public void deletePasteById(Integer pasteId) {
        pasteBinRepo.deleteById(pasteId);
    }
}
