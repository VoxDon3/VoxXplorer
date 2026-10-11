package ax.a1;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.os.Build;
import ax.P0.C0894c;
import ax.P0.C0912v;
import ax.S0.C0968a;
import ax.a1.C1288f0;
import ax.a1.C1296l;

/* loaded from: classes.dex */
public final class J implements C1288f0.d {
    private final Context a;
    private Boolean b;

    private static final class a {
        public static C1296l a(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z) {
            boolean isOffloadedPlaybackSupported;
            isOffloadedPlaybackSupported = AudioManager.isOffloadedPlaybackSupported(audioFormat, audioAttributes);
            return !isOffloadedPlaybackSupported ? C1296l.d : new C1296l.b().e(true).g(z).d();
        }
    }

    private static final class b {
        public static C1296l a(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z) {
            int playbackOffloadSupport;
            playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
            if (playbackOffloadSupport == 0) {
                return C1296l.d;
            }
            return new C1296l.b().e(true).f(Build.VERSION.SDK_INT > 32 && playbackOffloadSupport == 2).g(z).d();
        }
    }

    public J(Context context) {
        this.a = context == null ? null : context.getApplicationContext();
    }

    private boolean b(Context context) {
        Boolean bool = this.b;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (context != null) {
            String parameters = ax.Q0.m.c(context).getParameters("offloadVariableRateSupported");
            this.b = Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
        } else {
            this.b = Boolean.FALSE;
        }
        return this.b.booleanValue();
    }

    @Override // ax.a1.C1288f0.d
    public C1296l a(C0912v c0912v, C0894c c0894c) {
        C0968a.e(c0912v);
        C0968a.e(c0894c);
        int i = Build.VERSION.SDK_INT;
        if (i < 29 || c0912v.H == -1) {
            return C1296l.d;
        }
        boolean b2 = b(this.a);
        int f = ax.P0.D.f((String) C0968a.e(c0912v.o), c0912v.k);
        if (f == 0 || i < ax.S0.d0.K(f)) {
            return C1296l.d;
        }
        int M = ax.S0.d0.M(c0912v.G);
        if (M == 0) {
            return C1296l.d;
        }
        try {
            AudioFormat L = ax.S0.d0.L(c0912v.H, M, f);
            return i >= 31 ? b.a(L, c0894c.a().a, b2) : a.a(L, c0894c.a().a, b2);
        } catch (IllegalArgumentException unused) {
            return C1296l.d;
        }
    }
}
