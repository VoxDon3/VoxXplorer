package ax.jc;

import ax.ic.C2297a;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class g {
    private final Method a;
    private final d[] b;
    private final String c;
    private final int d;
    private final Class<? extends ax.hc.e> e;
    private final e f;
    private final boolean g;
    private final Class[] h;
    private final boolean i;
    private final h j;
    private final boolean k;

    public static final class a {
        public static final Map<String, Object> a(Method method, c cVar, d[] dVarArr, h hVar) {
            if (method == null) {
                throw new IllegalArgumentException("The message handler configuration may not be null");
            }
            if (dVarArr == null) {
                dVarArr = new d[0];
            }
            InterfaceC2347a interfaceC2347a = (InterfaceC2347a) ax.gc.d.c(method, InterfaceC2347a.class);
            Class[] messages = interfaceC2347a != null ? interfaceC2347a.messages() : method.getParameterTypes();
            method.setAccessible(true);
            HashMap hashMap = new HashMap();
            hashMap.put("handler", method);
            if (cVar.condition().length() > 0) {
                if (!C2297a.d()) {
                    throw new IllegalStateException("A handler uses an EL filter but no EL implementation is available.");
                }
                d[] dVarArr2 = new d[dVarArr.length + 1];
                for (int i = 0; i < dVarArr.length; i++) {
                    dVarArr2[i] = dVarArr[i];
                }
                dVarArr2[dVarArr.length] = new C2297a();
                dVarArr = dVarArr2;
            }
            hashMap.put("filter", dVarArr);
            hashMap.put("condition", b(cVar.condition()));
            hashMap.put("priority", Integer.valueOf(cVar.priority()));
            hashMap.put("invocation", cVar.invocation());
            hashMap.put("invocationMode", cVar.delivery());
            hashMap.put("envelope", Boolean.valueOf(interfaceC2347a != null));
            hashMap.put("subtypes", Boolean.valueOf(!cVar.rejectSubtypes()));
            hashMap.put("listener", hVar);
            hashMap.put("synchronized", Boolean.valueOf(ax.gc.d.c(method, k.class) != null));
            hashMap.put("messages", messages);
            return hashMap;
        }

        private static String b(String str) {
            if (str.trim().startsWith("${") || str.trim().startsWith("#{")) {
                return str;
            }
            return "${" + str + "}";
        }
    }

    public g(Map<String, Object> map) {
        n(map);
        this.a = (Method) map.get("handler");
        this.b = (d[]) map.get("filter");
        this.c = (String) map.get("condition");
        this.d = ((Integer) map.get("priority")).intValue();
        this.e = (Class) map.get("invocation");
        this.f = (e) map.get("invocationMode");
        this.g = ((Boolean) map.get("envelope")).booleanValue();
        this.i = ((Boolean) map.get("subtypes")).booleanValue();
        this.j = (h) map.get("listener");
        this.k = ((Boolean) map.get("synchronized")).booleanValue();
        this.h = (Class[]) map.get("messages");
    }

    private void n(Map<String, Object> map) {
        Object[][] objArr = {new Object[]{"handler", Method.class}, new Object[]{"priority", Integer.class}, new Object[]{"invocation", Class.class}, new Object[]{"filter", d[].class}, new Object[]{"condition", String.class}, new Object[]{"envelope", Boolean.class}, new Object[]{"messages", Class[].class}, new Object[]{"synchronized", Boolean.class}, new Object[]{"listener", h.class}, new Object[]{"subtypes", Boolean.class}};
        for (int i = 0; i < 10; i++) {
            Object[] objArr2 = objArr[i];
            if (map.get(objArr2[0]) == null || !((Class) objArr2[1]).isAssignableFrom(map.get(objArr2[0]).getClass())) {
                throw new IllegalArgumentException("Property " + objArr2[0] + " was expected to be not null and of type " + objArr2[1] + " but was: " + map.get(objArr2[0]));
            }
        }
    }

    public boolean a() {
        return this.i;
    }

    public String b() {
        return this.c;
    }

    public d[] c() {
        return this.b;
    }

    public Class[] d() {
        return this.h;
    }

    public Class<? extends ax.hc.e> e() {
        return this.e;
    }

    public Method f() {
        return this.a;
    }

    public int g() {
        return this.d;
    }

    public boolean h(Class<?> cls) {
        for (Class cls2 : this.h) {
            if (cls2.equals(cls)) {
                return true;
            }
            if (cls2.isAssignableFrom(cls) && a()) {
                return true;
            }
        }
        return false;
    }

    public boolean i() {
        return this.f.equals(e.Asynchronously);
    }

    public boolean j() {
        return this.g;
    }

    public boolean k() {
        if (this.b.length > 0) {
            return true;
        }
        String str = this.c;
        return str != null && str.trim().length() > 0;
    }

    public boolean l() {
        return this.k;
    }

    public boolean m() {
        return this.j.c();
    }
}
