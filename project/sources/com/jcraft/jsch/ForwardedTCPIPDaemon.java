package com.jcraft.jsch;

import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes3.dex */
public interface ForwardedTCPIPDaemon extends Runnable {
    void C0(Object[] objArr);

    void G0(ChannelForwardedTCPIP channelForwardedTCPIP, InputStream inputStream, OutputStream outputStream);
}
