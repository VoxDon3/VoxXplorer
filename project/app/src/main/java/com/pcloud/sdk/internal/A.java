/*
 * Decompiled with CFR 0.152.
 */
package com.pcloud.sdk.internal;

import ax.la.u;
import ax.la.w;
import ax.r8.e;
import ax.s8.c;
import com.pcloud.sdk.internal.RealRemoteEntry;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class A
extends RealRemoteEntry
implements w {
    private static final List<u> p = java.util.DesugarCollections.unmodifiableList(new ArrayList(0));
    @ax.s8.a
    @c(value="folderid")
    private Long m;
    @ax.s8.a
    @c(value="contents")
    private final List<u> n = p;
    @ax.s8.a
    @c(value="cancreate ")
    private boolean o = true;

    A(ax.la.a a8) {
        super(a8);
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
            object = (A)object;
            if (!this.m.equals(((A)object).m)) {
                return false;
            }
            if (this.o != ((A)object).o) {
                return false;
            }
            return this.n.equals(((A)object).n);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return (super.hashCode() * 31 + this.m.hashCode()) * 31 + this.n.hashCode();
    }

    @Override
    public List<u> k() {
        return this.n;
    }

    @Override
    public long l() {
        return this.m;
    }

    public final A q() {
        return this;
    }

    public String toString() {
        Locale locale = Locale.US;
        String string = this.a();
        String string2 = this.e();
        Date date = this.p();
        Date date2 = this.h();
        Object object = this.n == p ? "?" : Integer.valueOf(this.k().size());
        return String.format(locale, "%s | ID:%s | Created:%s | Modified: %s | Child count:%s", string, string2, date, date2, object);
    }

    static class a
    implements e<A> {
        private final ax.la.a a;

        a(ax.la.a a8) {
            this.a = a8;
        }

        public A b(Type type) {
            return new A(this.a);
        }
    }
}

