package com.stackroute.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Entity;
import javax.persistence.Id;

@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Track {
    @Id
   private int trackId;
   private String trackName;
    private String comments;

}
