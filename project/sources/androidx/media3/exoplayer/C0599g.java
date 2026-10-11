package androidx.media3.exoplayer;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import ax.P0.C0894c;
import ax.Q0.f;
import ax.S0.C0968a;
import ax.S0.C0987u;
import j$.util.Objects;

/* renamed from: androidx.media3.exoplayer.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0599g {
    private final ax.q7.u<AudioManager> a;
    private final Handler b;
    private a c;
    private C0894c d;
    private int f;
    private ax.Q0.f h;
    private boolean i;
    private float g = 1.0f;
    private int e = 0;

    /* renamed from: androidx.media3.exoplayer.g$a */
    public interface a {
        void c(float f);

        void d(int i);
    }

    public C0599g(final Context context, Looper looper, a aVar) {
        this.a = ax.q7.v.a(new ax.q7.u() { // from class: androidx.media3.exoplayer.f
            @Override // ax.q7.u
            public final Object get() {
                AudioManager c;
                c = ax.Q0.m.c(context);
                return c;
            }
        });
        this.c = aVar;
        this.b = new Handler(looper);
    }

    private void c() {
        int i = this.e;
        if (i == 1 || i == 0 || this.h == null) {
            return;
        }
        ax.Q0.m.b(this.a.get(), this.h);
    }

    private static int d(C0894c c0894c) {
        if (c0894c == null) {
            return 0;
        }
        switch (c0894c.c) {
            case 0:
                C0987u.h("AudioFocusManager", "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default.");
                return 1;
            case 1:
            case 14:
                return 1;
            case 2:
            case 4:
                return 2;
            case 3:
                return 0;
            case 11:
                if (c0894c.a == 1) {
                    return 2;
                }
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 12:
            case 13:
                return 3;
            case 15:
            default:
                C0987u.h("AudioFocusManager", "Unidentified audio usage: " + c0894c.c);
                return 0;
            case 16:
                return 4;
        }
    }

    private void e(int i) {
        a aVar = this.c;
        if (aVar != null) {
            aVar.d(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(int i) {
        if (i == -3 || i == -2) {
            if (i != -2 && !o()) {
                l(4);
                return;
            } else {
                e(0);
                l(3);
                return;
            }
        }
        if (i == -1) {
            e(-1);
            c();
            l(1);
        } else if (i == 1) {
            l(2);
            e(1);
        } else {
            C0987u.h("AudioFocusManager", "Unknown focus change type: " + i);
        }
    }

    private int i() {
        if (this.e == 2) {
            return 1;
        }
        if (j() == 1) {
            l(2);
            return 1;
        }
        l(1);
        return -1;
    }

    private int j() {
        ax.Q0.f fVar = this.h;
        if (fVar == null || this.i) {
            this.h = (fVar == null ? new f.b(this.f) : fVar.a()).b((C0894c) C0968a.e(this.d)).d(o()).c(new AudioManager.OnAudioFocusChangeListener() { // from class: androidx.media3.exoplayer.e
                @Override // android.media.AudioManager.OnAudioFocusChangeListener
                public final void onAudioFocusChange(int i) {
                    C0599g.this.g(i);
                }
            }, this.b).a();
            this.i = false;
        }
        return ax.Q0.m.h(this.a.get(), this.h);
    }

    private void l(int i) {
        if (this.e == i) {
            return;
        }
        this.e = i;
        float f = i == 4 ? 0.2f : 1.0f;
        if (this.g == f) {
            return;
        }
        this.g = f;
        a aVar = this.c;
        if (aVar != null) {
            aVar.c(f);
        }
    }

    private boolean m(int i) {
        return i != 1 && this.f == 1;
    }

    private boolean o() {
        C0894c c0894c = this.d;
        return c0894c != null && c0894c.a == 1;
    }

    public float f() {
        return this.g;
    }

    public void h() {
        this.c = null;
        c();
        l(0);
    }

    public void k(C0894c c0894c) {
        if (Objects.equals(this.d, c0894c)) {
            return;
        }
        this.d = c0894c;
        int d = d(c0894c);
        this.f = d;
        boolean z = true;
        if (d != 1 && d != 0) {
            z = false;
        }
        C0968a.b(z, "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.");
    }

    public int n(boolean z, int i) {
        if (!m(i)) {
            c();
            l(0);
            return 1;
        }
        if (z) {
            return i();
        }
        int i2 = this.e;
        if (i2 != 1) {
            return i2 != 3 ? 1 : 0;
        }
        return -1;
    }
}
