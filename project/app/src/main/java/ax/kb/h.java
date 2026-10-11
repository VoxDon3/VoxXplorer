/*
 * Decompiled with CFR 0.152.
 */
package ax.kb;

import ax.kb.e;
import ax.kb.f;
import ax.pb.d0;
import ax.pb.e0;
import ax.pb.g0;
import ax.pb.r;
import ax.qb.b;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.UnknownHostException;

public class h
extends f {
    g0 g;
    d0 h = null;
    e0 i = null;
    boolean j = true;

    public h(String charSequence, r r8) throws UnknownHostException, MalformedURLException, e {
        this.b = f.f((String)charSequence);
        charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append("smb://");
        ((StringBuilder)charSequence).append(this.b.b);
        ((StringBuilder)charSequence).append("/IPC$/");
        ((StringBuilder)charSequence).append(this.b.c.substring(6));
        String string = ((StringBuilder)charSequence).toString();
        String string2 = (String)this.b.a("server");
        charSequence = "";
        if (string2 != null) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("");
            ((StringBuilder)charSequence).append("&server=");
            ((StringBuilder)charSequence).append(string2);
            charSequence = ((StringBuilder)charSequence).toString();
        }
        String string3 = (String)this.b.a("address");
        CharSequence charSequence2 = charSequence;
        if (string2 != null) {
            charSequence2 = new StringBuilder();
            ((StringBuilder)charSequence2).append((String)charSequence);
            ((StringBuilder)charSequence2).append("&address=");
            ((StringBuilder)charSequence2).append(string3);
            charSequence2 = ((StringBuilder)charSequence2).toString();
        }
        charSequence = string;
        if (((String)charSequence2).length() > 0) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(string);
            ((StringBuilder)charSequence).append("?");
            ((StringBuilder)charSequence).append(((String)charSequence2).substring(1));
            charSequence = ((StringBuilder)charSequence).toString();
        }
        this.g = new g0((String)charSequence, 27198979, r8);
    }

    @Override
    public void b() throws IOException {
        this.e = 0;
        e0 e02 = this.i;
        if (e02 != null) {
            e02.close();
        }
    }

    @Override
    protected void c(byte[] object, boolean bl) throws IOException {
        if (((byte[])object).length >= this.d) {
            boolean bl2 = this.j;
            boolean bl3 = false;
            int n8 = bl2 && !bl ? this.h.read((byte[])object, 0, 1024) : this.h.a((byte[])object, 0, ((byte[])object).length);
            if (object[0] != 5 && object[1] != 0) {
                throw new IOException("Unexpected DCERPC PDU header");
            }
            bl = bl3;
            if ((object[3] & 2) == 2) {
                bl = true;
            }
            this.j = bl;
            short s8 = ax.qb.b.d((byte[])object, 8);
            if (s8 <= this.d) {
                while (n8 < s8) {
                    n8 += this.h.a((byte[])object, n8, s8 - n8);
                }
                return;
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("Unexpected fragment length: ");
            ((StringBuilder)object).append(s8);
            throw new IOException(((StringBuilder)object).toString());
        }
        throw new IllegalArgumentException("buffer too small");
    }

    @Override
    protected void d(byte[] byArray, int n8, int n9, boolean bl) throws IOException {
        e0 e02 = this.i;
        if (e02 != null && !e02.isOpen()) {
            throw new IOException("DCERPC pipe is no longer open");
        }
        if (this.h == null) {
            this.h = (d0)this.g.e0();
        }
        if (this.i == null) {
            this.i = (e0)this.g.f0();
        }
        if (bl) {
            this.i.e(byArray, n8, n9, 1);
            return;
        }
        this.i.write(byArray, n8, n9);
    }
}

