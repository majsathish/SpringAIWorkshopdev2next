package com.example.springaioptions;


import jakarta.annotation.Resource;
import org.springframework.ai.transformer.splitter.TokenTextSplitter;
//import org.springframework.ai.vectorstore.VectorStore;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.ApplicationRunner;


@Configurable
public class RagConfig {

    Resource docResource;
/*    ApplicationRunner loadDoc(VectorStore vectorStore){
        return args -> {
        var  reader = new Tika;
        var splitter = TokenTextSplitter.builder().build();
        vectorStore.accept(splitter.apply(reader.get()));
        System.err
        };*/
  //  }
}
