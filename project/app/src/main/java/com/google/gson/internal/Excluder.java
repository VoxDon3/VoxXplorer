/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.internal;

import ax.r8.b;
import ax.r8.w;
import ax.s8.d;
import ax.s8.e;
import ax.x8.a;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.List;

public final class Excluder
implements w,
Cloneable {
    public static final Excluder h0 = new Excluder();
    private int c0 = 136;
    private boolean d0 = true;
    private boolean e0;
    private List<ax.r8.a> f0;
    private List<ax.r8.a> g0;
    private double q = -1.0;

    public Excluder() {
        List list;
        this.f0 = list = Collections.EMPTY_LIST;
        this.g0 = list;
    }

    private boolean f(Class<?> clazz) {
        if (this.q != -1.0 && !this.r(clazz.getAnnotation(d.class), clazz.getAnnotation(e.class))) {
            return true;
        }
        if (!this.d0 && this.l(clazz)) {
            return true;
        }
        return this.k(clazz);
    }

    private boolean h(Class<?> clazz, boolean bl) {
        List<ax.r8.a> list = bl ? this.f0 : this.g0;
        list = list.iterator();
        while (list.hasNext()) {
            if (!((ax.r8.a)list.next()).b(clazz)) continue;
            return true;
        }
        return false;
    }

    private boolean k(Class<?> clazz) {
        return !Enum.class.isAssignableFrom(clazz) && !this.m(clazz) && (clazz.isAnonymousClass() || clazz.isLocalClass());
    }

    private boolean l(Class<?> clazz) {
        return clazz.isMemberClass() && !this.m(clazz);
    }

    private boolean m(Class<?> clazz) {
        return (clazz.getModifiers() & 8) != 0;
    }

    private boolean n(d d8) {
        return d8 == null || !(d8.value() > this.q);
    }

    private boolean o(e e8) {
        return e8 == null || !(e8.value() <= this.q);
    }

    private boolean r(d d8, e e8) {
        return this.n(d8) && this.o(e8);
    }

    @Override
    public <T> TypeAdapter<T> b(Gson gson, a<T> a8) {
        Class<T> clazz = a8.c();
        boolean bl = this.f(clazz);
        boolean bl2 = bl || this.h(clazz, true);
        bl = bl || this.h(clazz, false);
        if (!bl2 && !bl) {
            return null;
        }
        return new TypeAdapter<T>(this, bl, bl2, gson, a8){
            private TypeAdapter<T> a;
            final boolean b;
            final boolean c;
            final Gson d;
            final a e;
            final Excluder f;
            {
                this.f = excluder;
                this.b = bl;
                this.c = bl2;
                this.d = gson;
                this.e = a8;
            }

            private TypeAdapter<T> f() {
                TypeAdapter typeAdapter = this.a;
                if (typeAdapter != null) {
                    return typeAdapter;
                }
                this.a = typeAdapter = this.d.o(this.f, this.e);
                return typeAdapter;
            }

            @Override
            public T c(JsonReader jsonReader) throws IOException {
                if (this.b) {
                    jsonReader.skipValue();
                    return null;
                }
                return this.f().c(jsonReader);
            }

            @Override
            public void e(JsonWriter jsonWriter, T t8) throws IOException {
                if (this.c) {
                    jsonWriter.nullValue();
                    return;
                }
                this.f().e(jsonWriter, t8);
            }
        };
    }

    protected Excluder c() {
        try {
            Excluder excluder = (Excluder)super.clone();
            return excluder;
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new AssertionError((Object)cloneNotSupportedException);
        }
    }

    public boolean d(Class<?> clazz, boolean bl) {
        return this.f(clazz) || this.h(clazz, bl);
        {
        }
    }

    public boolean i(Field object, boolean bl) {
        List<ax.r8.a> list;
        if ((this.c0 & ((Field)object).getModifiers()) != 0) {
            return true;
        }
        if (this.q != -1.0 && !this.r(((Field)object).getAnnotation(d.class), ((Field)object).getAnnotation(e.class))) {
            return true;
        }
        if (((Field)object).isSynthetic()) {
            return true;
        }
        if (this.e0 && ((list = ((Field)object).getAnnotation(ax.s8.a.class)) == null || (bl ? !list.serialize() : !list.deserialize()))) {
            return true;
        }
        if (!this.d0 && this.l(((Field)object).getType())) {
            return true;
        }
        if (this.k(((Field)object).getType())) {
            return true;
        }
        list = bl ? this.f0 : this.g0;
        if (!list.isEmpty()) {
            object = new b((Field)object);
            list = list.iterator();
            while (list.hasNext()) {
                if (!((ax.r8.a)list.next()).a((b)object)) continue;
                return true;
            }
        }
        return false;
    }

    public Excluder j() {
        Excluder excluder = this.c();
        excluder.e0 = true;
        return excluder;
    }
}

