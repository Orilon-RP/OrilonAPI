package fr.orilon.api.users.jobs.tasks;

import java.util.ArrayList;
import java.util.List;

public class JobTaskInfos {
    private JobTask jobTask;
    private boolean end;
    private final List<Task> tasks;

    public JobTaskInfos(JobTask jobTask) {
        this.jobTask = jobTask;
        this.end = false;
        this.tasks = new ArrayList<>();
    }

    public JobTaskInfos() {
        this(null);
    }

    public JobTask getJobTask() {
        return jobTask;
    }

    public void setJobTask(JobTask jobTask) {
        this.jobTask = jobTask;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public boolean isEnd() {
        return end;
    }

    public void setEnd(boolean end) {
        this.end = end;
    }
}
