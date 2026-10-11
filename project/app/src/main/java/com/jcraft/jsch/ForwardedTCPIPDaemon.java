/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch;

import com.jcraft.jsch.ChannelForwardedTCPIP;
import java.io.InputStream;
import java.io.OutputStream;

public interface ForwardedTCPIPDaemon
extends Runnable {
    public void C0(Object[] var1);

    public void G0(ChannelForwardedTCPIP var1, InputStream var2, OutputStream var3);
}

