/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.decoder.ffmpeg;

import androidx.media3.decoder.SimpleDecoderOutputBuffer;
import androidx.media3.decoder.a;
import androidx.media3.decoder.ffmpeg.FfmpegAudioDecoder;

public final class a
implements a.a {
    public final FfmpegAudioDecoder a;

    public /* synthetic */ a(FfmpegAudioDecoder ffmpegAudioDecoder) {
        this.a = ffmpegAudioDecoder;
    }

    public final void a(androidx.media3.decoder.a a8) {
        FfmpegAudioDecoder.B(this.a, (SimpleDecoderOutputBuffer)a8);
    }
}

