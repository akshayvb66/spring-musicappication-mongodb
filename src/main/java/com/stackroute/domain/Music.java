package com.stackroute.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


/** This is Music class which defines the track object with trackId, trackName
 * and trackComment
 */
@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Music {

    @Id
    private int trackId; //here track id is unique the primary key
    private String trackName;
    private String trackComment;

}
