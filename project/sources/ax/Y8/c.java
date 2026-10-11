package ax.Y8;

import java.lang.Enum;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Set;

/* loaded from: classes3.dex */
public interface c<E extends Enum<E>> {

    public static class a {
        public static <E extends Enum<E>> E a(E e, E e2) {
            return e != null ? e : e2;
        }

        public static <E extends Enum<E>> Set<E> b(Set<E> set, Class<E> cls) {
            return set == null ? EnumSet.noneOf(cls) : set;
        }

        /* JADX WARN: Incorrect types in method signature: <E::Lax/Y8/c<*>;>(JTE;)Z */
        public static boolean c(long j, c cVar) {
            return (j & cVar.getValue()) > 0;
        }

        public static <E extends Enum<E>> EnumSet<E> d(long j, Class<E> cls) {
            if (!c.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("Can only be used with EnumWithValue enums.");
            }
            EnumSet<E> noneOf = EnumSet.noneOf(cls);
            for (E e : cls.getEnumConstants()) {
                if (c(j, (c) e)) {
                    noneOf.add(e);
                }
            }
            return noneOf;
        }

        public static <E extends Enum<E>> long e(Collection<E> collection) {
            long j = 0;
            for (E e : collection) {
                if (!(e instanceof c)) {
                    throw new IllegalArgumentException("Can only be used with EnumWithValue enums.");
                }
                j |= ((c) e).getValue();
            }
            return j;
        }

        /* JADX WARN: Incorrect return type in method signature: <E::Lax/Y8/c<*>;>(JLjava/lang/Class<TE;>;TE;)TE; */
        public static c f(long j, Class cls, c cVar) {
            for (c cVar2 : (c[]) cls.getEnumConstants()) {
                if (cVar2.getValue() == j) {
                    return cVar2;
                }
            }
            return cVar;
        }
    }

    long getValue();
}
