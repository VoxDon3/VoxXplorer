package ax.pb;

import ax.jb.C2346b;
import ax.nb.C2639b;
import ax.nb.C2644g;
import ax.nb.C2645h;
import ax.nb.C2648k;
import ax.qb.C2894b;
import ax.qb.C2896d;
import ax.qb.C2897e;
import ax.rb.AbstractC3023b;
import ax.rb.AbstractRunnableC3024c;
import ax.rb.C3025d;
import ax.rb.InterfaceC3022a;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ConnectException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.NoRouteToHostException;
import java.net.Socket;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.ListIterator;
import okhttp3.HttpUrl;
import okhttp3.internal.http2.Settings;

/* loaded from: classes3.dex */
public class k0 extends AbstractRunnableC3024c implements Z {
    static final byte[] F0 = new byte[Settings.DEFAULT_INITIAL_WINDOW_SIZE];
    static final C2792E G0 = new C2792E();
    static C2897e H0 = C2897e.a();
    static HashMap I0 = null;
    InetAddress i0;
    int j0;
    C2346b k0;
    Socket l0;
    int m0;
    int n0;
    OutputStream o0;
    InputStream p0;
    byte[] q0 = new byte[512];
    C2821v r0 = new C2821v();
    long s0 = System.currentTimeMillis() + Z.T;
    LinkedList t0 = new LinkedList();
    C2819t u0 = null;
    LinkedList v0 = new LinkedList();
    a w0 = new a();
    int x0 = Z.N;
    int y0 = Z.w;
    int z0 = Z.x;
    int A0 = Z.y;
    int B0 = Z.O;
    int C0 = 0;
    boolean D0 = Z.z;
    String E0 = null;

    class a {
        int a;
        int b;
        int c;
        int d;
        String e;
        int f;
        int g;
        boolean h;
        boolean i;
        boolean j;
        int k;
        int l;
        long m;
        int n;
        int o;
        byte[] p;
        byte[] q;

        a() {
        }
    }

    k0(C2346b c2346b, int i, InetAddress inetAddress, int i2) {
        this.k0 = c2346b;
        this.m0 = i;
        this.i0 = inetAddress;
        this.j0 = i2;
    }

    public static synchronized k0 s(C2346b c2346b, int i) {
        k0 t;
        synchronized (k0.class) {
            t = t(c2346b, i, Z.u, Z.v, null);
        }
        return t;
    }

