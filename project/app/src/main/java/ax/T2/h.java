/*
 * Decompiled with CFR 0.152.
 */
package ax.T2;

import android.app.usage.StorageStats;
import android.app.usage.StorageStatsManager;
import android.app.usage.UsageStats;
import android.app.usage.UsageStatsManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Process;
import android.os.UserHandle;
import android.os.storage.StorageManager;
import android.text.TextUtils;
import android.util.ArrayMap;
import ax.T2.a;
import ax.T2.b;
import ax.T2.c;
import ax.T2.d;
import ax.T2.j;
import ax.T2.l;
import ax.X2.Q;
import ax.c3.A;
import ax.c3.K;
import ax.c3.d0;
import ax.c3.k0;
import ax.c3.q;
import ax.c3.x;
import ax.c3.z;
import ax.u3.o;
import com.alphainventor.filemanager.file.J;
import com.alphainventor.filemanager.file.n;
import com.alphainventor.filemanager.file.y;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Logger;

public class h {
    private static final Logger p = ax.Q2.g.a(h.class);
    private static HashMap<K, h> q = new HashMap();
    final K a;
    boolean b;
    f c;
    i d;
    boolean e;
    boolean f;
    private ArrayList<g> g = new ArrayList();
    final Object h = new Object();
    final Object i = new Object();
    private CountDownLatch j;
    private Set<String> k;
    private boolean l;
    final AtomicInteger m = new AtomicInteger(0);
    private boolean n = false;
    Comparator<h> o = new Comparator<h>(this){
        final h q;
        {
            this.q = h8;
        }

        public int a(h h8, h h9) {
            return Long.valueOf(h9.b).compareTo(h8.b);
        }
    };

    h(K k8) {
        this.a = k8;
        this.e = false;
        this.l = ax.Q2.f.x0(k8.d());
    }

    static File A(Context object, K k8) {
        File file = ax.Q2.e.q((Context)object);
        if (k8.b() == 0) {
            object = new StringBuilder();
            ((StringBuilder)object).append("analysis_");
            ((StringBuilder)object).append(k8.d().I());
            object = ((StringBuilder)object).toString();
        } else {
            object = new StringBuilder();
            ((StringBuilder)object).append("analysis_");
            ((StringBuilder)object).append(k8.d().I());
            ((StringBuilder)object).append(":");
            ((StringBuilder)object).append(k8.b());
            object = ((StringBuilder)object).toString();
        }
        return new File(file.getAbsolutePath(), (String)object);
    }

    public static K B(K k8) {
        return K.a(ax.Q2.f.i1, ax.T2.h.r(k8));
    }

    public static boolean C0(int n8) {
        return n8 == 0;
    }

    private void D0(com.alphainventor.filemanager.file.o object, f f8, e object2) throws ax.b3.j {
        Object object3 = this.e0(((e)object2).a, true);
        this.E0(f8, (String)object3, ((e)object2).d);
        long l8 = ((e)object2).d;
        if (l8 > 0x3200000L) {
            f8.f.add(new h((String)object3, l8, true));
            f8.p += ((e)object2).d;
        }
        if (ax.U2.d.Q((String)object3)) {
            f8.h.add(new h((String)object3, 0L, true));
        }
        if ((l8 = ((e)object2).e) > 0L) {
            this.e(f8.e, z.f0, l8);
        }
        if ((l8 = ((e)object2).f) > 0L) {
            this.e(f8.e, z.c0, l8);
        }
        if ((l8 = ((e)object2).g) > 0L) {
            this.e(f8.e, z.e0, l8);
        }
        if ((l8 = ((e)object2).h) > 0L) {
            this.e(f8.e, z.v0, l8);
        }
        if ((l8 = ((e)object2).i) > 0L) {
            this.e(f8.e, z.r0, l8);
        }
        if ((l8 = ((e)object2).j) > 0L) {
            this.e(f8.e, z.u0, l8);
        }
        if (((e)object2).k) {
            if (((e)object2).b == null) {
                ((e)object2).b = ((com.alphainventor.filemanager.file.o)object).z(((e)object2).a);
            }
            if (!((e)object2).b.isDirectory()) {
                ".android_secure".equals(((e)object2).b.B());
                return;
            }
            try {
                object = this.z0((com.alphainventor.filemanager.file.o)object, ((e)object2).b);
            }
            catch (ax.b3.e e8) {
                object = null;
            }
            if (object != null) {
                object2 = new ArrayList();
                object3 = object.iterator();
                while (object3.hasNext()) {
                    object = (n)object3.next();
                    if (object.isDirectory()) continue;
                    ((ArrayList)object2).add(object);
                }
                int n8 = ((ArrayList)object2).size();
                int n9 = 0;
                while (n9 < n8) {
                    object = ((ArrayList)object2).get(n9);
                    int n10 = n9 + 1;
                    object = (n)object;
                    l8 = object.p();
                    n9 = n10;
                    if (l8 <= 0xA00000L) continue;
                    f8.g.add(new h(this.e0(((n)object).E(), false), l8, false));
                    f8.o += l8;
                    n9 = n10;
                }
            }
        }
    }

    private void E0(f f8, String string, long l8) {
        while (true) {
            Long l9;
            if ((l9 = f8.d.get(string)) != null) {
                f8.d.put(string, l9 + l8);
            } else {
                f8.d.put(string, l8);
            }
            if ("/".equals(string)) {
                return;
            }
            string = d0.r(string);
        }
    }

    private void K0(com.alphainventor.filemanager.file.o o8, f f8, String string, String[] object) throws ax.b3.j {
        String[] stringArray = object[2].split("/");
        object = new e();
        object.d = Long.valueOf(stringArray[0]);
        object.e = Long.valueOf(stringArray[1]);
        object.f = Long.valueOf(stringArray[2]);
        object.g = Long.valueOf(stringArray[3]);
        object.h = Long.valueOf(stringArray[4]);
        object.i = Long.valueOf(stringArray[5]);
        object.j = Long.valueOf(stringArray[6]);
        object.k = Boolean.valueOf(stringArray[7]);
        object.l = Long.valueOf(stringArray[8]);
        object.m = Long.valueOf(stringArray[9]);
        object.c = false;
        object.b = null;
        object.a = string;
        this.D0(o8, f8, (e)object);
    }

