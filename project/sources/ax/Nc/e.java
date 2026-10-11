package ax.Nc;

import j$.nio.file.FileVisitResult;
import j$.nio.file.Path;
import j$.nio.file.attribute.BasicFileAttributes;
import j$.util.Objects;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.io.File;
import java.io.Serializable;
import java.util.function.Predicate;

/* loaded from: classes3.dex */
public class e extends a implements Serializable {
    private final String[] d0;
    private final ax.Lc.c e0;

    private e(ax.Lc.c cVar, String... strArr) {
        this.d0 = (String[]) ((String[]) j(strArr)).clone();
        this.e0 = ax.Lc.c.l(cVar, ax.Lc.c.SENSITIVE);
    }

    private boolean i(final String str) {
        return Stream.CC.of(this.d0).anyMatch(new Predicate() { // from class: ax.Nc.d
            public /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            public /* synthetic */ Predicate negate() {
                return Predicate$CC.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean c;
                c = ax.Lc.b.c(str, (String) obj, e.this.e0);
                return c;
            }
        });
    }

    private static <T> T j(T t) {
        Objects.requireNonNull(t, "wildcards");
        return t;
    }

    @Override // ax.Nc.a, ax.Nc.c
    public FileVisitResult a(Path path, BasicFileAttributes basicFileAttributes) {
        return e(i(ax.Mc.c.b(path)));
    }

    @Override // java.io.FileFilter
    public boolean accept(File file) {
        return i(file.getName());
    }

    @Override // ax.Nc.a
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("(");
        b(this.d0, sb);
        sb.append(")");
        return sb.toString();
    }

    @Override // java.io.FilenameFilter
    public boolean accept(File file, String str) {
        return i(str);
    }

    @Deprecated
    public e(String str, ax.Lc.c cVar) {
        this(cVar, str);
    }
}
