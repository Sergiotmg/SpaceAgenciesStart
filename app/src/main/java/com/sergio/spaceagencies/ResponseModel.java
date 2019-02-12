package com.sergio.spaceagencies;

import java.util.List;

public class ResponseModel {
    public List<Agencies> getAgencies() {
        return agencies;
    }

    public void setAgencies(List<Agencies> agencies) {
        this.agencies = agencies;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    private List<Agencies> agencies;
    private int total;
    private int count;
    private int offset;

    public ResponseModel(List<Agencies> agencies) {
        this.agencies = agencies;
    }
}
