/*
 * Decompiled with CFR 0.152.
 */
package ax.X9;

import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
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
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

final class a
implements Closeable,
AutoCloseable {
    static final Pattern r0 = Pattern.compile("[a-z0-9_-]{1,64}");
    private static final OutputStream s0 = new OutputStream(){

        @Override
        public void write(int n8) throws IOException {
        }
    };
    private final File c0;
    private final File d0;
    private final File e0;
    private final int f0;
    private long g0;
    private int h0;
    private final int i0;
    private long j0 = 0L;
    private int k0 = 0;
    private Writer l0;
    private final LinkedHashMap<String, d> m0 = new LinkedHashMap(0, 0.75f, true);
    private int n0;
    private long o0 = 0L;
    final ThreadPoolExecutor p0 = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>());
    private final File q;
    private final Callable<Void> q0 = new Callable<Void>(this){
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
                        if (this.a.l0 == null) {
                            return null;
                        }
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                    this.a.D0();
                    this.a.C0();
                    if (this.a.H()) {
                        this.a.s0();
                        a.o(this.a, 0);
                    }
                    return null;
                }
                throw throwable2;
            }
        }
    };

    private a(File file, int n8, int n9, long l8, int n10) {
        this.q = file;
        this.f0 = n8;
        this.c0 = new File(file, "journal");
        this.d0 = new File(file, "journal.tmp");
        this.e0 = new File(file, "journal.bkp");
        this.i0 = n9;
        this.g0 = l8;
        this.h0 = n10;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private c A(String var1_1, long var2_3) throws IOException {
        synchronized (this) {
            block6: {
                block5: {
                    try {
                        this.p();
                        this.F0(var1_1);
                        var6_4 = this.m0.get(var1_1);
                        if (var2_3 == -1L || var6_4 != null && (var4_5 = d.c((d)var6_4)) == var2_3) break block5;
                    }
                    catch (Throwable var1_2) {
                        break block6;
                    }
                    return null;
                }
                if (var6_4 != null) ** GOTO lbl17
                {
                    var6_4 = new d(this, var1_1);
                    this.m0.put(var1_1, (d)var6_4);
                    ** GOTO lbl-1000
lbl17:
                    // 1 sources

                    var7_6 = d.g((d)var6_4);
                    if (var7_6 == null) ** GOTO lbl-1000
                }
                return null;
lbl-1000:
                // 2 sources

                {
                    var7_6 = new c(this, (d)var6_4);
                    d.h((d)var6_4, var7_6);
                    var6_4 = this.l0;
                    var8_7 = new StringBuilder();
                    var8_7.append("DIRTY ");
                    var8_7.append(var1_1);
                    var8_7.append('\n');
                    var6_4.write(var8_7.toString());
                    this.l0.flush();
                    return var7_6;
                }
            }
            throw var1_2;
        }
    }

    private static void A0(File file, File file2, boolean bl) throws IOException {
        if (bl) {
            a.u(file2);
        }
        if (file.renameTo(file2)) {
            return;
        }
        throw new IOException();
    }

    private void C0() throws IOException {
        while (this.k0 > this.h0) {
            this.u0(this.m0.entrySet().iterator().next().getKey());
        }
    }

    private void D0() throws IOException {
        while (this.j0 > this.g0) {
            this.u0(this.m0.entrySet().iterator().next().getKey());
        }
    }

    private void F0(String string) {
        if (r0.matcher(string).matches()) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("keys must match regex [a-z0-9_-]{1,64}: \"");
        stringBuilder.append(string);
        stringBuilder.append("\"");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    private boolean H() {
        int n8 = this.n0;
        return n8 >= 2000 && n8 >= ((AbstractMap)this.m0).size();
    }

    public static a L(File object, int n8, int n9, long l8, int n10) throws IOException {
        if (l8 > 0L) {
            if (n10 > 0) {
                if (n9 > 0) {
                    Object object2;
                    Object object3 = new File((File)object, "journal.bkp");
                    if (((File)object3).exists()) {
                        object2 = new File((File)object, "journal");
                        if (((File)object2).exists()) {
                            ((File)object3).delete();
                        } else {
                            a.A0((File)object3, (File)object2, false);
                        }
                    }
                    object3 = new a((File)object, n8, n9, l8, n10);
                    if (((a)object3).c0.exists()) {
                        try {
                            super.d0();
                            super.W();
                            FileOutputStream fileOutputStream = new FileOutputStream(((a)object3).c0, true);
                            OutputStreamWriter outputStreamWriter = new OutputStreamWriter((OutputStream)fileOutputStream, ax.X9.d.a);
                            ((a)object3).l0 = object2 = new BufferedWriter(outputStreamWriter);
                            return object3;
                        }
                        catch (IOException iOException) {
                            PrintStream printStream = System.out;
                            object2 = new StringBuilder();
                            ((StringBuilder)object2).append("DiskLruCache ");
                            ((StringBuilder)object2).append(object);
                            ((StringBuilder)object2).append(" is corrupt: ");
                            ((StringBuilder)object2).append(iOException.getMessage());
                            ((StringBuilder)object2).append(", removing");
                            printStream.println(((StringBuilder)object2).toString());
                            ((a)object3).delete();
                        }
                    }
                    ((File)object).mkdirs();
                    object = new a((File)object, n8, n9, l8, n10);
                    super.s0();
                    return object;
                }
                throw new IllegalArgumentException("valueCount <= 0");
            }
            throw new IllegalArgumentException("maxFileCount <= 0");
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    private void W() throws IOException {
        a.u(this.d0);
        Iterator<d> iterator = this.m0.values().iterator();
        while (iterator.hasNext()) {
            int n8;
            d d8 = iterator.next();
            c c8 = d8.d;
            int n9 = 0;
            if (c8 == null) {
                for (n8 = n9; n8 < this.i0; ++n8) {
                    this.j0 += d8.b[n8];
                    ++this.k0;
                }
                continue;
            }
            d.h(d8, null);
            for (n8 = 0; n8 < this.i0; ++n8) {
                a.u(d8.j(n8));
                a.u(d8.k(n8));
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
    private void d0() throws IOException {
        block7: {
            var3_1 = new ax.X9.c(new FileInputStream(this.c0), ax.X9.d.a);
            var6_2 = var3_1.c();
            var5_3 = var3_1.c();
            var8_4 = var3_1.c();
            var4_5 = var3_1.c();
            var7_8 = var3_1.c();
            if (!"libcore.io.DiskLruCache".equals(var6_2) || !"1".equals(var5_3) || !Integer.toString(this.f0).equals(var8_4) || !Integer.toString(this.i0).equals(var4_5) || !(var2_9 = "".equals(var7_8))) ** GOTO lbl-1000
            var1_10 = 0;
            while (true) {
                this.o0(var3_1.c());
                ++var1_10;
            }
            {
                catch (Throwable var4_6) {
                    break block7;
                }
                catch (EOFException var4_7) {}
                {
                    this.n0 = var1_10 - this.m0.size();
                }
                ax.X9.d.a(var3_1);
                return;
            }
lbl-1000:
            // 1 sources

            {
                var8_4 = new StringBuilder();
                var8_4.append("unexpected journal header: [");
                var8_4.append(var6_2);
                var8_4.append(", ");
                var8_4.append(var5_3);
                var8_4.append(", ");
                var8_4.append(var4_5);
                var8_4.append(", ");
                var8_4.append(var7_8);
                var8_4.append("]");
                var9_11 = new IOException(var8_4.toString());
                throw var9_11;
            }
        }
        ax.X9.d.a(var3_1);
        throw var4_6;
    }

    static /* synthetic */ int o(a a8, int n8) {
        a8.n0 = n8;
        return n8;
    }

    private void o0(String stringArray) throws IOException {
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
                        ((AbstractMap)this.m0).remove(object);
                        return;
                    }
                }
            } else {
                charSequence = stringArray.substring(n9, n10);
            }
            d d8 = this.m0.get(charSequence);
            object = d8;
            if (d8 == null) {
                object = new d(this, (String)charSequence);
                ((AbstractMap)this.m0).put((String)charSequence, (d)object);
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

    private void p() {
        if (this.l0 != null) {
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
    private void q(c var1_1, boolean var2_3) throws IOException {
        synchronized (this) {
            block16: {
                try {
                    var10_4 = c.b((c)var1_1);
                    if (d.g((d)var10_4) != var1_1) ** GOTO lbl85
                    var3_6 = var5_5 = 0;
                    if (!var2_3) ** GOTO lbl31
                    var3_6 = var5_5;
                    if (d.e((d)var10_4)) ** GOTO lbl31
                    var4_7 = 0;
lbl10:
                    // 2 sources

                    while (true) {
                        var3_6 = var5_5;
                        if (var4_7 >= this.i0) ** GOTO lbl31
                        if (c.c((c)var1_1)[var4_7]) {
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

                    while (var3_6 < this.i0) {
                        var1_1 = var10_4.k(var3_6);
                        if (var2_3) {
                            if (var1_1.exists()) {
                                var11_10 = var10_4.j(var3_6);
                                var1_1.renameTo((File)var11_10);
                                var8_9 = d.a((d)var10_4)[var3_6];
                                d.a((d)var10_4)[var3_6] = var6_8 = var11_10.length();
                                this.j0 = this.j0 - var8_9 + var6_8;
                                ++this.k0;
                            }
                        } else {
                            a.u((File)var1_1);
                        }
                        ++var3_6;
                    }
                }
                {
                    ++this.n0;
                    d.h((d)var10_4, null);
                    if (d.e((d)var10_4) | var2_3) {
                        d.f((d)var10_4, true);
                        var1_1 = this.l0;
                        var11_10 = new StringBuilder();
                        var11_10.append("CLEAN ");
                        var11_10.append(d.b((d)var10_4));
                        var11_10.append(var10_4.l());
                        var11_10.append('\n');
                        var1_1.write(var11_10.toString());
                        if (var2_3) {
                            var6_8 = this.o0;
                            this.o0 = 1L + var6_8;
                            d.d((d)var10_4, var6_8);
                        }
                    } else {
                        this.m0.remove(d.b((d)var10_4));
                        var11_10 = this.l0;
                        var1_1 = new StringBuilder();
                        var1_1.append("REMOVE ");
                        var1_1.append(d.b((d)var10_4));
                        var1_1.append('\n');
                        var11_10.write(var1_1.toString());
                    }
                    this.l0.flush();
                    if (this.j0 > this.g0 || this.k0 > this.h0 || this.H()) {
                        this.p0.submit(this.q0);
                    }
                    return;
lbl85:
                    // 1 sources

                    var1_1 = new IllegalStateException();
                    throw var1_1;
                }
            }
            throw var1_2;
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void s0() throws IOException {
        synchronized (this) {
            Throwable throwable322;
            Writer writer;
            block10: {
                Throwable throwable2222;
                writer = this.l0;
                if (writer != null) {
                    writer.close();
                }
                Object object = new FileOutputStream(this.d0);
                Object object2 = new OutputStreamWriter((OutputStream)object, ax.X9.d.a);
                writer = new BufferedWriter((Writer)object2);
                {
                    catch (Throwable throwable2222) {}
                }
                try {
                    block11: {
                        writer.write("libcore.io.DiskLruCache");
                        writer.write("\n");
                        writer.write("1");
                        writer.write("\n");
                        writer.write(Integer.toString(this.f0));
                        writer.write("\n");
                        writer.write(Integer.toString(this.i0));
                        writer.write("\n");
                        writer.write("\n");
                        object2 = this.m0.values().iterator();
                        break block11;
                        throw throwable2222;
                    }
                    while (object2.hasNext()) {
                        StringBuilder stringBuilder;
                        object = (d)object2.next();
                        if (((d)object).d != null) {
                            stringBuilder = new StringBuilder();
                            stringBuilder.append("DIRTY ");
                            stringBuilder.append(((d)object).a);
                            stringBuilder.append('\n');
                            writer.write(stringBuilder.toString());
                            continue;
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("CLEAN ");
                        stringBuilder.append(((d)object).a);
                        stringBuilder.append(((d)object).l());
                        stringBuilder.append('\n');
                        writer.write(stringBuilder.toString());
                    }
                }
                catch (Throwable throwable322) {
                    break block10;
                }
                writer.close();
                if (this.c0.exists()) {
                    a.A0(this.c0, this.e0, true);
                }
                a.A0(this.d0, this.c0, false);
                this.e0.delete();
                object = new FileOutputStream(this.c0, true);
                writer = new OutputStreamWriter((OutputStream)object, ax.X9.d.a);
                this.l0 = object2 = new BufferedWriter(writer);
                return;
            }
            writer.close();
            throw throwable322;
        }
    }

    private static void u(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public e F(String object) throws IOException {
        synchronized (this) {
            InputStream[] inputStreamArray;
            int n8;
            block23: {
                block22: {
                    File[] fileArray;
                    Object object2;
                    block21: {
                        boolean bl;
                        block20: {
                            block19: {
                                this.p();
                                this.F0((String)object);
                                object2 = this.m0.get(object);
                                if (object2 != null) break block19;
                                return null;
                            }
                            bl = ((d)object2).c;
                            if (bl) break block20;
                            return null;
                        }
                        n8 = this.i0;
                        fileArray = new File[n8];
                        inputStreamArray = new InputStream[n8];
                        int n9 = 0;
                        try {
                            Comparable<File> comparable;
                            int n10;
                            for (n8 = 0; n8 < (n10 = this.i0); ++n8) {
                                comparable = ((d)object2).j(n8);
                                fileArray[n8] = comparable;
                                inputStreamArray[n8] = new FileInputStream((File)comparable);
                            }
                            ++this.n0;
                            Writer writer = this.l0;
                            comparable = new Comparable<File>();
                            ((StringBuilder)comparable).append("READ ");
                            ((StringBuilder)comparable).append((String)object);
                            ((StringBuilder)comparable).append('\n');
                            writer.append(((StringBuilder)comparable).toString());
                            bl = this.H();
                            if (!bl) break block21;
                            try {
                                this.p0.submit(this.q0);
                                break block21;
                            }
                            catch (Throwable throwable) {
                                break block22;
                            }
                        }
                        catch (FileNotFoundException fileNotFoundException) {
                            n8 = n9;
                            break block23;
                        }
                        {
                            catch (Throwable throwable) {}
                        }
                    }
                    long l8 = ((d)object2).e;
                    object2 = ((d)object2).b;
                    try {
                        return new e(this, (String)object, l8, fileArray, inputStreamArray, (long[])object2);
                    }
                    catch (Throwable throwable) {}
                }
                throw object;
            }
            while (n8 < this.i0) {
                object = inputStreamArray[n8];
                if (object == null) return null;
                {
                    ax.X9.d.a((Closeable)object);
                    ++n8;
                }
            }
            return null;
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
                        arrayList = this.l0;
                        if (arrayList != null) break block6;
                    }
                    catch (Throwable throwable2) {
                        break block7;
                    }
                    return;
                }
                arrayList = new ArrayList<d>(this.m0.values());
                int n8 = arrayList.size();
                int n9 = 0;
                while (true) {
                    int n10;
                    if (n9 >= n8) {
                        this.D0();
                        this.C0();
                        this.l0.close();
                        this.l0 = null;
                        return;
                    }
                    d d8 = arrayList.get(n9);
                    n9 = n10 = n9 + 1;
                    if (d8.d == null) continue;
                    d8.d.a();
                    n9 = n10;
                }
            }
            throw throwable2;
        }
    }

    public void delete() throws IOException {
        this.close();
        ax.X9.d.b(this.q);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean u0(String charSequence) throws IOException {
        synchronized (this) {
            Throwable throwable2;
            block8: {
                try {
                    Comparable<File> comparable;
                    this.p();
                    this.F0((String)charSequence);
                    Object object = this.m0.get(charSequence);
                    if (object == null || ((d)object).d != null) break block8;
                    for (int i8 = 0; i8 < this.i0; this.j0 -= ((d)object).b[i8], --this.k0, ++i8) {
                        comparable = ((d)object).j(i8);
                        if (((File)comparable).exists() && !((File)comparable).delete()) {
                            charSequence = new StringBuilder();
                            ((StringBuilder)charSequence).append("failed to delete ");
                            ((StringBuilder)charSequence).append(comparable);
                            object = new IOException(((StringBuilder)charSequence).toString());
                            throw object;
                        }
                        ((d)object).b[i8] = 0L;
                    }
                    ++this.n0;
                    object = this.l0;
                    comparable = new Comparable<File>();
                    ((StringBuilder)comparable).append("REMOVE ");
                    ((StringBuilder)comparable).append((String)charSequence);
                    ((StringBuilder)comparable).append('\n');
                    ((Writer)object).append(((StringBuilder)comparable).toString());
                    ((AbstractMap)this.m0).remove(charSequence);
                    if (this.H()) {
                        this.p0.submit(this.q0);
                    }
                    return true;
                }
                catch (Throwable throwable2) {}
            }
            return false;
            throw throwable2;
        }
    }

    public c v(String string) throws IOException {
        return this.A(string, -1L);
    }

    public final class c {
        private final d a;
        private final boolean[] b;
        private boolean c;
        private boolean d;
        final ax.X9.a e;

        private c(ax.X9.a object, d d8) {
            this.e = object;
            this.a = d8;
            object = d8.c ? null : (Object)new boolean[((ax.X9.a)object).i0];
            this.b = (boolean[])object;
        }

        static /* synthetic */ d b(c c8) {
            return c8.a;
        }

        static /* synthetic */ boolean[] c(c c8) {
            return c8.b;
        }

        static /* synthetic */ boolean d(c c8, boolean bl) {
            c8.c = bl;
            return bl;
        }

        public void a() throws IOException {
            this.e.q(this, false);
        }

        public void e() throws IOException {
            if (this.c) {
                this.e.q(this, false);
                this.e.u0(this.a.a);
            } else {
                this.e.q(this, true);
            }
            this.d = true;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public OutputStream f(int n8) throws IOException {
            ax.X9.a a8 = this.e;
            synchronized (a8) {
                Throwable throwable2;
                block9: {
                    FileOutputStream fileOutputStream;
                    block8: {
                        try {
                            if (this.a.d != this) {
                                IllegalStateException illegalStateException = new IllegalStateException();
                                throw illegalStateException;
                            }
                            if (this.a.c) break block8;
                            this.b[n8] = true;
                        }
                        catch (Throwable throwable2) {
                            break block9;
                        }
                    }
                    File file = this.a.k(n8);
                    try {
                        fileOutputStream = new FileOutputStream(file);
                        return new a(this, fileOutputStream);
                    }
                    catch (FileNotFoundException fileNotFoundException) {
                        this.e.q.mkdirs();
                        try {
                            fileOutputStream = new FileOutputStream(file);
                            return new a(this, fileOutputStream);
                        }
                        catch (FileNotFoundException fileNotFoundException2) {
                            return s0;
                        }
                    }
                }
                throw throwable2;
            }
        }

        private class a
        extends FilterOutputStream
        implements AutoCloseable {
            final c q;

            private a(c c8, OutputStream outputStream) {
                this.q = c8;
                super(outputStream);
            }

            @Override
            public void close() {
                try {
                    this.out.close();
                    return;
                }
                catch (IOException iOException) {
                    ax.X9.a$c.d(this.q, true);
                    return;
                }
            }

            @Override
            public void flush() {
                try {
                    this.out.flush();
                    return;
                }
                catch (IOException iOException) {
                    ax.X9.a$c.d(this.q, true);
                    return;
                }
            }

            @Override
            public void write(int n8) {
                try {
                    this.out.write(n8);
                    return;
                }
                catch (IOException iOException) {
                    ax.X9.a$c.d(this.q, true);
                    return;
                }
            }

            @Override
            public void write(byte[] byArray, int n8, int n9) {
                try {
                    this.out.write(byArray, n8, n9);
                    return;
                }
                catch (IOException iOException) {
                    ax.X9.a$c.d(this.q, true);
                    return;
                }
            }
        }
    }

    private final class d {
        private final String a;
        private final long[] b;
        private boolean c;
        private c d;
        private long e;
        final a f;

        private d(a a8, String string) {
            this.f = a8;
            this.a = string;
            this.b = new long[a8.i0];
        }

        static /* synthetic */ long d(d d8, long l8) {
            d8.e = l8;
            return l8;
        }

        static /* synthetic */ boolean f(d d8, boolean bl) {
            d8.c = bl;
            return bl;
        }

        static /* synthetic */ c h(d d8, c c8) {
            d8.d = c8;
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
            if (stringArray.length != this.f.i0) {
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
            File file = this.f.q;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.a);
            stringBuilder.append(".");
            stringBuilder.append(n8);
            return new File(file, stringBuilder.toString());
        }

        public File k(int n8) {
            File file = this.f.q;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.a);
            stringBuilder.append(".");
            stringBuilder.append(n8);
            stringBuilder.append(".tmp");
            return new File(file, stringBuilder.toString());
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

    public final class e
    implements Closeable,
    AutoCloseable {
        private final long c0;
        private File[] d0;
        private final InputStream[] e0;
        private final long[] f0;
        final a g0;
        private final String q;

        private e(a a8, String string, long l8, File[] fileArray, InputStream[] inputStreamArray, long[] lArray) {
            this.g0 = a8;
            this.q = string;
            this.c0 = l8;
            this.d0 = fileArray;
            this.e0 = inputStreamArray;
            this.f0 = lArray;
        }

        public File a(int n8) {
            return this.d0[n8];
        }

        @Override
        public void close() {
            InputStream[] inputStreamArray = this.e0;
            int n8 = inputStreamArray.length;
            for (int i8 = 0; i8 < n8; ++i8) {
                ax.X9.d.a(inputStreamArray[i8]);
            }
        }
    }
}

