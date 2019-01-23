package com.stackroute.repository;
import com.stackroute.domain.Music;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/** This is the music repository to implement the music service
 *
 */
@Repository
public interface MusicRepository extends MongoRepository<Music,Integer> {

    /*It will execute the custom query*/
   // @Query("select p from Music p where p.trackName=?1")
//    List<Music> findByName(String trackName);

}
