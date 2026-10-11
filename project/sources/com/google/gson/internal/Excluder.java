package com.google.gson.internal;

import ax.r8.C2993b;
import ax.r8.InterfaceC2992a;
import ax.r8.InterfaceC3014w;
import ax.s8.InterfaceC3059a;
import ax.s8.InterfaceC3062d;
import ax.s8.InterfaceC3063e;
import ax.x8.C3475a;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class Excluder implements InterfaceC3014w, Cloneable {
    public static final Excluder h0 = new Excluder();
    private boolean e0;
    private List<InterfaceC2992a> f0;
    private List<InterfaceC2992a> g0;
    private double q = -1.0d;
    private int c0 = 136;
    private boolean d0 = true;

    public Excluder() {
        List<InterfaceC2992a> list = Collections.EMPTY_LIST;
        this.f0 = list;
        this.g0 = list;
    }

    private boolean f(Class<?> cls) {
        if (this.q == -1.0d || r((InterfaceC3062d) cls.getAnnotation(InterfaceC3062d.class), (InterfaceC3063e) cls.getAnnotation(InterfaceC3063e.class))) {
            return (!this.d0 && l(cls)) || k(cls);
        }
        return true;
    }

    private boolean h(Class<?> cls, boolean z) {
        Iterator<InterfaceC2992a> it = (z ? this.f0 : this.g0).iterator();
        while (it.hasNext()) {
            if (it.next().b(cls)) {
                return true;
            }
        }
        return false;
    }

    private boolean k(Class<?> cls) {
        if (Enum.class.isAssignableFrom(cls) || m(cls)) {
            return false;
        }
        return cls.isAnonymousClass() || cls.isLocalClass();
    }

    private boolean l(Class<?> cls) {
        return cls.isMemberClass() && !m(cls);
    }

    private boolean m(Class<?> cls) {
        return (cls.getModifiers() & 8) != 0;
    }

    private boolean n(InterfaceC3062d interfaceC3062d) {
        return interfaceC3062d == null || interfaceC3062d.value() <= this.q;
    }

    private boolean o(InterfaceC3063e interfaceC3063e) {
        return interfaceC3063e == null || interfaceC3063e.value() > this.q;
    }

    private boolean r(InterfaceC3062d interfaceC3062d, InterfaceC3063e interfaceC3063e) {
        return n(interfaceC3062d) && o(interfaceC3063e);
    }

    @Override // ax.r8.InterfaceC3014w
    public <T> TypeAdapter<T> b(final Gson gson, final C3475a<T> c3475a) {
        Class<? super T> c = c3475a.c();
        boolean f = f(c);
        final boolean z = f || h(c, true);
        final boolean z2 = f || h(c, false);
        if (z || z2) {
            return new TypeAdapter<T>() { // from class: com.google.gson.internal.Excluder.1
                private TypeAdapter<T> a;

                private TypeAdapter<T> f() {
                    TypeAdapter<T> typeAdapter = this.a;
                    if (typeAdapter != null) {
                        return typeAdapter;
                    }
                    TypeAdapter<T> o = gson.o(Excluder.this, c3475a);
                    this.a = o;
                    return o;
                }

                @Override // com.google.gson.TypeAdapter
                public T c(JsonReader jsonReader) throws IOException {
                    if (!z2) {
                        return f().c(jsonReader);
                    }
                    jsonReader.skipValue();
                    return null;
                }

                @Override // com.google.gson.TypeAdapter
                public void e(JsonWriter jsonWriter, T t) throws IOException {
                    if (z) {
                        jsonWriter.nullValue();
                    } else {
                        f().e(jsonWriter, t);
                    }
                }
            };
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Excluder clone() {
        try {
            return (Excluder) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public boolean d(Class<?> cls, boolean z) {
        return f(cls) || h(cls, z);
    }

    public boolean i(Field field, boolean z) {
        InterfaceC3059a interfaceC3059a;
        if ((this.c0 & field.getModifiers()) != 0) {
            return true;
        }
        if ((this.q != -1.0d && !r((InterfaceC3062d) field.getAnnotation(InterfaceC3062d.class), (InterfaceC3063e) field.getAnnotation(InterfaceC3063e.class))) || field.isSynthetic()) {
            return true;
        }
        if (this.e0 && ((interfaceC3059a = (InterfaceC3059a) field.getAnnotation(InterfaceC3059a.class)) == null || (!z ? interfaceC3059a.deserialize() : interfaceC3059a.serialize()))) {
            return true;
        }
        if ((!this.d0 && l(field.getType())) || k(field.getType())) {
            return true;
        }
        List<InterfaceC2992a> list = z ? this.f0 : this.g0;
        if (list.isEmpty()) {
            return false;
        }
        C2993b c2993b = new C2993b(field);
        Iterator<InterfaceC2992a> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().a(c2993b)) {
                return true;
            }
        }
        return false;
    }

    public Excluder j() {
        Excluder clone = clone();
        clone.e0 = true;
        return clone;
    }
}
