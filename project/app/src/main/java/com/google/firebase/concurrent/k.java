/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.concurrent;

import com.google.firebase.concurrent.o;
import com.google.firebase.concurrent.p;
import java.util.concurrent.Callable;

public final class k
implements Callable {
    public final o a;
    public final Callable b;
    public final p.b c;

    public /* synthetic */ k(o o8, Callable callable, p.b b8) {
        this.a = o8;
        this.b = callable;
        this.c = b8;
    }

    public final Object call() {
        return o.m(this.a, this.b, this.c);
    }
}

