package ax.nb;

import ax.jb.C2345a;
import ax.qb.C2896d;
import ax.qb.C2897e;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.StringTokenizer;
import okhttp3.internal.http2.Settings;

/* renamed from: ax.nb.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class RunnableC2642e implements Runnable {
    private static final int p0 = C2345a.d("jcifs.netbios.snd_buf_size", 576);
    private static final int q0 = C2345a.d("jcifs.netbios.rcv_buf_size", 576);
    private static final int r0 = C2345a.d("jcifs.netbios.soTimeout", 5000);
    private static final int s0 = C2345a.d("jcifs.netbios.retryCount", 2);
    private static final int t0 = C2345a.d("jcifs.netbios.retryTimeout", 3000);
    private static final int u0 = C2345a.d("jcifs.netbios.lport", 0);
    private static final InetAddress v0 = C2345a.b("jcifs.netbios.laddr", null);
    private static final String w0 = C2345a.g("jcifs.resolveOrder");
    private static C2897e x0 = C2897e.a();
    private int c0;
    private int d0;
    private byte[] e0;
    private byte[] f0;
    private DatagramSocket g0;
    private DatagramPacket h0;
    private DatagramPacket i0;
    private HashMap j0;
    private Thread k0;
    private int l0;
    private int[] m0;
    InetAddress n0;
    InetAddress o0;
    private final Object q;

    RunnableC2642e() {
        this(u0, v0);
    }

    void a(int i) throws IOException {
        this.d0 = 0;
        int i2 = r0;
        if (i2 != 0) {
            this.d0 = Math.max(i2, i);
        }
        if (this.g0 == null) {
            this.g0 = new DatagramSocket(this.c0, this.n0);
            Thread thread = new Thread(this, "JCIFS-NameServiceClient");
            this.k0 = thread;
            thread.setDaemon(true);
            this.k0.start();
        }
    }

    C2644g[] b(C2639b c2639b, InetAddress inetAddress) throws UnknownHostException {
        int i;
        C2640c c2640c = new C2640c(c2639b);
        C2641d c2641d = new C2641d();
        if (inetAddress == null) {
            inetAddress = C2644g.w();
        }
        c2640c.y = inetAddress;
        boolean z = inetAddress == null;
        c2640c.p = z;
        if (z) {
            c2640c.y = this.o0;
            i = s0;
        } else {
            c2640c.p = false;
            i = 1;
        }
        do {
            try {
                g(c2640c, c2641d, t0);
                if (!c2641d.j || c2641d.e != 0) {
                    i--;
                    if (i <= 0) {
                        break;
                    }
                } else {
                    return c2641d.b;
                }
            } catch (IOException e) {
                if (C2897e.c0 > 1) {
                    e.printStackTrace(x0);
                }
                throw new UnknownHostException(c2639b.a);
            }
        } while (c2640c.p);
        throw new UnknownHostException(c2639b.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x00da, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    ax.nb.C2644g c(ax.nb.C2639b r8, java.net.InetAddress r9) throws java.net.UnknownHostException {
        /*
            Method dump skipped, instructions count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.nb.RunnableC2642e.c(ax.nb.b, java.net.InetAddress):ax.nb.g");
    }

    int d() {
        int i = this.l0 + 1;
        this.l0 = i;
        if ((i & Settings.DEFAULT_INITIAL_WINDOW_SIZE) == 0) {
            this.l0 = 1;
        }
        return this.l0;
    }

    C2644g[] e(C2644g c2644g) throws UnknownHostException {
        return f(c2644g, s0, t0);
    }

    C2644g[] f(C2644g c2644g, int i, int i2) throws UnknownHostException {
        C2647j c2647j = new C2647j(c2644g);
        int i3 = 0;
        AbstractC2643f c2646i = new C2646i(new C2639b("*\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000", 0, null));
        c2646i.y = c2644g.s();
        while (true) {
            int i4 = i - 1;
            if (i <= 0) {
                throw new UnknownHostException(c2644g.a.a);
            }
            try {
                g(c2646i, c2647j, i2);
                if (c2647j.j && c2647j.e == 0) {
                    int hashCode = c2646i.y.hashCode();
                    while (true) {
                        C2644g[] c2644gArr = c2647j.D;
                        if (i3 >= c2644gArr.length) {
                            return c2644gArr;
                        }
                        c2644gArr[i3].a.d = hashCode;
                        i3++;
                    }
                } else {
                    i = i4;
                }
            } catch (IOException e) {
                if (C2897e.c0 > 1) {
                    e.printStackTrace(x0);
                }
                throw new UnknownHostException(c2644g.toString());
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:72:0x00b5
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    void g(ax.nb.AbstractC2643f r11, ax.nb.AbstractC2643f r12, int r13) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.nb.RunnableC2642e.g(ax.nb.f, ax.nb.f, int):void");
    }

    void h() {
        synchronized (this.q) {
            try {
                DatagramSocket datagramSocket = this.g0;
                if (datagramSocket != null) {
                    datagramSocket.close();
                    this.g0 = null;
                }
                this.k0 = null;
                this.j0.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        while (this.k0 == Thread.currentThread()) {
            try {
                try {
                    this.h0.setLength(q0);
                    this.g0.setSoTimeout(this.d0);
                    this.g0.receive(this.h0);
                    if (C2897e.c0 > 3) {
                        x0.println("NetBIOS: new data read from socket");
                    }
                    AbstractC2643f abstractC2643f = (AbstractC2643f) this.j0.get(new Integer(AbstractC2643f.e(this.f0, 0)));
                    if (abstractC2643f != null && !abstractC2643f.j) {
                        synchronized (abstractC2643f) {
                            try {
                                abstractC2643f.i(this.f0, 0);
                                abstractC2643f.j = true;
                                if (C2897e.c0 > 3) {
                                    x0.println(abstractC2643f);
                                    C2896d.a(x0, this.f0, 0, this.h0.getLength());
                                }
                                abstractC2643f.notify();
                            } finally {
                            }
                        }
                    }
                } catch (SocketTimeoutException unused) {
                    h();
                    return;
                } catch (Exception e) {
                    if (C2897e.c0 > 2) {
                        e.printStackTrace(x0);
                    }
                    h();
                    return;
                }
            } catch (Throwable th) {
                h();
                throw th;
            }
        }
        h();
    }

    RunnableC2642e(int i, InetAddress inetAddress) {
        int i2;
        this.q = new Object();
        this.j0 = new HashMap();
        this.l0 = 0;
        this.c0 = i;
        this.n0 = inetAddress;
        try {
            this.o0 = C2345a.b("jcifs.netbios.baddr", InetAddress.getByName("255.255.255.255"));
        } catch (UnknownHostException unused) {
        }
        int i3 = p0;
        this.e0 = new byte[i3];
        int i4 = q0;
        this.f0 = new byte[i4];
        this.i0 = new DatagramPacket(this.e0, i3, this.o0, 137);
        this.h0 = new DatagramPacket(this.f0, i4);
        String str = w0;
        if (str == null || str.length() == 0) {
            if (C2644g.w() == null) {
                this.m0 = new int[]{1, 2};
                return;
            } else {
                this.m0 = new int[]{1, 3, 2};
                return;
            }
        }
        int[] iArr = new int[3];
        StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
        int i5 = 0;
        while (stringTokenizer.hasMoreTokens()) {
            String trim = stringTokenizer.nextToken().trim();
            if (trim.equalsIgnoreCase("LMHOSTS")) {
                i2 = i5 + 1;
                iArr[i5] = 1;
            } else if (trim.equalsIgnoreCase("WINS")) {
                if (C2644g.w() != null) {
                    i2 = i5 + 1;
                    iArr[i5] = 3;
                } else if (C2897e.c0 > 1) {
                    x0.println("NetBIOS resolveOrder specifies WINS however the jcifs.netbios.wins property has not been set");
                }
            } else if (trim.equalsIgnoreCase("BCAST")) {
                i2 = i5 + 1;
                iArr[i5] = 2;
            } else if (!trim.equalsIgnoreCase("DNS") && C2897e.c0 > 1) {
                x0.println("unknown resolver method: " + trim);
            }
            i5 = i2;
        }
        int[] iArr2 = new int[i5];
        this.m0 = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, i5);
    }
}
