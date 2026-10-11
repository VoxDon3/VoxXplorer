/*
 * Decompiled with CFR 0.152.
 */
package ax.s3;

import android.app.NotificationChannel;
import android.media.AudioAttributes;
import android.net.Uri;

public final class e {
    public static /* bridge */ /* synthetic */ void a(NotificationChannel notificationChannel, Uri uri, AudioAttributes audioAttributes) {
        notificationChannel.setSound(uri, audioAttributes);
    }
}

