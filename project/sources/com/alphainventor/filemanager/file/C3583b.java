package com.voxdon.xplorer.file;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import ax.Dc.C0670e;
import ax.b0.InterfaceC1440a;
import ax.b3.C1486a;
import ax.b3.C1489d;
import ax.b3.C1495j;
import ax.c3.C1809B;
import ax.c3.C1813a;
import ax.c3.C1835x;
import ax.c3.EnumC1837z;
import ax.c3.d0;
import ax.ca.C1852a;
import ax.oc.C2743a;
import ax.r3.C2947d;
import ax.rc.C3030e;
import ax.s3.C3045a;
import ax.u3.AbstractC3199q;
import ax.u3.C3180B;
import ax.u3.C3184b;
import ax.u3.InterfaceC3185c;
import com.voxdon.xplorer.file.AbstractC3594m;
import com.voxdon.xplorer.file.InterfaceC3584c;
import j$.nio.channels.DesugarChannels;
import j$.util.DesugarCollections;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.logging.Logger;
import okhttp3.HttpUrl;

/* renamed from: com.voxdon.xplorer.file.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3583b extends AbstractC3594m {
    private String h;
    private C3605y i;
    private Uri j;
    private int k;
    private ParcelFileDescriptor l;
    private Closeable m;
    private ax.Dc.T n;
    private boolean o;
    private C1813a p;
    private int r;
    private boolean s;
    private String t;
    private File u;
    private File v;
    private static final Logger x = Logger.getLogger("FileManager.ArchiveFileHelper");
    private static final Set<String> y = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("jpg", "jpeg", "png", "gif", "webp", "heic", "heif", "avif", "mp4", "m4v", "mov", "mkv", "webm", "avi", "3gp", "3g2", "flv", "wmv", "mp3", "m4a", "aac", "ogg", "oga", "opus", "flac", "zip", "7z", "rar", "gz", "bz2", "xz", "tgz", "tbz", "tbz2", "txz", "aab", "jar")));
    private static HashMap<Integer, String> z = new HashMap<>();
    private static HashMap<String, Integer> A = new HashMap<>();
    private Object w = new Object();
    private boolean q = false;

    /* renamed from: com.voxdon.xplorer.file.b$b, reason: collision with other inner class name */
    private class C0521b extends AbstractC3199q<String, Void, Boolean> {
        InterfaceC3584c.a h;
        IOException i;

        C0521b(InterfaceC3584c.a aVar) {
            super(AbstractC3199q.e.CONNECT);
            this.h = aVar;
        }

        private void A(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
            FileChannel convertMaybeLegacyFileChannelFromLibrary;
            Charset x = x(parcelFileDescriptor);
            try {
                C1809B.d0(parcelFileDescriptor, 0L);
                FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptor.getFileDescriptor());
                C3583b.this.m = fileInputStream;
                convertMaybeLegacyFileChannelFromLibrary = DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(fileInputStream.getChannel());
                C3583b.this.n = ax.Dc.T.u0(convertMaybeLegacyFileChannelFromLibrary, x.name());
            } catch (ErrnoException e) {
                throw new IOException("reset parcel file descriptor position error", e);
            }
        }

        private void w() {
            C3583b.this.o = false;
            ax.c3.F.a(C3583b.this.n);
            C3583b.this.n = null;
            ax.c3.F.a(C3583b.this.m);
            C3583b.this.m = null;
            ax.c3.F.a(C3583b.this.l);
            C3583b.this.l = null;
        }

        private Charset x(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
            ParcelFileDescriptor parcelFileDescriptor2 = null;
            try {
                parcelFileDescriptor2 = ParcelFileDescriptor.dup(parcelFileDescriptor.getFileDescriptor());
                return C0670e.b(parcelFileDescriptor2.getFileDescriptor());
            } finally {
                ax.c3.F.a(parcelFileDescriptor2);
            }
        }

        @Override // ax.u3.AbstractC3199q
        protected void r() {
            InterfaceC3584c.a aVar = this.h;
            if (aVar != null) {
                aVar.B();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: y, reason: merged with bridge method [inline-methods] */
        public Boolean g(String... strArr) {
            try {
                if (C3583b.this.k != 0) {
                    if (C3583b.this.l == null) {
                        throw new IOException("parcel file descriptor not created from fd");
                    }
                    A(C3583b.this.l);
                } else {
                    if (C3583b.this.i == null) {
                        return Boolean.FALSE;
                    }
                    if (C3583b.this.i.k0()) {
                        try {
                            C3583b c3583b = C3583b.this;
                            c3583b.l = c3583b.i.e0(true);
                            A(C3583b.this.l);
                        } catch (C1495j e) {
                            throw new IOException("get parcel file descriptor error", e);
                        }
                    } else {
                        Charset a = C0670e.a(C3583b.this.i.F0());
                        C3583b c3583b2 = C3583b.this;
                        c3583b2.n = ax.Dc.T.s0(c3583b2.i.F0(), a.name());
                    }
                }
                C3583b c3583b3 = C3583b.this;
                c3583b3.u = c3583b3.R0();
                try {
                    C3583b c3583b4 = C3583b.this;
                    c3583b4.s = C3583b.d1(c3583b4.n, null);
                } catch (C1486a unused) {
                }
                C3583b c3583b5 = C3583b.this;
                c3583b5.F0(c3583b5.n);
                C3583b c3583b6 = C3583b.this;
                c3583b6.v = C3583b.U0(c3583b6.p(), C3583b.this.u(), C3583b.this.t());
                if (C3583b.this.v != null) {
                    C3583b.this.v.mkdirs();
                }
                C3583b.this.o = true;
                return Boolean.TRUE;
            } catch (IOException e2) {
                this.i = e2;
                w();
                return Boolean.FALSE;
            } catch (ArrayIndexOutOfBoundsException e3) {
                this.i = new IOException(e3);
                w();
                return Boolean.FALSE;
            } catch (IllegalArgumentException e4) {
                this.i = new IOException(e4);
                w();
                return Boolean.FALSE;
            } catch (RuntimeException e5) {
                this.i = new IOException(e5);
                w();
                return Boolean.FALSE;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: z, reason: merged with bridge method [inline-methods] */
        public void q(Boolean bool) {
            InterfaceC3584c.a aVar = this.h;
            if (aVar != null) {
                aVar.T(bool.booleanValue(), this.i);
            }
        }
    }

    /* renamed from: com.voxdon.xplorer.file.b$c */
    static class c extends AbstractC3199q<Long, Integer, Boolean> {
        Context h;
        ax.c3.K i;
        ax.Dc.S j;
        C3605y k;
        File l;
        File m;
        int n;
        Closeable o;
        ParcelFileDescriptor p;

        public c(Context context, ax.c3.K k, ParcelFileDescriptor parcelFileDescriptor, Closeable closeable, C3605y c3605y, ax.Dc.S s, File file, File file2, int i) {
            super(AbstractC3199q.e.NORMAL);
            this.h = context;
            this.i = k;
            this.p = parcelFileDescriptor;
            this.o = closeable;
            this.k = c3605y;
            this.j = s;
            this.l = file;
            this.m = file2;
            this.n = i;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public Boolean g(Long... lArr) {
            C2947d.i(this.h, this.i);
            C3583b.E0(this.m);
            try {
                ax.Dc.S s = this.j;
                if (s != null) {
                    s.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            C3583b.I0(this.l);
            Closeable closeable = this.o;
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (IOException unused) {
                }
            }
            ParcelFileDescriptor parcelFileDescriptor = this.p;
            if (parcelFileDescriptor != null) {
                try {
                    parcelFileDescriptor.close();
                } catch (IOException unused2) {
                }
            }
            C3605y c3605y = this.k;
            if (c3605y != null && this.n == 2) {
                C3596o f = C1835x.f(c3605y.F0());
                try {
                    f.P(this.k);
                    f.P(f.z(this.k.T()));
                } catch (C1495j unused3) {
                }
            }
            return Boolean.TRUE;
        }
    }

    /* renamed from: com.voxdon.xplorer.file.b$d */
    private static class d extends ax.Dc.I {
        public d(String str) {
            super(str);
        }
    }

    /* renamed from: com.voxdon.xplorer.file.b$e */
    public enum e {
        SUCCESS,
        WRONG_PASSWORD,
        ERROR
    }

    /* renamed from: com.voxdon.xplorer.file.b$f */
    private class f extends AbstractC3199q<String, Void, e> {
        private String h;
        private InterfaceC1440a<e> i;

        f(String str, InterfaceC1440a<e> interfaceC1440a) {
            super(AbstractC3199q.e.HIGHER);
            this.h = str;
            this.i = interfaceC1440a;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public e g(String... strArr) {
            Enumeration<ax.Dc.I> f = C3583b.this.n.f();
            while (f.hasMoreElements()) {
                ax.Dc.I nextElement = f.nextElement();
                if (nextElement.o().l()) {
                    InputStream inputStream = null;
                    try {
                        inputStream = C3583b.Q0(C3583b.this.n, nextElement, this.h);
                        e eVar = e.SUCCESS;
                        ax.c3.F.a(inputStream);
                        return eVar;
                    } catch (C1495j | IOException unused) {
                        ax.c3.F.a(inputStream);
                    } catch (C2743a e) {
                        try {
                            if (e.a() == C2743a.EnumC0408a.WRONG_PASSWORD) {
                                e eVar2 = e.WRONG_PASSWORD;
                                ax.c3.F.a(inputStream);
                                return eVar2;
                            }
                            ax.c3.F.a(inputStream);
                        } catch (Throwable th) {
                            ax.c3.F.a(inputStream);
                            throw th;
                        }
                    }
                }
            }
            return e.WRONG_PASSWORD;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        public void q(e eVar) {
            this.i.accept(eVar);
        }
    }

    private void C0(C1813a c1813a, ax.Dc.I i, ax.Dc.I i2) throws IOException {
        long crc;
        long p = c1813a.p();
        if (p1(c1813a, p)) {
            if (i instanceof d) {
                File L0 = L0(c1813a);
                if (!L0.exists() || L0.isDirectory()) {
                    return;
                } else {
                    crc = C1809B.c(L0);
                }
            } else {
                crc = i.getCrc();
                if (crc < 0) {
                    return;
                }
            }
            i2.setMethod(0);
            i2.setSize(p);
            i2.setCompressedSize(p);
            i2.setCrc(crc);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void E0(File file) {
        if (file != null && file.exists()) {
            if (!file.isDirectory()) {
                file.delete();
                return;
            }
            String[] list = file.list();
            if (list == null || list.length != 0) {
                return;
            }
            I0(file);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F0(ax.Dc.S s) {
        String str;
        Enumeration<ax.Dc.I> enumeration;
        String str2;
        Enumeration<ax.Dc.I> enumeration2;
        String str3;
        Enumeration<ax.Dc.I> enumeration3;
        Enumeration<ax.Dc.I> enumeration4;
        this.p = new C1813a(this, H0("/"), null);
        Enumeration<ax.Dc.I> f2 = s.f();
        while (true) {
            str = "//";
            if (!f2.hasMoreElements()) {
                break;
            }
            ax.Dc.I nextElement = f2.nextElement();
            if (nextElement.isDirectory()) {
                String name = nextElement.getName();
                String[] split = name.split(File.separator);
                C1813a c1813a = this.p;
                StringBuilder sb = new StringBuilder();
                int i = 0;
                while (i < split.length - 1) {
                    if (TextUtils.isEmpty(split[i])) {
                        ax.Ha.b d2 = ax.Ha.c.h().f().d("ARCHIVE INVALID SEGMENT 1");
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Entry:");
                        enumeration4 = f2;
                        sb2.append(nextElement.getName());
                        sb2.append(",Length:");
                        sb2.append(nextElement.getName().length());
                        d2.g(sb2.toString()).h();
                    } else {
                        enumeration4 = f2;
                        sb.append(split[i]);
                        sb.append(File.separator);
                        C1813a h0 = c1813a.h0(split[i]);
                        if (h0 == null) {
                            h0 = new C1813a(this, H0(sb.toString()), c1813a);
                            c1813a.e0(h0);
                        }
                        c1813a = h0;
                    }
                    i++;
                    f2 = enumeration4;
                }
                enumeration3 = f2;
                if (!name.endsWith("//") && !name.endsWith("///")) {
                    C1813a c1813a2 = new C1813a(this, nextElement, c1813a);
                    if (!TextUtils.isEmpty(c1813a2.k0())) {
                        c1813a.e0(c1813a2);
                    } else if (!"/".equals(name)) {
                        ax.Q2.d.c("archivefileinfo name", new Exception("Invalid entry:" + name));
                    }
                }
            } else {
                enumeration3 = f2;
            }
            f2 = enumeration3;
        }
        Enumeration<ax.Dc.I> f3 = s.f();
        while (f3.hasMoreElements()) {
            ax.Dc.I nextElement2 = f3.nextElement();
            if (nextElement2.isDirectory()) {
                enumeration = f3;
                str2 = str;
            } else {
                String name2 = nextElement2.getName();
                String[] split2 = name2.split(File.separator);
                C1813a c1813a3 = this.p;
                StringBuilder sb3 = new StringBuilder();
                int i2 = 0;
                while (i2 < split2.length - 1) {
                    if (TextUtils.isEmpty(split2[i2])) {
                        ax.Ha.c.h().f().d("ARCHIVE INVALID SEGMENT 2").g("Entry:" + name2 + ",Length:" + name2.length()).h();
                        enumeration2 = f3;
                        str3 = str;
                    } else {
                        sb3.append(split2[i2]);
                        sb3.append(File.separator);
                        C1813a h02 = c1813a3.h0(split2[i2]);
                        if (h02 == null) {
                            String sb4 = sb3.toString();
                            if (sb4.endsWith(str)) {
                                ax.Ha.b d3 = ax.Ha.c.h().f().d("ARCHIVE ENTRY ERROR");
                                StringBuilder sb5 = new StringBuilder();
                                sb5.append("Entry:");
                                sb5.append(name2);
                                enumeration2 = f3;
                                sb5.append(",");
                                str3 = str;
                                sb5.append(name2.length());
                                sb5.append(",");
                                sb5.append(sb4);
                                d3.g(sb5.toString()).h();
                            } else {
                                enumeration2 = f3;
                                str3 = str;
                            }
                            C1813a c1813a4 = new C1813a(this, H0(sb4), c1813a3);
                            c1813a3.e0(c1813a4);
                            h02 = c1813a4;
                        } else {
                            enumeration2 = f3;
                            str3 = str;
                        }
                        c1813a3 = h02;
                    }
                    i2++;
                    f3 = enumeration2;
                    str = str3;
                }
                enumeration = f3;
                str2 = str;
                C1813a c1813a5 = new C1813a(this, nextElement2, c1813a3);
                if (TextUtils.isEmpty(c1813a5.k0())) {
                    ax.Q2.d.c("archivefileinfo name", new Exception("Invalid entry:" + name2));
                } else {
                    c1813a3.e0(c1813a5);
                }
            }
            f3 = enumeration;
            str = str2;
        }
    }

    private int G0(C1813a c1813a) {
        if (!c1813a.isDirectory()) {
            return 1;
        }
        Stack stack = new Stack();
        stack.push(c1813a);
        int i = 0;
        while (!stack.isEmpty()) {
            C1813a c1813a2 = (C1813a) stack.pop();
            if (c1813a2.isDirectory()) {
                for (C1813a c1813a3 : c1813a2.i0()) {
                    if (c1813a3 == null) {
                        ax.Q2.d.c("null archive child", new Exception("archive child null"));
                    } else if (c1813a3.isDirectory()) {
                        stack.push(c1813a3);
                    } else {
                        i++;
                    }
                }
            }
        }
        return i;
    }

    private ax.Dc.I H0(String str) {
        return new d(str);
    }

    public static boolean I0(File file) {
        String[] list;
        if (file == null || !file.exists()) {
            return false;
        }
        if (file.isDirectory() && (list = file.list()) != null) {
            for (String str : list) {
                if (!I0(new File(file, str))) {
                    return false;
                }
            }
        }
        return file.delete();
    }

    private void J0(C1813a c1813a) {
        File L0 = L0(c1813a);
        if (L0.exists()) {
            if (L0.isDirectory()) {
                I0(L0);
            } else {
                L0.delete();
            }
        }
    }

    public static synchronized int M0(Uri uri) {
        synchronized (C3583b.class) {
            if (uri == null) {
                C3184b.f();
                return 0;
            }
            String uri2 = uri.toString();
            Integer num = A.get(uri2);
            if (num != null) {
                return num.intValue();
            }
            Integer valueOf = Integer.valueOf(Math.abs(uri2.hashCode()));
            while (z.containsKey(valueOf)) {
                valueOf = Integer.valueOf(valueOf.intValue() + 1);
            }
            A.put(uri2, valueOf);
            z.put(valueOf, uri2);
            return valueOf.intValue();
        }
    }

    public static synchronized Uri P0(ax.c3.K k) {
        synchronized (C3583b.class) {
            try {
                String str = z.get(Integer.valueOf(k.b()));
                if (str != null) {
                    return Uri.parse(str);
                }
            } catch (Exception unused) {
            }
            return null;
        }
    }

    public static InputStream Q0(ax.Dc.T t, ax.Dc.I i, String str) throws IOException, C1495j {
        ax.qc.h hVar = new ax.qc.h(t.A0(i), str.toCharArray());
        C3030e c3030e = new C3030e();
        c3030e.u(i.getCrc());
        c3030e.w(i.isDirectory());
        c3030e.s(i.getCompressedSize());
        c3030e.G(i.getSize());
        if (hVar.g(c3030e, false) != null) {
            return hVar;
        }
        throw new ax.b3.F("Could not locate local file header for encrypted entry");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public File R0() {
        if (this.h == null) {
            return null;
        }
        return new File(ax.Z2.a.m(p(), "archive-edit"), this.h.replace(".", "_") + System.currentTimeMillis());
    }

    private File S0(AbstractC3595n abstractC3595n, boolean z2) {
        File file = this.u;
        if (z2 && !file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file, abstractC3595n.E());
        File parentFile = file2.getParentFile();
        if (z2 && parentFile != null && !parentFile.exists()) {
            parentFile.mkdirs();
        }
        return file2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static File U0(Context context, ax.Q2.f fVar, int i) {
        return ax.Z2.a.i(context, fVar, i);
    }

    private C1813a X0(String str) {
        String[] split = str.split(File.separator);
        if (split == null) {
            return null;
        }
        C1813a c1813a = this.p;
        for (int i = 0; i < split.length - 1; i++) {
            String str2 = split[i];
            if (str2 != null && str2.length() != 0 && (c1813a = c1813a.h0(str2)) == null) {
                return null;
            }
        }
        return c1813a;
    }

    private InputStream Z0(C1813a c1813a) {
        Bitmap i = C3180B.i(s(c1813a), 512);
        if (i == null) {
            i = C3045a.b();
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(32768);
        i.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream);
        return new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
    }

    private InputStream a1(ax.Dc.I i) throws IOException, C1495j {
        return (!this.s || TextUtils.isEmpty(this.t)) ? this.n.j(i) : Q0(this.n, i, this.t);
    }

    public static boolean d1(ax.Dc.S s, InterfaceC3185c interfaceC3185c) throws C1486a {
        Enumeration<ax.Dc.I> f2 = s.f();
        while (f2.hasMoreElements()) {
            if (interfaceC3185c != null && interfaceC3185c.isCancelled()) {
                throw new C1486a();
            }
            if (f2.nextElement().o().l()) {
                return true;
            }
        }
        return false;
    }

    public static String g1(String str, boolean z2) {
        String str2 = File.separator;
        if (str.startsWith(str2)) {
            str = str.substring(1);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        if (!z2) {
            str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        sb.append(str2);
        return sb.toString();
    }

    private boolean h1(File file, File file2) throws C1495j {
        if (!file.exists()) {
            return false;
        }
        if (file2.exists() && !I0(file2)) {
            throw new C1495j("Could not delete stale edit copy");
        }
        if (file.renameTo(file2)) {
            return true;
        }
        throw new C1495j("Could not move archive edit copy");
    }

    private void i1(C1813a c1813a) {
        List<C1813a> i0;
        File L0 = L0(c1813a);
        if (L0.exists()) {
            c1813a.o0(L0);
        }
        if (!c1813a.isDirectory() || (i0 = c1813a.i0()) == null) {
            return;
        }
        Iterator<C1813a> it = i0.iterator();
        while (it.hasNext()) {
            i1(it.next());
        }
    }

    private boolean j1(C3596o c3596o, AbstractC3595n abstractC3595n, AbstractC3595n abstractC3595n2, File file) throws C1495j {
        AbstractC3595n z2 = c3596o.z(file.getAbsolutePath());
        try {
            if (z2.n()) {
                c3596o.P(z2);
                z2 = c3596o.z(file.getAbsolutePath());
            }
            c3596o.m0(abstractC3595n, z2, null, null);
        } catch (C1486a | C1495j unused) {
        }
        try {
            c3596o.m0(c3596o.z(abstractC3595n2.E()), c3596o.z(abstractC3595n.E()), null, null);
            AbstractC3595n z3 = c3596o.z(file.getAbsolutePath());
            if (z3.n()) {
                c3596o.P(z3);
            }
            this.q = false;
            return true;
        } catch (C1486a | C1495j unused2) {
            k1(c3596o, abstractC3595n, file);
            return false;
        }
    }

    private void k1(C3596o c3596o, AbstractC3595n abstractC3595n, File file) throws C1495j {
        AbstractC3595n z2 = c3596o.z(file.getAbsolutePath());
        if (z2.n() && !c3596o.z(abstractC3595n.E()).n()) {
            try {
                c3596o.m0(z2, c3596o.z(abstractC3595n.E()), null, null);
            } catch (C1486a e2) {
                throw new C1495j(e2);
            }
        }
    }

    public static void o1(ax.Dc.I i, long j) {
        ax.Dc.D d2 = new ax.Dc.D();
        d2.s(new ax.Dc.U(j / 1000));
        i.d(d2);
    }

    public static boolean p1(AbstractC3595n abstractC3595n, long j) {
        if (j == -1) {
            return false;
        }
        return y.contains(abstractC3595n.A());
    }

    private static void q1(InputStream inputStream, long j) throws IOException {
        while (j > 0) {
            long skip = inputStream.skip(j);
            if (skip > 0) {
                j -= skip;
            } else if (inputStream.read() < 0) {
                return;
            } else {
                j--;
            }
        }
    }

    private void t1(C1813a c1813a, ax.Dc.J j, Integer[] numArr, ax.g3.i iVar) throws C1495j {
        if (c1813a == null) {
            throw new C1495j("fileinfo == null");
        }
        ax.Dc.I l0 = c1813a.l0();
        if (l0 == null) {
            throw new C1495j("zipEntry == null");
        }
        boolean z2 = false;
        InputStream inputStream = null;
        try {
            try {
                ax.Dc.I H0 = H0(c1813a.t());
                if (c1813a.q() >= 0) {
                    H0.setTime(c1813a.q());
                    o1(H0, c1813a.q());
                }
                if (!c1813a.isDirectory()) {
                    C0(c1813a, l0, H0);
                }
                j.u0(H0);
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e2) {
            e = e2;
        } catch (ArrayIndexOutOfBoundsException e3) {
            e = e3;
        }
        try {
            if (!c1813a.isDirectory()) {
                if (l0 instanceof d) {
                    File L0 = L0(c1813a);
                    if (!L0.exists()) {
                        C3184b.e("Edit copy does not exist");
                        throw new ax.b3.t("Archive entry input edit copy does not exist");
                    }
                    inputStream = new FileInputStream(L0);
                } else {
                    inputStream = a1(l0);
                    if (inputStream == null) {
                        throw new ax.b3.t("Archive entry input stream is null");
                    }
                }
                ax.c3.F.b(inputStream, j);
                if (iVar != null) {
                    int intValue = numArr[0].intValue() + 1;
                    numArr[0] = Integer.valueOf(intValue);
                    iVar.a(intValue, numArr[1].intValue());
                }
            }
            j.d();
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused) {
                }
            }
            if (c1813a.isDirectory()) {
                Iterator<C1813a> it = c1813a.i0().iterator();
                while (it.hasNext()) {
                    t1(it.next(), j, numArr, iVar);
                }
            }
        } catch (IOException e4) {
            e = e4;
            e.printStackTrace();
            throw C1489d.a("write entry error", e);
        } catch (ArrayIndexOutOfBoundsException e5) {
            e = e5;
            ax.Ha.c.h().d("AFWE:").g(l0.getSize() + ":" + l0.getName()).h();
            throw new C1495j(e);
        } catch (Throwable th2) {
            th = th2;
            z2 = true;
            if (0 != 0) {
                try {
                    inputStream.close();
                } catch (IOException unused2) {
                }
            }
            if (!z2) {
                throw th;
            }
            try {
                j.d();
                throw th;
            } catch (IOException unused3) {
                throw th;
            }
        }
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public InputStream A(String str, String str2, String str3) {
        C1813a c1813a;
        EnumC1837z G;
        try {
            c1813a = (C1813a) z(str2);
            G = c1813a.G();
        } catch (C1495j unused) {
        }
        if (EnumC1837z.IMAGE == G) {
            return new C1852a(new BufferedInputStream(J(c1813a, 0L), 32768), (int) c1813a.p());
        }
        if (EnumC1837z.VIDEO != G) {
            C3184b.f();
            return null;
        }
        if (ax.X2.Q.e1()) {
            return Z0(c1813a);
        }
        return null;
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public boolean B(AbstractC3595n abstractC3595n) {
        return true;
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public List<AbstractC3595n> C(AbstractC3595n abstractC3595n, AbstractC3594m.f fVar) throws C1495j {
        if (!abstractC3595n.n()) {
            throw new ax.b3.t();
        }
        if (abstractC3595n.isDirectory()) {
            return ((C1813a) abstractC3595n).j0();
        }
        throw new C1495j("file is not directory");
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0150 A[Catch: IOException -> 0x014b, TRY_LEAVE, TryCatch #11 {IOException -> 0x014b, blocks: (B:68:0x0147, B:59:0x0150), top: B:67:0x0147 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0147 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void D(com.voxdon.xplorer.file.AbstractC3595n r11, ax.c3.G r12, java.lang.String r13, long r14, java.lang.Long r16, com.voxdon.xplorer.file.C3597p r17, boolean r18, ax.u3.InterfaceC3185c r19, ax.g3.i r20) throws ax.b3.C1495j, ax.b3.C1486a {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.voxdon.xplorer.file.C3583b.D(com.voxdon.xplorer.file.n, ax.c3.G, java.lang.String, long, java.lang.Long, com.voxdon.xplorer.file.p, boolean, ax.u3.c, ax.g3.i):void");
    }

    public boolean D0() {
        if (this.s) {
            return false;
        }
        int i = this.r;
        if (i == 1) {
            C3605y c3605y = this.i;
            if (c3605y != null) {
                return c3605y.j();
            }
            return false;
        }
        if (i != 2 && i != 3) {
            C3184b.g("type:" + this.r + ",uri:" + this.j);
        }
        return false;
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public void E(AbstractC3595n abstractC3595n, AbstractC3595n abstractC3595n2, InterfaceC3185c interfaceC3185c, ax.g3.i iVar) throws C1495j {
        if (!D0()) {
            throw new C1495j("zip file is not writeable");
        }
        C3184b.a(abstractC3595n2.n());
        if (!abstractC3595n.n()) {
            throw new ax.b3.t();
        }
        long p = abstractC3595n.p();
        C1813a c1813a = (C1813a) z(abstractC3595n.E());
        File L0 = L0(c1813a);
        C1813a c1813a2 = (C1813a) abstractC3595n2;
        File Y0 = Y0(c1813a2);
        C1813a X0 = X0(abstractC3595n.E());
        C1813a X02 = X0(abstractC3595n2.E());
        if (X02 == null) {
            throw new C1495j("Target parent does not exist");
        }
        if (X0 == null) {
            throw new C1495j("Source parent does not exist");
        }
        if (abstractC3595n.isDirectory()) {
            c1813a2.n0();
        }
        if (!c1813a.n()) {
            C3184b.g("no zip entry source");
            throw new ax.b3.t("Source file entry is null");
        }
        try {
            boolean h1 = h1(L0, Y0);
            X0.m0(c1813a);
            C1813a c1813a3 = new C1813a(this, X02, c1813a.l0(), c1813a.i0(), abstractC3595n2.B());
            c1813a3.q0();
            if (h1) {
                i1(c1813a3);
            }
            X02.e0(c1813a3);
            this.q = true;
            if (iVar != null) {
                iVar.a(p, p);
            }
        } catch (IllegalArgumentException e2) {
            ax.Ha.c.h().f().b("ARCHIVE FILE NO NAME").g("dst:" + c1813a2.k0()).l(e2).h();
            throw e2;
        }
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public void F(AbstractC3595n abstractC3595n, AbstractC3595n abstractC3595n2, InterfaceC3185c interfaceC3185c, ax.g3.i iVar) throws C1495j, C1486a {
        D(abstractC3595n2, s(abstractC3595n), abstractC3595n.s(), abstractC3595n.p(), Long.valueOf(abstractC3595n.q()), abstractC3595n.D(), false, interfaceC3185c, iVar);
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public int G(String str, String str2) {
        return -1;
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public String H(AbstractC3595n abstractC3595n) {
        EnumC1837z G = abstractC3595n.G();
        if (EnumC1837z.IMAGE == G || EnumC1837z.VIDEO == G) {
            return C1809B.Y(abstractC3595n);
        }
        return null;
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public void I(AbstractC3595n abstractC3595n) throws C1495j {
        if (!D0()) {
            throw new C1495j("zip file is not writeable");
        }
        if (d0.E(abstractC3595n)) {
            throw new C1495j("Could not delete root");
        }
        String[] split = abstractC3595n.t().split(File.separator);
        if (split != null) {
            C1813a c1813a = this.p;
            C1813a c1813a2 = c1813a;
            for (String str : split) {
                if (str.length() != 0) {
                    if (c1813a == null) {
                        throw new ax.b3.t("Can not found fileinfo");
                    }
                    c1813a2 = c1813a;
                    c1813a = c1813a.h0(str);
                }
            }
            if (c1813a != null) {
                c1813a2.m0(c1813a);
                J0(c1813a);
                this.q = true;
                return;
            }
        }
        throw new ax.b3.t("Could not delete...");
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public InputStream J(AbstractC3595n abstractC3595n, long j) throws C1495j {
        ax.Dc.I i = null;
        try {
            ax.Dc.I l0 = ((C1813a) abstractC3595n).l0();
            if (l0 == null) {
                throw new ax.b3.t("Zip entry is null");
            }
            File L0 = L0(abstractC3595n);
            if (L0.exists()) {
                FileInputStream fileInputStream = new FileInputStream(L0);
                if (j == 0) {
                    return fileInputStream;
                }
                q1(fileInputStream, j);
                return fileInputStream;
            }
            InputStream a1 = a1(l0);
            if (a1 == null) {
                throw new IOException("ZipFile getInputStream == null");
            }
            a aVar = new a(a1);
            if (j != 0) {
                q1(aVar, j);
            }
            return aVar;
        } catch (IOException e2) {
            throw C1489d.a("archive getinputstream", e2);
        } catch (ArrayIndexOutOfBoundsException unused) {
            ax.Ha.c.h().d("AFGIS").g(i.getSize() + ":" + i.getName()).h();
            throw new C1495j("Zip entry read error");
        }
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public synchronized void K(Activity activity, Fragment fragment, InterfaceC3584c.a aVar) {
        if (this.k == 0 && this.i == null) {
            ax.Ha.c.h().f().b("ArchiveFileHelper invalid auth").j().h();
        }
        try {
            new C0521b(aVar).i(new String[0]);
        } catch (Exception unused) {
        }
    }

    public AbstractC3199q K0() {
        this.o = false;
        return new c(p(), v(), this.l, this.m, this.i, this.n, this.u, this.v, this.r).i(new Long[0]);
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public boolean L() {
        return false;
    }

    public File L0(AbstractC3595n abstractC3595n) {
        return S0(abstractC3595n, false);
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public boolean M(AbstractC3595n abstractC3595n) {
        if (!D0()) {
            return false;
        }
        C1813a X0 = X0(abstractC3595n.E());
        String B = abstractC3595n.B();
        if (X0 == null || !X0.n() || X0.h0(B) != null) {
            return false;
        }
        C1813a c1813a = new C1813a(this, H0(g1(abstractC3595n.E(), true)), X0);
        File Y0 = Y0(c1813a);
        if (Y0.exists() && !Y0.isDirectory() && !Y0.delete()) {
            return false;
        }
        if (!Y0.exists() && !Y0.mkdirs()) {
            return false;
        }
        c1813a.o0(Y0);
        X0.e0(c1813a);
        this.q = true;
        return true;
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public boolean N(AbstractC3595n abstractC3595n) {
        if (!D0()) {
            return false;
        }
        C1813a X0 = X0(abstractC3595n.E());
        String B = abstractC3595n.B();
        if (X0 != null && X0.n() && X0.h0(B) == null) {
            try {
                C1813a c1813a = new C1813a(this, H0(g1(abstractC3595n.E(), false)), X0);
                File Y0 = Y0(c1813a);
                if (Y0.exists() && !Y0.delete()) {
                    throw new IOException("Could not delete stale edit copy");
                }
                new FileOutputStream(Y0, false).close();
                c1813a.o0(Y0);
                X0.e0(c1813a);
                this.q = true;
                return true;
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
        return false;
    }

    public int N0() {
        return this.r;
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public boolean O() {
        return true;
    }

    public Uri O0() {
        return this.j;
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public void P(AbstractC3595n abstractC3595n) throws C1495j {
        I(abstractC3595n);
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public boolean Q(AbstractC3595n abstractC3595n, AbstractC3595n abstractC3595n2) {
        return true;
    }

    public int T0() {
        return this.k;
    }

    public C3605y V0() {
        return this.i;
    }

    public String W0() {
        return this.h;
    }

    public File Y0(AbstractC3595n abstractC3595n) {
        return S0(abstractC3595n, true);
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public boolean a() {
        return this.n != null && this.o;
    }

    @Override // com.voxdon.xplorer.file.AbstractC3594m
    public boolean a0(AbstractC3595n abstractC3595n) {
        return D0();
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public synchronized void b() {
        C1835x.h(u(), t());
        K0();
    }

    public boolean b1() {
        return this.q;
    }

    public boolean c1() {
        return this.s;
    }

    public boolean e1() {
        return (this.r == 0 || this.j == null) ? false : true;
    }

    public boolean f1() {
        return !TextUtils.isEmpty(this.t);
    }

    public void l1(Uri uri, C3605y c3605y, int i) {
        this.j = uri;
        this.r = i;
        this.i = c3605y;
        this.h = c3605y.B();
    }

    public void m1(Uri uri, String str, int i, int i2) {
        this.j = uri;
        this.r = i2;
        this.h = str;
        this.k = i;
        try {
            this.l = ParcelFileDescriptor.fromFd(i);
        } catch (IOException unused) {
        }
    }

    public void n1(String str) {
        this.t = str;
    }

    public void r1(String str, InterfaceC1440a<e> interfaceC1440a) {
        new f(str, interfaceC1440a).i(new String[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean s1(ax.g3.i r19) throws ax.b3.C1495j {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.voxdon.xplorer.file.C3583b.s1(ax.g3.i):boolean");
    }

    @Override // com.voxdon.xplorer.file.InterfaceC3584c
    public AbstractC3595n z(String str) throws C1495j {
        if (this.p == null) {
            throw new C1495j("no root");
        }
        String[] split = str.split(File.separator);
        C1813a c1813a = this.p;
        for (int i = 0; i < split.length; i++) {
            String str2 = split[i];
            if (str2 != null && !HttpUrl.FRAGMENT_ENCODE_SET.equals(str2)) {
                if (c1813a == null) {
                    ax.Ha.c.h().d("ARFI").j().h();
                }
                c1813a = c1813a.h0(split[i]);
                if (c1813a == null) {
                    return new C1813a(this, str);
                }
            }
        }
        return c1813a;
    }

    /* renamed from: com.voxdon.xplorer.file.b$a */
    class a extends ax.c3.H {
        a(InputStream inputStream) {
            super(inputStream);
        }

        @Override // ax.c3.H, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            synchronized (C3583b.this.w) {
                super.close();
            }
        }

        @Override // ax.c3.H, java.io.InputStream
        public int read() throws IOException {
            int read;
            synchronized (C3583b.this.w) {
                read = super.read();
            }
            return read;
        }

        @Override // ax.c3.H, java.io.InputStream
        public synchronized void reset() throws IOException {
            synchronized (C3583b.this.w) {
                super.reset();
            }
        }

        @Override // ax.c3.H, java.io.InputStream
        public long skip(long j) throws IOException {
            int read;
            long j2;
            if (j <= 0) {
                return 0L;
            }
            int min = (int) Math.min(2048, j);
            byte[] bArr = new byte[min];
            long j3 = j;
            while (j3 > 0 && (read = read(bArr, 0, (int) Math.min(min, j3))) >= 0) {
                if (read != 0) {
                    j2 = read;
                } else {
                    if (read() < 0) {
                        break;
                    }
                    j2 = 1;
                }
                j3 -= j2;
            }
            return j - j3;
        }

        @Override // ax.c3.H, java.io.InputStream
        public int read(byte[] bArr) throws IOException {
            int read;
            synchronized (C3583b.this.w) {
                read = super.read(bArr);
            }
            return read;
        }

        @Override // ax.c3.H, java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            int read;
            synchronized (C3583b.this.w) {
                read = super.read(bArr, i, i2);
            }
            return read;
        }
    }

    @Override // com.voxdon.xplorer.file.AbstractC3594m
    void m(AbstractC3595n abstractC3595n, String str, boolean z2, boolean z3, ax.g3.h hVar, InterfaceC3185c interfaceC3185c) {
    }
}
