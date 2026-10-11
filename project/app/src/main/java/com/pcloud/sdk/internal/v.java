/*
 * Decompiled with CFR 0.152.
 */
package com.pcloud.sdk.internal;

import ax.la.a;
import ax.la.c;
import com.pcloud.sdk.internal.u;
import java.util.concurrent.Executor;
import okhttp3.Cache;
import okhttp3.ConnectionPool;
import okhttp3.Dispatcher;
import okhttp3.HttpUrl;

class v
implements a.a {
    private static final HttpUrl k = HttpUrl.parse("https://api.pcloud.com");
    private Cache a;
    private Executor b;
    private ConnectionPool c;
    private Dispatcher d;
    private int e;
    private int f;
    private int g;
    private long h;
    private c i;
    private HttpUrl j = k;

    v() {
    }

    @Override
    public a a() {
        return new u(this);
    }

    @Override
    public a.a b(c c8) {
        this.i = c8;
        return this;
    }

    @Override
    public a.a c(String string) {
        Object object = new StringBuilder();
        ((StringBuilder)object).append("https://");
        ((StringBuilder)object).append(string);
        object = HttpUrl.parse(((StringBuilder)object).toString());
        if (object != null) {
            this.j = object;
            return this;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("'");
        ((StringBuilder)object).append(string);
        ((StringBuilder)object).append("' is not a valid API host.");
        throw new IllegalArgumentException(((StringBuilder)object).toString());
    }

    public HttpUrl d() {
        return this.j;
    }

    public c e() {
        return this.i;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            object = (v)object;
            if (this.e != ((v)object).e) {
                return false;
            }
            if (this.f != ((v)object).f) {
                return false;
            }
            if (this.g != ((v)object).g) {
                return false;
            }
            if (this.h != ((v)object).h) {
                return false;
            }
            if (!j.Objects.equals((Object)this.a, (Object)((v)object).a)) {
                return false;
            }
            if (!j.Objects.equals((Object)this.b, (Object)((v)object).b)) {
                return false;
            }
            if (!j.Objects.equals((Object)this.c, (Object)((v)object).c)) {
                return false;
            }
            if (!j.Objects.equals((Object)this.d, (Object)((v)object).d)) {
                return false;
            }
            return j.Objects.equals((Object)this.i, (Object)((v)object).i);
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
        Object object = this.a;
        int n8 = 0;
        int n9 = object != null ? object.hashCode() : 0;
        object = this.b;
        int n10 = object != null ? object.hashCode() : 0;
        object = this.c;
        int n11 = object != null ? object.hashCode() : 0;
        object = this.d;
        int n12 = object != null ? object.hashCode() : 0;
        int n13 = this.e;
        int n14 = this.f;
        int n15 = this.g;
        long l8 = this.h;
        int n16 = (int)(l8 ^ l8 >>> 32);
        object = this.i;
        if (object != null) {
            n8 = object.hashCode();
        }
        return (((((((n9 * 31 + n10) * 31 + n11) * 31 + n12) * 31 + n13) * 31 + n14) * 31 + n15) * 31 + n16) * 31 + n8;
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

