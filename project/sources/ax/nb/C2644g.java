package ax.nb;

import ax.jb.C2345a;
import ax.qb.C2896d;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: ax.nb.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2644g {
    static final InetAddress[] l = C2345a.c("jcifs.netbios.wins", ",", new InetAddress[0]);
    private static final RunnableC2642e m;
    private static final int n;
    private static int o;
    private static final HashMap p;
    private static final HashMap q;
    static final C2639b r;
    static final C2644g s;
    static final byte[] t;
    static C2644g u;
    C2639b a;
    int b;
    int c;
    boolean d;
    boolean e;
    boolean f;
    boolean g;
    boolean h;
    boolean i;
    byte[] j;
    String k;

    /* renamed from: ax.nb.g$a */
    static final class a {
        C2639b a;
        C2644g b;
        long c;

        a(C2639b c2639b, C2644g c2644g, long j) {
            this.a = c2639b;
            this.b = c2644g;
            this.c = j;
        }
    }

    static {
        RunnableC2642e runnableC2642e = new RunnableC2642e();
        m = runnableC2642e;
        n = C2345a.d("jcifs.netbios.cachePolicy", 30);
        o = 0;
        HashMap hashMap = new HashMap();
        p = hashMap;
        q = new HashMap();
        C2639b c2639b = new C2639b("0.0.0.0", 0, null);
        r = c2639b;
        C2644g c2644g = new C2644g(c2639b, 0, false, 0);
        s = c2644g;
        t = new byte[]{0, 0, 0, 0, 0, 0};
        hashMap.put(c2639b, new a(c2639b, c2644g, -1L));
        InetAddress inetAddress = runnableC2642e.n0;
        if (inetAddress == null) {
            try {
                try {
                    inetAddress = InetAddress.getLocalHost();
                } catch (UnknownHostException unused) {
                    inetAddress = InetAddress.getByName("127.0.0.1");
                }
            } catch (UnknownHostException unused2) {
            }
        }
        String h = C2345a.h("jcifs.netbios.hostname", null);
        if (h == null || h.length() == 0) {
            byte[] address = inetAddress.getAddress();
            h = "JCIFS" + (address[2] & 255) + "_" + (address[3] & 255) + "_" + C2896d.c((int) (Math.random() * 255.0d), 2);
        }
        C2639b c2639b2 = new C2639b(h, 0, C2345a.h("jcifs.netbios.scope", null));
        C2644g c2644g2 = new C2644g(c2639b2, inetAddress.hashCode(), false, 0, false, false, true, false, t);
        u = c2644g2;
        b(c2639b2, c2644g2, -1L);
    }

    C2644g(C2639b c2639b, int i, boolean z, int i2) {
        this.a = c2639b;
        this.b = i;
        this.d = z;
        this.c = i2;
    }

    public static void A(String str) {
        String str2;
        a aVar;
        HashMap hashMap = p;
        synchronized (hashMap) {
            try {
                Iterator it = hashMap.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if ((entry.getKey() instanceof C2639b) && (str2 = ((C2639b) entry.getKey()).a) != null && str2.equalsIgnoreCase(str) && (aVar = (a) entry.getValue()) != null && aVar.b == s) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    static InetAddress B() {
        int i = o;
        int i2 = i + 1;
        InetAddress[] inetAddressArr = l;
        int i3 = i2 < inetAddressArr.length ? i + 1 : 0;
        o = i3;
        if (inetAddressArr.length == 0) {
            return null;
        }
        return inetAddressArr[i3];
    }

    private static void C(C2639b c2639b) {
        HashMap hashMap = q;
        synchronized (hashMap) {
            hashMap.remove(c2639b);
            hashMap.notifyAll();
        }
    }

    static void a(C2639b c2639b, C2644g c2644g) {
        int i = n;
        if (i == 0) {
            return;
        }
        b(c2639b, c2644g, i != -1 ? System.currentTimeMillis() + (i * 1000) : -1L);
    }

    static void b(C2639b c2639b, C2644g c2644g, long j) {
        if (n == 0) {
            return;
        }
        HashMap hashMap = p;
        synchronized (hashMap) {
            try {
                a aVar = (a) hashMap.get(c2639b);
                if (aVar == null) {
                    hashMap.put(c2639b, new a(c2639b, c2644g, j));
                } else {
                    aVar.b = c2644g;
                    aVar.c = j;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    static void c(C2644g[] c2644gArr) {
        int i = n;
        if (i == 0) {
            return;
        }
        long currentTimeMillis = i != -1 ? System.currentTimeMillis() + (i * 1000) : -1L;
        synchronized (p) {
            for (int i2 = 0; i2 < c2644gArr.length; i2++) {
                try {
                    HashMap hashMap = p;
                    a aVar = (a) hashMap.get(c2644gArr[i2].a);
                    if (aVar == null) {
                        C2644g c2644g = c2644gArr[i2];
                        hashMap.put(c2644gArr[i2].a, new a(c2644g.a, c2644g, currentTimeMillis));
                    } else {
                        aVar.b = c2644gArr[i2];
                        aVar.c = currentTimeMillis;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private static Object e(C2639b c2639b) {
        HashMap hashMap;
        HashMap hashMap2 = q;
        synchronized (hashMap2) {
            try {
                if (!hashMap2.containsKey(c2639b)) {
                    hashMap2.put(c2639b, c2639b);
                    return null;
                }
                while (true) {
                    hashMap = q;
                    if (!hashMap.containsKey(c2639b)) {
                        break;
                    }
                    try {
                        hashMap.wait();
                    } catch (InterruptedException unused) {
                    }
                }
                C2644g p2 = p(c2639b);
                if (p2 == null) {
                    synchronized (hashMap) {
                        hashMap.put(c2639b, c2639b);
                    }
                }
                return p2;
            } finally {
            }
        }
    }

    static C2644g f(C2639b c2639b, InetAddress inetAddress) throws UnknownHostException {
        if (c2639b.c == 29 && inetAddress == null) {
            inetAddress = m.o0;
        }
        c2639b.d = inetAddress != null ? inetAddress.hashCode() : 0;
        C2644g p2 = p(c2639b);
        if (p2 == null) {
            p2 = (C2644g) e(c2639b);
            try {
                if (p2 == null) {
                    try {
                        p2 = m.c(c2639b, inetAddress);
                    } catch (UnknownHostException unused) {
                        p2 = s;
                    }
                }
            } finally {
                a(c2639b, p2);
                C(c2639b);
            }
        }
        if (p2 != s) {
            return p2;
        }
        throw new UnknownHostException(c2639b.toString());
    }

    public static C2644g[] i(C2644g c2644g) throws UnknownHostException {
        String str;
        try {
            C2644g[] e = m.e(c2644g);
            c(e);
            return e;
        } catch (UnknownHostException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("no name with type 0x");
            sb.append(C2896d.c(c2644g.a.c, 2));
            String str2 = c2644g.a.b;
            if (str2 == null || str2.length() == 0) {
                str = " with no scope";
            } else {
                str = " with scope " + c2644g.a.b;
            }
            sb.append(str);
            sb.append(" for host ");
            sb.append(c2644g.q());
            throw new UnknownHostException(sb.toString());
        }
    }

    public static C2644g[] j(C2644g c2644g, int i, int i2) throws UnknownHostException {
        String str;
        try {
            C2644g[] f = m.f(c2644g, i, i2);
            c(f);
            return f;
        } catch (UnknownHostException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("no name with type 0x");
            sb.append(C2896d.c(c2644g.a.c, 2));
            String str2 = c2644g.a.b;
            if (str2 == null || str2.length() == 0) {
                str = " with no scope";
            } else {
                str = " with scope " + c2644g.a.b;
            }
            sb.append(str);
            sb.append(" for host ");
            sb.append(c2644g.q());
            throw new UnknownHostException(sb.toString());
        }
    }

    public static C2644g[] k(String str) throws UnknownHostException {
        return i(n(str, 0, null));
    }

    public static C2644g[] l(String str, int i, String str2, InetAddress inetAddress) throws UnknownHostException {
        return m.b(new C2639b(str, i, str2), inetAddress);
    }

    public static C2644g m(String str) throws UnknownHostException {
        return n(str, 0, null);
    }

    public static C2644g n(String str, int i, String str2) throws UnknownHostException {
        return o(str, i, str2, null);
    }

    public static C2644g o(String str, int i, String str2, InetAddress inetAddress) throws UnknownHostException {
        if (str == null || str.length() == 0) {
            return t();
        }
        if (!Character.isDigit(str.charAt(0))) {
            return f(new C2639b(str, i, str2), inetAddress);
        }
        char[] charArray = str.toCharArray();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < charArray.length) {
            char c = charArray[i2];
            if (c < '0' || c > '9') {
                return f(new C2639b(str, i, str2), inetAddress);
            }
            int i5 = 0;
            while (c != '.') {
                if (c < '0' || c > '9') {
                    return f(new C2639b(str, i, str2), inetAddress);
                }
                i5 = ((i5 * 10) + c) - 48;
                i2++;
                if (i2 >= charArray.length) {
                    break;
                }
                c = charArray[i2];
            }
            if (i5 > 255) {
                return f(new C2639b(str, i, str2), inetAddress);
            }
            i4 = (i4 << 8) + i5;
            i3++;
            i2++;
        }
        return (i3 != 4 || str.endsWith(".")) ? f(new C2639b(str, i, str2), inetAddress) : new C2644g(r, i4, false, 0);
    }

    static C2644g p(C2639b c2639b) {
        C2644g c2644g;
        if (n == 0) {
            return null;
        }
        HashMap hashMap = p;
        synchronized (hashMap) {
            try {
                a aVar = (a) hashMap.get(c2639b);
                if (aVar != null && aVar.c < System.currentTimeMillis() && aVar.c >= 0) {
                    aVar = null;
                }
                c2644g = aVar != null ? aVar.b : null;
            } finally {
            }
        }
        return c2644g;
    }

    public static C2644g t() throws UnknownHostException {
        return u;
    }

    public static C2639b u() {
        return u.a;
    }

    public static InetAddress w() {
        InetAddress[] inetAddressArr = l;
        if (inetAddressArr.length == 0) {
            return null;
        }
        return inetAddressArr[o];
    }

    public static boolean y(InetAddress inetAddress) {
        int i = 0;
        while (inetAddress != null) {
            InetAddress[] inetAddressArr = l;
            if (i >= inetAddressArr.length) {
                break;
            }
            if (inetAddress.hashCode() == inetAddressArr[i].hashCode()) {
                return true;
            }
            i++;
        }
        return false;
    }

    void d() throws UnknownHostException {
        if (this.a == r) {
            i(this);
        }
    }

    public boolean equals(Object obj) {
        return obj != null && (obj instanceof C2644g) && ((C2644g) obj).b == this.b;
    }

    public String g() {
        String str = this.a.a;
        this.k = str;
        int i = 0;
        if (!Character.isDigit(str.charAt(0))) {
            switch (this.a.c) {
                case 27:
                case 28:
                case 29:
                    this.k = "*SMBSERVER     ";
                    break;
            }
        } else {
            int length = this.k.length();
            char[] charArray = this.k.toCharArray();
            int i2 = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                int i3 = i + 1;
                if (!Character.isDigit(charArray[i])) {
                    break;
                }
                if (i3 == length && i2 == 3) {
                    this.k = "*SMBSERVER     ";
                    break;
                }
                if (i3 >= length || charArray[i3] != '.') {
                    i = i3;
                } else {
                    i2++;
                    i += 2;
                }
            }
        }
        return this.k;
    }

    public byte[] h() {
        int i = this.b;
        return new byte[]{(byte) ((i >>> 24) & 255), (byte) ((i >>> 16) & 255), (byte) ((i >>> 8) & 255), (byte) (i & 255)};
    }

    public int hashCode() {
        return this.b;
    }

    public String q() {
        return ((this.b >>> 24) & 255) + "." + ((this.b >>> 16) & 255) + "." + ((this.b >>> 8) & 255) + "." + (this.b & 255);
    }

    public String r() {
        C2639b c2639b = this.a;
        return c2639b == r ? q() : c2639b.a;
    }

    public InetAddress s() throws UnknownHostException {
        return InetAddress.getByName(q());
    }

    public String toString() {
        return this.a.toString() + "/" + q();
    }

    public int v() {
        return this.a.c;
    }

    public boolean x() throws UnknownHostException {
        d();
        return this.d;
    }

    public String z() {
        String str = this.k;
        if (str == this.a.a) {
            this.k = "*SMBSERVER     ";
        } else if (str == "*SMBSERVER     ") {
            try {
                C2644g[] e = m.e(this);
                C2639b c2639b = this.a;
                if (c2639b.c == 29) {
                    for (C2644g c2644g : e) {
                        C2639b c2639b2 = c2644g.a;
                        if (c2639b2.c == 32) {
                            return c2639b2.a;
                        }
                    }
                    return null;
                }
                if (this.i) {
                    this.k = null;
                    return c2639b.a;
                }
            } catch (UnknownHostException unused) {
                this.k = null;
            }
        } else {
            this.k = null;
        }
        return this.k;
    }

    C2644g(C2639b c2639b, int i, boolean z, int i2, boolean z2, boolean z3, boolean z4, boolean z5, byte[] bArr) {
        this.a = c2639b;
        this.b = i;
        this.d = z;
        this.c = i2;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = z5;
        this.j = bArr;
        this.i = true;
    }
}
