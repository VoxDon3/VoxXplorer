/*
 * Decompiled with CFR 0.152.
 */
package com.voxdon.xplorer.file;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import ax.X2.Q;
import ax.Z2.i;
import ax.Z2.j;
import ax.c3.K;
import ax.c3.O;
import ax.c3.d0;
import ax.u3.b;
import ax.u3.q;
import com.voxdon.xplorer.file.A;
import com.voxdon.xplorer.file.B;
import com.voxdon.xplorer.file.J;
import com.voxdon.xplorer.file.n;
import com.voxdon.xplorer.file.o;
import com.voxdon.xplorer.file.u;
import com.voxdon.xplorer.file.v;
import com.voxdon.xplorer.file.x;
import com.voxdon.xplorer.file.y;
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
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.logging.Logger;

public class w
extends q<Void, Void, Boolean> {
    private static final Logger o = Logger.getLogger("FileManager.LibraryScanTask");
    private static HashSet<String> p = new HashSet();
    private static HashSet<String> q = new HashSet();
    private static HashSet<String> r = new HashSet();
    private static HashSet<String> s = new HashSet();
    static w t;
    static final Object u;
    private static int v;
    private HashMap<ax.Q2.f, f> h;
    private HashMap<String, Boolean> i;
    private final List<d> j = java.util.DesugarCollections.synchronizedList(new ArrayList());
    private Context k;
    private boolean l;
    private boolean m;
    private boolean n;

    static {
        p.add("/Android/data/com.utorrent.client/files/Download");
        p.add("/Android/data/com.bittorrent.client/files/Download");
        p.add("/Android/data/com.android.chrome/files/Download");
        p.add("/Android/data/org.telegram.messenger/files/Telegram");
        q.add("mobiletmoney.txt");
        q.add("log.txt");
        q.add("log");
        r.add("/Android/media/com.google.android.gm/Notifications");
        r.add("/Android/media/com.google.android.talk/Notifications");
        r.add("/Android/media/com.google.android.talk/Ringtones");
        s.add("/Documents/Notebloc");
        u = new Object();
    }

    public w(Context context, boolean bl) {
        super(q.e.g0);
        this.k = context.getApplicationContext();
        this.m = bl;
    }

    private static void A(File file) {
        if (file != null && file.exists()) {
            file.delete();
        }
    }

    public static w C(Context object, d d8) {
        try {
            object = w.D(object.getApplicationContext(), d8, false);
            return object;
        }
        catch (IllegalStateException illegalStateException) {
            return null;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static w D(Context object, d d8, boolean bl) {
        Object object2 = u;
        synchronized (object2) {
            Throwable throwable2;
            block4: {
                block3: {
                    w w8;
                    try {
                        w8 = t;
                        if (w8 != null && w8.m() != q.f.d0) break block3;
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                    o.fine("Execute scan task");
                    t = w8 = new w((Context)object, bl);
                    w8.i(new Void[0]);
                }
                if (d8 == null) return t;
                t.w(d8);
                return t;
            }
            throw throwable2;
        }
    }

    private boolean E(n object) {
        return q.contains(object = ((n)object).B().toLowerCase());
    }

    private boolean F(n object) {
        String string = d0.f((String)(object = ((n)object).B().toLowerCase()));
        if ("log".equals(string)) {
            return true;
        }
        if (!((String)object).endsWith("_log.txt") && !((String)object).endsWith("_logs.txt")) {
            if (((String)object).startsWith("filelog") && "txt".equals(string)) {
                return true;
            }
            return q.contains(object);
        }
        return true;
    }

    public static Set<String> G() {
        return r;
    }

    static File H(Context object, boolean bl) {
        if ((object = ax.Q2.e.q((Context)object)) != null) {
            if (bl) {
                return new File(((File)object).getAbsolutePath(), "scanfile.full");
            }
            return new File(((File)object).getAbsolutePath(), "scanfile.fast");
        }
        throw new IllegalStateException("Can not create index file");
    }

    static File I(Context object) {
        if ((object = ax.Q2.e.q((Context)object)) != null) {
            return new File(((File)object).getAbsolutePath(), "scanfile_new.full");
        }
        throw new IllegalStateException("Can not create index file");
    }

    static File J(Context object, boolean bl) {
        if ((object = ax.Q2.e.q((Context)object)) != null) {
            if (bl) {
                return new File(((File)object).getAbsolutePath(), "scanfile_sd.full");
            }
            return new File(((File)object).getAbsolutePath(), "scanfile_sd.fast");
        }
        throw new IllegalStateException("Can not create index file");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void K(c object, n n8, BufferedWriter object2, i i8) throws IOException {
        Object object3;
        block19: {
            if (!((y)n8).x0()) {
                return;
            }
            try {
                object3 = this.T((c)object, n8, true);
                break block19;
            }
            catch (ax.b3.j j8) {
                return;
            }
            catch (OutOfMemoryError outOfMemoryError) {
                ax.Ha.c.h().f().d("SCAN: listFiles OUT OF MEMORY 2").h();
            }
            return;
        }
        if (object3 == null) {
            return;
        }
        ArrayList<Object> arrayList = new ArrayList<Object>();
        String[] stringArray = new ArrayList();
        Object object4 = object3.iterator();
        while (object4.hasNext()) {
            object3 = object4.next();
            if (object3.isDirectory()) {
                if (d0.C(((n)object3).B()) || n8.E().equals(((n)object3).E())) continue;
                arrayList.add(object3);
                continue;
            }
            stringArray.add(object3);
        }
        Collections.sort(arrayList, new Comparator<n>(this){
            final w q;
            {
                this.q = w8;
            }

            public int a(n n8, n n9) {
                return n8.E().compareTo(n9.E());
            }
        });
        this.e0((c)object, n8, (List<n>)stringArray, (Writer)object2);
        if (arrayList.size() == 0) {
            if (!d0.B(n8.E())) {
                object2 = ax.Ha.c.h().f().b("INVALID LIBRARYSCAN DIR ABSOULTE PATH");
                object = new StringBuilder();
                ((StringBuilder)object).append("dir:");
                ((StringBuilder)object).append(n8.E());
                ((ax.Ha.b)object2).g(((StringBuilder)object).toString()).h();
                return;
            }
            this.z(n8, i8);
            return;
        }
        object3 = i8.c();
        int n9 = 0;
        while (true) {
            block22: {
                block20: {
                    int n10;
                    n n11;
                    block21: {
                        if (n9 >= arrayList.size()) {
                            this.z(n8, i8);
                            return;
                        }
                        n11 = (n)arrayList.get(n9);
                        CharSequence charSequence = n11.E();
                        if (J.j2(n11)) break block20;
                        if (object3 == null) {
                            n10 = -1;
                            stringArray = null;
                            object4 = null;
                        } else {
                            stringArray = ((String)object3).split("\u0000");
                            object4 = Uri.decode((String)stringArray[0]);
                            n10 = ((String)charSequence).compareTo((String)object4);
                        }
                        if (n10 != 0) break block21;
                        if (Q.h1() && n11.q() == 0L) {
                            ((y)n11).v1();
                            n11.q();
                        }
                        if (Long.parseLong(stringArray[1]) == n11.q()) {
                            charSequence = new StringBuilder();
                            ((StringBuilder)charSequence).append((String)object3);
                            ((StringBuilder)charSequence).append("\n");
                            ((Writer)object2).write(((StringBuilder)charSequence).toString());
                            this.X((c)object, (String)object4, (y)n11, stringArray);
                            i8.a();
                            this.N((c)object, (String)object4, (BufferedWriter)object2, i8);
                            object3 = i8.c();
                            break block20;
                        } else {
                            i8.a();
                            this.K((c)object, n11, (BufferedWriter)object2, i8);
                            object3 = i8.c();
                        }
                        break block20;
                    }
                    if (n10 >= 0) break block22;
                    this.M((c)object, n11, (Writer)object2);
                }
                ++n9;
                continue;
            }
            i8.a();
            object3 = i8.c();
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void L(c c8, Stack<n> stack, Writer writer) throws IOException {
        int n8;
        n n9 = stack.pop();
        Object object = n9.E();
        if (c8.b.contains(object)) {
            return;
        }
        if (J.k2(n9.B())) {
            return;
        }
        int n10 = 0;
        boolean bl = writer != null;
        try {
            object = this.T(c8, n9, bl);
        }
        catch (OutOfMemoryError outOfMemoryError) {
            block9: {
                ax.Ha.c.h().f().d("SCAN: listFiles OUT OF MEMORY").h();
                break block9;
                catch (ax.b3.j j8) {}
            }
            object = null;
        }
        ArrayList<n> arrayList = new ArrayList<n>();
        ArrayList<n> arrayList2 = new ArrayList<n>();
        if (object == null) {
            this.e0(c8, n9, arrayList2, writer);
            return;
        }
        for (n8 = 0; n8 < object.size(); ++n8) {
            n n11 = (n)object.get(n8);
            if (this.Q(c8, n11)) {
                if (d0.C(n11.B())) continue;
                arrayList.add(n11);
                continue;
            }
            arrayList2.add(n11);
        }
        this.e0(c8, n9, arrayList2, writer);
        Collections.sort(arrayList, new Comparator<n>(this){
            final w q;
            {
                this.q = w8;
            }

            public int a(n n8, n n9) {
                return n9.E().compareTo(n8.E());
            }
        });
        n8 = n10;
        while (n8 < arrayList.size()) {
            stack.push((n)arrayList.get(n8));
            ++n8;
        }
    }

    private void M(c c8, n n8, Writer writer) throws IOException {
        Stack<n> stack = new Stack<n>();
        stack.push(n8);
        while (!((AbstractCollection)stack).isEmpty()) {
            this.L(c8, stack, writer);
        }
    }

    private void N(c c8, String string, BufferedWriter bufferedWriter, i i8) throws IOException {
        Stack<String> stack = new Stack<String>();
        stack.push(string);
        while (!((AbstractCollection)stack).isEmpty()) {
            this.O(c8, stack, bufferedWriter, i8);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void O(c c8, Stack<String> stack, BufferedWriter bufferedWriter, i i8) throws IOException {
        String string;
        String string2 = stack.pop();
        while ((string = i8.c()) != null) {
            ax.b3.j j82;
            block6: {
                Object object;
                Object object2 = string.split("\u0000");
                String string3 = Uri.decode((String)object2[0]);
                if (!d0.B(string3)) {
                    object = ax.Ha.c.h().f().d("ISCD");
                    object2 = new StringBuilder();
                    ((StringBuilder)object2).append(string3);
                    ((StringBuilder)object2).append(":");
                    ((StringBuilder)object2).append(string.length());
                    ((StringBuilder)object2).append(":");
                    ((StringBuilder)object2).append(string);
                    ((ax.Ha.b)object).g(((StringBuilder)object2).toString()).h();
                    i8.a();
                    continue;
                }
                if (!d0.r(string3).equals(string2)) {
                    if (string2 != null) return;
                }
                try {
                    object = (y)c8.d.z(string3);
                    if (((y)object).q() == Long.parseLong((String)object2[1])) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append(string);
                        stringBuilder.append("\n");
                        bufferedWriter.write(stringBuilder.toString());
                        this.X(c8, string3, (y)object, (String[])object2);
                        i8.a();
                        stack.push(string2);
                        stack.push(string3);
                        return;
                    }
                }
                catch (ax.b3.j j82) {
                    break block6;
                }
                i8.a();
                this.K(c8, (n)object, bufferedWriter, i8);
                continue;
            }
            j82.printStackTrace();
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void P(c var1_1, n var2_8) throws IOException {
        block25: {
            block22: {
                block24: {
                    block23: {
                        block21: {
                            var8_10 = null;
                            try {
                                if (var2_8.isDirectory()) break block21;
                                var3_11 = new StringBuilder();
                                var3_11.append("location:");
                                var3_11.append(var1_1.c);
                                var3_11.append(",");
                                var3_11.append(var2_8.E());
                                var3_11.append(",");
                                var3_11.append(var1_1.c.e());
                                var3_11.append(",");
                                var3_11.append(var2_8.n());
                                var3_11 = var3_11.toString();
                                if (!var2_8.n()) break block21;
                                ax.Ha.c.h().f().b("SCAN ROOT IS NOT DIR").g(var3_11).h();
                            }
                            catch (Throwable var1_2) {
                                var2_8 = null;
                                var3_11 = var8_10;
                                break block22;
                            }
                        }
                        var10_12 = var1_1.e;
                        var3_11 = new StringBuilder();
                        var3_11.append(var1_1.e.getAbsolutePath());
                        var3_11.append(".tmp");
                        var9_13 = new File(var3_11.toString());
                        if (var10_12.exists()) {
                            var4_14 = new FileReader(var10_12);
                            var3_11 = new BufferedReader((Reader)var4_14);
                        } else {
                            var3_11 = null;
                        }
                        var4_14 = var3_11;
                        try {
                            var4_14 = var3_11;
                            var4_14 = var3_11;
                            var5_16 = new FileWriter(var9_13);
                            var4_14 = var3_11;
                            var6_15 = new BufferedWriter((Writer)var5_16);
                            if (var3_11 == null) break block23;
                            var4_14 = var3_11;
                        }
                        catch (Throwable var1_6) {
                            var2_8 = null;
                            ** continue;
                        }
                        try {
                            var7_17 = var3_11.readLine();
                            break block24;
                        }
                        catch (Throwable var1_3) {
                            var2_8 = var6_15;
lbl59:
                            // 2 sources

                            while (true) {
                                var3_11 = var4_14;
                                break block22;
                                break;
                            }
                        }
                    }
                    var7_17 = null;
                }
                var4_14 = var3_11;
                var5_16 = var3_11;
                if (!"6".equals(var7_17)) {
                    var5_16 = var3_11;
                    if (var3_11 != null) {
                        var4_14 = var3_11;
                        var3_11.close();
                        try {
                            w.A(var10_12);
                            var5_16 = null;
                        }
                        catch (Throwable var1_5) {
                            var3_11 = var8_10;
                            var2_8 = var6_15;
                            break block22;
                        }
                    }
                }
                var4_14 = var5_16;
                {
                    var6_15.write("6\n");
                    if (var5_16 != null) {
                        var4_14 = var5_16;
                        var5_16.readLine();
                    }
                    var4_14 = var5_16;
                    var4_14 = var5_16;
                    var3_11 = new i((BufferedReader)var5_16);
                    var4_14 = var5_16;
                    this.K((c)var1_1, (n)var2_8, var6_15, (i)var3_11);
                    var1_1 = var5_16;
                    if (var5_16 != null) {
                        var4_14 = var5_16;
                        var5_16.close();
                        var1_1 = null;
                    }
                    var4_14 = var1_1;
                    var6_15.close();
                    var4_14 = var1_1;
                }
                w.A(var10_12);
                var4_14 = var1_1;
                var9_13.renameTo(var10_12);
                if (var1_1 == null) return;
                try {
                    var1_1.close();
                    return;
                }
                catch (IOException var1_7) {
                    return;
                }
            }
            if (var3_11 == null) break block25;
            try {}
            catch (IOException var2_9) {
                throw var1_4;
            }
            var3_11.close();
        }
        if (var2_8 == null) throw var1_4;
        var2_8.close();
        throw var1_4;
    }

    private boolean Q(c object, n n8) {
        if (!(((c)object).h || ((String)(object = n8.B())).length() <= 4 || ((String)object).charAt(((String)object).length() - 3) != '.' && ((String)object).charAt(((String)object).length() - 4) != '.')) {
            return false;
        }
        return n8.isDirectory();
    }

    private boolean R(Context object) {
        File file = w.H((Context)object, true);
        object = w.J((Context)object, true);
        boolean bl = file.exists() && file.length() > 0L;
        boolean bl2 = ((File)object).exists() && ((File)object).length() > 0L;
        if (ax.Z2.j.F().t0()) {
            return bl && bl2;
        }
        return bl;
    }

    public static boolean S(String string) {
        if (p.contains(string)) {
            return true;
        }
        string = d0.q(string, 4);
        return p.contains(string);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private List<n> T(c c8, n object, boolean bl) throws ax.b3.j {
        Object object2;
        int n8;
        block16: {
            boolean bl2 = Q.h1();
            n8 = 0;
            if (bl2 && bl && !c8.a.equals(object2 = ((n)object).E())) {
                if (!c8.f()) {
                    this.x(c8, false);
                }
                if ((object2 = c8.d((String)object2)) != null && object2.size() > 0) {
                    if (s.contains(((n)object).W())) {
                        n8 = 1;
                        break block16;
                    } else {
                        ArrayList<n> arrayList = new ArrayList<n>();
                        object = (x)c8.d.u();
                        while (true) {
                            if (n8 >= object2.size()) {
                                return arrayList;
                            }
                            A a8 = (A)object2.get(n8);
                            arrayList.add(((x)object).A0(c8.c, a8));
                            ++n8;
                        }
                    }
                }
            }
            n8 = 0;
        }
        if (!((y)object).w0()) {
            return null;
        }
        if (!object.isDirectory()) {
            return null;
        }
        List<n> list = c8.d.f0((n)object);
        if (n8 != 0 && list != null) {
            HashSet<String> hashSet = new HashSet<String>();
            List<A> list2 = c8.d(((n)object).E());
            if (list2 != null) {
                object2 = list2.iterator();
                while (object2.hasNext()) {
                    hashSet.add(object2.next().a);
                }
            }
            ArrayList<ax.o3.f> arrayList = new ArrayList<ax.o3.f>();
            long l8 = O.c();
            Iterator<n> iterator = list.iterator();
            n8 = 5000;
            while (iterator.hasNext()) {
                Object var9_9;
                n n9 = iterator.next();
                if (n9.h() || n9.isDirectory() || hashSet.contains(n9.E())) continue;
                A a9 = new A(n9.E(), n9.isDirectory(), n9.q(), null, n9.q(), n9.p());
                object2 = var9_9;
                if (var9_9 == null) {
                    object2 = new ArrayList();
                    c8.h(((n)object).E(), (List<A>)object2);
                }
                object2.add((A)a9);
                if (n9.q() >= l8) {
                    c8.a(n9);
                }
                Object object3 = object2;
                if (n8 >= 196608) continue;
                ax.o3.f f8 = new ax.o3.f(n9.E(), n9.P().K(), n9.L(), n9.q(), false, false, false, false, false, false);
                arrayList.add(f8);
                n8 += f8.a();
                Object object4 = object2;
            }
            if (!arrayList.isEmpty()) {
                x.O1(this.k, arrayList, false, n8);
            }
        }
        return list;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static void W(Context context) {
        try {
            w.A(w.H(context, false));
            w.A(w.H(context, true));
            w.A(w.J(context, false));
            w.A(w.J(context, true));
            w.A(w.I(context));
            return;
        }
        catch (IllegalStateException illegalStateException) {
            return;
        }
    }

    private void X(c c8, String string, y y8, String[] stringArray) {
        Boolean bl = null;
        for (int i8 = 2; i8 < stringArray.length; ++i8) {
            Object object = stringArray[i8];
            Object object2 = ((String)object).split("/");
            if (i8 == 2 && ((String[])object2).length < 2) {
                if (!"true".equalsIgnoreCase((String)object) && !"false".equalsIgnoreCase((String)object)) {
                    if (!"null".equalsIgnoreCase((String)object)) continue;
                    bl = null;
                    continue;
                }
                bl = Boolean.valueOf((String)object);
                continue;
            }
            if (i8 == 3 && ((String[])object2).length < 2) {
                if (!"true".equalsIgnoreCase((String)object) && !"false".equalsIgnoreCase((String)object)) {
                    "null".equalsIgnoreCase((String)object);
                    continue;
                }
                this.i.put(string, Boolean.valueOf((String)object));
                continue;
            }
            Object object3 = ax.Q2.f.valueOf(object2[0]);
            if ((object3 = this.h.get(object3)) == null) {
                object3 = ax.Ha.c.h().f().b("NULL SCANINFO");
                object2 = new StringBuilder();
                ((StringBuilder)object2).append("loc:");
                ((StringBuilder)object2).append((String)object);
                ((ax.Ha.b)object3).g(((StringBuilder)object2).toString()).h();
                continue;
            }
            object = new e();
            ((e)object).f = Integer.valueOf(object2[1]);
            ((e)object).e = Long.valueOf((String)object2[2]);
            ((e)object).g = Long.valueOf((String)object2[3]);
            ((e)object).h = Uri.decode((String)object2[4]);
            ((e)object).b = false;
            ((e)object).a = c8.c;
            ((e)object).c = y8;
            ((e)object).d = bl;
            ((f)object3).a.put(y8.E(), (e)object);
        }
    }

    private void Y(String string, boolean bl, ArrayList<n> arrayList) {
        c c8 = new c(K.e, string, w.H(this.k, bl), bl);
        Set<String> set = c8.b;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append("/Android/data");
        set.add(stringBuilder.toString());
        set = c8.b;
        stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append("/.localcache");
        set.add(stringBuilder.toString());
        set = c8.b;
        stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append("/Android/media/com.voxdon.xplorer/.localcache");
        set.add(stringBuilder.toString());
        try {
            this.b0(c8, c8.d.z(c8.a), arrayList);
            return;
        }
        catch (ax.b3.j j8) {
            b.f();
            return;
        }
    }

    private void Z(HashMap<String, v> hashMap, List<n> list) {
        o o8;
        block5: {
            File file = w.I(this.k);
            o8 = ax.c3.x.d(ax.Q2.f.F0, 0);
            o8.n0();
            O o9 = new O((B)o8.u());
            try {
                o9.a(file, hashMap, list);
                break block5;
            }
            catch (Exception exception) {
                exception.printStackTrace();
                ax.Ha.c.h().d("NEWSCAN1:").l(exception).h();
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
            try {
                w.A(file);
                o9.a(file, hashMap, list);
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
        o8.k0(false);
    }

    private void a0(String string, boolean bl, ArrayList<n> arrayList) {
        c c8 = new c(K.f, string, w.J(this.k, bl), bl);
        Set<String> set = c8.b;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append("/Android/data");
        set.add(stringBuilder.toString());
        try {
            this.b0(c8, c8.d.z(c8.a), arrayList);
            return;
        }
        catch (ax.b3.j j8) {
            b.f();
            return;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void b0(c var1_1, n var2_2, ArrayList<n> var3_7) {
        block34: {
            block37: {
                block38: {
                    block35: {
                        block36: {
                            block33: {
                                block32: {
                                    try {
                                        this.P(var1_1, (n)var2_2);
                                        if (!Q.L() || var1_1.c != K.f) break block32;
                                        break block33;
                                    }
                                    catch (Throwable var2_3) {
                                        break block34;
                                    }
                                    catch (IllegalArgumentException var4_8) {
                                        ** GOTO lbl-1000
                                    }
                                    catch (StackOverflowError var4_9) {
                                        ** GOTO lbl-1000
                                    }
                                    catch (NumberFormatException var4_10) {
                                        ** GOTO lbl-1000
                                    }
                                    catch (IllegalStateException var4_11) {
                                        ** GOTO lbl-1000
                                    }
                                    catch (IndexOutOfBoundsException var4_12) {
                                        ** GOTO lbl-1000
                                    }
                                    catch (IOException var4_13) {
                                        ** GOTO lbl-1000
                                    }
                                }
                                this.d0(var1_1, (n)var2_2);
                            }
                            if (Q.h1()) {
                                var1_1.c();
                            }
                            break block38;
lbl-1000:
                            // 1 sources

                            {
                                var4_8.printStackTrace();
                                var4_14 = ax.Ha.c.h().d("LST4").l(var4_8);
                                var5_15 = new StringBuilder();
                                var5_15.append("location:");
                                var5_15.append(var1_1.c.toString());
                                var4_14.g(var5_15.toString()).h();
                            }
                            if (Q.h1()) lbl-1000:
                            // 6 sources

                            {
                                while (true) {
                                    var1_1.c();
                                    break block35;
                                    break;
                                }
                            }
                            break block35;
lbl-1000:
                            // 1 sources

                            {
                                var4_9.printStackTrace();
                                var4_14 = ax.Ha.c.h().d("SCANSTACK!!!").l(var4_9);
                                var5_16 = new StringBuilder();
                                var5_16.append("location:");
                                var5_16.append(var1_1.c.toString());
                                var4_14.g(var5_16.toString()).h();
                            }
                            if (!Q.h1()) break block35;
                            ** GOTO lbl-1000
lbl-1000:
                            // 1 sources

                            {
                                var4_10.printStackTrace();
                                var5_17 = ax.Ha.c.h().d("LST3").l(var4_10);
                                var4_14 = new StringBuilder();
                                var4_14.append("location:");
                                var4_14.append(var1_1.c.toString());
                                var5_17.g(var4_14.toString()).h();
                            }
                            if (!Q.h1()) break block35;
                            ** GOTO lbl-1000
lbl-1000:
                            // 1 sources

                            {
                                var4_11.printStackTrace();
                                if (TextUtils.isEmpty((CharSequence)var4_11.getMessage())) {
                                    var5_18 = ax.Ha.c.h().d("LST2:").l(var4_11);
                                    var4_14 = new StringBuilder();
                                    var4_14.append("location:");
                                    var4_14.append(var1_1.c.toString());
                                    var5_18.g(var4_14.toString()).h();
                                    break block36;
                                }
                                ax.Ha.c.h().d("LST2-2").g(var4_11.getMessage()).h();
                            }
                        }
                        if (!Q.h1()) break block35;
                        ** GOTO lbl-1000
lbl-1000:
                        // 1 sources

                        {
                            var4_12.printStackTrace();
                            var4_14 = ax.Ha.c.h().d("LST1:").l(var4_12);
                            var5_19 = new StringBuilder();
                            var5_19.append("location:");
                            var5_19.append(var1_1.c.toString());
                            var4_14.g(var5_19.toString()).h();
                        }
                        if (!Q.h1()) break block35;
                        ** GOTO lbl-1000
lbl-1000:
                        // 1 sources

                        {
                            var4_13.printStackTrace();
                        }
                        if (!Q.h1()) ** break;
                        ** while (true)
                    }
                    w.o.severe("Retry Incremental Scan.");
                    try {
                        var1_1.b();
                        w.A(var1_1.e);
                        this.P(var1_1, (n)var2_2);
                    }
                    catch (Throwable var2_4) {
                        break block37;
                    }
                    catch (IndexOutOfBoundsException var2_5) {
                        ** GOTO lbl-1000
                    }
                    catch (IOException var2_6) {
                        ** GOTO lbl-1000
                    }
                    if (Q.h1()) lbl-1000:
                    // 3 sources

                    {
                        while (true) {
                            var1_1.c();
                            break block38;
                            break;
                        }
                    }
                    break block38;
lbl-1000:
                    // 1 sources

                    {
                        var2_5.printStackTrace();
                        var4_14 = ax.Ha.c.h().d("OOB2").l(var2_5);
                        var2_2 = new StringBuilder();
                        var2_2.append("location:");
                        var2_2.append(var1_1.c.toString());
                        var4_14.g(var2_2.toString()).h();
                        w.o.severe("Incremental Scan Failed.");
                    }
                    if (!Q.h1()) break block38;
                    ** GOTO lbl-1000
lbl-1000:
                    // 1 sources

                    {
                        var2_6.printStackTrace();
                        w.o.severe("Incremental Scan Failed.");
                    }
                    if (!Q.h1()) ** break;
                    ** while (true)
                }
                if (Q.h1()) {
                    if (!var1_1.g()) {
                        this.x(var1_1, true);
                    }
                    if ((var2_2 = var1_1.g) != null) {
                        var3_7.addAll((Collection<n>)var2_2);
                    } else {
                        b.f();
                    }
                    var1_1.b();
                }
                return;
            }
            if (Q.h1()) {
                var1_1.c();
            }
            throw var2_4;
        }
        if (Q.h1()) {
            var1_1.c();
        }
        throw var2_3;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void c0(K object, f f8, HashMap<String, v> hashMap, HashMap<String, y.b> hashMap2, HashMap<String, Set<String>> hashMap3) {
        Throwable throwable2;
        o o8;
        block12: {
            o8 = ax.c3.x.e((K)object);
            o8.n0();
            try {
                object = o8.z(((K)object).e());
                ArrayList<n> arrayList = new ArrayList<n>();
                ArrayList<e> arrayList2 = new ArrayList<e>(f8.a.values());
                u u8 = (u)o8.u();
                ax.Z2.b.k().a(arrayList2.size());
                int n8 = arrayList2.size();
                int n9 = 0;
                while (n9 < n8) {
                    Object object2 = arrayList2.get(n9);
                    ++n9;
                    e e8 = object2;
                    v v8 = (v)u8.z0(e8.c.F0(), e8.a, false);
                    if (e8.c.isDirectory()) {
                        long l8 = e8.g;
                        if (l8 != 0L) {
                            v8.H1(l8);
                            v8.I1(e8.h);
                            v8.v1();
                        }
                        v8.d0(e8.f);
                        v8.k1(com.voxdon.xplorer.file.v.E1(v8, e8, this.i.get(e8.c.T()), hashMap2, hashMap3));
                        if (e8.b && (object2 = o8.H(v8)) != null) {
                            ax.r3.d.B(this.k, (String)object2);
                        }
                    }
                    if (!v8.h()) {
                        f8.b += e8.e;
                        f8.c += e8.f;
                        if (K.e.equals(v8.B0())) {
                            f8.d += e8.e;
                        } else {
                            f8.e += e8.e;
                        }
                        hashMap.put(e8.c.E(), v8);
                    }
                    v8.r1();
                    if (!v8.n()) continue;
                    arrayList.add(v8);
                }
                ax.Z2.b.k().m((n)object, arrayList);
                arrayList2.clear();
                o8.k0(false);
                return;
            }
            catch (Throwable throwable2) {
                break block12;
            }
            catch (ax.b3.j j8) {}
            {
                j8.printStackTrace();
                o8.k0(false);
                return;
            }
        }
        o8.k0(false);
        throw throwable2;
    }

    private void d0(c c8, n n8) {
        for (String j8 : p) {
            ax.b3.j j92;
            block5: {
                n n9;
                try {
                    String iOException = d0.P(n8.E(), j8);
                    n9 = c8.d.z(iOException);
                    boolean bl = n9.n();
                    if (!bl) continue;
                }
                catch (ax.b3.j j92) {
                    break block5;
                }
                try {
                    this.M(c8, n9, null);
                    continue;
                }
                catch (IOException iOException) {
                    continue;
                }
            }
            j92.printStackTrace();
            b.e("whiltelist scan failed");
        }
    }

    private void e0(c object, n n8, List<n> iterator, Writer writer) throws IOException {
        Object object22;
        HashMap<ax.Q2.f, Object> hashMap = new HashMap<ax.Q2.f, Object>();
        Object object3 = iterator.iterator();
        iterator = null;
        Comparable<StringBuffer> comparable = null;
        while (object3.hasNext()) {
            n n9 = object3.next();
            object22 = n9.B();
            ax.Q2.f f8 = ax.c3.A.l(ax.c3.A.g(d0.f((String)object22)));
            if (f8 == ax.Q2.f.C0 && (this.F(n9) || this.E(n8))) continue;
            if (f8 != null) {
                if (!hashMap.containsKey((Object)f8)) {
                    object22 = new e();
                    hashMap.put(f8, object22);
                    ((e)object22).c = (y)n8;
                    ((e)object22).a = ((c)object).c;
                } else {
                    object22 = (e)hashMap.get((Object)f8);
                }
                try {
                    ((e)object22).e += n9.p();
                    ++((e)object22).f;
                    long l8 = n9.q();
                    if (((e)object22).g >= l8 || n9.h()) continue;
                    ((e)object22).g = l8;
                    ((e)object22).h = n9.B();
                }
                catch (IllegalArgumentException illegalArgumentException) {}
                continue;
            }
            if (".nomedia".equals(object22)) {
                iterator = Boolean.TRUE;
                continue;
            }
            if (!".hidden".equals(object22)) continue;
            comparable = Boolean.TRUE;
        }
        if (Q.h1()) {
            object22 = iterator;
            object3 = d0.Q(n8.E(), ".nomedia");
            object22 = iterator;
            iterator = ((y)((c)object).d.z((String)object3)).x0();
            object22 = iterator;
            object3 = d0.Q(n8.E(), ".hidden");
            object22 = iterator;
            try {
                object3 = ((y)((c)object).d.z((String)object3)).x0();
                object = iterator;
                iterator = object3;
            }
            catch (ax.b3.j j8) {
                j8.printStackTrace();
                b.f();
                object = object22;
                iterator = comparable;
            }
        } else {
            object22 = iterator;
            if (iterator == null) {
                object22 = Boolean.FALSE;
            }
            object = object22;
            iterator = comparable;
            if (comparable == null) {
                iterator = Boolean.FALSE;
                object = object22;
            }
        }
        if (iterator != null) {
            this.i.put(n8.E(), (Boolean)((Object)iterator));
        }
        comparable = new StringBuffer();
        ((StringBuffer)comparable).append(Uri.encode((String)n8.E()));
        ((StringBuffer)comparable).append("\u0000");
        ((StringBuffer)comparable).append(String.valueOf(n8.q()));
        ((StringBuffer)comparable).append("\u0000");
        if (object == null) {
            ((StringBuffer)comparable).append("null");
        } else {
            ((StringBuffer)comparable).append(String.valueOf(object));
        }
        ((StringBuffer)comparable).append("\u0000");
        if (iterator == null) {
            ((StringBuffer)comparable).append("null");
        } else {
            ((StringBuffer)comparable).append(String.valueOf(iterator));
        }
        for (Object object22 : hashMap.keySet()) {
            object3 = (e)hashMap.get(object22);
            ((StringBuffer)comparable).append("\u0000");
            ((StringBuffer)comparable).append(((Enum)object22).name());
            ((StringBuffer)comparable).append("/");
            ((StringBuffer)comparable).append(((e)object3).f);
            ((StringBuffer)comparable).append("/");
            ((StringBuffer)comparable).append(((e)object3).e);
            ((StringBuffer)comparable).append("/");
            ((StringBuffer)comparable).append(((e)object3).g);
            ((StringBuffer)comparable).append("/");
            ((StringBuffer)comparable).append(Uri.encode((String)((e)object3).h));
            ((e)object3).b = true;
            this.h.get((Object)object22).a.put(n8.E(), (e)object3);
            ((e)object3).d = object;
        }
        ((StringBuffer)comparable).append("\n");
        if (writer != null) {
            writer.write(((StringBuffer)comparable).toString());
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void x(c c8, boolean bl) {
        RuntimeException runtimeException2;
        block10: {
            Object object;
            x x8;
            ArrayList<A> arrayList;
            long l8;
            block9: {
                System.currentTimeMillis();
                try {
                    c8.e();
                    l8 = O.c();
                    arrayList = c8.d.V();
                    x8 = (x)c8.d.u();
                    object = (y)x8.z((String)((Object)arrayList));
                    if (((y)object).isDirectory()) break block9;
                    if (Q.z0() && !ax.u3.o.c()) {
                        return;
                    }
                }
                catch (Throwable throwable) {
                    throw throwable;
                }
                catch (RuntimeException runtimeException2) {
                    break block10;
                }
                if (!"/sdcard".equals(arrayList) && !"/storage/emulated/0".equals(arrayList)) {
                    object = ax.Ha.c.h().f().b("LIBRARY ROOT IS NOT DIRECTORY");
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("rootPath: ");
                    stringBuilder.append((String)((Object)arrayList));
                    stringBuilder.append(",");
                    stringBuilder.append(c8.c);
                    ((ax.Ha.b)object).g(stringBuilder.toString()).h();
                    return;
                }
            }
            long l9 = bl ? l8 : 0L;
            List<A> list = x8.q1((n)object, true, l9, 0L);
            if (list == null) return;
            int n8 = 0;
            while (n8 < list.size()) {
                String string;
                A a8 = list.get(n8);
                if (!bl && d0.B(string = d0.r(a8.a))) {
                    List<A> list2 = c8.d(string);
                    arrayList = list2;
                    if (list2 == null) {
                        arrayList = new ArrayList<A>();
                        c8.h(string, arrayList);
                    }
                    arrayList.add(a8);
                }
                if (a8.c >= l8) {
                    c8.a(x8.A0(((y)object).B0(), a8));
                }
                ++n8;
            }
            return;
        }
        runtimeException2.printStackTrace();
        b.e("build media store cache");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void y(w w8) {
        Object object = u;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        if (w8 != t) break block3;
                        t = null;
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

    private void z(n n8, i i8) throws IOException {
        String string;
        while ((string = i8.c()) != null && (!d0.B(string = Uri.decode((String)string.split("\u0000")[0])) || d0.I(n8.E(), string))) {
            i8.a();
        }
    }

    /*
     * Exception decompiling
     */
    protected Boolean B(Void ... var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 3[TRYBLOCK] [11, 10 : 79->83)] java.lang.IllegalArgumentException
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

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    protected void U(Boolean bl) {
        List<d> list = this.j;
        // MONITORENTER : list
        Iterator<d> iterator = this.j.iterator();
        while (iterator.hasNext()) {
            iterator.next().a(bl);
        }
        w.y(this);
        if (this.l) return;
        if (!this.n) return;
        w.D(this.k, null, true);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected void V(Void ... object) {
        object = this.j;
        synchronized (object) {
            try {
                Iterator<d> iterator = this.j.iterator();
                while (true) {
                    if (!iterator.hasNext()) {
                        return;
                    }
                    iterator.next().b(this.h);
                }
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    protected void o() {
        List<d> list = this.j;
        // MONITORENTER : list
        Iterator<d> iterator = this.j.iterator();
        while (iterator.hasNext()) {
            iterator.next().a(false);
        }
        w.y(this);
    }

    @Override
    protected void r() {
        this.h = new HashMap();
        this.i = new HashMap();
        for (K k8 : K.c()) {
            this.h.put(k8.d(), new f());
        }
    }

    public void w(d d8) {
        if (d8 != null) {
            this.j.add(d8);
        }
    }

    static class c {
        String a;
        Set<String> b;
        K c;
        o d;
        File e;
        HashMap<String, List<A>> f;
        ArrayList<n> g;
        boolean h;

        c(K k8, String string, File file, boolean bl) {
            this.c = k8;
            this.d = ax.c3.x.e(k8);
            this.b = new HashSet<String>();
            this.a = string;
            this.e = file;
            this.h = bl;
        }

        void a(n n8) {
            this.g.add(n8);
        }

        void b() {
            ArrayList<n> arrayList = this.g;
            if (arrayList != null) {
                arrayList.clear();
                this.g = null;
            }
            this.c();
        }

        void c() {
            HashMap<String, List<A>> hashMap = this.f;
            if (hashMap != null) {
                hashMap.clear();
                this.f = null;
            }
        }

        List<A> d(String string) {
            return this.f.get(string);
        }

        void e() {
            this.f = new HashMap();
            this.g = new ArrayList();
        }

        boolean f() {
            return this.f != null;
        }

        boolean g() {
            return this.g != null;
        }

        void h(String string, List<A> list) {
            this.f.put(string, list);
        }
    }

    public static interface d {
        public void a(boolean var1);

        public void b(HashMap<ax.Q2.f, f> var1);
    }

    public static class e {
        public K a;
        public boolean b = false;
        public y c;
        public Boolean d;
        public long e = 0L;
        public int f = 0;
        public long g = 0L;
        public String h;
    }

    public static class f {
        public HashMap<String, e> a = new HashMap();
        public long b = 0L;
        public int c = 0;
        public long d = 0L;
        public long e = 0L;
    }
}

