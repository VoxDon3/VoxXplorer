package com.jcraft.jsch;

import ax.d5.C1941b;
import com.jcraft.jsch.Channel;
import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Hashtable;
import java.util.Vector;
import okhttp3.HttpUrl;

/* loaded from: classes3.dex */
public class ChannelSftp extends ChannelSession {
    private static final String d0 = File.separator;
    private static final char e0;
    private static boolean f0;
    private Buffer K;
    private Packet L;
    private Buffer M;
    private Packet N;
    private String W;
    private String X;
    private String Y;
    private boolean H = false;
    private int I = 1;
    private int[] J = new int[1];
    private int O = 3;
    private int P = 3;
    private String Q = String.valueOf(3);
    private Hashtable<String, String> R = null;
    private InputStream S = null;
    private boolean T = false;
    private boolean U = false;
    private boolean V = false;
    private Charset Z = StandardCharsets.UTF_8;
    private boolean a0 = true;
    private boolean b0 = true;
    private RequestQueue c0 = new RequestQueue(16);

    /* renamed from: com.jcraft.jsch.ChannelSftp$1, reason: invalid class name */
    class AnonymousClass1 extends OutputStream implements AutoCloseable {
        private boolean c0;
        private int[] d0;
        private int e0;
        private int f0;
        private int g0;
        private int h0;
        private Header i0;
        byte[] j0;
        final /* synthetic */ byte[] k0;
        final /* synthetic */ long[] l0;
        final /* synthetic */ SftpProgressMonitor m0;
        final /* synthetic */ ChannelSftp n0;
        private boolean q;

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.c0) {
                return;
            }
            flush();
            SftpProgressMonitor sftpProgressMonitor = this.m0;
            if (sftpProgressMonitor != null) {
                sftpProgressMonitor.a();
            }
            try {
                this.n0.N(this.k0, this.i0);
                this.c0 = true;
            } catch (IOException e) {
                throw e;
            } catch (Exception e2) {
                throw new IOException(e2.toString(), e2);
            }
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() throws IOException {
            if (this.c0) {
                throw new IOException("stream already closed");
            }
            if (this.q) {
                return;
            }
            while (this.h0 > this.g0 && this.n0.f0(null, this.i0)) {
                try {
                    this.g0++;
                } catch (SftpException e) {
                    throw new IOException(e.toString(), e);
                }
            }
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) throws IOException {
            write(bArr, 0, bArr.length);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) throws IOException {
            if (this.q) {
                this.e0 = this.n0.I;
                this.f0 = this.n0.I;
                this.q = false;
            }
            if (this.c0) {
                throw new IOException("stream already closed");
            }
            int i3 = i;
            int i4 = i2;
            while (i4 > 0) {
                try {
                    if (this.n0.b0 && this.n0.g < this.k0.length + 21 + i4 + 4) {
                        flush();
                    }
                    byte[] bArr2 = bArr;
                    int Y0 = this.n0.Y0(this.k0, this.l0[0], bArr2, i3, i4);
                    this.h0++;
                    long[] jArr = this.l0;
                    jArr[0] = jArr[0] + Y0;
                    i3 += Y0;
                    i4 -= Y0;
                    if (this.n0.I - 1 == this.e0 || this.n0.S.available() >= 1024) {
                        while (this.n0.S.available() > 0 && this.n0.f0(this.d0, this.i0)) {
                            int i5 = this.d0[0];
                            this.f0 = i5;
                            if (this.e0 > i5 || i5 > this.n0.I - 1) {
                                throw new SftpException(4, HttpUrl.FRAGMENT_ENCODE_SET);
                            }
                            this.g0++;
                        }
                    }
                    bArr = bArr2;
                } catch (IOException e) {
                    throw e;
                } catch (Exception e2) {
                    throw new IOException(e2.toString(), e2);
                }
            }
            SftpProgressMonitor sftpProgressMonitor = this.m0;
            if (sftpProgressMonitor != null && !sftpProgressMonitor.b(i2)) {
                close();
                throw new IOException("canceled");
            }
        }

