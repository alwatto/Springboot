package com.drf.elasticSearch.dao;

import com.drf.elasticSearch.model.document;


import java.util.Optional;

public interface DocumentDAO  {


    int insertDocument(document document);
    //default int insertDocument(document document){
        //UUID id = UUID.randomUUID();
        //return insertDocument(id, document);
    //}

    //List<document> selectAllDocuments();

    Optional<document> selectDocumentById(String id);

    int deleteDocument(String id);

    int updateDocument(String id, document document);

}
