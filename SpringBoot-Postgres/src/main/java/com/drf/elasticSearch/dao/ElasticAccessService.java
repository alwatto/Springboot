package com.drf.elasticSearch.dao;

import com.drf.elasticSearch.model.document;
import org.springframework.stereotype.Repository;

import java.util.Optional;

//This was a test it does not work!!!!
@Repository("elastic")
public class ElasticAccessService implements DocumentDAO {

    @Override
    public int insertDocument(document document) {
        return 0;
    }

    //@Override
    //public List<document> selectAllDocuments() {
        //return null;
    //}


    @Override
    public Optional<document> selectDocumentById(String id) {
        return Optional.empty();
    }

    @Override
    public int deleteDocument(String id) {
        return 0;
    }

    @Override
    public int updateDocument(String id, document document) {
        return 0;
    }
}
