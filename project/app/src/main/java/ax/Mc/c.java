/*
 * Decompiled with CFR 0.152.
 */
package ax.Mc;

import ax.Mc.a;
import ax.Mc.b;
import java.util.function.Function;

public final class c {
    private static final j.OpenOption[] a;
    private static final j.OpenOption[] b;
    public static final j.CopyOption[] c;
    public static final a[] d;
    public static final j.FileAttribute<?>[] e;
    public static final j.FileVisitOption[] f;
    public static final j.LinkOption[] g;
    @Deprecated
    public static final j.LinkOption[] h;
    static final j.LinkOption i;
    public static final j.OpenOption[] j;
    public static final j.Path[] k;

    static {
        j.StandardOpenOption standardOpenOption = j.StandardOpenOption.CREATE;
        a = new j.OpenOption[]{standardOpenOption, j.StandardOpenOption.TRUNCATE_EXISTING};
        b = new j.OpenOption[]{standardOpenOption, j.StandardOpenOption.APPEND};
        c = new j.CopyOption[0];
        d = new a[0];
        e = new j.FileAttribute[0];
        f = new j.FileVisitOption[0];
        g = new j.LinkOption[0];
        h = new j.LinkOption[]{j.LinkOption.NOFOLLOW_LINKS};
        i = null;
        j = new j.OpenOption[0];
        k = new j.Path[0];
    }

    public static <R> R a(j.Path object, Function<j.Path, R> function) {
        if ((object = object != null ? object.getFileName() : null) != null) {
            return function.apply((j.Path)object);
        }
        return null;
    }

    public static String b(j.Path path) {
        return (String)ax.Mc.c.a(path, new b());
    }
}

