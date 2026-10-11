/*
 * Decompiled with CFR 0.152.
 */
package ax.N0;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.PendingIntent;

class b {
    @SuppressLint(value={"MissingPermission"})
    static Notification.MediaStyle a(Notification.MediaStyle mediaStyle, CharSequence charSequence, int n8, PendingIntent pendingIntent, Boolean bl) {
        if (bl.booleanValue()) {
            mediaStyle.setRemotePlaybackInfo(charSequence, n8, pendingIntent);
        }
        return mediaStyle;
    }
}

