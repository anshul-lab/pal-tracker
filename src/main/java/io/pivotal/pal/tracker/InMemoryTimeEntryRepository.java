package io.pivotal.pal.tracker;

import javax.swing.text.html.HTMLDocument;
import java.sql.Time;
import java.util.*;

public class InMemoryTimeEntryRepository {

    Map<Long, TimeEntry> localMap = new HashMap<Long, TimeEntry>();
    private int count =0;
    public TimeEntry create(TimeEntry timeEntry)
    {
        timeEntry.setId(++count);
        localMap.put(timeEntry.getId(), timeEntry);
        return timeEntry;
    }

    public TimeEntry find(long timeEntryId)
    {
        if(localMap.containsKey(timeEntryId))
        {
            return localMap.get(timeEntryId);
        }
        return null;
    }

    public List<TimeEntry> list() {
        List<TimeEntry> entryList = new ArrayList<TimeEntry>(localMap.values());
        return entryList;
    }

    public TimeEntry update(long id, TimeEntry timeEntry) {
        if(localMap.containsKey(id)) {
            timeEntry.setId(id);
            localMap.put(id, timeEntry);
            return timeEntry;
        }
        return null;
    }

    public void delete(long id) {
        if(localMap.containsKey(id))
        {
            localMap.remove(id);
        }
    }
}
