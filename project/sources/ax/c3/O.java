package ax.c3;

import android.net.Uri;
import com.voxdon.xplorer.file.AbstractC3595n;
import com.voxdon.xplorer.file.C3602v;
import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.util.Calendar;
import java.util.Comparator;
import java.util.List;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public class O {
    private static final Logger b = Logger.getLogger("FileManager.NewFilesScan");
    private final com.voxdon.xplorer.file.B a;

    class a implements Comparator<AbstractC3595n> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(AbstractC3595n abstractC3595n, AbstractC3595n abstractC3595n2) {
            return abstractC3595n.E().compareTo(abstractC3595n2.E());
        }
    }

    private static class b {
        boolean a;
        String b;
        long c;

        private b() {
        }

        private void b() {
            this.a = false;
            this.b = null;
            this.c = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c(String str) throws IOException {
            String[] split = str.split("\u0000");
            b();
            if (split.length < 3) {
                throw new IOException("Scan file broken 1");
            }
            if ("D".equals(split[0])) {
                this.a = true;
            } else {
                if (!"F".equals(split[0])) {
                    throw new IOException("Scan file broken invalid type");
                }
                this.a = false;
            }
            String decode = Uri.decode(split[1]);
            this.b = decode;
            if (decode == null) {
                throw new IOException("Scan file broken path == null");
            }
            try {
                this.c = Long.parseLong(split[2]);
            } catch (NumberFormatException e) {
                ax.Ha.c.h().f().b("NEW FILES PARSING ERROR").l(e).g("broken:" + split[2]).h();
                throw new IOException("Scan file last modified broken");
            }
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    public O(com.voxdon.xplorer.file.B b2) {
        this.a = b2;
    }

    private void b(List<C3602v> list, List<AbstractC3595n> list2, long j, ax.Z2.i iVar, Writer writer) throws IOException {
        int compareTo;
        b bVar = new b(null);
        int i = 0;
        while (i < list.size()) {
            C3602v c3602v = list.get(i);
            File F0 = c3602v.F0();
            if (!c3602v.h() && d(F0, j)) {
                String c = iVar.c();
                if (c == null) {
                    compareTo = -1;
                } else {
                    bVar.c(c);
                    if (!bVar.a) {
                        iVar.b();
                        throw new IOException("scan file type does not match");
                    }
                    compareTo = F0.getAbsolutePath().compareTo(bVar.b);
                }
                if (compareTo == 0) {
                    if (bVar.c == F0.lastModified()) {
                        writer.write(c + "\n");
                        iVar.a();
                        e(c3602v, list2, j, iVar, writer);
                    } else {
                        iVar.a();
                        g(iVar);
                        f(F0, list2, j, c3602v.B0(), writer);
                    }
                } else if (compareTo < 0) {
                    f(F0, list2, j, c3602v.B0(), writer);
                } else {
                    iVar.a();
                    g(iVar);
                }
            }
            i++;
        }
    }

    public static long c() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(5, -10);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return Math.max(calendar.getTimeInMillis(), ax.t3.k.m());
    }

    private static boolean d(File file, long j) {
        return file.lastModified() >= j;
    }

    private void e(C3602v c3602v, List<AbstractC3595n> list, long j, ax.Z2.i iVar, Writer writer) throws IOException {
        b bVar = new b(null);
        while (true) {
            String c = iVar.c();
            if (c == null) {
                return;
            }
            bVar.c(c);
            if (bVar.a) {
                return;
            }
            if (bVar.c > j) {
                list.add(new com.voxdon.xplorer.file.C(this.a, new File(bVar.b), c3602v.B0()));
                writer.write(c + "\n");
            }
            iVar.a();
        }
    }

    private void f(File file, List<AbstractC3595n> list, long j, K k, Writer writer) throws IOException {
        List<AbstractC3595n> list2;
        long j2;
        K k2;
        Writer writer2;
        if (d(file, j)) {
            if (!file.isDirectory()) {
                if (C1808A.b(file.getName())) {
                    j(writer, file);
                    list.add(new com.voxdon.xplorer.file.C(this.a, file, k));
                    return;
                }
                return;
            }
            if (!d0.C(file.getName())) {
                try {
                    File[] listFiles = file.listFiles();
                    if (listFiles != null && file.length() > 0) {
                        i(writer, file);
                        int length = listFiles.length;
                        int i = 0;
                        while (i < length) {
                            File file2 = listFiles[i];
                            if (file2.isDirectory()) {
                                list2 = list;
                                j2 = j;
                                k2 = k;
                                writer2 = writer;
                            } else {
                                list2 = list;
                                j2 = j;
                                k2 = k;
                                writer2 = writer;
                                try {
                                    f(file2, list2, j2, k2, writer2);
                                } catch (OutOfMemoryError unused) {
                                    ax.Ha.c.h().d("searchNewFile : OutOfMemory").h();
                                    return;
                                }
                            }
                            i++;
                            list = list2;
                            j = j2;
                            k = k2;
                            writer = writer2;
                        }
                    }
                } catch (OutOfMemoryError unused2) {
                }
            }
        }
    }

    private void g(ax.Z2.i iVar) throws IOException {
        while (true) {
            String c = iVar.c();
            if (c == null || !c.startsWith("F")) {
                return;
            } else {
                iVar.a();
            }
        }
    }

    private void h(List<AbstractC3595n> list) {
        if (list.size() > 10000) {
            list = C1829q.g(list, C1829q.c("DateDown")).subList(0, 10000);
            ax.Z2.b.k().w(40960);
        }
        com.voxdon.xplorer.file.B b2 = this.a;
        ax.Z2.b.k().m(b2.z(b2.x()), list);
    }

    private void i(Writer writer, File file) throws IOException {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("D");
        stringBuffer.append("\u0000");
        stringBuffer.append(Uri.encode(file.getAbsolutePath()));
        stringBuffer.append("\u0000");
        stringBuffer.append(String.valueOf(file.lastModified()));
        stringBuffer.append("\n");
        if (writer != null) {
            writer.write(stringBuffer.toString());
        }
    }

    private void j(Writer writer, File file) throws IOException {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("F");
        stringBuffer.append("\u0000");
        stringBuffer.append(Uri.encode(file.getAbsolutePath()));
        stringBuffer.append("\u0000");
        stringBuffer.append(String.valueOf(file.lastModified()));
        stringBuffer.append("\n");
        if (writer != null) {
            writer.write(stringBuffer.toString());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x015f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0164 A[Catch: IOException -> 0x0167, TRY_LEAVE, TryCatch #8 {IOException -> 0x0167, blocks: (B:105:0x015f, B:98:0x0164), top: B:104:0x015f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(java.io.File r11, java.util.HashMap<java.lang.String, com.voxdon.xplorer.file.C3602v> r12, java.util.List<com.voxdon.xplorer.file.AbstractC3595n> r13) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.c3.O.a(java.io.File, java.util.HashMap, java.util.List):void");
    }
}
