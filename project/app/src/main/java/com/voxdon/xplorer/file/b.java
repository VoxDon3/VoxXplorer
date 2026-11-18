/*
 * Decompiled with CFR 0.152.
 */
package com.voxdon.xplorer.file;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import ax.Dc.D;
import ax.Dc.I;
import ax.Dc.J;
import ax.Dc.S;
import ax.Dc.T;
import ax.Dc.U;
import ax.T.l;
import ax.X2.Q;
import ax.b3.F;
import ax.b3.j;
import ax.b3.t;
import ax.c3.B;
import ax.c3.G;
import ax.c3.H;
import ax.c3.K;
import ax.c3.d0;
import ax.c3.z;
import ax.g3.h;
import ax.g3.i;
import ax.oc.a;
import ax.u3.q;
import com.voxdon.xplorer.file.c;
import com.voxdon.xplorer.file.m;
import com.voxdon.xplorer.file.n;
import com.voxdon.xplorer.file.o;
import com.voxdon.xplorer.file.p;
import com.voxdon.xplorer.file.x;
import com.voxdon.xplorer.file.y;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.SeekableByteChannel;
import java.nio.charset.Charset;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.logging.Logger;

public class b
extends m {
    private static HashMap<String, Integer> A;
    private static final Logger x;
    private static final Set<String> y;
    private static HashMap<Integer, String> z;
    private String h;
    private y i;
    private Uri j;
    private int k;
    private ParcelFileDescriptor l;
    private Closeable m;
    private T n;
    private boolean o;
    private ax.c3.a p;
    private boolean q = false;
    private int r;
    private boolean s;
    private String t;
    private File u;
    private File v;
    private Object w = new Object();

    static {
        x = Logger.getLogger("FileManager.ArchiveFileHelper");
        y = java.util.DesugarCollections.unmodifiableSet(new HashSet<String>(Arrays.asList("jpg", "jpeg", "png", "gif", "webp", "heic", "heif", "avif", "mp4", "m4v", "mov", "mkv", "webm", "avi", "3gp", "3g2", "flv", "wmv", "mp3", "m4a", "aac", "ogg", "oga", "opus", "flac", "zip", "7z", "rar", "gz", "bz2", "xz", "tgz", "tbz", "tbz2", "txz", "aab", "jar")));
        z = new HashMap();
        A = new HashMap();
    }

    static /* synthetic */ boolean B0(b b8, boolean bl) {
        b8.s = bl;
        return bl;
    }

    private void C0(ax.c3.a comparable, I i8, I i9) throws IOException {
        long l8;
        long l9;
        block4: {
            block2: {
                long l10;
                block3: {
                    l9 = ((ax.c3.a)comparable).p();
                    if (!b.p1((n)comparable, l9)) break block2;
                    if (!(i8 instanceof d)) break block3;
                    if (!((File)(comparable = this.L0((n)comparable))).exists() || ((File)comparable).isDirectory()) break block2;
                    l8 = B.c(comparable);
                    break block4;
                }
                l8 = l10 = i8.getCrc();
                if (l10 >= 0L) break block4;
            }
            return;
        }
        i9.setMethod(0);
        i9.setSize(l9);
        i9.setCompressedSize(l9);
        i9.setCrc(l8);
    }

    private static void E0(File file) {
        if (file != null && file.exists()) {
            if (file.isDirectory()) {
                String[] stringArray = file.list();
                if (stringArray != null && stringArray.length == 0) {
                    b.I0(file);
                    return;
                }
            } else {
                file.delete();
            }
        }
    }

    private void F0(S object) {
        Object object2;
        int n8;
        Object object3;
        Object object4;
        String[] stringArray;
        Object object5;
        Object object6;
        Object object7;
        this.p = new ax.c3.a(this, this.H0("/"), null);
        Object object8 = ((S)object).f();
        while (true) {
            boolean bl = object8.hasMoreElements();
            object7 = "//";
            if (!bl) break;
            object6 = object8.nextElement();
            if (!((I)object6).isDirectory()) continue;
            object5 = ((I)object6).getName();
            stringArray = ((String)object5).split(File.separator);
            object4 = this.p;
            object3 = new StringBuilder();
            for (n8 = 0; n8 < stringArray.length - 1; ++n8) {
                if (TextUtils.isEmpty((CharSequence)stringArray[n8])) {
                    object7 = ax.Ha.c.h().f().d("ARCHIVE INVALID SEGMENT 1");
                    object2 = new StringBuilder();
                    ((StringBuilder)object2).append("Entry:");
                    ((StringBuilder)object2).append(((I)object6).getName());
                    ((StringBuilder)object2).append(",Length:");
                    ((StringBuilder)object2).append(((I)object6).getName().length());
                    ((ax.Ha.b)object7).g(((StringBuilder)object2).toString()).h();
                    continue;
                }
                ((StringBuilder)object3).append(stringArray[n8]);
                ((StringBuilder)object3).append(File.separator);
                object7 = object2 = ((ax.c3.a)object4).h0(stringArray[n8]);
                if (object2 == null) {
                    object7 = new ax.c3.a(this, this.H0(((StringBuilder)object3).toString()), (ax.c3.a)object4);
                    ((ax.c3.a)object4).e0((ax.c3.a)object7);
                }
                object4 = object7;
            }
            object8 = object7 = object8;
            if (((String)object5).endsWith("//")) continue;
            object8 = object7;
            if (((String)object5).endsWith("///")) continue;
            object8 = new ax.c3.a(this, (I)object6, (ax.c3.a)object4);
            if (!TextUtils.isEmpty((CharSequence)((ax.c3.a)object8).k0())) {
                ((ax.c3.a)object4).e0((ax.c3.a)object8);
                object8 = object7;
                continue;
            }
            object8 = object7;
            if ("/".equals(object5)) continue;
            object8 = new StringBuilder();
            ((StringBuilder)object8).append("Invalid entry:");
            ((StringBuilder)object8).append((String)object5);
            ax.Q2.d.c("archivefileinfo name", new Exception(((StringBuilder)object8).toString()));
            object8 = object7;
        }
        object8 = ((S)object).f();
        object = object7;
        while (object8.hasMoreElements()) {
            object5 = object8.nextElement();
            if (((I)object5).isDirectory()) continue;
            object2 = ((I)object5).getName();
            stringArray = ((String)object2).split(File.separator);
            object7 = this.p;
            object6 = new StringBuilder();
            for (n8 = 0; n8 < stringArray.length - 1; ++n8) {
                if (TextUtils.isEmpty((CharSequence)stringArray[n8])) {
                    object3 = ax.Ha.c.h().f().d("ARCHIVE INVALID SEGMENT 2");
                    object4 = new StringBuilder();
                    ((StringBuilder)object4).append("Entry:");
                    ((StringBuilder)object4).append((String)object2);
                    ((StringBuilder)object4).append(",Length:");
                    ((StringBuilder)object4).append(((String)object2).length());
                    ((ax.Ha.b)object3).g(((StringBuilder)object4).toString()).h();
                    continue;
                }
                ((StringBuilder)object6).append(stringArray[n8]);
                ((StringBuilder)object6).append(File.separator);
                object4 = ((ax.c3.a)object7).h0(stringArray[n8]);
                if (object4 == null) {
                    object4 = ((StringBuilder)object6).toString();
                    if (((String)object4).endsWith((String)object)) {
                        object3 = ax.Ha.c.h().f().d("ARCHIVE ENTRY ERROR");
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Entry:");
                        stringBuilder.append((String)object2);
                        stringBuilder.append(",");
                        stringBuilder.append(((String)object2).length());
                        stringBuilder.append(",");
                        stringBuilder.append((String)object4);
                        ((ax.Ha.b)object3).g(stringBuilder.toString()).h();
                    }
                    object4 = new ax.c3.a(this, this.H0((String)object4), (ax.c3.a)object7);
                    ((ax.c3.a)object7).e0((ax.c3.a)object4);
                    object7 = object4;
                    continue;
                }
                object7 = object4;
            }
            object4 = new ax.c3.a(this, (I)object5, (ax.c3.a)object7);
            if (!TextUtils.isEmpty((CharSequence)((ax.c3.a)object4).k0())) {
                ((ax.c3.a)object7).e0((ax.c3.a)object4);
                continue;
            }
            object7 = new StringBuilder();
            ((StringBuilder)object7).append("Invalid entry:");
            ((StringBuilder)object7).append((String)object2);
            ax.Q2.d.c("archivefileinfo name", new Exception(((StringBuilder)object7).toString()));
        }
    }

    private int G0(ax.c3.a a8) {
        if (!a8.isDirectory()) {
            return 1;
        }
        Stack<ax.c3.a> stack = new Stack<ax.c3.a>();
        stack.push(a8);
        int n8 = 0;
        block0: while (!((AbstractCollection)stack).isEmpty()) {
            a8 = (ax.c3.a)stack.pop();
            if (!a8.isDirectory()) continue;
            Iterator<ax.c3.a> iterator = a8.i0().iterator();
            int n9 = n8;
            while (true) {
                n8 = n9++;
                if (!iterator.hasNext()) continue block0;
                a8 = iterator.next();
                if (a8 == null) {
                    ax.Q2.d.c("null archive child", new Exception("archive child null"));
                    continue;
                }
                if (!a8.isDirectory()) continue;
                stack.push(a8);
            }
        }
        return n8;
    }

    private I H0(String string) {
        return new d(string);
    }

    public static boolean I0(File file) {
        if (file != null && file.exists()) {
            String[] stringArray;
            if (file.isDirectory() && (stringArray = file.list()) != null) {
                for (int i8 = 0; i8 < stringArray.length; ++i8) {
                    if (b.I0(new File(file, stringArray[i8]))) continue;
                    return false;
                }
            }
            return file.delete();
        }
        return false;
    }

    private void J0(ax.c3.a comparable) {
        if (!((File)(comparable = this.L0((n)comparable))).exists()) {
            return;
        }
        if (((File)comparable).isDirectory()) {
            b.I0(comparable);
            return;
        }
        ((File)comparable).delete();
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static int M0(Uri object) {
        synchronized (b.class) {
            if (object != null) {
                String string;
                block8: {
                    string = object.toString();
                    object = A.get(string);
                    if (object == null) break block8;
                    return (Integer)object;
                }
                object = Math.abs(string.hashCode());
                while (z.containsKey(object)) {
                    object = (Integer)object + 1;
                }
                A.put(string, (Integer)object);
                z.put((Integer)object, string);
                return (Integer)object;
            }
            try {
                ax.u3.b.f();
            }
            catch (Throwable throwable) {}
            return 0;
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Uri P0(K object) {
        synchronized (b.class) {
            try {
                object = z.get(((K)object).b());
                if (object == null) return null;
                return Uri.parse((String)object);
            }
            catch (Exception exception) {}
            return null;
        }
    }

    public static InputStream Q0(T closeable, I i8, String object) throws IOException, j {
        closeable = new ax.qc.h(((T)closeable).A0(i8), ((String)object).toCharArray());
        object = new ax.rc.e();
        ((ax.rc.b)object).u(i8.getCrc());
        ((ax.rc.b)object).w(i8.isDirectory());
        ((ax.rc.b)object).s(i8.getCompressedSize());
        ((ax.rc.b)object).G(i8.getSize());
        if (((ax.qc.h)closeable).g((ax.rc.e)object, false) != null) {
            return closeable;
        }
        throw new F("Could not locate local file header for encrypted entry");
    }

    private File R0() {
        if (this.h == null) {
            return null;
        }
        CharSequence charSequence = new StringBuilder();
        charSequence.append(this.h.replace(".", "_"));
        charSequence.append(System.currentTimeMillis());
        charSequence = charSequence.toString();
        return new File(ax.Z2.a.m(this.p(), "archive-edit"), (String)charSequence);
    }

    private File S0(n comparable, boolean bl) {
        File file = this.u;
        if (bl && !file.exists()) {
            file.mkdirs();
        }
        file = new File(file, ((n)comparable).E());
        comparable = file.getParentFile();
        if (bl && comparable != null && !((File)comparable).exists()) {
            ((File)comparable).mkdirs();
        }
        return file;
    }

    private static File U0(Context context, ax.Q2.f f8, int n8) {
        return ax.Z2.a.i(context, f8, n8);
    }

    private ax.c3.a X0(String object) {
        String[] stringArray = ((String)object).split(File.separator);
        if (stringArray != null) {
            Object object2 = this.p;
            for (int i8 = 0; i8 < stringArray.length - 1; ++i8) {
                String string = stringArray[i8];
                object = object2;
                if (string != null) {
                    if (string.length() == 0) {
                        object = object2;
                    } else {
                        object = object2 = ((ax.c3.a)object2).h0(string);
                        if (object2 == null) {
                            return null;
                        }
                    }
                }
                object2 = object;
            }
            return object2;
        }
        return null;
    }

    private InputStream Z0(ax.c3.a a8) {
        Object object = ax.u3.B.i(this.s(a8), 512);
        a8 = object;
        if (object == null) {
            a8 = ax.s3.a.b();
        }
        object = new ByteArrayOutputStream(32768);
        a8.compress(Bitmap.CompressFormat.PNG, 0, (OutputStream)object);
        return new ByteArrayInputStream(((ByteArrayOutputStream)object).toByteArray());
    }

    private InputStream a1(I i8) throws IOException, j {
        if (this.s && !TextUtils.isEmpty((CharSequence)this.t)) {
            return b.Q0(this.n, i8, this.t);
        }
        return this.n.j(i8);
    }

    public static boolean d1(S object, ax.u3.c c8) throws ax.b3.a {
        object = ((S)object).f();
        while (object.hasMoreElements()) {
            if (c8 != null && c8.isCancelled()) {
                throw new ax.b3.a();
            }
            if (!((I)object.nextElement()).o().l()) continue;
            return true;
        }
        return false;
    }

    public static String g1(String string, boolean bl) {
        String string2 = File.separator;
        String string3 = string;
        if (string.startsWith(string2)) {
            string3 = string.substring(1);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string3);
        string = bl ? string2 : "";
        stringBuilder.append(string);
        return stringBuilder.toString();
    }

    private boolean h1(File file, File file2) throws j {
        if (!file.exists()) {
            return false;
        }
        if (file2.exists() && !b.I0(file2)) {
            throw new j("Could not delete stale edit copy");
        }
        if (file.renameTo(file2)) {
            return true;
        }
        throw new j("Could not move archive edit copy");
    }

    private void i1(ax.c3.a iterator) {
        File file = this.L0((n)((Object)iterator));
        if (file.exists()) {
            ((ax.c3.a)((Object)iterator)).o0(file);
        }
        if (((ax.c3.a)((Object)iterator)).isDirectory() && (iterator = ((ax.c3.a)((Object)iterator)).i0()) != null) {
            iterator = iterator.iterator();
            while (iterator.hasNext()) {
                this.i1((ax.c3.a)iterator.next());
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private boolean j1(o o8, n n8, n n9, File file) throws j {
        n n10;
        n n11 = n10 = o8.z(file.getAbsolutePath());
        try {
            if (n10.n()) {
                o8.P(n10);
                n11 = o8.z(file.getAbsolutePath());
            }
            o8.m0(n8, n11, null, null);
        }
        catch (ax.b3.a | j exception) {
            return false;
        }
        try {
            o8.m0(o8.z(n9.E()), o8.z(n8.E()), null, null);
            n9 = o8.z(file.getAbsolutePath());
            if (n9.n()) {
                o8.P(n9);
            }
            this.q = false;
            return true;
        }
        catch (ax.b3.a | j exception) {
            this.k1(o8, n8, file);
            return false;
        }
    }

    private void k1(o o8, n n8, File comparable) throws j {
        if (!(comparable = o8.z(((File)comparable).getAbsolutePath())).n() || o8.z(n8.E()).n()) {
            return;
        }
        try {
            o8.m0((n)comparable, o8.z(n8.E()), null, null);
            return;
        }
        catch (ax.b3.a a8) {
            throw new j(a8);
        }
    }

    static /* synthetic */ File o0(b b8, File file) {
        b8.v = file;
        return file;
    }

    public static void o1(I i8, long l8) {
        D d8 = new D();
        d8.s(new U(l8 / 1000L));
        i8.d(d8);
    }

    public static boolean p1(n n8, long l8) {
        if (l8 == -1L) {
            return false;
        }
        return y.contains(n8.A());
    }

    static /* synthetic */ boolean q0(b b8, boolean bl) {
        b8.o = bl;
        return bl;
    }

    private static void q1(InputStream inputStream, long l8) throws IOException {
        while (l8 > 0L) {
            long l9 = inputStream.skip(l8);
            if (l9 > 0L) {
                l8 -= l9;
                continue;
            }
            if (inputStream.read() < 0) break;
            --l8;
        }
    }

    static /* synthetic */ Closeable s0(b b8, Closeable closeable) {
        b8.m = closeable;
        return closeable;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void t1(ax.c3.a var1_1, J var2_10, Integer[] var3_12, i var4_14) throws j {
        block23: {
            block24: {
                block25: {
                    block27: {
                        block26: {
                            block22: {
                                if (var1_1 == null) throw new j("fileinfo == null");
                                var17_15 = var1_1.l0();
                                if (var17_15 == null) throw new j("zipEntry == null");
                                var7_16 = 0;
                                var6_17 = 0;
                                var8_18 = 0;
                                var16_19 = null;
                                var15_20 = null;
                                var14_21 = null;
                                var13_22 = null;
                                var12_23 = null;
                                var10_24 = null;
                                var11_25 = null;
                                var5_26 = var8_18;
                                var9_27 = var11_25;
                                try {
                                    var18_29 = this.H0(var1_1.t());
                                    var5_26 = var8_18;
                                    var9_27 = var11_25;
                                    if (var1_1.q() < 0L) break block22;
                                    var5_26 = var8_18;
                                    var9_27 = var11_25;
                                    var18_29.setTime(var1_1.q());
                                    var5_26 = var8_18;
                                    var9_27 = var11_25;
                                    b.o1(var18_29, var1_1.q());
                                }
                                catch (Throwable var1_2) {
                                    break block23;
                                }
                                catch (ArrayIndexOutOfBoundsException var1_3) {
                                    var6_17 = var7_16;
                                    break block24;
                                }
                                catch (IOException var1_4) {
                                    ** GOTO lbl182
                                }
                            }
                            var5_26 = var8_18;
                            var9_27 = var11_25;
                            if (!var1_1.isDirectory()) {
                                var5_26 = var8_18;
                                var9_27 = var11_25;
                                this.C0((ax.c3.a)var1_1, var17_15, var18_29);
                            }
                            var5_26 = var8_18;
                            var9_27 = var11_25;
                            var2_10.u0(var18_29);
                            var11_25 = var16_19;
                            var12_23 = var15_20;
                            var10_24 = var14_21;
                            try {
                                if (var1_1.isDirectory()) break block25;
                                var11_25 = var16_19;
                                var12_23 = var15_20;
                                var10_24 = var14_21;
                                if (!(var17_15 instanceof d)) break block26;
                                var11_25 = var16_19;
                                var12_23 = var15_20;
                                var10_24 = var14_21;
                                var13_22 = this.L0((n)var1_1);
                                var11_25 = var16_19;
                                var12_23 = var15_20;
                                var10_24 = var14_21;
                                if (!var13_22.exists()) {
                                    var11_25 = var16_19;
                                    var12_23 = var15_20;
                                    var10_24 = var14_21;
                                    ax.u3.b.e("Edit copy does not exist");
                                    var11_25 = var16_19;
                                    var12_23 = var15_20;
                                    var10_24 = var14_21;
                                    var11_25 = var16_19;
                                    var12_23 = var15_20;
                                    var10_24 = var14_21;
                                    var1_1 = new t("Archive entry input edit copy does not exist");
                                    var11_25 = var16_19;
                                    var12_23 = var15_20;
                                    var10_24 = var14_21;
                                    throw var1_1;
                                }
                                var11_25 = var16_19;
                                var12_23 = var15_20;
                                var10_24 = var14_21;
                                var11_25 = var16_19;
                                var12_23 = var15_20;
                                var10_24 = var14_21;
                                var9_27 = new FileInputStream((File)var13_22);
                                break block27;
                            }
                            catch (Throwable var1_5) {
                                var5_26 = 1;
                                var9_27 = var11_25;
                                break block23;
                            }
                            catch (ArrayIndexOutOfBoundsException var1_6) {
                                var6_17 = 1;
                                break block24;
                            }
                            catch (IOException var1_7) {
                                var6_17 = 1;
                                ** GOTO lbl182
                            }
                        }
                        var11_25 = var16_19;
                        var12_23 = var15_20;
                        var10_24 = var14_21;
                        var9_27 = this.a1(var17_15);
                        if (var9_27 == null) {
                            var11_25 = var9_27;
                            var12_23 = var9_27;
                            var10_24 = var9_27;
                            var11_25 = var9_27;
                            var12_23 = var9_27;
                            var10_24 = var9_27;
                            var1_1 = new t("Archive entry input stream is null");
                            var11_25 = var9_27;
                            var12_23 = var9_27;
                            var10_24 = var9_27;
                            throw var1_1;
                        }
                    }
                    var11_25 = var9_27;
                    var12_23 = var9_27;
                    var10_24 = var9_27;
                    ax.c3.F.b(var9_27, var2_10);
                    var13_22 = var9_27;
                    if (var4_14 != null) {
                        var11_25 = var9_27;
                        var12_23 = var9_27;
                        var10_24 = var9_27;
                        var5_26 = var3_12[0].intValue() + 1;
                        var11_25 = var9_27;
                        var12_23 = var9_27;
                        var10_24 = var9_27;
                        var3_12[0] = var5_26;
                        var11_25 = var9_27;
                        var12_23 = var9_27;
                        var10_24 = var9_27;
                        var4_14.a(var5_26, var3_12[1].intValue());
                        var13_22 = var9_27;
                    }
                }
                var11_25 = var13_22;
                var12_23 = var13_22;
                var10_24 = var13_22;
                var2_10.d();
                if (var13_22 != null) {
                    try {
                        var13_22.close();
                    }
                    catch (IOException var9_28) {
                        // empty catch block
                    }
                }
                if (var1_1.isDirectory() == false) return;
                var1_1 = var1_1.i0().iterator();
                while (var1_1.hasNext() != false) {
                    this.t1((ax.c3.a)((n)var1_1.next()), var2_10, (Integer[])var3_12, (i)var4_14);
                }
                return;
            }
            var5_26 = var6_17;
            var9_27 = var12_23;
            {
                var3_12 = ax.Ha.c.h().d("AFWE:");
                var5_26 = var6_17;
                var9_27 = var12_23;
                var5_26 = var6_17;
                var9_27 = var12_23;
                var4_14 = new StringBuilder();
                var5_26 = var6_17;
                var9_27 = var12_23;
                var4_14.append(var17_15.getSize());
                var5_26 = var6_17;
                var9_27 = var12_23;
                var4_14.append(":");
                var5_26 = var6_17;
                var9_27 = var12_23;
                var4_14.append(var17_15.getName());
                var5_26 = var6_17;
                var9_27 = var12_23;
                var3_12.g(var4_14.toString()).h();
                var5_26 = var6_17;
                var9_27 = var12_23;
                var5_26 = var6_17;
                var9_27 = var12_23;
                var3_12 = new j((Throwable)var1_1);
                var5_26 = var6_17;
                var9_27 = var12_23;
                throw var3_12;
lbl182:
                // 2 sources

                var5_26 = var6_17;
                var9_27 = var10_24;
                var1_8.printStackTrace();
                var5_26 = var6_17;
                var9_27 = var10_24;
                throw ax.b3.d.a("write entry error", (Exception)var1_8);
            }
        }
        if (var9_27 != null) {
            try {
                var9_27.close();
            }
            catch (IOException var3_13) {
                // empty catch block
            }
        }
        if (var5_26 == 0) throw var1_9;
        try {
            var2_10.d();
            throw var1_9;
        }
        catch (IOException var2_11) {
            throw var1_9;
        }
    }

    static /* synthetic */ T u0(b b8, T t8) {
        b8.n = t8;
        return t8;
    }

    static /* synthetic */ ParcelFileDescriptor x0(b b8, ParcelFileDescriptor parcelFileDescriptor) {
        b8.l = parcelFileDescriptor;
        return parcelFileDescriptor;
    }

    static /* synthetic */ File z0(b b8, File file) {
        b8.u = file;
        return file;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public InputStream A(String object, String object2, String object3) {
        block5: {
            object = null;
            try {
                object2 = (ax.c3.a)this.z((String)object2);
                z z8 = ((n)object2).G();
                if (ax.c3.z.f0 == z8) {
                    object = new BufferedInputStream(this.J((n)object2, 0L), 32768);
                    return new ax.ca.a((InputStream)object, (int)((ax.c3.a)object2).p());
                }
                if (ax.c3.z.e0 != z8) break block5;
                if (!Q.e1()) return object;
                return this.Z0((ax.c3.a)object2);
            }
            catch (j j8) {
                return null;
            }
        }
        ax.u3.b.f();
        return null;
    }

    @Override
    public boolean B(n n8) {
        return true;
    }

    @Override
    public List<n> C(n n8, m.f f8) throws j {
        if (n8.n()) {
            if (n8.isDirectory()) {
                return ((ax.c3.a)n8).j0();
            }
            throw new j("file is not directory");
        }
        throw new t();
    }

    /*
     * Exception decompiling
     */
    @Override
    public void D(n var1_1, G var2_16, String var3_18, long var4_20, Long var6_21, p var7_28, boolean var8_29, ax.u3.c var9_30, i var10_31) throws j, ax.b3.a {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 4[TRYBLOCK] [19, 18, 17, 16 : 217->227)] java.lang.Throwable
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public boolean D0() {
        if (this.s) {
            return false;
        }
        int n8 = this.r;
        if (n8 != 1) {
            if (n8 != 2 && n8 != 3) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("type:");
                stringBuilder.append(this.r);
                stringBuilder.append(",uri:");
                stringBuilder.append(this.j);
                ax.u3.b.g(stringBuilder.toString());
            }
            return false;
        }
        y y8 = this.i;
        if (y8 != null) {
            return y8.j();
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void E(n n8, n comparable, ax.u3.c object, i object2) throws j {
        IllegalArgumentException illegalArgumentException2;
        block10: {
            ax.c3.a a8;
            long l8;
            block9: {
                if (!this.D0()) {
                    throw new j("zip file is not writeable");
                }
                ax.u3.b.a(comparable.n());
                if (!n8.n()) {
                    throw new t();
                }
                l8 = n8.p();
                ax.c3.a a9 = (ax.c3.a)this.z(n8.E());
                File file = this.L0(a9);
                object = (ax.c3.a)comparable;
                File file2 = this.Y0((n)object);
                ax.c3.a a10 = this.X0(n8.E());
                a8 = this.X0(((n)comparable).E());
                if (a8 == null) {
                    throw new j("Target parent does not exist");
                }
                if (a10 == null) {
                    throw new j("Source parent does not exist");
                }
                if (n8.isDirectory()) {
                    ((ax.c3.a)object).n0();
                }
                if (!a9.n()) {
                    ax.u3.b.g("no zip entry source");
                    throw new t("Source file entry is null");
                }
                try {
                    boolean bl = this.h1(file, file2);
                    a10.m0(a9);
                    n8 = new ax.c3.a(this, a8, a9.l0(), a9.i0(), ((n)comparable).B());
                    ((ax.c3.a)n8).q0();
                    if (!bl) break block9;
                    this.i1((ax.c3.a)n8);
                }
                catch (IllegalArgumentException illegalArgumentException2) {
                    break block10;
                }
            }
            a8.e0((ax.c3.a)n8);
            this.q = true;
            if (object2 != null) {
                object2.a(l8, l8);
            }
            return;
        }
        object2 = ax.Ha.c.h().f().b("ARCHIVE FILE NO NAME");
        comparable = new StringBuilder();
        ((StringBuilder)comparable).append("dst:");
        ((StringBuilder)comparable).append(((ax.c3.a)object).k0());
        ((ax.Ha.b)object2).g(((StringBuilder)comparable).toString()).l(illegalArgumentException2).h();
        throw illegalArgumentException2;
    }

    @Override
    public void F(n n8, n n9, ax.u3.c c8, i i8) throws j, ax.b3.a {
        this.D(n9, this.s(n8), n8.s(), n8.p(), n8.q(), n8.D(), false, c8, i8);
    }

    @Override
    public int G(String string, String string2) {
        return -1;
    }

    @Override
    public String H(n n8) {
        z z8 = n8.G();
        if (ax.c3.z.f0 != z8 && ax.c3.z.e0 != z8) {
            return null;
        }
        return B.Y(n8);
    }

    @Override
    public void I(n object) throws j {
        if (this.D0()) {
            if (!d0.E((n)object)) {
                String[] stringArray = object.t().split(File.separator);
                if (stringArray != null) {
                    object = this.p;
                    int n8 = stringArray.length;
                    n n9 = object;
                    for (int i8 = 0; i8 < n8; ++i8) {
                        Object object2 = stringArray[i8];
                        if (((String)object2).length() == 0) continue;
                        if (object != null) {
                            object2 = ((ax.c3.a)object).h0((String)object2);
                            n9 = object;
                            object = object2;
                            continue;
                        }
                        throw new t("Can not found fileinfo");
                    }
                    if (object != null) {
                        ((ax.c3.a)n9).m0((ax.c3.a)object);
                        this.J0((ax.c3.a)object);
                        this.q = true;
                        return;
                    }
                }
                throw new t("Could not delete...");
            }
            throw new j("Could not delete root");
        }
        throw new j("zip file is not writeable");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public InputStream J(n object, long l8) throws j {
        I i9 = null;
        try {
            I i8 = ((ax.c3.a)object).l0();
            if (i8 == null) {
                i9 = i8;
                i9 = i8;
                object = new t("Zip entry is null");
                i9 = i8;
                throw object;
            }
            i9 = i8;
            Object object2 = this.L0((n)object);
            i9 = i8;
            if (((File)object2).exists()) {
                i9 = i8;
                i9 = i8;
                object = new FileInputStream((File)object2);
                if (l8 == 0L) return object;
                i9 = i8;
                b.q1((InputStream)object, l8);
                return object;
            }
            i9 = i8;
            object = this.a1(i8);
            if (object != null) {
                i9 = i8;
                i9 = i8;
                object2 = new a(this, (InputStream)object);
                if (l8 == 0L) return object2;
                i9 = i8;
                b.q1((InputStream)object2, l8);
                return object2;
            }
            i9 = i8;
            i9 = i8;
            object = new IOException("ZipFile getInputStream == null");
            i9 = i8;
            throw object;
        }
        catch (IOException iOException) {
            throw ax.b3.d.a("archive getinputstream", iOException);
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            ax.Ha.b b8 = ax.Ha.c.h().d("AFGIS");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(i9.getSize());
            stringBuilder.append(":");
            stringBuilder.append(i9.getName());
            b8.g(stringBuilder.toString()).h();
            throw new j("Zip entry read error");
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void K(Activity object, Fragment fragment, c.a a8) {
        synchronized (this) {
            block6: {
                Throwable throwable2;
                block7: {
                    block5: {
                        try {
                            if (this.k != 0 || this.i != null) break block5;
                            ax.Ha.c.h().f().b("ArchiveFileHelper invalid auth").j().h();
                        }
                        catch (Throwable throwable2) {
                            break block7;
                        }
                    }
                    try {
                        object = new b(this, a8);
                        ((q)object).i(new String[0]);
                        break block6;
                    }
                    catch (Exception exception) {}
                }
                throw throwable2;
            }
            return;
        }
    }

    public q K0() {
        this.o = false;
        return new c(this.p(), this.v(), this.l, this.m, this.i, this.n, this.u, this.v, this.r).i(new Long[0]);
    }

    @Override
    public boolean L() {
        return false;
    }

    public File L0(n n8) {
        return this.S0(n8, false);
    }

    @Override
    public boolean M(n comparable) {
        if (!this.D0()) {
            return false;
        }
        ax.c3.a a8 = this.X0(((n)comparable).E());
        Object object = ((n)comparable).B();
        if (a8 != null && a8.n() && a8.h0((String)object) == null) {
            object = new ax.c3.a(this, this.H0(b.g1(((n)comparable).E(), true)), a8);
            if (((File)(comparable = this.Y0((n)object))).exists() && !((File)comparable).isDirectory() && !((File)comparable).delete()) {
                return false;
            }
            if (!((File)comparable).exists() && !((File)comparable).mkdirs()) {
                return false;
            }
            ((ax.c3.a)object).o0((File)comparable);
            a8.e0((ax.c3.a)object);
            this.q = true;
            return true;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public boolean N(n object) {
        IOException iOException2;
        block5: {
            File file;
            if (!this.D0()) {
                return false;
            }
            ax.c3.a a8 = this.X0(((n)object).E());
            Object object2 = ((n)object).B();
            if (a8 == null) return false;
            if (!a8.n()) {
                return false;
            }
            if (a8.h0((String)object2) != null) return false;
            try {
                object2 = this.H0(b.g1(((n)object).E(), false));
                object = new ax.c3.a(this, (I)object2, a8);
                file = this.Y0((n)object);
                if (file.exists() && !file.delete()) {
                    object = new IOException("Could not delete stale edit copy");
                    throw object;
                }
            }
            catch (IOException iOException2) {
                break block5;
            }
            object2 = new FileOutputStream(file, false);
            ((FileOutputStream)object2).close();
            ((ax.c3.a)object).o0(file);
            a8.e0((ax.c3.a)object);
            this.q = true;
            return true;
        }
        iOException2.printStackTrace();
        return false;
    }

    public int N0() {
        return this.r;
    }

    @Override
    public boolean O() {
        return true;
    }

    public Uri O0() {
        return this.j;
    }

    @Override
    public void P(n n8) throws j {
        this.I(n8);
    }

    @Override
    public boolean Q(n n8, n n9) {
        return true;
    }

    public int T0() {
        return this.k;
    }

    public y V0() {
        return this.i;
    }

    public String W0() {
        return this.h;
    }

    public File Y0(n n8) {
        return this.S0(n8, true);
    }

    @Override
    public boolean a() {
        return this.n != null && this.o;
    }

    @Override
    public boolean a0(n n8) {
        return this.D0();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void b() {
        synchronized (this) {
            ax.c3.x.h(this.u(), this.t());
            this.K0();
            return;
        }
    }

    public boolean b1() {
        return this.q;
    }

    public boolean c1() {
        return this.s;
    }

    public boolean e1() {
        return this.r != 0 && this.j != null;
    }

    public boolean f1() {
        return TextUtils.isEmpty((CharSequence)this.t) ^ true;
    }

    public void l1(Uri uri, y y8, int n8) {
        this.j = uri;
        this.r = n8;
        this.i = y8;
        this.h = y8.B();
    }

    @Override
    void m(n n8, String string, boolean bl, boolean bl2, h h8, ax.u3.c c8) {
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void m1(Uri uri, String string, int n8, int n9) {
        this.j = uri;
        this.r = n9;
        this.h = string;
        this.k = n8;
        try {
            this.l = ParcelFileDescriptor.fromFd((int)n8);
            return;
        }
        catch (IOException iOException) {
            return;
        }
    }

    public void n1(String string) {
        this.t = string;
    }

    public void r1(String string, ax.b0.a<e> a8) {
        new f(this, string, a8).i(new String[0]);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean s1(i var1_1) throws j {
        block23: {
            block24: {
                block21: {
                    block22: {
                        if (!this.q) {
                            return true;
                        }
                        var2_4 = this.r;
                        if (var2_4 != 3 && var2_4 != 2) {
                            if (this.i == null) {
                                ax.u3.b.g("not reachable");
                                return false;
                            }
                            if (!this.D0()) {
                                throw new j("zip file is not writeable");
                            }
                            var6_5 = null;
                            var7_8 = null;
                            var5_9 = this.i.E();
                            var8_13 = d0.r((String)var5_9);
                            var9_15 /* !! */  = new StringBuilder();
                            var9_15 /* !! */ .append(d0.h((String)var5_9));
                            var9_15 /* !! */ .append(".tmp.zip");
                            var4_14 = new File((String)var8_13, var9_15 /* !! */ .toString());
                        } else {
                            var1_1 = new StringBuilder();
                            var1_1.append("not reachable : ");
                            var1_1.append(this.r);
                            var1_1.append(",");
                            var1_1.append(this.b1());
                            ax.u3.b.g(var1_1.toString());
                            return false;
                        }
                        var9_15 /* !! */  = new StringBuilder();
                        var9_15 /* !! */ .append(d0.h((String)var5_9));
                        var9_15 /* !! */ .append(".tmp.zip");
                        var9_15 /* !! */ .append(".bak");
                        var7_8 = new File((String)var8_13, var9_15 /* !! */ .toString());
                        var8_13 = ax.c3.x.f(var4_14);
                        var11_16 = (x)var8_13.u();
                        var9_15 /* !! */  = var8_13.z((String)var5_9);
                        var10_17 = var8_13.z(var4_14.getAbsolutePath());
                        var11_16 = var11_16.c(var4_14.getAbsolutePath(), false);
                        var5_9 = new J((OutputStream)var11_16);
                        try {
                            var5_9.F0(Charset.defaultCharset().name());
                            var11_16 = this.p.i0();
                            if (var11_16 == null) break block21;
                            var2_4 = this.G0(this.p);
                            if (var1_1 == null) break block22;
                            var1_1.a(0L, var2_4);
                        }
                        catch (Throwable var6_6) {
                            var1_1 = var5_9;
                            var5_9 = var6_6;
lbl59:
                            // 2 sources

                            while (true) {
                                var6_5 = var1_1;
                                var1_1 = var5_9;
                                var5_9 = var6_5;
                                break block23;
                                break;
                            }
                        }
                        catch (Throwable var1_3) {
                            var4_14 = null;
                            var5_9 = var6_5;
                            break block23;
                        }
                        catch (IOException var5_11) {
                            var1_1 = null;
                            var4_14 = var7_8;
                            break block24;
                        }
                        catch (Throwable var1_2) {
                            var5_9 = var6_5;
                            break block23;
                        }
                        catch (IOException var5_10) {
                            var1_1 = null;
                            break block24;
                        }
                        catch (IOException var6_7) {
                            var1_1 = var5_9;
                            var5_9 = var6_7;
                            break block24;
                        }
                    }
                    var11_16 = var11_16.iterator();
                    while (var11_16.hasNext()) {
                        this.t1((ax.c3.a)((n)var11_16.next()), (J)var5_9, new Integer[]{0, var2_4}, (i)var1_1);
                    }
                }
                var5_9.o();
                var5_9.close();
                {
                    var3_18 = this.j1((o)var8_13, (n)var9_15 /* !! */ , var10_17, var7_8);
                }
                ax.c3.F.a(null);
                if (var4_14.exists()) {
                    var4_14.delete();
                }
                return var3_18;
            }
            try {
                throw ax.b3.d.a("update archive error", (Exception)var5_9);
            }
            catch (Throwable var5_12) {
                ** continue;
            }
        }
        ax.c3.F.a((AutoCloseable)var5_9);
        if (var4_14 != null && var4_14.exists()) {
            var4_14.delete();
        }
        throw var1_1;
    }

    @Override
    public n z(String string) throws j {
        if (this.p != null) {
            String[] stringArray = string.split(File.separator);
            ax.c3.a a8 = this.p;
            for (int i8 = 0; i8 < stringArray.length; ++i8) {
                String string2 = stringArray[i8];
                ax.c3.a a9 = a8;
                if (string2 != null) {
                    if ("".equals(string2)) {
                        a9 = a8;
                    } else {
                        if (a8 == null) {
                            ax.Ha.c.h().d("ARFI").j().h();
                        }
                        a9 = a8 = a8.h0(stringArray[i8]);
                        if (a8 == null) {
                            return new ax.c3.a(this, string);
                        }
                    }
                }
                a8 = a9;
            }
            return a8;
        }
        throw new j("no root");
    }

    class a
    extends H {
        final b c0;

        a(b b8, InputStream inputStream) {
            this.c0 = b8;
            super(inputStream);
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        public void close() throws IOException {
            Object object = this.c0.w;
            synchronized (object) {
                super.close();
                return;
            }
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        public int read() throws IOException {
            Object object = this.c0.w;
            synchronized (object) {
                return super.read();
            }
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        public int read(byte[] byArray) throws IOException {
            Object object = this.c0.w;
            synchronized (object) {
                return super.read(byArray);
            }
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        public int read(byte[] byArray, int n8, int n9) throws IOException {
            Object object = this.c0.w;
            synchronized (object) {
                return super.read(byArray, n8, n9);
            }
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        public void reset() throws IOException {
            synchronized (this) {
                Object object = this.c0.w;
                synchronized (object) {
                    super.reset();
                    return;
                }
            }
        }

        /*
         * Enabled aggressive block sorting
         */
        @Override
        public long skip(long l8) throws IOException {
            if (l8 <= 0L) {
                return 0L;
            }
            int n8 = (int)Math.min((long)2048, l8);
            byte[] byArray = new byte[n8];
            long l9 = l8;
            while (l9 > 0L) {
                long l10;
                int n9 = this.read(byArray, 0, (int)Math.min((long)n8, l9));
                if (n9 < 0) {
                    return l8 - l9;
                }
                if (n9 == 0) {
                    if (this.read() < 0) {
                        return l8 - l9;
                    }
                    l10 = 1L;
                } else {
                    l10 = n9;
                }
                l9 -= l10;
            }
            return l8 - l9;
        }
    }

    private class b
    extends q<String, Void, Boolean> {
        c.a h;
        IOException i;
        final b j;

        b(b b8, c.a a8) {
            this.j = b8;
            super(q.e.c0);
            this.h = a8;
        }

        private void A(ParcelFileDescriptor object) throws IOException {
            Charset charset = this.x((ParcelFileDescriptor)object);
            try {
                B.d0(object, 0L);
                object = new FileInputStream(object.getFileDescriptor());
            }
            catch (ErrnoException errnoException) {
                throw new IOException("reset parcel file descriptor position error", errnoException);
            }
            b.s0(this.j, (Closeable)object);
            object = ax.T.l.a((FileInputStream)object);
            b.u0(this.j, T.u0((SeekableByteChannel)object, charset.name()));
        }

        private void w() {
            b.q0(this.j, false);
            ax.c3.F.a(this.j.n);
            b.u0(this.j, null);
            ax.c3.F.a(this.j.m);
            b.s0(this.j, null);
            ax.c3.F.a((AutoCloseable)this.j.l);
            b.x0(this.j, null);
        }

        private Charset x(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
            ParcelFileDescriptor parcelFileDescriptor2 = null;
            try {
                parcelFileDescriptor2 = parcelFileDescriptor = ParcelFileDescriptor.dup((FileDescriptor)parcelFileDescriptor.getFileDescriptor());
            }
            catch (Throwable throwable) {
                ax.c3.F.a(parcelFileDescriptor2);
                throw throwable;
            }
            Charset charset = ax.Dc.e.b(parcelFileDescriptor.getFileDescriptor());
            ax.c3.F.a((AutoCloseable)parcelFileDescriptor);
            return charset;
        }

        @Override
        protected void r() {
            c.a a8 = this.h;
            if (a8 != null) {
                a8.B();
            }
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        protected Boolean y(String ... object) {
            block20: {
                block21: {
                    ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException2;
                    block19: {
                        IllegalArgumentException illegalArgumentException2;
                        block18: {
                            RuntimeException runtimeException2;
                            block17: {
                                IOException iOException2;
                                block16: {
                                    block15: {
                                        block14: {
                                            try {
                                                if (this.j.k == 0) break block14;
                                                if (this.j.l == null) {
                                                    object = new IOException("parcel file descriptor not created from fd");
                                                    throw object;
                                                }
                                                this.A(this.j.l);
                                                break block15;
                                            }
                                            catch (IOException iOException2) {
                                                break block16;
                                            }
                                            catch (RuntimeException runtimeException2) {
                                                break block17;
                                            }
                                            catch (IllegalArgumentException illegalArgumentException2) {
                                                break block18;
                                            }
                                            catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException2) {
                                                break block19;
                                            }
                                        }
                                        if (this.j.i == null) {
                                            return Boolean.FALSE;
                                        }
                                        boolean bl = this.j.i.k0();
                                        if (bl) {
                                            try {
                                                object = this.j;
                                                b.x0((b)object, ((b)object).i.e0(true));
                                                this.A(this.j.l);
                                            }
                                            catch (j j8) {
                                                object = new IOException("get parcel file descriptor error", j8);
                                                throw object;
                                            }
                                        } else {
                                            object = ax.Dc.e.a(this.j.i.F0());
                                            b b8 = this.j;
                                            b.u0(b8, T.s0(b8.i.F0(), ((Charset)object).name()));
                                        }
                                    }
                                    object = this.j;
                                    b.z0((b)object, ((b)object).R0());
                                    try {
                                        object = this.j;
                                        b.B0((b)object, b.d1(((b)object).n, null));
                                        break block20;
                                    }
                                    catch (ax.b3.a a8) {}
                                }
                                this.i = iOException2;
                                break block21;
                            }
                            this.i = new IOException(runtimeException2);
                            break block21;
                        }
                        this.i = new IOException(illegalArgumentException2);
                        break block21;
                    }
                    this.i = new IOException(arrayIndexOutOfBoundsException2);
                }
                this.w();
                return Boolean.FALSE;
            }
            object = this.j;
            ((b)object).F0(((b)object).n);
            object = this.j;
            b.o0((b)object, b.U0(((m)object).p(), this.j.u(), this.j.t()));
            if (this.j.v != null) {
                this.j.v.mkdirs();
            }
            b.q0(this.j, true);
            return Boolean.TRUE;
        }

        protected void z(Boolean bl) {
            c.a a8 = this.h;
            if (a8 != null) {
                a8.T(bl, this.i);
            }
        }
    }

    static class c
    extends q<Long, Integer, Boolean> {
        Context h;
        K i;
        S j;
        y k;
        File l;
        File m;
        int n;
        Closeable o;
        ParcelFileDescriptor p;

        public c(Context context, K k8, ParcelFileDescriptor parcelFileDescriptor, Closeable closeable, y y8, S s8, File file, File file2, int n8) {
            super(q.e.f0);
            this.h = context;
            this.i = k8;
            this.p = parcelFileDescriptor;
            this.o = closeable;
            this.k = y8;
            this.j = s8;
            this.l = file;
            this.m = file2;
            this.n = n8;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        protected Boolean w(Long ... object) {
            ax.r3.d.i(this.h, this.i);
            b.E0(this.m);
            try {
                object = this.j;
                if (object != null) {
                    ((S)object).close();
                }
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
            b.I0(this.l);
            object = this.o;
            if (object != null) {
                try {
                    object.close();
                }
                catch (IOException iOException) {
                    // empty catch block
                }
            }
            if ((object = this.p) != null) {
                try {
                    object.close();
                }
                catch (IOException iOException) {
                    // empty catch block
                }
            }
            if ((object = this.k) == null) return Boolean.TRUE;
            if (this.n != 2) return Boolean.TRUE;
            object = ax.c3.x.f(((y)object).F0());
            try {
                ((o)object).P(this.k);
                ((o)object).P(((o)object).z(this.k.T()));
                return Boolean.TRUE;
            }
            catch (j j8) {
                return Boolean.TRUE;
            }
        }
    }

    private static class d
    extends I {
        public d(String string) {
            super(string);
        }
    }

    public static final class e
    extends Enum<e> {
        public static final /* enum */ e c0;
        public static final /* enum */ e d0;
        private static final e[] e0;
        public static final /* enum */ e q;

        static {
            q = new e();
            c0 = new e();
            d0 = new e();
            e0 = e.d();
        }

        private static /* synthetic */ e[] d() {
            return new e[]{q, c0, d0};
        }

        public static e valueOf(String string) {
            return Enum.valueOf(e.class, string);
        }

        public static e[] values() {
            return (e[])e0.clone();
        }
    }

    private class f
    extends q<String, Void, e> {
        private String h;
        private ax.b0.a<e> i;
        final b j;

        f(b b8, String string, ax.b0.a<e> a8) {
            this.j = b8;
            super(q.e.d0);
            this.h = string;
            this.i = a8;
        }

        /*
         * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
         * Loose catch block
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        protected e w(String ... object) {
            Enumeration<I> enumeration = this.j.n.f();
            while (enumeration.hasMoreElements()) {
                Object object2 = enumeration.nextElement();
                if (!((I)object2).o().l()) continue;
                object = null;
                Object object3 = null;
                Object object4 = null;
                object2 = b.Q0(this.j.n, (I)object2, this.h);
                object4 = object2;
                object = object2;
                object3 = object2;
                e e8 = e.q;
                ax.c3.F.a((AutoCloseable)object2);
                return e8;
                {
                    block8: {
                        Throwable throwable222222;
                        block7: {
                            catch (Throwable throwable222222) {
                                break block7;
                            }
                            catch (ax.oc.a a8) {}
                            object4 = object;
                            object3 = object;
                            {
                                if (a8.a() != a.a.q) break block8;
                                object4 = object;
                                object3 = e.c0;
                            }
                            ax.c3.F.a((AutoCloseable)object);
                            return object3;
                        }
                        ax.c3.F.a(object4);
                        throw throwable222222;
                        catch (j | IOException exception) {}
                    }
                    ax.c3.F.a(object3);
                    continue;
                }
                break;
            }
            return e.c0;
        }

        protected void x(e e8) {
            this.i.accept(e8);
        }
    }
}

