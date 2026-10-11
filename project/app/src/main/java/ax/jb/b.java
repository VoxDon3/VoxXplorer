/*
 * Decompiled with CFR 0.152.
 */
package ax.jb;

import android.os.Build;
import ax.nb.g;
import ax.qb.e;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class b {
    private static int[] c;
    private static InetAddress d;
    private static boolean e = true;
    private static e f;
    Object a;
    String b;

    static {
        f = ax.qb.e.a();
        Object object = ax.jb.a.g("jcifs.resolveOrder");
        Object object2 = g.w();
        try {
            d = ax.jb.a.b("jcifs.netbios.baddr", InetAddress.getByName("255.255.255.255"));
        }
        catch (UnknownHostException unknownHostException) {
            // empty catch block
        }
        if (object != null && ((String)object).length() != 0) {
            int[] nArray = new int[4];
            StringTokenizer stringTokenizer = new StringTokenizer((String)object, ",");
            int n8 = 0;
            while (stringTokenizer.hasMoreTokens()) {
                int n9;
                String string = stringTokenizer.nextToken().trim();
                if (string.equalsIgnoreCase("LMHOSTS")) {
                    n9 = n8 + 1;
                    nArray[n8] = 3;
                    n8 = n9;
                    continue;
                }
                if (string.equalsIgnoreCase("WINS")) {
                    if (object2 == null) {
                        if (ax.qb.e.c0 <= 1) continue;
                        f.println("UniAddress resolveOrder specifies WINS however the jcifs.netbios.wins property has not been set");
                        continue;
                    }
                    n9 = n8 + 1;
                    nArray[n8] = 0;
                    n8 = n9;
                    continue;
                }
                if (string.equalsIgnoreCase("BCAST")) {
                    n9 = n8 + 1;
                    nArray[n8] = 1;
                    n8 = n9;
                    continue;
                }
                if (string.equalsIgnoreCase("DNS")) {
                    n9 = n8 + 1;
                    nArray[n8] = 2;
                    n8 = n9;
                    continue;
                }
                if (ax.qb.e.c0 <= 1) continue;
                object = f;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("unknown resolver method: ");
                stringBuilder.append(string);
                ((PrintStream)object).println(stringBuilder.toString());
            }
            object2 = new int[n8];
            c = (int[])object2;
            System.arraycopy(nArray, 0, object2, 0, n8);
        } else if (object2 == null) {
            int[] nArray = new int[3];
            c = nArray;
            nArray[0] = 3;
            nArray[1] = 2;
            nArray[2] = 1;
        } else {
            int[] nArray = new int[4];
            c = nArray;
            nArray[0] = 3;
            nArray[1] = 0;
            nArray[2] = 2;
            nArray[3] = 1;
        }
    }

    public b(Object object) {
        if (object != null) {
            this.a = object;
            return;
        }
        throw new IllegalArgumentException();
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static b[] c(String var0, boolean var1_1) throws UnknownHostException {
        block20: {
            if (var0 == null || var0.length() == 0) break block20;
            if (ax.jb.b.i(var0)) {
                return new b[]{new b(g.m(var0))};
            }
            ax.jb.b.m(var0);
            var2_2 = 0;
            block8: while (true) {
                block19: {
                    if (var2_2 >= ((int[])(var5_4 = ax.jb.b.c)).length) {
                        throw new UnknownHostException(var0);
                    }
                    var3_3 = var5_4[var2_2];
                    if (var3_3 == 0) ** GOTO lbl-1000
                    if (var3_3 == 1) ** GOTO lbl58
                    if (var3_3 == 2) ** GOTO lbl23
                    if (var3_3 != 3) ** GOTO lbl20
                    var6_7 /* !! */  = ax.nb.a.b(var0);
                    var5_4 = var6_7 /* !! */ ;
                    if (var6_7 /* !! */  == null) {
                        break block19;
                    }
                    ** GOTO lbl72
lbl20:
                    // 1 sources

                    var5_4 = new UnknownHostException;
                    var5_4(var0);
                    throw var5_4;
lbl23:
                    // 1 sources

                    if (!ax.jb.b.h(var0)) {
                        if (Build.VERSION.SDK_INT >= 31 && !(var4_10 = var0.contains("."))) {
                            try {
                                var5_4 = InetAddress.getAllByName(var0);
                            }
                            catch (UnknownHostException var5_5) {
                                var5_4 = new StringBuilder;
                                var5_4();
                                var5_4.append(var0);
                                var5_4.append(".local");
                                var5_4 = InetAddress.getAllByName(var5_4.toString());
                            }
                        } else {
                            var5_4 = InetAddress.getAllByName(var0);
                        }
                        var6_7 /* !! */  = new b[((int[])var5_4).length];
                        var3_3 = 0;
                        while (true) {
                            if (var3_3 >= ((int[])var5_4).length) {
                                return var6_7 /* !! */ ;
                            }
                            var6_7 /* !! */ [var3_3] = new b(var5_4[var3_3]);
                            ++var3_3;
                        }
                    }
                }
lbl48:
                // 5 sources

                while (true) {
                    ++var2_2;
                    continue block8;
                    break;
                }
                break;
            }
        }
        throw new UnknownHostException();
        catch (IOException var5_6) {
            ** GOTO lbl48
        }
        {
            var5_4 = new UnknownHostException;
            var5_4(var0);
            throw var5_4;
lbl58:
            // 1 sources

            if (var0.length() > 15 || (var5_4 = var1_1 != false ? (Object)ax.jb.b.j(var0, ax.jb.b.d) : (Object)g.l(var0, 32, null, ax.jb.b.d)) == null || ((int[])var5_4).length == 0) ** GOTO lbl48
            var7_8 = new ArrayList<b[]>();
            ** for (var3_3 = 0;
            ; var3_3 < ((Object)var5_4).length; ++var3_3)
        }
lbl-1000:
        // 1 sources

        {
            var8_9 = var5_4[var3_3];
            if (var8_9 == null) continue;
            {
                var6_7 /* !! */  = new b(var8_9);
                var7_8.add(var6_7 /* !! */ );
            }
            continue;
        }
lbl-1000:
        // 1 sources

        {
            if (var7_8.size() == 0) ** GOTO lbl48
            return var7_8.toArray(new b[0]);
        }
lbl-1000:
        // 1 sources

        {
            if (var0 != "\u0001\u0002__MSBROWSE__\u0002" && var0.length() <= 15) ** break;
            ** continue;
            var5_4 = var1_1 != false ? (Object)ax.jb.b.j(var0, g.w()) : (Object)g.o(var0, 32, null, g.w());
lbl72:
            // 2 sources

            var6_7 /* !! */  = new b(var5_4);
        }
        return new b[]{var6_7 /* !! */ };
    }

    public static b d(String string) throws UnknownHostException {
        return ax.jb.b.e(string, false);
    }

    public static b e(String bArray, boolean bl) throws UnknownHostException {
        if ((bArray = ax.jb.b.c((String)bArray, bl)).length > 1) {
            int n8 = bArray.length;
            for (int i8 = 0; i8 < n8; ++i8) {
                b b8 = bArray[i8];
                if (b8.b() instanceof Inet6Address) {
                    continue;
                }
                return b8;
            }
        }
        return bArray[0];
    }

    static boolean h(String string) {
        for (int i8 = 0; i8 < string.length(); ++i8) {
            if (Character.isDigit(string.charAt(i8))) continue;
            return false;
        }
        return true;
    }

    static boolean i(String object) {
        if (Character.isDigit(((String)object).charAt(0))) {
            int n8 = ((String)object).length();
            object = ((String)object).toCharArray();
            int n9 = 0;
            int n10 = 0;
            while (n9 < n8) {
                int n11 = n9 + 1;
                if (!Character.isDigit((char)object[n9])) break;
                if (n11 == n8 && n10 == 3) {
                    return true;
                }
                if (n11 < n8 && object[n11] == 46) {
                    ++n10;
                    n9 += 2;
                    continue;
                }
                n9 = n11;
            }
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    static g[] j(String gArray, InetAddress object) throws UnknownHostException {
        Throwable throwable2;
        block9: {
            b b8 = new b(2);
            int n8 = g.y((InetAddress)object) ? 27 : 29;
            a a8 = new a(b8, (String)gArray, n8, null, (InetAddress)object);
            object = new a(b8, (String)gArray, 32, null, (InetAddress)object);
            a8.setDaemon(true);
            ((Thread)object).setDaemon(true);
            try {
                a8.start();
                ((Thread)object).start();
                while (b8.a > 0 && a8.f0 == null && ((a)object).f0 == null) {
                    b8.wait();
                }
            }
            catch (Throwable throwable2) {
                break block9;
            }
            gArray = a8.f0;
            if (gArray != null) {
                return gArray;
            }
            gArray = ((a)object).f0;
            if (gArray == null) throw a8.h0;
            return gArray;
        }
        try {
            throw throwable2;
        }
        catch (InterruptedException interruptedException) {
            throw new UnknownHostException((String)gArray);
        }
    }

    public static void l(boolean bl) {
        e = bl;
    }

    private static void m(String object) {
        int[] nArray = c;
        if (nArray == null || nArray.length != 3) {
            c = new int[3];
        }
        if (!e && object != null && !((String)object).contains(".")) {
            object = c;
            object[0] = 3;
            object[1] = true;
            object[2] = 2;
            return;
        }
        object = c;
        object[0] = 3;
        object[1] = 2;
        object[2] = true;
    }

    public String a() {
        int n8;
        Object object = this.a;
        if (object instanceof g) {
            return ((g)object).g();
        }
        this.b = object = ((InetAddress)object).getHostName();
        this.b = ax.jb.b.i((String)object) ? "*SMBSERVER     " : ((n8 = this.b.indexOf(46)) > 1 && n8 < 15 ? this.b.substring(0, n8).toUpperCase() : (this.b.length() > 15 ? "*SMBSERVER     " : this.b.toUpperCase()));
        return this.b;
    }

    public Object b() {
        return this.a;
    }

    public boolean equals(Object object) {
        return object instanceof b && this.a.equals(((b)object).a);
    }

    public String f() {
        Object object = this.a;
        if (object instanceof g) {
            return ((g)object).q();
        }
        return ((InetAddress)object).getHostAddress();
    }

    public String g() {
        Object object = this.a;
        if (object instanceof g) {
            return ((g)object).r();
        }
        return ((InetAddress)object).getHostName();
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String k() {
        Object object = this.a;
        if (object instanceof g) {
            return ((g)object).z();
        }
        if (this.b != "*SMBSERVER     ") {
            this.b = "*SMBSERVER     ";
            return "*SMBSERVER     ";
        }
        return null;
    }

    public String toString() {
        return this.a.toString();
    }

    static class a
    extends Thread {
        String c0;
        String d0;
        int e0;
        g[] f0;
        InetAddress g0;
        UnknownHostException h0;
        b q;

        a(b b8, String string, int n8, String string2, InetAddress inetAddress) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("JCIFS-QueryThread: ");
            stringBuilder.append(string);
            super(stringBuilder.toString());
            this.f0 = null;
            this.q = b8;
            this.c0 = string;
            this.e0 = n8;
            this.d0 = string2;
            this.g0 = inetAddress;
        }

        /*
         * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
         * Unable to fully structure code
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        public void run() {
            block15: {
                try {
                    this.f0 = g.l(this.c0, this.e0, this.d0, this.g0);
                    var1_1 = this.q;
                }
                catch (Throwable var2_7) {
                    break block15;
                }
                catch (Exception var2_8) {
                    ** GOTO lbl-1000
                }
                catch (UnknownHostException var1_2) {
                    ** GOTO lbl-1000
                }
                synchronized (var1_1) {
                    var2_6 = this.q;
                    --var2_6.a;
                    var2_6.notify();
                    return;
                }
lbl-1000:
                // 1 sources

                {
                    var1_3 = new UnknownHostException(var2_8.getMessage());
                    this.h0 = var1_3;
                    var1_3 = this.q;
                }
                synchronized (var1_3) {
                    var2_9 = this.q;
                    --var2_9.a;
                    var2_9.notify();
                    return;
                }
lbl-1000:
                // 1 sources

                {
                    this.h0 = var1_2;
                    var1_4 = this.q;
                }
                synchronized (var1_4) {
                    var2_10 = this.q;
                    --var2_10.a;
                    var2_10.notify();
                    return;
                }
            }
            var1_5 = this.q;
            synchronized (var1_5) {
                var3_11 = this.q;
                --var3_11.a;
                var3_11.notify();
                throw var2_7;
            }
        }
    }

    static class b {
        int a;

        b(int n8) {
            this.a = n8;
        }
    }
}

