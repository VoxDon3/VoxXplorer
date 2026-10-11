package com.microsoft.graph.serializer;

import ax.T9.d;
import ax.T9.e;
import ax.r8.AbstractC3000i;
import ax.r8.C3003l;
import com.google.gson.Gson;
import java.util.Map;

/* loaded from: classes3.dex */
public class b implements e {
    private final Gson a;
    private final ax.Q9.b b;

    public b(ax.Q9.b bVar) {
        this.b = bVar;
        this.a = GsonFactory.a(bVar);
    }

    private boolean c(Map.Entry<String, AbstractC3000i> entry) {
        return entry.getKey().startsWith("@");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [ax.r8.i] */
    /* JADX WARN: Type inference failed for: r0v3, types: [ax.r8.i] */
    /* JADX WARN: Type inference failed for: r0v4, types: [ax.r8.l] */
    @Override // ax.T9.e
    public <T> String a(T t) {
        this.b.a("Serializing type " + t.getClass().getSimpleName());
        ?? z = this.a.z(t);
        if (t instanceof d) {
            a c = ((d) t).c();
            if (z.p()) {
                z = z.h();
                for (Map.Entry<String, AbstractC3000i> entry : c.entrySet()) {
                    if (!c(entry)) {
                        z.r(entry.getKey(), entry.getValue());
                    }
                }
            }
        }
        return z.toString();
    }

    @Override // ax.T9.e
    public <T> T b(String str, Class<T> cls) {
        T t = (T) this.a.k(str, cls);
        if (!(t instanceof d)) {
            this.b.a("Deserializing a non-IJsonBackedObject type " + cls.getSimpleName());
            return t;
        }
        this.b.a("Deserializing type " + cls.getSimpleName());
        d dVar = (d) t;
        C3003l c3003l = (C3003l) this.a.k(str, C3003l.class);
        dVar.d(this, c3003l);
        dVar.c().d(c3003l);
        return t;
    }
}
