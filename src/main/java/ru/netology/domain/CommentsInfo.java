package ru.netology.domain;

public class CommentsInfo {
    private int count;
    private boolean canPost;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setCanPost(boolean canPost) {
        this.canPost = canPost;
    }

    public boolean getCanPost() {
        return canPost;
    }


}