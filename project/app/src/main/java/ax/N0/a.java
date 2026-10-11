/*
 * Decompiled with CFR 0.152.
 */
package ax.N0;

import android.app.Notification;
import android.media.session.MediaSession;
import android.support.v4.media.session.MediaSessionCompat;

class a {
    static Notification.MediaStyle a() {
        return new Notification.MediaStyle();
    }

    static Notification.MediaStyle b(Notification.MediaStyle mediaStyle, int[] nArray, MediaSessionCompat.Token token) {
        if (nArray != null) {
            a.e(mediaStyle, nArray);
        }
        if (token != null) {
            a.c(mediaStyle, (MediaSession.Token)token.e());
        }
        return mediaStyle;
    }

    static void c(Notification.MediaStyle mediaStyle, MediaSession.Token token) {
        mediaStyle.setMediaSession(token);
    }

    static void d(Notification.Builder builder, Notification.MediaStyle mediaStyle) {
        builder.setStyle((Notification.Style)mediaStyle);
    }

    static void e(Notification.MediaStyle mediaStyle, int ... nArray) {
        mediaStyle.setShowActionsInCompactView(nArray);
    }
}

