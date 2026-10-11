/*
 * Decompiled with CFR 0.152.
 */
package com.pcloud.sdk.internal;

import ax.la.A;

class B
implements A {
    private final long a;
    private final String b;
    private final boolean c;
    private final long d;
    private final long e;

    B(long l8, String string, boolean bl, long l9, long l10) {
        this.a = l8;
        this.b = string;
        this.c = bl;
        this.d = l9;
        this.e = l10;
    }

    @Override
    public long a() {
        return this.d;
    }

    @Override
    public String b() {
        return this.b;
    }

    @Override
    public long c() {
        return this.e;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            object = (B)object;
            if (this.a != ((B)object).a) {
                return false;
            }
            if (this.c != ((B)object).c) {
                return false;
            }
            if (this.d != ((B)object).d) {
                return false;
            }
            if (this.e != ((B)object).e) {
                return false;
            }
            return this.b.equals(((B)object).b);
        }
        return false;
    }

    public int hashCode() {
        long l8 = this.a;
        int n8 = (int)(l8 ^ l8 >>> 32);
        int n9 = this.b.hashCode();
        int n10 = this.c;
        l8 = this.d;
        int n11 = (int)(l8 ^ l8 >>> 32);
        l8 = this.e;
        return (((n8 * 31 + n9) * 31 + n10) * 31 + n11) * 31 + (int)(l8 ^ l8 >>> 32);
    }
}

