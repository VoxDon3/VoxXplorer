/*
 * Decompiled with CFR 0.152.
 */
package androidx.media;

import android.os.Parcelable;
import androidx.media.AudioAttributesImplApi26;
import androidx.versionedparcelable.a;

public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(a a8) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.a = a8.r(audioAttributesImplApi26.a, 1);
        audioAttributesImplApi26.b = a8.p(audioAttributesImplApi26.b, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, a a8) {
        a8.x(false, false);
        a8.H((Parcelable)audioAttributesImplApi26.a, 1);
        a8.F(audioAttributesImplApi26.b, 2);
    }
}

