/*
 * Decompiled with CFR 0.152.
 */
package ax.Gb;

import ax.Gb.e;
import ax.Gb.h;
import ax.Gb.i;
import ax.Gb.m;
import ax.Gb.n;
import ax.Gb.o;
import ax.Gb.q;
import ax.Mb.b;
import ax.Mb.c;
import ax.Mb.d;
import ax.Mb.f;

public class x {
    public d a(i i8) {
        return i8;
    }

    public b b(Class clazz) {
        return new e(clazz);
    }

    public c c(Class clazz, String string) {
        return new n(clazz, string);
    }

    public ax.Mb.e d(o o8) {
        return o8;
    }

    public f e(q q8) {
        return q8;
    }

    public String f(h object) {
        String string = object.getClass().getGenericInterfaces()[0].toString();
        object = string;
        if (string.startsWith("kotlin.jvm.functions.")) {
            object = string.substring(21);
        }
        return object;
    }

    public String g(m m8) {
        return this.f(m8);
    }
}

