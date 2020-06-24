package ru.job4j.inheritance;

public class ReportUsage {
    public static void main(String[] args) {
        JSONReport jsonReport = new JSONReport();
        HtmlReport htmlReport = new HtmlReport();
        String text = htmlReport.generate("name : name", "body : body");
        System.out.println(text);
    }
}