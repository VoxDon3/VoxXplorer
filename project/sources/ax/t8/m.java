package ax.t8;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* loaded from: classes3.dex */
public abstract class m {

    class a extends m {
        final /* synthetic */ Method a;
        final /* synthetic */ Object b;

        a(Method method, Object obj) {
            this.a = method;
            this.b = obj;
        }

        @Override // ax.t8.m
        public <T> T e(Class<T> cls) throws Exception {
            m.b(cls);
            return (T) this.a.invoke(this.b, cls);
        }
    }

    class b extends m {
        final /* synthetic */ Method a;
        final /* synthetic */ int b;

        b(Method method, int i) {
            this.a = method;
            this.b = i;
        }

        @Override // ax.t8.m
        public <T> T e(Class<T> cls) throws Exception {
            m.b(cls);
            return (T) this.a.invoke(null, cls, Integer.valueOf(this.b));
        }
    }

    class c extends m {
        final /* synthetic */ Method a;

        c(Method method) {
            this.a = method;
        }

        @Override // ax.t8.m
        public <T> T e(Class<T> cls) throws Exception {
            m.b(cls);
            return (T) this.a.invoke(null, cls, Object.class);
        }
    }

    class d extends m {
        d() {
        }

        @Override // ax.t8.m
        public <T> T e(Class<T> cls) {
            throw new UnsupportedOperationException("Cannot allocate " + cls + ". Usage of JDK sun.misc.Unsafe is enabled, but it could not be used. Make sure your runtime is configured correctly.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Class<?> cls) {
        String c2 = c(cls);
        if (c2 == null) {
            return;
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: " + c2);
    }

    static String c(Class<?> cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: " + cls.getName();
        }
        if (!Modifier.isAbstract(modifiers)) {
            return null;
        }
        return "Abstract classes can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Class name: " + cls.getName();
    }

    public static m d() {
        try {
            try {
                try {
                    Class<?> cls = Class.forName("sun.misc.Unsafe");
                    Field declaredField = cls.getDeclaredField("theUnsafe");
                    declaredField.setAccessible(true);
                    return new a(cls.getMethod("allocateInstance", Class.class), declaredField.get(null));
                } catch (Exception unused) {
                    Method declaredMethod = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                    declaredMethod.setAccessible(true);
                    return new c(declaredMethod);
                }
            } catch (Exception unused2) {
                Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                declaredMethod2.setAccessible(true);
                int intValue = ((Integer) declaredMethod2.invoke(null, Object.class)).intValue();
                Method declaredMethod3 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                declaredMethod3.setAccessible(true);
                return new b(declaredMethod3, intValue);
            }
        } catch (Exception unused3) {
            return new d();
        }
    }

    public abstract <T> T e(Class<T> cls) throws Exception;
}
