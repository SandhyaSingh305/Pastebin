package com.arch.pastebin.repository;

import com.arch.pastebin.entity.Paste;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PasteBinRepo extends CrudRepository<Paste,Integer> {
//    @Query(update Paste )
//    void updatePasteById(Paste paste, String pasteId);
}
