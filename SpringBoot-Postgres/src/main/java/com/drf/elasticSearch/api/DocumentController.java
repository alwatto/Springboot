package com.drf.elasticSearch.api;

//import drf.example.demo.model.Person;
//import drf.example.demo.service.PersonService;
import com.drf.elasticSearch.model.document;
import com.drf.elasticSearch.service.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

@RequestMapping("api/v1/Document")
@RestController
public class DocumentController {

    private final DocumentService documentService;

    @Autowired
    public DocumentController(DocumentService documentService) {
        this.documentService = documentService;
    }

    @PostMapping
    public void addDocument(@Valid @NonNull @RequestBody document document) {
        documentService.addDocument(document);
    }

    //@GetMapping
    //public List<document> getAllDocuments() {
        //return documentService.getAllDocuments();
    //}

    @GetMapping("/{id}")
    public document getDocumentById(@PathVariable final String id) {
        return documentService.getDocuemntById(id)
                .orElse(null);
    }

    @DeleteMapping(path = "{id}")
    public void deleteDocumentById(@PathVariable("id") String id){
        documentService.deleteDocument(id);
    }

    @PutMapping(path = "{id}")
    public void updateDocument(@PathVariable("id") String id,@Valid @NonNull @RequestBody document documentToUpdate){
        documentService.updateDocument(id, documentToUpdate);
    }



}
