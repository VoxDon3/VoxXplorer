/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.exoplayer;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import ax.P0.F;
import ax.P0.v;
import ax.S0.a;
import ax.S0.d0;
import ax.i1.F;
import java.io.IOException;

public final class s
extends F {
    public final int k0;
    public final String l0;
    public final int m0;
    public final v n0;
    public final int o0;
    public final F.b p0;
    final boolean q0;

    private s(int n8, Throwable throwable, int n9) {
        this(n8, throwable, null, n9, null, -1, null, 4, null, false);
    }

    private s(int n8, Throwable throwable, String string, int n9, String string2, int n10, v v8, int n11, F.b b8, boolean bl) {
        this(s.g(n8, string, string2, n10, v8, n11), throwable, n9, n8, string2, n10, v8, n11, b8, SystemClock.elapsedRealtime(), bl);
    }

    private s(String string, Throwable throwable, int n8, int n9, String string2, int n10, v v8, int n11, F.b b8, long l8, boolean bl) {
        boolean bl2;
        block4: {
            block3: {
                super(string, throwable, n8, Bundle.EMPTY, l8);
                boolean bl3 = false;
                bl2 = !bl || n9 == 1;
                a.a(bl2);
                if (throwable != null) break block3;
                bl2 = bl3;
                if (n9 != 3) break block4;
            }
            bl2 = true;
        }
        a.a(bl2);
        this.k0 = n9;
        this.l0 = string2;
        this.m0 = n10;
        this.n0 = v8;
        this.o0 = n11;
        this.p0 = b8;
        this.q0 = bl;
    }

    public static s d(Throwable throwable, String string, int n8, v v8, int n9, F.b b8, boolean bl, int n10) {
        if (v8 == null) {
            n9 = 4;
        }
        return new s(1, throwable, null, n10, string, n8, v8, n9, b8, bl);
    }

    public static s e(IOException iOException, int n8) {
        return new s(0, iOException, n8);
    }

    public static s f(RuntimeException runtimeException, int n8) {
        return new s(2, runtimeException, n8);
    }

    private static String g(int n8, String string, String string2, int n9, v object, int n10) {
        if (n8 != 0) {
            if (n8 != 1) {
                string2 = n8 != 3 ? "Unexpected runtime error" : "Remote error";
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(string2);
                stringBuilder.append(" error, index=");
                stringBuilder.append(n9);
                stringBuilder.append(", format=");
                stringBuilder.append(object);
                stringBuilder.append(", format_supported=");
                stringBuilder.append(ax.S0.d0.d0(n10));
                string2 = stringBuilder.toString();
            }
        } else {
            string2 = "Source error";
        }
        object = string2;
        if (!TextUtils.isEmpty((CharSequence)string)) {
            object = new StringBuilder();
            ((StringBuilder)object).append(string2);
            ((StringBuilder)object).append(": ");
            ((StringBuilder)object).append(string);
            object = ((StringBuilder)object).toString();
        }
        return object;
    }

    s c(F.b b8) {
        return new s(ax.S0.d0.i(this.getMessage()), this.getCause(), this.q, this.k0, this.l0, this.m0, this.n0, this.o0, b8, this.c0, this.q0);
    }

    public Exception h() {
        int n8 = this.k0;
        boolean bl = true;
        if (n8 != 1) {
            bl = false;
        }
        a.g(bl);
        return (Exception)a.e(this.getCause());
    }

    public IOException i() {
        boolean bl = this.k0 == 0;
        a.g(bl);
        return (IOException)a.e(this.getCause());
    }
}

