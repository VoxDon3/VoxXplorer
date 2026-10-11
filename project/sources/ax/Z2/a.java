package ax.Z2;

import android.content.Context;
import ax.X2.L;
import ax.X2.Q;
import ax.X2.v;
import ax.c3.d0;
import ax.u3.AbstractC3199q;
import com.voxdon.xplorer.file.AbstractC3595n;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public class a {

    /* renamed from: ax.Z2.a$a, reason: collision with other inner class name */
    class C0230a implements FilenameFilter {
        C0230a() {
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return str.contains("thumbnail");
        }
    }

    public static class b extends AbstractC3199q<Void, Void, Void> {
        Context h;

        public b(Context context) {
            super(AbstractC3199q.e.LOW);
            this.h = context.getApplicationContext();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public Void g(Void... voidArr) {
            a.b(this.h);
            j.F().w();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Context context) {
        File t;
        long currentTimeMillis = System.currentTimeMillis();
        File n = n(context);
        if (n != null) {
            e(n, currentTimeMillis - 3600000);
        }
        if (Q.L() && (t = ax.Q2.e.t(context)) != null && t.exists()) {
            g(t, currentTimeMillis, true);
            t.delete();
        }
        File k = k(context);
        if (k != null && k.exists()) {
            g(k, currentTimeMillis - 691200000, false);
        }
        File h = h(context);
        if (h == null || !h.exists()) {
            return;
        }
        c(h, currentTimeMillis - 1209600000);
    }

    private static void c(File file, long j) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (!"temp".equals(file2.getName()) && !"localcache".equals(file2.getName())) {
                    e(file2, j);
                }
            }
        }
    }

    private static void d(File file, long j, L l) {
        try {
            v.l(file.getAbsolutePath(), l);
            if (l.d < j) {
                file.delete();
            }
        } catch (Exception unused) {
            if (file.lastModified() < j) {
                file.delete();
            }
        }
    }

    private static void e(File file, long j) {
        L l = new L();
        if (!file.isDirectory()) {
            d(file, j, l);
            return;
        }
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    e(file2, j);
                } else {
                    d(file2, j, l);
                }
            }
            String[] list = file.list();
            if (list == null || list.length != 0 || file.lastModified() >= j) {
                return;
            }
            file.delete();
        }
    }

    public static boolean f(File file, boolean z) {
        File[] listFiles;
        if (!file.exists() || (listFiles = file.listFiles()) == null) {
            return false;
        }
        boolean z2 = true;
        for (File file2 : listFiles) {
            if (file2.isDirectory()) {
                f(file2, false);
            }
            if (!file2.delete()) {
                z2 = false;
            }
        }
        if (!z || file.delete()) {
            return z2;
        }
        return false;
    }

    private static void g(File file, long j, boolean z) {
        String[] list;
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            File file2 = null;
            for (File file3 : listFiles) {
                if (".nomedia".equals(file3.getName())) {
                    file2 = file3;
                } else {
                    e(file3, j);
                }
            }
            if (!z || file2 == null || (list = file.list()) == null || list.length != 1) {
                return;
            }
            file2.delete();
        }
    }

    public static File h(Context context) {
        return ax.Q2.e.k(context);
    }

    public static File i(Context context, ax.Q2.f fVar, int i) {
        File file = new File(d0.Q(d0.Q(k(context).getAbsolutePath(), fVar.I()), String.valueOf(i)));
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static File j(Context context, AbstractC3595n abstractC3595n) {
        File file = new File(i(context, abstractC3595n.P(), abstractC3595n.L()), String.valueOf(abstractC3595n.T().hashCode()));
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static File k(Context context) {
        return Q.L() ? ax.Q2.e.o(context) : new File(h(context), "localcache");
    }

    public static File l(Context context, AbstractC3595n abstractC3595n) {
        File file = new File(d0.Q(d0.Q(n(context).getAbsolutePath(), abstractC3595n.P().I()), String.valueOf(abstractC3595n.L()) + "/" + abstractC3595n.T().hashCode()));
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static File m(Context context, String str) {
        File file = new File(n(context), str);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static File n(Context context) {
        return new File(h(context), "temp");
    }

    public static ArrayList<File> o(Context context) {
        File[] listFiles;
        File C = ax.Q2.e.C(context);
        ArrayList<File> arrayList = new ArrayList<>();
        if (C != null && (listFiles = C.listFiles(new C0230a())) != null) {
            Collections.addAll(arrayList, listFiles);
        }
        return arrayList;
    }

    public static boolean p(Context context, String str) {
        return d0.I(k(context).getAbsolutePath(), str);
    }
}
