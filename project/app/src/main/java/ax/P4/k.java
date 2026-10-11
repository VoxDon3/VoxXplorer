/*
 * Decompiled with CFR 0.152.
 */
package ax.P4;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.text.TextUtils;
import ax.Ha.c;
import ax.P4.b;

public class k {
    private static int a(Context context) {
        context = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState((ActivityManager.RunningAppProcessInfo)context);
        return context.importance;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static MediaDescriptionCompat b(MediaMetadataCompat mediaMetadataCompat) {
        try {
            return mediaMetadataCompat.e();
        }
        catch (RuntimeException runtimeException) {
            RuntimeException runtimeException22;
            MediaDescriptionCompat.d d8;
            block5: {
                CharSequence charSequence;
                block4: {
                    d8 = new MediaDescriptionCompat.d();
                    try {
                        CharSequence charSequence2;
                        charSequence = charSequence2 = mediaMetadataCompat.j("android.media.metadata.DISPLAY_TITLE");
                        if (!TextUtils.isEmpty((CharSequence)charSequence2)) break block4;
                        charSequence = mediaMetadataCompat.j("android.media.metadata.TITLE");
                    }
                    catch (RuntimeException runtimeException22) {
                        break block5;
                    }
                }
                d8.i(charSequence);
                c.h().f().d("METADATA COULD NOT READ BITMAP 1").l(runtimeException).h();
                return d8.a();
            }
            d8.i("----");
            c.h().f().d("METADATA COULD NOT READ BITMAP 2").l(runtimeException22).h();
            return d8.a();
        }
    }

    public static void c(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT >= 26) {
            if (k.a(context) <= 200) {
                context.startService(intent);
                return;
            }
            intent.putExtra("START_FOREGROUND", true);
            ax.Q.b.m(context, intent);
            return;
        }
        context.startService(intent);
    }

    public static void d(Context context, Intent object) {
        if (b.a()) {
            try {
                object.putExtra("START_FOREGROUND", true);
                ax.Q.b.m(context, (Intent)object);
                return;
            }
            catch (IllegalStateException illegalStateException) {
                object = c.h().f().b("START FOREGROUND SERVICE ANDROID 12 MUSIC").l(illegalStateException);
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("importance:");
                stringBuilder.append(k.a(context));
                ((ax.Ha.b)object).g(stringBuilder.toString()).h();
                throw illegalStateException;
            }
        }
        k.c(context, (Intent)object);
    }
}

