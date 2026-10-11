/*
 * Decompiled with CFR 0.152.
 */
package ax.Y8;

import java.util.Collection;
import java.util.EnumSet;
import java.util.Set;

public interface c<E extends Enum<E>> {
    public long getValue();

    public static class a {
        public static <E extends Enum<E>> E a(E e8, E e9) {
            if (e8 != null) {
                return e8;
            }
            return e9;
        }

        public static <E extends Enum<E>> Set<E> b(Set<E> set, Class<E> clazz) {
            Set<E> set2 = set;
            if (set == null) {
                set2 = EnumSet.noneOf(clazz);
            }
            return set2;
        }

        public static <E extends c<?>> boolean c(long l8, E e8) {
            return (l8 & e8.getValue()) > 0L;
        }

        public static <E extends Enum<E>> EnumSet<E> d(long l8, Class<E> enumArray) {
            if (c.class.isAssignableFrom((Class<?>)enumArray)) {
                EnumSet<Enum> enumSet = EnumSet.noneOf(enumArray);
                for (Enum enum_ : (Enum[])enumArray.getEnumConstants()) {
                    if (!a.c(l8, (c)((Object)enum_))) continue;
                    enumSet.add(enum_);
                }
                return enumSet;
            }
            throw new IllegalArgumentException("Can only be used with EnumWithValue enums.");
        }

        public static <E extends Enum<E>> long e(Collection<E> object) {
            object = object.iterator();
            long l8 = 0L;
            while (object.hasNext()) {
                Enum enum_ = (Enum)object.next();
                if (enum_ instanceof c) {
                    l8 |= ((c)((Object)enum_)).getValue();
                    continue;
                }
                throw new IllegalArgumentException("Can only be used with EnumWithValue enums.");
            }
            return l8;
        }

        /*
         * WARNING - void declaration
         */
        public static <E extends c<?>> E f(long l8, Class<E> object2, E e8) {
            Object var3_4;
            for (c c8 : (c[])((Class)object2).getEnumConstants()) {
                if (c8.getValue() != l8) continue;
                return (E)c8;
            }
            return var3_4;
        }
    }
}

