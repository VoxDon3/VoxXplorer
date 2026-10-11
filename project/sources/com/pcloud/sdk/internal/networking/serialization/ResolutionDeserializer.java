package com.pcloud.sdk.internal.networking.serialization;

import ax.Gb.l;
import ax.Ob.h;
import ax.la.x;
import ax.r8.AbstractC3000i;
import ax.r8.C3004m;
import ax.r8.InterfaceC2998g;
import ax.r8.InterfaceC2999h;
import java.lang.reflect.Type;

/* loaded from: classes3.dex */
public final class ResolutionDeserializer implements InterfaceC2999h<x> {
    public static final ResolutionDeserializer a = new ResolutionDeserializer();

    private ResolutionDeserializer() {
    }

    @Override // ax.r8.InterfaceC2999h
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public x a(AbstractC3000i abstractC3000i, Type type, InterfaceC2998g interfaceC2998g) {
        l.f(abstractC3000i, "json");
        l.f(type, "typeOfT");
        l.f(interfaceC2998g, "context");
        if (!abstractC3000i.q() || !abstractC3000i.i().z()) {
            throw new C3004m("Invalid size value " + abstractC3000i + ".");
        }
        String k = abstractC3000i.k();
        l.c(k);
        int U = h.U(k, 'x', 0, false, 6, null);
        if (U == -1) {
            throw new C3004m("Invalid resolution format: " + k);
        }
        try {
            String substring = k.substring(0, U);
            l.e(substring, "substring(...)");
            int parseInt = Integer.parseInt(substring);
            String substring2 = k.substring(U + 1);
            l.e(substring2, "substring(...)");
            return new x(parseInt, Integer.parseInt(substring2));
        } catch (NumberFormatException e) {
            throw new C3004m(e);
        }
    }
}
