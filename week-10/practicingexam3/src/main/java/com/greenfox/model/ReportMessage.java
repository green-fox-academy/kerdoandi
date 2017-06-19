package com.greenfox.model;

import org.springframework.stereotype.Component;

@Component
public class ReportMessage {
  String reportMessage;

  public ReportMessage() {
    reportMessage =  "I feel a great disturbance in the Force";
  }

  public String getReportMessage() {
    return reportMessage;
  }

  public void setReportMessage(String reportMessage) {
    this.reportMessage = reportMessage;
  }
}
