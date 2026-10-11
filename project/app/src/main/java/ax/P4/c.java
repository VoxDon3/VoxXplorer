/*
 * Decompiled with CFR 0.152.
 */
package ax.P4;

import android.app.Notification;
import com.example.android.uamp.MusicService;

public final class c {
    public static /* bridge */ /* synthetic */ void a(MusicService musicService, int n8, Notification notification, int n9) {
        musicService.startForeground(n8, notification, n9);
    }
}

