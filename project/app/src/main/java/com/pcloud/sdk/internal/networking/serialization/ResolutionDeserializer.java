/*
 * Decompiled with CFR 0.152.
 */
package com.pcloud.sdk.internal.networking.serialization;

import ax.Gb.l;
import ax.la.x;
import ax.r8.g;
import ax.r8.h;
import ax.r8.i;
import ax.r8.m;
import java.lang.reflect.Type;

public final class ResolutionDeserializer
implements h<x> {
    public static final ResolutionDeserializer a = new ResolutionDeserializer();

    private ResolutionDeserializer() {
    }

    public x b(i object, Type object2, g g8) {
        l.f(object, "json");
        l.f(object2, "typeOfT");
        l.f(g8, "context");
        if (((i)object).q() && ((i)object).i().z()) {
            object = ((i)object).k();
            l.c(object);
            int n8 = ax.Ob.h.U((CharSequence)object, 'x', 0, false, 6, null);
            if (n8 != -1) {
                try {
                    object2 = ((String)object).substring(0, n8);
                    l.e(object2, "substring(...)");
                    int n9 = Integer.parseInt((String)object2);
                    object = ((String)object).substring(n8 + 1);
                    l.e(object, "substring(...)");
                    object = new x(n9, Integer.parseInt((String)object));
                    return object;
                }
                catch (NumberFormatException numberFormatException) {
                    throw new m(numberFormatException);
                }
            }
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("Invalid resolution format: ");
            ((StringBuilder)object2).append((String)object);
            throw new m(((StringBuilder)object2).toString());
        }
        object2 = new StringBuilder();
        ((StringBuilder)object2).append("Invalid size value ");
        ((StringBuilder)object2).append(object);
        ((StringBuilder)object2).append(".");
        throw new m(((StringBuilder)object2).toString());
    }
}

