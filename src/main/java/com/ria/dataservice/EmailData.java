package com.ria.dataservice;

import com.opencsv.bean.CsvBindByName;

public class EmailData {
    public EmailData() {
    }

    @CsvBindByName(column = "toEmail")
    private String to;

    @CsvBindByName(column = "ccEmail")
    private String cc;

    @CsvBindByName(column = "bccEmail")
    private String bcc;

    @CsvBindByName(column = "emailSubject")
    private String subject;

    public EmailData(String to, String cc, String bcc, String subject) {
        this.to = to;
        this.cc = cc;
        this.bcc = bcc;
        this.subject = subject;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public String getBcc() {
        return bcc;
    }

    public void setBcc(String bcc) {
        this.bcc = bcc;
    }

    public String getSubject() { return subject; }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "EmailData{" +
                "to='" + to + '\'' +
                ", cc='" + cc + '\'' +
                ", bcc='" + bcc + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }
}
