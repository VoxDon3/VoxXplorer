/*
 * Decompiled with CFR 0.152.
 */
package ax.t8;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Properties;

public final class b {
    static final Type[] a = new Type[0];

    public static GenericArrayType a(Type type) {
        return new a(type);
    }

    public static Type b(Type type) {
        if (type instanceof Class) {
            if (((Class)(type = (Class)type)).isArray()) {
                return new a(b.b(((Class)type).getComponentType()));
            }
            return type;
        }
        if (type instanceof ParameterizedType) {
            type = (ParameterizedType)type;
            return new b(type.getOwnerType(), type.getRawType(), type.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            return new a(((GenericArrayType)type).getGenericComponentType());
        }
        if (type instanceof WildcardType) {
            type = (WildcardType)type;
            return new c(type.getUpperBounds(), type.getLowerBounds());
        }
        return type;
    }

    static void c(Type type) {
        boolean bl = !(type instanceof Class) || !((Class)type).isPrimitive();
        ax.t8.a.a(bl);
    }

    private static Class<?> d(TypeVariable<?> typeVariable) {
        if ((typeVariable = typeVariable.getGenericDeclaration()) instanceof Class) {
            return (Class)((Object)typeVariable);
        }
        return null;
    }

    private static boolean e(Object object, Object object2) {
        return object == object2 || object != null && object.equals(object2);
        {
        }
    }

    public static boolean f(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            type = (ParameterizedType)type;
            type2 = (ParameterizedType)type2;
            return b.e(type.getOwnerType(), type2.getOwnerType()) && type.getRawType().equals(type2.getRawType()) && Arrays.equals(type.getActualTypeArguments(), type2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (!(type2 instanceof GenericArrayType)) {
                return false;
            }
            type = (GenericArrayType)type;
            type2 = (GenericArrayType)type2;
            return b.f(type.getGenericComponentType(), type2.getGenericComponentType());
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

    public static Type g(Type type) {
        if (type instanceof GenericArrayType) {
            return ((GenericArrayType)type).getGenericComponentType();
        }
        return ((Class)type).getComponentType();
    }

    public static Type h(Type type, Class<?> clazz) {
        if ((type = b.l(type, clazz, Collection.class)) instanceof ParameterizedType) {
            return ((ParameterizedType)type).getActualTypeArguments()[0];
        }
        return Object.class;
    }

    private static Type i(Type object, Class<?> object2, Class<?> clazz) {
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
                return b.i(((Class)object2).getGenericInterfaces()[i8], object[i8], clazz);
            }
        }
        if (!((Class)object2).isInterface()) {
            while (object2 != Object.class) {
                object = ((Class)object2).getSuperclass();
                if (object == clazz) {
                    return ((Class)object2).getGenericSuperclass();
                }
                if (clazz.isAssignableFrom((Class<?>)object)) {
                    return b.i(((Class)object2).getGenericSuperclass(), object, clazz);
                }
                object2 = object;
            }
        }
        return clazz;
    }

    public static Type[] j(Type type, Class<?> clazz) {
        if (type == Properties.class) {
            return new Type[]{String.class, String.class};
        }
        if ((type = b.l(type, clazz, Map.class)) instanceof ParameterizedType) {
            return ((ParameterizedType)type).getActualTypeArguments();
        }
        return new Type[]{Object.class, Object.class};
    }

    public static Class<?> k(Type type) {
        if (type instanceof Class) {
            return (Class)type;
        }
        if (type instanceof ParameterizedType) {
            type = ((ParameterizedType)type).getRawType();
            ax.t8.a.a(type instanceof Class);
            return (Class)type;
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance(b.k(((GenericArrayType)type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return b.k(((WildcardType)type).getUpperBounds()[0]);
        }
        String string = type == null ? "null" : type.getClass().getName();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Expected a Class, ParameterizedType, or GenericArrayType, but <");
        stringBuilder.append(type);
        stringBuilder.append("> is of type ");
        stringBuilder.append(string);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    private static Type l(Type type, Class<?> clazz, Class<?> clazz2) {
        Type type2 = type;
        if (type instanceof WildcardType) {
            type2 = ((WildcardType)type).getUpperBounds()[0];
        }
        ax.t8.a.a(clazz2.isAssignableFrom(clazz));
        return b.o(type2, clazz, b.i(type2, clazz, clazz2));
    }

    private static int m(Object[] objectArray, Object object) {
        int n8 = objectArray.length;
        for (int i8 = 0; i8 < n8; ++i8) {
            if (!object.equals(objectArray[i8])) continue;
            return i8;
        }
        throw new NoSuchElementException();
    }

    public static ParameterizedType n(Type type, Type type2, Type ... typeArray) {
        return new b(type, type2, typeArray);
    }

    public static Type o(Type type, Class<?> clazz, Type type2) {
        return b.p(type, clazz, type2, new HashMap());
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static Type p(Type type, Class<?> clazz, Type object, Map<TypeVariable<?>, Type> map) {
        Object var2_30;
        Object var11_51;
        Type var3_31;
        block15: {
            Object var9_33;
            Type type2;
            Object object2;
            block22: {
                block21: {
                    block18: {
                        block19: {
                            block20: {
                                block16: {
                                    block17: {
                                        Class clazz2;
                                        Object var9_32 = null;
                                        object2 = object;
                                        while (object2 instanceof TypeVariable) {
                                            Object var2_8;
                                            TypeVariable typeVariable = (TypeVariable)object2;
                                            Type type3 = (Type)var3_31.get(typeVariable);
                                            type2 = Void.TYPE;
                                            if (type3 != null) {
                                                if (type3 == type2) {
                                                    return object2;
                                                }
                                                return type3;
                                            }
                                            var3_31.put(typeVariable, type2);
                                            void var2_6 = var9_33;
                                            if (var9_33 == null) {
                                                TypeVariable typeVariable2 = typeVariable;
                                            }
                                            type2 = b.q(type, clazz, typeVariable);
                                            void var9_34 = var2_8;
                                            object2 = type2;
                                            if (type2 != typeVariable) continue;
                                            void var11_37 = var2_8;
                                            Type type4 = type2;
                                            break block15;
                                        }
                                        if (!(object2 instanceof Class) || !(clazz2 = (Class)object2).isArray()) break block16;
                                        object2 = clazz2.getComponentType();
                                        if (!b.e(object2, type = b.p(type, clazz, (Type)object2, var3_31))) break block17;
                                        void var11_38 = var9_33;
                                        break block15;
                                    }
                                    type = b.a(type);
                                    break block18;
                                }
                                if (!(object2 instanceof GenericArrayType)) break block19;
                                GenericArrayType genericArrayType = (GenericArrayType)object2;
                                if (!b.e(object2 = genericArrayType.getGenericComponentType(), type = b.p(type, clazz, (Type)object2, var3_31))) break block20;
                                void var11_41 = var9_33;
                                break block15;
                            }
                            type = b.a(type);
                            break block18;
                        }
                        boolean bl = object2 instanceof ParameterizedType;
                        if (!bl) break block21;
                        type2 = (ParameterizedType)object2;
                        Type type5 = type2.getOwnerType();
                        Type type6 = b.p(type, clazz, type5, var3_31);
                        boolean bl2 = b.e(type6, type5) ^ true;
                        object2 = type2.getActualTypeArguments();
                        int n8 = ((Object)object2).length;
                        for (int i8 = 0; i8 < n8; ++i8) {
                            Object var2_21;
                            Type type7 = b.p(type, clazz, (Type)object2[i8], var3_31);
                            boolean bl3 = bl2;
                            Object object3 = object2;
                            if (!b.e(type7, object2[i8])) {
                                bl3 = bl2;
                                Object object4 = object2;
                                if (!bl2) {
                                    Type[] typeArray = (Type[])object2.clone();
                                    bl3 = true;
                                }
                                var2_20[i8] = type7;
                            }
                            bl2 = bl3;
                            object2 = var2_21;
                        }
                        void var11_44 = var9_33;
                        Type type8 = type2;
                        if (!bl2) break block15;
                        type = b.n(type6, type2.getRawType(), (Type[])object2);
                    }
                    void var11_40 = var9_33;
                    Type type9 = type;
                    break block15;
                }
                void var11_45 = var9_33;
                Object object5 = object2;
                if (!(object2 instanceof WildcardType)) break block15;
                object2 = (WildcardType)object2;
                Type[] typeArray = object2.getLowerBounds();
                type2 = object2.getUpperBounds();
                if (typeArray.length != 1) break block22;
                type = b.p(type, clazz, typeArray[0], var3_31);
                void var11_46 = var9_33;
                Object object6 = object2;
                if (type != typeArray[0]) {
                    WildcardType wildcardType = b.s(type);
                    void var11_47 = var9_33;
                }
                break block15;
            }
            void var11_48 = var9_33;
            Object object7 = object2;
            if (((Type)type2).length == 1) {
                Type type10 = type2[0];
                type = b.p(type, clazz, type10, var3_31);
                void var11_49 = var9_33;
                Object object8 = object2;
                if (type != type2[0]) {
                    WildcardType wildcardType = b.r(type);
                    void var11_50 = var9_33;
                }
            }
        }
        if (var11_51 != null) {
            var3_31.put(var11_51, var2_30);
        }
        return var2_30;
    }

    private static Type q(Type type, Class<?> clazz, TypeVariable<?> typeVariable) {
        Class<?> clazz2 = b.d(typeVariable);
        if (clazz2 != null && (type = b.i(type, clazz, clazz2)) instanceof ParameterizedType) {
            int n8 = b.m(clazz2.getTypeParameters(), typeVariable);
            return ((ParameterizedType)type).getActualTypeArguments()[n8];
        }
        return typeVariable;
    }

    public static WildcardType r(Type typeArray) {
        typeArray = typeArray instanceof WildcardType ? ((WildcardType)typeArray).getUpperBounds() : new Type[]{typeArray};
        return new c(typeArray, a);
    }

    public static WildcardType s(Type typeArray) {
        typeArray = typeArray instanceof WildcardType ? ((WildcardType)typeArray).getLowerBounds() : new Type[]{typeArray};
        return new c(new Type[]{Object.class}, typeArray);
    }

    public static String t(Type type) {
        if (type instanceof Class) {
            return ((Class)type).getName();
        }
        return type.toString();
    }

    private static final class a
    implements GenericArrayType,
    Serializable {
        private final Type q;

        public a(Type type) {
            this.q = b.b(type);
        }

        public boolean equals(Object object) {
            return object instanceof GenericArrayType && b.f(this, (GenericArrayType)object);
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
            stringBuilder.append(b.t(this.q));
            stringBuilder.append("[]");
            return stringBuilder.toString();
        }
    }

    private static final class b
    implements ParameterizedType,
    Serializable {
        private final Type c0;
        private final Type[] d0;
        private final Type q;

        public b(Type object, Type type, Type ... typeArray) {
            int n8;
            boolean bl = type instanceof Class;
            int n9 = 0;
            if (bl) {
                Class clazz = (Class)type;
                bl = Modifier.isStatic(clazz.getModifiers());
                boolean bl2 = true;
                n8 = !bl && clazz.getEnclosingClass() != null ? 0 : 1;
                bl = bl2;
                if (object == null) {
                    bl = n8 != 0 ? bl2 : false;
                }
                ax.t8.a.a(bl);
            }
            object = object == null ? null : b.b((Type)object);
            this.q = object;
            this.c0 = b.b(type);
            object = (Type[])typeArray.clone();
            this.d0 = object;
            int n10 = ((Type[])object).length;
            for (n8 = n9; n8 < n10; ++n8) {
                ax.t8.a.b(this.d0[n8]);
                b.c(this.d0[n8]);
                object = this.d0;
                object[n8] = b.b(object[n8]);
            }
        }

        private static int a(Object object) {
            if (object != null) {
                return object.hashCode();
            }
            return 0;
        }

        public boolean equals(Object object) {
            return object instanceof ParameterizedType && b.f(this, (ParameterizedType)object);
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
            return Arrays.hashCode(this.d0) ^ this.c0.hashCode() ^ b.a(this.q);
        }

        public String toString() {
            int n8 = this.d0.length;
            if (n8 == 0) {
                return b.t(this.c0);
            }
            StringBuilder stringBuilder = new StringBuilder((n8 + 1) * 30);
            stringBuilder.append(b.t(this.c0));
            stringBuilder.append("<");
            stringBuilder.append(b.t(this.d0[0]));
            for (int i8 = 1; i8 < n8; ++i8) {
                stringBuilder.append(", ");
                stringBuilder.append(b.t(this.d0[i8]));
            }
            stringBuilder.append(">");
            return stringBuilder.toString();
        }
    }

    private static final class c
    implements WildcardType,
    Serializable {
        private final Type c0;
        private final Type q;

        public c(Type[] typeArray, Type[] typeArray2) {
            int n8 = typeArray2.length;
            boolean bl = true;
            boolean bl2 = n8 <= 1;
            ax.t8.a.a(bl2);
            bl2 = typeArray.length == 1;
            ax.t8.a.a(bl2);
            if (typeArray2.length == 1) {
                ax.t8.a.b(typeArray2[0]);
                b.c(typeArray2[0]);
                bl2 = typeArray[0] == Object.class ? bl : false;
                ax.t8.a.a(bl2);
                this.c0 = b.b(typeArray2[0]);
                this.q = Object.class;
                return;
            }
            ax.t8.a.b(typeArray[0]);
            b.c(typeArray[0]);
            this.c0 = null;
            this.q = b.b(typeArray[0]);
        }

        public boolean equals(Object object) {
            return object instanceof WildcardType && b.f(this, (WildcardType)object);
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
                stringBuilder.append(b.t(this.c0));
                return stringBuilder.toString();
            }
            if (this.q == Object.class) {
                return "?";
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("? extends ");
            stringBuilder.append(b.t(this.q));
            return stringBuilder.toString();
        }
    }
}

