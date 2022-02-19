package ru.netology.domain;

public class LikesInfo {
    private int count;
    private boolean canLike;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setCanLike(boolean canLike) {
        this.canLike = canLike;
    }

    public boolean getCanLike() {
        return canLike;
    }


}