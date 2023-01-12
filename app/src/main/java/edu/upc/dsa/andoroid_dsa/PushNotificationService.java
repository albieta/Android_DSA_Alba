package edu.upc.dsa.andoroid_dsa;

import android.annotation.SuppressLint;
import android.util.Log;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

@SuppressLint("MissingFirebaseInstanceTokenRefresh")
public class PushNotificationService extends FirebaseMessagingService {
    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        Log.i("AQUI", "AQUIA"+remoteMessage.getMessageId());
        super.onMessageReceived(remoteMessage);
    }
}