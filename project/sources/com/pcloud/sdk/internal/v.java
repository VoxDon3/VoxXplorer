package com.pcloud.sdk.internal;

import ax.la.InterfaceC2491a;
import ax.la.InterfaceC2493c;
import j$.util.Objects;
import java.util.concurrent.Executor;
import okhttp3.Cache;
import okhttp3.ConnectionPool;
import okhttp3.Dispatcher;
import okhttp3.HttpUrl;

/* loaded from: classes3.dex */
class v implements InterfaceC2491a.InterfaceC0366a {
    private static final HttpUrl k = HttpUrl.parse("https://api.pcloud.com");
    private Cache a;
    private Executor b;
    private ConnectionPool c;
    private Dispatcher d;
    private int e;
    private int f;
    private int g;
    private long h;
    private InterfaceC2493c i;
    private HttpUrl j = k;

    v() {
    }

    @Override // ax.la.InterfaceC2491a.InterfaceC0366a
    public InterfaceC2491a a() {
        return new u(this);
    }

    @Override // ax.la.InterfaceC2491a.InterfaceC0366a
    public InterfaceC2491a.InterfaceC0366a b(InterfaceC2493c interfaceC2493c) {
        this.i = interfaceC2493c;
        return this;
    }

    @Override // ax.la.InterfaceC2491a.InterfaceC0366a
    public InterfaceC2491a.InterfaceC0366a c(String str) {
        HttpUrl parse = HttpUrl.parse("https://" + str);
        if (parse != null) {
            this.j = parse;
            return this;
        }
        throw new IllegalArgumentException("'" + str + "' is not a valid API host.");
    }

    public HttpUrl d() {
        return this.j;
    }

    public InterfaceC2493c e() {
        return this.i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        v vVar = (v) obj;
        if (this.e == vVar.e && this.f == vVar.f && this.g == vVar.g && this.h == vVar.h && Objects.equals(this.a, vVar.a) && Objects.equals(this.b, vVar.b) && Objects.equals(this.c, vVar.c) && Objects.equals(this.d, vVar.d)) {
            return Objects.equals(this.i, vVar.i);
        }
        return false;
    }

    public Cache f() {
        return this.a;
    }

    public Executor g() {
        return this.b;
    }

    public int h() {
        return this.g;
    }

    public int hashCode() {
        Cache cache = this.a;
        int hashCode = (cache != null ? cache.hashCode() : 0) * 31;
        Executor executor = this.b;
        int hashCode2 = (hashCode + (executor != null ? executor.hashCode() : 0)) * 31;
        ConnectionPool connectionPool = this.c;
        int hashCode3 = (hashCode2 + (connectionPool != null ? connectionPool.hashCode() : 0)) * 31;
        Dispatcher dispatcher = this.d;
        int hashCode4 = (((((((hashCode3 + (dispatcher != null ? dispatcher.hashCode() : 0)) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31;
        long j = this.h;
        int i = (hashCode4 + ((int) (j ^ (j >>> 32)))) * 31;
        InterfaceC2493c interfaceC2493c = this.i;
        return i + (interfaceC2493c != null ? interfaceC2493c.hashCode() : 0);
    }

    public ConnectionPool i() {
        return this.c;
    }

    public Dispatcher j() {
        return this.d;
    }

    public long k() {
        return this.h;
    }

    public int l() {
        return this.e;
    }

    public int m() {
        return this.f;
    }
}
