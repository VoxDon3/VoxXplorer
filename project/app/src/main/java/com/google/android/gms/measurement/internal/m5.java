/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import java.util.Map;

final class m5 {
    private String a;
    private Map<String, String> b;
    private int c;

    m5(String string, int n8) {
        this.a = string;
        this.c = n8;
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    m5(String string, Map map, int n8) {
        this.a = string;
        this.b = map;
        this.c = n8;
    }

    public final int a() {
        return this.c;
    }

    public final String b() {
        return this.a;
    }

    public final Map<String, String> c() {
        return this.b;
    }
}

