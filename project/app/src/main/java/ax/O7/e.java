/*
 * Decompiled with CFR 0.152.
 */
package ax.O7;

import ax.J7.m;
import ax.J7.u;
import ax.L7.F;
import ax.M7.j;
import ax.O7.a;
import ax.O7.b;
import ax.O7.c;
import ax.O7.d;
import ax.O7.g;
import ax.Q7.i;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;

public class e {
    private static final Charset e = Charset.forName("UTF-8");
    private static final int f = 15;
    private static final j g = new j();
    private static final Comparator<? super File> h = new a();
    private static final FilenameFilter i = new b();
    private final AtomicInteger a = new AtomicInteger(0);
    private final g b;
    private final i c;
    private final m d;

    public e(g g8, i i8, m m8) {
        this.b = g8;
        this.c = i8;
        this.d = m8;
    }

    private void A(String string, long l8) {
        CharSequence charSequence;
        boolean bl;
        List<File> list = this.b.r(string, i);
        if (list.isEmpty()) {
            ax.G7.g g8 = ax.G7.g.f();
            list = new StringBuilder();
            ((StringBuilder)((Object)list)).append("Session ");
            ((StringBuilder)((Object)list)).append(string);
            ((StringBuilder)((Object)list)).append(" has no events.");
            g8.i(((StringBuilder)((Object)list)).toString());
            return;
        }
        Collections.sort(list);
        Object object = new ArrayList();
        list = list.iterator();
        block3: while (true) {
            bl = false;
            while (list.hasNext()) {
                IOException iOException2;
                File file;
                block8: {
                    block7: {
                        file = (File)list.next();
                        try {
                            object.add(g.j(ax.O7.e.y(file)));
                            if (bl) break block7;
                        }
                        catch (IOException iOException2) {
                            break block8;
                        }
                        boolean bl2 = ax.O7.e.s(file.getName());
                        if (!bl2) continue block3;
                    }
                    bl = true;
                    continue;
                }
                ax.G7.g g9 = ax.G7.g.f();
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append("Could not add event to report for ");
                ((StringBuilder)charSequence).append(file);
                g9.l(((StringBuilder)charSequence).toString(), iOException2);
            }
            break;
        }
        if (object.isEmpty()) {
            object = ax.G7.g.f();
            list = new StringBuilder();
            ((StringBuilder)((Object)list)).append("Could not parse event files for session ");
            ((StringBuilder)((Object)list)).append(string);
            ((ax.G7.g)object).k(((StringBuilder)((Object)list)).toString());
            return;
        }
        charSequence = ax.K7.m.j(string, this.b);
        list = this.d.d(string);
        this.B(this.b.q(string, "report"), (List<F.e.d>)object, l8, bl, (String)charSequence, (String)((Object)list));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void B(File file, List<F.e.d> object, long l8, boolean bl, String object2, String object3) {
        IOException iOException2;
        block3: {
            j j8;
            try {
                j8 = g;
                object2 = j8.L(ax.O7.e.y(file)).v(l8, bl, (String)object2).p((String)object3).r((List<F.e.d>)object);
                object = ((F)object2).n();
                if (object == null) {
                    return;
                }
                ax.G7.g g8 = ax.G7.g.f();
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("appQualitySessionId: ");
                stringBuilder.append((String)object3);
                g8.b(stringBuilder.toString());
                object = bl ? this.b.l(((F.e)object).i()) : this.b.n(((F.e)object).i());
            }
            catch (IOException iOException2) {
                break block3;
            }
            ax.O7.e.D((File)object, j8.M((F)object2));
            return;
        }
        object3 = ax.G7.g.f();
        object2 = new StringBuilder();
        ((StringBuilder)object2).append("Could not synthesize final report file for ");
        ((StringBuilder)object2).append(file);
        ((ax.G7.g)object3).l(((StringBuilder)object2).toString(), iOException2);
    }

    private int C(String object, int n8) {
        object = this.b.r((String)object, new c());
        Collections.sort(object, new d());
        return ax.O7.e.f((List<File>)object, n8);
    }

    private static void D(File file, String string) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter((OutputStream)new FileOutputStream(file), e);
        try {
            outputStreamWriter.write(string);
            return;
        }
        finally {
            outputStreamWriter.close();
        }
    }

