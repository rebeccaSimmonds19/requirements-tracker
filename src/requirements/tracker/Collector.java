package requirements.tracker;
import onespot.pivotal.api.PivotalTracker;
import onespot.pivotal.api.resources.Story;

import java.time.LocalDate;
import java.util.List;

import static onespot.pivotal.api.resources.Story.StoryFieldNames.accepted_at;
import static onespot.pivotal.api.resources.Story.StoryFieldNames.estimate;
import static onespot.pivotal.api.resources.Story.StoryFieldNames.owners;

public class Collector {

    private int PROJECT_ID = 2352861;
    private String PIVOTAL_API_TOKEN = "e5961bd616a2a81f6bdefa2cb71558b7";
    public void connect()
    {
        PivotalTracker pivotalTracker = new PivotalTracker(PIVOTAL_API_TOKEN);

        List<Story> stories = pivotalTracker.projects().id(PROJECT_ID)
                .stories()
                //.withFields(owners)
               // .acceptedAfter(now().minusDays(20))
                .getAll();

        stories.forEach((s) -> {
            //System.out.println(s.getName())
            System.out.println(s.getLabels().get(0).name);
        });
    }
}
