package ax.pb;

import ax.jb.C2345a;
import ax.jb.C2346b;
import ax.qb.C2897e;
import java.io.IOException;
import java.util.HashMap;
import okhttp3.HttpUrl;

/* renamed from: ax.pb.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2799d {
    static C2897e c = C2897e.a();
    static final boolean d = C2345a.a("jcifs.smb.client.dfs.strictView", false);
    static final long e = C2345a.f("jcifs.smb.client.dfs.ttl", 300);
    static final boolean f = C2345a.a("jcifs.smb.client.dfs.disabled", false);
    protected static a g = new a(0);
    protected a a = null;
    protected a b = null;

    /* renamed from: ax.pb.d$a */
    static class a {
        long a;
        HashMap b;

        a(long j) {
            this.a = System.currentTimeMillis() + ((j == 0 ? C2799d.e : j) * 1000);
            this.b = new HashMap();
        }
    }

    public k0 a(String str, r rVar) throws C2820u {
        if (f) {
            return null;
        }
        try {
            C2801e q = k0.s(C2346b.e(str, true), 0).q(rVar, "\\" + str, 1);
            if (q != null) {
                C2801e c2801e = q;
                do {
                    try {
                        return k0.s(C2346b.d(c2801e.f0), 0);
                    } catch (IOException e2) {
                        c2801e = c2801e.l0;
                    }
                } while (c2801e != q);
                throw e2;
            }
        } catch (IOException e3) {
            if (C2897e.c0 >= 3) {
                e3.printStackTrace(c);
            }
            if (d && (e3 instanceof C2820u)) {
                throw ((C2820u) e3);
            }
        }
        return null;
    }

    public C2801e b(k0 k0Var, String str, String str2, String str3, r rVar) throws C2820u {
        C2801e q;
        if (f) {
            return null;
        }
        try {
            String str4 = "\\" + str + "\\" + str2;
            if (str3 != null) {
                str4 = str4 + str3;
            }
            q = k0Var.q(rVar, str4, 0);
        } catch (IOException e2) {
            if (C2897e.c0 >= 4) {
                e2.printStackTrace(c);
            }
            if (d && (e2 instanceof C2820u)) {
                throw ((C2820u) e2);
            }
        }
        if (q != null) {
            return q;
        }
        return null;
    }

    public HashMap c(r rVar) throws C2820u {
        if (!f && rVar.q != "?") {
            if (this.a != null && System.currentTimeMillis() > this.a.a) {
                this.a = null;
            }
            a aVar = this.a;
            if (aVar != null) {
                return aVar.b;
            }
            try {
                k0 s = k0.s(C2346b.e(rVar.q, true), 0);
                a aVar2 = new a(e * 10);
                C2801e q = s.q(rVar, HttpUrl.FRAGMENT_ENCODE_SET, 0);
                if (q != null) {
                    C2801e c2801e = q;
                    do {
                        aVar2.b.put(c2801e.f0.toLowerCase(), new HashMap());
                        c2801e = c2801e.l0;
                    } while (c2801e != q);
                    this.a = aVar2;
                    return aVar2.b;
                }
            } catch (IOException e2) {
                if (C2897e.c0 >= 3) {
                    e2.printStackTrace(c);
                }
                if (d && (e2 instanceof C2820u)) {
                    throw ((C2820u) e2);
                }
            }
        }
        return null;
    }

    synchronized void d(String str, C2801e c2801e) {
        try {
            if (f) {
                return;
            }
            int indexOf = str.indexOf(92, 1);
            int i = indexOf + 1;
            int indexOf2 = str.indexOf(92, i);
            String substring = str.substring(1, indexOf);
            String substring2 = str.substring(i, indexOf2);
            String lowerCase = str.substring(0, c2801e.d0).toLowerCase();
            int length = lowerCase.length();
            while (length > 1 && lowerCase.charAt(length - 1) == '\\') {
                length--;
            }
            if (length < lowerCase.length()) {
                lowerCase = lowerCase.substring(0, length);
            }
            c2801e.d0 -= (substring.length() + 2) + substring2.length();
            if (this.b != null && System.currentTimeMillis() + 10000 > this.b.a) {
                this.b = null;
            }
            if (this.b == null) {
                this.b = new a(0L);
            }
            this.b.b.put(lowerCase, c2801e);
        } catch (Throwable th) {
            throw th;
        }
    }

    public boolean e(String str, r rVar) throws C2820u {
        HashMap c2 = c(rVar);
        return (c2 == null || c2.get(str.toLowerCase()) == null) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00f4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0106 A[Catch: all -> 0x0045, TryCatch #0 {all -> 0x0045, blocks: (B:4:0x0005, B:6:0x000e, B:9:0x001a, B:11:0x0022, B:13:0x002e, B:15:0x003a, B:17:0x0040, B:19:0x004b, B:25:0x0055, B:27:0x005b, B:29:0x006e, B:30:0x0076, B:33:0x007f, B:35:0x0083, B:36:0x0088, B:38:0x009f, B:40:0x00ab, B:42:0x00b1, B:45:0x00bd, B:50:0x00c7, B:52:0x00cd, B:55:0x00f6, B:57:0x00fa, B:59:0x0100, B:60:0x0102, B:62:0x0106, B:63:0x010d, B:65:0x012e, B:66:0x013d, B:67:0x014d, B:69:0x0153, B:71:0x0163, B:74:0x0182, B:79:0x0168, B:81:0x016f, B:83:0x0175, B:95:0x008e, B:96:0x0094), top: B:3:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x012e A[Catch: all -> 0x0045, TryCatch #0 {all -> 0x0045, blocks: (B:4:0x0005, B:6:0x000e, B:9:0x001a, B:11:0x0022, B:13:0x002e, B:15:0x003a, B:17:0x0040, B:19:0x004b, B:25:0x0055, B:27:0x005b, B:29:0x006e, B:30:0x0076, B:33:0x007f, B:35:0x0083, B:36:0x0088, B:38:0x009f, B:40:0x00ab, B:42:0x00b1, B:45:0x00bd, B:50:0x00c7, B:52:0x00cd, B:55:0x00f6, B:57:0x00fa, B:59:0x0100, B:60:0x0102, B:62:0x0106, B:63:0x010d, B:65:0x012e, B:66:0x013d, B:67:0x014d, B:69:0x0153, B:71:0x0163, B:74:0x0182, B:79:0x0168, B:81:0x016f, B:83:0x0175, B:95:0x008e, B:96:0x0094), top: B:3:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0153 A[Catch: all -> 0x0045, TryCatch #0 {all -> 0x0045, blocks: (B:4:0x0005, B:6:0x000e, B:9:0x001a, B:11:0x0022, B:13:0x002e, B:15:0x003a, B:17:0x0040, B:19:0x004b, B:25:0x0055, B:27:0x005b, B:29:0x006e, B:30:0x0076, B:33:0x007f, B:35:0x0083, B:36:0x0088, B:38:0x009f, B:40:0x00ab, B:42:0x00b1, B:45:0x00bd, B:50:0x00c7, B:52:0x00cd, B:55:0x00f6, B:57:0x00fa, B:59:0x0100, B:60:0x0102, B:62:0x0106, B:63:0x010d, B:65:0x012e, B:66:0x013d, B:67:0x014d, B:69:0x0153, B:71:0x0163, B:74:0x0182, B:79:0x0168, B:81:0x016f, B:83:0x0175, B:95:0x008e, B:96:0x0094), top: B:3:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized ax.pb.C2801e f(java.lang.String r17, java.lang.String r18, java.lang.String r19, ax.pb.r r20) throws ax.pb.C2820u {
        /*
            Method dump skipped, instructions count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.pb.C2799d.f(java.lang.String, java.lang.String, java.lang.String, ax.pb.r):ax.pb.e");
    }
}
