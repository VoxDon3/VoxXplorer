/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch;

import com.jcraft.jsch.Buffer;
import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ForwardedTCPIPDaemon;
import com.jcraft.jsch.IO;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Packet;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.SocketFactory;
import com.jcraft.jsch.Util;
import java.net.Socket;
import java.util.Vector;

public class ChannelForwardedTCPIP
extends Channel {
    private static Vector<Config> z = new Vector();
    private Socket w = null;
    private ForwardedTCPIPDaemon x = null;
    private Config y = null;

    ChannelForwardedTCPIP() {
        this.d = 131072;
        this.e = 131072;
        this.f = 16384;
        this.i = new IO();
        this.n = true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static void G(Session object, String object2, int n8, int n9, String charSequence, int n10, SocketFactory socketFactory) throws JSchException {
        String string = ChannelForwardedTCPIP.L((String)object2);
        object2 = z;
        synchronized (object2) {
            Throwable throwable2;
            block4: {
                try {
                    if (ChannelForwardedTCPIP.K((Session)object, string, n8) == null) {
                        ConfigLHost configLHost = new ConfigLHost();
                        configLHost.a = object;
                        configLHost.b = n8;
                        configLHost.c = n9;
                        configLHost.e = charSequence;
                        configLHost.f = n10;
                        configLHost.d = string;
                        configLHost.g = socketFactory;
                        z.addElement(configLHost);
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append("PortForwardingR: remote port ");
                ((StringBuilder)charSequence).append(n8);
                ((StringBuilder)charSequence).append(" is already registered.");
                object = new JSchException(((StringBuilder)charSequence).toString());
                throw object;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    static void H(Session session) {
        int n8;
        Vector<Config> vector = z;
        // MONITORENTER : vector
        int[] nArray = new int[z.size()];
        int n10 = 0;
        int n9 = 0;
        for (n8 = 0; n8 < z.size(); ++n8) {
            Config config = z.elementAt(n8);
            int n11 = n9;
            if (config.a == session) {
                nArray[n9] = config.b;
                n11 = n9 + 1;
            }
            n9 = n11;
        }
        n8 = n10;
        while (n8 < n9) {
            ChannelForwardedTCPIP.I(session, nArray[n8]);
            ++n8;
        }
    }

    static void I(Session session, int n8) {
        ChannelForwardedTCPIP.J(session, null, n8);
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static void J(Session session, String object, int n8) {
        Object object2;
        Object object3;
        Vector<Config> vector = z;
        synchronized (vector) {
            object2 = object3 = ChannelForwardedTCPIP.K(session, ChannelForwardedTCPIP.L((String)object), n8);
            if (object3 == null) {
                object2 = ChannelForwardedTCPIP.K(session, null, n8);
            }
            if (object2 == null) {
                return;
            }
            z.removeElement(object2);
            object3 = object;
            if (object == null) {
                object3 = ((Config)object2).d;
            }
            object = object3;
            if (object3 == null) {
                object = "0.0.0.0";
            }
            // MONITOREXIT @DISABLED, blocks:[0, 3] lbl18 : MonitorExitStatement: MONITOREXIT : var5_5
            object3 = new Buffer(200);
            object2 = new Packet((Buffer)object3);
        }
        try {
            ((Packet)object2).c();
            ((Buffer)object3).s((byte)80);
            ((Buffer)object3).y(Util.v("cancel-tcpip-forward"));
            ((Buffer)object3).s((byte)0);
            ((Buffer)object3).y(Util.v((String)object));
            ((Buffer)object3).v(n8);
            session.m0((Packet)object2);
            return;
        }
        catch (Exception exception) {
            return;
        }
        {
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static Config K(Session session, String string, int n8) {
        Vector<Config> vector = z;
        synchronized (vector) {
            Throwable throwable2;
            block8: {
                block5: {
                    Config config;
                    int n9 = 0;
                    while (true) {
                        block7: {
                            block6: {
                                try {
                                    int n10;
                                    if (n9 >= z.size()) break block5;
                                    config = z.elementAt(n9);
                                    if (config.a == session && ((n10 = config.b) == n8 || n10 == 0 && config.c == n8)) break block6;
                                    break block7;
                                }
                                catch (Throwable throwable2) {
                                    break block8;
                                }
                            }
                            if (string == null || config.d.equals(string)) break;
                        }
                        ++n9;
                    }
                    return config;
                }
                return null;
            }
            throw throwable2;
        }
    }

    static String L(String string) {
        if (string == null) {
            return "localhost";
        }
        if (string.length() != 0 && !string.equals("*")) {
            return string;
        }
        return "";
    }

    @Override
    void m(Buffer object) {
        this.z(((Buffer)object).i());
        this.B(((Buffer)object).r());
        this.A(((Buffer)object).i());
        byte[] byArray = ((Buffer)object).p();
        int n8 = ((Buffer)object).i();
        ((Buffer)object).p();
        ((Buffer)object).i();
        try {
            object = this.p();
        }
        catch (JSchException jSchException) {
            object = null;
        }
        Object object2 = ChannelForwardedTCPIP.K((Session)object, Util.c(byArray), n8);
        this.y = object2;
        if (object2 == null) {
            this.y = ChannelForwardedTCPIP.K((Session)object, null, n8);
        }
        if (this.y == null && ((Session)object).A().isEnabled(3)) {
            object2 = ((Session)object).A();
            object = new StringBuilder();
            ((StringBuilder)object).append("ChannelForwardedTCPIP: ");
            ((StringBuilder)object).append(Util.c(byArray));
            ((StringBuilder)object).append(":");
            ((StringBuilder)object).append(n8);
            ((StringBuilder)object).append(" is not registered.");
            object2.a(3, ((StringBuilder)object).toString());
        }
    }

    /*
     * Exception decompiling
     */
    @Override
    public void t() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 7[TRYBLOCK] [13 : 370->384)] java.lang.Throwable
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

    static abstract class Config {
        Session a;
        int b;
        int c;
        String d;
        String e;

        Config() {
        }
    }

    static class ConfigDaemon
    extends Config {
        Object[] f;

        ConfigDaemon() {
        }
    }

    static class ConfigLHost
    extends Config {
        int f;
        SocketFactory g;

        ConfigLHost() {
        }
    }
}

