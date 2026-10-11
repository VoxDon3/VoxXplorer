/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch;

import ax.d5.b;
import com.jcraft.jsch.Buffer;
import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelSession;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Packet;
import com.jcraft.jsch.Request;
import com.jcraft.jsch.RequestSftp;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.SftpATTRS;
import com.jcraft.jsch.SftpException;
import com.jcraft.jsch.SftpProgressMonitor;
import com.jcraft.jsch.Util;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Hashtable;
import java.util.Vector;

public class ChannelSftp
extends ChannelSession {
    private static final String d0;
    private static final char e0;
    private static boolean f0;
    private boolean H = false;
    private int I = 1;
    private int[] J = new int[1];
    private Buffer K;
    private Packet L;
    private Buffer M;
    private Packet N;
    private int O = 3;
    private int P = 3;
    private String Q = String.valueOf(3);
    private Hashtable<String, String> R = null;
    private InputStream S = null;
    private boolean T = false;
    private boolean U = false;
    private boolean V = false;
    private String W;
    private String X;
    private String Y;
    private Charset Z = StandardCharsets.UTF_8;
    private boolean a0 = true;
    private boolean b0 = true;
    private RequestQueue c0 = new RequestQueue(this, 16);

    static {
        char c8;
        d0 = File.separator;
        e0 = c8 = File.separatorChar;
        boolean bl = (byte)c8 == 92;
        f0 = bl;
    }

    public ChannelSftp() {
        this.d = 0x200000;
        this.e = 0x200000;
        this.f = 32768;
    }

    private void D0(byte[] byArray) throws Exception {
        this.N0((byte)4, byArray);
    }

    private void E0() throws Exception {
        this.L.c();
        this.x0((byte)1, 5);
        this.K.v(3);
        this.p().n0(this.L, this, 9);
    }

    private void F0(byte[] byArray) throws Exception {
        this.N0((byte)7, byArray);
    }

    private void G0(byte[] byArray, SftpATTRS sftpATTRS) throws Exception {
        this.L.c();
        int n8 = byArray.length;
        int n9 = sftpATTRS != null ? sftpATTRS.n() : 4;
        this.x0((byte)14, n8 + 9 + n9);
        Object object = this.K;
        n9 = this.I;
        this.I = n9 + 1;
        ((Buffer)object).v(n9);
        this.K.y(byArray);
        if (sftpATTRS != null) {
            sftpATTRS.a(this.K);
        } else {
            this.K.v(0);
        }
        object = this.p();
        Packet packet = this.L;
        n8 = byArray.length;
        n9 = sftpATTRS != null ? sftpATTRS.n() : 4;
        ((Session)object).n0(packet, this, n8 + 9 + n9 + 4);
    }

    private void H0(byte[] byArray, int n8) throws Exception {
        this.L.c();
        this.x0((byte)3, byArray.length + 17);
        Buffer buffer = this.K;
        int n9 = this.I;
        this.I = n9 + 1;
        buffer.v(n9);
        this.K.y(byArray);
        this.K.v(n8);
        this.K.v(0);
        this.p().n0(this.L, this, byArray.length + 21);
    }

    private void I0(byte[] byArray) throws Exception {
        this.H0(byArray, 10);
    }

    private void J0(byte[] byArray) throws Exception {
        this.N0((byte)11, byArray);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private SftpATTRS K(String object) throws SftpException {
        Exception exception2;
        block4: {
            block3: {
                try {
                    this.F0(Util.w((String)object, this.Z));
                    object = new Header();
                    object = this.m0(this.K, (Header)object);
                    int n8 = ((Header)object).a;
                    int n9 = ((Header)object).b;
                    this.h0(this.K, n8);
                    if (n9 == 105) {
                        return SftpATTRS.b(this.K);
                    }
                    if (n9 != 101) break block3;
                    n8 = this.K.i();
                    this.d1(this.K, n8);
                }
                catch (Exception exception2) {
                    break block4;
                }
            }
            object = new SftpException(4, "");
            throw object;
        }
        if (!(exception2 instanceof SftpException)) throw new SftpException(4, ((Object)exception2).toString(), exception2);
        throw (SftpException)exception2;
    }

    private void K0(byte[] byArray) throws Exception {
        this.H0(byArray, 1);
    }

    private void L0(byte[] byArray) throws Exception {
        this.H0(byArray, 26);
    }

    private byte[] M(String object) throws SftpException, IOException, Exception {
        this.S0(Util.w((String)object, this.Z));
        object = new Header();
        object = this.m0(this.K, (Header)object);
        int n8 = ((Header)object).a;
        int n9 = ((Header)object).b;
        this.h0(this.K, n8);
        if (n9 != 101 && n9 != 104) {
            throw new SftpException(4, "");
        }
        if (n9 == 101) {
            n9 = this.K.i();
            this.d1(this.K, n9);
        }
        object = null;
        for (n9 = this.K.i(); n9 > 0; --n9) {
            object = this.K.p();
            if (this.P <= 3) {
                this.K.p();
            }
            SftpATTRS.b(this.K);
        }
        return object;
    }

    private void M0(byte[] byArray) throws Exception {
        this.H0(byArray, 42);
    }

    private boolean N(byte[] byArray, Header header) throws Exception {
        this.D0(byArray);
        return this.f0(null, header);
    }

    private void N0(byte by, byte[] byArray) throws Exception {
        this.O0(by, byArray, null);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void O(String object, SftpATTRS sftpATTRS) throws SftpException {
        try {
            this.W0(Util.w((String)object, this.Z), sftpATTRS);
            object = new Header();
            object = this.m0(this.K, (Header)object);
            int n8 = ((Header)object).a;
            int n9 = ((Header)object).b;
            this.h0(this.K, n8);
            if (n9 != 101) {
                object = new SftpException(4, "");
                throw object;
            }
            n8 = this.K.i();
            if (n8 == 0) return;
            this.d1(this.K, n8);
            return;
        }
        catch (Exception exception) {}
        if (!(exception instanceof SftpException)) throw new SftpException(4, ((Object)exception).toString(), exception);
        throw (SftpException)exception;
    }

    private void O0(byte by, byte[] byArray, String object) throws Exception {
        this.L.c();
        int n8 = byArray.length + 9;
        if (object == null) {
            this.x0(by, n8);
            object = this.K;
            int n9 = this.I;
            this.I = n9 + 1;
            ((Buffer)object).v(n9);
        } else {
            this.x0((byte)-56, n8 += ((String)object).length() + 4);
            Buffer buffer = this.K;
            int n10 = this.I;
            this.I = n10 + 1;
            buffer.v(n10);
            this.K.y(Util.v((String)object));
        }
        this.K.y(byArray);
        this.p().n0(this.L, this, n8 + 4);
    }

    private SftpATTRS P(String string) throws SftpException {
        return this.Q(Util.w(string, this.Z));
    }

    private void P0(byte by, byte[] byArray, byte[] byArray2, String object) throws Exception {
        this.L.c();
        int n8 = byArray.length + 13 + byArray2.length;
        if (object == null) {
            this.x0(by, n8);
            object = this.K;
            int n9 = this.I;
            this.I = n9 + 1;
            ((Buffer)object).v(n9);
        } else {
            this.x0((byte)-56, n8 += ((String)object).length() + 4);
            Buffer buffer = this.K;
            int n10 = this.I;
            this.I = n10 + 1;
            buffer.v(n10);
            this.K.y(Util.v((String)object));
        }
        this.K.y(byArray);
        this.K.y(byArray2);
        this.p().n0(this.L, this, n8 + 4);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private SftpATTRS Q(byte[] object) throws SftpException {
        Exception exception2;
        block4: {
            block3: {
                try {
                    this.X0((byte[])object);
                    object = new Header;
                    object();
                    object = this.m0(this.K, (Header)object);
                    int n8 = object.a;
                    int n9 = object.b;
                    this.h0(this.K, n8);
                    if (n9 == 105) {
                        return SftpATTRS.b(this.K);
                    }
                    if (n9 != 101) break block3;
                    n9 = this.K.i();
                    this.d1(this.K, n9);
                }
                catch (Exception exception2) {
                    break block4;
                }
            }
            object = new SftpException;
            object(4, "");
            throw object;
        }
        if (!(exception2 instanceof SftpException)) throw new SftpException(4, ((Object)exception2).toString(), exception2);
        throw (SftpException)exception2;
    }

    private void Q0(byte[] byArray, long l8, int n8, RequestQueue requestQueue) throws Exception {
        this.L.c();
        this.x0((byte)5, byArray.length + 21);
        Buffer buffer = this.K;
        int n9 = this.I;
        this.I = n9 + 1;
        buffer.v(n9);
        this.K.y(byArray);
        this.K.w(l8);
        this.K.v(n8);
        this.p().n0(this.L, this, byArray.length + 25);
        if (requestQueue != null) {
            requestQueue.a(this.I - 1, l8, n8);
        }
    }

    static /* synthetic */ int R(ChannelSftp channelSftp) {
        return channelSftp.I;
    }

    private void R0(byte[] byArray) throws Exception {
        this.N0((byte)12, byArray);
    }

    static /* synthetic */ boolean S(ChannelSftp channelSftp) {
        return channelSftp.b0;
    }

    private void S0(byte[] byArray) throws Exception {
        this.N0((byte)16, byArray);
    }

    private void T0(byte[] byArray) throws Exception {
        this.N0((byte)13, byArray);
    }

    private void U0(byte[] byArray, byte[] byArray2) throws Exception {
        String string = this.T ? "posix-rename@openssh.com" : null;
        this.P0((byte)18, byArray, byArray2, string);
    }

    private void V0(byte[] byArray) throws Exception {
        this.N0((byte)15, byArray);
    }

    private void W0(byte[] byArray, SftpATTRS sftpATTRS) throws Exception {
        this.L.c();
        this.x0((byte)9, byArray.length + 9 + sftpATTRS.n());
        Buffer buffer = this.K;
        int n8 = this.I;
        this.I = n8 + 1;
        buffer.v(n8);
        this.K.y(byArray);
        sftpATTRS.a(this.K);
        this.p().n0(this.L, this, byArray.length + 9 + sftpATTRS.n() + 4);
    }

    static /* synthetic */ int X(ChannelSftp channelSftp, byte[] byArray, long l8, byte[] byArray2, int n8, int n9) throws Exception {
        return channelSftp.Y0(byArray, l8, byArray2, n8, n9);
    }

    private void X0(byte[] byArray) throws Exception {
        this.N0((byte)17, byArray);
    }

    private int Y0(byte[] byArray, long l8, byte[] byArray2, int n8, int n9) throws Exception {
        this.N.c();
        Session session = this.p();
        int n10 = session.v();
        Buffer buffer = this.M;
        byte[] byArray3 = buffer.b;
        int n11 = byArray3.length;
        int n12 = buffer.c;
        int n13 = n9;
        if (n11 < n12 + 34 + byArray.length + n9 + n10) {
            n13 = byArray3.length - (n12 + 34 + byArray.length + n10);
        }
        this.y0(buffer, (byte)6, byArray.length + 21 + n13);
        buffer = this.M;
        n9 = this.I;
        this.I = n9 + 1;
        buffer.v(n9);
        this.M.y(byArray);
        this.M.w(l8);
        buffer = this.M;
        if (buffer.b != byArray2) {
            buffer.z(byArray2, n8, n13);
        } else {
            buffer.v(n13);
            this.M.E(n13);
        }
        session.n0(this.N, this, byArray.length + 21 + n13 + 4);
        return n13;
    }

    static /* synthetic */ boolean Z(ChannelSftp channelSftp, int[] nArray, Header header) throws IOException, SftpException {
        return channelSftp.f0(nArray, header);
    }

    private void b1(long l8) throws IOException {
        long l9;
        while (l8 > 0L && (l9 = this.S.skip(l8)) > 0L) {
            l8 -= l9;
        }
    }

    private void d1(Buffer buffer, int n8) throws SftpException {
        if (this.P >= 3 && buffer.j() >= 4) {
            throw new SftpException(n8, Util.f(buffer.p(), StandardCharsets.UTF_8));
        }
        throw new SftpException(n8, "Failure");
    }

    private boolean f0(int[] nArray, Header header) throws IOException, SftpException {
        header = this.m0(this.K, header);
        int n8 = header.a;
        int n9 = header.b;
        if (nArray != null) {
            nArray[0] = header.c;
        }
        this.h0(this.K, n8);
        if (n9 == 101) {
            n9 = this.K.i();
            if (n9 != 0) {
                this.d1(this.K, n9);
            }
            return true;
        }
        throw new SftpException(4, "");
    }

    private int g0(byte[] byArray, int n8, int n9) throws IOException {
        int n10 = n8;
        while (n9 > 0) {
            int n11 = this.S.read(byArray, n10, n9);
            if (n11 > 0) {
                n10 += n11;
                n9 -= n11;
                continue;
            }
            throw new IOException("inputstream is closed");
        }
        return n10 - n8;
    }

    private void h0(Buffer buffer, int n8) throws IOException {
        buffer.A();
        this.g0(buffer.b, 0, n8);
        buffer.E(n8);
    }

    private String j0() throws SftpException {
        if (this.W == null) {
            this.W = this.k0();
        }
        return this.W;
    }

    private Vector<String> l0(String object) throws Exception {
        Vector<String> vector = new Vector<String>();
        int n8 = ((String)object).lastIndexOf(47);
        if (n8 < 0) {
            vector.addElement(Util.z((String)object));
            return vector;
        }
        int n9 = n8 == 0 ? 1 : n8;
        CharSequence charSequence = ((String)object).substring(0, n9);
        CharSequence charSequence2 = ((String)object).substring(n8 + 1);
        charSequence = Util.z((String)charSequence);
        object = new byte[1][];
        if (!this.o0((String)charSequence2, (byte[][])object)) {
            object = charSequence;
            if (!((String)charSequence).equals("/")) {
                object = new StringBuilder();
                ((StringBuilder)object).append((String)charSequence);
                ((StringBuilder)object).append("/");
                object = ((StringBuilder)object).toString();
            }
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append((String)object);
            ((StringBuilder)charSequence).append(Util.z((String)charSequence2));
            vector.addElement(((StringBuilder)charSequence).toString());
            return vector;
        }
        Object object2 = object[0];
        this.J0(Util.w((String)charSequence, this.Z));
        object = new Header();
        object = this.m0(this.K, (Header)object);
        n8 = ((Header)object).a;
        n9 = ((Header)object).b;
        this.h0(this.K, n8);
        if (n9 != 101 && n9 != 102) {
            throw new SftpException(4, "");
        }
        if (n9 == 101) {
            n9 = this.K.i();
            this.d1(this.K, n9);
        }
        byte[] byArray = this.K.p();
        charSequence2 = null;
        while (true) {
            this.R0(byArray);
            Header header = this.m0(this.K, (Header)object);
            n8 = header.a;
            n9 = header.b;
            if (n9 != 101 && n9 != 104) {
                throw new SftpException(4, "");
            }
            if (n9 == 101) {
                this.h0(this.K, n8);
                if (this.N(byArray, header)) {
                    return vector;
                }
                return null;
            }
            this.K.B();
            this.g0(this.K.b, 0, 4);
            n9 = n8 - 4;
            this.K.A();
            for (n8 = this.K.i(); n8 > 0; --n8) {
                Object object3;
                int n10 = n9;
                if (n9 > 0) {
                    this.K.D();
                    object3 = this.K;
                    object = ((Buffer)object3).b;
                    n10 = ((Object)object).length;
                    int n11 = ((Buffer)object3).c;
                    n10 = n10 > n11 + n9 ? n9 : ((Object)object).length - n11;
                    n10 = this.S.read((byte[])object, n11, n10);
                    if (n10 <= 0) break;
                    object = this.K;
                    ((Buffer)object).c += n10;
                    n10 = n9 - n10;
                }
                byte[] byArray2 = this.K.p();
                if (this.P <= 3) {
                    this.K.p();
                }
                SftpATTRS.b(this.K);
                if (!this.a0) {
                    object = Util.f(byArray2, this.Z);
                    object3 = Util.w((String)object, StandardCharsets.UTF_8);
                } else {
                    object3 = byArray2;
                    object = null;
                }
                Object object4 = charSequence2;
                if (Util.r((byte[])object2, (byte[])object3)) {
                    object3 = object;
                    if (object == null) {
                        object3 = Util.f(byArray2, this.Z);
                    }
                    object = charSequence2;
                    if (charSequence2 == null) {
                        if (!((String)charSequence).endsWith("/")) {
                            object = new StringBuilder();
                            ((StringBuilder)object).append((String)charSequence);
                            ((StringBuilder)object).append("/");
                            object = ((StringBuilder)object).toString();
                        } else {
                            object = charSequence;
                        }
                    }
                    charSequence2 = new StringBuilder();
                    ((StringBuilder)charSequence2).append((String)object);
                    ((StringBuilder)charSequence2).append((String)object3);
                    vector.addElement(((StringBuilder)charSequence2).toString());
                    object4 = object;
                }
                charSequence2 = object4;
                n9 = n10;
            }
            object = header;
        }
    }

    private Header m0(Buffer buffer, Header header) throws IOException {
        buffer.B();
        this.g0(buffer.b, 0, 9);
        header.a = buffer.i() - 5;
        header.b = buffer.c() & 0xFF;
        header.c = buffer.i();
        return header;
    }

    private boolean n0(String string) {
        return this.o0(string, null);
    }

    private boolean o0(String object, byte[][] byArray) {
        object = Util.w((String)object, StandardCharsets.UTF_8);
        if (byArray != null) {
            byArray[0] = (byte[])object;
        }
        return this.p0((byte[])object);
    }

    private boolean p0(byte[] byArray) {
        int n8 = byArray.length;
        int n9 = 0;
        while (n9 < n8) {
            int n10 = byArray[n9];
            if (n10 != 42 && n10 != 63) {
                int n11 = n9;
                if (n10 == 92) {
                    n10 = n9 + 1;
                    n11 = n9;
                    if (n10 < n8) {
                        n11 = n10;
                    }
                }
                n9 = n11 + 1;
                continue;
            }
            return true;
        }
        return false;
    }

    private boolean q0(String object) {
        block3: {
            try {
                this.X0(Util.w((String)object, this.Z));
                object = new Header();
                object = this.m0(this.K, (Header)object);
                int n8 = ((Header)object).a;
                int n9 = ((Header)object).b;
                this.h0(this.K, n8);
                if (n9 == 105) break block3;
                return false;
            }
            catch (Exception exception) {
                return false;
            }
        }
        boolean bl = SftpATTRS.b(this.K).k();
        return bl;
    }

    private String r0(String string) throws SftpException, Exception {
        Vector<String> vector = this.l0(string);
        if (vector.size() == 1) {
            return vector.elementAt(0);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append(" is not unique: ");
        stringBuilder.append(vector.toString());
        throw new SftpException(4, stringBuilder.toString());
    }

    private void x0(byte by, int n8) throws Exception {
        this.y0(this.K, by, n8);
    }

    private void y0(Buffer buffer, byte by, int n8) throws Exception {
        buffer.s((byte)94);
        buffer.v(this.b);
        buffer.v(n8 + 4);
        buffer.v(n8);
        buffer.s(by);
    }

    private String z0(String string) throws SftpException {
        if (string.charAt(0) == '/') {
            return string;
        }
        String string2 = this.j0();
        if (string2.endsWith("/")) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string2);
            stringBuilder.append(string);
            return stringBuilder.toString();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string2);
        stringBuilder.append("/");
        stringBuilder.append(string);
        return stringBuilder.toString();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void A0(String object, String object2) throws SftpException {
        Exception exception2;
        block10: {
            int n8;
            block9: {
                block8: {
                    if (this.P < 2) {
                        throw new SftpException(8, "The remote sshd is too old to support rename operation.");
                    }
                    try {
                        ((Channel.MyPipedInputStream)this.S).p();
                        Object object3 = this.z0((String)object);
                        object = this.z0((String)object2);
                        object2 = this.r0((String)object3);
                        object3 = this.l0((String)object);
                        n8 = ((Vector)object3).size();
                        if (n8 >= 2) {
                            object = new SftpException(4, ((Vector)object3).toString());
                            throw object;
                        }
                        if (n8 != 1) break block8;
                        object = (String)((Vector)object3).elementAt(0);
                        break block9;
                    }
                    catch (Exception exception2) {
                        break block10;
                    }
                }
                if (this.n0((String)object)) {
                    object2 = new SftpException(4, (String)object);
                    throw object2;
                }
                object = Util.z((String)object);
            }
            this.U0(Util.w((String)object2, this.Z), Util.w((String)object, this.Z));
            object = new Header();
            object = this.m0(this.K, (Header)object);
            int n9 = ((Header)object).a;
            n8 = ((Header)object).b;
            this.h0(this.K, n9);
            if (n8 != 101) {
                object = new SftpException(4, "");
                throw object;
            }
            n8 = this.K.i();
            if (n8 == 0) {
                return;
            }
            this.d1(this.K, n8);
            return;
        }
        if (exception2 instanceof SftpException) {
            throw (SftpException)exception2;
        }
        throw new SftpException(4, ((Object)exception2).toString(), exception2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void B0(String object) throws SftpException {
        try {
            ((Channel.MyPipedInputStream)this.S).p();
            Vector<String> vector = this.l0(this.z0((String)object));
            int n8 = vector.size();
            object = new Header();
            for (int i8 = 0; i8 < n8; ++i8) {
                this.T0(Util.w(vector.elementAt(i8), this.Z));
                object = this.m0(this.K, (Header)object);
                int n9 = ((Header)object).a;
                int n10 = ((Header)object).b;
                this.h0(this.K, n9);
                if (n10 == 101) {
                    n10 = this.K.i();
                    if (n10 == 0) continue;
                    this.d1(this.K, n10);
                    continue;
                }
                object = new SftpException(4, "");
                throw object;
            }
            return;
        }
        catch (Exception exception) {}
        if (!(exception instanceof SftpException)) throw new SftpException(4, ((Object)exception).toString(), exception);
        throw (SftpException)exception;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void C0(String object) throws SftpException {
        try {
            ((Channel.MyPipedInputStream)this.S).p();
            Vector<String> vector = this.l0(this.z0((String)object));
            int n8 = vector.size();
            object = new Header();
            for (int i8 = 0; i8 < n8; ++i8) {
                this.V0(Util.w(vector.elementAt(i8), this.Z));
                object = this.m0(this.K, (Header)object);
                int n9 = ((Header)object).a;
                int n10 = ((Header)object).b;
                this.h0(this.K, n9);
                if (n10 == 101) {
                    n10 = this.K.i();
                    if (n10 == 0) continue;
                    this.d1(this.K, n10);
                    continue;
                }
                object = new SftpException(4, "");
                throw object;
            }
            return;
        }
        catch (Exception exception) {}
        if (!(exception instanceof SftpException)) throw new SftpException(4, ((Object)exception).toString(), exception);
        throw (SftpException)exception;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void D() throws JSchException {
        Exception exception2;
        block10: {
            Object object;
            block9: {
                try {
                    Object object2 = new b();
                    this.i.j((OutputStream)object2);
                    object = new Channel.MyPipedInputStream((b)object2, this.c0.g() * this.h);
                    this.i.h((InputStream)object);
                    object = this.i.a;
                    this.S = object;
                    if (object == null) {
                        object = new JSchException("channel is down");
                        throw object;
                    }
                    object = new RequestSftp();
                    ((Request)object).a(this.p(), this);
                    this.K = object = new Buffer(this.f);
                    this.L = object = new Packet(this.K);
                    this.M = object = new Buffer(this.h);
                    this.N = object = new Packet(this.M);
                    this.E0();
                    object = new Header();
                    object = this.m0(this.K, (Header)object);
                    int n8 = ((Header)object).a;
                    if (n8 > 262144) {
                        object2 = new StringBuilder();
                        ((StringBuilder)object2).append("Received message is too long: ");
                        ((StringBuilder)object2).append(n8);
                        object = new SftpException(4, ((StringBuilder)object2).toString());
                        throw object;
                    }
                    this.P = ((Header)object).c;
                    object = new Hashtable();
                    this.R = object;
                    if (n8 <= 0) break block9;
                    this.h0(this.K, n8);
                    while (n8 > 0) {
                        object = this.K.p();
                        int n9 = ((Object)object).length;
                        object2 = this.K.p();
                        n8 = n8 - (n9 + 4) - (((Object)object2).length + 4);
                        this.R.put(Util.c((byte[])object), Util.c((byte[])object2));
                    }
                }
                catch (Exception exception2) {
                    break block10;
                }
            }
            if ((object = this.R.get("posix-rename@openssh.com")) != null && this.R.get("posix-rename@openssh.com").equals("1")) {
                this.T = true;
            }
            if (this.R.get("statvfs@openssh.com") != null && this.R.get("statvfs@openssh.com").equals("2")) {
                this.U = true;
            }
            if (this.R.get("hardlink@openssh.com") != null && this.R.get("hardlink@openssh.com").equals("1")) {
                this.V = true;
            }
            object = new File(".");
            this.Y = ((File)object).getCanonicalPath();
            return;
        }
        if (exception2 instanceof JSchException) {
            throw (JSchException)exception2;
        }
        throw new JSchException(((Object)exception2).toString(), exception2);
    }

    /*
     * Exception decompiling
     */
    public void L(InputStream var1_1, String var2_3, SftpProgressMonitor var3_4, int var4_5) throws SftpException {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 3[TRYBLOCK] [4 : 128->137)] java.lang.Exception
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public void Z0(String object, int n8) throws SftpException {
        Exception exception2;
        ((Channel.MyPipedInputStream)this.S).p();
        Vector<String> vector = this.l0(this.z0((String)object));
        int n9 = vector.size();
        for (int i8 = 0; i8 < n9; ++i8) {
            try {
                String string = vector.elementAt(i8);
                object = this.P(string);
                ((SftpATTRS)object).p(0);
                ((SftpATTRS)object).o(((SftpATTRS)object).c(), n8);
                this.O(string, (SftpATTRS)object);
                continue;
            }
            catch (Exception exception2) {
            }
        }
        return;
        if (exception2 instanceof SftpException) {
            throw (SftpException)exception2;
        }
        throw new SftpException(4, ((Object)exception2).toString(), exception2);
    }

    public void a1(boolean bl) {
        this.b0 = bl;
    }

    public SftpATTRS c1(String object) throws SftpException {
        try {
            ((Channel.MyPipedInputStream)this.S).p();
            object = this.P(this.r0(this.z0((String)object)));
            return object;
        }
        catch (Exception exception) {
            if (exception instanceof SftpException) {
                throw (SftpException)exception;
            }
            throw new SftpException(4, ((Object)exception).toString(), exception);
        }
    }

    @Override
    public void f() {
        super.f();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public InputStream i0(String object, SftpProgressMonitor sftpProgressMonitor, long l8) throws SftpException {
        Exception exception2;
        block5: {
            block4: {
                try {
                    ((Channel.MyPipedInputStream)this.S).p();
                    String string = this.r0(this.z0((String)object));
                    object = Util.w(string, this.Z);
                    SftpATTRS sftpATTRS = this.Q((byte[])object);
                    if (sftpProgressMonitor == null) break block4;
                    sftpProgressMonitor.c(1, string, "??", sftpATTRS.i());
                }
                catch (Exception exception2) {
                    break block5;
                }
            }
            this.K0((byte[])object);
            object = new Header();
            object = this.m0(this.K, (Header)object);
            int n8 = ((Header)object).a;
            int n9 = ((Header)object).b;
            this.h0(this.K, n8);
            if (n9 != 101 && n9 != 102) {
                object = new SftpException(4, "");
                throw object;
            }
            if (n9 == 101) {
                n8 = this.K.i();
                this.d1(this.K, n8);
            }
            object = this.K.p();
            this.c0.f();
            return new j.InputStreamRetargetInterface(this, l8, sftpProgressMonitor, (byte[])object){
                boolean c0;
                int d0;
                byte[] e0;
                byte[] f0;
                Header g0;
                int h0;
                long i0;
                final long j0;
                final SftpProgressMonitor k0;
                final byte[] l0;
                final ChannelSftp m0;
                long q;
                {
                    this.m0 = channelSftp;
                    this.j0 = l8;
                    this.k0 = sftpProgressMonitor;
                    this.l0 = byArray;
                    this.q = l8;
                    this.c0 = false;
                    this.d0 = 0;
                    this.e0 = new byte[1];
                    this.f0 = new byte[1024];
                    this.g0 = new Header();
                    this.h0 = 1;
                    this.i0 = this.q;
                }

                @Override
                public void close() throws IOException {
                    IOException iOException2;
                    block5: {
                        if (this.c0) {
                            return;
                        }
                        this.c0 = true;
                        SftpProgressMonitor sftpProgressMonitor = this.k0;
                        if (sftpProgressMonitor != null) {
                            sftpProgressMonitor.a();
                        }
                        this.m0.c0.b(this.g0, this.m0.K);
                        try {
                            this.m0.N(this.l0, this.g0);
                            return;
                        }
                        catch (Exception exception) {
                        }
                        catch (IOException iOException2) {
                            break block5;
                        }
                        throw new IOException(((Object)exception).toString(), exception);
                    }
                    throw iOException2;
                }

                @Override
                public int read() throws IOException {
                    if (this.c0) {
                        return -1;
                    }
                    if (this.read(this.e0, 0, 1) == -1) {
                        return -1;
                    }
                    return this.e0[0] & 0xFF;
                }

                @Override
                public int read(byte[] byArray) throws IOException {
                    if (this.c0) {
                        return -1;
                    }
                    return this.read(byArray, 0, byArray.length);
                }

                @Override
                public int read(byte[] object, int n8, int n9) throws IOException {
                    if (this.c0) {
                        return -1;
                    }
                    object.getClass();
                    if (n8 >= 0 && n9 >= 0 && n8 + n9 <= ((byte[])object).length) {
                        RequestQueue.OutOfOrderException outOfOrderException2;
                        block31: {
                            SftpException sftpException2;
                            int n10;
                            Object object2;
                            int n11;
                            int n12;
                            block30: {
                                n12 = 0;
                                if (n9 == 0) {
                                    return 0;
                                }
                                n11 = this.d0;
                                if (n11 > 0) {
                                    if (n11 <= n9) {
                                        n9 = n11;
                                    }
                                    System.arraycopy(this.f0, 0, object, n8, n9);
                                    n8 = this.d0;
                                    if (n9 != n8) {
                                        object = this.f0;
                                        System.arraycopy(object, n9, object, 0, n8 - n9);
                                    }
                                    if ((object = (Object)this.k0) != null && !object.b(n9)) {
                                        this.close();
                                        return -1;
                                    }
                                    this.d0 -= n9;
                                    return n9;
                                }
                                n11 = n9;
                                if (((ChannelSftp)this.m0).K.b.length - 13 < n9) {
                                    n11 = ((ChannelSftp)this.m0).K.b.length - 13;
                                }
                                n9 = n11;
                                if (this.m0.P == 0) {
                                    n9 = n11;
                                    if (n11 > 1024) {
                                        n9 = 1024;
                                    }
                                }
                                this.m0.c0.c();
                                n11 = ((ChannelSftp)this.m0).K.b.length;
                                n11 = this.m0.P == 0 ? 1024 : (n11 -= 13);
                                while (this.m0.c0.c() < this.h0) {
                                    try {
                                        object2 = this.m0;
                                        ((ChannelSftp)object2).Q0(this.l0, this.i0, n11, ((ChannelSftp)object2).c0);
                                    }
                                    catch (Exception exception) {
                                        throw new IOException("error");
                                    }
                                    this.i0 += (long)n11;
                                }
                                object2 = this.m0;
                                this.g0 = object2 = ((ChannelSftp)object2).m0(((ChannelSftp)object2).K, this.g0);
                                this.d0 = ((Header)object2).a;
                                n11 = ((Header)object2).b;
                                n10 = ((Header)object2).c;
                                try {
                                    object2 = this.m0.c0.d(this.g0.c);
                                    if (n11 != 101 && n11 != 103) {
                                        throw new IOException("error");
                                    }
                                    if (n11 != 101) break block30;
                                    object = this.m0;
                                }
                                catch (SftpException sftpException2) {
                                }
                                catch (RequestQueue.OutOfOrderException outOfOrderException2) {
                                    break block31;
                                }
                                ((ChannelSftp)object).h0(((ChannelSftp)object).K, this.d0);
                                n8 = this.m0.K.i();
                                this.d0 = 0;
                                if (n8 == 1) {
                                    this.close();
                                    return -1;
                                }
                                throw new IOException("error");
                            }
                            this.m0.K.B();
                            ChannelSftp channelSftp = this.m0;
                            channelSftp.g0(((ChannelSftp)channelSftp).K.b, 0, 4);
                            n11 = this.m0.K.i();
                            this.d0 = n10 = this.d0 - 4;
                            n10 -= n11;
                            long l8 = this.q;
                            long l9 = n11;
                            this.q = l8 + l9;
                            if (n11 > 0) {
                                if (n11 <= n9) {
                                    n9 = n11;
                                }
                                int n13 = this.m0.S.read((byte[])object, n8, n9);
                                if (n13 < 0) {
                                    return -1;
                                }
                                this.d0 = n11 -= n13;
                                if (n11 > 0) {
                                    n8 = n12;
                                    n9 = n11;
                                    if (this.f0.length < n11) {
                                        this.f0 = new byte[n11];
                                        n9 = n11;
                                        n8 = n12;
                                    }
                                    while (n9 > 0 && (n11 = this.m0.S.read(this.f0, n8, n9)) > 0) {
                                        n8 += n11;
                                        n9 -= n11;
                                    }
                                }
                                if (n10 > 0) {
                                    this.m0.S.skip(n10);
                                }
                                if (l9 < ((RequestQueue.Request)object2).c) {
                                    this.m0.c0.b(this.g0, this.m0.K);
                                    try {
                                        object = this.m0;
                                        ((ChannelSftp)object).Q0(this.l0, ((RequestQueue.Request)object2).b + l9, (int)(((RequestQueue.Request)object2).c - l9), ((ChannelSftp)object).c0);
                                        this.i0 = ((RequestQueue.Request)object2).b + ((RequestQueue.Request)object2).c;
                                    }
                                    catch (Exception exception) {
                                        throw new IOException("error");
                                    }
                                }
                                if (this.h0 < this.m0.c0.g()) {
                                    ++this.h0;
                                }
                                if ((object = this.k0) != null && !object.b(n13)) {
                                    this.close();
                                    return -1;
                                }
                                return n13;
                            }
                            return 0;
                            object = new StringBuilder();
                            ((StringBuilder)object).append("error: ");
                            ((StringBuilder)object).append(sftpException2.toString());
                            throw new IOException(((StringBuilder)object).toString(), sftpException2);
                        }
                        this.i0 = outOfOrderException2.q;
                        this.skip(this.g0.a);
                        this.m0.c0.b(this.g0, this.m0.K);
                        return 0;
                    }
                    throw new IndexOutOfBoundsException();
                }

                @Override
                public /* synthetic */ long transferTo(OutputStream outputStream) {
                    return java.io.DesugarInputStream.transferTo((InputStream)this, (OutputStream)outputStream);
                }
            };
        }
        if (!(exception2 instanceof SftpException)) throw new SftpException(4, ((Object)exception2).toString(), exception2);
        throw (SftpException)exception2;
    }

    public String k0() throws SftpException {
        if (this.X == null) {
            try {
                ((Channel.MyPipedInputStream)this.S).p();
                this.X = Util.f(this.M(""), this.Z);
            }
            catch (Exception exception) {
                if (exception instanceof SftpException) {
                    throw (SftpException)exception;
                }
                throw new SftpException(4, ((Object)exception).toString(), exception);
            }
        }
        return this.X;
    }

    @Override
    void q() {
    }

    public Vector<LsEntry> s0(String string) throws SftpException {
        Vector<LsEntry> vector = new Vector<LsEntry>();
        this.t0(string, new LsEntrySelector(){
            final Vector a;
            final ChannelSftp b;
            {
                this.b = channelSftp;
                this.a = vector;
            }

            @Override
            public int a(LsEntry lsEntry) {
                this.a.addElement(lsEntry);
                return 0;
            }
        });
        return vector;
    }

    /*
     * Exception decompiling
     */
    public void t0(String var1_1, LsEntrySelector var2_3) throws SftpException {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 2[TRYBLOCK] [2 : 104->120)] java.lang.Exception
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public SftpATTRS u0(String object) throws SftpException {
        try {
            ((Channel.MyPipedInputStream)this.S).p();
            object = this.K(this.r0(this.z0((String)object)));
            return object;
        }
        catch (Exception exception) {
            if (exception instanceof SftpException) {
                throw (SftpException)exception;
            }
            throw new SftpException(4, ((Object)exception).toString(), exception);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void v0(String object) throws SftpException {
        try {
            ((Channel.MyPipedInputStream)this.S).p();
            this.G0(Util.w(this.z0((String)object), this.Z), null);
            object = new Header();
            object = this.m0(this.K, (Header)object);
            int n8 = ((Header)object).a;
            int n9 = ((Header)object).b;
            this.h0(this.K, n8);
            if (n9 != 101) {
                object = new SftpException(4, "");
                throw object;
            }
            n8 = this.K.i();
            if (n8 == 0) {
                return;
            }
            this.d1(this.K, n8);
            return;
        }
        catch (Exception exception) {}
        if (exception instanceof SftpException) {
            throw (SftpException)exception;
        }
        throw new SftpException(4, ((Object)exception).toString(), exception);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void w0(InputStream object, String object2, SftpProgressMonitor sftpProgressMonitor, int n8) throws SftpException {
        Serializable serializable;
        Object object3;
        block10: {
            Vector<String> vector;
            block8: {
                block9: {
                    object3 = object2;
                    try {
                        ((Channel.MyPipedInputStream)this.S).p();
                        object3 = object2;
                        object3 = object2 = this.z0((String)object2);
                        vector = this.l0((String)object2);
                        object3 = object2;
                        int n9 = vector.size();
                        if (n9 == 1) break block8;
                        object = object2;
                        if (n9 != 0) break block9;
                        object3 = object2;
                        if (this.n0((String)object2)) {
                            object3 = object2;
                            object3 = object2;
                            object = new SftpException(4, (String)object2);
                            object3 = object2;
                            throw object;
                        }
                    }
                    catch (Exception exception) {
                        break block10;
                    }
                    object3 = object2;
                    object = Util.z((String)object2);
                }
                object3 = object;
                object3 = object;
                object2 = new SftpException(4, vector.toString());
                object3 = object;
                throw object2;
            }
            object3 = object2;
            object2 = vector.elementAt(0);
            if (sftpProgressMonitor != null) {
                try {
                    sftpProgressMonitor.c(0, "-", (String)object2, -1L);
                }
                catch (Exception exception) {
                    object3 = object2;
                    break block10;
                }
            }
            this.L((InputStream)object, (String)object2, sftpProgressMonitor, n8);
            return;
        }
        if (!(serializable instanceof SftpException)) {
            throw new SftpException(4, serializable.toString(), (Throwable)serializable);
        }
        serializable = (SftpException)serializable;
        if (((SftpException)serializable).q == 4 && this.q0((String)object3)) {
            serializable = new StringBuilder();
            ((StringBuilder)serializable).append((String)object3);
            ((StringBuilder)serializable).append(" is a directory");
            throw new SftpException(4, ((StringBuilder)serializable).toString());
        }
        throw serializable;
    }

    static class Header {
        int a;
        int b;
        int c;

        Header() {
        }
    }

    public static class LsEntry
    implements Comparable<LsEntry> {
        private String c0;
        private SftpATTRS d0;
        private String q;

        LsEntry(String string, String string2, SftpATTRS sftpATTRS) {
            this.n(string);
            this.p(string2);
            this.l(sftpATTRS);
        }

        public int d(LsEntry lsEntry) {
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

        void n(String string) {
            this.q = string;
        }

        void p(String string) {
            this.c0 = string;
        }

        public String toString() {
            return this.c0;
        }
    }

    public static interface LsEntrySelector {
        public int a(LsEntry var1);
    }

    private class RequestQueue {
        Request[] a;
        int b;
        int c;
        final ChannelSftp d;

        RequestQueue(ChannelSftp requestArray, int n8) {
            this.d = requestArray;
            this.a = null;
            this.a = new Request[n8];
            for (n8 = 0; n8 < (requestArray = this.a).length; ++n8) {
                requestArray[n8] = new Request(this);
            }
            this.f();
        }

        void a(int n8, long l8, int n9) {
            int n10 = this.c;
            if (n10 == 0) {
                this.b = 0;
            }
            int n11 = this.b + n10;
            Object object = this.a;
            int n12 = n11;
            if (n11 >= ((Request[])object).length) {
                n12 = n11 - ((Request[])object).length;
            }
            object = object[n12];
            object.a = n8;
            object.b = l8;
            object.c = n9;
            this.c = n10 + 1;
        }

        void b(Header header, Buffer buffer) throws IOException {
            int n8 = this.c;
            for (int i8 = 0; i8 < n8; ++i8) {
                Object object;
                header = this.d.m0(buffer, header);
                int n9 = header.a;
                for (int i9 = 0; i9 < ((Request[])(object = this.a)).length; ++i9) {
                    object = object[i9];
                    if (object.a != header.c) continue;
                    object.a = 0;
                    break;
                }
                this.d.b1(n9);
            }
            this.f();
        }

        int c() {
            return this.c;
        }

        Request d(int n8) throws OutOfOrderException, SftpException {
            int n9;
            --this.c;
            int n10 = this.b;
            this.b = n9 = n10 + 1;
            Object object = this.a;
            if (n9 == ((Request[])object).length) {
                this.b = 0;
            }
            object = object[n10];
            if (((Request)object).a != n8) {
                long l8 = this.e();
                for (n9 = 0; n9 < ((Request[])(object = this.a)).length; ++n9) {
                    object = object[n9];
                    if (((Request)object).a != n8) {
                        continue;
                    }
                    ((Request)object).a = 0;
                    throw new OutOfOrderException(this, l8);
                }
                object = new StringBuilder();
                ((StringBuilder)object).append("RequestQueue: unknown request id ");
                ((StringBuilder)object).append(n8);
                throw new SftpException(4, ((StringBuilder)object).toString());
            }
            ((Request)object).a = 0;
            return object;
        }

        long e() {
            Object object;
            long l8 = Long.MAX_VALUE;
            for (int i8 = 0; i8 < ((Request[])(object = this.a)).length; ++i8) {
                long l9;
                object = object[i8];
                if (object.a == 0) {
                    l9 = l8;
                } else {
                    long l10 = object.b;
                    l9 = l8;
                    if (l8 > l10) {
                        l9 = l10;
                    }
                }
                l8 = l9;
            }
            return l8;
        }

        void f() {
            this.c = 0;
            this.b = 0;
        }

        int g() {
            return this.a.length;
        }

        class OutOfOrderException
        extends Exception {
            final RequestQueue c0;
            long q;

            OutOfOrderException(RequestQueue requestQueue, long l8) {
                this.c0 = requestQueue;
                this.q = l8;
            }
        }

        class Request {
            int a;
            long b;
            long c;
            final RequestQueue d;

            Request(RequestQueue requestQueue) {
                this.d = requestQueue;
            }
        }
    }
}

