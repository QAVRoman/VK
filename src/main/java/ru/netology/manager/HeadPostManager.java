package ru.netology.manager;

public class HeadPostManager {
    private PostManager postManager;

    public Post[] search(int ownerId, String domain, String[] query, boolean ownersOnly, int count, int offset) {
        Post[] posts = postManager.getPosts();
        return null;
    }

    public void delete(int ownerId, int postId) {
        Post[] posts = postManager.getPosts();
    }
}
