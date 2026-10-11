/*
 * Decompiled with CFR 0.152.
 */
package ax.Nc;

import ax.Lc.b;
import ax.Lc.c;
import ax.Nc.a;
import ax.Nc.d;
import java.io.File;
import java.io.Serializable;
import java.util.function.Predicate;

public class e
extends a
implements Serializable {
    private final String[] d0;
    private final c e0;

    private e(c c8, String ... stringArray) {
        this.d0 = (String[])e.j(stringArray).clone();
        this.e0 = c.l(c8, c.d0);
    }

    @Deprecated
    public e(String string, c c8) {
        this(c8, string);
    }

    public static /* synthetic */ boolean h(e e8, String string, String string2) {
        return b.c(string, string2, e8.e0);
    }

    private boolean i(String string) {
        return j.Stream._CC.of((Object[])this.d0).anyMatch((Predicate)new d(this, string));
    }

    private static <T> T j(T t8) {
        j.Objects.requireNonNull(t8, (String)"wildcards");
        return t8;
    }

    @Override
    public j.FileVisitResult a(j.Path path, j.BasicFileAttributes basicFileAttributes) {
        return this.e(this.i(ax.Mc.c.b(path)));
    }

    @Override
    public boolean accept(File file) {
        return this.i(file.getName());
    }

    @Override
    public boolean accept(File file, String string) {
        return this.i(string);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        stringBuilder.append("(");
        this.b(this.d0, stringBuilder);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

