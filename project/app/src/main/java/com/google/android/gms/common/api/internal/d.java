/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import ax.J5.e;
import ax.K5.a;
import ax.L5.D;
import ax.L5.j;
import ax.M5.p;
import ax.j6.k;
import com.google.android.gms.common.api.internal.u;

public abstract class d<A extends a.b, ResultT> {
    private final e[] a;
    private final boolean b;
    private final int c;

    protected d(e[] eArray, boolean bl, int n8) {
        boolean bl2;
        this.a = eArray;
        boolean bl3 = bl2 = false;
        if (eArray != null) {
            bl3 = bl2;
            if (bl) {
                bl3 = true;
            }
        }
        this.b = bl3;
        this.c = n8;
    }

    public static <A extends a.b, ResultT> a<A, ResultT> a() {
        return new a(null);
    }

    protected abstract void b(A var1, k<ResultT> var2) throws RemoteException;

    public boolean c() {
        return this.b;
    }

    public final int d() {
        return this.c;
    }

    public final e[] e() {
        return this.a;
    }

    public static class a<A extends a.b, ResultT> {
        private j a;
        private boolean b = true;
        private e[] c;
        private int d = 0;

        /* synthetic */ a(D d8) {
        }

        static /* bridge */ /* synthetic */ j f(a a8) {
            return a8.a;
        }

        public d<A, ResultT> a() {
            boolean bl = this.a != null;
            p.b(bl, "execute parameter required");
            return new u(this, this.c, this.b, this.d);
        }

        public a<A, ResultT> b(j<A, k<ResultT>> j8) {
            this.a = j8;
            return this;
        }

        public a<A, ResultT> c(boolean bl) {
            this.b = bl;
            return this;
        }

        public a<A, ResultT> d(e ... eArray) {
            this.c = eArray;
            return this;
        }

        public a<A, ResultT> e(int n8) {
            this.d = n8;
            return this;
        }
    }
}

