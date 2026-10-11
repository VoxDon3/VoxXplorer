/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import ax.M5.p;
import ax.b6.L6;
import com.google.android.gms.measurement.internal.E2;
import com.google.android.gms.measurement.internal.F;
import com.google.android.gms.measurement.internal.U1;
import com.google.android.gms.measurement.internal.W1;
import com.google.android.gms.measurement.internal.X1;
import com.google.android.gms.measurement.internal.e3;
import com.google.android.gms.measurement.internal.f3;
import com.google.android.gms.measurement.internal.g2;
import com.google.android.gms.measurement.internal.z2;

public final class V1
extends e3 {
    private char c = '\u0000';
    private long d = -1L;
    private String e;
    private final X1 f = new X1(this, 6, false, false);
    private final X1 g = new X1(this, 6, true, false);
    private final X1 h = new X1(this, 6, false, true);
    private final X1 i = new X1(this, 5, false, false);
    private final X1 j = new X1(this, 5, true, false);
    private final X1 k = new X1(this, 5, false, true);
    private final X1 l = new X1(this, 4, false, false);
    private final X1 m = new X1(this, 3, false, false);
    private final X1 n = new X1(this, 2, false, false);

    V1(E2 e22) {
        super(e22);
    }

    static /* bridge */ /* synthetic */ void A(V1 v12, char c8) {
        v12.c = c8;
    }

    static /* bridge */ /* synthetic */ void B(V1 v12, long l8) {
        v12.d = l8;
    }

    static /* bridge */ /* synthetic */ long D(V1 v12) {
        return v12.d;
    }

    private static String E(String string) {
        if (TextUtils.isEmpty((CharSequence)string)) {
            return "";
        }
        int n8 = string.lastIndexOf(46);
        if (n8 == -1) {
            if (L6.a() && ((Boolean)F.x0.a(null)).booleanValue()) {
                return "";
            }
            return string;
        }
        return string.substring(0, n8);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final String P() {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block4: {
                    String string;
                    try {
                        if (this.e == null) {
                            string = this.a.O() != null ? this.a.O() : "FA";
                        }
                        break block4;
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                    this.e = string;
                }
                p.l(this.e);
                return this.e;
            }
            throw throwable2;
        }
    }

    static /* bridge */ /* synthetic */ char u(V1 v12) {
        return v12.c;
    }

    protected static Object v(String string) {
        if (string == null) {
            return null;
        }
        return new W1(string);
    }

    private static String w(boolean bl, Object object) {
        CharSequence charSequence = "";
        if (object == null) {
            return "";
        }
        Object object2 = object;
        if (object instanceof Integer) {
            object2 = (long)((Integer)object).intValue();
        }
        boolean bl2 = object2 instanceof Long;
        if (bl2) {
            if (!bl) {
                return String.valueOf(object2);
            }
            Long l8 = (Long)object2;
            if (Math.abs(l8) < 100L) {
                return String.valueOf(object2);
            }
            object = charSequence;
            if (String.valueOf(object2).charAt(0) == '-') {
                object = "-";
            }
            object2 = String.valueOf(Math.abs(l8));
            long l9 = Math.round(Math.pow(10.0, ((String)object2).length() - 1));
            long l10 = Math.round(Math.pow(10.0, ((String)object2).length()) - 1.0);
            object2 = new StringBuilder();
            ((StringBuilder)object2).append((String)object);
            ((StringBuilder)object2).append(l9);
            ((StringBuilder)object2).append("...");
            ((StringBuilder)object2).append((String)object);
            ((StringBuilder)object2).append(l10);
            return ((StringBuilder)object2).toString();
        }
        if (object2 instanceof Boolean) {
            return String.valueOf(object2);
        }
        if (object2 instanceof Throwable) {
            object2 = (Throwable)object2;
            object = bl ? object2.getClass().getName() : ((Throwable)object2).toString();
            charSequence = new StringBuilder((String)object);
            object = V1.E(E2.class.getCanonicalName());
            for (StackTraceElement stackTraceElement : ((Throwable)object2).getStackTrace()) {
                String string;
                if (stackTraceElement.isNativeMethod() || (string = stackTraceElement.getClassName()) == null || !V1.E(string).equals(object)) continue;
                ((StringBuilder)charSequence).append(": ");
                ((StringBuilder)charSequence).append(stackTraceElement);
                break;
            }
            return ((StringBuilder)charSequence).toString();
        }
        if (object2 instanceof W1) {
            return W1.a((W1)object2);
        }
        if (bl) {
            return "-";
        }
        return String.valueOf(object2);
    }

    static String x(boolean bl, String string, Object object, Object object2, Object object3) {
        String string2 = "";
        String string3 = string;
        if (string == null) {
            string3 = "";
        }
        String string4 = V1.w(bl, object);
        String string5 = V1.w(bl, object2);
        object3 = V1.w(bl, object3);
        StringBuilder stringBuilder = new StringBuilder();
        string = string2;
        if (!TextUtils.isEmpty((CharSequence)string3)) {
            stringBuilder.append(string3);
            string = ": ";
        }
        bl = TextUtils.isEmpty((CharSequence)string4);
        object2 = ", ";
        object = string;
        if (!bl) {
            stringBuilder.append(string);
            stringBuilder.append(string4);
            object = ", ";
        }
        if (!TextUtils.isEmpty((CharSequence)string5)) {
            stringBuilder.append((String)object);
            stringBuilder.append(string5);
            object = object2;
        }
        if (!TextUtils.isEmpty((CharSequence)object3)) {
            stringBuilder.append((String)object);
            stringBuilder.append((String)object3);
        }
        return stringBuilder.toString();
    }

    protected final boolean C(int n8) {
        return Log.isLoggable((String)this.P(), (int)n8);
    }

    public final X1 F() {
        return this.m;
    }

    public final X1 G() {
        return this.f;
    }

    public final X1 H() {
        return this.h;
    }

    public final X1 I() {
        return this.g;
    }

    public final X1 J() {
        return this.l;
    }

    public final X1 K() {
        return this.n;
    }

    public final X1 L() {
        return this.i;
    }

    public final X1 M() {
        return this.k;
    }

    public final X1 N() {
        return this.j;
    }

    public final String O() {
        if (((f3)this).h().f == null) {
            return null;
        }
        Object object = ((f3)this).h().f.a();
        if (object != null && object != g2.B) {
            String string = String.valueOf(((Pair)object).second);
            String string2 = (String)((Pair)object).first;
            object = new StringBuilder();
            ((StringBuilder)object).append(string);
            ((StringBuilder)object).append(":");
            ((StringBuilder)object).append(string2);
            return ((StringBuilder)object).toString();
        }
        return null;
    }

    @Override
    protected final boolean t() {
        return false;
    }

    protected final void y(int n8, String string) {
        Log.println((int)n8, (String)this.P(), (String)string);
    }

    protected final void z(int n8, boolean bl, boolean bl2, String string, Object object, Object object2, Object object3) {
        if (!bl && this.C(n8)) {
            this.y(n8, V1.x(false, string, object, object2, object3));
        }
        if (!bl2 && n8 >= 5) {
            p.l(string);
            z2 z22 = this.a.G();
            if (z22 == null) {
                this.y(6, "Scheduler not set. Not logging error/warn");
                return;
            }
            if (!z22.s()) {
                this.y(6, "Scheduler not initialized. Not logging error/warn");
                return;
            }
            int n9 = n8;
            if (n8 < 0) {
                n9 = 0;
            }
            if (n9 >= 9) {
                n9 = 8;
            }
            z22.D(new U1(this, n9, string, object, object2, object3));
        }
    }
}

