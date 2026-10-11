/*
 * Decompiled with CFR 0.152.
 */
package ax.K3;

import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class a
implements Closeable,
AutoCloseable {
    private final File c0;
    private final File d0;
    private final File e0;
    private final int f0;
    private long g0;
    private final int h0;
    private long i0 = 0L;
    private Writer j0;
    private final LinkedHashMap<String, d> k0 = new LinkedHashMap(0, 0.75f, true);
    private int l0;
    private long m0 = 0L;
    final ThreadPoolExecutor n0 = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>(), new b());
    private final Callable<Void> o0 = new Callable<Void>(this){
        final a a;
        {
            this.a = a8;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public Void a() throws Exception {
            a a8 = this.a;
            synchronized (a8) {
                Throwable throwable2;
                block5: {
                    try {
                        if (this.a.j0 == null) {
                            return null;
                        }
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                    this.a.u0();
                    if (this.a.A()) {
                        this.a.d0();
                        a.j(this.a, 0);
                    }
                    return null;
                }
                throw throwable2;
            }
        }
    };
    private final File q;

    private a(File file, int n8, int n9, long l8) {
        this.q = file;
        this.f0 = n8;
        this.c0 = new File(file, "journal");
        this.d0 = new File(file, "journal.tmp");
        this.e0 = new File(file, "journal.bkp");
        this.h0 = n9;
        this.g0 = l8;
    }

    private boolean A() {
        int n8 = this.l0;
        return n8 >= 2000 && n8 >= ((AbstractMap)this.k0).size();
    }

    public static a F(File object, int n8, int n9, long l8) throws IOException {
        if (l8 > 0L) {
            if (n9 > 0) {
                Object object2;
                Object object3 = new File((File)object, "journal.bkp");
                if (((File)object3).exists()) {
                    object2 = new File((File)object, "journal");
                    if (((File)object2).exists()) {
                        ((File)object3).delete();
                    } else {
                        a.s0((File)object3, (File)object2, false);
                    }
                }
                object2 = new a((File)object, n8, n9, l8);
                if (((a)object2).c0.exists()) {
                    try {
                        super.L();
                        super.H();
                        return object2;
                    }
                    catch (IOException iOException) {
                        object3 = System.out;
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("DiskLruCache ");
                        stringBuilder.append(object);
                        stringBuilder.append(" is corrupt: ");
                        stringBuilder.append(iOException.getMessage());
                        stringBuilder.append(", removing");
                        ((PrintStream)object3).println(stringBuilder.toString());
                        ((a)object2).delete();
                    }
                }
                ((File)object).mkdirs();
                object = new a((File)object, n8, n9, l8);
                super.d0();
                return object;
            }
            throw new IllegalArgumentException("valueCount <= 0");
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    private void H() throws IOException {
        a.p(this.d0);
        Iterator<d> iterator = this.k0.values().iterator();
        while (iterator.hasNext()) {
            int n8;
            d d8 = iterator.next();
            c c8 = d8.f;
            int n9 = 0;
            if (c8 == null) {
                for (n8 = 0; n8 < this.h0; ++n8) {
                    this.i0 += d8.b[n8];
                }
                continue;
            }
            d.h(d8, null);
            for (n8 = n9; n8 < this.h0; ++n8) {
                a.p(d8.j(n8));
                a.p(d8.k(n8));
            }
            iterator.remove();
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void L() throws IOException {
        block8: {
            var3_1 = new ax.K3.b(new FileInputStream(this.c0), ax.K3.c.a);
            var7_2 = var3_1.d();
            var6_3 = var3_1.d();
            var8_4 = var3_1.d();
            var4_5 = var3_1.d();
            var5_9 = var3_1.d();
            if (!"libcore.io.DiskLruCache".equals(var7_2) || !"1".equals(var6_3) || !Integer.toString(this.f0).equals(var8_4) || !Integer.toString(this.h0).equals(var4_5) || !(var2_10 = "".equals(var5_9))) ** GOTO lbl-1000
            var1_11 = 0;
            while (true) {
                this.W(var3_1.d());
                ++var1_11;
            }
            {
                block9: {
                    catch (Throwable var4_6) {
                        break block8;
                    }
                    catch (EOFException var4_7) {}
                    {
                        this.l0 = var1_11 - this.k0.size();
                        if (var3_1.c()) {
                            this.d0();
                            break block9;
                        }
                        var6_3 = new FileOutputStream(this.c0, true);
                        var4_8 = new OutputStreamWriter((OutputStream)var6_3, ax.K3.c.a);
                        this.j0 = var5_9 = new BufferedWriter(var4_8);
                    }
                }
                ax.K3.c.a(var3_1);
                return;
            }
lbl-1000:
            // 1 sources

            {
                var9_12 = new StringBuilder();
                var9_12.append("unexpected journal header: [");
                var9_12.append(var7_2);
                var9_12.append(", ");
                var9_12.append((String)var6_3);
                var9_12.append(", ");
                var9_12.append(var4_5);
                var9_12.append(", ");
                var9_12.append((String)var5_9);
                var9_12.append("]");
                var8_4 = new IOException(var9_12.toString());
                throw var8_4;
            }
        }
        ax.K3.c.a(var3_1);
        throw var4_6;
    }

    private void W(String stringArray) throws IOException {
        int n8 = stringArray.indexOf(32);
        if (n8 != -1) {
            CharSequence charSequence;
            Object object;
            int n9 = n8 + 1;
            int n10 = stringArray.indexOf(32, n9);
            if (n10 == -1) {
                object = stringArray.substring(n9);
                charSequence = object;
                if (n8 == 6) {
                    charSequence = object;
                    if (stringArray.startsWith("REMOVE")) {
                        ((AbstractMap)this.k0).remove(object);
                        return;
                    }
                }
            } else {
                charSequence = stringArray.substring(n9, n10);
            }
            d d8 = this.k0.get(charSequence);
            object = d8;
            if (d8 == null) {
                object = new d(this, (String)charSequence);
                ((AbstractMap)this.k0).put((String)charSequence, (d)object);
            }
            if (n10 != -1 && n8 == 5 && stringArray.startsWith("CLEAN")) {
                stringArray = stringArray.substring(n10 + 1).split(" ");
                d.f((d)object, true);
                d.h((d)object, null);
                ((d)object).n(stringArray);
                return;
            }
            if (n10 == -1 && n8 == 5 && stringArray.startsWith("DIRTY")) {
                d.h((d)object, new c(this, (d)object));
                return;
            }
            if (n10 == -1 && n8 == 4 && stringArray.startsWith("READ")) {
                return;
            }
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("unexpected journal line: ");
            ((StringBuilder)charSequence).append((String)stringArray);
            throw new IOException(((StringBuilder)charSequence).toString());
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("unexpected journal line: ");
        stringBuilder.append((String)stringArray);
        throw new IOException(stringBuilder.toString());
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void d0() throws IOException {
        synchronized (this) {
            Throwable throwable322;
            Closeable closeable;
            block10: {
                Throwable throwable2222;
                closeable = this.j0;
                if (closeable != null) {
                    ((Writer)closeable).close();
                }
                Object object = new FileOutputStream(this.d0);
                Object object2 = new OutputStreamWriter((OutputStream)object, ax.K3.c.a);
                closeable = new BufferedWriter((Writer)object2);
                {
                    catch (Throwable throwable2222) {}
                }
                try {
                    block11: {
                        ((Writer)closeable).write("libcore.io.DiskLruCache");
                        ((Writer)closeable).write("\n");
                        ((Writer)closeable).write("1");
                        ((Writer)closeable).write("\n");
                        ((Writer)closeable).write(Integer.toString(this.f0));
                        ((Writer)closeable).write("\n");
                        ((Writer)closeable).write(Integer.toString(this.h0));
                        ((Writer)closeable).write("\n");
                        ((Writer)closeable).write("\n");
                        object = this.k0.values().iterator();
                        break block11;
                        throw throwable2222;
                    }
                    while (object.hasNext()) {
                        StringBuilder stringBuilder;
                        object2 = (d)object.next();
                        if (((d)object2).f != null) {
                            stringBuilder = new StringBuilder();
                            stringBuilder.append("DIRTY ");
                            stringBuilder.append(((d)object2).a);
                            stringBuilder.append('\n');
                            ((Writer)closeable).write(stringBuilder.toString());
                            continue;
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("CLEAN ");
                        stringBuilder.append(((d)object2).a);
                        stringBuilder.append(((d)object2).l());
                        stringBuilder.append('\n');
                        ((Writer)closeable).write(stringBuilder.toString());
                    }
                }
                catch (Throwable throwable322) {
                    break block10;
                }
                ((Writer)closeable).close();
                if (this.c0.exists()) {
                    a.s0(this.c0, this.e0, true);
                }
                a.s0(this.d0, this.c0, false);
                this.e0.delete();
                closeable = new FileOutputStream(this.c0, true);
                object = new OutputStreamWriter((OutputStream)closeable, ax.K3.c.a);
                this.j0 = object2 = new BufferedWriter((Writer)object);
                return;
            }
            ((Writer)closeable).close();
            throw throwable322;
        }
    }

    static /* synthetic */ int j(a a8, int n8) {
        a8.l0 = n8;
        return n8;
    }

    private void m() {
        if (this.j0 != null) {
            return;
        }
        throw new IllegalStateException("cache is closed");
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void o(c var1_1, boolean var2_3) throws IOException {
        synchronized (this) {
            block16: {
                try {
                    var10_4 = c.c((c)var1_1);
                    if (d.g((d)var10_4) != var1_1) ** GOTO lbl82
                    var3_6 = var5_5 = 0;
                    if (!var2_3) ** GOTO lbl31
                    var3_6 = var5_5;
                    if (d.e((d)var10_4)) ** GOTO lbl31
                    var4_7 = 0;
lbl10:
                    // 2 sources

                    while (true) {
                        var3_6 = var5_5;
                        if (var4_7 >= this.h0) ** GOTO lbl31
                        if (c.d((c)var1_1)[var4_7]) {
                            if (!var10_4.k(var4_7).exists()) {
                                var1_1.a();
                                return;
                            }
                        }
                        ** GOTO lbl-1000
                        break;
                    }
                }
                catch (Throwable var1_2) {
                    break block16;
                }
                ++var4_7;
                ** continue;
lbl-1000:
                // 1 sources

                {
                    var1_1.a();
                    var1_1 = new StringBuilder();
                    var1_1.append("Newly created entry didn't create value for index ");
                    var1_1.append(var4_7);
                    var10_4 = new IllegalStateException(var1_1.toString());
                    throw var10_4;
lbl31:
                    // 4 sources

                    while (var3_6 < this.h0) {
                        var1_1 = var10_4.k(var3_6);
                        if (var2_3) {
                            if (var1_1.exists()) {
                                var11_10 = var10_4.j(var3_6);
                                var1_1.renameTo(var11_10);
                                var6_8 = d.a((d)var10_4)[var3_6];
                                d.a((d)var10_4)[var3_6] = var8_9 = var11_10.length();
                                this.i0 = this.i0 - var6_8 + var8_9;
                            }
                        } else {
                            a.p((File)var1_1);
                        }
                        ++var3_6;
                    }
                }
                {
                    ++this.l0;
                    d.h((d)var10_4, null);
                    if (d.e((d)var10_4) | var2_3) {
                        d.f((d)var10_4, true);
                        this.j0.append("CLEAN");
                        this.j0.append(' ');
                        this.j0.append(d.b((d)var10_4));
                        this.j0.append(var10_4.l());
                        this.j0.append('\n');
                        if (var2_3) {
                            var6_8 = this.m0;
                            this.m0 = 1L + var6_8;
                            d.d((d)var10_4, var6_8);
                        }
                    } else {
                        this.k0.remove(d.b((d)var10_4));
                        this.j0.append("REMOVE");
                        this.j0.append(' ');
                        this.j0.append(d.b((d)var10_4));
                        this.j0.append('\n');
                    }
                    this.j0.flush();
                    if (this.i0 > this.g0 || this.A()) {
                        this.n0.submit(this.o0);
                    }
                    return;
lbl82:
                    // 1 sources

                    var1_1 = new IllegalStateException();
                    throw var1_1;
                }
            }
            throw var1_2;
        }
    }

    private static void p(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    private static void s0(File file, File file2, boolean bl) throws IOException {
        if (bl) {
            a.p(file2);
        }
        if (file.renameTo(file2)) {
            return;
        }
        throw new IOException();
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private c u(String var1_1, long var2_3) throws IOException {
        synchronized (this) {
            block6: {
                block5: {
                    try {
                        this.m();
                        var6_4 = this.k0.get(var1_1);
                        if (var2_3 == -1L || var6_4 != null && (var4_5 = d.c(var6_4)) == var2_3) break block5;
                    }
                    catch (Throwable var1_2) {
                        break block6;
                    }
                    return null;
                }
                if (var6_4 != null) ** GOTO lbl16
                {
                    var6_4 = new d(this, var1_1);
                    this.k0.put(var1_1, var6_4);
                    ** GOTO lbl-1000
lbl16:
                    // 1 sources

                    var7_6 = d.g(var6_4);
                    if (var7_6 == null) ** GOTO lbl-1000
                }
                return null;
lbl-1000:
                // 2 sources

                {
                    var7_6 = new c(this, var6_4);
                    d.h(var6_4, var7_6);
                    this.j0.append("DIRTY");
                    this.j0.append(' ');
                    this.j0.append(var1_1);
                    this.j0.append('\n');
                    this.j0.flush();
                    return var7_6;
                }
            }
            throw var1_2;
        }
    }

    private void u0() throws IOException {
        while (this.i0 > this.g0) {
            this.o0(this.k0.entrySet().iterator().next().getKey());
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void close() throws IOException {
        synchronized (this) {
            Throwable throwable2;
            block7: {
                ArrayList<d> arrayList;
                block6: {
                    try {
                        arrayList = this.j0;
                        if (arrayList != null) break block6;
                    }
                    catch (Throwable throwable2) {
                        break block7;
                    }
                    return;
                }
                arrayList = new ArrayList<d>(this.k0.values());
                int n8 = arrayList.size();
                int n9 = 0;
                while (true) {
                    int n10;
                    if (n9 >= n8) {
                        this.u0();
                        this.j0.close();
                        this.j0 = null;
                        return;
                    }
                    d d8 = arrayList.get(n9);
                    n9 = n10 = n9 + 1;
                    if (d8.f == null) continue;
                    d8.f.a();
                    n9 = n10;
                }
            }
            throw throwable2;
        }
    }

    public void delete() throws IOException {
        this.close();
        ax.K3.c.b(this.q);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean o0(String object) throws IOException {
        synchronized (this) {
            Throwable throwable2;
            block8: {
                try {
                    this.m();
                    Object object2 = this.k0.get(object);
                    if (object2 == null || ((d)object2).f != null) break block8;
                    for (int i8 = 0; i8 < this.h0; this.i0 -= ((d)object2).b[i8], ++i8) {
                        File file = ((d)object2).j(i8);
                        if (file.exists() && !file.delete()) {
                            object2 = new StringBuilder();
                            ((StringBuilder)object2).append("failed to delete ");
                            ((StringBuilder)object2).append(file);
                            object = new IOException(((StringBuilder)object2).toString());
                            throw object;
                        }
                        ((d)object2).b[i8] = 0L;
                    }
                    ++this.l0;
                    this.j0.append("REMOVE");
                    this.j0.append(' ');
                    this.j0.append((CharSequence)object);
                    this.j0.append('\n');
                    ((AbstractMap)this.k0).remove(object);
                    if (this.A()) {
                        this.n0.submit(this.o0);
                    }
                    return true;
                }
                catch (Throwable throwable2) {}
            }
            return false;
            throw throwable2;
        }
    }

    public c q(String string) throws IOException {
        return this.u(string, -1L);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public e v(String object) throws IOException {
        synchronized (this) {
            RuntimeException var1_4;
            block16: {
                File[] fileArray;
                Object object2;
                block15: {
                    boolean bl;
                    block14: {
                        block13: {
                            this.m();
                            object2 = this.k0.get(object);
                            if (object2 != null) break block13;
                            return null;
                        }
                        bl = ((d)object2).e;
                        if (bl) break block14;
                        return null;
                    }
                    fileArray = ((d)object2).c;
                    int n8 = fileArray.length;
                    for (int i8 = 0; i8 < n8; ++i8) {
                        bl = fileArray[i8].exists();
                        if (bl) continue;
                        return null;
                    }
                    try {
                        ++this.l0;
                        this.j0.append("READ");
                        this.j0.append(' ');
                        this.j0.append((CharSequence)object);
                        this.j0.append('\n');
                        bl = this.A();
                        if (!bl) break block15;
                    }
                    catch (Throwable throwable) {}
                    try {
                        this.n0.submit(this.o0);
                    }
                    catch (Throwable throwable) {
                        break block16;
                    }
                }
                long l8 = ((d)object2).g;
                fileArray = ((d)object2).c;
                object2 = ((d)object2).b;
                try {
                    return new e(this, (String)object, l8, fileArray, (long[])object2);
                }
                catch (Throwable throwable) {}
                {
                }
            }
            throw var1_4;
        }
    }

    private static final class b
    implements ThreadFactory {
        private b() {
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        public Thread newThread(Runnable runnable2) {
            synchronized (this) {
                Thread thread = new Thread(runnable2, "glide-disk-lru-cache-thread");
                thread.setPriority(1);
                return thread;
            }
        }
    }

    public final class c {
        private final d a;
        private final boolean[] b;
        private boolean c;
        final a d;

        private c(a object, d d8) {
            this.d = object;
            this.a = d8;
            object = d8.e ? null : (Object)new boolean[((a)object).h0];
            this.b = (boolean[])object;
        }

        static /* synthetic */ d c(c c8) {
            return c8.a;
        }

        static /* synthetic */ boolean[] d(c c8) {
            return c8.b;
        }

        public void a() throws IOException {
            this.d.o(this, false);
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public void b() {
            if (this.c) return;
            try {
                this.a();
                return;
            }
            catch (IOException iOException) {
                return;
            }
        }

        public void e() throws IOException {
            this.d.o(this, true);
            this.c = true;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public File f(int n8) throws IOException {
            a a8 = this.d;
            synchronized (a8) {
                Throwable throwable2;
                block6: {
                    block5: {
                        try {
                            if (this.a.f != this) {
                                IllegalStateException illegalStateException = new IllegalStateException();
                                throw illegalStateException;
                            }
                            if (this.a.e) break block5;
                            this.b[n8] = true;
                        }
                        catch (Throwable throwable2) {
                            break block6;
                        }
                    }
                    File file = this.a.k(n8);
                    if (!this.d.q.exists()) {
                        this.d.q.mkdirs();
                    }
                    return file;
                }
                throw throwable2;
            }
        }
    }

    private final class d {
        private final String a;
        private final long[] b;
        File[] c;
        File[] d;
        private boolean e;
        private c f;
        private long g;
        final a h;

        private d(a a8, String charSequence) {
            this.h = a8;
            this.a = charSequence;
            this.b = new long[a8.h0];
            this.c = new File[a8.h0];
            this.d = new File[a8.h0];
            charSequence = new StringBuilder((String)charSequence);
            ((StringBuilder)charSequence).append('.');
            int n8 = ((StringBuilder)charSequence).length();
            for (int i8 = 0; i8 < a8.h0; ++i8) {
                ((StringBuilder)charSequence).append(i8);
                this.c[i8] = new File(a8.q, ((StringBuilder)charSequence).toString());
                ((StringBuilder)charSequence).append(".tmp");
                this.d[i8] = new File(a8.q, ((StringBuilder)charSequence).toString());
                ((StringBuilder)charSequence).setLength(n8);
            }
        }

        static /* synthetic */ long d(d d8, long l8) {
            d8.g = l8;
            return l8;
        }

        static /* synthetic */ boolean f(d d8, boolean bl) {
            d8.e = bl;
            return bl;
        }

        static /* synthetic */ c h(d d8, c c8) {
            d8.f = c8;
            return c8;
        }

        private IOException m(String[] stringArray) throws IOException {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("unexpected journal line: ");
            stringBuilder.append(Arrays.toString(stringArray));
            throw new IOException(stringBuilder.toString());
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        private void n(String[] stringArray) throws IOException {
            if (stringArray.length != this.h.h0) {
                throw this.m(stringArray);
            }
            int n8 = 0;
            try {
                while (true) {
                    if (n8 >= stringArray.length) {
                        return;
                    }
                    this.b[n8] = Long.parseLong(stringArray[n8]);
                    ++n8;
                }
            }
            catch (NumberFormatException numberFormatException) {
                throw this.m(stringArray);
            }
        }

        public File j(int n8) {
            return this.c[n8];
        }

        public File k(int n8) {
            return this.d[n8];
        }

        public String l() throws IOException {
            StringBuilder stringBuilder = new StringBuilder();
            for (long l8 : this.b) {
                stringBuilder.append(' ');
                stringBuilder.append(l8);
            }
            return stringBuilder.toString();
        }
    }

    public final class e {
        private final String a;
        private final long b;
        private final long[] c;
        private final File[] d;
        final a e;

        private e(a a8, String string, long l8, File[] fileArray, long[] lArray) {
            this.e = a8;
            this.a = string;
            this.b = l8;
            this.d = fileArray;
            this.c = lArray;
        }

        public File a(int n8) {
            return this.d[n8];
        }
    }
}