    static synchronized k0 t(C2346b c2346b, int i, InetAddress inetAddress, int i2, String str) {
        int i3;
        synchronized (k0.class) {
            LinkedList linkedList = Z.R;
            synchronized (linkedList) {
                try {
                    if (Z.S != 1) {
                        ListIterator listIterator = linkedList.listIterator();
                        while (listIterator.hasNext()) {
                            k0 k0Var = (k0) listIterator.next();
                            C2346b c2346b2 = c2346b;
                            int i4 = i;
                            InetAddress inetAddress2 = inetAddress;
                            int i5 = i2;
                            String str2 = str;
                            if (!k0Var.w(c2346b2, i4, inetAddress2, i5, str2) || ((i3 = Z.S) != 0 && k0Var.v0.size() >= i3)) {
                                c2346b = c2346b2;
                                i = i4;
                                inetAddress = inetAddress2;
                                i2 = i5;
                                str = str2;
                            }
                            return k0Var;
                        }
                    }
                    k0 k0Var2 = new k0(c2346b, i, inetAddress, i2);
                    Z.R.add(0, k0Var2);
                    return k0Var2;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private void x(int i, AbstractC2818s abstractC2818s) throws IOException {
        synchronized (this.q0) {
            try {
                if (i == 139) {
                    z();
                } else {
                    if (i == 0) {
                        i = 445;
                    }
                    Socket socket = new Socket();
                    this.l0 = socket;
                    if (this.i0 != null) {
                        socket.bind(new InetSocketAddress(this.i0, this.j0));
                    }
                    this.l0.connect(new InetSocketAddress(this.k0.f(), i), Z.U);
                    this.l0.setSoTimeout(Z.T);
                    this.o0 = this.l0.getOutputStream();
                    this.p0 = this.l0.getInputStream();
                }
                int i2 = this.n0 + 1;
                this.n0 = i2;
                if (i2 == 32000) {
                    this.n0 = 1;
                }
                C2792E c2792e = G0;
                c2792e.n0 = this.n0;
                int e = c2792e.e(this.q0, 4);
                C2894b.m(e & Settings.DEFAULT_INITIAL_WINDOW_SIZE, this.q0, 0);
                if (C2897e.c0 >= 4) {
                    H0.println(c2792e);
                    if (C2897e.c0 >= 6) {
                        C2896d.a(H0, this.q0, 4, e);
                    }
                }
                this.o0.write(this.q0, 0, e + 4);
                this.o0.flush();
                if (j() == null) {
                    throw new IOException("transport closed in negotiate");
                }
                int c = C2894b.c(this.q0, 2) & 65535;
                if (c >= 33) {
                    int i3 = c + 4;
                    byte[] bArr = this.q0;
                    if (i3 <= bArr.length) {
                        AbstractRunnableC3024c.k(this.p0, bArr, 36, c - 32);
                        abstractC2818s.d(this.q0, 4);
                        if (C2897e.c0 >= 4) {
                            H0.println(abstractC2818s);
                            if (C2897e.c0 >= 6) {
                                C2896d.a(H0, this.q0, 4, e);
                            }
                        }
                    }
                }
                throw new IOException("Invalid payload size: " + c);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // ax.rb.AbstractRunnableC3024c
    protected void c() throws IOException {
        F f = new F(this.w0);
        int i = 139;
        try {
            x(this.m0, f);
        } catch (ConnectException unused) {
            int i2 = this.m0;
            if (i2 != 0 && i2 != 445) {
                i = 445;
            }
            this.m0 = i;
            x(i, f);
        } catch (NoRouteToHostException unused2) {
            int i3 = this.m0;
            if (i3 != 0 && i3 != 445) {
                i = 445;
            }
            this.m0 = i;
            x(i, f);
        }
        if (f.C0 > 10) {
            throw new C2794a0("This client does not support the negotiated dialect.");
        }
        a aVar = this.w0;
        if ((aVar.d & Integer.MIN_VALUE) != Integer.MIN_VALUE && aVar.o != 8 && Z.G == 0) {
            throw new C2794a0("Unexpected encryption key length: " + this.w0.o);
        }
        this.E0 = this.k0.g();
        a aVar2 = this.w0;
        if (aVar2.j || (aVar2.i && Z.C)) {
            this.x0 |= 4;
        } else {
            this.x0 &= 65531;
        }
        int min = Math.min(this.y0, aVar2.a);
        this.y0 = min;
        if (min < 1) {
            this.y0 = 1;
        }
        this.z0 = Math.min(this.z0, this.w0.b);
        int i4 = this.B0;
        int i5 = this.w0.d;
        int i6 = i4 & i5;
        this.B0 = i6;
        if ((i5 & Integer.MIN_VALUE) == Integer.MIN_VALUE) {
            this.B0 = i6 | Integer.MIN_VALUE;
        }
        int i7 = this.B0;
        if ((i7 & 4) == 0) {
            if (Z.A) {
                this.B0 = i7 | 4;
            } else {
                this.D0 = false;
                this.x0 &= 32767;
            }
        }
    }

    @Override // ax.rb.AbstractRunnableC3024c
    protected void d(boolean z) throws IOException {
        ListIterator listIterator = this.v0.listIterator();
        while (listIterator.hasNext()) {
            try {
                ((i0) listIterator.next()).b(z);
            } catch (Throwable th) {
                this.u0 = null;
                this.l0 = null;
                this.E0 = null;
                throw th;
            }
        }
        Socket socket = this.l0;
        if (socket != null) {
            socket.shutdownOutput();
        }
        OutputStream outputStream = this.o0;
        if (outputStream != null) {
            outputStream.close();
        }
        InputStream inputStream = this.p0;
        if (inputStream != null) {
            inputStream.close();
        }
        Socket socket2 = this.l0;
        if (socket2 != null) {
            socket2.close();
        }
        this.u0 = null;
        this.l0 = null;
        this.E0 = null;
    }

    @Override // ax.rb.AbstractRunnableC3024c
    protected void e(AbstractC3023b abstractC3023b) throws IOException {
        AbstractC2818s abstractC2818s = (AbstractC2818s) abstractC3023b;
        abstractC2818s.q0 = this.D0;
        abstractC2818s.s0 = (this.B0 & Integer.MIN_VALUE) == Integer.MIN_VALUE;
        byte[] bArr = F0;
        synchronized (bArr) {
            try {
                System.arraycopy(this.q0, 0, bArr, 0, 36);
                int c = C2894b.c(bArr, 2) & 65535;
                if (c < 33 || c + 4 > this.A0) {
                    throw new IOException("Invalid payload size: " + c);
                }
                int f = C2894b.f(bArr, 9);
                if (abstractC2818s.d0 == 46 && (f == 0 || f == -2147483643)) {
                    L l = (L) abstractC2818s;
                    AbstractRunnableC3024c.k(this.p0, bArr, 36, 27);
                    abstractC2818s.d(bArr, 4);
                    int i = l.J0 - 59;
                    if (l.p0 > 0 && i > 0 && i < 4) {
                        AbstractRunnableC3024c.k(this.p0, bArr, 63, i);
                    }
                    int i2 = l.I0;
                    if (i2 > 0) {
                        AbstractRunnableC3024c.k(this.p0, l.F0, l.G0, i2);
                    }
                } else {
                    AbstractRunnableC3024c.k(this.p0, bArr, 36, c - 32);
                    abstractC2818s.d(bArr, 4);
                    if (abstractC2818s instanceof Q) {
                        ((Q) abstractC2818s).nextElement();
                    }
                }
                C2819t c2819t = this.u0;
                if (c2819t != null && abstractC2818s.i0 == 0) {
                    c2819t.d(bArr, 4, abstractC2818s);
                }
                if (C2897e.c0 >= 4) {
                    H0.println(abstractC3023b);
                    if (C2897e.c0 >= 6) {
                        C2896d.a(H0, bArr, 4, c);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // ax.rb.AbstractRunnableC3024c
    protected void f(InterfaceC3022a interfaceC3022a) throws IOException {
        byte[] bArr = F0;
        synchronized (bArr) {
            try {
                AbstractC2818s abstractC2818s = (AbstractC2818s) interfaceC3022a;
                int e = abstractC2818s.e(bArr, 4);
                C2894b.m(65535 & e, bArr, 0);
                if (C2897e.c0 >= 4) {
                    do {
                        H0.println(abstractC2818s);
                        if (!(abstractC2818s instanceof AbstractC2795b)) {
                            break;
                        } else {
                            abstractC2818s = ((AbstractC2795b) abstractC2818s).E0;
                        }
                    } while (abstractC2818s != null);
                    if (C2897e.c0 >= 6) {
                        C2896d.a(H0, F0, 4, e);
                    }
                }
                this.o0.write(F0, 0, e + 4);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // ax.rb.AbstractRunnableC3024c
    protected void g() throws IOException {
        int c = C2894b.c(this.q0, 2) & 65535;
        if (c >= 33 && c + 4 <= this.A0) {
            this.p0.skip(c - 32);
        } else {
            this.p0.skip(r0.available());
        }
    }

    @Override // ax.rb.AbstractRunnableC3024c
    protected void i(InterfaceC3022a interfaceC3022a) throws IOException {
        int i = this.n0 + 1;
        this.n0 = i;
        if (i == 32000) {
            this.n0 = 1;
        }
        ((AbstractC2818s) interfaceC3022a).n0 = this.n0;
    }

    @Override // ax.rb.AbstractRunnableC3024c
    protected InterfaceC3022a j() throws IOException {
        while (AbstractRunnableC3024c.k(this.p0, this.q0, 0, 4) >= 4) {
            byte[] bArr = this.q0;
            if (bArr[0] != -123) {
                if (AbstractRunnableC3024c.k(this.p0, bArr, 4, 32) < 32) {
                    return null;
                }
                if (C2897e.c0 >= 4) {
                    H0.println("New data read: " + this);
                    C2896d.a(H0, this.q0, 4, 32);
                }
                while (true) {
                    byte[] bArr2 = this.q0;
                    if (bArr2[0] == 0 && bArr2[1] == 0 && bArr2[4] == -1 && bArr2[5] == 83 && bArr2[6] == 77 && bArr2[7] == 66) {
                        this.r0.n0 = C2894b.d(bArr2, 34) & 65535;
                        return this.r0;
                    }
                    int i = 0;
                    while (i < 35) {
                        byte[] bArr3 = this.q0;
                        int i2 = i + 1;
                        bArr3[i] = bArr3[i2];
                        i = i2;
                    }
                    int read = this.p0.read();
                    if (read == -1) {
                        return null;
                    }
                    this.q0[35] = (byte) read;
                }
            }
        }
        return null;
    }

    void m(AbstractC2818s abstractC2818s, AbstractC2818s abstractC2818s2) throws C2794a0 {
        int e = C2794a0.e(abstractC2818s2.i0);
        abstractC2818s2.i0 = e;
        if (e != 0) {
            switch (e) {
                case -2147483643:
                case -1073741802:
                case 0:
                    break;
                case -1073741790:
                case -1073741718:
                case -1073741428:
                case -1073741260:
                    break;
                case -1073741225:
                    r rVar = abstractC2818s.w0;
                    if (rVar == null) {
                        throw new C2794a0(abstractC2818s2.i0, (Throwable) null);
                    }
                    C2801e q = q(rVar, abstractC2818s.x0, 1);
                    if (q == null) {
                        throw new C2794a0(abstractC2818s2.i0, (Throwable) null);
                    }
                    C2796b0.D0.d(abstractC2818s.x0, q);
                    throw q;
                default:
                    switch (e) {
                        case -1073741715:
                        case -1073741714:
                        case -1073741713:
                        case -1073741712:
                        case -1073741711:
                        case -1073741710:
                            break;
                        default:
                            throw new C2794a0(abstractC2818s2.i0, (Throwable) null);
                    }
            }
            throw new C2820u(abstractC2818s2.i0);
        }
        if (abstractC2818s2.v0) {
            throw new C2794a0("Signature verification failed.");
        }
    }

    public void n() throws C2794a0 {
        try {
            super.a(Z.Q);
        } catch (C3025d e) {
            throw new C2794a0("Failed to connect: " + this.k0, e);
        }
    }

    void o(String str, String[] strArr) {
        int length = strArr.length - 1;
        int length2 = str.length();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i != length) {
            if (i2 == length2 || str.charAt(i2) == '\\') {
                strArr[i] = str.substring(i3, i2);
                i3 = i2 + 1;
                i++;
            }
            int i4 = i2 + 1;
            if (i2 >= length2) {
                while (i < strArr.length) {
                    strArr[i] = HttpUrl.FRAGMENT_ENCODE_SET;
                    i++;
                }
                return;
            }
            i2 = i4;
        }
        strArr[length] = str.substring(i3);
    }

    protected void p(InterfaceC3022a interfaceC3022a) throws IOException {
        try {
            f(interfaceC3022a);
        } catch (IOException e) {
            if (C2897e.c0 > 2) {
                e.printStackTrace(H0);
            }
            try {
                b(true);
            } catch (IOException e2) {
                e2.printStackTrace(H0);
            }
            throw e;
        }
    }

    C2801e q(r rVar, String str, int i) throws C2794a0 {
        l0 a2 = r(rVar).a("IPC$", null);
        q0 q0Var = new q0();
        a2.b(new p0(str), q0Var);
        int i2 = q0Var.Z0;
        if (i2 == 0) {
            return null;
        }
        if (i == 0 || i2 < i) {
            i = i2;
        }
        C2801e c2801e = new C2801e();
        String[] strArr = new String[4];
        long currentTimeMillis = System.currentTimeMillis() + (C2799d.e * 1000);
        int i3 = 0;
        while (true) {
            c2801e.j0 = rVar.g0;
            c2801e.e0 = q0Var.b1[i3].j;
            c2801e.k0 = currentTimeMillis;
            if (str.equals(HttpUrl.FRAGMENT_ENCODE_SET)) {
                c2801e.f0 = q0Var.b1[i3].k.substring(1).toLowerCase();
            } else {
                o(q0Var.b1[i3].l, strArr);
                c2801e.f0 = strArr[1];
                c2801e.g0 = strArr[2];
                c2801e.i0 = strArr[3];
            }
            c2801e.d0 = q0Var.Y0;
            i3++;
            if (i3 == i) {
                return c2801e.l0;
            }
            c2801e.f(new C2801e());
            c2801e = c2801e.l0;
        }
    }

    synchronized i0 r(r rVar) {
        ListIterator listIterator = this.v0.listIterator();
        while (listIterator.hasNext()) {
            i0 i0Var = (i0) listIterator.next();
            if (i0Var.e(rVar)) {
                i0Var.i = rVar;
                return i0Var;
            }
        }
        int i = Z.T;
        if (i > 0) {
            long j = this.s0;
            long currentTimeMillis = System.currentTimeMillis();
            if (j < currentTimeMillis) {
                this.s0 = i + currentTimeMillis;
                ListIterator listIterator2 = this.v0.listIterator();
                while (listIterator2.hasNext()) {
                    i0 i0Var2 = (i0) listIterator2.next();
                    if (i0Var2.j < currentTimeMillis) {
                        i0Var2.b(false);
                    }
                }
            }
        }
        i0 i0Var3 = new i0(this.k0, this.m0, this.i0, this.j0, rVar);
        i0Var3.h = this;
        this.v0.add(i0Var3);
        return i0Var3;
    }

    @Override // ax.rb.AbstractRunnableC3024c
    public String toString() {
        return super.toString() + "[" + this.k0 + ":" + this.m0 + "]";
    }

    boolean u(int i) throws C2794a0 {
        try {
            a(Z.Q);
            return (this.B0 & i) == i;
        } catch (IOException e) {
            throw new C2794a0(e.getMessage(), e);
        }
    }

    boolean v(r rVar) {
        r rVar2;
        return ((this.x0 & 4) == 0 || this.u0 != null || rVar == (rVar2 = r.q0) || rVar2.equals(rVar)) ? false : true;
    }

    boolean w(C2346b c2346b, int i, InetAddress inetAddress, int i2, String str) {
        int i3;
        if (str == null) {
            str = c2346b.g();
        }
        String str2 = this.E0;
        if ((str2 != null && !str.equalsIgnoreCase(str2)) || !c2346b.equals(this.k0)) {
            return false;
        }
        if (i != 0 && i != (i3 = this.m0) && (i != 445 || i3 != 139)) {
            return false;
        }
        InetAddress inetAddress2 = this.i0;
        return (inetAddress == inetAddress2 || (inetAddress != null && inetAddress.equals(inetAddress2))) && i2 == this.j0;
    }

    void y(AbstractC2818s abstractC2818s, AbstractC2818s abstractC2818s2) throws C2794a0 {
        n();
        abstractC2818s.j0 |= this.x0;
        abstractC2818s.q0 = this.D0;
        abstractC2818s.z0 = abstractC2818s2;
        if (abstractC2818s.y0 == null) {
            abstractC2818s.y0 = this.u0;
        }
        try {
            if (abstractC2818s2 == null) {
                p(abstractC2818s);
                return;
            }
            if (abstractC2818s instanceof P) {
                abstractC2818s2.d0 = abstractC2818s.d0;
                P p = (P) abstractC2818s;
                Q q = (Q) abstractC2818s2;
                p.a1 = this.z0;
                q.s();
                try {
                    C2797c.b(p, q);
                    p.nextElement();
                    if (p.hasMoreElements()) {
                        AbstractC2818s c2821v = new C2821v();
                        super.l(p, c2821v, Z.Q);
                        if (c2821v.i0 != 0) {
                            m(p, c2821v);
                        }
                        p.nextElement();
                    } else {
                        i(p);
                    }
                    synchronized (this) {
                        try {
                            abstractC2818s2.r0 = false;
                            q.c0 = false;
                            try {
                                this.f0.put(p, q);
                                do {
                                    p(p);
                                    if (!p.hasMoreElements()) {
                                        break;
                                    }
                                } while (p.nextElement() != null);
                                long j = Z.Q;
                                q.q = System.currentTimeMillis() + j;
                                while (q.hasMoreElements()) {
                                    wait(j);
                                    j = q.q - System.currentTimeMillis();
                                    if (j <= 0) {
                                        throw new C3025d(this + " timedout waiting for response to " + p);
                                    }
                                }
                                if (abstractC2818s2.i0 != 0) {
                                    m(p, q);
                                }
                                this.f0.remove(p);
                            } catch (InterruptedException e) {
                                throw new C3025d(e);
                            }
                        } catch (Throwable th) {
                            this.f0.remove(p);
                            throw th;
                        }
                    }
                    C2797c.c(p.b1);
                    C2797c.c(q.U0);
                } catch (Throwable th2) {
                    C2797c.c(p.b1);
                    C2797c.c(q.U0);
                    throw th2;
                }
            } else {
                abstractC2818s2.d0 = abstractC2818s.d0;
                super.l(abstractC2818s, abstractC2818s2, Z.Q);
            }
            m(abstractC2818s, abstractC2818s2);
        } catch (C2794a0 e2) {
            throw e2;
        } catch (IOException e3) {
            throw new C2794a0(e3.getMessage(), e3);
        }
    }

    void z() throws IOException {
        String k;
        C2639b c2639b = new C2639b(this.k0.a(), 32, null);
        do {
            Socket socket = new Socket();
            this.l0 = socket;
            if (this.i0 != null) {
                socket.bind(new InetSocketAddress(this.i0, this.j0));
            }
            this.l0.connect(new InetSocketAddress(this.k0.f(), 139), Z.U);
            this.l0.setSoTimeout(Z.T);
            this.o0 = this.l0.getOutputStream();
            this.p0 = this.l0.getInputStream();
            C2648k c2648k = new C2648k(c2639b, C2644g.u());
            OutputStream outputStream = this.o0;
            byte[] bArr = this.q0;
            outputStream.write(bArr, 0, c2648k.d(bArr, 0));
            if (AbstractRunnableC3024c.k(this.p0, this.q0, 0, 4) < 4) {
                try {
                    this.l0.close();
                } catch (IOException unused) {
                }
                throw new C2794a0("EOF during NetBIOS session request");
            }
            int i = this.q0[0] & 255;
            if (i == -1) {
                b(true);
                throw new C2645h(2, -1);
            }
            if (i == 130) {
                if (C2897e.c0 >= 4) {
                    H0.println("session established ok with " + this.k0);
                    return;
                }
                return;
            }
            if (i != 131) {
                b(true);
                throw new C2645h(2, 0);
            }
            int read = this.p0.read() & 255;
            if (read != 128 && read != 130) {
                b(true);
                throw new C2645h(2, read);
            }
            this.l0.close();
            k = this.k0.k();
            c2639b.a = k;
        } while (k != null);
        throw new IOException("Failed to establish session with " + this.k0);
    }
}
