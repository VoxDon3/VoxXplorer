package ax.jb;

import ax.nb.C2644g;
import ax.qb.C2897e;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.StringTokenizer;

/* renamed from: ax.jb.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2346b {
    private static int[] c = null;
    private static InetAddress d = null;
    private static boolean e = true;
    private static C2897e f = C2897e.a();
    Object a;
    String b;

    /* renamed from: ax.jb.b$a */
    static class a extends Thread {
        String c0;
        String d0;
        int e0;
        C2644g[] f0;
        InetAddress g0;
        UnknownHostException h0;
        C0343b q;

        a(C0343b c0343b, String str, int i, String str2, InetAddress inetAddress) {
            super("JCIFS-QueryThread: " + str);
            this.f0 = null;
            this.q = c0343b;
            this.c0 = str;
            this.e0 = i;
            this.d0 = str2;
            this.g0 = inetAddress;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                try {
                    try {
                        this.f0 = C2644g.l(this.c0, this.e0, this.d0, this.g0);
                        synchronized (this.q) {
                            r1.a--;
                            this.q.notify();
                        }
                    } catch (Exception e) {
                        this.h0 = new UnknownHostException(e.getMessage());
                        synchronized (this.q) {
                            r1.a--;
                            this.q.notify();
                        }
                    }
                } catch (UnknownHostException e2) {
                    this.h0 = e2;
                    synchronized (this.q) {
                        r1.a--;
                        this.q.notify();
                    }
                }
            } catch (Throwable th) {
                synchronized (this.q) {
                    r2.a--;
                    this.q.notify();
                    throw th;
                }
            }
        }
    }

    /* renamed from: ax.jb.b$b, reason: collision with other inner class name */
    static class C0343b {
        int a;

        C0343b(int i) {
            this.a = i;
        }
    }

    static {
        int i;
        String g = C2345a.g("jcifs.resolveOrder");
        InetAddress w = C2644g.w();
        try {
            d = C2345a.b("jcifs.netbios.baddr", InetAddress.getByName("255.255.255.255"));
        } catch (UnknownHostException unused) {
        }
        if (g == null || g.length() == 0) {
            if (w == null) {
                c = new int[]{3, 2, 1};
                return;
            } else {
                c = new int[]{3, 0, 2, 1};
                return;
            }
        }
        int[] iArr = new int[4];
        StringTokenizer stringTokenizer = new StringTokenizer(g, ",");
        int i2 = 0;
        while (stringTokenizer.hasMoreTokens()) {
            String trim = stringTokenizer.nextToken().trim();
            if (trim.equalsIgnoreCase("LMHOSTS")) {
                i = i2 + 1;
                iArr[i2] = 3;
            } else if (trim.equalsIgnoreCase("WINS")) {
                if (w != null) {
                    i = i2 + 1;
                    iArr[i2] = 0;
                } else if (C2897e.c0 > 1) {
                    f.println("UniAddress resolveOrder specifies WINS however the jcifs.netbios.wins property has not been set");
                }
            } else if (trim.equalsIgnoreCase("BCAST")) {
                i = i2 + 1;
                iArr[i2] = 1;
            } else if (trim.equalsIgnoreCase("DNS")) {
                i = i2 + 1;
                iArr[i2] = 2;
            } else if (C2897e.c0 > 1) {
                f.println("unknown resolver method: " + trim);
            }
            i2 = i;
        }
        int[] iArr2 = new int[i2];
        c = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, i2);
    }

    public C2346b(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException();
        }
        this.a = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0075, code lost:
    
        r3 = java.net.InetAddress.getAllByName(r8);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static ax.jb.C2346b[] c(java.lang.String r8, boolean r9) throws java.net.UnknownHostException {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.jb.C2346b.c(java.lang.String, boolean):ax.jb.b[]");
    }

    public static C2346b d(String str) throws UnknownHostException {
        return e(str, false);
    }

    public static C2346b e(String str, boolean z) throws UnknownHostException {
        C2346b[] c2 = c(str, z);
        if (c2.length > 1) {
            for (C2346b c2346b : c2) {
                if (!(c2346b.b() instanceof Inet6Address)) {
                    return c2346b;
                }
            }
        }
        return c2[0];
    }

    static boolean h(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    static boolean i(String str) {
        if (Character.isDigit(str.charAt(0))) {
            int length = str.length();
            char[] charArray = str.toCharArray();
            int i = 0;
            int i2 = 0;
            while (i < length) {
                int i3 = i + 1;
                if (!Character.isDigit(charArray[i])) {
                    break;
                }
                if (i3 == length && i2 == 3) {
                    return true;
                }
                if (i3 >= length || charArray[i3] != '.') {
                    i = i3;
                } else {
                    i2++;
                    i += 2;
                }
            }
        }
        return false;
    }

    static C2644g[] j(String str, InetAddress inetAddress) throws UnknownHostException {
        C0343b c0343b = new C0343b(2);
        a aVar = new a(c0343b, str, C2644g.y(inetAddress) ? 27 : 29, null, inetAddress);
        a aVar2 = new a(c0343b, str, 32, null, inetAddress);
        aVar.setDaemon(true);
        aVar2.setDaemon(true);
        try {
            synchronized (c0343b) {
                try {
                    aVar.start();
                    aVar2.start();
                    while (c0343b.a > 0 && aVar.f0 == null && aVar2.f0 == null) {
                        c0343b.wait();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            C2644g[] c2644gArr = aVar.f0;
            if (c2644gArr != null) {
                return c2644gArr;
            }
            C2644g[] c2644gArr2 = aVar2.f0;
            if (c2644gArr2 != null) {
                return c2644gArr2;
            }
            throw aVar.h0;
        } catch (InterruptedException unused) {
            throw new UnknownHostException(str);
        }
    }

    public static void l(boolean z) {
        e = z;
    }

    private static void m(String str) {
        int[] iArr = c;
        if (iArr == null || iArr.length != 3) {
            c = new int[3];
        }
        if (e || str == null || str.contains(".")) {
            int[] iArr2 = c;
            iArr2[0] = 3;
            iArr2[1] = 2;
            iArr2[2] = 1;
            return;
        }
        int[] iArr3 = c;
        iArr3[0] = 3;
        iArr3[1] = 1;
        iArr3[2] = 2;
    }

    public String a() {
        Object obj = this.a;
        if (obj instanceof C2644g) {
            return ((C2644g) obj).g();
        }
        String hostName = ((InetAddress) obj).getHostName();
        this.b = hostName;
        if (i(hostName)) {
            this.b = "*SMBSERVER     ";
        } else {
            int indexOf = this.b.indexOf(46);
            if (indexOf > 1 && indexOf < 15) {
                this.b = this.b.substring(0, indexOf).toUpperCase();
            } else if (this.b.length() > 15) {
                this.b = "*SMBSERVER     ";
            } else {
                this.b = this.b.toUpperCase();
            }
        }
        return this.b;
    }

    public Object b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C2346b) && this.a.equals(((C2346b) obj).a);
    }

    public String f() {
        Object obj = this.a;
        return obj instanceof C2644g ? ((C2644g) obj).q() : ((InetAddress) obj).getHostAddress();
    }

    public String g() {
        Object obj = this.a;
        return obj instanceof C2644g ? ((C2644g) obj).r() : ((InetAddress) obj).getHostName();
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String k() {
        Object obj = this.a;
        if (obj instanceof C2644g) {
            return ((C2644g) obj).z();
        }
        if (this.b == "*SMBSERVER     ") {
            return null;
        }
        this.b = "*SMBSERVER     ";
        return "*SMBSERVER     ";
    }

    public String toString() {
        return this.a.toString();
    }
}
