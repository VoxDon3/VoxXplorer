package ax.O7;

import ax.J7.AbstractC0775u;
import ax.J7.C0768m;
import ax.K7.m;
import ax.L7.F;
import ax.M7.j;
import ax.Q7.i;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;
import okhttp3.HttpUrl;

/* loaded from: classes3.dex */
public class e {
    private static final Charset e = Charset.forName("UTF-8");
    private static final int f = 15;
    private static final j g = new j();
    private static final Comparator<? super File> h = new Comparator() { // from class: ax.O7.a
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int compareTo;
            compareTo = ((File) obj2).getName().compareTo(((File) obj).getName());
            return compareTo;
        }
    };
    private static final FilenameFilter i = new FilenameFilter() { // from class: ax.O7.b
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            boolean startsWith;
            startsWith = str.startsWith("event");
            return startsWith;
        }
    };
    private final AtomicInteger a = new AtomicInteger(0);
    private final g b;
    private final i c;
    private final C0768m d;

    public e(g gVar, i iVar, C0768m c0768m) {
        this.b = gVar;
        this.c = iVar;
        this.d = c0768m;
    }

    private void A(String str, long j) {
        boolean z;
        List<File> r = this.b.r(str, i);
        if (r.isEmpty()) {
            ax.G7.g.f().i("Session " + str + " has no events.");
            return;
        }
        Collections.sort(r);
        ArrayList arrayList = new ArrayList();
        loop0: while (true) {
            z = false;
            for (File file : r) {
                try {
                    arrayList.add(g.j(y(file)));
                } catch (IOException e2) {
                    ax.G7.g.f().l("Could not add event to report for " + file, e2);
                }
                if (z || s(file.getName())) {
                    z = true;
                }
            }
        }
        if (!arrayList.isEmpty()) {
            B(this.b.q(str, "report"), arrayList, j, z, m.j(str, this.b), this.d.d(str));
        } else {
            ax.G7.g.f().k("Could not parse event files for session " + str);
        }
    }

    private void B(File file, List<F.e.d> list, long j, boolean z, String str, String str2) {
        try {
            j jVar = g;
            F r = jVar.L(y(file)).v(j, z, str).p(str2).r(list);
            F.e n = r.n();
            if (n == null) {
                return;
            }
            ax.G7.g.f().b("appQualitySessionId: " + str2);
            D(z ? this.b.l(n.i()) : this.b.n(n.i()), jVar.M(r));
        } catch (IOException e2) {
            ax.G7.g.f().l("Could not synthesize final report file for " + file, e2);
        }
    }

    private int C(String str, int i2) {
        List<File> r = this.b.r(str, new FilenameFilter() { // from class: ax.O7.c
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str2) {
                boolean t;
                t = e.t(file, str2);
                return t;
            }
        });
        Collections.sort(r, new Comparator() { // from class: ax.O7.d
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int v;
                v = e.v((File) obj, (File) obj2);
                return v;
            }
        });
        return f(r, i2);
    }

    private static void D(File file, String str) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), e);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
        } catch (Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static void E(File file, String str, long j) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), e);
        try {
            outputStreamWriter.write(str);
            file.setLastModified(h(j));
            outputStreamWriter.close();
        } catch (Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private SortedSet<String> e(String str) {
        this.b.d();
        SortedSet<String> p = p();
        if (str != null) {
            p.remove(str);
        }
        if (p.size() > 8) {
            while (p.size() > 8) {
                String last = p.last();
                ax.G7.g.f().b("Removing session over cap: " + last);
                this.b.e(last);
                p.remove(last);
            }
        }
        return p;
    }

    private static int f(List<File> list, int i2) {
        int size = list.size();
        for (File file : list) {
            if (size <= i2) {
                break;
            }
            g.u(file);
            size--;
        }
        return size;
    }

    private void g() {
        int i2 = this.c.b().a.b;
        List<File> n = n();
        int size = n.size();
        if (size <= i2) {
            return;
        }
        Iterator<File> it = n.subList(i2, size).iterator();
        while (it.hasNext()) {
            it.next().delete();
        }
    }

    private static long h(long j) {
        return j * 1000;
    }

    private void j(List<File> list) {
        Iterator<File> it = list.iterator();
        while (it.hasNext()) {
            it.next().delete();
        }
    }

    private static String m(int i2, boolean z) {
        return "event" + String.format(Locale.US, "%010d", Integer.valueOf(i2)) + (z ? "_" : HttpUrl.FRAGMENT_ENCODE_SET);
    }

    private List<File> n() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.b.m());
        arrayList.addAll(this.b.j());
        Comparator<? super File> comparator = h;
        Collections.sort(arrayList, comparator);
        List<File> o = this.b.o();
        Collections.sort(o, comparator);
        arrayList.addAll(o);
        return arrayList;
    }

    private static String o(String str) {
        return str.substring(0, f);
    }

    private static boolean s(String str) {
        return str.startsWith("event") && str.endsWith("_");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean t(File file, String str) {
        return str.startsWith("event") && !str.endsWith("_");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int v(File file, File file2) {
        return o(file.getName()).compareTo(o(file2.getName()));
    }

    private static String y(File file) throws IOException {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int read = fileInputStream.read(bArr);
                if (read <= 0) {
                    String str = new String(byteArrayOutputStream.toByteArray(), e);
                    fileInputStream.close();
                    return str;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    private void z(File file, F.d dVar, String str, F.a aVar) {
        String d = this.d.d(str);
        try {
            j jVar = g;
            D(this.b.i(str), jVar.M(jVar.L(y(file)).u(dVar).q(aVar).p(d)));
        } catch (IOException e2) {
            ax.G7.g.f().l("Could not synthesize final native report file for " + file, e2);
        }
    }

    public void i() {
        j(this.b.o());
        j(this.b.m());
        j(this.b.j());
    }

    public void k(String str, long j) {
        for (String str2 : e(str)) {
            ax.G7.g.f().i("Finalizing report for session " + str2);
            A(str2, j);
            this.b.e(str2);
        }
        g();
    }

    public void l(String str, F.d dVar, F.a aVar) {
        File q = this.b.q(str, "report");
        ax.G7.g.f().b("Writing native session report for " + str + " to file: " + q);
        z(q, dVar, str, aVar);
    }

    public SortedSet<String> p() {
        return new TreeSet(this.b.f()).descendingSet();
    }

    public long q(String str) {
        return this.b.q(str, "start-time").lastModified();
    }

    public boolean r() {
        return (this.b.o().isEmpty() && this.b.m().isEmpty() && this.b.j().isEmpty()) ? false : true;
    }

    public List<AbstractC0775u> u() {
        List<File> n = n();
        ArrayList arrayList = new ArrayList();
        for (File file : n) {
            try {
                arrayList.add(AbstractC0775u.a(g.L(y(file)), file.getName(), file));
            } catch (IOException e2) {
                ax.G7.g.f().l("Could not load report file " + file + "; deleting", e2);
                file.delete();
            }
        }
        return arrayList;
    }

    public void w(F.e.d dVar, String str, boolean z) {
        int i2 = this.c.b().a.a;
        try {
            D(this.b.q(str, m(this.a.getAndIncrement(), z)), g.k(dVar));
        } catch (IOException e2) {
            ax.G7.g.f().l("Could not persist event for session " + str, e2);
        }
        C(str, i2);
    }

    public void x(F f2) {
        F.e n = f2.n();
        if (n == null) {
            ax.G7.g.f().b("Could not get session for report");
            return;
        }
        String i2 = n.i();
        try {
            D(this.b.q(i2, "report"), g.M(f2));
            E(this.b.q(i2, "start-time"), HttpUrl.FRAGMENT_ENCODE_SET, n.l());
        } catch (IOException e2) {
            ax.G7.g.f().c("Could not persist report for session " + i2, e2);
        }
    }
}
