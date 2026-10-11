/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.api.internal;

import android.os.SystemClock;
import ax.K5.b;
import ax.M5.m;
import ax.M5.q;
import ax.M5.r;
import ax.j6.e;
import ax.j6.j;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.c;
import com.google.android.gms.common.api.internal.o;

final class s
implements e {
    private final c a;
    private final int b;
    private final ax.L5.b c;
    private final long d;
    private final long e;

    s(c c8, int n8, ax.L5.b b8, long l8, long l9, String string, String string2) {
        this.a = c8;
        this.b = n8;
        this.c = b8;
        this.d = l8;
        this.e = l9;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static s b(c c8, int n8, ax.L5.b b8) {
        boolean bl;
        if (!c8.e()) return null;
        Object object = q.b().a();
        if (object != null) {
            if (!((r)object).z()) return null;
            boolean bl2 = ((r)object).B();
            object = c8.t(b8);
            bl = bl2;
            if (object != null) {
                if (!(((o)object).u() instanceof ax.M5.c)) return null;
                Object object2 = (ax.M5.c)((Object)((o)object).u());
                bl = bl2;
                if (((ax.M5.c)object2).J()) {
                    bl = bl2;
                    if (!((ax.M5.c)object2).f()) {
                        if ((object2 = s.c((o)object, (ax.M5.c)object2, n8)) == null) return null;
                        ((o)object).H();
                        bl = ((ax.M5.e)object2).C();
                    }
                }
            }
        } else {
            bl = true;
        }
        long l8 = 0L;
        long l9 = bl ? System.currentTimeMillis() : 0L;
        if (!bl) return new s(c8, n8, b8, l9, l8, null, null);
        l8 = SystemClock.elapsedRealtime();
        return new s(c8, n8, b8, l9, l8, null, null);
    }

    private static ax.M5.e c(o o8, ax.M5.c object, int n8) {
        int[] nArray;
        if ((object = ((ax.M5.c)object).H()) != null && ((ax.M5.e)object).B() && !((nArray = ((ax.M5.e)object).y()) != null ? !ax.R5.b.a(nArray, n8) : (nArray = ((ax.M5.e)object).z()) != null && ax.R5.b.a(nArray, n8))) {
            if (o8.q() < ((ax.M5.e)object).k()) {
                return object;
            }
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void a(j object) {
        long l8;
        int n8;
        int n9;
        int n10;
        int n11;
        int n12;
        int n13;
        int n14;
        long l9;
        Object object2;
        block9: {
            block11: {
                block12: {
                    block10: {
                        block8: {
                            o o8;
                            if (!this.a.e()) {
                                return;
                            }
                            object2 = q.b().a();
                            if (object2 != null) {
                                if (!((r)object2).z()) return;
                            }
                            if ((o8 = this.a.t(this.c)) == null) return;
                            if (!(o8.u() instanceof ax.M5.c)) return;
                            ax.M5.c c8 = (ax.M5.c)((Object)o8.u());
                            l9 = this.d;
                            n14 = 1;
                            n13 = l9 > 0L ? 1 : 0;
                            n12 = c8.z();
                            if (object2 != null) {
                                int n15 = n13 & ((r)object2).B();
                                n11 = ((r)object2).k();
                                n10 = ((r)object2).y();
                                n9 = ((r)object2).C();
                                n13 = n15;
                                n8 = n10;
                                if (c8.J()) {
                                    n13 = n15;
                                    n8 = n10;
                                    if (!c8.f()) {
                                        object2 = s.c(o8, c8, this.b);
                                        if (object2 == null) return;
                                        n13 = ((ax.M5.e)object2).C() && this.d > 0L ? n14 : 0;
                                        n8 = ((ax.M5.e)object2).k();
                                    }
                                }
                                n14 = n8;
                                n10 = n13;
                            } else {
                                n9 = 0;
                                n11 = 5000;
                                n14 = 100;
                                n10 = n13;
                            }
                            object2 = this.a;
                            if (!((j)object).m()) break block8;
                            n13 = 0;
                            n8 = 0;
                            break block9;
                        }
                        if (!((j)object).k()) break block10;
                        n13 = 100;
                        break block11;
                    }
                    if (!((object = ((j)object).i()) instanceof b)) break block12;
                    object = ((b)object).a();
                    n13 = ((Status)object).y();
                    if ((object = ((Status)object).k()) == null) break block11;
                    n8 = ((ax.J5.c)object).k();
                    break block9;
                }
                n13 = 101;
            }
            n8 = -1;
        }
        if (n10 != 0) {
            l9 = this.d;
            l8 = this.e;
            long l10 = System.currentTimeMillis();
            n10 = (int)(SystemClock.elapsedRealtime() - l8);
            l8 = l9;
            l9 = l10;
        } else {
            l8 = 0L;
            l9 = 0L;
            n10 = -1;
        }
        ((c)object2).C(new m(this.b, n13, n8, l8, l9, null, null, n12, n10), n9, n11, n14);
    }
}

