/*
 * Decompiled with CFR 0.152.
 */
package androidx.media;

import android.media.AudioAttributes;
import androidx.media.AudioAttributesImpl;
import androidx.media.AudioAttributesImplApi21;

public class AudioAttributesImplApi26
extends AudioAttributesImplApi21 {
    public AudioAttributesImplApi26() {
    }

    AudioAttributesImplApi26(AudioAttributes audioAttributes) {
        super(audioAttributes, -1);
    }

    static class a
    extends AudioAttributesImplApi21.a {
        a() {
        }

        public a c(int n8) {
            this.a.setUsage(n8);
            return this;
        }

        @Override
        public AudioAttributesImpl g() {
            return new AudioAttributesImplApi26(this.a.build());
        }
    }
}

