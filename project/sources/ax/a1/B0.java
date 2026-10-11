package ax.a1;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.Build;
import ax.P0.C0894c;
import ax.a1.C1288f0;
import ax.a1.InterfaceC1276B;

/* loaded from: classes.dex */
public class B0 implements C1288f0.f {
    private AudioTrack c(InterfaceC1276B.a aVar, C0894c c0894c, int i) {
        return new AudioTrack(f(c0894c, aVar.d), ax.S0.d0.L(aVar.b, aVar.c, aVar.a), aVar.f, 1, i);
    }

    private AudioTrack d(InterfaceC1276B.a aVar, C0894c c0894c, int i, Context context) {
        AudioTrack.Builder audioAttributes;
        AudioTrack.Builder audioFormat;
        AudioTrack.Builder transferMode;
        AudioTrack.Builder bufferSizeInBytes;
        AudioTrack.Builder sessionId;
        AudioTrack build;
        AudioFormat L = ax.S0.d0.L(aVar.b, aVar.c, aVar.a);
        audioAttributes = s0.a().setAudioAttributes(f(c0894c, aVar.d));
        audioFormat = audioAttributes.setAudioFormat(L);
        transferMode = audioFormat.setTransferMode(1);
        bufferSizeInBytes = transferMode.setBufferSizeInBytes(aVar.f);
        sessionId = bufferSizeInBytes.setSessionId(i);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            h(sessionId, aVar.e);
        }
        if (i2 >= 34 && context != null) {
            sessionId.setContext(context);
        }
        build = e(sessionId).build();
        return build;
    }

    private AudioAttributes f(C0894c c0894c, boolean z) {
        return z ? g() : c0894c.a().a;
    }

    private AudioAttributes g() {
        return new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
    }

    private void h(AudioTrack.Builder builder, boolean z) {
        builder.setOffloadedPlayback(z);
    }

    @Override // ax.a1.C1288f0.f
    public /* synthetic */ int a(int i) {
        return j0.a(this, i);
    }

    @Override // ax.a1.C1288f0.f
    public final AudioTrack b(InterfaceC1276B.a aVar, C0894c c0894c, int i, Context context) {
        return Build.VERSION.SDK_INT >= 23 ? d(aVar, c0894c, i, context) : c(aVar, c0894c, i);
    }

    protected AudioTrack.Builder e(AudioTrack.Builder builder) {
        return builder;
    }
}
