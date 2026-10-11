package ax.P4;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.text.TextUtils;

/* loaded from: classes.dex */
public class k {
    private static int a(Context context) {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        return runningAppProcessInfo.importance;
    }

    public static MediaDescriptionCompat b(MediaMetadataCompat mediaMetadataCompat) {
        try {
            return mediaMetadataCompat.e();
        } catch (RuntimeException e) {
            MediaDescriptionCompat.d dVar = new MediaDescriptionCompat.d();
            try {
                CharSequence j = mediaMetadataCompat.j("android.media.metadata.DISPLAY_TITLE");
                if (TextUtils.isEmpty(j)) {
                    j = mediaMetadataCompat.j("android.media.metadata.TITLE");
                }
                dVar.i(j);
                ax.Ha.c.h().f().d("METADATA COULD NOT READ BITMAP 1").l(e).h();
            } catch (RuntimeException e2) {
                dVar.i("----");
                ax.Ha.c.h().f().d("METADATA COULD NOT READ BITMAP 2").l(e2).h();
            }
            return dVar.a();
        }
    }

    public static void c(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT < 26) {
            context.startService(intent);
        } else if (a(context) <= 200) {
            context.startService(intent);
        } else {
            intent.putExtra("START_FOREGROUND", true);
            ax.Q.b.m(context, intent);
        }
    }

    public static void d(Context context, Intent intent) {
        if (!b.a()) {
            c(context, intent);
            return;
        }
        try {
            intent.putExtra("START_FOREGROUND", true);
            ax.Q.b.m(context, intent);
        } catch (IllegalStateException e) {
            ax.Ha.c.h().f().b("START FOREGROUND SERVICE ANDROID 12 MUSIC").l(e).g("importance:" + a(context)).h();
            throw e;
        }
    }
}
