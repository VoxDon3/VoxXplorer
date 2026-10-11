/*
 * Decompiled with CFR 0.152.
 */
package ax.gc;

import ax.gc.b;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class d {
    public static void a(Class classArray, Collection<Class> collection) {
        for (Class<?> clazz : classArray.getInterfaces()) {
            collection.add(clazz);
            d.a(clazz, collection);
        }
    }

    public static boolean b(Method[] methodArray, Method method) {
        int n8 = methodArray.length;
        for (int i8 = 0; i8 < n8; ++i8) {
            if (!d.i(method, methodArray[i8])) continue;
            return true;
        }
        return false;
    }

    public static <A extends Annotation> A c(AnnotatedElement annotatedElement, Class<A> clazz) {
        return d.d(annotatedElement, clazz, new HashSet<AnnotatedElement>());
    }

    private static <A extends Annotation> A d(AnnotatedElement annotatedElement, Class<A> clazz, Set<AnnotatedElement> set) {
        if (set.contains(annotatedElement)) {
            return null;
        }
        set.add(annotatedElement);
        Object object = annotatedElement.getAnnotation(clazz);
        if (object != null) {
            return object;
        }
        object = annotatedElement.getAnnotations();
        int n8 = ((A)object).length;
        for (int i8 = 0; i8 < n8; ++i8) {
            annotatedElement = d.d(object[i8].annotationType(), clazz, set);
            if (annotatedElement == null) continue;
            return (A)annotatedElement;
        }
        return null;
    }

    /*
     * Unable to fully structure code
     */
    public static void e(b<Method> var0, Class<?> var1_1, ArrayList<Method> var2_2) {
        ** try [egrp 0[TRYBLOCK] [0 : 0->11)] { 
lbl2:
        // 3 sources

        for (Method var5_6 : var1_1.getDeclaredMethods()) {
            try {
                if (!var0.apply(var5_6)) continue;
                var2_2.add(var5_6);
                continue;
            }
lbl8:
            // 2 sources

            catch (Exception var5_7) {}
            break;
        }
        if (!var1_1.equals(Object.class)) {
            d.e(var0, var1_1.getSuperclass(), var2_2);
        }
    }

    public static Method[] f(b<Method> methodArray, Class<?> clazz) {
        ArrayList<Method> arrayList = new ArrayList<Method>();
        d.e(methodArray, clazz, arrayList);
        methodArray = new Method[arrayList.size()];
        arrayList.toArray(methodArray);
        return methodArray;
    }

    public static Method g(Method method, Class clazz) {
        while (!clazz.equals(method.getDeclaringClass())) {
            try {
                Method method2 = clazz.getDeclaredMethod(method.getName(), method.getParameterTypes());
                return method2;
            }
            catch (NoSuchMethodException noSuchMethodException) {
                clazz = clazz.getSuperclass();
            }
        }
        return null;
    }

    public static Class[] h(Class object) {
        ArrayList<Class> arrayList = new ArrayList<Class>();
        d.a((Class)object, arrayList);
        while (!object.equals(Object.class) && !object.isInterface()) {
            arrayList.add(object.getSuperclass());
            object = object.getSuperclass();
            d.a((Class)object, arrayList);
        }
        object = new Class[arrayList.size()];
        arrayList.toArray((T[])object);
        return object;
    }

    private static boolean i(Method classArray, Method classArray2) {
        if (!classArray.getDeclaringClass().equals(classArray2.getDeclaringClass()) && classArray.getDeclaringClass().isAssignableFrom(classArray2.getDeclaringClass()) && classArray.getName().equals(classArray2.getName())) {
            classArray = classArray.getParameterTypes();
            classArray2 = classArray2.getParameterTypes();
            for (int i8 = 0; i8 < classArray2.length; ++i8) {
                if (classArray[i8].equals(classArray2[i8])) continue;
                return false;
            }
            return true;
        }
        return false;
    }
}

