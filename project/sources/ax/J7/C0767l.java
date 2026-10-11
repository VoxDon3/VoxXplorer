package ax.J7;

import j$.util.Objects;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: ax.J7.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C0767l {
    private static final FilenameFilter d = new FilenameFilter() { // from class: ax.J7.j
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            boolean startsWith;
            startsWith = str.startsWith("aqs.");
            return startsWith;
        }
    };
    private static final Comparator<File> e = new Comparator() { // from class: ax.J7.k
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int compare;
            compare = Long.compare(((File) obj2).lastModified(), ((File) obj).lastModified());
            return compare;
        }
    };
    private final ax.O7.g a;
    private String b = null;
    private String c = null;

    C0767l(ax.O7.g gVar) {
        this.a = gVar;
    }

    private static void d(ax.O7.g gVar, String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        try {
            gVar.q(str, "aqs." + str2).createNewFile();
        } catch (IOException e2) {
            ax.G7.g.f().l("Failed to persist App Quality Sessions session id.", e2);
        }
    }

    static String e(ax.O7.g gVar, String str) {
        List<File> r = gVar.r(str, d);
        if (!r.isEmpty()) {
            return ((File) Collections.min(r, e)).getName().substring(4);
        }
        ax.G7.g.f().k("Unable to read App Quality Sessions session id.");
        return null;
    }

    public synchronized String c(String str) {
        if (Objects.equals(this.b, str)) {
            return this.c;
        }
        return e(this.a, str);
    }

    public synchronized void f(String str) {
        if (!Objects.equals(this.c, str)) {
            d(this.a, this.b, str);
            this.c = str;
        }
    }

    public synchronized void g(String str) {
        if (!Objects.equals(this.b, str)) {
            d(this.a, str, this.c);
            this.b = str;
        }
    }
}
