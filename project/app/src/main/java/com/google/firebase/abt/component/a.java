/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.abt.component;

import android.content.Context;
import ax.a8.b;
import ax.y7.c;
import java.util.HashMap;
import java.util.Map;

public class a {
    private final Map<String, c> a = new HashMap<String, c>();
    private final Context b;
    private final b<ax.A7.a> c;

    protected a(Context context, b<ax.A7.a> b8) {
        this.b = context;
        this.c = b8;
    }

    protected c a(String string) {
        return new c(this.b, this.c, string);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public c b(String object) {
        synchronized (this) {
            try {
                if (this.a.containsKey(object)) return this.a.get(object);
                this.a.put((String)object, this.a((String)object));
                return this.a.get(object);
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }
}