    private static void E(File file, String string, long l8) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter((OutputStream)new FileOutputStream(file), e);
        try {
            outputStreamWriter.write(string);
            file.setLastModified(ax.O7.e.h(l8));
            return;
        }
        finally {
            outputStreamWriter.close();
        }
    }

    public static /* synthetic */ boolean a(File file, String string) {
        return string.startsWith("event");
    }

    public static /* synthetic */ boolean b(File file, String string) {
        return ax.O7.e.t(file, string);
    }

    public static /* synthetic */ int c(File file, File file2) {
        return ax.O7.e.v(file, file2);
    }

    public static /* synthetic */ int d(File file, File file2) {
        return file2.getName().compareTo(file.getName());
    }

    private SortedSet<String> e(String charSequence) {
        this.b.d();
        SortedSet<String> sortedSet = this.p();
        if (charSequence != null) {
            sortedSet.remove(charSequence);
        }
        if (sortedSet.size() > 8) {
            while (sortedSet.size() > 8) {
                String string = sortedSet.last();
                ax.G7.g g8 = ax.G7.g.f();
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append("Removing session over cap: ");
                ((StringBuilder)charSequence).append(string);
                g8.b(((StringBuilder)charSequence).toString());
                this.b.e(string);
                sortedSet.remove(string);
            }
        }
        return sortedSet;
    }

    private static int f(List<File> object, int n8) {
        int n9 = object.size();
        object = object.iterator();
        while (object.hasNext()) {
            File file = (File)object.next();
            if (n9 <= n8) break;
            ax.O7.g.u(file);
            --n9;
        }
        return n9;
    }

    private void g() {
        int n8 = this.c.b().a.b;
        List<File> list = this.n();
        int n9 = list.size();
        if (n9 > n8) {
            list = list.subList(n8, n9).iterator();
            while (list.hasNext()) {
                ((File)list.next()).delete();
            }
        }
    }

    private static long h(long l8) {
        return l8 * 1000L;
    }

    private void j(List<File> object) {
        object = object.iterator();
        while (object.hasNext()) {
            ((File)object.next()).delete();
        }
    }

    private static String m(int n8, boolean bl) {
        String string = String.format(Locale.US, "%010d", n8);
        String string2 = bl ? "_" : "";
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("event");
        stringBuilder.append(string);
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    private List<File> n() {
        ArrayList<File> arrayList = new ArrayList<File>();
        arrayList.addAll(this.b.m());
        arrayList.addAll(this.b.j());
        Comparator<? super File> comparator = h;
        Collections.sort(arrayList, comparator);
        List<File> list = this.b.o();
        Collections.sort(list, comparator);
        arrayList.addAll(list);
        return arrayList;
    }

    private static String o(String string) {
        return string.substring(0, f);
    }

    private static boolean s(String string) {
        return string.startsWith("event") && string.endsWith("_");
    }

    private static boolean t(File file, String string) {
        return string.startsWith("event") && !string.endsWith("_");
    }

    private static int v(File file, File file2) {
        return ax.O7.e.o(file.getName()).compareTo(ax.O7.e.o(file2.getName()));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static String y(File object) throws IOException {
        Throwable throwable2;
        block5: {
            Object object2 = new byte[8192];
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            object = new FileInputStream((File)object);
            try {
                int n8;
                while ((n8 = ((FileInputStream)object).read((byte[])object2)) > 0) {
                    byteArrayOutputStream.write((byte[])object2, 0, n8);
                }
            }
            catch (Throwable throwable2) {
                break block5;
            }
            object2 = new String(byteArrayOutputStream.toByteArray(), e);
            ((FileInputStream)object).close();
            return object2;
        }
        try {
            ((FileInputStream)object).close();
            throw throwable2;
        }
        catch (Throwable throwable3) {
            throwable2.addSuppressed(throwable3);
        }
        throw throwable2;
    }

    private void z(File file, F.d object, String string, F.a object2) {
        String string2 = this.d.d(string);
        try {
            j j8 = g;
            object = j8.L(ax.O7.e.y(file)).u((F.d)object).q((F.a)object2).p(string2);
            ax.O7.e.D(this.b.i(string), j8.M((F)object));
            return;
        }
        catch (IOException iOException) {
            object2 = ax.G7.g.f();
            object = new StringBuilder();
            ((StringBuilder)object).append("Could not synthesize final native report file for ");
            ((StringBuilder)object).append(file);
            ((ax.G7.g)object2).l(((StringBuilder)object).toString(), iOException);
            return;
        }
    }

    public void i() {
        this.j(this.b.o());
        this.j(this.b.m());
        this.j(this.b.j());
    }

    public void k(String object, long l8) {
        for (String string : this.e((String)object)) {
            object = ax.G7.g.f();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Finalizing report for session ");
            stringBuilder.append(string);
            ((ax.G7.g)object).i(stringBuilder.toString());
            this.A(string, l8);
            this.b.e(string);
        }
        this.g();
    }

    public void l(String string, F.d d8, F.a a8) {
        File file = this.b.q(string, "report");
        ax.G7.g g8 = ax.G7.g.f();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Writing native session report for ");
        stringBuilder.append(string);
        stringBuilder.append(" to file: ");
        stringBuilder.append(file);
        g8.b(stringBuilder.toString());
        this.z(file, d8, string, a8);
    }

    public SortedSet<String> p() {
        return new TreeSet<String>(this.b.f()).descendingSet();
    }

    public long q(String string) {
        return this.b.q(string, "start-time").lastModified();
    }

    public boolean r() {
        return !this.b.o().isEmpty() || !this.b.m().isEmpty() || !this.b.j().isEmpty();
        {
        }
    }

    public List<u> u() {
        Object object = this.n();
        ArrayList<u> arrayList = new ArrayList<u>();
        object = object.iterator();
        while (object.hasNext()) {
            File file = (File)object.next();
            try {
                arrayList.add(u.a(g.L(ax.O7.e.y(file)), file.getName(), file));
            }
            catch (IOException iOException) {
                ax.G7.g g8 = ax.G7.g.f();
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Could not load report file ");
                stringBuilder.append(file);
                stringBuilder.append("; deleting");
                g8.l(stringBuilder.toString(), iOException);
                file.delete();
            }
        }
        return arrayList;
    }

    public void w(F.e.d object, String string, boolean bl) {
        int n8 = this.c.b().a.a;
        Object object2 = g.k((F.e.d)object);
        object = ax.O7.e.m(this.a.getAndIncrement(), bl);
        try {
            ax.O7.e.D(this.b.q(string, (String)object), (String)object2);
        }
        catch (IOException iOException) {
            object2 = ax.G7.g.f();
            object = new StringBuilder();
            ((StringBuilder)object).append("Could not persist event for session ");
            ((StringBuilder)object).append(string);
            ((ax.G7.g)object2).l(((StringBuilder)object).toString(), iOException);
        }
        this.C(string, n8);
    }

    public void x(F object) {
        Object object2 = ((F)object).n();
        if (object2 == null) {
            ax.G7.g.f().b("Could not get session for report");
            return;
        }
        String string = ((F.e)object2).i();
        try {
            object = g.M((F)object);
            ax.O7.e.D(this.b.q(string, "report"), (String)object);
            ax.O7.e.E(this.b.q(string, "start-time"), "", ((F.e)object2).l());
            return;
        }
        catch (IOException iOException) {
            object = ax.G7.g.f();
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("Could not persist report for session ");
            ((StringBuilder)object2).append(string);
            ((ax.G7.g)object).c(((StringBuilder)object2).toString(), iOException);
            return;
        }
    }
}

