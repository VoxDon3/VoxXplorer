/*
 * Decompiled with CFR 0.152.
 */
package ax.ke;

import ax.xc.e;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.NoSuchElementException;
import okhttp3.ResponseBody;

final class I {
    static final Type[] a = new Type[0];

    static ResponseBody a(ResponseBody responseBody) throws IOException {
        e e8 = new e();
        responseBody.source().J0(e8);
        return ResponseBody.create(responseBody.contentType(), responseBody.contentLength(), e8);
    }

    static void b(Type type) {
        if (type instanceof Class && ((Class)type).isPrimitive()) {
            throw new IllegalArgumentException();
        }
    }

    private static Class<?> c(TypeVariable<?> typeVariable) {
        if ((typeVariable = typeVariable.getGenericDeclaration()) instanceof Class) {
            return (Class)((Object)typeVariable);
        }
        return null;
    }

    static boolean d(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            Type type3;
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            type = (ParameterizedType)type;
            ParameterizedType parameterizedType = (ParameterizedType)type2;
            type2 = type.getOwnerType();
            return (type2 == (type3 = parameterizedType.getOwnerType()) || type2 != null && type2.equals(type3)) && type.getRawType().equals(parameterizedType.getRawType()) && Arrays.equals(type.getActualTypeArguments(), parameterizedType.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (!(type2 instanceof GenericArrayType)) {
                return false;
            }
            type = (GenericArrayType)type;
            type2 = (GenericArrayType)type2;
            return I.d(type.getGenericComponentType(), type2.getGenericComponentType());
        }
        if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            type = (WildcardType)type;
            type2 = (WildcardType)type2;
            return Arrays.equals(type.getUpperBounds(), type2.getUpperBounds()) && Arrays.equals(type.getLowerBounds(), type2.getLowerBounds());
        }
        if (type instanceof TypeVariable) {
            if (!(type2 instanceof TypeVariable)) {
                return false;
            }
            type = (TypeVariable)type;
            type2 = (TypeVariable)type2;
            if (type.getGenericDeclaration() == type2.getGenericDeclaration() && type.getName().equals(type2.getName())) {
                return true;
            }
        }
        return false;
    }

    static Type e(Type object, Class<?> object2, Class<?> clazz) {
        if (clazz == object2) {
            return object;
        }
        if (clazz.isInterface()) {
            object = ((Class)object2).getInterfaces();
            int n8 = ((Class<?>[])object).length;
            for (int i8 = 0; i8 < n8; ++i8) {
                Class<?> clazz2 = object[i8];
                if (clazz2 == clazz) {
                    return ((Class)object2).getGenericInterfaces()[i8];
                }
                if (!clazz.isAssignableFrom(clazz2)) continue;
                return I.e(((Class)object2).getGenericInterfaces()[i8], object[i8], clazz);
            }
        }
        if (!((Class)object2).isInterface()) {
            while (object2 != Object.class) {
                object = ((Class)object2).getSuperclass();
                if (object == clazz) {
                    return ((Class)object2).getGenericSuperclass();
                }
                if (clazz.isAssignableFrom((Class<?>)object)) {
                    return I.e(((Class)object2).getGenericSuperclass(), object, clazz);
                }
                object2 = object;
            }
        }
        return clazz;
    }

    static Type f(int n8, ParameterizedType type) {
        Type type2 = type.getActualTypeArguments()[n8];
        type = type2;
        if (type2 instanceof WildcardType) {
            type = ((WildcardType)type2).getLowerBounds()[0];
        }
        return type;
    }

    static Type g(int n8, ParameterizedType object) {
        Object object2 = object.getActualTypeArguments();
        if (n8 >= 0 && n8 < ((Type[])object2).length) {
            object = object2 = object2[n8];
            if (object2 instanceof WildcardType) {
                object = ((WildcardType)object2).getUpperBounds()[0];
            }
            return object;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Index ");
        stringBuilder.append(n8);
        stringBuilder.append(" not in range [0,");
        stringBuilder.append(((Type[])object2).length);
        stringBuilder.append(") for ");
        stringBuilder.append(object);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    static Class<?> h(Type type) {
        j.Objects.requireNonNull((Object)type, (String)"type == null");
        if (type instanceof Class) {
            return (Class)type;
        }
        if (type instanceof ParameterizedType) {
            if ((type = ((ParameterizedType)type).getRawType()) instanceof Class) {
                return (Class)type;
            }
            throw new IllegalArgumentException();
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance(I.h(((GenericArrayType)type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return I.h(((WildcardType)type).getUpperBounds()[0]);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Expected a Class, ParameterizedType, or GenericArrayType, but <");
        stringBuilder.append(type);
        stringBuilder.append("> is of type ");
        stringBuilder.append(type.getClass().getName());
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    static Type i(Type type, Class<?> clazz, Class<?> clazz2) {
        if (clazz2.isAssignableFrom(clazz)) {
            return I.q(type, clazz, I.e(type, clazz, clazz2));
        }
        throw new IllegalArgumentException();
    }

    static boolean j(Type typeArray) {
        if (typeArray instanceof Class) {
            return false;
        }
        if (typeArray instanceof ParameterizedType) {
            typeArray = ((ParameterizedType)typeArray).getActualTypeArguments();
            int n8 = typeArray.length;
            for (int i8 = 0; i8 < n8; ++i8) {
                if (!I.j(typeArray[i8])) continue;
                return true;
            }
            return false;
        }
        if (typeArray instanceof GenericArrayType) {
            return I.j(((GenericArrayType)typeArray).getGenericComponentType());
        }
        if (typeArray instanceof TypeVariable) {
            return true;
        }
        if (typeArray instanceof WildcardType) {
            return true;
        }
        String string = typeArray == null ? "null" : typeArray.getClass().getName();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Expected a Class, ParameterizedType, or GenericArrayType, but <");
        stringBuilder.append(typeArray);
        stringBuilder.append("> is of type ");
        stringBuilder.append(string);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    private static int k(Object[] objectArray, Object object) {
        for (int i8 = 0; i8 < objectArray.length; ++i8) {
            if (!object.equals(objectArray[i8])) continue;
            return i8;
        }
        throw new NoSuchElementException();
    }

    static boolean l(Annotation[] annotationArray, Class<? extends Annotation> clazz) {
        int n8 = annotationArray.length;
        for (int i8 = 0; i8 < n8; ++i8) {
            if (!clazz.isInstance(annotationArray[i8])) continue;
            return true;
        }
        return false;
    }

    static RuntimeException m(Method method, String string, Object ... objectArray) {
        return I.n(method, null, string, objectArray);
    }

    static RuntimeException n(Method method, Throwable throwable, String charSequence, Object ... object) {
        object = String.format((String)charSequence, object);
        charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append((String)object);
        ((StringBuilder)charSequence).append("\n    for method ");
        ((StringBuilder)charSequence).append(method.getDeclaringClass().getSimpleName());
        ((StringBuilder)charSequence).append(".");
        ((StringBuilder)charSequence).append(method.getName());
        return new IllegalArgumentException(((StringBuilder)charSequence).toString(), throwable);
    }

    static RuntimeException o(Method method, int n8, String string, Object ... objectArray) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append(" (parameter #");
        stringBuilder.append(n8 + 1);
        stringBuilder.append(")");
        return I.m(method, stringBuilder.toString(), objectArray);
    }

    static RuntimeException p(Method method, Throwable throwable, int n8, String string, Object ... objectArray) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append(" (parameter #");
        stringBuilder.append(n8 + 1);
        stringBuilder.append(")");
        return I.n(method, throwable, stringBuilder.toString(), objectArray);
    }

    static Type q(Type type, Class<?> typeArray, Type type2) {
        Type type3;
        int n8 = 0;
        while (type2 instanceof TypeVariable) {
            type3 = (TypeVariable)type2;
            if ((type2 = I.r(type, typeArray, type3)) != type3) continue;
            return type2;
        }
        if (type2 instanceof Class && ((Class)(type3 = (Class)type2)).isArray()) {
            type2 = ((Class)type3).getComponentType();
            if (type2 == (type = I.q(type, typeArray, type2))) {
                return type3;
            }
            return new a(type);
        }
        if (type2 instanceof GenericArrayType) {
            type3 = (type2 = (GenericArrayType)type2).getGenericComponentType();
            if (type3 == (type = I.q(type, typeArray, type3))) {
                return type2;
            }
            return new a(type);
        }
        if (type2 instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType)type2;
            Type type4 = I.q(type, typeArray, type2 = parameterizedType.getOwnerType());
            boolean bl = type4 != type2;
            type2 = parameterizedType.getActualTypeArguments();
            int n9 = ((Type)type2).length;
            while (n8 < n9) {
                Type type5 = I.q(type, typeArray, type2[n8]);
                boolean bl2 = bl;
                type3 = type2;
                if (type5 != type2[n8]) {
                    bl2 = bl;
                    type3 = type2;
                    if (!bl) {
                        type3 = (Type[])type2.clone();
                        bl2 = true;
                    }
                    type3[n8] = type5;
                }
                ++n8;
                bl = bl2;
                type2 = type3;
            }
            if (bl) {
                return new b(type4, parameterizedType.getRawType(), (Type[])type2);
            }
            return parameterizedType;
        }
        type3 = type2;
        if (type2 instanceof WildcardType) {
            type2 = (WildcardType)type2;
            Type[] typeArray2 = type2.getLowerBounds();
            Type[] typeArray3 = type2.getUpperBounds();
            if (typeArray2.length == 1) {
                type = I.q(type, typeArray, typeArray2[0]);
                type3 = type2;
                if (type != typeArray2[0]) {
                    return new c(new Type[]{Object.class}, new Type[]{type});
                }
            } else {
                type3 = type2;
                if (typeArray3.length == 1) {
                    type3 = typeArray3[0];
                    type = I.q(type, typeArray, type3);
                    type3 = type2;
                    if (type != typeArray3[0]) {
                        typeArray = a;
                        return new c(new Type[]{type}, typeArray);
                    }
                }
            }
        }
        return type3;
    }

    private static Type r(Type type, Class<?> clazz, TypeVariable<?> typeVariable) {
        Class<?> clazz2 = I.c(typeVariable);
        if (clazz2 != null && (type = I.e(type, clazz, clazz2)) instanceof ParameterizedType) {
            int n8 = I.k(clazz2.getTypeParameters(), typeVariable);
            return ((ParameterizedType)type).getActualTypeArguments()[n8];
        }
        return typeVariable;
    }

    static void s(Throwable throwable) {
        if (!(throwable instanceof VirtualMachineError)) {
            if (!(throwable instanceof ThreadDeath)) {
                if (!(throwable instanceof LinkageError)) {
                    return;
                }
                throw (LinkageError)throwable;
            }
            throw (ThreadDeath)throwable;
        }
        throw (VirtualMachineError)throwable;
    }

    static String t(Type type) {
        if (type instanceof Class) {
            return ((Class)type).getName();
        }
        return type.toString();
    }

    private static final class a
    implements GenericArrayType {
        private final Type q;

        a(Type type) {
            this.q = type;
        }

        public boolean equals(Object object) {
            return object instanceof GenericArrayType && I.d(this, (GenericArrayType)object);
        }

        @Override
        public Type getGenericComponentType() {
            return this.q;
        }

        public int hashCode() {
            return this.q.hashCode();
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(I.t(this.q));
            stringBuilder.append("[]");
            return stringBuilder.toString();
        }
    }

    static final class b
    implements ParameterizedType {
        private final Type c0;
        private final Type[] d0;
        private final Type q;

        b(Type type, Type type2, Type ... typeArray) {
            int n8;
            int n9;
            boolean bl = type2 instanceof Class;
            int n10 = 0;
            if (bl) {
                n9 = 1;
                n8 = type == null ? 1 : 0;
                if (((Class)type2).getEnclosingClass() != null) {
                    n9 = 0;
                }
                if (n8 != n9) {
                    throw new IllegalArgumentException();
                }
            }
            n9 = typeArray.length;
            for (n8 = n10; n8 < n9; ++n8) {
                Type type3 = typeArray[n8];
                j.Objects.requireNonNull((Object)type3, (String)"typeArgument == null");
                I.b(type3);
            }
            this.q = type;
            this.c0 = type2;
            this.d0 = (Type[])typeArray.clone();
        }

        public boolean equals(Object object) {
            return object instanceof ParameterizedType && I.d(this, (ParameterizedType)object);
        }

        @Override
        public Type[] getActualTypeArguments() {
            return (Type[])this.d0.clone();
        }

        @Override
        public Type getOwnerType() {
            return this.q;
        }

        @Override
        public Type getRawType() {
            return this.c0;
        }

        public int hashCode() {
            int n8 = Arrays.hashCode(this.d0);
            int n9 = this.c0.hashCode();
            Type type = this.q;
            int n10 = type != null ? type.hashCode() : 0;
            return n8 ^ n9 ^ n10;
        }

        public String toString() {
            Object object = this.d0;
            if (((Type[])object).length == 0) {
                return I.t(this.c0);
            }
            int n8 = ((Type[])object).length;
            object = new StringBuilder((n8 + 1) * 30);
            ((StringBuilder)object).append(I.t(this.c0));
            ((StringBuilder)object).append("<");
            ((StringBuilder)object).append(I.t(this.d0[0]));
            for (int i8 = 1; i8 < this.d0.length; ++i8) {
                ((StringBuilder)object).append(", ");
                ((StringBuilder)object).append(I.t(this.d0[i8]));
            }
            ((StringBuilder)object).append(">");
            return ((StringBuilder)object).toString();
        }
    }

    private static final class c
    implements WildcardType {
        private final Type c0;
        private final Type q;

        c(Type[] typeArray, Type[] typeArray2) {
            if (typeArray2.length <= 1) {
                if (typeArray.length == 1) {
                    if (typeArray2.length == 1) {
                        typeArray2[0].getClass();
                        I.b(typeArray2[0]);
                        if (typeArray[0] == Object.class) {
                            this.c0 = typeArray2[0];
                            this.q = Object.class;
                            return;
                        }
                        throw new IllegalArgumentException();
                    }
                    typeArray[0].getClass();
                    I.b(typeArray[0]);
                    this.c0 = null;
                    this.q = typeArray[0];
                    return;
                }
                throw new IllegalArgumentException();
            }
            throw new IllegalArgumentException();
        }

        public boolean equals(Object object) {
            return object instanceof WildcardType && I.d(this, (WildcardType)object);
        }

        @Override
        public Type[] getLowerBounds() {
            Type type = this.c0;
            if (type != null) {
                return new Type[]{type};
            }
            return a;
        }

        @Override
        public Type[] getUpperBounds() {
            return new Type[]{this.q};
        }

        public int hashCode() {
            Type type = this.c0;
            int n8 = type != null ? type.hashCode() + 31 : 1;
            return n8 ^ this.q.hashCode() + 31;
        }

        public String toString() {
            if (this.c0 != null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("? super ");
                stringBuilder.append(I.t(this.c0));
                return stringBuilder.toString();
            }
            if (this.q == Object.class) {
                return "?";
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("? extends ");
            stringBuilder.append(I.t(this.q));
            return stringBuilder.toString();
        }
    }
}

