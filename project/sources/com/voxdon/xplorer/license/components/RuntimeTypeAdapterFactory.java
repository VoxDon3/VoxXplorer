package com.voxdon.xplorer.license.components;

import ax.r8.AbstractC3000i;
import ax.r8.C3003l;
import ax.r8.C3004m;
import ax.r8.C3006o;
import ax.r8.InterfaceC3014w;
import ax.t8.l;
import ax.x8.C3475a;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class RuntimeTypeAdapterFactory<T> implements InterfaceC3014w {
    private final String c0;
    private final Map<String, Class<?>> d0;
    private final Map<Class<?>, String> e0;
    private final Class<?> q;

    @Override // ax.r8.InterfaceC3014w
    public <R> TypeAdapter<R> b(Gson gson, C3475a<R> c3475a) {
        if (c3475a.c() != this.q) {
            return null;
        }
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        final LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry<String, Class<?>> entry : this.d0.entrySet()) {
            TypeAdapter<T> o = gson.o(this, C3475a.a(entry.getValue()));
            linkedHashMap.put(entry.getKey(), o);
            linkedHashMap2.put(entry.getValue(), o);
        }
        return new TypeAdapter<R>() { // from class: com.voxdon.xplorer.license.components.RuntimeTypeAdapterFactory.1
            @Override // com.google.gson.TypeAdapter
            public R c(JsonReader jsonReader) throws IOException {
                AbstractC3000i a = l.a(jsonReader);
                AbstractC3000i y = a.h().y(RuntimeTypeAdapterFactory.this.c0);
                if (y == null) {
                    throw new C3004m("cannot deserialize " + RuntimeTypeAdapterFactory.this.q + " because it does not define a field named " + RuntimeTypeAdapterFactory.this.c0);
                }
                String k = y.k();
                TypeAdapter typeAdapter = (TypeAdapter) linkedHashMap.get(k);
                if (typeAdapter != null) {
                    return (R) typeAdapter.a(a);
                }
                throw new C3004m("cannot deserialize " + RuntimeTypeAdapterFactory.this.q + " subtype named " + k + "; did you forget to register a subtype?");
            }

            @Override // com.google.gson.TypeAdapter
            public void e(JsonWriter jsonWriter, R r) throws IOException {
                Class<?> cls = r.getClass();
                String str = (String) RuntimeTypeAdapterFactory.this.e0.get(cls);
                TypeAdapter typeAdapter = (TypeAdapter) linkedHashMap2.get(cls);
                if (typeAdapter == null) {
                    throw new C3004m("cannot serialize " + cls.getName() + "; did you forget to register a subtype?");
                }
                C3003l h = typeAdapter.d(r).h();
                if (h.x(RuntimeTypeAdapterFactory.this.c0)) {
                    throw new C3004m("cannot serialize " + cls.getName() + " because it already defines a field named " + RuntimeTypeAdapterFactory.this.c0);
                }
                C3003l c3003l = new C3003l();
                c3003l.r(RuntimeTypeAdapterFactory.this.c0, new C3006o(str));
                for (Map.Entry<String, AbstractC3000i> entry2 : h.s()) {
                    c3003l.r(entry2.getKey(), entry2.getValue());
                }
                l.b(c3003l, jsonWriter);
            }
        }.b();
    }
}
