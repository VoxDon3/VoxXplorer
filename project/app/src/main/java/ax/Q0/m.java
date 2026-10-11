/*
 * Decompiled with CFR 0.152.
 */
package ax.Q0;

import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.os.Looper;
import ax.Q0.f;
import ax.Q0.h;
import ax.Q0.i;
import ax.Q0.j;
import ax.Q0.k;
import ax.Q0.l;
import ax.S0.a;
import ax.S0.b;
import ax.S0.u;

public final class m {
    private static AudioManager a;
    private static Context b;

    public static /* synthetic */ void a(Context context, ax.S0.k k8) {
        a = (AudioManager)context.getSystemService("audio");
        k8.f();
    }

    public static int b(AudioManager audioManager, f f8) {
        if (Build.VERSION.SDK_INT >= 26) {
            return i.a(audioManager, f8.c());
        }
        return audioManager.abandonAudioFocus(f8.f());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static AudioManager c(Context context) {
        synchronized (m.class) {
            Throwable throwable2;
            block8: {
                Object object;
                block7: {
                    try {
                        context = context.getApplicationContext();
                        if (b != context) {
                            a = null;
                        }
                        if ((object = a) == null) break block7;
                    }
                    catch (Throwable throwable2) {}
                    return object;
                }
                object = Looper.myLooper();
                if (object == null || object == Looper.getMainLooper()) break block8;
                ax.S0.k k8 = new ax.S0.k();
                object = ax.S0.b.a();
                l l8 = new l(context, k8);
                object.execute(l8);
                k8.b();
                return ax.S0.a.e(a);
            }
            context = (AudioManager)context.getSystemService("audio");
            a = context;
            return (AudioManager)ax.S0.a.e(context);
            throw throwable2;
        }
    }

    public static int d(AudioManager audioManager, int n8) {
        return audioManager.getStreamMaxVolume(n8);
    }

    public static int e(AudioManager audioManager, int n8) {
        if (Build.VERSION.SDK_INT >= 28) {
            return h.a(audioManager, n8);
        }
        return 0;
    }

    public static int f(AudioManager audioManager, int n8) {
        try {
            int n9 = audioManager.getStreamVolume(n8);
            return n9;
        }
        catch (RuntimeException runtimeException) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Could not retrieve stream volume for stream type ");
            stringBuilder.append(n8);
            u.i("AudioManagerCompat", stringBuilder.toString(), runtimeException);
            return audioManager.getStreamMaxVolume(n8);
        }
    }

    public static boolean g(AudioManager audioManager, int n8) {
        if (Build.VERSION.SDK_INT >= 23) {
            return j.a(audioManager, n8);
        }
        return m.f(audioManager, n8) == 0;
    }

    public static int h(AudioManager audioManager, f f8) {
        if (Build.VERSION.SDK_INT >= 26) {
            return k.a(audioManager, f8.c());
        }
        return audioManager.requestAudioFocus(f8.f(), f8.b().b(), f8.e());
    }
}

