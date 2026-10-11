package ax.Q0;

import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.os.Looper;
import ax.S0.C0968a;
import ax.S0.C0969b;
import ax.S0.C0978k;
import ax.S0.C0987u;

/* loaded from: classes.dex */
public final class m {
    private static AudioManager a;
    private static Context b;

    public static /* synthetic */ void a(Context context, C0978k c0978k) {
        a = (AudioManager) context.getSystemService("audio");
        c0978k.f();
    }

    public static int b(AudioManager audioManager, f fVar) {
        int abandonAudioFocusRequest;
        if (Build.VERSION.SDK_INT < 26) {
            return audioManager.abandonAudioFocus(fVar.f());
        }
        abandonAudioFocusRequest = audioManager.abandonAudioFocusRequest(fVar.c());
        return abandonAudioFocusRequest;
    }

    public static synchronized AudioManager c(Context context) {
        synchronized (m.class) {
            try {
                final Context applicationContext = context.getApplicationContext();
                if (b != applicationContext) {
                    a = null;
                }
                AudioManager audioManager = a;
                if (audioManager != null) {
                    return audioManager;
                }
                Looper myLooper = Looper.myLooper();
                if (myLooper != null && myLooper != Looper.getMainLooper()) {
                    final C0978k c0978k = new C0978k();
                    C0969b.a().execute(new Runnable() { // from class: ax.Q0.l
                        @Override // java.lang.Runnable
                        public final void run() {
                            m.a(applicationContext, c0978k);
                        }
                    });
                    c0978k.b();
                    return (AudioManager) C0968a.e(a);
                }
                AudioManager audioManager2 = (AudioManager) applicationContext.getSystemService("audio");
                a = audioManager2;
                return (AudioManager) C0968a.e(audioManager2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static int d(AudioManager audioManager, int i) {
        return audioManager.getStreamMaxVolume(i);
    }

    public static int e(AudioManager audioManager, int i) {
        int streamMinVolume;
        if (Build.VERSION.SDK_INT < 28) {
            return 0;
        }
        streamMinVolume = audioManager.getStreamMinVolume(i);
        return streamMinVolume;
    }

    public static int f(AudioManager audioManager, int i) {
        try {
            return audioManager.getStreamVolume(i);
        } catch (RuntimeException e) {
            C0987u.i("AudioManagerCompat", "Could not retrieve stream volume for stream type " + i, e);
            return audioManager.getStreamMaxVolume(i);
        }
    }

    public static boolean g(AudioManager audioManager, int i) {
        boolean isStreamMute;
        if (Build.VERSION.SDK_INT < 23) {
            return f(audioManager, i) == 0;
        }
        isStreamMute = audioManager.isStreamMute(i);
        return isStreamMute;
    }

    public static int h(AudioManager audioManager, f fVar) {
        int requestAudioFocus;
        if (Build.VERSION.SDK_INT < 26) {
            return audioManager.requestAudioFocus(fVar.f(), fVar.b().b(), fVar.e());
        }
        requestAudioFocus = audioManager.requestAudioFocus(fVar.c());
        return requestAudioFocus;
    }
}
