package com.byka.humanlibrary.data;

public class SessionHeader {
    private String startDate;
    private String endDate;
    private Integer sequence;
    private Long SessionId;

    public SessionHeader() {
        super();
    }

    public String getStartDate() {
        return startDate.contains(" ") ? startDate.split(" ")[1] : startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate.contains(" ") ? endDate.split(" ")[1] : endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    public Long getSessionId() {
        return SessionId;
    }

    public void setSessionId(Long sessionId) {
        SessionId = sessionId;
    }
}
