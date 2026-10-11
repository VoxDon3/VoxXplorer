package com.google.gson.internal.bind;

import ax.r8.AbstractC3000i;
import ax.r8.C3004m;
import ax.r8.InterfaceC2998g;
import ax.r8.InterfaceC2999h;
import ax.r8.InterfaceC3007p;
import ax.r8.InterfaceC3008q;
import ax.r8.InterfaceC3014w;
import ax.t8.C3105a;
import ax.t8.l;
import ax.x8.C3475a;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Type;

/* loaded from: classes3.dex */
public final class TreeTypeAdapter<T> extends TypeAdapter<T> {
    private final InterfaceC3008q<T> a;
    private final InterfaceC2999h<T> b;
    final Gson c;
    private final C3475a<T> d;
    private final InterfaceC3014w e;
    private final TreeTypeAdapter<T>.b f = new b();
    private volatile TypeAdapter<T> g;

    private static final class SingleTypeFactory implements InterfaceC3014w {
        private final boolean c0;
        private final Class<?> d0;
        private final InterfaceC3008q<?> e0;
        private final InterfaceC2999h<?> f0;
        private final C3475a<?> q;

        SingleTypeFactory(Object obj, C3475a<?> c3475a, boolean z, Class<?> cls) {
            InterfaceC3008q<?> interfaceC3008q = obj instanceof InterfaceC3008q ? (InterfaceC3008q) obj : null;
            this.e0 = interfaceC3008q;
            InterfaceC2999h<?> interfaceC2999h = obj instanceof InterfaceC2999h ? (InterfaceC2999h) obj : null;
            this.f0 = interfaceC2999h;
            C3105a.a((interfaceC3008q == null && interfaceC2999h == null) ? false : true);
            this.q = c3475a;
            this.c0 = z;
            this.d0 = cls;
        }

        @Override // ax.r8.InterfaceC3014w
        public <T> TypeAdapter<T> b(Gson gson, C3475a<T> c3475a) {
            C3475a<?> c3475a2 = this.q;
            if (c3475a2 != null ? c3475a2.equals(c3475a) || (this.c0 && this.q.d() == c3475a.c()) : this.d0.isAssignableFrom(c3475a.c())) {
                return new TreeTypeAdapter(this.e0, this.f0, gson, c3475a, this);
            }
            return null;
        }
    }

    private final class b implements InterfaceC3007p, InterfaceC2998g {
        private b() {
        }

        @Override // ax.r8.InterfaceC2998g
        public <R> R a(AbstractC3000i abstractC3000i, Type type) throws C3004m {
            return (R) TreeTypeAdapter.this.c.g(abstractC3000i, type);
        }
    }

    public TreeTypeAdapter(InterfaceC3008q<T> interfaceC3008q, InterfaceC2999h<T> interfaceC2999h, Gson gson, C3475a<T> c3475a, InterfaceC3014w interfaceC3014w) {
        this.a = interfaceC3008q;
        this.b = interfaceC2999h;
        this.c = gson;
        this.d = c3475a;
        this.e = interfaceC3014w;
    }

    private TypeAdapter<T> f() {
        TypeAdapter<T> typeAdapter = this.g;
        if (typeAdapter != null) {
            return typeAdapter;
        }
        TypeAdapter<T> o = this.c.o(this.e, this.d);
        this.g = o;
        return o;
    }

    public static InterfaceC3014w g(C3475a<?> c3475a, Object obj) {
        return new SingleTypeFactory(obj, c3475a, c3475a.d() == c3475a.c(), null);
    }

    @Override // com.google.gson.TypeAdapter
    public T c(JsonReader jsonReader) throws IOException {
        if (this.b == null) {
            return f().c(jsonReader);
        }
        AbstractC3000i a2 = l.a(jsonReader);
        if (a2.n()) {
            return null;
        }
        return this.b.a(a2, this.d.d(), this.f);
    }

    @Override // com.google.gson.TypeAdapter
    public void e(JsonWriter jsonWriter, T t) throws IOException {
        InterfaceC3008q<T> interfaceC3008q = this.a;
        if (interfaceC3008q == null) {
            f().e(jsonWriter, t);
        } else if (t == null) {
            jsonWriter.nullValue();
        } else {
            l.b(interfaceC3008q.a(t, this.d.d(), this.f), jsonWriter);
        }
    }
}
