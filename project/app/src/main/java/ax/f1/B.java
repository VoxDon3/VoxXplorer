/*
 * Decompiled with CFR 0.152.
 */
package ax.f1;

import android.media.MediaCodec;
import android.os.Build;
import ax.S0.d0;
import ax.V0.h;
import ax.f1.A;
import ax.f1.D;

public class B
extends h {
    public final String c0;
    public final int d0;
    public final D q;

    public B(Throwable throwable, D object) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Decoder failed: ");
        Object var5_4 = null;
        String string = object == null ? null : ((D)object).a;
        stringBuilder.append(string);
        super(stringBuilder.toString(), throwable);
        this.q = object;
        object = var5_4;
        if (throwable instanceof MediaCodec.CodecException) {
            object = ((MediaCodec.CodecException)throwable).getDiagnosticInfo();
        }
        this.c0 = object;
        int n8 = Build.VERSION.SDK_INT >= 23 ? B.a(throwable) : ax.S0.d0.c0((String)object);
        this.d0 = n8;
    }

    private static int a(Throwable throwable) {
        if (throwable instanceof MediaCodec.CodecException) {
            return A.a((MediaCodec.CodecException)throwable);
        }
        return 0;
    }
}

