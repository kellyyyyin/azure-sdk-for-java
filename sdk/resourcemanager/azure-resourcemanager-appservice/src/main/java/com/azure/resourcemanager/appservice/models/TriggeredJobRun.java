// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Triggered Web Job Run Information. */
@Fluent
public final class TriggeredJobRun {
    /*
     * Job ID.
     */
    @JsonProperty(value = "web_job_id")
    private String webJobId;

    /*
     * Job name.
     */
    @JsonProperty(value = "web_job_name")
    private String webJobName;

    /*
     * Job status.
     */
    @JsonProperty(value = "status")
    private TriggeredWebJobStatus status;

    /*
     * Start time.
     */
    @JsonProperty(value = "start_time")
    private OffsetDateTime startTime;

    /*
     * End time.
     */
    @JsonProperty(value = "end_time")
    private OffsetDateTime endTime;

    /*
     * Job duration.
     */
    @JsonProperty(value = "duration")
    private String duration;

    /*
     * Output URL.
     */
    @JsonProperty(value = "output_url")
    private String outputUrl;

    /*
     * Error URL.
     */
    @JsonProperty(value = "error_url")
    private String errorUrl;

    /*
     * Job URL.
     */
    @JsonProperty(value = "url")
    private String url;

    /*
     * Job name.
     */
    @JsonProperty(value = "job_name")
    private String jobName;

    /*
     * Job trigger.
     */
    @JsonProperty(value = "trigger")
    private String trigger;

    /** Creates an instance of TriggeredJobRun class. */
    public TriggeredJobRun() {
    }

    /**
     * Get the webJobId property: Job ID.
     *
     * @return the webJobId value.
     */
    public String webJobId() {
        return this.webJobId;
    }

    /**
     * Set the webJobId property: Job ID.
     *
     * @param webJobId the webJobId value to set.
     * @return the TriggeredJobRun object itself.
     */
    public TriggeredJobRun withWebJobId(String webJobId) {
        this.webJobId = webJobId;
        return this;
    }

    /**
     * Get the webJobName property: Job name.
     *
     * @return the webJobName value.
     */
    public String webJobName() {
        return this.webJobName;
    }

    /**
     * Set the webJobName property: Job name.
     *
     * @param webJobName the webJobName value to set.
     * @return the TriggeredJobRun object itself.
     */
    public TriggeredJobRun withWebJobName(String webJobName) {
        this.webJobName = webJobName;
        return this;
    }

    /**
     * Get the status property: Job status.
     *
     * @return the status value.
     */
    public TriggeredWebJobStatus status() {
        return this.status;
    }

    /**
     * Set the status property: Job status.
     *
     * @param status the status value to set.
     * @return the TriggeredJobRun object itself.
     */
    public TriggeredJobRun withStatus(TriggeredWebJobStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the startTime property: Start time.
     *
     * @return the startTime value.
     */
    public OffsetDateTime startTime() {
        return this.startTime;
    }

    /**
     * Set the startTime property: Start time.
     *
     * @param startTime the startTime value to set.
     * @return the TriggeredJobRun object itself.
     */
    public TriggeredJobRun withStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get the endTime property: End time.
     *
     * @return the endTime value.
     */
    public OffsetDateTime endTime() {
        return this.endTime;
    }

    /**
     * Set the endTime property: End time.
     *
     * @param endTime the endTime value to set.
     * @return the TriggeredJobRun object itself.
     */
    public TriggeredJobRun withEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Get the duration property: Job duration.
     *
     * @return the duration value.
     */
    public String duration() {
        return this.duration;
    }

    /**
     * Set the duration property: Job duration.
     *
     * @param duration the duration value to set.
     * @return the TriggeredJobRun object itself.
     */
    public TriggeredJobRun withDuration(String duration) {
        this.duration = duration;
        return this;
    }

    /**
     * Get the outputUrl property: Output URL.
     *
     * @return the outputUrl value.
     */
    public String outputUrl() {
        return this.outputUrl;
    }

    /**
     * Set the outputUrl property: Output URL.
     *
     * @param outputUrl the outputUrl value to set.
     * @return the TriggeredJobRun object itself.
     */
    public TriggeredJobRun withOutputUrl(String outputUrl) {
        this.outputUrl = outputUrl;
        return this;
    }

    /**
     * Get the errorUrl property: Error URL.
     *
     * @return the errorUrl value.
     */
    public String errorUrl() {
        return this.errorUrl;
    }

    /**
     * Set the errorUrl property: Error URL.
     *
     * @param errorUrl the errorUrl value to set.
     * @return the TriggeredJobRun object itself.
     */
    public TriggeredJobRun withErrorUrl(String errorUrl) {
        this.errorUrl = errorUrl;
        return this;
    }

    /**
     * Get the url property: Job URL.
     *
     * @return the url value.
     */
    public String url() {
        return this.url;
    }

    /**
     * Set the url property: Job URL.
     *
     * @param url the url value to set.
     * @return the TriggeredJobRun object itself.
     */
    public TriggeredJobRun withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * Get the jobName property: Job name.
     *
     * @return the jobName value.
     */
    public String jobName() {
        return this.jobName;
    }

    /**
     * Set the jobName property: Job name.
     *
     * @param jobName the jobName value to set.
     * @return the TriggeredJobRun object itself.
     */
    public TriggeredJobRun withJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }

    /**
     * Get the trigger property: Job trigger.
     *
     * @return the trigger value.
     */
    public String trigger() {
        return this.trigger;
    }

    /**
     * Set the trigger property: Job trigger.
     *
     * @param trigger the trigger value to set.
     * @return the TriggeredJobRun object itself.
     */
    public TriggeredJobRun withTrigger(String trigger) {
        this.trigger = trigger;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
