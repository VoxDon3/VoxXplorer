/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public interface SocketFactory {
    public InputStream a(Socket var1) throws IOException;

    public OutputStream b(Socket var1) throws IOException;

    public Socket c(String var1, int var2) throws IOException, UnknownHostException;
}

