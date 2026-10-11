package com.jcraft.jsch;

import okhttp3.HttpUrl;

/* loaded from: classes3.dex */
public class ChannelSubsystem extends ChannelSession {
    boolean H = true;
    String I = HttpUrl.FRAGMENT_ENCODE_SET;

    @Override // com.jcraft.jsch.Channel
    public void D() throws JSchException {
        Session p = p();
        try {
            if (this.x) {
                new RequestX11().a(p, this);
            }
            if (this.z) {
                new RequestPtyReq().a(p, this);
            }
            new RequestSubsystem().e(p, this, this.I, this.H);
            if (this.i.a != null) {
                Thread thread = new Thread(new Runnable() { // from class: com.jcraft.jsch.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        ChannelSubsystem.this.t();
                    }
                });
                this.j = thread;
                thread.setName("Subsystem for " + p.g0);
                boolean z = p.c0;
                if (z) {
                    this.j.setDaemon(z);
                }
                this.j.start();
            }
        } catch (Exception e) {
            if (!(e instanceof JSchException)) {
                throw new JSchException("ChannelSubsystem", e);
            }
            throw ((JSchException) e);
        }
    }

    @Override // com.jcraft.jsch.ChannelSession
    public /* bridge */ /* synthetic */ void H(boolean z) {
        super.H(z);
    }

    @Override // com.jcraft.jsch.ChannelSession
    public /* bridge */ /* synthetic */ void I(boolean z) {
        super.I(z);
    }

    @Override // com.jcraft.jsch.Channel
    void q() throws JSchException {
        this.i.h(p().M);
        this.i.j(p().N);
    }
}
