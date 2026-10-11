package com.pcloud.sdk.internal;

import ax.la.InterfaceC2491a;
import ax.r8.InterfaceC2996e;
import ax.s8.InterfaceC3059a;
import ax.s8.InterfaceC3061c;
import java.lang.reflect.Type;
import java.util.Locale;

/* loaded from: classes3.dex */
class z extends RealRemoteEntry implements ax.la.v {

    @InterfaceC3059a
    @InterfaceC3061c("fileid")
    private long m;

    @InterfaceC3059a
    @InterfaceC3061c("contenttype")
    private String n;

    @InterfaceC3059a
    @InterfaceC3061c("size")
    private long o;

    @InterfaceC3059a
    @InterfaceC3061c("hash")
    private String p;

    @InterfaceC3059a
    @InterfaceC3061c("thumb")
    private Boolean q;

    static class a implements InterfaceC2996e<z> {
        private final InterfaceC2491a a;

        a(InterfaceC2491a interfaceC2491a) {
            this.a = interfaceC2491a;
        }

        @Override // ax.r8.InterfaceC2996e
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public z a(Type type) {
            return new z(this.a);
        }
    }

    z(InterfaceC2491a interfaceC2491a) {
        super(interfaceC2491a);
    }

    @Override // ax.la.v
    public boolean b() {
        return this.q.booleanValue();
    }

    @Override // com.pcloud.sdk.internal.RealRemoteEntry
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        z zVar = (z) obj;
        if (this.m == zVar.m && this.o == zVar.o && this.n.equals(zVar.n)) {
            return this.p.equals(zVar.p);
        }
        return false;
    }

    @Override // com.pcloud.sdk.internal.RealRemoteEntry
    public int hashCode() {
        int hashCode = super.hashCode() * 31;
        long j = this.m;
        int hashCode2 = (((hashCode + ((int) (j ^ (j >>> 32)))) * 31) + this.n.hashCode()) * 31;
        long j2 = this.o;
        return ((hashCode2 + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.p.hashCode();
    }

    @Override // ax.la.v
    public long n() {
        return this.m;
    }

    @Override // ax.la.v
    public long size() {
        return this.o;
    }

    public String toString() {
        return String.format(Locale.US, "%s | ID:%s | Created:%s | Modified: %s | Size:%s", a(), e(), p(), h(), Long.valueOf(size()));
    }

    @Override // com.pcloud.sdk.internal.RealRemoteEntry, ax.la.u
    public ax.la.v j() {
        return this;
    }
}
