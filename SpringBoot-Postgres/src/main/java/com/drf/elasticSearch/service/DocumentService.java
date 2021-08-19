package com.drf.elasticSearch.service;

import com.drf.elasticSearch.dao.DocumentDAO;
import com.drf.elasticSearch.model.document;
import com.drf.elasticSearch.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class DocumentService {

    private final DocumentDAO documentDAO;

    @Autowired
    public DocumentService(@Qualifier("fakeDao") DocumentDAO documentDAO) {
        this.documentDAO = documentDAO;
    }

    public int addDocument(final document document){
        return documentDAO.insertDocument(document);

    }
    //public List<document> getAllDocuments() {
        //return documentDAO.selectAllDocuments();
    //}

    public Optional<document> getDocuemntById(String id) {
        return documentDAO.selectDocumentById(id);
    }

    public int deleteDocument(String id){
        return documentDAO.deleteDocument(id);
    }

    public int updateDocument(String id, document newDocument){
        return documentDAO.updateDocument(id, newDocument);
    }
}
