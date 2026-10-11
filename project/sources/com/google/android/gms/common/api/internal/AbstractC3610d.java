package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import ax.J5.C0744e;
import ax.K5.a;
import ax.K5.a.b;
import ax.L5.InterfaceC0798j;
import ax.M5.C0821p;
import ax.j6.C2328k;

/* renamed from: com.google.android.gms.common.api.internal.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3610d<A extends a.b, ResultT> {
    private final C0744e[] a;
    private final boolean b;
    private final int c;

    /* renamed from: com.google.android.gms.common.api.internal.d$a */
    public static class a<A extends a.b, ResultT> {
        private InterfaceC0798j a;
        private C0744e[] c;
        private boolean b = true;
        private int d = 0;

        /* synthetic */ a(ax.L5.D d) {
        }

        public AbstractC3610d<A, ResultT> a() {
            C0821p.b(this.a != null, "execute parameter required");
            return new u(this, this.c, this.b, this.d);
        }

        public a<A, ResultT> b(InterfaceC0798j<A, C2328k<ResultT>> interfaceC0798j) {
            this.a = interfaceC0798j;
            return this;
        }

        public a<A, ResultT> c(boolean z) {
            this.b = z;
            return this;
        }

        public a<A, ResultT> d(C0744e... c0744eArr) {
            this.c = c0744eArr;
            return this;
        }

        public a<A, ResultT> e(int i) {
            this.d = i;
            return this;
        }
    }

    protected AbstractC3610d(C0744e[] c0744eArr, boolean z, int i) {
        this.a = c0744eArr;
        boolean z2 = false;
        if (c0744eArr != null && z) {
            z2 = true;
        }
        this.b = z2;
        this.c = i;
    }

    public static <A extends a.b, ResultT> a<A, ResultT> a() {
        return new a<>(null);
    }

    protected abstract void b(A a2, C2328k<ResultT> c2328k) throws RemoteException;

    public boolean c() {
        return this.b;
    }

    public final int d() {
        return this.c;
    }

    public final C0744e[] e() {
        return this.a;
    }
}
