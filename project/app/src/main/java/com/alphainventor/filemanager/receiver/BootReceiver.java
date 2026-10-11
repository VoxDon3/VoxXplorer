/*
 * Decompiled with CFR 0.152.
 */
package com.alphainventor.filemanager.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.alphainventor.filemanager.receiver.StorageCheckReceiver;

public class BootReceiver
extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        StorageCheckReceiver.b(context, true);
    }
}

