package io.pivotal.pal.tracker;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;

import java.util.List;
@Configuration
public interface TimeEntryRepository {
    TimeEntry create(TimeEntry timeEntry);
    TimeEntry find(long id);
    List<TimeEntry> list();
    TimeEntry update(long id, TimeEntry timeEntry);
    void delete(long id);
}
