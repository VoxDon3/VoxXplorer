/*
 * Decompiled with CFR 0.152.
 */
package com.voxdon.xplorer.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.voxdon.xplorer.receiver.StorageCheckReceiver;

public class BootReceiver
extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        StorageCheckReceiver.b(context, true);
    }
}

