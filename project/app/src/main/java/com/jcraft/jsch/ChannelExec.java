/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch;

import com.jcraft.jsch.ChannelSession;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Request;
import com.jcraft.jsch.RequestExec;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.b;

public class ChannelExec
extends ChannelSession {
    byte[] H = new byte[0];

    @Override
    public void D() throws JSchException {
        block4: {
            StringBuilder stringBuilder;
            Object object;
            Session session = this.p();
            try {
                this.G();
                object = new RequestExec(this.H);
                ((Request)object).a(session, this);
                if (this.i.a == null) break block4;
                this.j = object = new Thread(new b(this));
                stringBuilder = new StringBuilder();
                stringBuilder.append("Exec thread ");
            }
            catch (Exception exception) {
                if (exception instanceof JSchException) {
                    throw (JSchException)exception;
                }
                throw new JSchException("ChannelExec", exception);
            }
            stringBuilder.append(session.x());
            ((Thread)object).setName(stringBuilder.toString());
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

