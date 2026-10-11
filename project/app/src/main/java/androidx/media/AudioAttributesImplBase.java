/*
 * Decompiled with CFR 0.152.
 */
package androidx.media;

import androidx.media.AudioAttributesCompat;
import androidx.media.AudioAttributesImpl;
import java.util.Arrays;

public class AudioAttributesImplBase
implements AudioAttributesImpl {
    public int a;
    public int b;
    public int c;
    public int d;

    public AudioAttributesImplBase() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = -1;
    }

    AudioAttributesImplBase(int n8, int n9, int n10, int n11) {
        this.b = n8;
        this.c = n9;
        this.a = n10;
        this.d = n11;
    }

    @Override
    public int a() {
        int n8 = this.d;
        if (n8 != -1) {
            return n8;
        }
        return AudioAttributesCompat.c(false, this.c, this.a);
    }

    @Override
    public Object b() {
        return null;
    }

    public int c() {
        return this.b;
    }

    public int d() {
        int n8;
        int n9 = this.c;
        int n10 = this.a();
        if (n10 == 6) {
            n8 = n9 | 4;
        } else {
            n8 = n9;
            if (n10 == 7) {
                n8 = n9 | 1;
            }
        }
        return n8 & 0x111;
    }

    public int e() {
        return this.a;
    }

    public boolean equals(Object object) {
        if (!(object instanceof AudioAttributesImplBase)) {
            return false;
        }
        return this.b == ((AudioAttributesImplBase)(object = (AudioAttributesImplBase)object)).c() && this.c == ((AudioAttributesImplBase)object).d() && this.a == ((AudioAttributesImplBase)object).e() && this.d == ((AudioAttributesImplBase)object).d;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, this.a, this.d});
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("AudioAttributesCompat:");
        if (this.d != -1) {
            stringBuilder.append(" stream=");
            stringBuilder.append(this.d);
            stringBuilder.append(" derived");
        }
        stringBuilder.append(" usage=");
        stringBuilder.append(AudioAttributesCompat.e(this.a));
        stringBuilder.append(" content=");
        stringBuilder.append(this.b);
        stringBuilder.append(" flags=0x");
        stringBuilder.append(Integer.toHexString(this.c).toUpperCase());
        return stringBuilder.toString();
    }

    static class a
    implements AudioAttributesImpl.a {
        private int a = 0;
        private int b = 0;
        private int c = 0;
        private int d = -1;

        a() {
        }

        public a a(int n8) {
            if (n8 != 0 && n8 != 1 && n8 != 2 && n8 != 3 && n8 != 4) {
                this.b = 0;
                return this;
            }
            this.b = n8;
            return this;
        }

        public a b(int n8) {
            switch (n8) {
                default: {
                    this.a = 0;
                    return this;
                }
                case 16: {
                    this.a = 12;
                    return this;
                }
                case 0: 
                case 1: 
                case 2: 
                case 3: 
                case 4: 
                case 5: 
                case 6: 
                case 7: 
                case 8: 
                case 9: 
                case 10: 
                case 11: 
                case 12: 
                case 13: 
                case 14: 
                case 15: 
            }
            this.a = n8;
            return this;
        }

        @Override
        public AudioAttributesImpl g() {
            return new AudioAttributesImplBase(this.b, this.c, this.a, this.d);
        }
    }
}

