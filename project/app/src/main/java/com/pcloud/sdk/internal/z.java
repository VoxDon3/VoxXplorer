/*
 * Decompiled with CFR 0.152.
 */
package com.pcloud.sdk.internal;

import ax.la.v;
import ax.r8.e;
import ax.s8.c;
import com.pcloud.sdk.internal.RealRemoteEntry;
import java.lang.reflect.Type;
import java.util.Locale;

class z
extends RealRemoteEntry
implements v {
    @ax.s8.a
    @c(value="fileid")
    private long m;
    @ax.s8.a
    @c(value="contenttype")
    private String n;
    @ax.s8.a
    @c(value="size")
    private long o;
    @ax.s8.a
    @c(value="hash")
    private String p;
    @ax.s8.a
    @c(value="thumb")
    private Boolean q;

    z(ax.la.a a8) {
        super(a8);
    }

    @Override
    public boolean b() {
        return this.q;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            if (!super.equals(object)) {
                return false;
            }
            object = (z)object;
            if (this.m != ((z)object).m) {
                return false;
            }
            if (this.o != ((z)object).o) {
                return false;
            }
            if (!this.n.equals(((z)object).n)) {
                return false;
            }
            return this.p.equals(((z)object).p);
        }
        return false;
    }

    @Override
    public int hashCode() {
        int n8 = super.hashCode();
        long l8 = this.m;
        int n9 = (int)(l8 ^ l8 >>> 32);
        int n10 = this.n.hashCode();
        l8 = this.o;
        return (((n8 * 31 + n9) * 31 + n10) * 31 + (int)(l8 ^ l8 >>> 32)) * 31 + this.p.hashCode();
    }

    @Override
    public v j() {
        return this;
    }

    @Override
    public long n() {
        return this.m;
    }

    @Override
    public long size() {
        return this.o;
    }

    public String toString() {
        return String.format(Locale.US, "%s | ID:%s | Created:%s | Modified: %s | Size:%s", this.a(), this.e(), this.p(), this.h(), this.size());
    }

    static class a
    implements e<z> {
        private final ax.la.a a;

        a(ax.la.a a8) {
            this.a = a8;
        }

        public z b(Type type) {
            return new z(this.a);
        }
    }
}