    private void M0(List<h> list) {
        Collections.sort(list, this.o);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void Q0(com.alphainventor.filemanager.file.o object, f f8, n n8, List<n> object2, Writer writer, boolean bl) throws IOException {
        long l8;
        object = this.d0(n8);
        e e8 = new e();
        e8.b = n8;
        e8.a = n8.E();
        e8.m = bl ? 1L : n8.q();
        object2 = object2.iterator();
        while (object2.hasNext()) {
            Object object3;
            Object object4;
            n n9;
            block15: {
                block14: {
                    n9 = (n)object2.next();
                    try {
                        l8 = n9.p();
                        object4 = A.g(d0.f(n9.B()));
                        object3 = A.i(object4);
                        e8.d += l8;
                        if (z.v0 != object3) break block14;
                        e8.h += l8;
                        break block15;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                    }
                }
                if (z.f0 == object4) {
                    e8.e += l8;
                } else if (z.c0 == object4) {
                    e8.f += l8;
                } else if (z.e0 == object4) {
                    e8.g += l8;
                } else if (z.r0 == object4) {
                    e8.i += l8;
                } else {
                    e8.j += l8;
                }
            }
            this.e(f8.e, (z)((Object)object4), l8);
            if (l8 <= 0xA00000L) continue;
            e8.k = true;
            e8.l += l8;
            object3 = f8.g;
            object4 = new h(this.e0(n9.E(), false), l8, false);
            ((ArrayList)object3).add(object4);
            f8.o += l8;
        }
        object2 = new StringBuffer();
        ((StringBuffer)object2).append(Uri.encode((String)n8.E()));
        ((StringBuffer)object2).append("\u0000");
        ((StringBuffer)object2).append(String.valueOf(e8.m));
        ((StringBuffer)object2).append("\u0000");
        ((StringBuffer)object2).append(e8.d);
        ((StringBuffer)object2).append("/");
        ((StringBuffer)object2).append(e8.e);
        ((StringBuffer)object2).append("/");
        ((StringBuffer)object2).append(e8.f);
        ((StringBuffer)object2).append("/");
        ((StringBuffer)object2).append(e8.g);
        ((StringBuffer)object2).append("/");
        ((StringBuffer)object2).append(e8.h);
        ((StringBuffer)object2).append("/");
        ((StringBuffer)object2).append(e8.i);
        ((StringBuffer)object2).append("/");
        ((StringBuffer)object2).append(e8.j);
        ((StringBuffer)object2).append("/");
        ((StringBuffer)object2).append(e8.k);
        ((StringBuffer)object2).append("/");
        ((StringBuffer)object2).append(e8.l);
        ((StringBuffer)object2).append("/");
        ((StringBuffer)object2).append(e8.m);
        e8.c = true;
        if (ax.U2.d.Q((String)object)) {
            f8.h.add(new h((String)object, 0L, true));
        }
        if ((l8 = e8.d) > 0x3200000L) {
            f8.f.add(new h((String)object, l8, true));
            f8.p += e8.d;
        }
        this.E0(f8, (String)object, e8.d);
        ((StringBuffer)object2).append("\n");
        if (writer != null) {
            writer.write(((StringBuffer)object2).toString());
        }
        this.v((String)object, false);
    }

    public static h S(K k8) {
        h h8;
        h h9 = h8 = q.get(k8);
        if (h8 == null) {
            ax.u3.b.c(ax.Q2.f.U(k8.d()));
            h9 = new h(k8);
            q.put(k8, h9);
        }
        return h9;
    }

    public static h T(n n8) {
        K k8 = n8.R();
        if (ax.Q2.f.U(k8.d())) {
            return ax.T2.h.S(k8);
        }
        if (ax.Q2.f.S(k8.d())) {
            return ax.T2.h.S(ax.T2.h.q(n8.L()));
        }
        ax.u3.b.g("NOT REACHABLE : invalid fileinfo");
        return null;
    }

    public static h a0() {
        h h8;
        K k8 = K.a(ax.Q2.f.o1, 0);
        h h9 = h8 = q.get(k8);
        if (h8 == null) {
            h9 = new h(k8);
            q.put(k8, h9);
        }
        return h9;
    }

    public static K b0(K k8) {
        return K.a(ax.Q2.f.o1, ax.T2.h.r(k8));
    }

    private void d(HashMap<z, Long> hashMap, String object, long l8) {
        Object object2 = A.g(object);
        object = object2;
        if (object2 == null) {
            object = z.u0;
        }
        if ((object2 = hashMap.get(object)) != null) {
            hashMap.put((z)((Object)object), (Long)object2 + l8);
            return;
        }
        hashMap.put((z)((Object)object), l8);
    }

    private String d0(n n8) {
        return d0.v(this.a, n8.E(), n8.isDirectory());
    }

    private void e(HashMap<z, Long> hashMap, z object, long l8) {
        z z8 = object;
        if (object == null) {
            z8 = z.u0;
        }
        if ((object = hashMap.get((Object)z8)) != null) {
            hashMap.put(z8, (Long)object + l8);
            return;
        }
        hashMap.put(z8, l8);
    }

    private String e0(String string, boolean bl) {
        return d0.v(this.a, string, bl);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void g(Context object, f f8, K comparator) {
        long l8;
        long l9;
        long l10;
        long l11;
        List<ax.U2.f> list;
        block17: {
            File file;
            if (((K)((Object)comparator)).e() == null) {
                return;
            }
            list = ax.U2.d.F((Context)object).B();
            Object object2 = (StorageManager)object.getSystemService("storage");
            try {
                file = new File(((K)((Object)comparator)).e());
                comparator = ax.T2.a.a((StorageManager)object2, file);
            }
            catch (IOException exception) {
                return;
            }
            object2 = list.iterator();
            while (object2.hasNext()) {
                if (!((ax.U2.f)object2.next()).F()) continue;
                object2.remove();
            }
            boolean bl = ax.T2.b.a().equals(comparator);
            long l12 = 0L;
            if (bl) {
                long l13;
                ax.U2.d.F((Context)object).i(list, true);
                comparator = list.iterator();
                long l14 = 0L;
                long l15 = l13 = 0L;
                while (true) {
                    l11 = l14;
                    l10 = l12;
                    l9 = l13;
                    l8 = l15;
                    if (comparator.hasNext()) {
                        object = comparator.next();
                        if (((ax.U2.f)object).z()) {
                            l12 += ((ax.U2.f)object).u();
                            l14 += ((ax.U2.f)object).v();
                            l13 += ((ax.U2.f)object).w();
                            l15 += ((ax.U2.f)object).e();
                            continue;
                        }
                        l12 += ((ax.U2.f)object).b();
                        continue;
                    }
                    break block17;
                    break;
                }
            }
            object2 = ax.T2.c.a(object.getSystemService("storagestats"));
            file = Process.myUserHandle();
            Iterator<ax.U2.f> iterator = list.iterator();
            long l16 = 0L;
            long l17 = l12 = 0L;
            while (iterator.hasNext()) {
                object = iterator.next();
                l10 = l16;
                l8 = l12;
                l11 = l16;
                long l18 = l12;
                l9 = l16;
                long l19 = l12;
                try {
                    object = ax.T2.d.a((StorageStatsManager)object2, comparator, ((ax.U2.f)object).r(), (UserHandle)file);
                    l10 = l16;
                    l8 = l12;
                    l11 = l16;
                    l18 = l12;
                    l9 = l16;
                    l19 = l12;
                    l10 = l16;
                    l8 = l12 += ax.T2.e.a((StorageStats)object);
                    l11 = l16;
                    l18 = l12;
                    l9 = l16;
                    l19 = l12;
                    l10 = l16 += ax.T2.f.a((StorageStats)object);
                    l8 = l12;
                    l11 = l16;
                    l18 = l12;
                    l9 = l16;
                    l19 = l12;
                    long l20 = ax.T2.g.a((StorageStats)object);
                    l17 += l20;
                    continue;
                }
                catch (SecurityException securityException) {
                    l16 = l10;
                    l12 = l8;
                }
                catch (PackageManager.NameNotFoundException nameNotFoundException) {
                    l16 = l11;
                    l12 = l18;
                }
                catch (IOException iOException) {
                    l12 = l19;
                    l16 = l9;
                }
                ((Throwable)object).printStackTrace();
            }
            l8 = 0L;
            l9 = l17;
            l10 = l12;
            l11 = l16;
        }
        if ((object = ax.U2.f.d("SizeDown")) != null) {
            try {
                Collections.sort(list, object);
                f8.j = list;
            }
            catch (IllegalArgumentException illegalArgumentException) {
                // empty catch block
            }
        }
        f8.s = l10;
        f8.t = l11;
        f8.u = l9;
        f8.v = l8;
        if (!Q.V0()) return;
        object = new ArrayList<ax.U2.f>(list);
        comparator = ax.U2.f.d("ExternalCacheSizeDown");
        if (comparator == null) return;
        {
            Collections.sort(object, comparator);
            f8.l = object;
            return;
        }
    }

    private long g0() {
        return Long.MAX_VALUE;
    }

    private void h(i i8, K object) throws ax.b3.j {
        Object object2 = ax.T2.h.b0((K)object);
        object = x.e((K)object2);
        Iterator<n> iterator = ax.c3.q.g(((com.alphainventor.filemanager.file.o)object).f0(((com.alphainventor.filemanager.file.o)object).z(((K)object2).e())), ax.c3.q.c("DateDownNoSeparate")).iterator();
        long l8 = 0L;
        int n8 = 0;
        while (iterator.hasNext()) {
            object2 = iterator.next();
            long l9 = object2.p();
            l8 += l9;
            if (n8 < 5) {
                object = d0.Q(d0.s((n)object2), ((n)object2).B());
                i8.a.add(new h((String)object, l9, object2.isDirectory()));
            }
            ++n8;
        }
        i8.b = l8;
    }

    /*
     * WARNING - void declaration
     */
    private void j(com.alphainventor.filemanager.file.o o8, f f8, ax.u3.c c8) throws ax.b3.a {
        block17: {
            RuntimeException var1_7;
            block19: {
                IndexOutOfBoundsException indexOutOfBoundsException3;
                block18: {
                    File file;
                    block16: {
                        RuntimeException var4_23;
                        file = ax.T2.h.A(o8.t(), this.a);
                        try {
                            this.p0(o8, f8, file, c8);
                            return;
                        }
                        catch (ax.b3.a a8) {
                            file.delete();
                            throw a8;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            illegalArgumentException.printStackTrace();
                            ax.Ha.b b8 = ax.Ha.c.h().d("ANALYSIS4").l(illegalArgumentException);
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("location:");
                            stringBuilder.append(this.a.toString());
                            b8.g(stringBuilder.toString()).h();
                            break block16;
                        }
                        catch (StackOverflowError stackOverflowError) {
                            stackOverflowError.printStackTrace();
                            ax.Ha.b b9 = ax.Ha.c.h().d("ANALYSIS STACK!!!").l(stackOverflowError);
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("location:");
                            stringBuilder.append(this.a.toString());
                            b9.g(stringBuilder.toString()).h();
                            break block16;
                        }
                        catch (NumberFormatException numberFormatException) {
                            numberFormatException.printStackTrace();
                            ax.Ha.b b10 = ax.Ha.c.h().d("ANALYSIS3").l(numberFormatException);
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("location:");
                            stringBuilder.append(this.a.toString());
                            b10.g(stringBuilder.toString()).h();
                            break block16;
                        }
                        catch (IllegalStateException illegalStateException) {
                            illegalStateException.printStackTrace();
                            if (TextUtils.isEmpty((CharSequence)illegalStateException.getMessage())) {
                                ax.Ha.b b11 = ax.Ha.c.h().d("ANALYSIS2:").l(illegalStateException);
                                StringBuilder stringBuilder = new StringBuilder();
                                stringBuilder.append("location:");
                                stringBuilder.append(this.a.toString());
                                b11.g(stringBuilder.toString()).h();
                            } else {
                                ax.Ha.c.h().d("ANALYSIS2-2").g(illegalStateException.getMessage()).h();
                            }
                            break block16;
                        }
                        catch (IndexOutOfBoundsException indexOutOfBoundsException2) {
                            indexOutOfBoundsException2.printStackTrace();
                            ax.Ha.b b12 = ax.Ha.c.h().d("ANALYSIS1:").l(indexOutOfBoundsException2);
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("location:");
                            stringBuilder.append(this.a.toString());
                            b12.g(stringBuilder.toString()).h();
                            break block16;
                        }
                        catch (ax.b3.j j8) {
                        }
                        catch (IOException iOException) {
                            // empty catch block
                        }
                        var4_23.printStackTrace();
                    }
                    p.severe("Retry Incremental Scan.");
                    try {
                        file.delete();
                        this.p0(o8, f8, file, c8);
                        break block17;
                    }
                    catch (ax.b3.a a9) {
                    }
                    catch (IndexOutOfBoundsException indexOutOfBoundsException3) {
                        break block18;
                    }
                    catch (ax.b3.j j9) {
                        break block19;
                    }
                    catch (IOException iOException) {
                        break block19;
                    }
                    file.delete();
                    throw a9;
                }
                p.severe("Incremental Scan Failed.");
                indexOutOfBoundsException3.printStackTrace();
                ax.Ha.c.h().d("ANALYSIS OOB").l(indexOutOfBoundsException3).g(this.a.toString()).h();
                break block17;
            }
            p.severe("Incremental Analysis Failed.");
            var1_7.printStackTrace();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void k(Context object, f f8) {
        long l8;
        Iterator<ax.U2.f> iterator;
        UsageStats usageStats;
        Object object2;
        block7: {
            object2 = (UsageStatsManager)object.getSystemService("usagestats");
            usageStats = ax.U2.d.F((Context)object).B();
            try {
                object = Calendar.getInstance();
                ((Calendar)object).add(2, -5);
                object2 = this.F0((UsageStatsManager)object2, ((Calendar)object).getTimeInMillis(), System.currentTimeMillis());
                object = new ArrayList();
                iterator = usageStats.iterator();
                l8 = 0L;
                break block7;
            }
            catch (SecurityException securityException) {}
            securityException.printStackTrace();
            return;
        }
        while (iterator.hasNext()) {
            long l9;
            ax.U2.f f9 = iterator.next();
            if (f9.F()) continue;
            usageStats = (UsageStats)object2.get(f9.r());
            if (usageStats == null) {
                object.add(f9);
                l9 = f9.s();
            } else {
                if (usageStats.getLastTimeUsed() >= System.currentTimeMillis() - 5184000000L) continue;
                object.add(f9);
                l9 = f9.s();
            }
            l8 += l9;
        }
        object2 = ax.U2.f.d("SizeDown");
        if (object2 == null) return;
        try {
            Collections.sort(object, object2);
            f8.k = object;
            f8.x = l8;
            f8.w = true;
            return;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return;
        }
    }

    private void l(f object, boolean bl, com.alphainventor.filemanager.file.o object2, ax.u3.c c8) throws ax.b3.j, ax.b3.a {
        ((f)object).a = (y)((com.alphainventor.filemanager.file.o)object2).z(((com.alphainventor.filemanager.file.o)object2).V());
        ((f)object).b = this.g0();
        ((f)object).c = ((com.alphainventor.filemanager.file.o)object2).W();
        long l8 = System.currentTimeMillis();
        this.w(2131951665);
        this.j((com.alphainventor.filemanager.file.o)object2, (f)object, c8);
        if (!this.l && bl) {
            this.w(2131951664);
            l l9 = new l(((com.alphainventor.filemanager.file.o)object2).t(), this.X(), new l.a(this){
                final h a;
                {
                    this.a = h8;
                }

                @Override
                public void a(String string) {
                    if (TextUtils.isEmpty((CharSequence)string)) {
                        this.a.v("", true);
                        return;
                    }
                    this.a.v(d0.h(string), true);
                }
            });
            l9.e();
            ax.T2.i.a((com.alphainventor.filemanager.file.o)object2, (f)object, l9, c8);
            ax.T2.i.b((com.alphainventor.filemanager.file.o)object2, (f)object, l9, c8);
            l9.g();
        }
        object2 = p;
        object = new StringBuilder();
        ((StringBuilder)object).append("AnalyzeStorage time :");
        ((StringBuilder)object).append(System.currentTimeMillis() - l8);
        ((Logger)object2).fine(((StringBuilder)object).toString());
    }

    /*
     * Exception decompiling
     */
    private void m(f var1_1, com.alphainventor.filemanager.file.o var2_3, n var3_4) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 3[TRYBLOCK] [7, 6 : 92->100)] java.lang.Throwable
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

    public static boolean n0(K k8) {
        if (!ax.Q2.f.U(k8.d())) {
            return false;
        }
        return ax.T2.h.S(k8).k0();
    }

    private void p(com.alphainventor.filemanager.file.o object, n n8, ax.Z2.i i8) throws IOException {
        while ((object = i8.c()) != null && Uri.decode((String)((String)object).split("\u0000")[0]).startsWith(n8.E())) {
            i8.a();
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void p0(com.alphainventor.filemanager.file.o var1_1, f var2_10, File var3_14, ax.u3.c var4_15) throws IOException, ax.b3.j, ax.b3.a {
        synchronized (this) {
            block39: {
                block40: {
                    block33: {
                        block38: {
                            block37: {
                                block36: {
                                    block35: {
                                        block34: {
                                            block32: {
                                                block31: {
                                                    var13_16 = null;
                                                    var14_17 = var3_14.getAbsolutePath();
                                                    var8_18 = var3_14.exists();
                                                    if (!var8_18) break block31;
                                                    try {
                                                        var10_20 = new FileReader(var14_17);
                                                        var9_19 = new BufferedReader((Reader)var10_20);
                                                        break block32;
                                                    }
                                                    catch (Throwable var1_2) lbl-1000:
                                                    // 2 sources

                                                    {
                                                        while (true) {
                                                            var3_14 = null;
                                                            var2_10 = var13_16;
                                                            break block33;
                                                            break;
                                                        }
                                                    }
                                                }
                                                var9_19 = null;
                                            }
                                            var11_22 = new StringBuilder();
                                            var11_22.append(var14_17);
                                            var11_22.append(".tmp");
                                            var10_20 = new FileWriter(var11_22.toString());
                                            var12_21 = new BufferedWriter((Writer)var10_20);
                                            if (var9_19 == null) break block34;
                                            var11_22 = var9_19;
                                            try {
                                                var10_20 = var9_19.readLine();
                                                break block35;
                                            }
                                            catch (Throwable var1_3) {
                                                var3_14 = var12_21;
                                                var2_10 = var11_22;
                                                break block33;
                                            }
                                        }
                                        var10_20 = null;
                                    }
                                    var11_22 = var9_19;
                                    var8_18 = "6".equals(var10_20);
                                    var10_20 = var9_19;
                                    if (var8_18) break block36;
                                    var10_20 = var9_19;
                                    if (var9_19 == null) break block36;
                                    var11_22 = var9_19;
                                    {
                                        var9_19.close();
                                    }
                                    try {
                                        var3_14.delete();
                                        var10_20 = null;
                                    }
                                    catch (Throwable var1_4) {
                                        var2_10 = var13_16;
                                        var3_14 = var12_21;
                                        break block33;
                                    }
                                }
                                var11_22 = var10_20;
                                var12_21.write("6\n");
                                if (var10_20 == null) break block37;
                                var11_22 = var10_20;
                                {
                                    var10_20.readLine();
                                }
                            }
                            var11_22 = var10_20;
                            var11_22 = var10_20;
                            var15_23 = new ax.Z2.i((BufferedReader)var10_20);
                            var11_22 = var10_20;
                            var13_16 = var2_10.a;
                            var9_19 = var10_20;
                            try {
                                this.q0((com.alphainventor.filemanager.file.o)var1_1, (f)var2_10, var13_16, var12_21, var15_23, (ax.u3.c)var4_15);
                                var1_1 = var10_20;
                                if (var10_20 == null) break block38;
                                var9_19 = var10_20;
                                var10_20.close();
                                var1_1 = null;
                            }
                            catch (Throwable var1_5) {
                                var2_10 = var9_19;
lbl83:
                                // 2 sources

                                while (true) {
                                    var3_14 = var12_21;
                                    break block33;
                                    break;
                                }
                            }
                        }
                        var9_19 = var1_1;
                        var12_21.close();
                        try {
                            var3_14.delete();
                            var9_19 = new StringBuilder();
                            var9_19.append(var14_17);
                            var9_19.append(".tmp");
                            var4_15 = new File(var9_19.toString());
                            var4_15.renameTo(var3_14.getAbsoluteFile());
                            this.M0(var2_10.i);
                            this.M0(var2_10.g);
                            this.M0(var2_10.f);
                            var3_14 = var2_10.h;
                            var7_24 = var3_14.size();
                            var5_25 = 0;
                            while (var5_25 < var7_24) {
                                var4_15 = var3_14.get(var5_25);
                                var6_26 = var5_25 + 1;
                                var9_19 = (h)var4_15;
                                var4_15 = var2_10.d.get(var9_19.a());
                                var5_25 = var6_26;
                                if (var4_15 == null) continue;
                                var9_19.b = var4_15.longValue();
                                var2_10.q += var4_15.longValue();
                                var5_25 = var6_26;
                            }
                        }
                        catch (Throwable var2_11) lbl-1000:
                        // 2 sources

                        {
                            while (true) {
                                var4_15 = var2_10;
                                var3_14 = null;
                                var2_10 = var1_1;
                                var1_1 = var4_15;
                                break block33;
                                break;
                            }
                        }
                        this.M0(var2_10.h);
                        this.v("", true);
                        if (var1_1 == null) return;
                        try {
                            var1_1.close();
                            break block39;
                        }
                        catch (Throwable var1_6) {
                            break block40;
                        }
                        catch (Throwable var1_7) {
                            var2_10 = var11_22;
                            ** continue;
                        }
                        catch (Throwable var2_12) {
                            var1_1 = var9_19;
                            ** continue;
                        }
                        catch (Throwable var1_8) {
                            ** continue;
                        }
                    }
                    if (var2_10 == null) ** GOTO lbl151
                    {
                        block41: {
                            try {}
                            catch (IOException var2_13) {
                                throw var1_1;
                            }
                            break block41;
                            catch (IOException var1_9) {
                                break block39;
                            }
                        }
                        var2_10.close();
lbl151:
                        // 2 sources

                        if (var3_14 == null) throw var1_1;
                        var3_14.close();
                        throw var1_1;
                    }
                }
                throw var1_6;
            }
            return;
        }
    }

    public static K q(int n8) {
        if (n8 == 1) {
            return K.e;
        }
        if (n8 == 2) {
            return K.f;
        }
        if (n8 >= 100) {
            K k8 = K.a(ax.Q2.f.v0, n8 - 100);
            if (!ax.Z2.j.F().B0(k8)) {
                ax.Ha.c.h().f().d("INVALID USB LOCATION KEY").j().g(n8).h();
            }
            return k8;
        }
        ax.Ha.c.h().d("INVALID LOCATION KEY").j().g(n8).h();
        return K.e;
    }

    private void q0(com.alphainventor.filemanager.file.o o8, f f8, n n8, BufferedWriter bufferedWriter, ax.Z2.i i8, ax.u3.c c8) throws IOException, ax.b3.j, ax.b3.a {
        String[] stringArray;
        Object object;
        block16: {
            block15: {
                if (!((y)n8).w0()) break block15;
                if (c8 != null && c8.isCancelled()) {
                    throw new ax.b3.a();
                }
                try {
                    object = this.z0(o8, n8);
                }
                catch (ax.b3.e e8) {
                    object = null;
                }
                if (object != null) break block16;
            }
            return;
        }
        ArrayList<String[]> arrayList = new ArrayList<String[]>();
        Object object2 = new ArrayList<n>();
        object = object.iterator();
        while (object.hasNext()) {
            stringArray = (String[])object.next();
            if (stringArray.isDirectory()) {
                arrayList.add(stringArray);
                continue;
            }
            ((ArrayList)object2).add(stringArray);
        }
        Collections.sort(arrayList, new Comparator<n>(this){
            final h q;
            {
                this.q = h8;
            }

            public int a(n n8, n n9) {
                return n8.E().compareTo(n9.E());
            }
        });
        this.Q0(o8, f8, n8, (List<n>)object2, bufferedWriter, false);
        if (arrayList.size() == 0) {
            this.p(o8, n8, i8);
            return;
        }
        object = i8.c();
        int n9 = 0;
        while (n9 < arrayList.size()) {
            int n10;
            Comparable<n> comparable = (n)arrayList.get(n9);
            String string = ((n)comparable).E();
            if (object == null) {
                n10 = -1;
                stringArray = null;
                object2 = null;
            } else {
                stringArray = ((String)object).split("\u0000");
                object2 = Uri.decode((String)stringArray[0]);
                n10 = string.compareTo((String)object2);
            }
            if (n10 == 0) {
                if (Long.valueOf(stringArray[1]).longValue() == comparable.q()) {
                    comparable = new StringBuilder();
                    ((StringBuilder)comparable).append((String)object);
                    ((StringBuilder)comparable).append("\n");
                    bufferedWriter.write(((StringBuilder)comparable).toString());
                    this.K0(o8, f8, (String)object2, stringArray);
                    i8.a();
                    this.t0(o8, f8, (String)object2, bufferedWriter, i8, c8);
                    object = i8.c();
                    ++n9;
                    continue;
                }
                i8.a();
                this.q0(o8, f8, (n)comparable, bufferedWriter, i8, c8);
                object = i8.c();
                ++n9;
                continue;
            }
            if (n10 < 0) {
                this.s0(o8, f8, (n)comparable, bufferedWriter, c8);
                ++n9;
                continue;
            }
            i8.a();
            object = i8.c();
        }
        this.p(o8, n8, i8);
    }

    public static int r(K k8) {
        if (K.e.equals(k8)) {
            return 1;
        }
        if (K.f.equals(k8)) {
            return 2;
        }
        if (k8 != null && ax.Q2.f.v0 == k8.d()) {
            return k8.b() + 100;
        }
        return 0;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void r0(com.alphainventor.filemanager.file.o o8, f f8, Stack<n> stack, Writer writer) throws IOException, ax.b3.j {
        Writer var4_6;
        Writer var2_4;
        Object object;
        n n8;
        n var3_5;
        block10: {
            n8 = (n)var3_5.pop();
            if (J.j2(n8)) {
                return;
            }
            if (this.x0(n8)) {
                return;
            }
            if (n8.n()) {
                try {
                    object = this.z0(o8, n8);
                    break block10;
                }
                catch (OutOfMemoryError outOfMemoryError) {
                    ax.Ha.c.h().f().d("Analysis: listFiles OUT OF MEMORY").h();
                }
                catch (ax.b3.e e8) {}
            }
            object = null;
        }
        ArrayList<Object> arrayList = new ArrayList<Object>();
        ArrayList<n> arrayList2 = new ArrayList<n>();
        if (object == null) {
            this.Q0(o8, (f)var2_4, n8, arrayList2, (Writer)var4_6, true);
            return;
        }
        Iterator<n> iterator = object.iterator();
        while (iterator.hasNext()) {
            object = iterator.next();
            if (object.isDirectory()) {
                arrayList.add(object);
                continue;
            }
            arrayList2.add((n)object);
        }
        this.Q0(o8, (f)var2_4, n8, arrayList2, (Writer)var4_6, false);
        Collections.sort(arrayList, new Comparator<n>(this){
            final h q;
            {
                this.q = h8;
            }

            public int a(n n8, n n9) {
                return n9.E().compareTo(n8.E());
            }
        });
        int n9 = arrayList.size();
        int n10 = 0;
        while (n10 < n9) {
            Object e9 = arrayList.get(n10);
            ++n10;
            var3_5.push((n)e9);
        }
    }

    private void s0(com.alphainventor.filemanager.file.o o8, f f8, n n8, Writer writer, ax.u3.c c8) throws IOException, ax.b3.j, ax.b3.a {
        Stack<n> stack = new Stack<n>();
        stack.push(n8);
        while (!((AbstractCollection)stack).isEmpty()) {
            if (c8 != null && c8.isCancelled()) {
                throw new ax.b3.a();
            }
            this.r0(o8, f8, stack, writer);
        }
    }

    private void t0(com.alphainventor.filemanager.file.o o8, f f8, String string, BufferedWriter bufferedWriter, ax.Z2.i i8, ax.u3.c c8) throws IOException, ax.b3.j, ax.b3.a {
        Stack<String> stack = new Stack<String>();
        stack.push(string);
        while (!((AbstractCollection)stack).isEmpty()) {
            if (c8 != null && c8.isCancelled()) {
                throw new ax.b3.a();
            }
            this.u0(o8, f8, stack, bufferedWriter, i8, c8);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void u() {
        Object object = this.h;
        synchronized (object) {
            Throwable throwable2;
            block5: {
                try {
                    ArrayList<g> arrayList = this.g;
                    int n8 = arrayList.size();
                    for (int i8 = 0; i8 < n8; ++i8) {
                        g g8 = arrayList.get(i8);
                        g8.b();
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                return;
            }
            throw throwable2;
        }
    }

    private void u0(com.alphainventor.filemanager.file.o o8, f f8, Stack<String> stack, BufferedWriter bufferedWriter, ax.Z2.i i8, ax.u3.c object) throws IOException, ax.b3.j, ax.b3.a {
        String string;
        String string2 = stack.pop();
        String string3 = null;
        n n8 = null;
        while ((string = i8.c()) != null) {
            Object object2 = string.split("\u0000");
            String string4 = Uri.decode((String)object2[0]);
            if (!d0.B(string4)) {
                object2 = ax.Ha.c.h().d("ANALYSIS ISCD:");
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(string4);
                stringBuilder.append(":");
                stringBuilder.append(string.length());
                stringBuilder.append(":");
                stringBuilder.append(string);
                ((ax.Ha.b)object2).g(stringBuilder.toString()).h();
                i8.a();
                continue;
            }
            if (!d0.r(string4).equals(string2) && string2 != null) break;
            if (string3 == null || n8 == null || !string3.equals(string4)) {
                n8 = o8.z(string4);
                if (n8.q() == 0L && Q.L() && n8 instanceof y) {
                    ((y)n8).q1();
                }
                string3 = string4;
            }
            if (this.x0(n8)) {
                i8.a();
                continue;
            }
            if (n8.q() == Long.parseLong(object2[1])) {
                object = new StringBuilder();
                ((StringBuilder)object).append(string);
                ((StringBuilder)object).append("\n");
                bufferedWriter.write(((StringBuilder)object).toString());
                this.K0(o8, f8, string4, (String[])object2);
                i8.a();
                stack.push(string2);
                stack.push(string4);
                return;
            }
            i8.a();
            this.q0(o8, f8, n8, bufferedWriter, i8, (ax.u3.c)object);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void v(String string, boolean bl) {
        Object object = this.h;
        synchronized (object) {
            Throwable throwable2;
            block5: {
                try {
                    ArrayList<g> arrayList = this.g;
                    int n8 = arrayList.size();
                    for (int i8 = 0; i8 < n8; ++i8) {
                        g g8 = arrayList.get(i8);
                        g8.c(string, bl);
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void w(int n8) {
        Object object = this.h;
        synchronized (object) {
            Throwable throwable2;
            block5: {
                try {
                    ArrayList<g> arrayList = this.g;
                    int n9 = arrayList.size();
                    for (int i8 = 0; i8 < n9; ++i8) {
                        g g8 = arrayList.get(i8);
                        g8.d(n8);
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                return;
            }
            throw throwable2;
        }
    }

    private boolean x0(n n8) {
        Set<String> set = this.k;
        if (set == null) {
            return false;
        }
        return set.contains(n8.E());
    }

    private List<n> z0(com.alphainventor.filemanager.file.o o8, n n8) throws ax.b3.j {
        return o8.f0(n8);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void A0(g var1_1) throws ax.b3.j {
        block7: {
            if (this.j == null) {
                ax.u3.b.f();
                return;
            }
            if (var1_1 == null) ** GOTO lbl7
            this.c(var1_1);
lbl7:
            // 2 sources

            this.j.await();
            if (var1_1 == null) return;
            this.I0(var1_1);
            return;
            {
                catch (Throwable var2_2) {
                    break block7;
                }
                catch (InterruptedException var2_3) {}
                {
                    ax.u3.b.f();
                    if (var1_1 == null) return;
                    this.I0(var1_1);
                }
            }
            return;
        }
        if (var1_1 == null) throw var2_2;
        this.I0(var1_1);
        throw var2_2;
    }

    public boolean B0() {
        return this.n;
    }

    public List<ax.U2.f> C() {
        if (this.c == null) {
            return null;
        }
        return new ArrayList<ax.U2.f>(this.c.j);
    }

    public long D() {
        f f8 = this.c;
        return f8.s + f8.u + f8.t;
    }

    public long E(n comparable) {
        f f8 = this.c;
        if (f8 == null) {
            return 0L;
        }
        if ((comparable = f8.d.get(this.d0((n)comparable))) != null) {
            return (Long)comparable;
        }
        return 0L;
    }

    public long F(n n8) {
        boolean bl = n8 != null;
        ax.u3.b.c(bl);
        ax.u3.b.c(n8.n());
        return ((y)n8).F0().getTotalSpace();
    }

    public Map<String, UsageStats> F0(UsageStatsManager object, long l8, long l9) {
        if ((object = object.queryUsageStats(2, l8, l9)).isEmpty()) {
            return Collections.EMPTY_MAP;
        }
        ArrayMap arrayMap = new ArrayMap();
        int n8 = object.size();
        for (int i8 = 0; i8 < n8; ++i8) {
            UsageStats usageStats = (UsageStats)object.get(i8);
            UsageStats usageStats2 = (UsageStats)arrayMap.get((Object)usageStats.getPackageName());
            if (usageStats2 == null) {
                arrayMap.put((Object)usageStats.getPackageName(), (Object)usageStats);
                continue;
            }
            usageStats2.add(usageStats);
        }
        return arrayMap;
    }

    public List<h> G() {
        Object object = this.c;
        if (object != null && (object = ((f)object).m) != null) {
            return ((j)object).b(this.a, 5);
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void G0() {
        AtomicInteger atomicInteger = this.m;
        synchronized (atomicInteger) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        if (this.m.decrementAndGet() != 0) break block3;
                        p.fine("analysis instance all released : clear");
                        this.n();
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    public List<h> H() {
        Object object = this.c;
        if (object != null && (object = ((f)object).m) != null) {
            return ((j)object).c(this.a);
        }
        return null;
    }

    public void H0(Context context) {
        ax.T2.h.A(context, this.a).delete();
    }

    public j I() {
        f f8 = this.c;
        if (f8 == null) {
            return null;
        }
        return f8.m;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void I0(g g8) {
        Object object = this.h;
        synchronized (object) {
            this.g.remove(g8);
            return;
        }
    }

    public long J() {
        Object object = this.c;
        if (object != null && (object = ((f)object).m) != null) {
            return ((j)object).b;
        }
        return 0L;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void J0() {
        AtomicInteger atomicInteger = this.m;
        synchronized (atomicInteger) {
            this.m.getAndIncrement();
            return;
        }
    }

    public List<h> K() {
        Object object = this.c;
        if (object != null && (object = ((f)object).n) != null) {
            return ((j)object).b(this.a, 5);
        }
        return null;
    }

    public j L() {
        f f8 = this.c;
        if (f8 == null) {
            return null;
        }
        return f8.n;
    }

    public void L0() {
        if (this.c == null) {
            return;
        }
        this.n = true;
    }

    public long M() {
        Object object = this.c;
        if (object != null && (object = ((f)object).n) != null) {
            return ((j)object).b;
        }
        return 0L;
    }

    public List<h> N() {
        f f8 = this.c;
        if (f8 == null) {
            return null;
        }
        return f8.h;
    }

    public void N0(long l8) {
        f f8 = this.c;
        if (f8 == null) {
            return;
        }
        f8.q -= l8;
    }

    public long O() {
        f f8 = this.c;
        if (f8 == null) {
            return 0L;
        }
        return f8.q;
    }

    public void O0(long l8) {
        f f8 = this.c;
        if (f8 == null) {
            return;
        }
        f8.o -= l8;
    }

    public List<ax.U2.f> P() {
        f f8 = this.c;
        if (f8 != null && f8.l != null) {
            return new ArrayList<ax.U2.f>(this.c.l);
        }
        return null;
    }

    public void P0(List<ax.U2.f> object) {
        Object object2 = this.c;
        if (object2 != null && ((f)object2).k != null && (object2 = this.h0()) != null) {
            HashSet<String> hashSet = new HashSet<String>();
            object = object.iterator();
            while (object.hasNext()) {
                hashSet.add(((ax.U2.f)object.next()).r());
            }
            long l8 = this.c.s;
            object = object2.listIterator();
            boolean bl = false;
            while (object.hasNext()) {
                ax.U2.f f8 = (ax.U2.f)object.next();
                if (hashSet.contains(f8.r())) continue;
                object.remove();
                l8 -= f8.s();
                bl = true;
            }
            if (bl) {
                object = this.c;
                ((f)object).k = object2;
                ((f)object).x = l8;
                ((f)object).w = true;
            }
            this.n = false;
        }
    }

    public long Q(z z8) {
        return this.R(this.c, z8);
    }

    public long R(f object, z z8) {
        long l8 = 0L;
        if (object == null) {
            return 0L;
        }
        if (!A.H(z8)) {
            object = ((f)object).e.get((Object)z8);
            if (object == null) {
                return 0L;
            }
            return (Long)object;
        }
        List<z> list = A.j(z8);
        if (list == null) {
            return 0L;
        }
        for (z z9 : list) {
            Long object2 = ((f)object).e.get((Object)z9);
            if (object2 == null) continue;
            l8 += object2.longValue();
        }
        object = ((f)object).e.get((Object)z8);
        long l9 = l8;
        if (object != null) {
            l9 = l8 + (Long)object;
        }
        return l9;
    }

    public List<h> U() {
        f f8 = this.c;
        if (f8 == null) {
            return null;
        }
        return f8.f;
    }

    public List<h> V() {
        f f8 = this.c;
        if (f8 == null) {
            return null;
        }
        return f8.g;
    }

    public long W() {
        f f8 = this.c;
        if (f8 == null) {
            return 0L;
        }
        return f8.o;
    }

    public K X() {
        return this.a;
    }

    public long Y(n n8) {
        if (n8.isDirectory()) {
            return this.E(n8);
        }
        return n8.p();
    }

    public List<h> Z() {
        i i8 = this.d;
        if (i8 == null) {
            return null;
        }
        return i8.a;
    }

    public void b(n n8) {
        com.alphainventor.filemanager.file.o o8 = x.e(this.a);
        this.m(this.c, o8, n8);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void c(g g8) {
        Object object = this.h;
        synchronized (object) {
            this.g.add(g8);
            return;
        }
    }

    public long c0() {
        i i8 = this.d;
        if (i8 == null) {
            return 0L;
        }
        return i8.b;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public void f(boolean bl, g g8, ax.u3.c object) throws ax.b3.j, ax.b3.a {
        Throwable throwable2;
        block16: {
            ax.b3.a a82;
            block17: {
                Object object2;
                Object object3;
                block18: {
                    if (this.a.e() == null) throw new ax.b3.j("ROOT PATH IS NULL");
                    this.J0();
                    object3 = this.i;
                    // MONITORENTER : object3
                    object2 = new CountDownLatch(1);
                    this.j = object2;
                    // MONITOREXIT : object3
                    if (g8 == null) break block18;
                    try {
                        this.c(g8);
                    }
                    catch (Throwable throwable2) {
                        break block16;
                    }
                    catch (ax.b3.a a82) {
                        break block17;
                    }
                }
                object3 = x.e(this.a);
                if (Q.L() && this.a == K.f) {
                    this.k = object2 = new HashSet();
                    object2.add(d0.P(this.a.e(), "/Android/data"));
                }
                this.c = object2 = new f();
                this.d = object2 = new i();
                this.l(this.c, bl, (com.alphainventor.filemanager.file.o)object3, (ax.u3.c)object);
                if (object != null && object.isCancelled()) {
                    object = new ax.b3.a();
                    throw object;
                }
                if (!this.l) {
                    this.h(this.d, this.a);
                    if (object != null && object.isCancelled()) {
                        object = new ax.b3.a();
                        throw object;
                    }
                    if (bl && Q.J1() && this.a == K.e && !ax.Z2.j.F().o0() && ax.u3.o.d(((com.alphainventor.filemanager.file.o)object3).t())) {
                        this.g(((com.alphainventor.filemanager.file.o)object3).t(), this.c, this.a);
                        this.k(((com.alphainventor.filemanager.file.o)object3).t(), this.c);
                    }
                }
                this.b = bl;
                this.e = true;
                this.f = false;
                this.G0();
                this.u();
                if (g8 != null) {
                    this.I0(g8);
                }
                this.j.countDown();
                return;
            }
            this.t();
            throw a82;
        }
        this.G0();
        this.u();
        if (g8 != null) {
            this.I0(g8);
        }
        this.j.countDown();
        throw throwable2;
    }

    public k0 f0() {
        f f8 = this.c;
        if (f8 == null) {
            return null;
        }
        return f8.c;
    }

    public List<ax.U2.f> h0() {
        f f8 = this.c;
        if (f8 != null && f8.k != null) {
            return new ArrayList<ax.U2.f>(this.c.k);
        }
        return null;
    }

    public boolean i() {
        try {
            i i8;
            this.J0();
            this.d = i8 = new i();
            this.h(i8, null);
            this.b = false;
            this.e = true;
            this.f = false;
            return true;
        }
        catch (ax.b3.j j8) {
            return false;
        }
        finally {
            this.G0();
        }
    }

    public long i0() {
        return this.c.x;
    }

    public long j0() {
        f f8 = this.c;
        if (f8 == null) {
            return 0L;
        }
        return f8.v;
    }

    public boolean k0() {
        return this.e;
    }

    public boolean l0() {
        f f8 = this.c;
        if (f8 == null) {
            return false;
        }
        ArrayList<h> arrayList = f8.h;
        if (arrayList != null && arrayList.size() >= 1) {
            if (f8.h.size() == 1 && "/Android/data/com.voxdon.xplorer/cache".equals(f8.h.get(0).a())) {
                return false;
            }
            if (f8.q > 0L) {
                return true;
            }
        }
        return false;
    }

    public boolean m0() {
        return this.b && this.e;
    }

    public void n() {
        this.e = false;
        this.b = false;
    }

    public void o() {
        f f8 = this.c;
        if (f8 == null) {
            return;
        }
        f8.h.clear();
        f8.q = 0L;
        f8.l.clear();
        f8.v = 0L;
    }

    public boolean o0() {
        Object object = this.c;
        return object != null && (object = ((f)object).k) != null && object.size() > 0;
    }

    public void s(n object, long l8) {
        f f8 = this.c;
        object = this.d0((n)object);
        while (true) {
            Long l9;
            if ((l9 = f8.d.get(object)) != null) {
                f8.d.put((String)object, l9 - l8);
            }
            if ("/".equals(object)) {
                return;
            }
            object = d0.r((String)object);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void t() {
        Object object = this.h;
        synchronized (object) {
            Throwable throwable2;
            block5: {
                try {
                    ArrayList<g> arrayList = this.g;
                    int n8 = arrayList.size();
                    for (int i8 = 0; i8 < n8; ++i8) {
                        g g8 = arrayList.get(i8);
                        g8.a();
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                return;
            }
            throw throwable2;
        }
    }

    public void v0() {
        this.f = true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean w0() {
        Object object = this.i;
        synchronized (object) {
            try {
                CountDownLatch countDownLatch = this.j;
                if (countDownLatch == null) return false;
                if (countDownLatch.getCount() <= 0L) return false;
                return true;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public void x() {
        f f8 = this.c;
        if (f8 == null) {
            return;
        }
        f8.m = null;
    }

    public boolean y() {
        f f8 = this.c;
        if (f8 == null) {
            return false;
        }
        return f8.w;
    }

    public boolean y0() {
        return this.f;
    }

    public String z(String string) {
        return d0.P(this.a.e(), string);
    }

    public static class e {
        public String a;
        public n b;
        public boolean c = false;
        public long d = 0L;
        public long e = 0L;
        public long f = 0L;
        public long g = 0L;
        public long h = 0L;
        public long i = 0L;
        public long j = 0L;
        public boolean k = false;
        public long l = 0L;
        public long m = 0L;
    }

    public static class f {
        y a;
        long b = 0L;
        k0 c;
        HashMap<String, Long> d = new HashMap();
        HashMap<z, Long> e = new HashMap();
        ArrayList<h> f = new ArrayList();
        ArrayList<h> g = new ArrayList();
        ArrayList<h> h = new ArrayList();
        ArrayList<h> i = new ArrayList();
        List<ax.U2.f> j = new ArrayList<ax.U2.f>();
        List<ax.U2.f> k = new ArrayList<ax.U2.f>();
        List<ax.U2.f> l = new ArrayList<ax.U2.f>();
        j m;
        j n;
        long o = 0L;
        long p = 0L;
        long q = 0L;
        long r = 0L;
        long s = 0L;
        long t = 0L;
        long u = 0L;
        long v = 0L;
        boolean w = false;
        long x = 0L;
    }

    public static interface g {
        public void a();

        public void b();

        public void c(String var1, boolean var2);

        public void d(int var1);
    }

    public static class h {
        String a;
        long b;
        boolean c;

        h(String string, long l8, boolean bl) {
            this.a = string;
            this.b = l8;
            this.c = bl;
        }

        public String a() {
            return this.a;
        }

        public long b() {
            return this.b;
        }

        public boolean c() {
            return this.c;
        }
    }

    static class i {
        ArrayList<h> a = new ArrayList();
        long b = 0L;

        i() {
        }
    }
}

