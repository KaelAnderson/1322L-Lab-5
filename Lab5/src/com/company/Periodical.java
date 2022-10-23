package com.company;

public class Periodical extends Item {
 private int issueNum;

    public int getIssueNum() {
        return issueNum;
    }
    public void setIssueNum(int issueNum) {
        this.issueNum = issueNum;
    }
    Periodical(){}
    Periodical(int inputIssueNum, String inputTitle){
        super(inputTitle);
        issueNum = inputIssueNum;
    }

    @Override
    public String getListing() {
        return "Periodical Title - " + getTitle() + "\n" +
                "Issue # - " + issueNum + "";
    }
}
