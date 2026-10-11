/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.internal.bind;

import ax.r8.g;
import ax.r8.h;
import ax.r8.i;
import ax.r8.m;
import ax.r8.p;
import ax.r8.q;
import ax.r8.w;
import ax.t8.l;
import ax.x8.a;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Type;

public final class TreeTypeAdapter<T>
extends TypeAdapter<T> {
    private final q<T> a;
    private final h<T> b;
    final Gson c;
    private final a<T> d;
    private final w e;
    private final b f = new b(this);
    private volatile TypeAdapter<T> g;

    public TreeTypeAdapter(q<T> q8, h<T> h8, Gson gson, a<T> a8, w w8) {
        this.a = q8;
        this.b = h8;
        this.c = gson;
        this.d = a8;
        this.e = w8;
    }

    private TypeAdapter<T> f() {
        TypeAdapter<T> typeAdapter = this.g;
        if (typeAdapter != null) {
            return typeAdapter;
        }
        this.g = typeAdapter = this.c.o(this.e, this.d);
        return typeAdapter;
    }

    public static w g(a<?> a8, Object object) {
        boolean bl = a8.d() == a8.c();
        return new SingleTypeFactory(object, a8, bl, null);
    }

    @Override
    public T c(JsonReader object) throws IOException {
        if (this.b == null) {
            return this.f().c((JsonReader)object);
        }
        if (((i)(object = l.a((JsonReader)object))).n()) {
            return null;
        }
        return this.b.a((i)object, this.d.d(), this.f);
    }

    @Override
    public void e(JsonWriter jsonWriter, T t8) throws IOException {
        q<T> q8 = this.a;
        if (q8 == null) {
            this.f().e(jsonWriter, t8);
            return;
        }
        if (t8 == null) {
            jsonWriter.nullValue();
            return;
        }
        l.b(q8.a(t8, this.d.d(), this.f), jsonWriter);
    }

    private static final class SingleTypeFactory
    implements w {
        private final boolean c0;
        private final Class<?> d0;
        private final q<?> e0;
        private final h<?> f0;
        private final a<?> q;

        SingleTypeFactory(Object object, a<?> a8, boolean bl, Class<?> clazz) {
            boolean bl2 = object instanceof q;
            h h8 = null;
            q q8 = bl2 ? (q)object : null;
            this.e0 = q8;
            if (object instanceof h) {
                h8 = (h)object;
            }
            this.f0 = h8;
            bl2 = q8 != null || h8 != null;
            ax.t8.a.a(bl2);
            this.q = a8;
            this.c0 = bl;
            this.d0 = clazz;
        }

        @Override
        public <T> TypeAdapter<T> b(Gson gson, a<T> a8) {
            a<?> a9 = this.q;
            boolean bl = a9 != null ? a9.equals(a8) || this.c0 && this.q.d() == a8.c() : this.d0.isAssignableFrom(a8.c());
            if (bl) {
                return new TreeTypeAdapter(this.e0, this.f0, gson, a8, this);
            }
            return null;
        }
    }

    private final class b
    implements p,
    g {
        final TreeTypeAdapter a;

        private b(TreeTypeAdapter treeTypeAdapter) {
            this.a = treeTypeAdapter;
        }

        public <R> R a(i i8, Type type) throws m {
            return (R)this.a.c.g(i8, type);
        }
    }
}

