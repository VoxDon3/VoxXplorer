package com.google.firebase.abt.component;

import android.content.Context;
import ax.a8.b;
import ax.y7.C3511c;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class a {
    private final Map<String, C3511c> a = new HashMap();
    private final Context b;
    private final b<ax.A7.a> c;

    protected a(Context context, b<ax.A7.a> bVar) {
        this.b = context;
        this.c = bVar;
    }

    protected C3511c a(String str) {
        return new C3511c(this.b, this.c, str);
    }

    public synchronized C3511c b(String str) {
        try {
            if (!this.a.containsKey(str)) {
                this.a.put(str, a(str));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.a.get(str);
    }
}
