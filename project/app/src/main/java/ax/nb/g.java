/*
 * Decompiled with CFR 0.152.
 */
package ax.nb;

import ax.nb.b;
import ax.nb.e;
import ax.qb.d;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class g {
    static final InetAddress[] l;
    private static final e m;
    private static final int n;
    private static int o;
    private static final HashMap p;
    private static final HashMap q;
    static final b r;
    static final g s;
    static final byte[] t;
    static g u;
    b a;
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

    static {
        Object object;
        Object object2;
        block9: {
            Object object3;
            block8: {
                g g8;
                l = ax.jb.a.c("jcifs.netbios.wins", ",", new InetAddress[0]);
                object3 = new e();
                m = object3;
                n = ax.jb.a.d("jcifs.netbios.cachePolicy", 30);
                o = 0;
                object2 = new HashMap<b, a>();
                p = object2;
                q = new HashMap();
                object = new b("0.0.0.0", 0, null);
                r = object;
                s = g8 = new g((b)object, 0, false, 0);
                t = new byte[]{0, 0, 0, 0, 0, 0};
                ((HashMap)object2).put(object, new a((b)object, g8, -1L));
                object2 = object = ((e)object3).n0;
                if (object == null) {
                    try {
                        object2 = InetAddress.getLocalHost();
                    }
                    catch (UnknownHostException unknownHostException) {
                        try {
                            object2 = InetAddress.getByName("127.0.0.1");
                        }
                        catch (UnknownHostException unknownHostException2) {
                            object2 = object;
                        }
                    }
                }
                if ((object3 = ax.jb.a.h("jcifs.netbios.hostname", null)) == null) break block8;
                object = object3;
                if (((String)object3).length() != 0) break block9;
            }
            object3 = ((InetAddress)object2).getAddress();
            object = new StringBuilder();
            ((StringBuilder)object).append("JCIFS");
            ((StringBuilder)object).append((int)(object3[2] & 0xFF));
            ((StringBuilder)object).append("_");
            ((StringBuilder)object).append((int)(object3[3] & 0xFF));
            ((StringBuilder)object).append("_");
            ((StringBuilder)object).append(ax.qb.d.c((int)(Math.random() * 255.0), 2));
            object = ((StringBuilder)object).toString();
        }
        object = new b((String)object, 0, ax.jb.a.h("jcifs.netbios.scope", null));
        u = object2 = new g((b)object, ((InetAddress)object2).hashCode(), false, 0, false, false, true, false, t);
        ax.nb.g.b((b)object, (g)object2, -1L);
    }

    g(b b8, int n8, boolean bl, int n9) {
        this.a = b8;
        this.b = n8;
        this.d = bl;
        this.c = n9;
    }

    g(b b8, int n8, boolean bl, int n9, boolean bl2, boolean bl3, boolean bl4, boolean bl5, byte[] byArray) {
        this.a = b8;
        this.b = n8;
        this.d = bl;
        this.c = n9;
        this.e = bl2;
        this.f = bl3;
        this.g = bl4;
        this.h = bl5;
        this.j = byArray;
        this.i = true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void A(String string) {
        HashMap hashMap = p;
        synchronized (hashMap) {
            try {
                Iterator iterator = hashMap.entrySet().iterator();
                while (true) {
                    String string2;
                    if (!iterator.hasNext()) {
                        return;
                    }
                    Map.Entry entry = iterator.next();
                    if (!(entry.getKey() instanceof b) || (string2 = ((b)entry.getKey()).a) == null || !string2.equalsIgnoreCase(string) || (entry = (a)entry.getValue()) == null || ((a)((Object)entry)).b != s) continue;
                    iterator.remove();
                }
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    static InetAddress B() {
        int n8 = o;
        InetAddress[] inetAddressArray = l;
        n8 = n8 + 1 < inetAddressArray.length ? ++n8 : 0;
        o = n8;
        if (inetAddressArray.length == 0) {
            return null;
        }
        return inetAddressArray[n8];
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void C(b b8) {
        HashMap hashMap = q;
        synchronized (hashMap) {
            hashMap.remove(b8);
            hashMap.notifyAll();
            return;
        }
    }

    static void a(b b8, g g8) {
        int n8 = n;
        if (n8 == 0) {
            return;
        }
        long l8 = n8 != -1 ? System.currentTimeMillis() + (long)(n8 * 1000) : -1L;
        ax.nb.g.b(b8, g8, l8);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static void b(b b8, g g8, long l8) {
        if (n == 0) {
            return;
        }
        HashMap hashMap = p;
        synchronized (hashMap) {
            Throwable throwable2;
            block6: {
                block5: {
                    block4: {
                        try {
                            a a8 = (a)hashMap.get(b8);
                            if (a8 != null) break block4;
                            a8 = new a(b8, g8, l8);
                            hashMap.put(b8, a8);
                            break block5;
                        }
                        catch (Throwable throwable2) {
                            break block6;
                        }
                    }
                    a8.b = g8;
                    a8.c = l8;
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static void c(g[] gArray) {
        int n8 = n;
        if (n8 == 0) {
            return;
        }
        long l8 = n8 != -1 ? System.currentTimeMillis() + (long)(n8 * 1000) : -1L;
        HashMap hashMap = p;
        synchronized (hashMap) {
            Throwable throwable2;
            block8: {
                n8 = 0;
                while (true) {
                    block9: {
                        block7: {
                            Object object;
                            HashMap hashMap2;
                            try {
                                if (n8 >= gArray.length) break;
                                hashMap2 = p;
                                object = (a)hashMap2.get(gArray[n8].a);
                                if (object != null) break block7;
                            }
                            catch (Throwable throwable2) {
                                break block8;
                            }
                            object = gArray[n8];
                            a a8 = new a(((g)object).a, (g)object, l8);
                            hashMap2.put(gArray[n8].a, a8);
                            break block9;
                        }
                        ((a)object).b = gArray[n8];
                        ((a)object).c = l8;
                    }
                    ++n8;
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    private static Object e(b b8) {
        Object object = q;
        // MONITORENTER : object
        if (!((HashMap)object).containsKey(b8)) {
            ((HashMap)object).put(b8, b8);
            // MONITOREXIT : object
            return null;
        }
        while (true) {
            HashMap hashMap;
            boolean bl;
            if (bl = (hashMap = q).containsKey(b8)) {
                hashMap.wait();
            }
            object = ax.nb.g.p(b8);
            if (object != null) return object;
            // MONITORENTER : hashMap
            hashMap.put(b8, b8);
            // MONITOREXIT : hashMap
            return object;
            catch (InterruptedException interruptedException) {
            }
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static g f(b b8, InetAddress object) throws UnknownHostException {
        block10: {
            InetAddress inetAddress = object;
            if (b8.c == 29) {
                inetAddress = object;
                if (object == null) {
                    inetAddress = ax.nb.g.m.o0;
                }
            }
            int n8 = inetAddress != null ? inetAddress.hashCode() : 0;
            b8.d = n8;
            g g8 = ax.nb.g.p(b8);
            object = g8;
            if (g8 == null) {
                g8 = (g)ax.nb.g.e(b8);
                object = g8;
                if (g8 == null) {
                    Throwable throwable2;
                    block9: {
                        object = m.c(b8, inetAddress);
                        {
                            catch (Throwable throwable2) {
                                break block9;
                            }
                            catch (UnknownHostException unknownHostException) {}
                            {
                                object = s;
                            }
                        }
                        ax.nb.g.a(b8, (g)object);
                        ax.nb.g.C(b8);
                        break block10;
                    }
                    ax.nb.g.a(b8, g8);
                    ax.nb.g.C(b8);
                    throw throwable2;
                }
            }
        }
        if (object != s) {
            return object;
        }
        throw new UnknownHostException(b8.toString());
    }

    public static g[] i(g g8) throws UnknownHostException {
        try {
            g[] gArray = m.e(g8);
            ax.nb.g.c(gArray);
            return gArray;
        }
        catch (UnknownHostException unknownHostException) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("no name with type 0x");
            stringBuilder.append(ax.qb.d.c(g8.a.c, 2));
            CharSequence charSequence = g8.a.b;
            if (charSequence != null && ((String)charSequence).length() != 0) {
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append(" with scope ");
                ((StringBuilder)charSequence).append(g8.a.b);
                charSequence = ((StringBuilder)charSequence).toString();
            } else {
                charSequence = " with no scope";
            }
            stringBuilder.append((String)charSequence);
            stringBuilder.append(" for host ");
            stringBuilder.append(g8.q());
            throw new UnknownHostException(stringBuilder.toString());
        }
    }

    public static g[] j(g g8, int n8, int n9) throws UnknownHostException {
        try {
            g[] gArray = m.f(g8, n8, n9);
            ax.nb.g.c(gArray);
            return gArray;
        }
        catch (UnknownHostException unknownHostException) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("no name with type 0x");
            stringBuilder.append(ax.qb.d.c(g8.a.c, 2));
            CharSequence charSequence = g8.a.b;
            if (charSequence != null && ((String)charSequence).length() != 0) {
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append(" with scope ");
                ((StringBuilder)charSequence).append(g8.a.b);
                charSequence = ((StringBuilder)charSequence).toString();
            } else {
                charSequence = " with no scope";
            }
            stringBuilder.append((String)charSequence);
            stringBuilder.append(" for host ");
            stringBuilder.append(g8.q());
            throw new UnknownHostException(stringBuilder.toString());
        }
    }

    public static g[] k(String string) throws UnknownHostException {
        return ax.nb.g.i(ax.nb.g.n(string, 0, null));
    }

    public static g[] l(String string, int n8, String string2, InetAddress inetAddress) throws UnknownHostException {
        return m.b(new b(string, n8, string2), inetAddress);
    }

    public static g m(String string) throws UnknownHostException {
        return ax.nb.g.n(string, 0, null);
    }

    public static g n(String string, int n8, String string2) throws UnknownHostException {
        return ax.nb.g.o(string, n8, string2, null);
    }

    public static g o(String string, int n8, String string2, InetAddress inetAddress) throws UnknownHostException {
        if (string != null && string.length() != 0) {
            if (!Character.isDigit(string.charAt(0))) {
                return ax.nb.g.f(new b(string, n8, string2), inetAddress);
            }
            char[] cArray = string.toCharArray();
            int n9 = 0;
            int n10 = 0;
            int n11 = 0;
            while (n9 < cArray.length) {
                char c8 = cArray[n9];
                if (c8 >= '0' && c8 <= '9') {
                    int n12;
                    int n13;
                    block8: {
                        int n14 = 0;
                        while (true) {
                            n13 = n9++;
                            n12 = n14;
                            if (c8 == '.') break block8;
                            if (c8 < '0' || c8 > '9') break;
                            n14 = n14 * 10 + c8 - 48;
                            if (n9 >= cArray.length) {
                                n13 = n9;
                                n12 = n14;
                                break block8;
                            }
                            c8 = cArray[n9];
                        }
                        return ax.nb.g.f(new b(string, n8, string2), inetAddress);
                    }
                    if (n12 > 255) {
                        return ax.nb.g.f(new b(string, n8, string2), inetAddress);
                    }
                    n11 = (n11 << 8) + n12;
                    ++n10;
                    n9 = n13 + 1;
                    continue;
                }
                return ax.nb.g.f(new b(string, n8, string2), inetAddress);
            }
            if (n10 == 4 && !string.endsWith(".")) {
                return new g(r, n11, false, 0);
            }
            return ax.nb.g.f(new b(string, n8, string2), inetAddress);
        }
        return ax.nb.g.t();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static g p(b object) {
        int n8 = n;
        g g8 = null;
        if (n8 == 0) {
            return null;
        }
        HashMap hashMap = p;
        synchronized (hashMap) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        a a8 = (a)hashMap.get(object);
                        object = a8;
                        if (a8 == null) break block4;
                        object = a8;
                        if (a8.c >= System.currentTimeMillis()) break block4;
                        object = a8;
                        if (a8.c < 0L) break block4;
                        object = null;
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                if (object == null) return g8;
                return ((a)object).b;
            }
            throw throwable2;
        }
    }

    public static g t() throws UnknownHostException {
        return u;
    }

    public static b u() {
        return ax.nb.g.u.a;
    }

    public static InetAddress w() {
        InetAddress[] inetAddressArray = l;
        if (inetAddressArray.length == 0) {
            return null;
        }
        return inetAddressArray[o];
    }

    public static boolean y(InetAddress inetAddress) {
        InetAddress[] inetAddressArray;
        for (int i8 = 0; inetAddress != null && i8 < (inetAddressArray = l).length; ++i8) {
            if (inetAddress.hashCode() != inetAddressArray[i8].hashCode()) continue;
            return true;
        }
        return false;
    }

    void d() throws UnknownHostException {
        if (this.a == r) {
            ax.nb.g.i(this);
        }
    }

    public boolean equals(Object object) {
        return object != null && object instanceof g && ((g)object).b == this.b;
    }

    public String g() {
        Object object = this.a.a;
        this.k = object;
        int n8 = 0;
        if (Character.isDigit(((String)object).charAt(0))) {
            int n9 = this.k.length();
            object = this.k.toCharArray();
            int n10 = 0;
            while (n8 < n9) {
                int n11 = n8 + 1;
                if (!Character.isDigit((char)object[n8])) break;
                if (n11 == n9 && n10 == 3) {
                    this.k = "*SMBSERVER     ";
                    break;
                }
                if (n11 < n9 && object[n11] == 46) {
                    ++n10;
                    n8 += 2;
                    continue;
                }
                n8 = n11;
            }
        } else {
            switch (this.a.c) {
                default: {
                    break;
                }
                case 27: 
                case 28: 
                case 29: {
                    this.k = "*SMBSERVER     ";
                }
            }
        }
        return this.k;
    }

    public byte[] h() {
        int n8 = this.b;
        return new byte[]{(byte)(n8 >>> 24 & 0xFF), (byte)(n8 >>> 16 & 0xFF), (byte)(n8 >>> 8 & 0xFF), (byte)(n8 & 0xFF)};
    }

    public int hashCode() {
        return this.b;
    }

    public String q() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.b >>> 24 & 0xFF);
        stringBuilder.append(".");
        stringBuilder.append(this.b >>> 16 & 0xFF);
        stringBuilder.append(".");
        stringBuilder.append(this.b >>> 8 & 0xFF);
        stringBuilder.append(".");
        stringBuilder.append(this.b & 0xFF);
        return stringBuilder.toString();
    }

    public String r() {
        b b8 = this.a;
        if (b8 == r) {
            return this.q();
        }
        return b8.a;
    }

    public InetAddress s() throws UnknownHostException {
        return InetAddress.getByName(this.q());
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.a.toString());
        stringBuilder.append("/");
        stringBuilder.append(this.q());
        return stringBuilder.toString();
    }

    public int v() {
        return this.a.c;
    }

    public boolean x() throws UnknownHostException {
        this.d();
        return this.d;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public String z() {
        Object object = this.k;
        if (object == this.a.a) {
            this.k = "*SMBSERVER     ";
            return this.k;
        }
        if (object == "*SMBSERVER     ") {
            b b8;
            block8: {
                object = m.e(this);
                b8 = this.a;
                if (b8.c != 29) break block8;
                int n8 = 0;
                while (true) {
                    if (n8 >= ((g[])object).length) return null;
                    b8 = object[n8].a;
                    if (b8.c == 32) {
                        return b8.a;
                    }
                    ++n8;
                    continue;
                    break;
                }
            }
            try {
                if (!this.i) return this.k;
                this.k = null;
                return b8.a;
            }
            catch (UnknownHostException unknownHostException) {
                this.k = null;
                return this.k;
            }
        }
        this.k = null;
        return this.k;
    }

    static final class a {
        b a;
        g b;
        long c;

        a(b b8, g g8, long l8) {
            this.a = b8;
            this.b = g8;
            this.c = l8;
        }
    }
}

