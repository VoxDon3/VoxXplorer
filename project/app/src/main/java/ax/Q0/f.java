/*
 * Decompiled with CFR 0.152.
 */
package ax.Q0;

import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import ax.Q0.a;
import ax.Q0.d;
import ax.Q0.e;
import ax.Q0.g;
import ax.S0.d0;

public final class f {
    private final int a;
    private final AudioManager.OnAudioFocusChangeListener b;
    private final Handler c;
    private final ax.P0.c d;
    private final boolean e;
    private final Object f;

    f(int n8, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler, ax.P0.c c8, boolean bl) {
        this.a = n8;
        this.c = handler;
        this.d = c8;
        this.e = bl;
        int n9 = Build.VERSION.SDK_INT;
        this.b = n9 < 26 ? new c(onAudioFocusChangeListener, handler) : onAudioFocusChangeListener;
        if (n9 >= 26) {
            this.f = ax.Q0.e.a(ax.Q0.d.a(ax.Q0.c.a(ax.Q0.b.a(ax.Q0.a.a(n8), c8.a().a), bl), onAudioFocusChangeListener, handler));
            return;
        }
        this.f = null;
    }

    public b a() {
        return new b(this);
    }

    public ax.P0.c b() {
        return this.d;
    }

    AudioFocusRequest c() {
        return ax.M0.a.a(ax.S0.a.e(this.f));
    }

    public Handler d() {
        return this.c;
    }

    public int e() {
        return this.a;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof f)) {
            return false;
        }
        object = (f)object;
        return this.a == ((f)object).a && this.e == ((f)object).e && j.Objects.equals((Object)this.b, (Object)((f)object).b) && j.Objects.equals((Object)this.c, (Object)((f)object).c) && j.Objects.equals((Object)this.d, (Object)((f)object).d);
    }

    public AudioManager.OnAudioFocusChangeListener f() {
        return this.b;
    }

    public boolean g() {
        return this.e;
    }

    public int hashCode() {
        return j.Objects.hash((Object[])new Object[]{this.a, this.b, this.c, this.d, this.e});
    }

    public static final class b {
        private int a;
        private AudioManager.OnAudioFocusChangeListener b;
        private Handler c;
        private ax.P0.c d;
        private boolean e;

        public b(int n8) {
            this.d = ax.P0.c.h;
            this.a = n8;
        }

        private b(f f8) {
            this.a = f8.e();
            this.b = f8.f();
            this.c = f8.d();
            this.d = f8.b();
            this.e = f8.g();
        }

        public f a() {
            AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = this.b;
            if (onAudioFocusChangeListener != null) {
                return new f(this.a, onAudioFocusChangeListener, ax.S0.a.e(this.c), this.d, this.e);
            }
            throw new IllegalStateException("Can't build an AudioFocusRequestCompat instance without a listener");
        }

        public b b(ax.P0.c c8) {
            ax.S0.a.e(c8);
            this.d = c8;
            return this;
        }

        public b c(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
            ax.S0.a.e(onAudioFocusChangeListener);
            ax.S0.a.e(handler);
            this.b = onAudioFocusChangeListener;
            this.c = handler;
            return this;
        }

        public b d(boolean bl) {
            this.e = bl;
            return this;
        }
    }

    private static class c
    implements AudioManager.OnAudioFocusChangeListener {
        private final AudioManager.OnAudioFocusChangeListener c0;
        private final Handler q;

        c(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
            this.c0 = onAudioFocusChangeListener;
            this.q = d0.z(handler.getLooper(), null);
        }

        public static /* synthetic */ void a(c c8, int n8) {
            c8.c0.onAudioFocusChange(n8);
        }

        public void onAudioFocusChange(int n8) {
            d0.j1(this.q, new g(this, n8));
        }
    }
}

