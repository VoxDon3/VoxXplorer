/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.auth.api.signin;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import ax.H5.v;

@Deprecated
public final class RevocationBoundService
extends Service {
    public IBinder onBind(Intent intent) {
        if (!"com.google.android.gms.auth.api.signin.RevocationBoundService.disconnect".equals(intent.getAction()) && !"com.google.android.gms.auth.api.signin.RevocationBoundService.clearClientState".equals(intent.getAction())) {
            Log.w((String)"RevocationService", (String)"Unknown action sent to RevocationBoundService: ".concat(String.valueOf(intent.getAction())));
            return null;
        }
        if (Log.isLoggable((String)"RevocationService", (int)2)) {
            Log.v((String)"RevocationService", (String)"RevocationBoundService handling ".concat(String.valueOf(intent.getAction())));
        }
        return new v((Context)this);
    }
}

