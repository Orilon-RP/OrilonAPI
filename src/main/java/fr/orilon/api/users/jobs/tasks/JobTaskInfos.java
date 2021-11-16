package fr.orilon.api.users.jobs.tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class JobTaskInfos {
    private JobTask jobTask;
    private final UUID uuid;
    private boolean end;
    private final List<Task> tasks;
    private Task actualTask;

    public JobTaskInfos(JobTask jobTask, UUID uuid) {
        this.jobTask = jobTask;
        this.uuid = uuid;
        this.end = false;
        this.tasks = new ArrayList<>();
        this.actualTask = null;
    }

    public JobTaskInfos(UUID uuid) {
        this(null, uuid);
    }

    public JobTask getJobTask() {
        return jobTask;
    }

    public void setJobTask(JobTask jobTask) {
        this.jobTask = jobTask;
    }

    public UUID getUniqueId() {
        return uuid;
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

    public void setActualTask(Task actualTask) {
        this.actualTask = actualTask;
    }

    public Task getActualTask() {
        return actualTask;
    }
}
