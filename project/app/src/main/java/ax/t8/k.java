/*
 * Decompiled with CFR 0.152.
 */
package ax.t8;

import ax.r8.t;
import ax.t8.d;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

public class k {
    public static boolean a(AccessibleObject accessibleObject, Object object) {
        return b.a.a(accessibleObject, object);
    }

    public static t.a b(List<t> object, Class<?> clazz) {
        Iterator<t> iterator = object.iterator();
        while (iterator.hasNext()) {
            object = iterator.next().a(clazz);
            if (object == t.a.c0) continue;
            return object;
        }
        return t.a.q;
    }

    private static abstract class b {
        public static final b a;

        /*
         * WARNING - void declaration
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        static {
            Object var0_4;
            Object object;
            if (d.d()) {
                try {
                    object = AccessibleObject.class.getDeclaredMethod("canAccess", Object.class);
                    b b8 = new b((Method)object){
                        final Method b;
                        {
                            this.b = method;
                        }

                        @Override
                        public boolean a(AccessibleObject accessibleObject, Object object) {
                            try {
                                boolean bl = (Boolean)this.b.invoke(accessibleObject, object);
                                return bl;
                            }
                            catch (Exception exception) {
                                throw new RuntimeException("Failed invoking canAccess", exception);
                            }
                        }
                    };
                }
                catch (NoSuchMethodException noSuchMethodException) {}
            }
            Object var0_3 = null;
            object = var0_4;
            if (var0_4 == null) {
                object = new b(){

                    @Override
                    public boolean a(AccessibleObject accessibleObject, Object object) {
                        return true;
                    }
                };
            }
            a = object;
        }

        private b() {
        }

        public abstract boolean a(AccessibleObject var1, Object var2);
    }
}

