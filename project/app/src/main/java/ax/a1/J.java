/*
 * Decompiled with CFR 0.152.
 */
package ax.a1;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.os.Build;
import ax.P0.D;
import ax.P0.c;
import ax.P0.v;
import ax.Q0.m;
import ax.S0.d0;
import ax.a1.I;
import ax.a1.K;
import ax.a1.f0;
import ax.a1.l;

public final class J
implements f0.d {
    private final Context a;
    private Boolean b;

    public J(Context object) {
        object = object == null ? null : object.getApplicationContext();
        this.a = object;
    }

    private boolean b(Context object) {
        Boolean bl = this.b;
        if (bl != null) {
            return bl;
        }
        if (object != null) {
            boolean bl2 = (object = m.c((Context)object).getParameters("offloadVariableRateSupported")) != null && ((String)object).equals("offloadVariableRateSupported=1");
            this.b = bl2;
        } else {
            this.b = Boolean.FALSE;
        }
        return this.b;
    }

    @Override
    public l a(v v8, c c8) {
        ax.S0.a.e(v8);
        ax.S0.a.e(c8);
        int n8 = Build.VERSION.SDK_INT;
        if (n8 >= 29 && v8.H != -1) {
            boolean bl = this.b(this.a);
            int n9 = D.f(ax.S0.a.e(v8.o), v8.k);
            if (n9 != 0 && n8 >= d0.K(n9)) {
                block5: {
                    int n10 = d0.M(v8.G);
                    if (n10 == 0) {
                        return l.d;
                    }
                    try {
                        v8 = d0.L(v8.H, n10, n9);
                        if (n8 < 31) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        return l.d;
                    }
                    return ax.a1.J$b.a((AudioFormat)v8, c8.a().a, bl);
                }
                return ax.a1.J$a.a((AudioFormat)v8, c8.a().a, bl);
            }
            return l.d;
        }
        return l.d;
    }

    private static final class a {
        public static l a(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean bl) {
            if (!I.a(audioFormat, audioAttributes)) {
                return l.d;
            }
            return new l.b().e(true).g(bl).d();
        }
    }

    private static final class b {
        public static l a(AudioFormat object, AudioAttributes audioAttributes, boolean bl) {
            int n8 = K.a((AudioFormat)object, audioAttributes);
            if (n8 == 0) {
                return l.d;
            }
            object = new l.b();
            boolean bl2 = Build.VERSION.SDK_INT > 32 && n8 == 2;
            return ((l.b)object).e(true).f(bl2).g(bl).d();
        }
    }
}

