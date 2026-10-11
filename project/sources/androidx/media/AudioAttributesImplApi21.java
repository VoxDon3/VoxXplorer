package androidx.media;

import android.annotation.SuppressLint;
import android.media.AudioAttributes;
import androidx.media.AudioAttributesImpl;

/* loaded from: classes.dex */
public class AudioAttributesImplApi21 implements AudioAttributesImpl {
    public AudioAttributes a;
    public int b;

    static class a implements AudioAttributesImpl.a {
        final AudioAttributes.Builder a = new AudioAttributes.Builder();

        a() {
        }

        @Override // androidx.media.AudioAttributesImpl.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a h(int i) {
            this.a.setContentType(i);
            return this;
        }

        @Override // androidx.media.AudioAttributesImpl.a
        @SuppressLint({"WrongConstant"})
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a i(int i) {
            if (i == 16) {
                i = 12;
            }
            this.a.setUsage(i);
            return this;
        }

        @Override // androidx.media.AudioAttributesImpl.a
        public AudioAttributesImpl g() {
            return new AudioAttributesImplApi21(this.a.build());
        }
    }

    public AudioAttributesImplApi21() {
        this.b = -1;
    }

    @Override // androidx.media.AudioAttributesImpl
    public int a() {
        int i = this.b;
        return i != -1 ? i : AudioAttributesCompat.c(false, c(), d());
    }

    @Override // androidx.media.AudioAttributesImpl
    public Object b() {
        return this.a;
    }

    public int c() {
        return this.a.getFlags();
    }

    public int d() {
        return this.a.getUsage();
    }

    public boolean equals(Object obj) {
        if (obj instanceof AudioAttributesImplApi21) {
            return this.a.equals(((AudioAttributesImplApi21) obj).a);
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.a;
    }

    AudioAttributesImplApi21(AudioAttributes audioAttributes) {
        this(audioAttributes, -1);
    }

    AudioAttributesImplApi21(AudioAttributes audioAttributes, int i) {
        this.a = audioAttributes;
        this.b = i;
    }
}
