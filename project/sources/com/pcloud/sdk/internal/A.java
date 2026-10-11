package com.pcloud.sdk.internal;

import ax.la.InterfaceC2491a;
import ax.r8.InterfaceC2996e;
import ax.s8.InterfaceC3059a;
import ax.s8.InterfaceC3061c;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* loaded from: classes3.dex */
public class A extends RealRemoteEntry implements ax.la.w {
    private static final List<ax.la.u> p = DesugarCollections.unmodifiableList(new ArrayList(0));

    @InterfaceC3059a
    @InterfaceC3061c("folderid")
    private Long m;

    @InterfaceC3059a
    @InterfaceC3061c("contents")
    private final List<ax.la.u> n;

    @InterfaceC3059a
    @InterfaceC3061c("cancreate ")
    private boolean o;

    static class a implements InterfaceC2996e<A> {
        private final InterfaceC2491a a;

        a(InterfaceC2491a interfaceC2491a) {
            this.a = interfaceC2491a;
        }

        @Override // ax.r8.InterfaceC2996e
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public A a(Type type) {
            return new A(this.a);
        }
    }

    A(InterfaceC2491a interfaceC2491a) {
        super(interfaceC2491a);
        this.n = p;
        this.o = true;
    }

    @Override // com.pcloud.sdk.internal.RealRemoteEntry, ax.la.u
    public /* bridge */ /* synthetic */ String a() {
        return super.a();
    }

    @Override // com.pcloud.sdk.internal.RealRemoteEntry, ax.la.u
    public /* bridge */ /* synthetic */ boolean d() {
        return super.d();
    }

    @Override // com.pcloud.sdk.internal.RealRemoteEntry, ax.la.u
    public /* bridge */ /* synthetic */ boolean delete() throws IOException {
        return super.delete();
    }

    @Override // com.pcloud.sdk.internal.RealRemoteEntry, ax.la.u
    public /* bridge */ /* synthetic */ String e() {
        return super.e();
    }

    @Override // com.pcloud.sdk.internal.RealRemoteEntry
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        A a2 = (A) obj;
        if (this.m.equals(a2.m) && this.o == a2.o) {
            return this.n.equals(a2.n);
        }
        return false;
    }

    @Override // com.pcloud.sdk.internal.RealRemoteEntry, ax.la.u
    public /* bridge */ /* synthetic */ boolean f() {
        return super.f();
    }

    @Override // com.pcloud.sdk.internal.RealRemoteEntry, ax.la.u
    public /* bridge */ /* synthetic */ boolean g() {
        return super.g();
    }

    @Override // com.pcloud.sdk.internal.RealRemoteEntry, ax.la.u
    public /* bridge */ /* synthetic */ Date h() {
        return super.h();
    }

    @Override // com.pcloud.sdk.internal.RealRemoteEntry
    public int hashCode() {
        return (((super.hashCode() * 31) + this.m.hashCode()) * 31) + this.n.hashCode();
    }

    @Override // com.pcloud.sdk.internal.RealRemoteEntry, ax.la.u
    public /* bridge */ /* synthetic */ boolean i() {
        return super.i();
    }

    @Override // com.pcloud.sdk.internal.RealRemoteEntry, ax.la.u
    public /* bridge */ /* synthetic */ ax.la.v j() {
        return super.j();
    }

    @Override // ax.la.w
    public List<ax.la.u> k() {
        return this.n;
    }

    @Override // ax.la.w
    public long l() {
        return this.m.longValue();
    }

    @Override // com.pcloud.sdk.internal.RealRemoteEntry, ax.la.u
    public /* bridge */ /* synthetic */ boolean o() {
        return super.o();
    }

    @Override // com.pcloud.sdk.internal.RealRemoteEntry
    public /* bridge */ /* synthetic */ Date p() {
        return super.p();
    }

    @Override // com.pcloud.sdk.internal.RealRemoteEntry, ax.la.u
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final A c() {
        return this;
    }

    public String toString() {
        return String.format(Locale.US, "%s | ID:%s | Created:%s | Modified: %s | Child count:%s", a(), e(), p(), h(), this.n == p ? "?" : Integer.valueOf(k().size()));
    }
}
