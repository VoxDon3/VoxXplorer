/*
 * Decompiled with CFR 0.152.
 */
package com.voxdon.xplorer.file;

import android.util.LruCache;
import ax.Q2.f;
import ax.b3.d;
import ax.b3.e;
import ax.b3.j;
import ax.b3.l;
import ax.b3.m;
import ax.b3.q;
import ax.b3.s;
import ax.b3.t;
import ax.c3.d0;
import ax.c3.k0;
import ax.pb.a0;
import ax.pb.b0;
import ax.pb.e0;
import ax.pb.h0;
import ax.pb.r;
import ax.pb.u;
import ax.rb.c;
import com.voxdon.xplorer.file.Q;
import com.voxdon.xplorer.file.S;
import com.voxdon.xplorer.file.n;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class N {
    private static final Logger e = Logger.getLogger("FileManager.Smb1Client");
    private Q a;
    private LruCache<String, b0> b;
    private r c;
    private String d;

    public N(Q q8) {
        this.a = q8;
        this.b = new LruCache<String, b0>(this, 10){
            final N a;
            {
                this.a = n8;
                super(n9);
            }

            protected int a(String string, b0 b02) {
                return 1;
            }
        };
    }

    public static j a(String string, a0 a02) {
        if (a02 instanceof u) {
            return new e(a02);
        }
        int n8 = a02.c();
        if (N.m(n8)) {
            return new t(a02);
        }
        if (n8 == -1073741757) {
            return new l(a02);
        }
        if (n8 == -1073741697) {
            return new s(a02);
        }
        if (n8 == -1073741612) {
            return new m(a02);
        }
        if (a02.d() instanceof ax.rb.d) {
            return new q(a02);
        }
        return ax.b3.d.b(string, a02);
    }

    public static String g(Q object, b0 object2) {
        String string = ((b0)object2).v();
        Object object3 = new StringBuilder();
        f f8 = f.J0;
        ((StringBuilder)object3).append(f8.K());
        ((StringBuilder)object3).append("://");
        string = string.replace(((StringBuilder)object3).toString(), "");
        if (string.isEmpty()) {
            return File.separator;
        }
        int n8 = string.indexOf("/");
        if (n8 == -1) {
            object3 = ax.Ha.c.h().d("INVALID SMB PATH").j();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("PATH:");
            stringBuilder.append(((b0)object2).v());
            stringBuilder.append(",");
            stringBuilder.append(((b0)object2).z());
            ((ax.Ha.b)object3).g(stringBuilder.toString()).h();
            if (string.equals(((Q)object).r0())) {
                return File.separator;
            }
            object = ((b0)object2).z();
            object2 = new StringBuilder();
            ((StringBuilder)object2).append(f8.K());
            ((StringBuilder)object2).append("://");
            object = ((String)object).replace(((StringBuilder)object2).toString(), "");
            n8 = ((String)object).indexOf("/");
            if (n8 == -1) {
                return d0.U(string);
            }
            return d0.U(((String)object).substring(n8));
        }
        return d0.U(string.substring(n8));
    }

    private static boolean m(int n8) {
        return n8 == -1073741810 || n8 == -1073741809 || n8 == -1073741773 || n8 == -1073741772 || n8 == -1073741766;
        {
        }
    }

    public static void r(ax.jb.b object, int n8) throws IOException {
        object = n8 > 0 ? ax.pb.k0.s((ax.jb.b)object, n8) : ax.pb.k0.s((ax.jb.b)object, 445);
        ((c)object).a(10000L);
    }

    public boolean b(n n8) {
        block4: {
            MalformedURLException malformedURLException2;
            block3: {
                try {
                    this.k(n8.E()).h();
                    return true;
                }
                catch (a0 a02) {
                }
                catch (MalformedURLException malformedURLException2) {
                    break block3;
                }
                a02.printStackTrace();
                break block4;
            }
            malformedURLException2.printStackTrace();
        }
        return false;
    }

    public boolean c(n n8) {
        block4: {
            MalformedURLException malformedURLException2;
            block3: {
                try {
                    this.k(n8.E()).O();
                    return true;
                }
                catch (a0 a02) {
                }
                catch (MalformedURLException malformedURLException2) {
                    break block3;
                }
                a02.printStackTrace();
                break block4;
            }
            malformedURLException2.printStackTrace();
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void d(n object) throws j {
        MalformedURLException malformedURLException2;
        block5: {
            a0 a022;
            block4: {
                b0 b02;
                try {
                    b02 = this.j((n)object, false);
                    if (object.isDirectory() && b02.M().length > 0) {
                        object = new j("SMB delete Directory failed : has children");
                        throw object;
                    }
                }
                catch (a0 a022) {
                    break block4;
                }
                catch (MalformedURLException malformedURLException2) {
                    break block5;
                }
                this.b.remove((Object)((n)object).E());
                b02.i();
                return;
            }
            a022.printStackTrace();
            throw N.a("SMB1 deleteFile", a022);
        }
        malformedURLException2.printStackTrace();
        throw new j(malformedURLException2);
    }

    public S e(String object) throws j {
        a0 a022;
        block8: {
            MalformedURLException malformedURLException2;
            block7: {
                NullPointerException nullPointerException2;
                block6: {
                    try {
                        S s8 = new S(this.a, this.k((String)object));
                        return s8;
                    }
                    catch (NumberFormatException numberFormatException) {
                    }
                    catch (NullPointerException nullPointerException2) {
                        break block6;
                    }
                    catch (MalformedURLException malformedURLException2) {
                        break block7;
                    }
                    catch (a0 a022) {
                        break block8;
                    }
                    numberFormatException.printStackTrace();
                    ax.Ha.b b8 = ax.Ha.c.h().d("SmbFileInfo Number Format Exception").l(numberFormatException);
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append((String)object);
                    stringBuilder.append(":");
                    stringBuilder.append(this.l((String)object));
                    b8.g(stringBuilder.toString()).h();
                    throw new j(numberFormatException);
                }
                nullPointerException2.printStackTrace();
                ax.Ha.b b9 = ax.Ha.c.h().d("SmbFileInfo Invalid Path?");
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append((String)object);
                stringBuilder.append(":");
                stringBuilder.append(this.l((String)object));
                b9.g(stringBuilder.toString()).h();
                throw new j(nullPointerException2);
            }
            malformedURLException2.printStackTrace();
            ax.Ha.b b10 = ax.Ha.c.h().f().d("MARFORMED URL 1").l(malformedURLException2);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("prefix:");
            stringBuilder.append(this.d);
            stringBuilder.append(",path:");
            stringBuilder.append((String)object);
            stringBuilder.append(",connected:");
            stringBuilder.append(this.a.a());
            b10.g(stringBuilder.toString()).h();
            throw new j(malformedURLException2);
        }
        a022.printStackTrace();
        int n8 = a022.c();
        if (N.m(n8)) {
            return S.f0(this.a, (String)object, true);
        }
        object = e;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SmbException : ");
        stringBuilder.append(n8);
        ((Logger)object).severe(stringBuilder.toString());
        throw N.a("SMB1 getfileinfo", a022);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public InputStream f(n object, long l8) throws j {
        try {
            object = com.voxdon.xplorer.file.N$b.a(this.l(((n)object).E()), this.c);
            if (l8 == 0L) return new BufferedInputStream((InputStream)object, ((b)object).b());
            ((b)object).skip(l8);
            return new BufferedInputStream((InputStream)object, ((b)object).b());
        }
        catch (IOException iOException) {
            throw new j(iOException);
        }
        catch (FileNotFoundException fileNotFoundException) {
            throw new t(fileNotFoundException);
        }
        catch (a0 a02) {
            throw N.a("SMB1 getInputStream", a02);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public OutputStream h(n object, boolean bl) throws j {
        try {
            object = this.j((n)object, false);
            object = bl ? e0.b((b0)object) : e0.a((b0)object);
        }
        catch (IOException iOException) {
            throw ax.b3.d.b("SMB1 getOutputStream", iOException);
        }
        catch (a0 a02) {
            throw N.a("SMB1 getOutputStream", a02);
        }
        return new BufferedOutputStream((OutputStream)object, ((e0)object).d());
    }

    public k0 i(n object) throws j {
        if ((object = ((S)object).j0()) != null) {
            try {
                long l8 = ((b0)object).w();
                long l9 = ((b0)object).L();
                object = new k0(l9, l9 - l8);
                return object;
            }
            catch (Exception exception) {
                throw new j(exception);
            }
        }
        throw new j("smb file is null");
    }

    public b0 j(n object, boolean bl) throws MalformedURLException {
        boolean bl2 = object.isDirectory() || bl;
        S s8 = (S)object;
        Object object2 = s8.j0();
        if (object2 != null && (!bl2 || ((URLConnection)object2).getURL().getPath().endsWith("/"))) {
            return object2;
        }
        if (bl2) {
            object2 = new StringBuilder();
            ((StringBuilder)object2).append(((n)object).E());
            ((StringBuilder)object2).append("/");
            object = this.k(((StringBuilder)object2).toString());
        } else {
            object = this.k(((n)object).E());
        }
        s8.k0((b0)object);
        return object;
    }

    public b0 k(String string) throws MalformedURLException {
        b0 b02 = (b0)this.b.get((Object)string);
        if (b02 != null) {
            return b02;
        }
        b02 = new b0(this.l(string), this.c);
        this.b.put((Object)string, (Object)b02);
        if (string.endsWith("/")) {
            this.b.remove((Object)string.substring(0, string.length() - 1));
            return b02;
        }
        LruCache<String, b0> lruCache = this.b;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append("/");
        lruCache.remove((Object)stringBuilder.toString());
        return b02;
    }

    String l(String string) {
        return Q.z0(this.d, string);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public List<n> n(n arrayList) throws j {
        MalformedURLException malformedURLException2;
        block7: {
            int n8;
            int n9;
            boolean bl;
            b0[] b0Array;
            try {
                b0Array = new b0(this.l(d0.O(((n)((Object)arrayList)).E())), this.c);
                bl = d0.E((n)((Object)arrayList));
                arrayList = new ArrayList<n>();
                b0Array = b0Array.M();
                if (b0Array == null) return arrayList;
                n9 = b0Array.length;
                n8 = 0;
            }
            catch (NullPointerException nullPointerException) {
                throw new j(nullPointerException);
            }
            catch (a0 a02) {
                throw N.a("SMB1 listChildren", a02);
            }
            catch (MalformedURLException malformedURLException2) {
                break block7;
            }
            while (n8 < n9) {
                b0 b02 = b0Array[n8];
                if (!bl || b02.C() == 8) {
                    S s8 = new S(this.a, b02);
                    arrayList.add(s8);
                }
                ++n8;
            }
            return arrayList;
        }
        ax.Ha.c.h().f().d("MARFORMED URL 2").l(malformedURLException2).h();
        throw new j(malformedURLException2);
    }

    public void o(n object, n n8) throws j {
        MalformedURLException malformedURLException2;
        block3: {
            try {
                object = this.j((n)object, false);
                ((b0)object).W(this.j(n8, ((b0)object).G()));
                return;
            }
            catch (a0 a02) {
            }
            catch (MalformedURLException malformedURLException2) {
                break block3;
            }
            a02.printStackTrace();
            throw N.a("SMB1 moveFile", a02);
        }
        malformedURLException2.printStackTrace();
        throw new j(malformedURLException2);
    }

    public void p(n n8, long l8) throws j {
        a0 a022;
        block3: {
            try {
                this.j(n8, false).a0(l8);
                return;
            }
            catch (IOException iOException) {
            }
            catch (a0 a022) {
                break block3;
            }
            throw ax.b3.d.b("SMB1 setLastModified", iOException);
        }
        throw N.a("SMB1 setLastModified", a022);
    }

    public void q(r r8, String string) {
        this.c = r8;
        this.d = string;
    }

    public static class b
    extends InputStream
    implements j.InputStreamRetargetInterface,
    AutoCloseable {
        private long c0;
        private long d0;
        private h0 q;

        public b(h0 h02) throws IOException {
            this.q = h02;
            this.c0 = h02.c();
        }

        public static b a(String object, r r8) throws IOException {
            if (((b0)(object = new b0((String)object, r8, 1))).s()) {
                return new b(new h0((b0)object, "r"));
            }
            throw new FileNotFoundException("SmbFile does not exist");
        }

        private IOException c(a0 iOException) {
            Throwable throwable;
            Throwable throwable2 = throwable = ((a0)iOException).d();
            if (throwable instanceof ax.rb.d) {
                iOException = (ax.rb.d)throwable;
                throwable2 = ((ax.rb.d)iOException).a();
            }
            if (throwable2 instanceof InterruptedException) {
                iOException = new InterruptedIOException(throwable2.getMessage());
                iOException.initCause(throwable2);
            }
            return iOException;
        }

        public int b() {
            return this.q.b();
        }

        @Override
        public void close() {
            try {
                this.q.a();
                return;
            }
            catch (a0 a02) {
                a02.printStackTrace();
                return;
            }
        }

        @Override
        public int read() throws IOException {
            if (this.c0 - this.d0 == 0L) {
                return -1;
            }
            try {
                int n8 = this.q.d();
                this.d0 += (long)n8;
                return n8;
            }
            catch (a0 a02) {
                a02.printStackTrace();
                throw this.c(a02);
            }
        }

        @Override
        public int read(byte[] byArray) throws IOException {
            return this.read(byArray, 0, byArray.length);
        }

        @Override
        public int read(byte[] byArray, int n8, int n9) throws IOException {
            block3: {
                try {
                    if (this.c0 - this.d0 != 0L) break block3;
                    return -1;
                }
                catch (a0 a02) {
                    a02.printStackTrace();
                    throw this.c(a02);
                }
            }
            n8 = this.q.e(byArray, n8, n9);
            this.d0 += (long)n8;
            return n8;
        }

        @Override
        public long skip(long l8) throws IOException {
            this.q.f(this.d0 + l8);
            this.d0 += l8;
            return l8;
        }

        @Override
        public /* synthetic */ long transferTo(OutputStream outputStream) {
            return java.io.DesugarInputStream.transferTo((InputStream)this, (OutputStream)outputStream);
        }
    }
}

