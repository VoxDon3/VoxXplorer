package com.google.gson.internal.bind;

import ax.r8.InterfaceC2999h;
import ax.r8.InterfaceC3008q;
import ax.r8.InterfaceC3014w;
import ax.s8.InterfaceC3060b;
import ax.t8.c;
import ax.x8.C3475a;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

/* loaded from: classes3.dex */
public final class JsonAdapterAnnotationTypeAdapterFactory implements InterfaceC3014w {
    private final c q;

    public JsonAdapterAnnotationTypeAdapterFactory(c cVar) {
        this.q = cVar;
    }

    TypeAdapter<?> a(c cVar, Gson gson, C3475a<?> c3475a, InterfaceC3060b interfaceC3060b) {
        TypeAdapter<?> treeTypeAdapter;
        Object a = cVar.a(C3475a.a(interfaceC3060b.value())).a();
        if (a instanceof TypeAdapter) {
            treeTypeAdapter = (TypeAdapter) a;
        } else if (a instanceof InterfaceC3014w) {
            treeTypeAdapter = ((InterfaceC3014w) a).b(gson, c3475a);
        } else {
            boolean z = a instanceof InterfaceC3008q;
            if (!z && !(a instanceof InterfaceC2999h)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + a.getClass().getName() + " as a @JsonAdapter for " + c3475a.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            treeTypeAdapter = new TreeTypeAdapter(z ? (InterfaceC3008q) a : null, a instanceof InterfaceC2999h ? (InterfaceC2999h) a : null, gson, c3475a, null);
        }
        return (treeTypeAdapter == null || !interfaceC3060b.nullSafe()) ? treeTypeAdapter : treeTypeAdapter.b();
    }

    @Override // ax.r8.InterfaceC3014w
    public <T> TypeAdapter<T> b(Gson gson, C3475a<T> c3475a) {
        InterfaceC3060b interfaceC3060b = (InterfaceC3060b) c3475a.c().getAnnotation(InterfaceC3060b.class);
        if (interfaceC3060b == null) {
            return null;
        }
        return (TypeAdapter<T>) a(this.q, gson, c3475a, interfaceC3060b);
    }
}
