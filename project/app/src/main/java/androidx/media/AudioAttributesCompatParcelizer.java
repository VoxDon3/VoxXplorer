/*
 * Decompiled with CFR 0.152.
 */
package androidx.media;

import androidx.media.AudioAttributesCompat;
import androidx.versionedparcelable.a;

public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(a a8) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        audioAttributesCompat.a = a8.v(audioAttributesCompat.a, 1);
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, a a8) {
        a8.x(false, false);
        a8.M(audioAttributesCompat.a, 1);
    }
}

