/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson;

import ax.r8.c;
import ax.r8.d;
import ax.r8.e;
import ax.r8.h;
import ax.r8.q;
import ax.r8.s;
import ax.r8.t;
import ax.r8.v;
import ax.r8.w;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
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

public final class a {
    private Excluder a = Excluder.h0;
    private s b = ax.r8.s.q;
    private d c = ax.r8.c.q;
    private final Map<Type, e<?>> d = new HashMap();
    private final List<w> e = new ArrayList<w>();
    private final List<w> f = new ArrayList<w>();
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
    private v r = Gson.B;
    private v s = Gson.C;
    private final LinkedList<t> t = new LinkedList();

    /*
     * Unable to fully structure code
     */
    private void a(String var1_1, int var2_2, int var3_3, List<w> var4_4) {
        block8: {
            block5: {
                block6: {
                    block7: {
                        var5_5 = com.google.gson.internal.sql.a.a;
                        var7_6 = null;
                        if (var1_1 == null || var1_1.trim().isEmpty()) break block6;
                        var6_8 = var8_7 = DefaultDateTypeAdapter.b.b.b((String)var1_1);
                        if (!var5_5) break block7;
                        var6_8 = com.google.gson.internal.sql.a.c.b((String)var1_1);
                        var7_6 = com.google.gson.internal.sql.a.b.b((String)var1_1);
                        var1_1 = var6_8;
                        var6_8 = var8_7;
                        break block5;
                    }
lbl12:
                    // 2 sources

                    while (true) {
                        var8_7 = null;
                        var1_1 = var7_6;
                        var7_6 = var8_7;
                        break block5;
                        break;
                    }
                }
                if (var2_2 == 2 || var3_3 == 2) break block8;
                var6_8 = DefaultDateTypeAdapter.b.b.a(var2_2, var3_3);
                ** while (!var5_5)
lbl21:
                // 1 sources

                var1_1 = com.google.gson.internal.sql.a.c.a(var2_2, var3_3);
                var7_6 = com.google.gson.internal.sql.a.b.a(var2_2, var3_3);
            }
            var4_4.add(var6_8);
            if (var5_5) {
                var4_4.add((w)var1_1);
                var4_4.add(var7_6);
            }
        }
    }

    public Gson b() {
        ArrayList<w> arrayList = new ArrayList<w>(this.e.size() + this.f.size() + 3);
        arrayList.addAll(this.e);
        Collections.reverse(arrayList);
        ArrayList<w> arrayList2 = new ArrayList<w>(this.f);
        Collections.reverse(arrayList2);
        arrayList.addAll(arrayList2);
        this.a(this.h, this.i, this.j, arrayList);
        return new Gson(this.a, this.c, new HashMap(this.d), this.g, this.k, this.o, this.m, this.n, this.p, this.l, this.q, this.b, this.h, this.i, this.j, new ArrayList<w>(this.e), new ArrayList<w>(this.f), arrayList, this.r, this.s, new ArrayList<t>(this.t));
    }

    public a c() {
        this.a = this.a.j();
        return this;
    }

    public a d(Type type, Object object) {
        boolean bl = object instanceof q;
        boolean bl2 = bl || object instanceof h || object instanceof e || object instanceof TypeAdapter;
        ax.t8.a.a(bl2);
        if (object instanceof e) {
            this.d.put(type, (e)object);
        }
        if (bl || object instanceof h) {
            ax.x8.a<?> a8 = ax.x8.a.b(type);
            this.e.add(TreeTypeAdapter.g(a8, object));
        }
        if (object instanceof TypeAdapter) {
            this.e.add(TypeAdapters.a(ax.x8.a.b(type), (TypeAdapter)object));
        }
        return this;
    }

    public a e(w w8) {
        this.e.add(w8);
        return this;
    }
}

