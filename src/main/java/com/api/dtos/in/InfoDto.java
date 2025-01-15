package com.api.dtos.in;

public class InfoDto {
    private int count;
    private int pages;
    private String next;
    private String prev;

    public InfoDto() {}

    public InfoDto(int count, int pages, String next, String prev) {
        this.count = count;
        this.pages = pages;
        this.next = next;
        this.prev = prev;
    }

    public int getCount() {
        return count;
    }

    public int getPages() {
        return pages;
    }

    public String getNext() {
        return next;
    }

    public String getPrev() {
        return prev;
    }
}