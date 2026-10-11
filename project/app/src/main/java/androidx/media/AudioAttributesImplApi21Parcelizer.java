/*
 * Decompiled with CFR 0.152.
 */
package androidx.media;

import android.os.Parcelable;
import androidx.media.AudioAttributesImplApi21;
import androidx.versionedparcelable.a;

public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(a a8) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.a = a8.r(audioAttributesImplApi21.a, 1);
        audioAttributesImplApi21.b = a8.p(audioAttributesImplApi21.b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, a a8) {
        a8.x(false, false);
        a8.H((Parcelable)audioAttributesImplApi21.a, 1);
        a8.F(audioAttributesImplApi21.b, 2);
    }
}

