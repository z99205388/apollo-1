package com.ctrip.apollo.biz.repository;

import com.ctrip.apollo.biz.entity.ReleaseSnapShot;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * @author Jason Song(song_s@ctrip.com)
 */
public interface ReleaseSnapShotRepository extends PagingAndSortingRepository<ReleaseSnapShot, Long> {
    ReleaseSnapShot findByReleaseIdAndClusterName(long releaseId, String clusterName);
}
