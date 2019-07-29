package com.example.servicesactivitydemo;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;


public class MusicService extends Service {
    MediaPlayer mediaPlayer ;

    MusicService(Context context){
        //mediaPlayer = MediaPlayer.create(MusicService.this, R.raw.suits_song);
       // mediaPlayer.start();
    }

    public MusicService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        mediaPlayer = MediaPlayer.create(MusicService.this, R.raw.suits_song);
        mediaPlayer.start();
        return super.onStartCommand(intent, flags, startId);
    }


    @Override
    public void onDestroy() {
        mediaPlayer.stop();
        super.onDestroy();
    }
}
