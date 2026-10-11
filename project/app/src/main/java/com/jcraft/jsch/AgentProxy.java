/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch;

import com.jcraft.jsch.AgentConnector;
import com.jcraft.jsch.AgentIdentity;
import com.jcraft.jsch.AgentProxyException;
import com.jcraft.jsch.Buffer;
import com.jcraft.jsch.Identity;
import com.jcraft.jsch.Util;
import java.util.Vector;

class AgentProxy {
    private final Buffer a;
    private AgentConnector b;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    boolean a(byte[] byArray) {
        synchronized (this) {
            boolean bl;
            try {
                int n8 = byArray.length;
                this.a.A();
                this.a.a(n8 + 5);
                Buffer buffer = this.a;
                bl = true;
                buffer.v(n8 + 1);
                this.a.s((byte)17);
                this.a.t(byArray);
                try {
                    this.b.a(this.a);
                }
                catch (AgentProxyException agentProxyException) {
                    this.a.B();
                    this.a.s((byte)5);
                }
                n8 = this.a.c();
                if (n8 != 6) return false;
            }
            catch (Throwable throwable2) {}
            return bl;
            throw throwable2;
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    Vector<Identity> b() {
        synchronized (this) {
            Throwable throwable2222;
            int n8;
            Vector<Identity> vector;
            block8: {
                vector = new Vector<Identity>();
                this.a.A();
                this.a.a(5);
                this.a.v(1);
                this.a.s((byte)11);
                this.b.a(this.a);
                n8 = this.a.c();
                if (n8 == 12) break block8;
                return vector;
            }
            int n9 = this.a.i();
            if (n9 <= 0 || n9 > 2048) break block9;
            for (n8 = 0; n8 < n9; ++n8) {
                byte[] byArray = this.a.p();
                String string = Util.c(this.a.p());
                AgentIdentity agentIdentity = new AgentIdentity(this, byArray, string);
                vector.add(agentIdentity);
            }
            {
                catch (Throwable throwable2222) {}
            }
            {
                block9: {
                    return vector;
                }
                return vector;
                catch (AgentProxyException agentProxyException) {
                    this.a.B();
                    this.a.s((byte)5);
                    return vector;
                }
            }
            throw throwable2222;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    void c() {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                try {
                    this.a.A();
                    this.a.a(5);
                    this.a.v(1);
                    this.a.s((byte)19);
                    try {
                        this.b.a(this.a);
                    }
                    catch (AgentProxyException agentProxyException) {
                        this.a.B();
                        this.a.s((byte)5);
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    boolean d(byte[] byArray) {
        synchronized (this) {
            try {
                int n8 = byArray.length;
                this.a.A();
                this.a.a(n8 + 9);
                this.a.v(n8 + 5);
                this.a.s((byte)18);
                this.a.y(byArray);
                try {
                    this.b.a(this.a);
                }
                catch (AgentProxyException agentProxyException) {
                    this.a.B();
                    this.a.s((byte)5);
                }
                n8 = this.a.c();
                if (n8 != 6) return false;
                return true;
            }
            catch (Throwable throwable2) {}
            throw throwable2;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    byte[] e(byte[] byArray, byte[] byArray2, String string) {
        synchronized (this) {
            Throwable throwable2;
            block9: {
                int n8;
                block7: {
                    block8: {
                        if (string == null) break block8;
                        try {
                            if (string.equals("rsa-sha2-256")) {
                                n8 = 2;
                                break block7;
                            }
                            if (!string.equals("rsa-sha2-512")) break block8;
                            n8 = 4;
                            break block7;
                        }
                        catch (Throwable throwable2) {
                            break block9;
                        }
                    }
                    n8 = 0;
                }
                int n9 = byArray.length + 17 + byArray2.length;
                this.a.A();
                this.a.a(n9);
                this.a.v(n9 - 4);
                this.a.s((byte)13);
                this.a.y(byArray);
                this.a.y(byArray2);
                this.a.v(n8);
                try {
                    this.b.a(this.a);
                }
                catch (AgentProxyException agentProxyException) {
                    this.a.B();
                    this.a.s((byte)5);
                }
                n8 = this.a.c();
                if (n8 == 14) return this.a.p();
                return null;
            }
            throw throwable2;
        }
    }
}

