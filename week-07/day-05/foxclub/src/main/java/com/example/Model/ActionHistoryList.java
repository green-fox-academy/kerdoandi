package com.example.Model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ActionHistoryList {
  List<ActionHistory> actionHistoryList;

  public ActionHistoryList() {
    actionHistoryList = new ArrayList<>();
  }

  public List<ActionHistory> getActionHistoryList() {
    return actionHistoryList;
  }

  public void setActionHistoryList(List<ActionHistory> actionHistoryList) {
    this.actionHistoryList = actionHistoryList;
  }

  public void addActions(ActionHistory actionHistory) {
    actionHistoryList.add(actionHistory);
  }

  public List<ActionHistory> getLatestactions () {
    List<ActionHistory> latestActionList = new ArrayList<>();
    if (actionHistoryList.size() < 5) {
      return null;
    } else {
      for (int i = actionHistoryList.size() - 1; i > actionHistoryList.size() - 6; i--) {
        latestActionList.add(actionHistoryList.get(i));
      }
      return latestActionList;
    }
  }
}
