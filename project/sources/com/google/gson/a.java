package com.google.gson;

import ax.r8.EnumC2994c;
import ax.r8.EnumC3010s;
import ax.r8.InterfaceC2995d;
import ax.r8.InterfaceC2996e;
import ax.r8.InterfaceC2999h;
import ax.r8.InterfaceC3008q;
import ax.r8.InterfaceC3011t;
import ax.r8.InterfaceC3013v;
import ax.r8.InterfaceC3014w;
import ax.t8.C3105a;
import ax.x8.C3475a;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.DefaultDateTypeAdapter;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class a {
    private Excluder a = Excluder.h0;
    private EnumC3010s b = EnumC3010s.q;
    private InterfaceC2995d c = EnumC2994c.q;
    private final Map<Type, InterfaceC2996e<?>> d = new HashMap();
    private final List<InterfaceC3014w> e = new ArrayList();
    private final List<InterfaceC3014w> f = new ArrayList();
    private boolean g = false;
    private String h = Gson.z;
    private int i = 2;
    private int j = 2;
    private boolean k = false;
    private boolean l = false;
    private boolean m = true;
    private boolean n = false;
    private boolean o = false;
    private boolean p = false;
    private boolean q = true;
    private InterfaceC3013v r = Gson.B;
    private InterfaceC3013v s = Gson.C;
    private final LinkedList<InterfaceC3011t> t = new LinkedList<>();

    private void a(String str, int i, int i2, List<InterfaceC3014w> list) {
        InterfaceC3014w interfaceC3014w;
        InterfaceC3014w interfaceC3014w2;
        boolean z = com.google.gson.internal.sql.a.a;
        InterfaceC3014w interfaceC3014w3 = null;
        if (str != null && !str.trim().isEmpty()) {
            interfaceC3014w = DefaultDateTypeAdapter.b.b.b(str);
            if (z) {
                interfaceC3014w3 = com.google.gson.internal.sql.a.c.b(str);
                interfaceC3014w2 = com.google.gson.internal.sql.a.b.b(str);
            }
            interfaceC3014w2 = null;
        } else {
            if (i == 2 || i2 == 2) {
                return;
            }
            InterfaceC3014w a = DefaultDateTypeAdapter.b.b.a(i, i2);
            if (z) {
                interfaceC3014w3 = com.google.gson.internal.sql.a.c.a(i, i2);
                InterfaceC3014w a2 = com.google.gson.internal.sql.a.b.a(i, i2);
                interfaceC3014w = a;
                interfaceC3014w2 = a2;
            } else {
                interfaceC3014w = a;
                interfaceC3014w2 = null;
            }
        }
        list.add(interfaceC3014w);
        if (z) {
            list.add(interfaceC3014w3);
            list.add(interfaceC3014w2);
        }
    }

    public Gson b() {
        List<InterfaceC3014w> arrayList = new ArrayList<>(this.e.size() + this.f.size() + 3);
        arrayList.addAll(this.e);
        Collections.reverse(arrayList);
        ArrayList arrayList2 = new ArrayList(this.f);
        Collections.reverse(arrayList2);
        arrayList.addAll(arrayList2);
        a(this.h, this.i, this.j, arrayList);
        return new Gson(this.a, this.c, new HashMap(this.d), this.g, this.k, this.o, this.m, this.n, this.p, this.l, this.q, this.b, this.h, this.i, this.j, new ArrayList(this.e), new ArrayList(this.f), arrayList, this.r, this.s, new ArrayList(this.t));
    }

    public a c() {
        this.a = this.a.j();
        return this;
    }

    public a d(Type type, Object obj) {
        boolean z = obj instanceof InterfaceC3008q;
        C3105a.a(z || (obj instanceof InterfaceC2999h) || (obj instanceof InterfaceC2996e) || (obj instanceof TypeAdapter));
        if (obj instanceof InterfaceC2996e) {
            this.d.put(type, (InterfaceC2996e) obj);
        }
        if (z || (obj instanceof InterfaceC2999h)) {
            this.e.add(TreeTypeAdapter.g(C3475a.b(type), obj));
        }
        if (obj instanceof TypeAdapter) {
            this.e.add(TypeAdapters.a(C3475a.b(type), (TypeAdapter) obj));
        }
        return this;
    }

    public a e(InterfaceC3014w interfaceC3014w) {
        this.e.add(interfaceC3014w);
        return this;
    }
}
