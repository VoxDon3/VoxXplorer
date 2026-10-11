/*
 * Decompiled with CFR 0.152.
 */
package com.jcraft.jsch;

import com.jcraft.jsch.ChannelSession;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Request;
import com.jcraft.jsch.RequestPtyReq;
import com.jcraft.jsch.RequestSubsystem;
import com.jcraft.jsch.RequestX11;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.d;

public class ChannelSubsystem
extends ChannelSession {
    boolean H = true;
    String I = "";

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void D() throws JSchException {
        Exception exception2;
        block7: {
            Object object;
            Session session;
            block6: {
                session = this.p();
                try {
                    if (!this.x) break block6;
                    object = new RequestX11();
                    ((Request)object).a(session, this);
                }
                catch (Exception exception2) {
                    break block7;
                }
            }
            if (this.z) {
                object = new RequestPtyReq();
                ((Request)object).a(session, this);
            }
            object = new RequestSubsystem();
            ((RequestSubsystem)object).e(session, this, this.I, this.H);
            if (this.i.a != null) {
                this.j = object = new Thread(new d(this));
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Subsystem for ");
                stringBuilder.append(session.g0);
                ((Thread)object).setName(stringBuilder.toString());
                boolean bl = session.c0;
                if (bl) {
                    this.j.setDaemon(bl);
                }
                this.j.start();
            }
            return;
        }
        if (exception2 instanceof JSchException) {
            throw (JSchException)exception2;
        }
        throw new JSchException("ChannelSubsystem", exception2);
    }

    @Override
    void q() throws JSchException {
        this.i.h(this.p().M);
        this.i.j(this.p().N);
    }
}

