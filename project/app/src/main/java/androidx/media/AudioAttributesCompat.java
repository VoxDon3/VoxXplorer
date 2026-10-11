/*
 * Decompiled with CFR 0.152.
 */
package androidx.media;

import android.media.AudioAttributes;
import android.os.Build;
import android.util.SparseIntArray;
import androidx.media.AudioAttributesImpl;
import androidx.media.AudioAttributesImplApi21;
import androidx.media.AudioAttributesImplApi26;
import androidx.media.AudioAttributesImplBase;
import ax.x2.b;

public class AudioAttributesCompat
implements b {
    private static final SparseIntArray b;
    static boolean c;
    private static final int[] d;
    public AudioAttributesImpl a;

    static {
        SparseIntArray sparseIntArray;
        b = sparseIntArray = new SparseIntArray();
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(7, 2);
        sparseIntArray.put(8, 1);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
        d = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 16};
    }

    public AudioAttributesCompat() {
    }

    AudioAttributesCompat(AudioAttributesImpl audioAttributesImpl) {
        this.a = audioAttributesImpl;
    }

    static int c(boolean bl, int n8, int n9) {
        if ((n8 & 1) == 1) {
            if (bl) {
                return 1;
            }
            return 7;
        }
        if ((n8 & 4) == 4) {
            if (bl) {
                return 0;
            }
            return 6;
        }
        switch (n9) {
            default: {
                if (!bl) {
                    return 3;
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unknown usage value ");
                stringBuilder.append(n9);
                stringBuilder.append(" in audio attributes");
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            case 13: {
                return 1;
            }
            case 11: {
                return 10;
            }
            case 6: {
                return 2;
            }
            case 5: 
            case 7: 
            case 8: 
            case 9: 
            case 10: {
                return 5;
            }
            case 4: {
                return 4;
            }
            case 3: {
                if (bl) {
                    return 0;
                }
                return 8;
            }
            case 2: {
                return 0;
            }
            case 0: 
            case 1: 
            case 12: 
            case 14: 
            case 16: 
        }
        return 3;
    }

    static String e(int n8) {
        switch (n8) {
            default: {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("unknown usage ");
                stringBuilder.append(n8);
                return stringBuilder.toString();
            }
            case 16: {
                return "USAGE_ASSISTANT";
            }
            case 14: {
                return "USAGE_GAME";
            }
            case 13: {
                return "USAGE_ASSISTANCE_SONIFICATION";
            }
            case 12: {
                return "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
            }
            case 11: {
                return "USAGE_ASSISTANCE_ACCESSIBILITY";
            }
            case 10: {
                return "USAGE_NOTIFICATION_EVENT";
            }
            case 9: {
                return "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
            }
            case 8: {
                return "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
            }
            case 7: {
                return "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
            }
            case 6: {
                return "USAGE_NOTIFICATION_RINGTONE";
            }
            case 5: {
                return "USAGE_NOTIFICATION";
            }
            case 4: {
                return "USAGE_ALARM";
            }
            case 3: {
                return "USAGE_VOICE_COMMUNICATION_SIGNALLING";
            }
            case 2: {
                return "USAGE_VOICE_COMMUNICATION";
            }
            case 1: {
                return "USAGE_MEDIA";
            }
            case 0: 
        }
        return "USAGE_UNKNOWN";
    }

    public static AudioAttributesCompat f(Object object) {
        if (c) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return new AudioAttributesCompat(new AudioAttributesImplApi26((AudioAttributes)object));
        }
        return new AudioAttributesCompat(new AudioAttributesImplApi21((AudioAttributes)object));
    }

    public int a() {
        return this.a.a();
    }

    public Object d() {
        return this.a.b();
    }

    public boolean equals(Object object) {
        if (!(object instanceof AudioAttributesCompat)) {
            return false;
        }
        object = (AudioAttributesCompat)object;
        AudioAttributesImpl audioAttributesImpl = this.a;
        if (audioAttributesImpl == null) {
            return ((AudioAttributesCompat)object).a == null;
        }
        return audioAttributesImpl.equals(((AudioAttributesCompat)object).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return this.a.toString();
    }

    public static class a {
        final AudioAttributesImpl.a a;

        public a() {
            if (c) {
                this.a = new AudioAttributesImplBase.a();
                return;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                this.a = new AudioAttributesImplApi26.a();
                return;
            }
            this.a = new AudioAttributesImplApi21.a();
        }

        public AudioAttributesCompat a() {
            return new AudioAttributesCompat(this.a.g());
        }

        public a b(int n8) {
            this.a.h(n8);
            return this;
        }

        public a c(int n8) {
            this.a.i(n8);
            return this;
        }
    }
}

