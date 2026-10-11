/*
 * Decompiled with CFR 0.152.
 */
package ax.y8;

import ax.C8.b;
import ax.Xd.d;
import ax.Xd.f;
import ax.y8.c;
import java.io.ByteArrayInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class a
extends FilterInputStream
implements Iterable<b>,
j.InputStreamRetargetInterface {
    private static final d c0 = f.k(a.class);
    private final ax.z8.a q;

    public a(ax.z8.a a8, InputStream inputStream) {
        super(inputStream);
        this.q = a8;
    }

    public a(ax.z8.a a8, byte[] byArray) {
        super(new ByteArrayInputStream(byArray));
        this.q = a8;
    }

    public int e() {
        return this.q.a(this);
    }

    public <T extends b> T g() {
        c c82;
        block3: {
            Object object;
            try {
                object = this.q.b(this);
                d d8 = c0;
                d8.g("Read ASN.1 tag {}", object);
                int n8 = this.q.a(this);
                d8.g("Read ASN.1 object length: {}", n8);
                byte[] byArray = this.q.c(n8, this);
                object = ((ax.C8.c)object).j(this.q).a((ax.C8.c<? extends b>)object, byArray);
                d8.s("Read ASN.1 object: {}", object);
            }
            catch (Exception exception) {
            }
            catch (c c82) {
                break block3;
            }
            return (T)object;
            throw new c(exception, "Cannot parse ASN.1 object from stream", new Object[0]);
        }
        throw c82;
    }

    @Override
    public Iterator<b> iterator() {
        return new Iterator<b>(this){
            final a q;
            {
                this.q = a8;
            }

            public b b() {
                try {
                    Object t8 = this.q.g();
                    return t8;
                }
                catch (Exception exception) {
                    throw new NoSuchElementException(exception.getMessage());
                }
            }

            /*
             * Enabled force condition propagation
             * Lifted jumps to return sites
             */
            @Override
            public boolean hasNext() {
                boolean bl = false;
                try {
                    int n8 = ((InputStream)this.q).available();
                    if (n8 <= 0) return bl;
                    return true;
                }
                catch (IOException iOException) {
                    return bl;
                }
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException("Remove not supported on ASN.1 InputStream iterator");
            }
        };
    }

    public ax.C8.c p() {
        return this.q.b(this);
    }

    public byte[] q(int n8) {
        return this.q.c(n8, this);
    }

    @Override
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return java.io.DesugarInputStream.transferTo((InputStream)this, (OutputStream)outputStream);
    }
}

