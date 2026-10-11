/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch;

import com.jcraft.jsch.Buffer;
import com.jcraft.jsch.Channel;
import com.jcraft.jsch.Identity;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Packet;
import com.jcraft.jsch.UserInfo;
import com.jcraft.jsch.Util;
import java.io.IOException;
import java.util.Vector;

class ChannelAgentForwarding
extends Channel {
    private Buffer w = null;
    private Buffer x = null;
    private Packet y = null;
    private Buffer z = null;

    ChannelAgentForwarding() {
        Buffer buffer;
        this.d = 131072;
        this.e = 131072;
        this.f = 16384;
        this.c = Util.v("auth-agent@openssh.com");
        this.w = buffer = new Buffer();
        buffer.A();
        this.z = new Buffer();
        this.n = true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void G(byte[] byArray) {
        this.y.c();
        this.x.s((byte)94);
        this.x.v(this.b);
        this.x.v(byArray.length + 4);
        this.x.y(byArray);
        try {
            this.p().n0(this.y, this, byArray.length + 4);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    void E(byte[] object, int n8, int n9) throws IOException {
        block30: {
            UserInfo userInfo;
            int n10;
            Object object2;
            Object object3;
            block37: {
                block35: {
                    byte by;
                    block39: {
                        block38: {
                            block36: {
                                if (this.y == null) {
                                    this.x = new Buffer(this.h);
                                    this.y = new Packet(this.x);
                                }
                                this.w.D();
                                object3 = this.w;
                                object2 = ((Buffer)object3).b;
                                int n11 = ((byte[])object2).length;
                                int n12 = ((Buffer)object3).c;
                                n10 = 0;
                                int n13 = 0;
                                if (n11 < n12 + n9) {
                                    object3 = new byte[((Buffer)object3).d + n9];
                                    System.arraycopy(object2, 0, object3, 0, ((byte[])object2).length);
                                    this.w.b = (byte[])object3;
                                }
                                this.w.u((byte[])object, n8, n9);
                                if (this.w.i() > this.w.j()) {
                                    object = this.w;
                                    object.d -= 4;
                                    return;
                                }
                                n8 = this.w.c();
                                try {
                                    object2 = this.p();
                                }
                                catch (JSchException jSchException) {
                                    throw new IOException(((Object)jSchException).toString(), jSchException);
                                }
                                object = object2.z();
                                userInfo = object2.F();
                                this.z.A();
                                if (n8 == 11) break block35;
                                if (n8 != 1) break block36;
                                this.z.s((byte)2);
                                this.z.v(0);
                                break block30;
                            }
                            if (n8 == 13) break block37;
                            by = 6;
                            if (n8 != 18) break block38;
                            object.c(this.w.p());
                            this.z.s((byte)6);
                            break block30;
                        }
                        if (n8 != 9) break block39;
                        this.z.s((byte)6);
                        break block30;
                    }
                    if (n8 == 19) {
                        object.d();
                        this.z.s((byte)6);
                        break block30;
                    } else if (n8 == 17) {
                        object2 = new byte[this.w.j()];
                        this.w.e((byte[])object2);
                        boolean bl = object.b((byte[])object2);
                        object = this.z;
                        if (!bl) {
                            by = 5;
                        }
                        object.s(by);
                        break block30;
                    } else {
                        object = this.w;
                        object.E(object.j() - 1);
                        this.z.s((byte)5);
                    }
                    break block30;
                }
                this.z.s((byte)12);
                object = object.a();
                // MONITORENTER : object
                n9 = 0;
                for (n8 = 0; n8 < object.size(); ++n8) {
                    n10 = n9;
                    if (((Identity)object.elementAt(n8)).d() != null) {
                        n10 = n9 + 1;
                    }
                    n9 = n10;
                }
                this.z.v(n9);
                for (n8 = n13; n8 < object.size(); ++n8) {
                    object2 = ((Identity)object.elementAt(n8)).d();
                    if (object2 == null) continue;
                    this.z.y((byte[])object2);
                    this.z.y(Util.c);
                }
                {
                    // MONITOREXIT : object
                    break block30;
                }
            }
            byte[] byArray = this.w.p();
            object3 = this.w.p();
            n9 = this.w.i();
            Vector<Identity> vector = object.a();
            // MONITORENTER : vector
            n8 = n10;
            while (true) {
                block32: {
                    block33: {
                        block34: {
                            block31: {
                                n10 = vector.size();
                                object = null;
                                if (n8 >= n10) break block31;
                                object2 = vector.elementAt(n8);
                                if (object2.d() == null || !Util.a(byArray, object2.d())) break block32;
                                if (!object2.c()) break block33;
                                if (userInfo != null) break block34;
                                break block32;
                            }
                            object2 = null;
                            break;
                        }
                        while (object2.c()) {
                            Object object4 = new StringBuilder();
                            ((StringBuilder)object4).append("Passphrase for ");
                            ((StringBuilder)object4).append(object2.getName());
                            if (!userInfo.a(((StringBuilder)object4).toString()) || (object4 = userInfo.b()) == null) break;
                            object4 = Util.v((String)object4);
                            try {
                                boolean bl = object2.e((byte[])object4);
                                if (!bl) continue;
                            }
                            catch (JSchException jSchException) {}
                            break;
                        }
                    }
                    if (!object2.c()) break;
                }
                ++n8;
            }
            if (object2 != null) {
                object = Util.c(new Buffer(byArray).p()).equals("ssh-rsa") ? ((n9 & 2) != 0 ? object2.a((byte[])object3, "rsa-sha2-256") : ((n9 & 4) != 0 ? object2.a((byte[])object3, "rsa-sha2-512") : object2.a((byte[])object3, "ssh-rsa"))) : (Object)object2.f((byte[])object3);
            }
            if (object == null) {
                this.z.s((byte)30);
            } else {
                this.z.s((byte)14);
                this.z.y((byte[])object);
            }
        }
        object = new byte[this.z.j()];
        this.z.e((byte[])object);
        this.G((byte[])object);
    }

    @Override
    void i() {
        super.i();
        this.h();
    }

    @Override
    void t() {
        try {
            this.v();
            return;
        }
        catch (Exception exception) {
            this.m = true;
            this.f();
            return;
        }
    }
}

