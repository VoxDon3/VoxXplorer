/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import ax.M5.p;
import ax.f6.h;
import ax.f6.q;
import ax.f6.s;
import com.google.android.gms.measurement.internal.C;
import com.google.android.gms.measurement.internal.D;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

public final class R1 {
    private static final AtomicReference<String[]> b = new AtomicReference();
    private static final AtomicReference<String[]> c = new AtomicReference();
    private static final AtomicReference<String[]> d = new AtomicReference();
    private final h a;

    public R1(h h8) {
        this.a = h8;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static String d(String object, String[] stringArray, String[] stringArray2, AtomicReference<String[]> atomicReference) {
        p.l(stringArray);
        p.l(stringArray2);
        p.l(atomicReference);
        int n8 = stringArray.length;
        int n9 = stringArray2.length;
        int n10 = 0;
        boolean bl = n8 == n9;
        p.a(bl);
        while (true) {
            block8: {
                if (n10 >= stringArray.length) {
                    return object;
                }
                if (!j.Objects.equals((Object)object, (Object)stringArray[n10])) break block8;
                synchronized (atomicReference) {
                    Throwable throwable2;
                    block9: {
                        Object object2;
                        block7: {
                            try {
                                object2 = atomicReference.get();
                                object = object2;
                                if (object2 != null) break block7;
                                object = new String[stringArray2.length];
                                atomicReference.set((String[])object);
                            }
                            catch (Throwable throwable2) {
                                break block9;
                            }
                        }
                        if (object[n10] != null) return object[n10];
                        {
                            object2 = new StringBuilder();
                            ((StringBuilder)object2).append(stringArray2[n10]);
                            ((StringBuilder)object2).append("(");
                            ((StringBuilder)object2).append(stringArray[n10]);
                            ((StringBuilder)object2).append(")");
                            object[n10] = ((StringBuilder)object2).toString();
                        }
                        return object[n10];
                    }
                    throw throwable2;
                }
            }
            ++n10;
        }
    }

    private final String e(Object[] objectArray) {
        if (objectArray == null) {
            return "[]";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        for (Object object : objectArray) {
            object = object instanceof Bundle ? this.a((Bundle)object) : String.valueOf(object);
            if (object == null) continue;
            if (stringBuilder.length() != 1) {
                stringBuilder.append(", ");
            }
            stringBuilder.append((String)object);
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    protected final String a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (!this.a.a()) {
            return bundle.toString();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Bundle[{");
        for (Object object : bundle.keySet()) {
            if (stringBuilder.length() != 8) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(this.f((String)object));
            stringBuilder.append("=");
            object = bundle.get((String)object);
            object = object instanceof Bundle ? this.e(new Object[]{object}) : (object instanceof Object[] ? this.e((Object[])object) : (object instanceof ArrayList ? this.e(((ArrayList)object).toArray()) : String.valueOf(object)));
            stringBuilder.append((String)object);
        }
        stringBuilder.append("}]");
        return stringBuilder.toString();
    }

    protected final String b(D object) {
        Object var2_2 = null;
        if (object == null) {
            return null;
        }
        if (!this.a.a()) {
            return ((D)object).toString();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("origin=");
        stringBuilder.append(((D)object).d0);
        stringBuilder.append(",name=");
        stringBuilder.append(this.c(((D)object).q));
        stringBuilder.append(",params=");
        object = ((D)object).c0;
        object = object == null ? var2_2 : (!this.a.a() ? ((C)object).toString() : this.a(((C)object).B()));
        stringBuilder.append((String)object);
        return stringBuilder.toString();
    }

    protected final String c(String string) {
        if (string == null) {
            return null;
        }
        if (!this.a.a()) {
            return string;
        }
        return R1.d(string, q.c, q.a, b);
    }

    protected final String f(String string) {
        if (string == null) {
            return null;
        }
        if (!this.a.a()) {
            return string;
        }
        return R1.d(string, ax.f6.p.b, ax.f6.p.a, c);
    }

    protected final String g(String string) {
        if (string == null) {
            return null;
        }
        if (!this.a.a()) {
            return string;
        }
        if (string.startsWith("_exp_")) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("experiment_id");
            stringBuilder.append("(");
            stringBuilder.append(string);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
        return R1.d(string, s.b, s.a, d);
    }
}

