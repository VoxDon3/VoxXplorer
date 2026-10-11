package com.jcraft.jsch;

import java.io.InputStream;
import java.io.OutputStream;
import okhttp3.internal.http2.Http2;

/* loaded from: classes3.dex */
public class ChannelDirectTCPIP extends Channel {
    private static final byte[] A = Util.v("direct-tcpip");
    String w;
    int x;
    String y = "127.0.0.1";
    int z = 0;

    ChannelDirectTCPIP() {
        this.c = A;
        this.d = 131072;
        this.e = 131072;
        this.f = Http2.INITIAL_MAX_FRAME_SIZE;
    }

    public void G(String str) {
        this.w = str;
    }

    public void H(InputStream inputStream) {
        this.i.h(inputStream);
    }

    public void I(String str) {
        this.y = str;
    }

    public void J(int i) {
        this.z = i;
    }

    public void K(OutputStream outputStream) {
        this.i.j(outputStream);
    }

    public void L(int i) {
        this.x = i;
    }

    @Override // com.jcraft.jsch.Channel
    public void d(int i) throws JSchException {
        this.r = i;
        try {
            Session p = p();
            if (!p.J()) {
                throw new JSchException("session is down");
            }
            if (this.i.a == null) {
                u();
                return;
            }
            Thread thread = new Thread(new Runnable() { // from class: com.jcraft.jsch.a
                @Override // java.lang.Runnable
                public final void run() {
                    ChannelDirectTCPIP.this.t();
                }
            });
            this.j = thread;
            thread.setName("DirectTCPIP thread " + p.x());
            boolean z = p.c0;
            if (z) {
                this.j.setDaemon(z);
            }
            this.j.start();
        } catch (Exception e) {
            this.i.a();
            this.i = null;
            Channel.e(this);
            if (e instanceof JSchException) {
                throw ((JSchException) e);
            }
        }
    }

    @Override // com.jcraft.jsch.Channel
    protected Packet j() {
        Buffer buffer = new Buffer(this.w.length() + 50 + this.y.length() + this.s.v());
        Packet packet = new Packet(buffer);
        packet.c();
        buffer.s((byte) 90);
        buffer.y(this.c);
        buffer.v(this.a);
        buffer.v(this.e);
        buffer.v(this.f);
        buffer.y(Util.v(this.w));
        buffer.v(this.x);
        buffer.y(Util.v(this.y));
        buffer.v(this.z);
        return packet;
    }

    @Override // com.jcraft.jsch.Channel
    void q() {
        this.i = new IO();
    }

    @Override // com.jcraft.jsch.Channel
    void t() {
        IO io;
        InputStream inputStream;
        try {
            u();
            Buffer buffer = new Buffer(this.h);
            Packet packet = new Packet(buffer);
            Session p = p();
            while (true) {
                if (!s() || this.j == null || (io = this.i) == null || (inputStream = io.a) == null) {
                    break;
                }
                byte[] bArr = buffer.b;
                int read = inputStream.read(bArr, 14, (bArr.length - 14) - p.v());
                if (read <= 0) {
                    h();
                    break;
                }
                packet.c();
                buffer.s((byte) 94);
                buffer.v(this.b);
                buffer.v(read);
                buffer.E(read);
                synchronized (this) {
                    try {
                        if (this.m) {
                            break;
                        } else {
                            p.n0(packet, this, read);
                        }
                    } finally {
                    }
                }
            }
            h();
            f();
        } catch (Exception unused) {
            if (!this.n) {
                this.n = true;
            }
            f();
        }
    }
}
