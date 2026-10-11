/*
 * Decompiled with CFR 0.152.
 */
package ax.t8;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public abstract class m {
    private static void b(Class<?> serializable) {
        String string = m.c(serializable);
        if (string == null) {
            return;
        }
        serializable = new StringBuilder();
        ((StringBuilder)serializable).append("UnsafeAllocator is used for non-instantiable type: ");
        ((StringBuilder)serializable).append(string);
        throw new AssertionError((Object)((StringBuilder)serializable).toString());
    }

    static String c(Class<?> clazz) {
        int n8 = clazz.getModifiers();
        if (Modifier.isInterface(n8)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ");
            stringBuilder.append(clazz.getName());
            return stringBuilder.toString();
        }
        if (Modifier.isAbstract(n8)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Abstract classes can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Class name: ");
            stringBuilder.append(clazz.getName());
            return stringBuilder.toString();
        }
        return null;
    }

    public static m d() {
        try {
            Object object = Class.forName("sun.misc.Unsafe");
            Object object2 = ((Class)object).getDeclaredField("theUnsafe");
            ((AccessibleObject)object2).setAccessible(true);
            object2 = ((Field)object2).get(null);
            object = new m(((Class)object).getMethod("allocateInstance", Class.class), object2){
                final Method a;
                final Object b;
                {
                    this.a = method;
                    this.b = object;
                }

                @Override
                public <T> T e(Class<T> clazz) throws Exception {
                    m.b(clazz);
                    return (T)this.a.invoke(this.b, clazz);
                }
            };
            return object;
        }
        catch (Exception exception) {
            try {
                Object object = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                ((AccessibleObject)object).setAccessible(true);
                int n8 = (Integer)((Method)object).invoke(null, Object.class);
                object = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                ((AccessibleObject)object).setAccessible(true);
                object = new m((Method)object, n8){
                    final Method a;
                    final int b;
                    {
                        this.a = method;
                        this.b = n8;
                    }

                    @Override
                    public <T> T e(Class<T> clazz) throws Exception {
                        m.b(clazz);
                        return (T)this.a.invoke(null, clazz, this.b);
                    }
                };
                return object;
            }
            catch (Exception exception2) {
                try {
                    Object object = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                    ((AccessibleObject)object).setAccessible(true);
                    object = new m((Method)object){
                        final Method a;
                        {
                            this.a = method;
                        }

                        @Override
                        public <T> T e(Class<T> clazz) throws Exception {
                            m.b(clazz);
                            return (T)this.a.invoke(null, clazz, Object.class);
                        }
                    };
                    return object;
                }
                catch (Exception exception3) {
                    return new m(){

                        @Override
                        public <T> T e(Class<T> clazz) {
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("Cannot allocate ");
                            stringBuilder.append(clazz);
                            stringBuilder.append(". Usage of JDK sun.misc.Unsafe is enabled, but it could not be used. Make sure your runtime is configured correctly.");
                            throw new UnsupportedOperationException(stringBuilder.toString());
                        }
                    };
                }
            }
        }
    }

    public abstract <T> T e(Class<T> var1) throws Exception;
}

