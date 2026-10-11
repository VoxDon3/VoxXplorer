/*
 * Decompiled with CFR 0.152.
 */
package androidx.media;

import android.annotation.SuppressLint;
import android.media.AudioAttributes;
import androidx.media.AudioAttributesCompat;
import androidx.media.AudioAttributesImpl;

public class AudioAttributesImplApi21
implements AudioAttributesImpl {
    public AudioAttributes a;
    public int b;

    public AudioAttributesImplApi21() {
        this.b = -1;
    }

    AudioAttributesImplApi21(AudioAttributes audioAttributes) {
        this(audioAttributes, -1);
    }

    AudioAttributesImplApi21(AudioAttributes audioAttributes, int n8) {
        this.a = audioAttributes;
        this.b = n8;
    }

    @Override
    public int a() {
        int n8 = this.b;
        if (n8 != -1) {
            return n8;
        }
        return AudioAttributesCompat.c(false, this.c(), this.d());
    }

    @Override
    public Object b() {
        return this.a;
    }

    public int c() {
        return this.a.getFlags();
    }

    public int d() {
        return this.a.getUsage();
    }

    public boolean equals(Object object) {
        if (!(object instanceof AudioAttributesImplApi21)) {
            return false;
        }
        object = (AudioAttributesImplApi21)object;
        return this.a.equals((Object)((AudioAttributesImplApi21)object).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("AudioAttributesCompat: audioattributes=");
        stringBuilder.append(this.a);
        return stringBuilder.toString();
    }

    static class a
    implements AudioAttributesImpl.a {
        final AudioAttributes.Builder a = new AudioAttributes.Builder();

        a() {
        }

        public a a(int n8) {
            this.a.setContentType(n8);
            return this;
        }

        @SuppressLint(value={"WrongConstant"})
        public a b(int n8) {
            int n9 = n8;
            if (n8 == 16) {
                n9 = 12;
            }
            this.a.setUsage(n9);
            return this;
        }

        @Override
        public AudioAttributesImpl g() {
            return new AudioAttributesImplApi21(this.a.build());
        }
    }
}

