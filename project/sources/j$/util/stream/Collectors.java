package j$.util.stream;

import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.function.ToLongFunction;

/* loaded from: classes2.dex */
public final class Collectors {
    public static final Set a;
    public static final Set b;
    public static final Set c;

    static {
        EnumC3858h enumC3858h = EnumC3858h.CONCURRENT;
        EnumC3858h enumC3858h2 = EnumC3858h.UNORDERED;
        EnumC3858h enumC3858h3 = EnumC3858h.IDENTITY_FINISH;
        Collections.unmodifiableSet(EnumSet.of(enumC3858h, enumC3858h2, enumC3858h3));
        Collections.unmodifiableSet(EnumSet.of(enumC3858h, enumC3858h2));
        a = Collections.unmodifiableSet(EnumSet.of(enumC3858h3));
        b = Collections.unmodifiableSet(EnumSet.of(enumC3858h2, enumC3858h3));
        c = Collections.EMPTY_SET;
        Collections.unmodifiableSet(EnumSet.of(enumC3858h2));
    }

    public static <T> Collector<T, ?, List<T>> toList() {
        return new C3873k(new j$.desugar.sun.nio.fs.m(11), new j$.desugar.sun.nio.fs.m(12), new j$.desugar.sun.nio.fs.m(19), a);
    }

    public static <T> Collector<T, ?, Set<T>> toSet() {
        return new C3873k(new j$.desugar.sun.nio.fs.m(16), new j$.desugar.sun.nio.fs.m(17), new j$.desugar.sun.nio.fs.m(21), b);
    }

    public static <T> Collector<T, ?, Long> summingLong(ToLongFunction<? super T> toLongFunction) {
        return new C3873k(new j$.desugar.sun.nio.fs.m(22), new j$.desugar.sun.nio.fs.g(7, toLongFunction), new j$.desugar.sun.nio.fs.m(23), new j$.desugar.sun.nio.fs.m(24), c);
    }

    public static void a(double[] dArr, double d) {
        double d2 = d - dArr[1];
        double d3 = dArr[0];
        double d4 = d3 + d2;
        dArr[1] = (d4 - d3) - d2;
        dArr[0] = d4;
    }
}
