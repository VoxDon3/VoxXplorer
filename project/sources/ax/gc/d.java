package ax.gc;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes3.dex */
public class d {
    public static void a(Class cls, Collection<Class> collection) {
        for (Class<?> cls2 : cls.getInterfaces()) {
            collection.add(cls2);
            a(cls2, collection);
        }
    }

    public static boolean b(Method[] methodArr, Method method) {
        for (Method method2 : methodArr) {
            if (i(method, method2)) {
                return true;
            }
        }
        return false;
    }

    public static <A extends Annotation> A c(AnnotatedElement annotatedElement, Class<A> cls) {
        return (A) d(annotatedElement, cls, new HashSet());
    }

    private static <A extends Annotation> A d(AnnotatedElement annotatedElement, Class<A> cls, Set<AnnotatedElement> set) {
        if (set.contains(annotatedElement)) {
            return null;
        }
        set.add(annotatedElement);
        A a = (A) annotatedElement.getAnnotation(cls);
        if (a != null) {
            return a;
        }
        for (Annotation annotation : annotatedElement.getAnnotations()) {
            A a2 = (A) d(annotation.annotationType(), cls, set);
            if (a2 != null) {
                return a2;
            }
        }
        return null;
    }

    public static void e(InterfaceC2136b<Method> interfaceC2136b, Class<?> cls, ArrayList<Method> arrayList) {
        try {
            for (Method method : cls.getDeclaredMethods()) {
                if (interfaceC2136b.apply(method)) {
                    arrayList.add(method);
                }
            }
        } catch (Exception unused) {
        }
        if (cls.equals(Object.class)) {
            return;
        }
        e(interfaceC2136b, cls.getSuperclass(), arrayList);
    }

    public static Method[] f(InterfaceC2136b<Method> interfaceC2136b, Class<?> cls) {
        ArrayList arrayList = new ArrayList();
        e(interfaceC2136b, cls, arrayList);
        Method[] methodArr = new Method[arrayList.size()];
        arrayList.toArray(methodArr);
        return methodArr;
    }

    public static Method g(Method method, Class cls) {
        while (!cls.equals(method.getDeclaringClass())) {
            try {
                return cls.getDeclaredMethod(method.getName(), method.getParameterTypes());
            } catch (NoSuchMethodException unused) {
                cls = cls.getSuperclass();
            }
        }
        return null;
    }

    public static Class[] h(Class cls) {
        ArrayList arrayList = new ArrayList();
        a(cls, arrayList);
        while (!cls.equals(Object.class) && !cls.isInterface()) {
            arrayList.add(cls.getSuperclass());
            cls = cls.getSuperclass();
            a(cls, arrayList);
        }
        Class[] clsArr = new Class[arrayList.size()];
        arrayList.toArray(clsArr);
        return clsArr;
    }

    private static boolean i(Method method, Method method2) {
        if (method.getDeclaringClass().equals(method2.getDeclaringClass()) || !method.getDeclaringClass().isAssignableFrom(method2.getDeclaringClass()) || !method.getName().equals(method2.getName())) {
            return false;
        }
        Class<?>[] parameterTypes = method.getParameterTypes();
        Class<?>[] parameterTypes2 = method2.getParameterTypes();
        for (int i = 0; i < parameterTypes2.length; i++) {
            if (!parameterTypes[i].equals(parameterTypes2[i])) {
                return false;
            }
        }
        return true;
    }
}