        @Override // java.io.OutputStream
        public void write(int i) throws IOException {
            byte[] bArr = this.j0;
            bArr[0] = (byte) i;
            write(bArr, 0, 1);
        }
    }

    static class Header {
        int a;
        int b;
        int c;

        Header() {
        }
    }

    public static class LsEntry implements Comparable<LsEntry> {
        private String c0;
        private SftpATTRS d0;
        private String q;

        LsEntry(String str, String str2, SftpATTRS sftpATTRS) {
            n(str);
            p(str2);
            l(sftpATTRS);
        }

        @Override // java.lang.Comparable
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public int compareTo(LsEntry lsEntry) {
            return this.q.compareTo(lsEntry.j());
        }

        public SftpATTRS h() {
            return this.d0;
        }

        public String j() {
            return this.q;
        }

        void l(SftpATTRS sftpATTRS) {
            this.d0 = sftpATTRS;
        }

        void n(String str) {
            this.q = str;
        }

        void p(String str) {
            this.c0 = str;
        }

        public String toString() {
            return this.c0;
        }
    }

    public interface LsEntrySelector {
        int a(LsEntry lsEntry);
    }

    private class RequestQueue {
        Request[] a;
        int b;
        int c;

        class OutOfOrderException extends Exception {
            long q;

            OutOfOrderException(long j) {
                this.q = j;
            }
        }

        class Request {
            int a;
            long b;
            long c;

            Request() {
            }
        }

        RequestQueue(int i) {
            this.a = null;
            this.a = new Request[i];
            int i2 = 0;
            while (true) {
                Request[] requestArr = this.a;
                if (i2 >= requestArr.length) {
                    f();
                    return;
                } else {
                    requestArr[i2] = new Request();
                    i2++;
                }
            }
        }

        void a(int i, long j, int i2) {
            int i3 = this.c;
            if (i3 == 0) {
                this.b = 0;
            }
            int i4 = this.b + i3;
            Request[] requestArr = this.a;
            if (i4 >= requestArr.length) {
                i4 -= requestArr.length;
            }
            Request request = requestArr[i4];
            request.a = i;
            request.b = j;
            request.c = i2;
            this.c = i3 + 1;
        }

        void b(Header header, Buffer buffer) throws IOException {
            int i = this.c;
            for (int i2 = 0; i2 < i; i2++) {
                header = ChannelSftp.this.m0(buffer, header);
                int i3 = header.a;
                int i4 = 0;
                while (true) {
                    Request[] requestArr = this.a;
                    if (i4 < requestArr.length) {
                        Request request = requestArr[i4];
                        if (request.a == header.c) {
                            request.a = 0;
                            break;
                        }
                        i4++;
                    }
                }
                ChannelSftp.this.b1(i3);
            }
            f();
        }

        int c() {
            return this.c;
        }

        Request d(int i) throws OutOfOrderException, SftpException {
            this.c--;
            int i2 = this.b;
            int i3 = i2 + 1;
            this.b = i3;
            Request[] requestArr = this.a;
            if (i3 == requestArr.length) {
                this.b = 0;
            }
            Request request = requestArr[i2];
            if (request.a == i) {
                request.a = 0;
                return request;
            }
            long e = e();
            int i4 = 0;
            while (true) {
                Request[] requestArr2 = this.a;
                if (i4 >= requestArr2.length) {
                    throw new SftpException(4, "RequestQueue: unknown request id " + i);
                }
                Request request2 = requestArr2[i4];
                if (request2.a == i) {
                    request2.a = 0;
                    throw new OutOfOrderException(e);
                }
                i4++;
            }
        }

        long e() {
            long j = Long.MAX_VALUE;
            int i = 0;
            while (true) {
                Request[] requestArr = this.a;
                if (i >= requestArr.length) {
                    return j;
                }
                Request request = requestArr[i];
                if (request.a != 0) {
                    long j2 = request.b;
                    if (j > j2) {
                        j = j2;
                    }
                }
                i++;
            }
        }

        void f() {
            this.c = 0;
            this.b = 0;
        }

        int g() {
            return this.a.length;
        }
    }

    static {
        char c = File.separatorChar;
        e0 = c;
        f0 = ((byte) c) == 92;
    }

    public ChannelSftp() {
        this.d = 2097152;
        this.e = 2097152;
        this.f = 32768;
    }

    private void D0(byte[] bArr) throws Exception {
        N0((byte) 4, bArr);
    }

    private void E0() throws Exception {
        this.L.c();
        x0((byte) 1, 5);
        this.K.v(3);
        p().n0(this.L, this, 9);
    }

    private void F0(byte[] bArr) throws Exception {
        N0((byte) 7, bArr);
    }

    private void G0(byte[] bArr, SftpATTRS sftpATTRS) throws Exception {
        this.L.c();
        x0((byte) 14, bArr.length + 9 + (sftpATTRS != null ? sftpATTRS.n() : 4));
        Buffer buffer = this.K;
        int i = this.I;
        this.I = i + 1;
        buffer.v(i);
        this.K.y(bArr);
        if (sftpATTRS != null) {
            sftpATTRS.a(this.K);
        } else {
            this.K.v(0);
        }
        p().n0(this.L, this, bArr.length + 9 + (sftpATTRS != null ? sftpATTRS.n() : 4) + 4);
    }

    private void H0(byte[] bArr, int i) throws Exception {
        this.L.c();
        x0((byte) 3, bArr.length + 17);
        Buffer buffer = this.K;
        int i2 = this.I;
        this.I = i2 + 1;
        buffer.v(i2);
        this.K.y(bArr);
        this.K.v(i);
        this.K.v(0);
        p().n0(this.L, this, bArr.length + 21);
    }

    private void I0(byte[] bArr) throws Exception {
        H0(bArr, 10);
    }

    private void J0(byte[] bArr) throws Exception {
        N0((byte) 11, bArr);
    }

    private SftpATTRS K(String str) throws SftpException {
        try {
            F0(Util.w(str, this.Z));
            Header m0 = m0(this.K, new Header());
            int i = m0.a;
            int i2 = m0.b;
            h0(this.K, i);
            if (i2 == 105) {
                return SftpATTRS.b(this.K);
            }
            if (i2 == 101) {
                d1(this.K, this.K.i());
            }
            throw new SftpException(4, HttpUrl.FRAGMENT_ENCODE_SET);
        } catch (Exception e) {
            if (e instanceof SftpException) {
                throw ((SftpException) e);
            }
            throw new SftpException(4, e.toString(), e);
        }
    }

    private void K0(byte[] bArr) throws Exception {
        H0(bArr, 1);
    }

    private void L0(byte[] bArr) throws Exception {
        H0(bArr, 26);
    }

    private byte[] M(String str) throws SftpException, IOException, Exception {
        S0(Util.w(str, this.Z));
        Header m0 = m0(this.K, new Header());
        int i = m0.a;
        int i2 = m0.b;
        h0(this.K, i);
        if (i2 != 101 && i2 != 104) {
            throw new SftpException(4, HttpUrl.FRAGMENT_ENCODE_SET);
        }
        if (i2 == 101) {
            d1(this.K, this.K.i());
        }
        int i3 = this.K.i();
        byte[] bArr = null;
        while (true) {
            int i4 = i3 - 1;
            if (i3 <= 0) {
                return bArr;
            }
            bArr = this.K.p();
            if (this.P <= 3) {
                this.K.p();
            }
            SftpATTRS.b(this.K);
            i3 = i4;
        }
    }

    private void M0(byte[] bArr) throws Exception {
        H0(bArr, 42);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean N(byte[] bArr, Header header) throws Exception {
        D0(bArr);
        return f0(null, header);
    }

    private void N0(byte b, byte[] bArr) throws Exception {
        O0(b, bArr, null);
    }

    private void O(String str, SftpATTRS sftpATTRS) throws SftpException {
        try {
            W0(Util.w(str, this.Z), sftpATTRS);
            Header m0 = m0(this.K, new Header());
            int i = m0.a;
            int i2 = m0.b;
            h0(this.K, i);
            if (i2 != 101) {
                throw new SftpException(4, HttpUrl.FRAGMENT_ENCODE_SET);
            }
            int i3 = this.K.i();
            if (i3 != 0) {
                d1(this.K, i3);
            }
        } catch (Exception e) {
            if (!(e instanceof SftpException)) {
                throw new SftpException(4, e.toString(), e);
            }
            throw ((SftpException) e);
        }
    }

    private void O0(byte b, byte[] bArr, String str) throws Exception {
        this.L.c();
        int length = bArr.length + 9;
        if (str == null) {
            x0(b, length);
            Buffer buffer = this.K;
            int i = this.I;
            this.I = i + 1;
            buffer.v(i);
        } else {
            length += str.length() + 4;
            x0((byte) -56, length);
            Buffer buffer2 = this.K;
            int i2 = this.I;
            this.I = i2 + 1;
            buffer2.v(i2);
            this.K.y(Util.v(str));
        }
        this.K.y(bArr);
        p().n0(this.L, this, length + 4);
    }

    private SftpATTRS P(String str) throws SftpException {
        return Q(Util.w(str, this.Z));
    }

    private void P0(byte b, byte[] bArr, byte[] bArr2, String str) throws Exception {
        this.L.c();
        int length = bArr.length + 13 + bArr2.length;
        if (str == null) {
            x0(b, length);
            Buffer buffer = this.K;
            int i = this.I;
            this.I = i + 1;
            buffer.v(i);
        } else {
            length += str.length() + 4;
            x0((byte) -56, length);
            Buffer buffer2 = this.K;
            int i2 = this.I;
            this.I = i2 + 1;
            buffer2.v(i2);
            this.K.y(Util.v(str));
        }
        this.K.y(bArr);
        this.K.y(bArr2);
        p().n0(this.L, this, length + 4);
    }

    private SftpATTRS Q(byte[] bArr) throws SftpException {
        try {
            X0(bArr);
            Header m0 = m0(this.K, new Header());
            int i = m0.a;
            int i2 = m0.b;
            h0(this.K, i);
            if (i2 == 105) {
                return SftpATTRS.b(this.K);
            }
            if (i2 == 101) {
                d1(this.K, this.K.i());
            }
            throw new SftpException(4, HttpUrl.FRAGMENT_ENCODE_SET);
        } catch (Exception e) {
            if (e instanceof SftpException) {
                throw ((SftpException) e);
            }
            throw new SftpException(4, e.toString(), e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q0(byte[] bArr, long j, int i, RequestQueue requestQueue) throws Exception {
        this.L.c();
        x0((byte) 5, bArr.length + 21);
        Buffer buffer = this.K;
        int i2 = this.I;
        this.I = i2 + 1;
        buffer.v(i2);
        this.K.y(bArr);
        this.K.w(j);
        this.K.v(i);
        p().n0(this.L, this, bArr.length + 25);
        if (requestQueue != null) {
            requestQueue.a(this.I - 1, j, i);
        }
    }

    private void R0(byte[] bArr) throws Exception {
        N0((byte) 12, bArr);
    }

    private void S0(byte[] bArr) throws Exception {
        N0((byte) 16, bArr);
    }

    private void T0(byte[] bArr) throws Exception {
        N0((byte) 13, bArr);
    }

    private void U0(byte[] bArr, byte[] bArr2) throws Exception {
        P0((byte) 18, bArr, bArr2, this.T ? "posix-rename@openssh.com" : null);
    }

    private void V0(byte[] bArr) throws Exception {
        N0((byte) 15, bArr);
    }

    private void W0(byte[] bArr, SftpATTRS sftpATTRS) throws Exception {
        this.L.c();
        x0((byte) 9, bArr.length + 9 + sftpATTRS.n());
        Buffer buffer = this.K;
        int i = this.I;
        this.I = i + 1;
        buffer.v(i);
        this.K.y(bArr);
        sftpATTRS.a(this.K);
        p().n0(this.L, this, bArr.length + 9 + sftpATTRS.n() + 4);
    }

    private void X0(byte[] bArr) throws Exception {
        N0((byte) 17, bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int Y0(byte[] bArr, long j, byte[] bArr2, int i, int i2) throws Exception {
        this.N.c();
        Session p = p();
        int v = p.v();
        Buffer buffer = this.M;
        byte[] bArr3 = buffer.b;
        int length = bArr3.length;
        int i3 = buffer.c;
        if (length < i3 + 34 + bArr.length + i2 + v) {
            i2 = bArr3.length - (((i3 + 34) + bArr.length) + v);
        }
        y0(buffer, (byte) 6, bArr.length + 21 + i2);
        Buffer buffer2 = this.M;
        int i4 = this.I;
        this.I = i4 + 1;
        buffer2.v(i4);
        this.M.y(bArr);
        this.M.w(j);
        Buffer buffer3 = this.M;
        if (buffer3.b != bArr2) {
            buffer3.z(bArr2, i, i2);
        } else {
            buffer3.v(i2);
            this.M.E(i2);
        }
        p.n0(this.N, this, bArr.length + 21 + i2 + 4);
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b1(long j) throws IOException {
        while (j > 0) {
            long skip = this.S.skip(j);
            if (skip <= 0) {
                return;
            } else {
                j -= skip;
            }
        }
    }

    private void d1(Buffer buffer, int i) throws SftpException {
        if (this.P >= 3 && buffer.j() >= 4) {
            throw new SftpException(i, Util.f(buffer.p(), StandardCharsets.UTF_8));
        }
        throw new SftpException(i, "Failure");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean f0(int[] iArr, Header header) throws IOException, SftpException {
        Header m0 = m0(this.K, header);
        int i = m0.a;
        int i2 = m0.b;
        if (iArr != null) {
            iArr[0] = m0.c;
        }
        h0(this.K, i);
        if (i2 != 101) {
            throw new SftpException(4, HttpUrl.FRAGMENT_ENCODE_SET);
        }
        int i3 = this.K.i();
        if (i3 == 0) {
            return true;
        }
        d1(this.K, i3);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int g0(byte[] bArr, int i, int i2) throws IOException {
        int i3 = i;
        while (i2 > 0) {
            int read = this.S.read(bArr, i3, i2);
            if (read <= 0) {
                throw new IOException("inputstream is closed");
            }
            i3 += read;
            i2 -= read;
        }
        return i3 - i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h0(Buffer buffer, int i) throws IOException {
        buffer.A();
        g0(buffer.b, 0, i);
        buffer.E(i);
    }

    private String j0() throws SftpException {
        if (this.W == null) {
            this.W = k0();
        }
        return this.W;
    }

    private Vector<String> l0(String str) throws Exception {
        byte[] bArr;
        String str2;
        Vector<String> vector = new Vector<>();
        int lastIndexOf = str.lastIndexOf(47);
        if (lastIndexOf < 0) {
            vector.addElement(Util.z(str));
            return vector;
        }
        int i = 0;
        String substring = str.substring(0, lastIndexOf == 0 ? 1 : lastIndexOf);
        String substring2 = str.substring(lastIndexOf + 1);
        String z = Util.z(substring);
        byte[][] bArr2 = new byte[1][];
        if (!o0(substring2, bArr2)) {
            if (!z.equals("/")) {
                z = z + "/";
            }
            vector.addElement(z + Util.z(substring2));
            return vector;
        }
        byte[] bArr3 = bArr2[0];
        J0(Util.w(z, this.Z));
        Header m0 = m0(this.K, new Header());
        int i2 = m0.a;
        int i3 = m0.b;
        h0(this.K, i2);
        int i4 = 4;
        int i5 = 101;
        if (i3 != 101 && i3 != 102) {
            throw new SftpException(4, HttpUrl.FRAGMENT_ENCODE_SET);
        }
        if (i3 == 101) {
            d1(this.K, this.K.i());
        }
        byte[] p = this.K.p();
        String str3 = null;
        while (true) {
            R0(p);
            m0 = m0(this.K, m0);
            int i6 = m0.a;
            int i7 = m0.b;
            if (i7 != i5 && i7 != 104) {
                throw new SftpException(i4, HttpUrl.FRAGMENT_ENCODE_SET);
            }
            if (i7 == i5) {
                h0(this.K, i6);
                if (N(p, m0)) {
                    return vector;
                }
                return null;
            }
            this.K.B();
            g0(this.K.b, i, i4);
            int i8 = i6 - 4;
            this.K.A();
            for (int i9 = this.K.i(); i9 > 0; i9--) {
                if (i8 > 0) {
                    this.K.D();
                    Buffer buffer = this.K;
                    byte[] bArr4 = buffer.b;
                    int length = bArr4.length;
                    int i10 = buffer.c;
                    int read = this.S.read(bArr4, i10, length > i10 + i8 ? i8 : bArr4.length - i10);
                    if (read <= 0) {
                        break;
                    }
                    this.K.c += read;
                    i8 -= read;
                }
                byte[] p2 = this.K.p();
                if (this.P <= 3) {
                    this.K.p();
                }
                SftpATTRS.b(this.K);
                if (this.a0) {
                    bArr = p2;
                    str2 = null;
                } else {
                    str2 = Util.f(p2, this.Z);
                    bArr = Util.w(str2, StandardCharsets.UTF_8);
                }
                if (Util.r(bArr3, bArr)) {
                    if (str2 == null) {
                        str2 = Util.f(p2, this.Z);
                    }
                    if (str3 == null) {
                        str3 = z.endsWith("/") ? z : z + "/";
                    }
                    vector.addElement(str3 + str2);
                }
            }
            i = 0;
            i4 = 4;
            i5 = 101;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Header m0(Buffer buffer, Header header) throws IOException {
        buffer.B();
        g0(buffer.b, 0, 9);
        header.a = buffer.i() - 5;
        header.b = buffer.c() & 255;
        header.c = buffer.i();
        return header;
    }

    private boolean n0(String str) {
        return o0(str, null);
    }

    private boolean o0(String str, byte[][] bArr) {
        byte[] w = Util.w(str, StandardCharsets.UTF_8);
        if (bArr != null) {
            bArr[0] = w;
        }
        return p0(w);
    }

    private boolean p0(byte[] bArr) {
        int i;
        int length = bArr.length;
        int i2 = 0;
        while (i2 < length) {
            byte b = bArr[i2];
            if (b == 42 || b == 63) {
                return true;
            }
            if (b == 92 && (i = i2 + 1) < length) {
                i2 = i;
            }
            i2++;
        }
        return false;
    }

    private boolean q0(String str) {
        try {
            X0(Util.w(str, this.Z));
            Header m0 = m0(this.K, new Header());
            int i = m0.a;
            int i2 = m0.b;
            h0(this.K, i);
            if (i2 != 105) {
                return false;
            }
            return SftpATTRS.b(this.K).k();
        } catch (Exception unused) {
            return false;
        }
    }

    private String r0(String str) throws SftpException, Exception {
        Vector<String> l0 = l0(str);
        if (l0.size() == 1) {
            return l0.elementAt(0);
        }
        throw new SftpException(4, str + " is not unique: " + l0.toString());
    }

    private void x0(byte b, int i) throws Exception {
        y0(this.K, b, i);
    }

    private void y0(Buffer buffer, byte b, int i) throws Exception {
        buffer.s((byte) 94);
        buffer.v(this.b);
        buffer.v(i + 4);
        buffer.v(i);
        buffer.s(b);
    }

    private String z0(String str) throws SftpException {
        if (str.charAt(0) == '/') {
            return str;
        }
        String j0 = j0();
        if (j0.endsWith("/")) {
            return j0 + str;
        }
        return j0 + "/" + str;
    }

    public void A0(String str, String str2) throws SftpException {
        String z;
        if (this.P < 2) {
            throw new SftpException(8, "The remote sshd is too old to support rename operation.");
        }
        try {
            ((Channel.MyPipedInputStream) this.S).p();
            String z0 = z0(str);
            String z02 = z0(str2);
            String r0 = r0(z0);
            Vector<String> l0 = l0(z02);
            int size = l0.size();
            if (size >= 2) {
                throw new SftpException(4, l0.toString());
            }
            if (size == 1) {
                z = l0.elementAt(0);
            } else {
                if (n0(z02)) {
                    throw new SftpException(4, z02);
                }
                z = Util.z(z02);
            }
            U0(Util.w(r0, this.Z), Util.w(z, this.Z));
            Header m0 = m0(this.K, new Header());
            int i = m0.a;
            int i2 = m0.b;
            h0(this.K, i);
            if (i2 != 101) {
                throw new SftpException(4, HttpUrl.FRAGMENT_ENCODE_SET);
            }
            int i3 = this.K.i();
            if (i3 == 0) {
                return;
            }
            d1(this.K, i3);
        } catch (Exception e) {
            if (!(e instanceof SftpException)) {
                throw new SftpException(4, e.toString(), e);
            }
            throw ((SftpException) e);
        }
    }

    public void B0(String str) throws SftpException {
        try {
            ((Channel.MyPipedInputStream) this.S).p();
            Vector<String> l0 = l0(z0(str));
            int size = l0.size();
            Header header = new Header();
            for (int i = 0; i < size; i++) {
                T0(Util.w(l0.elementAt(i), this.Z));
                header = m0(this.K, header);
                int i2 = header.a;
                int i3 = header.b;
                h0(this.K, i2);
                if (i3 != 101) {
                    throw new SftpException(4, HttpUrl.FRAGMENT_ENCODE_SET);
                }
                int i4 = this.K.i();
                if (i4 != 0) {
                    d1(this.K, i4);
                }
            }
        } catch (Exception e) {
            if (!(e instanceof SftpException)) {
                throw new SftpException(4, e.toString(), e);
            }
            throw ((SftpException) e);
        }
    }

    public void C0(String str) throws SftpException {
        try {
            ((Channel.MyPipedInputStream) this.S).p();
            Vector<String> l0 = l0(z0(str));
            int size = l0.size();
            Header header = new Header();
            for (int i = 0; i < size; i++) {
                V0(Util.w(l0.elementAt(i), this.Z));
                header = m0(this.K, header);
                int i2 = header.a;
                int i3 = header.b;
                h0(this.K, i2);
                if (i3 != 101) {
                    throw new SftpException(4, HttpUrl.FRAGMENT_ENCODE_SET);
                }
                int i4 = this.K.i();
                if (i4 != 0) {
                    d1(this.K, i4);
                }
            }
        } catch (Exception e) {
            if (!(e instanceof SftpException)) {
                throw new SftpException(4, e.toString(), e);
            }
            throw ((SftpException) e);
        }
    }

    @Override // com.jcraft.jsch.Channel
    public void D() throws JSchException {
        try {
            C1941b c1941b = new C1941b();
            this.i.j(c1941b);
            this.i.h(new Channel.MyPipedInputStream(c1941b, this.c0.g() * this.h));
            InputStream inputStream = this.i.a;
            this.S = inputStream;
            if (inputStream == null) {
                throw new JSchException("channel is down");
            }
            new RequestSftp().a(p(), this);
            this.K = new Buffer(this.f);
            this.L = new Packet(this.K);
            this.M = new Buffer(this.h);
            this.N = new Packet(this.M);
            E0();
            Header m0 = m0(this.K, new Header());
            int i = m0.a;
            if (i > 262144) {
                throw new SftpException(4, "Received message is too long: " + i);
            }
            this.P = m0.c;
            this.R = new Hashtable<>();
            if (i > 0) {
                h0(this.K, i);
                while (i > 0) {
                    byte[] p = this.K.p();
                    int length = i - (p.length + 4);
                    byte[] p2 = this.K.p();
                    i = length - (p2.length + 4);
                    this.R.put(Util.c(p), Util.c(p2));
                }
            }
            if (this.R.get("posix-rename@openssh.com") != null && this.R.get("posix-rename@openssh.com").equals("1")) {
                this.T = true;
            }
            if (this.R.get("statvfs@openssh.com") != null && this.R.get("statvfs@openssh.com").equals("2")) {
                this.U = true;
            }
            if (this.R.get("hardlink@openssh.com") != null && this.R.get("hardlink@openssh.com").equals("1")) {
                this.V = true;
            }
            this.Y = new File(".").getCanonicalPath();
        } catch (Exception e) {
            if (!(e instanceof JSchException)) {
                throw new JSchException(e.toString(), e);
            }
            throw ((JSchException) e);
        }
    }

    @Override // com.jcraft.jsch.ChannelSession
    public /* bridge */ /* synthetic */ void H(boolean z) {
        super.H(z);
    }

    @Override // com.jcraft.jsch.ChannelSession
    public /* bridge */ /* synthetic */ void I(boolean z) {
        super.I(z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0056, code lost:
    
        L0(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0099, code lost:
    
        d1(r22.K, r22.K.i());
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01e9 A[Catch: Exception -> 0x0051, TryCatch #1 {Exception -> 0x0051, blocks: (B:3:0x000b, B:11:0x0031, B:14:0x003a, B:15:0x0050, B:18:0x0056, B:19:0x0063, B:24:0x0080, B:25:0x0096, B:27:0x0099, B:28:0x00a4, B:31:0x00b5, B:33:0x00d0, B:35:0x00d6, B:93:0x01d7, B:95:0x01dc, B:97:0x01e4, B:101:0x01e9, B:102:0x01ec, B:45:0x00f5, B:47:0x00fb, B:52:0x01a9, B:54:0x01bc, B:60:0x0108, B:62:0x010e, B:64:0x0116, B:66:0x011c, B:71:0x0172, B:72:0x012a, B:75:0x0138, B:77:0x0149, B:81:0x017b, B:82:0x019e, B:87:0x01ca, B:89:0x01d0, B:113:0x005c, B:114:0x0060), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00ec A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x005c A[Catch: Exception -> 0x0051, TryCatch #1 {Exception -> 0x0051, blocks: (B:3:0x000b, B:11:0x0031, B:14:0x003a, B:15:0x0050, B:18:0x0056, B:19:0x0063, B:24:0x0080, B:25:0x0096, B:27:0x0099, B:28:0x00a4, B:31:0x00b5, B:33:0x00d0, B:35:0x00d6, B:93:0x01d7, B:95:0x01dc, B:97:0x01e4, B:101:0x01e9, B:102:0x01ec, B:45:0x00f5, B:47:0x00fb, B:52:0x01a9, B:54:0x01bc, B:60:0x0108, B:62:0x010e, B:64:0x0116, B:66:0x011c, B:71:0x0172, B:72:0x012a, B:75:0x0138, B:77:0x0149, B:81:0x017b, B:82:0x019e, B:87:0x01ca, B:89:0x01d0, B:113:0x005c, B:114:0x0060), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0060 A[Catch: Exception -> 0x0051, TryCatch #1 {Exception -> 0x0051, blocks: (B:3:0x000b, B:11:0x0031, B:14:0x003a, B:15:0x0050, B:18:0x0056, B:19:0x0063, B:24:0x0080, B:25:0x0096, B:27:0x0099, B:28:0x00a4, B:31:0x00b5, B:33:0x00d0, B:35:0x00d6, B:93:0x01d7, B:95:0x01dc, B:97:0x01e4, B:101:0x01e9, B:102:0x01ec, B:45:0x00f5, B:47:0x00fb, B:52:0x01a9, B:54:0x01bc, B:60:0x0108, B:62:0x010e, B:64:0x0116, B:66:0x011c, B:71:0x0172, B:72:0x012a, B:75:0x0138, B:77:0x0149, B:81:0x017b, B:82:0x019e, B:87:0x01ca, B:89:0x01d0, B:113:0x005c, B:114:0x0060), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d6 A[Catch: Exception -> 0x0051, TryCatch #1 {Exception -> 0x0051, blocks: (B:3:0x000b, B:11:0x0031, B:14:0x003a, B:15:0x0050, B:18:0x0056, B:19:0x0063, B:24:0x0080, B:25:0x0096, B:27:0x0099, B:28:0x00a4, B:31:0x00b5, B:33:0x00d0, B:35:0x00d6, B:93:0x01d7, B:95:0x01dc, B:97:0x01e4, B:101:0x01e9, B:102:0x01ec, B:45:0x00f5, B:47:0x00fb, B:52:0x01a9, B:54:0x01bc, B:60:0x0108, B:62:0x010e, B:64:0x0116, B:66:0x011c, B:71:0x0172, B:72:0x012a, B:75:0x0138, B:77:0x0149, B:81:0x017b, B:82:0x019e, B:87:0x01ca, B:89:0x01d0, B:113:0x005c, B:114:0x0060), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01bc A[Catch: Exception -> 0x0051, TryCatch #1 {Exception -> 0x0051, blocks: (B:3:0x000b, B:11:0x0031, B:14:0x003a, B:15:0x0050, B:18:0x0056, B:19:0x0063, B:24:0x0080, B:25:0x0096, B:27:0x0099, B:28:0x00a4, B:31:0x00b5, B:33:0x00d0, B:35:0x00d6, B:93:0x01d7, B:95:0x01dc, B:97:0x01e4, B:101:0x01e9, B:102:0x01ec, B:45:0x00f5, B:47:0x00fb, B:52:0x01a9, B:54:0x01bc, B:60:0x0108, B:62:0x010e, B:64:0x0116, B:66:0x011c, B:71:0x0172, B:72:0x012a, B:75:0x0138, B:77:0x0149, B:81:0x017b, B:82:0x019e, B:87:0x01ca, B:89:0x01d0, B:113:0x005c, B:114:0x0060), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void L(java.io.InputStream r23, java.lang.String r24, com.jcraft.jsch.SftpProgressMonitor r25, int r26) throws com.jcraft.jsch.SftpException {
        /*
            Method dump skipped, instructions count: 526
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.jcraft.jsch.ChannelSftp.L(java.io.InputStream, java.lang.String, com.jcraft.jsch.SftpProgressMonitor, int):void");
    }

    public void Z0(String str, int i) throws SftpException {
        try {
            ((Channel.MyPipedInputStream) this.S).p();
            Vector<String> l0 = l0(z0(str));
            int size = l0.size();
            for (int i2 = 0; i2 < size; i2++) {
                String elementAt = l0.elementAt(i2);
                SftpATTRS P = P(elementAt);
                P.p(0);
                P.o(P.c(), i);
                O(elementAt, P);
            }
        } catch (Exception e) {
            if (!(e instanceof SftpException)) {
                throw new SftpException(4, e.toString(), e);
            }
            throw ((SftpException) e);
        }
    }

    public void a1(boolean z) {
        this.b0 = z;
    }

    public SftpATTRS c1(String str) throws SftpException {
        try {
            ((Channel.MyPipedInputStream) this.S).p();
            return P(r0(z0(str)));
        } catch (Exception e) {
            if (e instanceof SftpException) {
                throw ((SftpException) e);
            }
            throw new SftpException(4, e.toString(), e);
        }
    }

    @Override // com.jcraft.jsch.Channel
    public void f() {
        super.f();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0054, code lost:
    
        d1(r13.K, r13.K.i());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.io.InputStream i0(java.lang.String r14, com.jcraft.jsch.SftpProgressMonitor r15, long r16) throws com.jcraft.jsch.SftpException {
        /*
            r13 = this;
            r6 = 4
            java.io.InputStream r0 = r13.S     // Catch: java.lang.Exception -> L28
            com.jcraft.jsch.Channel$MyPipedInputStream r0 = (com.jcraft.jsch.Channel.MyPipedInputStream) r0     // Catch: java.lang.Exception -> L28
            r0.p()     // Catch: java.lang.Exception -> L28
            java.lang.String r0 = r13.z0(r14)     // Catch: java.lang.Exception -> L28
            java.lang.String r9 = r13.r0(r0)     // Catch: java.lang.Exception -> L28
            java.nio.charset.Charset r0 = r13.Z     // Catch: java.lang.Exception -> L28
            byte[] r0 = com.jcraft.jsch.Util.w(r9, r0)     // Catch: java.lang.Exception -> L28
            com.jcraft.jsch.SftpATTRS r2 = r13.Q(r0)     // Catch: java.lang.Exception -> L28
            if (r15 == 0) goto L2a
            java.lang.String r10 = "??"
            long r11 = r2.i()     // Catch: java.lang.Exception -> L28
            r8 = 1
            r7 = r15
            r7.c(r8, r9, r10, r11)     // Catch: java.lang.Exception -> L28
            goto L2a
        L28:
            r0 = move-exception
            goto L74
        L2a:
            r13.K0(r0)     // Catch: java.lang.Exception -> L28
            com.jcraft.jsch.ChannelSftp$Header r0 = new com.jcraft.jsch.ChannelSftp$Header     // Catch: java.lang.Exception -> L28
            r0.<init>()     // Catch: java.lang.Exception -> L28
            com.jcraft.jsch.Buffer r2 = r13.K     // Catch: java.lang.Exception -> L28
            com.jcraft.jsch.ChannelSftp$Header r0 = r13.m0(r2, r0)     // Catch: java.lang.Exception -> L28
            int r2 = r0.a     // Catch: java.lang.Exception -> L28
            int r0 = r0.b     // Catch: java.lang.Exception -> L28
            com.jcraft.jsch.Buffer r3 = r13.K     // Catch: java.lang.Exception -> L28
            r13.h0(r3, r2)     // Catch: java.lang.Exception -> L28
            r2 = 101(0x65, float:1.42E-43)
            if (r0 == r2) goto L52
            r3 = 102(0x66, float:1.43E-43)
            if (r0 != r3) goto L4a
            goto L52
        L4a:
            com.jcraft.jsch.SftpException r0 = new com.jcraft.jsch.SftpException     // Catch: java.lang.Exception -> L28
            java.lang.String r2 = ""
            r0.<init>(r6, r2)     // Catch: java.lang.Exception -> L28
            throw r0     // Catch: java.lang.Exception -> L28
        L52:
            if (r0 != r2) goto L5f
            com.jcraft.jsch.Buffer r0 = r13.K     // Catch: java.lang.Exception -> L28
            int r0 = r0.i()     // Catch: java.lang.Exception -> L28
            com.jcraft.jsch.Buffer r2 = r13.K     // Catch: java.lang.Exception -> L28
            r13.d1(r2, r0)     // Catch: java.lang.Exception -> L28
        L5f:
            com.jcraft.jsch.Buffer r0 = r13.K     // Catch: java.lang.Exception -> L28
            byte[] r5 = r0.p()     // Catch: java.lang.Exception -> L28
            com.jcraft.jsch.ChannelSftp$RequestQueue r0 = r13.c0     // Catch: java.lang.Exception -> L28
            r0.f()     // Catch: java.lang.Exception -> L28
            com.jcraft.jsch.ChannelSftp$2 r0 = new com.jcraft.jsch.ChannelSftp$2     // Catch: java.lang.Exception -> L28
            r1 = r13
            r4 = r15
            r2 = r16
            r0.<init>(r2, r4, r5)     // Catch: java.lang.Exception -> L28
            return r0
        L74:
            boolean r1 = r0 instanceof com.jcraft.jsch.SftpException
            if (r1 == 0) goto L7b
            com.jcraft.jsch.SftpException r0 = (com.jcraft.jsch.SftpException) r0
            throw r0
        L7b:
            com.jcraft.jsch.SftpException r1 = new com.jcraft.jsch.SftpException
            java.lang.String r2 = r0.toString()
            r1.<init>(r6, r2, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.jcraft.jsch.ChannelSftp.i0(java.lang.String, com.jcraft.jsch.SftpProgressMonitor, long):java.io.InputStream");
    }

    public String k0() throws SftpException {
        if (this.X == null) {
            try {
                ((Channel.MyPipedInputStream) this.S).p();
                this.X = Util.f(M(HttpUrl.FRAGMENT_ENCODE_SET), this.Z);
            } catch (Exception e) {
                if (e instanceof SftpException) {
                    throw ((SftpException) e);
                }
                throw new SftpException(4, e.toString(), e);
            }
        }
        return this.X;
    }

    @Override // com.jcraft.jsch.Channel
    void q() {
    }

    public Vector<LsEntry> s0(String str) throws SftpException {
        final Vector<LsEntry> vector = new Vector<>();
        t0(str, new LsEntrySelector() { // from class: com.jcraft.jsch.ChannelSftp.3
            @Override // com.jcraft.jsch.ChannelSftp.LsEntrySelector
            public int a(LsEntry lsEntry) {
                vector.addElement(lsEntry);
                return 0;
            }
        });
        return vector;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c1, code lost:
    
        h0(r17.K, r12);
        r13 = r17.K.i();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00cc, code lost:
    
        if (r13 != r4) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d0, code lost:
    
        d1(r17.K, r13);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void t0(java.lang.String r18, com.jcraft.jsch.ChannelSftp.LsEntrySelector r19) throws com.jcraft.jsch.SftpException {
        /*
            Method dump skipped, instructions count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.jcraft.jsch.ChannelSftp.t0(java.lang.String, com.jcraft.jsch.ChannelSftp$LsEntrySelector):void");
    }

    public SftpATTRS u0(String str) throws SftpException {
        try {
            ((Channel.MyPipedInputStream) this.S).p();
            return K(r0(z0(str)));
        } catch (Exception e) {
            if (e instanceof SftpException) {
                throw ((SftpException) e);
            }
            throw new SftpException(4, e.toString(), e);
        }
    }

    public void v0(String str) throws SftpException {
        try {
            ((Channel.MyPipedInputStream) this.S).p();
            G0(Util.w(z0(str), this.Z), null);
            Header m0 = m0(this.K, new Header());
            int i = m0.a;
            int i2 = m0.b;
            h0(this.K, i);
            if (i2 != 101) {
                throw new SftpException(4, HttpUrl.FRAGMENT_ENCODE_SET);
            }
            int i3 = this.K.i();
            if (i3 == 0) {
                return;
            }
            d1(this.K, i3);
        } catch (Exception e) {
            if (!(e instanceof SftpException)) {
                throw new SftpException(4, e.toString(), e);
            }
            throw ((SftpException) e);
        }
    }

    public void w0(InputStream inputStream, String str, SftpProgressMonitor sftpProgressMonitor, int i) throws SftpException {
        Exception exc;
        SftpProgressMonitor sftpProgressMonitor2;
        try {
            ((Channel.MyPipedInputStream) this.S).p();
            String z0 = z0(str);
            Vector<String> l0 = l0(z0);
            int size = l0.size();
            if (size != 1) {
                if (size == 0) {
                    if (n0(z0)) {
                        throw new SftpException(4, z0);
                    }
                    Util.z(z0);
                }
                throw new SftpException(4, l0.toString());
            }
            String elementAt = l0.elementAt(0);
            if (sftpProgressMonitor != null) {
                try {
                    sftpProgressMonitor2 = sftpProgressMonitor;
                    sftpProgressMonitor2.c(0, "-", elementAt, -1L);
                } catch (Exception e) {
                    exc = e;
                    str = elementAt;
                    if (!(exc instanceof SftpException)) {
                        throw new SftpException(4, exc.toString(), exc);
                    }
                    SftpException sftpException = (SftpException) exc;
                    if (sftpException.q != 4) {
                        throw sftpException;
                    }
                    if (!q0(str)) {
                        throw sftpException;
                    }
                    throw new SftpException(4, str + " is a directory");
                }
            } else {
                sftpProgressMonitor2 = sftpProgressMonitor;
            }
            L(inputStream, elementAt, sftpProgressMonitor2, i);
        } catch (Exception e2) {
            exc = e2;
        }
    }

    /* renamed from: com.jcraft.jsch.ChannelSftp$2, reason: invalid class name */
    class AnonymousClass2 extends InputStream implements InputStreamRetargetInterface, AutoCloseable {
        boolean c0 = false;
        int d0 = 0;
        byte[] e0 = new byte[1];
        byte[] f0 = new byte[1024];
        Header g0 = new Header();
        int h0 = 1;
        long i0;
        final /* synthetic */ long j0;
        final /* synthetic */ SftpProgressMonitor k0;
        final /* synthetic */ byte[] l0;
        long q;

        AnonymousClass2(long j, SftpProgressMonitor sftpProgressMonitor, byte[] bArr) {
            this.j0 = j;
            this.k0 = sftpProgressMonitor;
            this.l0 = bArr;
            this.q = j;
            this.i0 = this.q;
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.c0) {
                return;
            }
            this.c0 = true;
            SftpProgressMonitor sftpProgressMonitor = this.k0;
            if (sftpProgressMonitor != null) {
                sftpProgressMonitor.a();
            }
            ChannelSftp.this.c0.b(this.g0, ChannelSftp.this.K);
            try {
                ChannelSftp.this.N(this.l0, this.g0);
            } catch (IOException e) {
                throw e;
            } catch (Exception e2) {
                throw new IOException(e2.toString(), e2);
            }
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            if (this.c0 || read(this.e0, 0, 1) == -1) {
                return -1;
            }
            return this.e0[0] & 255;
        }

        @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
        public /* synthetic */ long transferTo(OutputStream outputStream) {
            return DesugarInputStream.transferTo(this, outputStream);
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr) throws IOException {
            if (this.c0) {
                return -1;
            }
            return read(bArr, 0, bArr.length);
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            int i3 = i2;
            if (this.c0) {
                return -1;
            }
            bArr.getClass();
            if (i < 0 || i3 < 0 || i + i3 > bArr.length) {
                throw new IndexOutOfBoundsException();
            }
            int i4 = 0;
            if (i3 == 0) {
                return 0;
            }
            int i5 = this.d0;
            if (i5 <= 0) {
                if (ChannelSftp.this.K.b.length - 13 < i3) {
                    i3 = ChannelSftp.this.K.b.length - 13;
                }
                if (ChannelSftp.this.P == 0 && i3 > 1024) {
                    i3 = 1024;
                }
                ChannelSftp.this.c0.c();
                int length = ChannelSftp.this.P == 0 ? 1024 : ChannelSftp.this.K.b.length - 13;
                while (ChannelSftp.this.c0.c() < this.h0) {
                    try {
                        ChannelSftp channelSftp = ChannelSftp.this;
                        channelSftp.Q0(this.l0, this.i0, length, channelSftp.c0);
                        this.i0 += length;
                    } catch (Exception unused) {
                        throw new IOException("error");
                    }
                }
                ChannelSftp channelSftp2 = ChannelSftp.this;
                Header m0 = channelSftp2.m0(channelSftp2.K, this.g0);
                this.g0 = m0;
                this.d0 = m0.a;
                int i6 = m0.b;
                int i7 = m0.c;
                try {
                    RequestQueue.Request d = ChannelSftp.this.c0.d(this.g0.c);
                    if (i6 != 101 && i6 != 103) {
                        throw new IOException("error");
                    }
                    if (i6 != 101) {
                        ChannelSftp.this.K.B();
                        ChannelSftp channelSftp3 = ChannelSftp.this;
                        channelSftp3.g0(channelSftp3.K.b, 0, 4);
                        int i8 = ChannelSftp.this.K.i();
                        int i9 = this.d0 - 4;
                        this.d0 = i9;
                        int i10 = i9 - i8;
                        long j = i8;
                        this.q += j;
                        if (i8 <= 0) {
                            return 0;
                        }
                        if (i8 <= i3) {
                            i3 = i8;
                        }
                        int read = ChannelSftp.this.S.read(bArr, i, i3);
                        if (read < 0) {
                            return -1;
                        }
                        int i11 = i8 - read;
                        this.d0 = i11;
                        if (i11 > 0) {
                            if (this.f0.length < i11) {
                                this.f0 = new byte[i11];
                            }
                            while (i11 > 0) {
                                int read2 = ChannelSftp.this.S.read(this.f0, i4, i11);
                                if (read2 <= 0) {
                                    break;
                                }
                                i4 += read2;
                                i11 -= read2;
                            }
                        }
                        if (i10 > 0) {
                            ChannelSftp.this.S.skip(i10);
                        }
                        if (j < d.c) {
                            ChannelSftp.this.c0.b(this.g0, ChannelSftp.this.K);
                            try {
                                ChannelSftp channelSftp4 = ChannelSftp.this;
                                channelSftp4.Q0(this.l0, d.b + j, (int) (d.c - j), channelSftp4.c0);
                                this.i0 = d.b + d.c;
                            } catch (Exception unused2) {
                                throw new IOException("error");
                            }
                        }
                        if (this.h0 < ChannelSftp.this.c0.g()) {
                            this.h0++;
                        }
                        SftpProgressMonitor sftpProgressMonitor = this.k0;
                        if (sftpProgressMonitor == null || sftpProgressMonitor.b(read)) {
                            return read;
                        }
                        close();
                        return -1;
                    }
                    ChannelSftp channelSftp5 = ChannelSftp.this;
                    channelSftp5.h0(channelSftp5.K, this.d0);
                    int i12 = ChannelSftp.this.K.i();
                    this.d0 = 0;
                    if (i12 == 1) {
                        close();
                        return -1;
                    }
                    throw new IOException("error");
                } catch (RequestQueue.OutOfOrderException e) {
                    this.i0 = e.q;
                    skip(this.g0.a);
                    ChannelSftp.this.c0.b(this.g0, ChannelSftp.this.K);
                    return 0;
                } catch (SftpException e2) {
                    throw new IOException("error: " + e2.toString(), e2);
                }
            }
            if (i5 <= i3) {
                i3 = i5;
            }
            System.arraycopy(this.f0, 0, bArr, i, i3);
            int i13 = this.d0;
            if (i3 != i13) {
                byte[] bArr2 = this.f0;
                System.arraycopy(bArr2, i3, bArr2, 0, i13 - i3);
            }
            SftpProgressMonitor sftpProgressMonitor2 = this.k0;
            if (sftpProgressMonitor2 != null && !sftpProgressMonitor2.b(i3)) {
                close();
                return -1;
            }
            this.d0 -= i3;
            return i3;
        }
    }
}
