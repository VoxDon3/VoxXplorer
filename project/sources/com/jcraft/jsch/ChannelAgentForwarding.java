package com.jcraft.jsch;

import java.io.IOException;
import java.util.Vector;
import okhttp3.internal.http2.Http2;

/* loaded from: classes3.dex */
class ChannelAgentForwarding extends Channel {
    private Buffer w;
    private Buffer x = null;
    private Packet y = null;
    private Buffer z;

    ChannelAgentForwarding() {
        this.w = null;
        this.z = null;
        this.d = 131072;
        this.e = 131072;
        this.f = Http2.INITIAL_MAX_FRAME_SIZE;
        this.c = Util.v("auth-agent@openssh.com");
        Buffer buffer = new Buffer();
        this.w = buffer;
        buffer.A();
        this.z = new Buffer();
        this.n = true;
    }

    private void G(byte[] bArr) {
        this.y.c();
        this.x.s((byte) 94);
        this.x.v(this.b);
        this.x.v(bArr.length + 4);
        this.x.y(bArr);
        try {
            p().n0(this.y, this, bArr.length + 4);
        } catch (Exception unused) {
        }
    }

    @Override // com.jcraft.jsch.Channel
    void E(byte[] bArr, int i, int i2) throws IOException {
        Identity identity;
        String b;
        if (this.y == null) {
            this.x = new Buffer(this.h);
            this.y = new Packet(this.x);
        }
        this.w.D();
        Buffer buffer = this.w;
        byte[] bArr2 = buffer.b;
        int i3 = 0;
        if (bArr2.length < buffer.c + i2) {
            byte[] bArr3 = new byte[buffer.d + i2];
            System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
            this.w.b = bArr3;
        }
        this.w.u(bArr, i, i2);
        if (this.w.i() > this.w.j()) {
            Buffer buffer2 = this.w;
            buffer2.d -= 4;
            return;
        }
        int c = this.w.c();
        try {
            Session p = p();
            IdentityRepository z = p.z();
            UserInfo F = p.F();
            this.z.A();
            if (c == 11) {
                this.z.s((byte) 12);
                Vector<Identity> a = z.a();
                synchronized (a) {
                    int i4 = 0;
                    for (int i5 = 0; i5 < a.size(); i5++) {
                        try {
                            if (a.elementAt(i5).d() != null) {
                                i4++;
                            }
                        } finally {
                        }
                    }
                    this.z.v(i4);
                    while (i3 < a.size()) {
                        byte[] d = a.elementAt(i3).d();
                        if (d != null) {
                            this.z.y(d);
                            this.z.y(Util.c);
                        }
                        i3++;
                    }
                }
            } else if (c == 1) {
                this.z.s((byte) 2);
                this.z.v(0);
            } else if (c == 13) {
                byte[] p2 = this.w.p();
                byte[] p3 = this.w.p();
                int i6 = this.w.i();
                Vector<Identity> a2 = z.a();
                synchronized (a2) {
                    while (true) {
                        if (i3 >= a2.size()) {
                            identity = null;
                            break;
                        }
                        identity = a2.elementAt(i3);
                        if (identity.d() != null && Util.a(p2, identity.d())) {
                            if (identity.c()) {
                                if (F != null) {
                                    while (identity.c()) {
                                        if (F.a("Passphrase for " + identity.getName()) && (b = F.b()) != null) {
                                            try {
                                                if (identity.e(Util.v(b))) {
                                                    break;
                                                }
                                            } catch (JSchException unused) {
                                            }
                                        }
                                    }
                                }
                            }
                            if (!identity.c()) {
                                break;
                            }
                        }
                        i3++;
                    }
                }
                byte[] a3 = identity != null ? Util.c(new Buffer(p2).p()).equals("ssh-rsa") ? (i6 & 2) != 0 ? identity.a(p3, "rsa-sha2-256") : (i6 & 4) != 0 ? identity.a(p3, "rsa-sha2-512") : identity.a(p3, "ssh-rsa") : identity.f(p3) : null;
                if (a3 == null) {
                    this.z.s((byte) 30);
                } else {
                    this.z.s((byte) 14);
                    this.z.y(a3);
                }
            } else if (c == 18) {
                z.c(this.w.p());
                this.z.s((byte) 6);
            } else if (c == 9) {
                this.z.s((byte) 6);
            } else if (c == 19) {
                z.d();
                this.z.s((byte) 6);
            } else if (c == 17) {
                byte[] bArr4 = new byte[this.w.j()];
                this.w.e(bArr4);
                this.z.s(z.b(bArr4) ? (byte) 6 : (byte) 5);
            } else {
                Buffer buffer3 = this.w;
                buffer3.E(buffer3.j() - 1);
                this.z.s((byte) 5);
            }
            byte[] bArr5 = new byte[this.z.j()];
            this.z.e(bArr5);
            G(bArr5);
        } catch (JSchException e) {
            throw new IOException(e.toString(), e);
        }
    }

    @Override // com.jcraft.jsch.Channel
    void i() {
        super.i();
        h();
    }

    @Override // com.jcraft.jsch.Channel
    void t() {
        try {
            v();
        } catch (Exception unused) {
            this.m = true;
            f();
        }
    }
}
