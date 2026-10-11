/*
 * Decompiled with CFR 0.152.
 */
package android.support.v4.media;

import androidx.media.AudioAttributesCompat;
import androidx.versionedparcelable.a;

public final class AudioAttributesCompatParcelizer
extends androidx.media.AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(a a8) {
        return androidx.media.AudioAttributesCompatParcelizer.read(a8);
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, a a8) {
        androidx.media.AudioAttributesCompatParcelizer.write(audioAttributesCompat, a8);
    }
}

