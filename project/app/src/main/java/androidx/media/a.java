/*
 * Decompiled with CFR 0.152.
 */
package androidx.media;

import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.media.AudioAttributesCompat;

public class a {
    static final AudioAttributesCompat g = new AudioAttributesCompat.a().c(1).a();
    private final int a;
    private final AudioManager.OnAudioFocusChangeListener b;
    private final Handler c;
    private final AudioAttributesCompat d;
    private final boolean e;
    private final Object f;

    a(int n8, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler, AudioAttributesCompat audioAttributesCompat, boolean bl) {
        this.a = n8;
        this.c = handler;
        this.d = audioAttributesCompat;
        this.e = bl;
        int n9 = Build.VERSION.SDK_INT;
        this.b = n9 < 26 && handler.getLooper() != Looper.getMainLooper() ? new c(onAudioFocusChangeListener, handler) : onAudioFocusChangeListener;
        if (n9 >= 26) {
            this.f = androidx.media.a$a.a(n8, this.a(), bl, this.b, handler);
            return;
        }
        this.f = null;
    }

    AudioAttributes a() {
        AudioAttributesCompat audioAttributesCompat = this.d;
        if (audioAttributesCompat != null) {
            return (AudioAttributes)audioAttributesCompat.d();
        }
        return null;
    }

    public AudioAttributesCompat b() {
        return this.d;
    }

    AudioFocusRequest c() {
        return ax.M0.a.a(this.f);
    }

    public int d() {
        return this.a;
    }

    public AudioManager.OnAudioFocusChangeListener e() {
        return this.b;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof a)) {
            return false;
        }
        object = (a)object;
        return this.a == ((a)object).a && this.e == ((a)object).e && ax.b0.b.a(this.b, ((a)object).b) && ax.b0.b.a(this.c, ((a)object).c) && ax.b0.b.a(this.d, ((a)object).d);
    }

    public int hashCode() {
        return ax.b0.b.b(this.a, this.b, this.c, this.d, this.e);
    }

    private static class a {
        static AudioFocusRequest a(int n8, AudioAttributes audioAttributes, boolean bl, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
            return new AudioFocusRequest.Builder(n8).setAudioAttributes(audioAttributes).setWillPauseWhenDucked(bl).setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler).build();
        }
    }

    public static final class b {
        private int a;
        private AudioManager.OnAudioFocusChangeListener b;
        private Handler c;
        private AudioAttributesCompat d = g;
        private boolean e;

        public b(int n8) {
            this.d(n8);
        }

        private static boolean b(int n8) {
            return n8 == 1 || n8 == 2 || n8 == 3 || n8 == 4;
        }

        public a a() {
            if (this.b != null) {
                return new a(this.a, this.b, this.c, this.d, this.e);
            }
            throw new IllegalStateException("Can't build an AudioFocusRequestCompat instance without a listener");
        }

        public b c(AudioAttributesCompat audioAttributesCompat) {
            if (audioAttributesCompat != null) {
                this.d = audioAttributesCompat;
                return this;
            }
            throw new NullPointerException("Illegal null AudioAttributes");
        }

        public b d(int n8) {
            if (androidx.media.a$b.b(n8)) {
                this.a = n8;
                return this;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Illegal audio focus gain type ");
            stringBuilder.append(n8);
            throw new IllegalArgumentException(stringBuilder.toString());
        }

        public b e(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener) {
            return this.f(onAudioFocusChangeListener, new Handler(Looper.getMainLooper()));
        }

        public b f(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
            if (onAudioFocusChangeListener != null) {
                if (handler != null) {
                    this.b = onAudioFocusChangeListener;
                    this.c = handler;
                    return this;
                }
                throw new IllegalArgumentException("Handler must not be null");
            }
            throw new IllegalArgumentException("OnAudioFocusChangeListener must not be null");
        }

        public b g(boolean bl) {
            this.e = bl;
            return this;
        }
    }

    private static class c
    implements Handler.Callback,
    AudioManager.OnAudioFocusChangeListener {
        private final AudioManager.OnAudioFocusChangeListener c0;
        private final Handler q;

        c(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
            this.c0 = onAudioFocusChangeListener;
            this.q = new Handler(handler.getLooper(), (Handler.Callback)this);
        }

        public boolean handleMessage(Message message) {
            if (message.what == 2782386) {
                this.c0.onAudioFocusChange(message.arg1);
                return true;
            }
            return false;
        }

        public void onAudioFocusChange(int n8) {
            Handler handler = this.q;
            handler.sendMessage(Message.obtain((Handler)handler, (int)2782386, (int)n8, (int)0));
        }
    }
}

