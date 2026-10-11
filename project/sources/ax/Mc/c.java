package ax.Mc;

import j$.nio.file.CopyOption;
import j$.nio.file.FileVisitOption;
import j$.nio.file.LinkOption;
import j$.nio.file.OpenOption;
import j$.nio.file.Path;
import j$.nio.file.StandardOpenOption;
import j$.nio.file.attribute.FileAttribute;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* loaded from: classes3.dex */
public final class c {
    private static final OpenOption[] a;
    private static final OpenOption[] b;
    public static final CopyOption[] c;
    public static final a[] d;
    public static final FileAttribute<?>[] e;
    public static final FileVisitOption[] f;
    public static final LinkOption[] g;

    @Deprecated
    public static final LinkOption[] h;
    static final LinkOption i;
    public static final OpenOption[] j;
    public static final Path[] k;

    static {
        StandardOpenOption standardOpenOption = StandardOpenOption.CREATE;
        a = new OpenOption[]{standardOpenOption, StandardOpenOption.TRUNCATE_EXISTING};
        b = new OpenOption[]{standardOpenOption, StandardOpenOption.APPEND};
        c = new CopyOption[0];
        d = new a[0];
        e = new FileAttribute[0];
        f = new FileVisitOption[0];
        g = new LinkOption[0];
        h = new LinkOption[]{LinkOption.NOFOLLOW_LINKS};
        i = null;
        j = new OpenOption[0];
        k = new Path[0];
    }

    public static <R> R a(Path path, Function<Path, R> function) {
        Path fileName = path != null ? path.getFileName() : null;
        if (fileName != null) {
            return function.apply(fileName);
        }
        return null;
    }

    public static String b(Path path) {
        return (String) a(path, new Function() { // from class: ax.Mc.b
            public /* synthetic */ Function andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((Path) obj).toString();
            }

            public /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }
}
