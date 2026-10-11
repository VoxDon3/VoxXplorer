/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelDirectStreamLocal;
import com.jcraft.jsch.ChannelDirectTCPIP;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.ServerSocketFactory;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.e;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Vector;

class PortWatcher {
    private static Vector<PortWatcher> j = new Vector();
    private static InetAddress k = null;
    Session a;
    int b;
    int c;
    String d;
    InetAddress e;
    Runnable f;
    ServerSocket g;
    int h = 0;
    private String i;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        try {
            k = InetAddress.getByName("0.0.0.0");
            return;
        }
        catch (UnknownHostException unknownHostException) {
            return;
        }
    }

    PortWatcher(Session session, String string, int n8, String string2, int n9, ServerSocketFactory serverSocketFactory) throws JSchException {
        this.a = session;
        this.b = n8;
        this.d = string2;
        this.c = n9;
        this.b(string, n8, serverSocketFactory);
    }

    static PortWatcher a(Session object, String string, int n8, String string2, int n9, ServerSocketFactory serverSocketFactory) throws JSchException {
        if (PortWatcher.e((Session)object, string = PortWatcher.f(string), n8) == null) {
            object = new PortWatcher((Session)object, string, n8, string2, n9, serverSocketFactory);
            j.addElement((PortWatcher)object);
            return object;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("PortForwardingL: local port ");
        ((StringBuilder)object).append(string);
        ((StringBuilder)object).append(":");
        ((StringBuilder)object).append(n8);
        ((StringBuilder)object).append(" is already registered.");
        throw new JSchException(((StringBuilder)object).toString());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void b(String string, int n8, ServerSocketFactory object) throws JSchException {
        Exception exception2;
        block3: {
            try {
                InetAddress inetAddress;
                this.e = inetAddress = InetAddress.getByName(string);
                object = object == null ? new ServerSocket(n8, 0, this.e) : object.a(n8, 0, inetAddress);
            }
            catch (Exception exception2) {
                break block3;
            }
            this.g = object;
            if (n8 == 0 && (n8 = ((ServerSocket)object).getLocalPort()) != -1) {
                this.b = n8;
            }
            return;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("PortForwardingL: local port ");
        ((StringBuilder)object).append(string);
        ((StringBuilder)object).append(":");
        ((StringBuilder)object).append(n8);
        ((StringBuilder)object).append(" cannot be bound.");
        throw new JSchException(((StringBuilder)object).toString(), exception2);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static void c(Session object) {
        Vector<PortWatcher> vector = j;
        synchronized (vector) {
            int n8;
            int n9;
            PortWatcher[] portWatcherArray;
            try {
                portWatcherArray = new PortWatcher[j.size()];
                int n10 = 0;
                int n11 = 0;
                n9 = 0;
                while (true) {
                    if (n11 < j.size()) {
                        PortWatcher portWatcher = j.elementAt(n11);
                        n8 = n9;
                        if (portWatcher.a == object) {
                            portWatcher.d();
                            portWatcherArray[n9] = portWatcher;
                            n8 = n9 + 1;
                        }
                        ++n11;
                        n9 = n8;
                        continue;
                    }
                    break;
                }
            }
            catch (Throwable throwable) {}
            {
                throw throwable;
                for (n8 = n10; n8 < n9; ++n8) {
                    object = portWatcherArray[n8];
                    {
                        j.removeElement(object);
                        continue;
                    }
                }
                return;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static PortWatcher e(Session session, String object, int n8) throws JSchException {
        InetAddress inetAddress;
        try {
            inetAddress = InetAddress.getByName((String)object);
            object = j;
        }
        catch (UnknownHostException unknownHostException) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("PortForwardingL: invalid address ");
            stringBuilder.append((String)object);
            stringBuilder.append(" specified.");
            throw new JSchException(stringBuilder.toString(), unknownHostException);
        }
        synchronized (object) {
            Throwable throwable2;
            block11: {
                int n9 = 0;
                while (true) {
                    block9: {
                        PortWatcher portWatcher;
                        block10: {
                            try {
                                if (n9 >= j.size()) break;
                                portWatcher = j.elementAt(n9);
                                if (portWatcher.a != session || portWatcher.b != n8) break block9;
                                InetAddress inetAddress2 = k;
                                if (inetAddress2 != null && portWatcher.e.equals(inetAddress2)) break block10;
                            }
                            catch (Throwable throwable2) {
                                break block11;
                            }
                            if (!portWatcher.e.equals(inetAddress)) break block9;
                        }
                        return portWatcher;
                    }
                    ++n9;
                }
                return null;
            }
            throw throwable2;
        }
    }

    private static String f(String string) {
        String string2 = string;
        if (string != null) {
            if (string.length() != 0 && !string.equals("*")) {
                string2 = string;
                if (string.equals("localhost")) {
                    return "127.0.0.1";
                }
            } else {
                string2 = "0.0.0.0";
            }
        }
        return string2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    void d() {
        this.f = null;
        try {
            ServerSocket serverSocket = this.g;
            if (serverSocket != null) {
                serverSocket.close();
            }
            this.g = null;
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    void g() {
        this.f = new e(this);
        try {
            while (this.f != null) {
                Socket socket = this.g.accept();
                socket.setTcpNoDelay(true);
                InputStream inputStream = socket.getInputStream();
                OutputStream outputStream = socket.getOutputStream();
                Object object = this.i;
                if (object != null && ((String)object).length() > 0) {
                    object = new ChannelDirectStreamLocal();
                    ((Channel)object).C(this.a);
                    ((ChannelDirectTCPIP)object).q();
                    ((ChannelDirectTCPIP)object).H(inputStream);
                    ((ChannelDirectTCPIP)object).K(outputStream);
                    this.a.c((Channel)object);
                    ((ChannelDirectStreamLocal)object).M(this.i);
                    ((ChannelDirectTCPIP)object).I(socket.getInetAddress().getHostAddress());
                    ((ChannelDirectTCPIP)object).J(socket.getPort());
                    ((ChannelDirectTCPIP)object).d(this.h);
                    continue;
                }
                object = new ChannelDirectTCPIP();
                ((Channel)object).C(this.a);
                ((ChannelDirectTCPIP)object).q();
                ((ChannelDirectTCPIP)object).H(inputStream);
                ((ChannelDirectTCPIP)object).K(outputStream);
                this.a.c((Channel)object);
                ((ChannelDirectTCPIP)object).G(this.d);
                ((ChannelDirectTCPIP)object).L(this.c);
                ((ChannelDirectTCPIP)object).I(socket.getInetAddress().getHostAddress());
                ((ChannelDirectTCPIP)object).J(socket.getPort());
                ((ChannelDirectTCPIP)object).d(this.h);
            }
        }
        catch (Exception exception) {}
        this.d();
    }

    void h(int n8) {
        this.h = n8;
    }
}

