package androidx.media3.exoplayer;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import ax.P0.C0912v;
import ax.S0.C0968a;
import ax.i1.InterfaceC2209F;
import java.io.IOException;

/* renamed from: androidx.media3.exoplayer.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0622s extends ax.P0.F {
    public final int k0;
    public final String l0;
    public final int m0;
    public final C0912v n0;
    public final int o0;
    public final InterfaceC2209F.b p0;
    final boolean q0;

    private C0622s(int i, Throwable th, int i2) {
        this(i, th, null, i2, null, -1, null, 4, null, false);
    }

    public static C0622s d(Throwable th, String str, int i, C0912v c0912v, int i2, InterfaceC2209F.b bVar, boolean z, int i3) {
        return new C0622s(1, th, null, i3, str, i, c0912v, c0912v == null ? 4 : i2, bVar, z);
    }

    public static C0622s e(IOException iOException, int i) {
        return new C0622s(0, iOException, i);
    }

    public static C0622s f(RuntimeException runtimeException, int i) {
        return new C0622s(2, runtimeException, i);
    }

    private static String g(int i, String str, String str2, int i2, C0912v c0912v, int i3) {
        String str3;
        if (i == 0) {
            str3 = "Source error";
        } else if (i != 1) {
            str3 = i != 3 ? "Unexpected runtime error" : "Remote error";
        } else {
            str3 = str2 + " error, index=" + i2 + ", format=" + c0912v + ", format_supported=" + ax.S0.d0.d0(i3);
        }
        if (TextUtils.isEmpty(str)) {
            return str3;
        }
        return str3 + ": " + str;
    }

    C0622s c(InterfaceC2209F.b bVar) {
        return new C0622s((String) ax.S0.d0.i(getMessage()), getCause(), this.q, this.k0, this.l0, this.m0, this.n0, this.o0, bVar, this.c0, this.q0);
    }

    public Exception h() {
        C0968a.g(this.k0 == 1);
        return (Exception) C0968a.e(getCause());
    }

    public IOException i() {
        C0968a.g(this.k0 == 0);
        return (IOException) C0968a.e(getCause());
    }

    private C0622s(int i, Throwable th, String str, int i2, String str2, int i3, C0912v c0912v, int i4, InterfaceC2209F.b bVar, boolean z) {
        this(g(i, str, str2, i3, c0912v, i4), th, i2, i, str2, i3, c0912v, i4, bVar, SystemClock.elapsedRealtime(), z);
    }

    private C0622s(String str, Throwable th, int i, int i2, String str2, int i3, C0912v c0912v, int i4, InterfaceC2209F.b bVar, long j, boolean z) {
        super(str, th, i, Bundle.EMPTY, j);
        C0968a.a(!z || i2 == 1);
        C0968a.a(th != null || i2 == 3);
        this.k0 = i2;
        this.l0 = str2;
        this.m0 = i3;
        this.n0 = c0912v;
        this.o0 = i4;
        this.p0 = bVar;
        this.q0 = z;
    }
}
