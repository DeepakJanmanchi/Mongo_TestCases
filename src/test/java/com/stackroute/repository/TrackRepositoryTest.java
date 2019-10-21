package com.stackroute.repository;


import com.stackroute.domain.Track;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@DataJpaTest
public class TrackRepositoryTest {

    @Autowired
    private TrackRepository trackRepository;
    private Track track;

    @Before
    public void setUp()
    {
        track = new Track();
        track.setTrackId(10);
        track.setTrackName("John");

        track.setComments("Jenny");

    }

    @After
    public void tearDown(){

        trackRepository.deleteAll();
    }


    @Test
    public void testSaveTrack(){
        trackRepository.save(track);
        Track fetchTrack = trackRepository.findById(track.getTrackId()).get();
        Assert.assertEquals(1,fetchTrack.getTrackId());
    }

    @Test
    public void testSaveTrackFailure(){
        Track testTrack = new Track(34,"Harry","201");
        trackRepository.save(track);
        Track fetchTrack = trackRepository.findById(track.getTrackId()).get();
        Assert.assertNotSame(testTrack,track);
    }

    @Test
    public void testGetAllTracks(){
        Track u = new Track(10,"Johny","102");
        Track u1 = new Track(11,"Harry","103");
        trackRepository.save(u);
        trackRepository.save(u1);

        List<Track> list = trackRepository.findAll();
        Assert.assertEquals("Johny",list.get(0).getTrackName());




    }


}
