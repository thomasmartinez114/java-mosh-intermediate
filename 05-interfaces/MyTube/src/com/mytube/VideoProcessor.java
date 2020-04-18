package com.mytube;

public class VideoProcessor {
    public void process(Video video) {
        var encoder = new XVideoEncoder();
        encoder.encode(video);

        var database = new VideoDatabase();
        database.store(video);

        var emailService = new EmailService();
        emailService.sendEmail(video.getUser());
    }
}

