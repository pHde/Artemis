package de.tum.in.www1.artemis.web.websocket.dto;

import de.tum.in.www1.artemis.domain.Submission;
import de.tum.in.www1.artemis.domain.User;

public class SubmissionSyncPayload {

    private Submission submission;

    private User sender;

    public SubmissionSyncPayload(Submission submission, User sender) {
        this.submission = submission;
        this.sender = sender;
    }

    public Submission getSubmission() {
        return submission;
    }

    public void setSubmission(Submission submission) {
        this.submission = submission;
    }

    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

}
