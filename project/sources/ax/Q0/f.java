package ax.Q0;

import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import ax.P0.C0894c;
import ax.Q0.f;
import ax.S0.C0968a;
import ax.S0.d0;
import j$.util.Objects;

/* loaded from: classes.dex */
public final class f {
    private final int a;
    private final AudioManager.OnAudioFocusChangeListener b;
    private final Handler c;
    private final C0894c d;
    private final boolean e;
    private final Object f;

    public static final class b {
        private int a;
        private AudioManager.OnAudioFocusChangeListener b;
        private Handler c;
        private C0894c d;
        private boolean e;

        public f a() {
            AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = this.b;
            if (onAudioFocusChangeListener != null) {
                return new f(this.a, onAudioFocusChangeListener, (Handler) C0968a.e(this.c), this.d, this.e);
            }
            throw new IllegalStateException("Can't build an AudioFocusRequestCompat instance without a listener");
        }

        public b b(C0894c c0894c) {
            C0968a.e(c0894c);
            this.d = c0894c;
            return this;
        }

        public b c(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
            C0968a.e(onAudioFocusChangeListener);
            C0968a.e(handler);
            this.b = onAudioFocusChangeListener;
            this.c = handler;
            return this;
        }

        public b d(boolean z) {
            this.e = z;
            return this;
        }

        public b(int i) {
            this.d = C0894c.h;
            this.a = i;
        }

        private b(f fVar) {
            this.a = fVar.e();
            this.b = fVar.f();
            this.c = fVar.d();
            this.d = fVar.b();
            this.e = fVar.g();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class c implements AudioManager.OnAudioFocusChangeListener {
        private final AudioManager.OnAudioFocusChangeListener c0;
        private final Handler q;

        c(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
            this.c0 = onAudioFocusChangeListener;
            this.q = d0.z(handler.getLooper(), null);
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(final int i) {
            d0.j1(this.q, new Runnable() { // from class: ax.Q0.g
                @Override // java.lang.Runnable
                public final void run() {
                    f.c.this.c0.onAudioFocusChange(i);
                }
            });
        }
    }

    f(int i, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler, C0894c c0894c, boolean z) {
        AudioFocusRequest.Builder audioAttributes;
        AudioFocusRequest.Builder willPauseWhenDucked;
        AudioFocusRequest.Builder onAudioFocusChangeListener2;
        AudioFocusRequest build;
        this.a = i;
        this.c = handler;
        this.d = c0894c;
        this.e = z;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 26) {
            this.b = new c(onAudioFocusChangeListener, handler);
        } else {
            this.b = onAudioFocusChangeListener;
        }
        if (i2 < 26) {
            this.f = null;
            return;
        }
        audioAttributes = ax.Q0.a.a(i).setAudioAttributes(c0894c.a().a);
        willPauseWhenDucked = audioAttributes.setWillPauseWhenDucked(z);
        onAudioFocusChangeListener2 = willPauseWhenDucked.setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler);
        build = onAudioFocusChangeListener2.build();
        this.f = build;
    }

    public b a() {
        return new b();
    }

    public C0894c b() {
        return this.d;
    }

    AudioFocusRequest c() {
        return ax.M0.a.a(C0968a.e(this.f));
    }

    public Handler d() {
        return this.c;
    }

    public int e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.a == fVar.a && this.e == fVar.e && Objects.equals(this.b, fVar.b) && Objects.equals(this.c, fVar.c) && Objects.equals(this.d, fVar.d);
    }

    public AudioManager.OnAudioFocusChangeListener f() {
        return this.b;
    }

    public boolean g() {
        return this.e;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), this.b, this.c, this.d, Boolean.valueOf(this.e));
    }
}
