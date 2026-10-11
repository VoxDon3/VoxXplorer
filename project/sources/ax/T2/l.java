package ax.T2;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import ax.b3.C1486a;
import ax.b3.C1495j;
import ax.c3.C1835x;
import ax.c3.F;
import ax.c3.K;
import ax.u3.C3186d;
import ax.u3.InterfaceC3185c;
import com.voxdon.xplorer.file.A;
import com.voxdon.xplorer.file.AbstractC3595n;
import com.voxdon.xplorer.file.C3596o;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class l {
    private HashMap<String, b> a = new HashMap<>();
    private Context b;
    private K c;
    private a d;

    public interface a {
        void a(String str);
    }

    public static class b {
        String a;
        long b;
        long c;
        public String d;
        public String e;
        public String f;
        public boolean g;

        b(String str, long j, long j2, String str2, String str3, String str4) {
            this.a = str;
            this.b = j;
            this.c = j2;
            this.d = str2;
            this.e = str3;
            this.f = str4;
        }
    }

    l(Context context, K k, a aVar) {
        this.c = k;
        this.b = context;
        this.d = aVar;
    }

    private static File c(Context context, K k) throws IOException {
        File q = ax.Q2.e.q(context);
        String str = "duplicate_hash_" + k.d().I() + "#" + k.b();
        if (q != null) {
            return new File(q.getAbsolutePath(), str);
        }
        throw new IOException("cannot get index file");
    }

    private static File d(Context context, K k) throws IOException {
        File q = ax.Q2.e.q(context);
        String str = "duplicate_hash_" + k.d().I() + ":" + k.b();
        if (q != null) {
            return new File(q.getAbsolutePath(), str);
        }
        throw new IOException("cannot get index file");
    }

    private void f(String str) {
        try {
            String[] split = str.split("\u0000");
            String decode = Uri.decode(split[0]);
            this.a.put(decode, new b(decode, Long.parseLong(split[1]), Long.parseLong(split[2]), split[3], split[4], split[5]));
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    private void i(BufferedWriter bufferedWriter, b bVar) throws IOException {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(Uri.encode(bVar.a));
        stringBuffer.append("\u0000");
        stringBuffer.append(String.valueOf(bVar.b));
        stringBuffer.append("\u0000");
        stringBuffer.append(String.valueOf(bVar.c));
        stringBuffer.append("\u0000");
        String str = bVar.d;
        if (str != null) {
            stringBuffer.append(str);
        }
        stringBuffer.append("\u0000");
        String str2 = bVar.e;
        if (str2 != null) {
            stringBuffer.append(str2);
        }
        stringBuffer.append("\u0000");
        String str3 = bVar.f;
        if (str3 != null) {
            stringBuffer.append(str3);
        }
        stringBuffer.append("\u0000");
        stringBuffer.append("#");
        stringBuffer.append("\n");
        bufferedWriter.write(stringBuffer.toString());
    }

    public boolean a(A a2, A a3, InterfaceC3185c interfaceC3185c) throws C1486a {
        String str;
        String str2;
        String str3;
        String str4;
        if (!".folderimage".equals(a2.b()) && !".folderimage".equals(a3.b())) {
            b b2 = b(a2);
            b b3 = b(a3);
            if (interfaceC3185c != null && interfaceC3185c.isCancelled()) {
                throw new C1486a();
            }
            if (b2 == null || b3 == null || (str = b2.d) == null || (str2 = b3.d) == null || !str.equals(str2)) {
                return false;
            }
            if (interfaceC3185c != null && interfaceC3185c.isCancelled()) {
                throw new C1486a();
            }
            if (TextUtils.isEmpty(b2.e)) {
                h(b2, 2);
            }
            if (interfaceC3185c != null && interfaceC3185c.isCancelled()) {
                throw new C1486a();
            }
            if (TextUtils.isEmpty(b3.e)) {
                h(b3, 2);
            }
            String str5 = b2.e;
            if (str5 == null || (str3 = b3.e) == null || !str5.equals(str3)) {
                return false;
            }
            if (b2.c == b3.c) {
                return true;
            }
            if (interfaceC3185c != null && interfaceC3185c.isCancelled()) {
                throw new C1486a();
            }
            if (TextUtils.isEmpty(b2.f)) {
                h(b2, 3);
            }
            if (interfaceC3185c != null && interfaceC3185c.isCancelled()) {
                throw new C1486a();
            }
            if (TextUtils.isEmpty(b3.f)) {
                h(b3, 3);
            }
            String str6 = b2.f;
            if (str6 != null && (str4 = b3.f) != null) {
                return str6.equals(str4);
            }
        }
        return false;
    }

    public b b(A a2) {
        b bVar = this.a.get(a2.a);
        if (bVar != null) {
            if (a2.c == bVar.c && a2.d == bVar.b) {
                bVar.g = true;
                return bVar;
            }
            this.a.remove(a2.a);
        }
        try {
            C3596o g = C1835x.g(a2.a);
            b bVar2 = new b(a2.a, a2.d, a2.c, C3186d.b(g.J(g.z(a2.a), 0L), 8192L, null), null, null);
            bVar2.g = true;
            this.a.put(bVar2.a, bVar2);
            return bVar2;
        } catch (C1495j | IOException unused) {
            return null;
        }
    }

    public void e() {
        BufferedReader bufferedReader = null;
        try {
            try {
                File d = d(this.b, this.c);
                File c = c(this.b, this.c);
                if (d.exists()) {
                    if (c.exists()) {
                        d.delete();
                    } else {
                        d.renameTo(c);
                        c = c(this.b, this.c);
                    }
                }
                if (!c.exists()) {
                    return;
                }
                BufferedReader bufferedReader2 = new BufferedReader(new FileReader(c));
                try {
                    if (!"1".equals(bufferedReader2.readLine())) {
                        bufferedReader2.close();
                        c.delete();
                        F.a(bufferedReader2);
                    } else {
                        while (true) {
                            String readLine = bufferedReader2.readLine();
                            if (readLine == null) {
                                F.a(bufferedReader2);
                                return;
                            }
                            f(readLine);
                        }
                    }
                } catch (IOException e) {
                    e = e;
                    bufferedReader = bufferedReader2;
                    e.printStackTrace();
                    if (bufferedReader != null) {
                        F.a(bufferedReader);
                    }
                } catch (Throwable th) {
                    th = th;
                    bufferedReader = bufferedReader2;
                    if (bufferedReader != null) {
                        F.a(bufferedReader);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e2) {
            e = e2;
        }
    }

    public void g() {
        BufferedWriter bufferedWriter = null;
        try {
            BufferedWriter bufferedWriter2 = new BufferedWriter(new FileWriter(c(this.b, this.c)));
            try {
                bufferedWriter2.write("1\n");
                for (b bVar : this.a.values()) {
                    if (bVar.g) {
                        i(bufferedWriter2, bVar);
                    }
                }
                bufferedWriter2.close();
            } catch (IOException unused) {
                bufferedWriter = bufferedWriter2;
                if (bufferedWriter != null) {
                    F.a(bufferedWriter);
                }
            }
        } catch (IOException unused2) {
        }
    }

    void h(b bVar, int i) {
        try {
            C3596o g = C1835x.g(bVar.a);
            AbstractC3595n z = g.z(bVar.a);
            InputStream J = g.J(z, 0L);
            if (i == 2) {
                bVar.e = C3186d.b(J, 1048576L, null);
            } else if (i == 3) {
                this.d.a(bVar.a);
                bVar.f = C3186d.b(J, z.p(), null);
                this.d.a(HttpUrl.FRAGMENT_ENCODE_SET);
            }
            this.a.put(bVar.a, bVar);
        } catch (C1495j | IOException unused) {
        }
    }
}
