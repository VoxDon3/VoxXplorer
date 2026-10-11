package ax.jc;

import ax.gc.InterfaceC2136b;
import ax.jc.g;
import ax.kc.C2422d;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class i {
    private static final InterfaceC2136b<Method> b = new a();
    private final Map<Class<? extends d>, d> a = new HashMap();

    static class a implements InterfaceC2136b<Method> {
        a() {
        }

        @Override // ax.gc.InterfaceC2136b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean apply(Method method) {
            return ax.gc.d.c(method, c.class) != null;
        }
    }

    private d[] a(c cVar) {
        if (cVar.filters().length == 0) {
            return null;
        }
        d[] dVarArr = new d[cVar.filters().length];
        int i = 0;
        for (InterfaceC2348b interfaceC2348b : cVar.filters()) {
            d dVar = this.a.get(interfaceC2348b.value());
            if (dVar == null) {
                try {
                    dVar = interfaceC2348b.value().newInstance();
                    this.a.put(interfaceC2348b.value(), dVar);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
            dVarArr[i] = dVar;
            i++;
        }
        return dVarArr;
    }

    private boolean c(Method method) {
        if (method == null || ax.gc.d.c(method, c.class) == null) {
            return false;
        }
        if (method.getParameterTypes().length != 1) {
            System.out.println("Found no or more than one parameter in messageHandler [" + method.getName() + "]. A messageHandler must define exactly one parameter");
            return false;
        }
        InterfaceC2347a interfaceC2347a = (InterfaceC2347a) ax.gc.d.c(method, InterfaceC2347a.class);
        if (interfaceC2347a != null && !C2422d.class.isAssignableFrom(method.getParameterTypes()[0])) {
            System.out.println("Message envelope configured but no subclass of MessageEnvelope found as parameter");
            return false;
        }
        if (interfaceC2347a == null || interfaceC2347a.messages().length != 0) {
            return true;
        }
        System.out.println("Message envelope configured but message types defined for handler");
        return false;
    }

    public h b(Class cls) {
        h hVar = new h(cls);
        Method[] f = ax.gc.d.f(b, cls);
        for (Method method : f) {
            if (!ax.gc.d.b(f, method)) {
                c cVar = (c) ax.gc.d.c(method, c.class);
                if (cVar.enabled() && c(method)) {
                    Method g = ax.gc.d.g(method, cls);
                    if (g != null) {
                        method = g;
                    }
                    hVar.a(new g(g.a.a(method, cVar, a(cVar), hVar)));
                }
            }
        }
        return hVar;
    }
}
