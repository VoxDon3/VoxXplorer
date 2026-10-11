/*
 * Decompiled with CFR 0.152.
 */
package com.pcloud.sdk.internal;

import ax.la.a;
import ax.la.b;
import ax.la.u;
import ax.la.v;
import ax.la.w;
import ax.r8.g;
import ax.r8.h;
import ax.r8.i;
import ax.r8.m;
import ax.s8.c;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.pcloud.sdk.internal.A;
import com.pcloud.sdk.internal.z;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Date;

abstract class RealRemoteEntry
implements u {
    private final a a;
    @ax.s8.a
    @c(value="id")
    private String b;
    @ax.s8.a
    @c(value="parentfolderid")
    private long c;
    @ax.s8.a
    @c(value="name")
    private String d;
    @ax.s8.a
    @c(value="modified")
    private Date e;
    @ax.s8.a
    @c(value="created")
    private Date f;
    @ax.s8.a
    @c(value="isfolder")
    private boolean g;
    @ax.s8.a
    @c(value="isshared")
    private boolean h;
    @ax.s8.a
    @c(value="ismine")
    private boolean i;
    @ax.s8.a
    @c(value="canread")
    private boolean j = true;
    @ax.s8.a
    @c(value="canmodify")
    private boolean k = true;
    @ax.s8.a
    @c(value="candelete")
    private boolean l = true;

    RealRemoteEntry(a a8) {
        this.a = a8;
    }

    @Override
    public String a() {
        return this.d;
    }

    @Override
    public w c() {
        throw new IllegalStateException("This entry is not a folder");
    }

    @Override
    public boolean d() {
        return this.i || this.j;
        {
        }
    }

    @Override
    public boolean delete() throws IOException {
        try {
            boolean bl = this.a.c(this).execute();
            return bl;
        }
        catch (b b8) {
            throw new IOException(b8);
        }
    }

    @Override
    public String e() {
        return this.b;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            object = (RealRemoteEntry)object;
            if (this.c != ((RealRemoteEntry)object).c) {
                return false;
            }
            if (this.g != ((RealRemoteEntry)object).g) {
                return false;
            }
            if (!this.b.equals(((RealRemoteEntry)object).b)) {
                return false;
            }
            if (!this.d.equals(((RealRemoteEntry)object).d)) {
                return false;
            }
            if (!this.e.equals(((RealRemoteEntry)object).e)) {
                return false;
            }
            if (this.i != ((RealRemoteEntry)object).i) {
                return false;
            }
            if (this.h != ((RealRemoteEntry)object).h) {
                return false;
            }
            if (this.j != ((RealRemoteEntry)object).j) {
                return false;
            }
            if (this.k != ((RealRemoteEntry)object).k) {
                return false;
            }
            if (this.l != ((RealRemoteEntry)object).l) {
                return false;
            }
            return this.f.equals(((RealRemoteEntry)object).f);
        }
        return false;
    }

    @Override
    public boolean f() {
        return this.g;
    }

    @Override
    public boolean g() {
        return this.i || this.l;
        {
        }
    }

    @Override
    public Date h() {
        return this.e;
    }

    public int hashCode() {
        int n8 = this.b.hashCode();
        long l8 = this.c;
        return ((((n8 * 31 + (int)(l8 ^ l8 >>> 32)) * 31 + this.d.hashCode()) * 31 + this.e.hashCode()) * 31 + this.f.hashCode()) * 31 + this.g;
    }

    @Override
    public boolean i() {
        return this.i || this.k;
        {
        }
    }

    @Override
    public v j() {
        throw new IllegalStateException("This entry is not a file");
    }

    @Override
    public long m() {
        return this.c;
    }

    @Override
    public boolean o() {
        return this.g ^ true;
    }

    public Date p() {
        return this.f;
    }

    static class FileEntryDeserializer
    implements h<u> {
        FileEntryDeserializer() {
        }

        public u b(i i8, Type type, g g8) throws m {
            if (i8.h().t("isfolder").e()) {
                return (u)g8.a(i8, (Type)((Object)A.class));
            }
            return (u)g8.a(i8, (Type)((Object)z.class));
        }
    }

    static class TypeAdapterFactory
    implements ax.r8.w {
        private static final ax.x8.a<v> c0;
        private static final ax.x8.a<w> d0;
        private static final ax.x8.a<u> q;

        static {
            q = new ax.x8.a<u>(){};
            c0 = new ax.x8.a<v>(){};
            d0 = new ax.x8.a<w>(){};
        }

        TypeAdapterFactory() {
        }

        @Override
        public <T> TypeAdapter<T> b(Gson gson, ax.x8.a<T> a8) {
            ax.x8.a<u> a9 = q;
            if (a9.equals(a8)) {
                return gson.m(a9);
            }
            if (c0.equals(a8)) {
                return gson.n(z.class);
            }
            if (d0.equals(a8)) {
                return gson.n(A.class);
            }
            return null;
        }
    }
}

