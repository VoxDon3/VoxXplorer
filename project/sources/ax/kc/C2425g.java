package ax.kc;

import ax.cc.C1855b;
import ax.fc.C2091b;
import ax.hc.C2181a;
import ax.hc.C2183c;
import ax.hc.j;
import java.lang.reflect.Modifier;
import java.util.Collection;

/* renamed from: ax.kc.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2425g {
    protected ax.hc.g a(C2424f c2424f, ax.hc.f fVar) {
        ax.hc.g hVar = new ax.hc.h(c2424f, fVar);
        if (c2424f.a().j()) {
            hVar = new C2183c(hVar);
        }
        return c2424f.a().k() ? new ax.hc.d(hVar) : hVar;
    }

    protected ax.hc.f b(C2424f c2424f) throws Exception {
        ax.hc.f c = c(c2424f);
        if (c2424f.a().l()) {
            c = new j(c);
        }
        return c2424f.a().i() ? new C2181a(c) : c;
    }

    protected ax.hc.f c(C2424f c2424f) throws C2091b {
        Class<? extends ax.hc.e> e = c2424f.a().e();
        if (e.isMemberClass() && !Modifier.isStatic(e.getModifiers())) {
            throw new C2091b("The handler invocation must be top level class or nested STATIC inner class");
        }
        try {
            return e.getConstructor(C2424f.class).newInstance(c2424f);
        } catch (NoSuchMethodException e2) {
            throw new C2091b("The provided handler invocation did not specify the necessary constructor " + e.getSimpleName() + "(SubscriptionContext);", e2);
        } catch (Exception e3) {
            throw new C2091b("Could not instantiate the provided handler invocation " + e.getSimpleName(), e3);
        }
    }

    public C2423e d(C1855b c1855b, ax.jc.g gVar) throws C2091b {
        try {
            C2424f c2424f = new C2424f(c1855b, gVar, (Collection) c1855b.c("bus.handlers.error"));
            return new C2423e(c2424f, a(c2424f, b(c2424f)), gVar.m() ? new ax.gc.e() : new ax.gc.f());
        } catch (Exception e) {
            throw new C2091b(e);
        }
    }
}
