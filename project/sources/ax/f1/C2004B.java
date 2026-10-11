package ax.f1;

import android.media.MediaCodec;

/* renamed from: ax.f1.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2004B extends ax.V0.h {
    public final String c0;
    public final int d0;
    public final C2006D q;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C2004B(java.lang.Throwable r4, ax.f1.C2006D r5) {
        /*
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Decoder failed: "
            r0.append(r1)
            r1 = 0
            if (r5 != 0) goto Lf
            r2 = r1
            goto L11
        Lf:
            java.lang.String r2 = r5.a
        L11:
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0, r4)
            r3.q = r5
            boolean r5 = r4 instanceof android.media.MediaCodec.CodecException
            if (r5 == 0) goto L28
            r5 = r4
            android.media.MediaCodec$CodecException r5 = (android.media.MediaCodec.CodecException) r5
            java.lang.String r1 = r5.getDiagnosticInfo()
        L28:
            r3.c0 = r1
            int r5 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r5 < r0) goto L35
            int r4 = a(r4)
            goto L39
        L35:
            int r4 = ax.S0.d0.c0(r1)
        L39:
            r3.d0 = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.f1.C2004B.<init>(java.lang.Throwable, ax.f1.D):void");
    }

    private static int a(Throwable th) {
        int errorCode;
        if (!(th instanceof MediaCodec.CodecException)) {
            return 0;
        }
        errorCode = ((MediaCodec.CodecException) th).getErrorCode();
        return errorCode;
    }
}
