/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.exoplayer;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.exoplayer.e;
import androidx.media3.exoplayer.f;
import ax.P0.c;
import ax.Q0.f;
import ax.Q0.m;
import ax.S0.u;
import ax.q7.v;

final class g {
    private final ax.q7.u<AudioManager> a;
    private final Handler b;
    private a c;
    private c d;
    private int e;
    private int f;
    private float g = 1.0f;
    private ax.Q0.f h;
    private boolean i;

    public g(Context context, Looper looper, a a8) {
        this.a = v.a(new f(context));
        this.c = a8;
        this.b = new Handler(looper);
        this.e = 0;
    }

    public static /* synthetic */ AudioManager a(Context context) {
        return m.c(context);
    }

    public static /* synthetic */ void b(g g8, int n8) {
        g8.g(n8);
    }

    private void c() {
        int n8 = this.e;
        if (n8 != 1 && n8 != 0 && this.h != null) {
            m.b(this.a.get(), this.h);
        }
    }

    private static int d(c c8) {
        if (c8 == null) {
            return 0;
        }
        switch (c8.c) {
            default: {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unidentified audio usage: ");
                stringBuilder.append(c8.c);
                u.h("AudioFocusManager", stringBuilder.toString());
                return 0;
            }
            case 16: {
                return 4;
            }
            case 11: {
                if (c8.a == 1) {
                    return 2;
                }
            }
            case 5: 
            case 6: 
            case 7: 
            case 8: 
            case 9: 
            case 10: 
            case 12: 
            case 13: {
                return 3;
            }
            case 3: {
                return 0;
            }
            case 2: 
            case 4: {
                return 2;
            }
            case 1: 
            case 14: {
                return 1;
            }
            case 0: 
        }
        u.h("AudioFocusManager", "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default.");
        return 1;
    }

    private void e(int n8) {
        a a8 = this.c;
        if (a8 != null) {
            a8.d(n8);
        }
    }

    private void g(int n8) {
        if (n8 != -3 && n8 != -2) {
            if (n8 != -1) {
                if (n8 != 1) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Unknown focus change type: ");
                    stringBuilder.append(n8);
                    u.h("AudioFocusManager", stringBuilder.toString());
                    return;
                }
                this.l(2);
                this.e(1);
                return;
            }
            this.e(-1);
            this.c();
            this.l(1);
            return;
        }
        if (n8 != -2 && !this.o()) {
            this.l(4);
            return;
        }
        this.e(0);
        this.l(3);
    }

    private int i() {
        if (this.e == 2) {
            return 1;
        }
        if (this.j() == 1) {
            this.l(2);
            return 1;
        }
        this.l(1);
        return -1;
    }

    private int j() {
        Object object = this.h;
        if (object == null || this.i) {
            object = object == null ? new f.b(this.f) : ((ax.Q0.f)object).a();
            boolean bl = this.o();
            this.h = ((f.b)object).b(ax.S0.a.e(this.d)).d(bl).c(new e(this), this.b).a();
            this.i = false;
        }
        return m.h(this.a.get(), this.h);
    }

    private void l(int n8) {
        if (this.e != n8) {
            this.e = n8;
            float f8 = n8 == 4 ? 0.2f : 1.0f;
            if (this.g != f8) {
                this.g = f8;
                a a8 = this.c;
                if (a8 != null) {
                    a8.c(f8);
                }
            }
        }
    }

    private boolean m(int n8) {
        return n8 != 1 && this.f == 1;
    }

    private boolean o() {
        c c8 = this.d;
        return c8 != null && c8.a == 1;
    }

    public float f() {
        return this.g;
    }

    public void h() {
        this.c = null;
        this.c();
        this.l(0);
    }

    public void k(c c8) {
        if (!j.Objects.equals((Object)this.d, (Object)c8)) {
            boolean bl;
            int n8;
            this.d = c8;
            this.f = n8 = androidx.media3.exoplayer.g.d(c8);
            boolean bl2 = bl = true;
            if (n8 != 1) {
                bl2 = n8 == 0 ? bl : false;
            }
            ax.S0.a.b(bl2, "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.");
        }
    }

    public int n(boolean bl, int n8) {
        if (!this.m(n8)) {
            this.c();
            this.l(0);
            return 1;
        }
        if (bl) {
            return this.i();
        }
        n8 = this.e;
        if (n8 != 1) {
            if (n8 != 3) {
                return 1;
            }
            return 0;
        }
        return -1;
    }

    public static interface a {
        public void c(float var1);

        public void d(int var1);
    }
}

