/*
 * Decompiled with CFR 0.152.
 */
package androidx.media;

import androidx.media.AudioAttributesImplBase;
import androidx.versionedparcelable.a;

public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(a a8) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.a = a8.p(audioAttributesImplBase.a, 1);
        audioAttributesImplBase.b = a8.p(audioAttributesImplBase.b, 2);
        audioAttributesImplBase.c = a8.p(audioAttributesImplBase.c, 3);
        audioAttributesImplBase.d = a8.p(audioAttributesImplBase.d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, a a8) {
        a8.x(false, false);
        a8.F(audioAttributesImplBase.a, 1);
        a8.F(audioAttributesImplBase.b, 2);
        a8.F(audioAttributesImplBase.c, 3);
        a8.F(audioAttributesImplBase.d, 4);
    }
}

