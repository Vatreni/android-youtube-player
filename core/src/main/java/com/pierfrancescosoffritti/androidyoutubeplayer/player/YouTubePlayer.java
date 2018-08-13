package com.pierfrancescosoffritti.androidyoutubeplayer.player;

import android.support.annotation.NonNull;

import com.pierfrancescosoffritti.androidyoutubeplayer.player.listeners.YouTubePlayerListener;

public interface YouTubePlayer {
    /**
     * Loads and automatically plays the specified video.
     * @param videoId id of the video
     * @param startSeconds the time from which the video should start playing
     */
    void loadVideo(@NonNull final String videoId, final float startSeconds);

    /**
     * Loads and automatically plays the specified video.
     * @param videoId id of the video
     * @param startSeconds the time from which the video should start playing
     * @param quality the quality of video
     */
    void loadVideo(@NonNull final String videoId, final float startSeconds,String quality);

    /**
     * Loads the specified video's thumbnail and prepares the player to play the video. Does not automatically play the video.
     * @param videoId id of the video
     * @param startSeconds the time from which the video should start playing
     */
    void cueVideo(@NonNull final String videoId, final float startSeconds);

    void play();
    void pause();

    /**
     * @param volumePercent Integer between 0 and 100
     */
    void setVolume(final int volumePercent);

    /**
     *
     * @param time The absolute time in seconds to seek to
     */
    void seekTo(final float time);

    boolean addListener(@NonNull YouTubePlayerListener listener);
    boolean removeListener(@NonNull YouTubePlayerListener listener);
}
