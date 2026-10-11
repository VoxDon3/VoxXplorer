package com.pcloud.sdk.internal;

import ax.la.C2492b;
import ax.la.InterfaceC2491a;
import ax.r8.AbstractC3000i;
import ax.r8.C3004m;
import ax.r8.InterfaceC2998g;
import ax.r8.InterfaceC2999h;
import ax.r8.InterfaceC3014w;
import ax.s8.InterfaceC3059a;
import ax.s8.InterfaceC3061c;
import ax.x8.C3475a;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Date;

/* loaded from: classes3.dex */
abstract class RealRemoteEntry implements ax.la.u {
    private final InterfaceC2491a a;

    @InterfaceC3059a
    @InterfaceC3061c("id")
    private String b;

    @InterfaceC3059a
    @InterfaceC3061c("parentfolderid")
    private long c;

    @InterfaceC3059a
    @InterfaceC3061c("name")
    private String d;

    @InterfaceC3059a
    @InterfaceC3061c("modified")
    private Date e;

    @InterfaceC3059a
    @InterfaceC3061c("created")
    private Date f;

    @InterfaceC3059a
    @InterfaceC3061c("isfolder")
    private boolean g;

    @InterfaceC3059a
    @InterfaceC3061c("isshared")
    private boolean h;

    @InterfaceC3059a
    @InterfaceC3061c("ismine")
    private boolean i;

    @InterfaceC3059a
    @InterfaceC3061c("canread")
    private boolean j = true;

    @InterfaceC3059a
    @InterfaceC3061c("canmodify")
    private boolean k = true;

    @InterfaceC3059a
    @InterfaceC3061c("candelete")
    private boolean l = true;

    static class FileEntryDeserializer implements InterfaceC2999h<ax.la.u> {
        FileEntryDeserializer() {
        }

        @Override // ax.r8.InterfaceC2999h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ax.la.u a(AbstractC3000i abstractC3000i, Type type, InterfaceC2998g interfaceC2998g) throws C3004m {
            return abstractC3000i.h().t("isfolder").e() ? (ax.la.u) interfaceC2998g.a(abstractC3000i, A.class) : (ax.la.u) interfaceC2998g.a(abstractC3000i, z.class);
        }
    }

    static class TypeAdapterFactory implements InterfaceC3014w {
        private static final C3475a<ax.la.u> q = new a();
        private static final C3475a<ax.la.v> c0 = new b();
        private static final C3475a<ax.la.w> d0 = new c();

        class a extends C3475a<ax.la.u> {
            a() {
            }
        }

        class b extends C3475a<ax.la.v> {
            b() {
            }
        }

        class c extends C3475a<ax.la.w> {
            c() {
            }
        }

        TypeAdapterFactory() {
        }

        @Override // ax.r8.InterfaceC3014w
        public <T> TypeAdapter<T> b(Gson gson, C3475a<T> c3475a) {
            C3475a<ax.la.u> c3475a2 = q;
            if (c3475a2.equals(c3475a)) {
                return gson.m(c3475a2);
            }
            if (c0.equals(c3475a)) {
                return gson.n(z.class);
            }
            if (d0.equals(c3475a)) {
                return gson.n(A.class);
            }
            return null;
        }
    }

    RealRemoteEntry(InterfaceC2491a interfaceC2491a) {
        this.a = interfaceC2491a;
    }

    @Override // ax.la.u
    public String a() {
        return this.d;
    }

    @Override // ax.la.u
    public ax.la.w c() {
        throw new IllegalStateException("This entry is not a folder");
    }

    @Override // ax.la.u
    public boolean d() {
        return this.i || this.j;
    }

    @Override // ax.la.u
    public boolean delete() throws IOException {
        try {
            return this.a.c(this).execute().booleanValue();
        } catch (C2492b e) {
            throw new IOException(e);
        }
    }

    @Override // ax.la.u
    public String e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RealRemoteEntry realRemoteEntry = (RealRemoteEntry) obj;
        if (this.c == realRemoteEntry.c && this.g == realRemoteEntry.g && this.b.equals(realRemoteEntry.b) && this.d.equals(realRemoteEntry.d) && this.e.equals(realRemoteEntry.e) && this.i == realRemoteEntry.i && this.h == realRemoteEntry.h && this.j == realRemoteEntry.j && this.k == realRemoteEntry.k && this.l == realRemoteEntry.l) {
            return this.f.equals(realRemoteEntry.f);
        }
        return false;
    }

    @Override // ax.la.u
    public boolean f() {
        return this.g;
    }

    @Override // ax.la.u
    public boolean g() {
        return this.i || this.l;
    }

    @Override // ax.la.u
    public Date h() {
        return this.e;
    }

    public int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        long j = this.c;
        return ((((((((hashCode + ((int) (j ^ (j >>> 32)))) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + (this.g ? 1 : 0);
    }

    @Override // ax.la.u
    public boolean i() {
        return this.i || this.k;
    }

    @Override // ax.la.u
    public ax.la.v j() {
        throw new IllegalStateException("This entry is not a file");
    }

    @Override // ax.la.u
    public long m() {
        return this.c;
    }

    @Override // ax.la.u
    public boolean o() {
        return !this.g;
    }

    public Date p() {
        return this.f;
    }
}
