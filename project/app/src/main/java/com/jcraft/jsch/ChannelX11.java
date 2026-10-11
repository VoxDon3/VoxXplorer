/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch;

import com.jcraft.jsch.Buffer;
import com.jcraft.jsch.Channel;
import com.jcraft.jsch.IO;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Packet;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.Util;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.Hashtable;

class ChannelX11
extends Channel {
    private static int A = 6000;
    static byte[] B;
    private static Hashtable<Session, byte[]> C;
    private static Hashtable<Session, byte[]> D;
    private static byte[] E;
    private static String z = "127.0.0.1";
    private boolean w = true;
    private Socket x = null;
    private byte[] y = new byte[0];

    static {
        C = new Hashtable();
        D = new Hashtable();
        E = new byte[]{48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
    }

    ChannelX11() {
        this.d = 131072;
        this.e = 131072;
        this.f = 16384;
        this.c = Util.v("x11");
        this.n = true;
    }

    private byte[] G(byte[] byArray, int n8, int n9) {
        byte[] byArray2 = this.y;
        byte[] byArray3 = new byte[byArray2.length + n9];
        System.arraycopy(byArray, n8, byArray3, byArray2.length, n9);
        byArray = this.y;
        if (byArray.length > 0) {
            System.arraycopy(byArray, 0, byArray3, 0, byArray.length);
        }
        this.y = byArray3;
        return byArray3;
    }

    private static boolean H(byte[] byArray, byte[] byArray2) {
        if (byArray.length != byArray2.length) {
            return false;
        }
        for (int i8 = 0; i8 < byArray.length; ++i8) {
            if (byArray[i8] == byArray2[i8]) continue;
            return false;
        }
        return true;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static byte[] I(Session session) {
        Hashtable<Session, byte[]> hashtable = D;
        synchronized (hashtable) {
            Throwable throwable2;
            block12: {
                Object object;
                block11: {
                    byte[] byArray;
                    try {
                        object = byArray = D.get(session);
                        if (byArray != null) break block11;
                        object = Session.x0;
                        byArray = new byte[16];
                        synchronized (object) {
                            object.a(byArray, 0, 16);
                        }
                    }
                    catch (Throwable throwable2) {
                        break block12;
                    }
                    {
                        C.put(session, byArray);
                        object = new byte[32];
                    }
                    for (int i8 = 0; i8 < 16; ++i8) {
                        byte[] byArray2;
                        int n8 = i8 * 2;
                        {
                            byArray2 = E;
                        }
                        object[n8] = byArray2[byArray[i8] >>> 4 & 0xF];
                        object[n8 + 1] = byArray2[byArray[i8] & 0xF];
                    }
                    {
                        D.put(session, (byte[])object);
                    }
                }
                return object;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static void J(Session session) {
        Hashtable<Session, byte[]> hashtable = D;
        synchronized (hashtable) {
            D.remove(session);
            C.remove(session);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    void E(byte[] object, int n8, int n9) throws IOException {
        byte[] byArray;
        Object object2;
        if (!this.w) {
            this.i.f((byte[])object, n8, n9);
            return;
        }
        try {
            object2 = this.p();
            byArray = this.G((byte[])object, n8, n9);
        }
        catch (JSchException jSchException) {
            throw new IOException(((Object)jSchException).toString(), jSchException);
        }
        int n10 = byArray.length;
        if (n10 < 9) {
            return;
        }
        int n11 = (byArray[6] & 0xFF) * 256 + (byArray[7] & 0xFF);
        int n12 = (byArray[8] & 0xFF) * 256 + (byArray[9] & 0xFF);
        byte by = byArray[0];
        if ((by & 0xFF) == 66) {
            n9 = n11;
            n8 = n12;
        } else {
            n9 = n11;
            n8 = n12;
            if ((by & 0xFF) == 108) {
                n9 = n11 << 8 & 0xFF00 | n11 >>> 8 & 0xFF;
                n8 = n12 << 8 & 0xFF00 | n12 >>> 8 & 0xFF;
            }
        }
        n12 = -n9 & 3;
        if (n10 < n9 + 12 + n12 + n8) {
            return;
        }
        byte[] byArray2 = new byte[n8];
        n9 = 12 + n9 + n12;
        System.arraycopy(byArray, n9, byArray2, 0, n8);
        object = C;
        // MONITORENTER : object
        object2 = C.get(object2);
        // MONITOREXIT : object
        if (ChannelX11.H(byArray2, (byte[])object2)) {
            object = B;
            if (object != null) {
                System.arraycopy(object, 0, byArray, n9, n8);
            }
        } else {
            this.j = null;
            this.h();
            this.i.a();
            this.f();
        }
        this.w = false;
        this.i.f(byArray, 0, n10);
        this.y = null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    void t() {
        block6: {
            Object object;
            Object object2;
            try {
                object2 = Util.i(z, A, 10000);
                this.x = object2;
                ((Socket)object2).setTcpNoDelay(true);
                this.i = object2 = new IO();
                ((IO)object2).h(this.x.getInputStream());
                this.i.j(this.x.getOutputStream());
                this.v();
            }
            catch (Exception exception) {
                this.w(1);
                this.m = true;
                this.f();
                return;
            }
            this.j = Thread.currentThread();
            object2 = new Buffer(this.h);
            Packet packet = new Packet((Buffer)object2);
            try {}
            catch (Exception exception) {
                break block6;
            }
            Session session = this.p();
            while (this.j != null && (object = this.i) != null && (object = ((IO)object).a) != null) {
                byte[] byArray = ((Buffer)object2).b;
                int n8 = ((InputStream)object).read(byArray, 14, byArray.length - 14 - session.v());
                if (n8 <= 0) {
                    this.h();
                    break;
                }
                if (this.m) break;
                packet.c();
                ((Buffer)object2).s((byte)94);
                ((Buffer)object2).v(this.b);
                ((Buffer)object2).v(n8);
                ((Buffer)object2).E(n8);
                session.n0(packet, this, n8);
            }
        }
        this.f();
    }
}

