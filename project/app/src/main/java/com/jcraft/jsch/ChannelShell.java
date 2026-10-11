/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch;

import com.jcraft.jsch.ChannelSession;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Request;
import com.jcraft.jsch.RequestShell;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.c;

public class ChannelShell
extends ChannelSession {
    ChannelShell() {
        this.z = true;
    }

    @Override
    public void D() throws JSchException {
        block4: {
            Thread thread;
            Object object;
            Session session = this.p();
            try {
                this.G();
                object = new RequestShell();
                ((Request)object).a(session, this);
                if (this.i.a == null) break block4;
                this.j = thread = new Thread(new c(this));
                object = new StringBuilder();
                ((StringBuilder)object).append("Shell for ");
            }
            catch (Exception exception) {
                if (exception instanceof JSchException) {
                    throw (JSchException)exception;
                }
                throw new JSchException("ChannelShell", exception);
            }
            ((StringBuilder)object).append(session.g0);
            thread.setName(((StringBuilder)object).toString());
            boolean bl = session.c0;
            if (bl) {
                this.j.setDaemon(bl);
            }
            this.j.start();
        }
    }

    @Override
    void q() throws JSchException {
        this.i.h(this.p().M);
        this.i.j(this.p().N);
    }
}

