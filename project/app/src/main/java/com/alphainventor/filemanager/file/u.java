/*
 * Decompiled with CFR 0.152.
 */
package com.alphainventor.filemanager.file;

import android.annotation.SuppressLint;
import android.os.Environment;
import ax.Q2.f;
import ax.X2.K;
import ax.X2.Q;
import ax.b3.j;
import ax.c3.A;
import ax.c3.B;
import ax.c3.G;
import ax.c3.d0;
import ax.c3.z;
import ax.g3.h;
import ax.g3.i;
import ax.u3.b;
import ax.u3.c;
import com.alphainventor.filemanager.file.J;
import com.alphainventor.filemanager.file.m;
import com.alphainventor.filemanager.file.n;
import com.alphainventor.filemanager.file.p;
import com.alphainventor.filemanager.file.v;
import com.alphainventor.filemanager.file.w;
import com.alphainventor.filemanager.file.x;
import com.alphainventor.filemanager.file.y;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.logging.Logger;

public class u
extends x {
    private static final Logger B = Logger.getLogger("FileManager.LibraryFileHelper");
    static SimpleDateFormat C = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", Locale.US);
    private static final Map<z, a> D;
    private HashSet<n> A;
    private z z;

    static {
        HashMap<z, a> hashMap = new HashMap<z, a>();
        D = hashMap;
        z z8 = ax.c3.z.f0;
        hashMap.put(z8, new a(z8));
        z8 = ax.c3.z.e0;
        hashMap.put(z8, new a(z8));
        z8 = ax.c3.z.c0;
        hashMap.put(z8, new a(z8));
        z8 = ax.c3.z.h0;
        hashMap.put(z8, new a(z8));
        z8 = ax.c3.z.o0;
        hashMap.put(z8, new a(z8));
        z8 = ax.c3.z.p0;
        hashMap.put(z8, new a(z8));
        z8 = ax.c3.z.r0;
        hashMap.put(z8, new a(z8));
        z8 = ax.c3.z.v0;
        hashMap.put(z8, new a(z8));
    }

    public static void V1(m object, n n8) throws j {
        object = object.z(((m)object).x());
        List<n> list = ax.Z2.b.k().g((n)object);
        if (list != null && (list = new ArrayList<n>(list)).remove(n8)) {
            ax.Z2.b.k().m((n)object, list);
        }
    }

    private void W1(n n8) {
        Object object = this.A;
        if (object != null) {
            Iterator<n> iterator = ((HashSet)object).iterator();
            while (iterator.hasNext()) {
                object = iterator.next();
                if (object == null || !((n)object).E().equals(n8.E())) continue;
                iterator.remove();
            }
        }
    }

    private n Z1(n object) {
        a a8 = D.get((Object)this.Y1());
        v v8 = (v)object;
        Object object2 = v8.F1();
        object = v8.B0();
        if (object2 != null && ((File)(object2 = new File(v8.F0(), (String)object2))).exists()) {
            return new v(this, (File)object2, a8, (ax.c3.K)object);
        }
        B.fine("WARN : GetFirstFileInfoFromDirectory ListFiles");
        return this.f2(v8);
    }

    private v a2(String string) {
        Object object = (v)this.z(this.x());
        object = ax.Z2.b.k().g((n)object);
        if (object != null) {
            Iterator iterator = object.iterator();
            while (iterator.hasNext()) {
                object = (n)iterator.next();
                if (!((n)object).E().equals(string)) continue;
                return (v)object;
            }
        }
        return null;
    }

    private n b2(n n8) {
        a a8 = D.get((Object)ax.c3.z.f0);
        File[] fileArray = ((y)(n8 = (v)n8)).F0().listFiles(a8);
        if (fileArray.length > 0) {
            return new v(this, fileArray[0], a8, ((y)n8).B0());
        }
        return null;
    }

    public static String c2(f object) {
        if (object == f.A0) {
            object = Environment.getExternalStoragePublicDirectory((String)Environment.DIRECTORY_MUSIC);
        } else if (object == f.B0) {
            object = Environment.getExternalStoragePublicDirectory((String)Environment.DIRECTORY_MOVIES);
        } else if (object == f.z0) {
            object = Environment.getExternalStoragePublicDirectory((String)Environment.DIRECTORY_PICTURES);
        } else if (object == f.C0) {
            object = Q.H0() ? Environment.getExternalStoragePublicDirectory((String)Environment.DIRECTORY_DOCUMENTS) : new File(K.y(), "Documents");
        } else {
            File file = Environment.getExternalStorageDirectory();
            ax.Ha.c.h().d("UNKNOWN LIBRARY LOCATION!!!!!!").g(((f)((Object)object)).I()).h();
            object = file;
        }
        if (!((File)object).exists()) {
            ((File)object).mkdirs();
        }
        return ((File)object).getAbsolutePath();
    }

    private void d2(String object) {
        if ((object = this.a2((String)object)) != null) {
            ((n)object).d0(-3);
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private boolean e2(n n8) {
        synchronized (this) {
            boolean bl;
            Object object;
            block6: {
                object = this.A;
                bl = false;
                if (object != null) break block6;
                return false;
            }
            try {
                object = ((HashSet)object).iterator();
                while (object.hasNext()) {
                    n n9 = (n)object.next();
                    if (!n8.E().equals(n9.E())) continue;
                    object.remove();
                    bl = true;
                }
            }
            catch (Throwable throwable) {}
            return bl;
            throw throwable;
        }
    }

    @Override
    public InputStream A(String string, String object, String string2) {
        if (string != null && ax.c3.B.I(string)) {
            v v8;
            v v9 = v8 = this.a2((String)object);
            if (v8 == null) {
                v9 = (v)this.z((String)object);
            }
            if ((object = this.X1(v9)) != null) {
                return super.A(string, ((n)object).E(), string2);
            }
            return ax.r3.b.n();
        }
        return super.A(string, (String)object, string2);
    }

    @Override
    public List<n> C(n list, m.f object) throws j {
        ArrayList<n> arrayList;
        block8: {
            Object object2;
            block7: {
                InterruptedException interruptedException2;
                block6: {
                    object2 = (v)((Object)list);
                    arrayList = new ArrayList<n>();
                    if (!d0.E((n)((Object)list))) break block7;
                    if (ax.Z2.b.k().f((n)((Object)list))) {
                        return this.g2((n)((Object)list), ax.Z2.b.k().g((n)((Object)list)), false);
                    }
                    try {
                        w.C(this.p(), null).l();
                        list = ax.Z2.b.k().g((n)((Object)list));
                        return list;
                    }
                    catch (ExecutionException executionException) {
                    }
                    catch (InterruptedException interruptedException2) {
                        break block6;
                    }
                    executionException.printStackTrace();
                    break block8;
                }
                interruptedException2.printStackTrace();
                break block8;
            }
            if ((object = super.C((n)object2, (m.f)((Object)object))) != null) {
                list = ((v)object2).C1();
                object2 = object.iterator();
                while (object2.hasNext()) {
                    object = (n)object2.next();
                    if (list != null && !((a)((Object)list)).b(((n)object).B())) continue;
                    arrayList.add(new v((x)this, (y)object, (a)((Object)list)));
                }
            }
        }
        return arrayList;
    }

    @Override
    public void D(n n8, G g8, String string, long l8, Long l9, p p8, boolean bl, c c8, i i8) throws j, ax.b3.a {
        super.D(n8, g8, string, l8, l9, p8, bl, c8, i8);
        this.d2(n8.T());
    }

    @Override
    public void E(n n8, n n9, c object, i list) throws j, ax.b3.a {
        super.E(n8, n9, (c)object, (i)((Object)list));
        if (this.T1(n8)) {
            object = this.z(this.x());
            list = ax.Z2.b.k().g((n)object);
            if (list != null && list.contains(n8)) {
                ArrayList<n> arrayList = new ArrayList<n>(list);
                arrayList.remove(n8);
                boolean bl = this.e2(n8);
                if (!J.j2(n9)) {
                    list = this.z(n9.E());
                    arrayList.add((n)((Object)list));
                    if (bl && n8.T().equals(n9.T())) {
                        this.U1((n)((Object)list));
                    }
                }
                ax.Z2.b.k().m((n)object, arrayList);
            }
        }
        if (!n8.T().equals(n9.T())) {
            this.d2(n8.T());
            this.d2(n9.T());
        }
    }

    @Override
    public void F(n n8, n n9, c c8, i i8) throws j, ax.b3.a {
        super.F(n8, n9, c8, i8);
    }

    @Override
    public int G(String string, String object) {
        if (string != null && ax.c3.B.I(string)) {
            v v8;
            v v9 = v8 = this.a2((String)object);
            if (v8 == null) {
                v9 = (v)this.z((String)object);
            }
            if ((object = this.X1(v9)) != null) {
                return super.G(string, ((n)object).E());
            }
            return 0;
        }
        return super.G(string, (String)object);
    }

    @Override
    public String H(n n8) {
        if (!(f.m0(this.u()) || Q.r1() && ax.c3.z.n0 == n8.G() || "epub".equals(n8.A()))) {
            return null;
        }
        if (n8.isDirectory()) {
            return ax.c3.B.T(n8);
        }
        return ax.c3.B.W(n8);
    }

    @Override
    protected void I0(n object, List<n> list, boolean bl, String object2, boolean bl2, h h8) {
        if ((list = ax.c3.B.h(list, (String)object2, bl2, true)) == null) {
            return;
        }
        if (object instanceof v) {
            if ((object = ((v)object).C1()) != null) {
                object2 = list.iterator();
                while (object2.hasNext()) {
                    if (((a)object).b(((n)object2.next()).B())) continue;
                    object2.remove();
                }
            }
        } else {
            b.f();
        }
        h8.Y(list, bl);
    }

    @Override
    public boolean M(n n8) {
        boolean bl = super.M(n8);
        if (bl) {
            this.U1(n8);
        }
        return bl;
    }

    @Override
    public void P(n n8) throws j {
        if (n8.isDirectory()) {
            if (this.b0(n8).size() == 0) {
                u.V1(this, n8);
                this.W1(n8);
            }
            if (n8 instanceof y) {
                y y8 = (y)n8;
                if (n8.E().equals(y8.B0().e())) {
                    return;
                }
            }
        } else {
            this.d2(n8.T());
        }
        super.P(n8);
    }

    protected boolean T1(n n8) {
        return n8.isDirectory();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void U1(n n8) {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                block4: {
                    block5: {
                        try {
                            HashSet hashSet = n8.T();
                            if (hashSet == null || !((String)((Object)hashSet)).equals(u.c2(this.u()))) break block4;
                            if (this.A != null) break block5;
                            hashSet = new HashSet();
                            this.A = hashSet;
                        }
                        catch (Throwable throwable2) {
                            break block6;
                        }
                    }
                    if (!m.k(this.A, n8)) {
                        this.A.add(this.z(n8.E()));
                    }
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
    public n X1(n n8) {
        Comparable<File> comparable = new File(((y)n8).F0(), ".folderimage");
        if (((File)comparable).exists() && !((File)comparable).isDirectory()) {
            return new v(this, (File)comparable, D.get((Object)ax.c3.z.f0), ((v)n8).B0());
        }
        comparable = this.Z1(n8);
        if (this.u() != f.A0) return comparable;
        if (comparable == null) return comparable;
        InputStream inputStream = this.K0(((n)comparable).E());
        if (inputStream == null) {
            return this.b2(n8);
        }
        try {
            inputStream.close();
            return comparable;
        }
        catch (IOException iOException) {
            return comparable;
        }
    }

    public z Y1() {
        if (this.z == null) {
            this.z = ax.c3.A.h(this.u());
        }
        return this.z;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public n f2(v v8) {
        try {
            n n8;
            List<n> list = this.b0(v8);
            long l8 = 0L;
            if (list == null) {
                n8 = null;
            } else {
                Iterator<n> iterator = list.iterator();
                n8 = null;
                while (iterator.hasNext()) {
                    n n9 = iterator.next();
                    if (n9.h()) continue;
                    if (n8 == null) {
                        l8 = n9.q();
                        n8 = n9;
                        continue;
                    }
                    long l9 = n9.q();
                    if (l9 <= l8) continue;
                    n8 = n9;
                    l8 = l9;
                }
                v8.d0(list.size());
            }
            if (n8 == null) return null;
            v8.I1(n8.B());
            v8.H1(l8);
            return n8;
        }
        catch (j j8) {
            return null;
        }
    }

    public List<n> g2(n n8, List<n> object, boolean bl) {
        if (object == null) {
            return null;
        }
        Object object2 = object;
        if (d0.E(n8)) {
            object2 = object;
            if (this.A != null) {
                ArrayList<n> arrayList = new ArrayList<n>((Collection<n>)object);
                Iterator<n> iterator = this.A.iterator();
                boolean bl2 = false;
                while (iterator.hasNext()) {
                    object2 = iterator.next();
                    if (!object2.n() || m.k((Collection<n>)object, (n)object2)) continue;
                    arrayList.add((n)object2);
                    bl2 = true;
                }
                object2 = object;
                if (bl2) {
                    ax.Z2.b.k().m(n8, arrayList);
                    object2 = arrayList;
                }
            }
        }
        if (bl) {
            object = object2.iterator();
            while (object.hasNext()) {
                n8 = (v)((n)object.next());
                if (!((y)n8).q0()) continue;
                this.f2((v)n8);
            }
        }
        return object2;
    }

    @Override
    public n z(String string) {
        return new v(this, new File(string), D.get((Object)this.Y1()), null);
    }

    @Override
    public y z0(File file, ax.c3.K k8, boolean bl) {
        if (bl) {
            return new v((x)this, new y(this, file, k8, true), D.get((Object)this.Y1()));
        }
        return new v(this, file, D.get((Object)this.Y1()), k8);
    }

    static class a
    implements FilenameFilter {
        z q;

        public a(z z8) {
            this.q = z8;
        }

        @Override
        @SuppressLint(value={"DefaultLocale"})
        public boolean accept(File file, String string) {
            return this.b(string);
        }

        public boolean b(String string) {
            if (!d0.A(string)) {
                return false;
            }
            return ax.c3.A.y(d0.j(string), this.q);
        }
    }
}

