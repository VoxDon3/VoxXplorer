package ax.t8;

import ax.r8.InterfaceC3011t;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public class k {

    private static abstract class b {
        public static final b a;

        class a extends b {
            final /* synthetic */ Method b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Method method) {
                super();
                this.b = method;
            }

            @Override // ax.t8.k.b
            public boolean a(AccessibleObject accessibleObject, Object obj) {
                try {
                    return ((Boolean) this.b.invoke(accessibleObject, obj)).booleanValue();
                } catch (Exception e) {
                    throw new RuntimeException("Failed invoking canAccess", e);
                }
            }
        }

        /* renamed from: ax.t8.k$b$b, reason: collision with other inner class name */
        class C0462b extends b {
            C0462b() {
                super();
            }

            @Override // ax.t8.k.b
            public boolean a(AccessibleObject accessibleObject, Object obj) {
                return true;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:5:0x001f  */
        static {
            /*
                boolean r0 = ax.t8.d.d()
                if (r0 == 0) goto L1c
                java.lang.Class<java.lang.reflect.AccessibleObject> r0 = java.lang.reflect.AccessibleObject.class
                java.lang.String r1 = "canAccess"
                r2 = 1
                java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L1c
                java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
                r4 = 0
                r2[r4] = r3     // Catch: java.lang.NoSuchMethodException -> L1c
                java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L1c
                ax.t8.k$b$a r1 = new ax.t8.k$b$a     // Catch: java.lang.NoSuchMethodException -> L1c
                r1.<init>(r0)     // Catch: java.lang.NoSuchMethodException -> L1c
                goto L1d
            L1c:
                r1 = 0
            L1d:
                if (r1 != 0) goto L24
                ax.t8.k$b$b r1 = new ax.t8.k$b$b
                r1.<init>()
            L24:
                ax.t8.k.b.a = r1
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ax.t8.k.b.<clinit>():void");
        }

        private b() {
        }

        public abstract boolean a(AccessibleObject accessibleObject, Object obj);
    }

    public static boolean a(AccessibleObject accessibleObject, Object obj) {
        return b.a.a(accessibleObject, obj);
    }

    public static InterfaceC3011t.a b(List<InterfaceC3011t> list, Class<?> cls) {
        Iterator<InterfaceC3011t> it = list.iterator();
        while (it.hasNext()) {
            InterfaceC3011t.a a2 = it.next().a(cls);
            if (a2 != InterfaceC3011t.a.INDECISIVE) {
                return a2;
            }
        }
        return InterfaceC3011t.a.ALLOW;
    }
}
