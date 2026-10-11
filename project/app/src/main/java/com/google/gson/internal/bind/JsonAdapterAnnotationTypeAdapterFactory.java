/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.internal.bind;

import ax.r8.h;
import ax.r8.q;
import ax.r8.w;
import ax.s8.b;
import ax.t8.c;
import ax.x8.a;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.bind.TreeTypeAdapter;

public final class JsonAdapterAnnotationTypeAdapterFactory
implements w {
    private final c q;

    public JsonAdapterAnnotationTypeAdapterFactory(c c8) {
        this.q = c8;
    }

    TypeAdapter<?> a(c object, Gson typeAdapter, a<?> a8, b b8) {
        Object obj = ((c)object).a(a.a(b8.value())).a();
        if (obj instanceof TypeAdapter) {
            object = (TypeAdapter)obj;
        } else if (obj instanceof w) {
            object = ((w)obj).b((Gson)((Object)typeAdapter), a8);
        } else {
            boolean bl = obj instanceof q;
            if (!bl && !(obj instanceof h)) {
                object = new StringBuilder();
                ((StringBuilder)object).append("Invalid attempt to bind an instance of ");
                ((StringBuilder)object).append(obj.getClass().getName());
                ((StringBuilder)object).append(" as a @JsonAdapter for ");
                ((StringBuilder)object).append(a8.toString());
                ((StringBuilder)object).append(". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
                throw new IllegalArgumentException(((StringBuilder)object).toString());
            }
            h h8 = null;
            object = bl ? (q)obj : null;
            if (obj instanceof h) {
                h8 = (h)obj;
            }
            object = new TreeTypeAdapter((q<?>)object, h8, (Gson)((Object)typeAdapter), a8, null);
        }
        typeAdapter = object;
        if (object != null) {
            typeAdapter = object;
            if (b8.nullSafe()) {
                typeAdapter = ((TypeAdapter)object).b();
            }
        }
        return typeAdapter;
    }

    @Override
    public <T> TypeAdapter<T> b(Gson gson, a<T> a8) {
        b b8 = a8.c().getAnnotation(b.class);
        if (b8 == null) {
            return null;
        }
        return this.a(this.q, gson, a8, b8);
    }
}

