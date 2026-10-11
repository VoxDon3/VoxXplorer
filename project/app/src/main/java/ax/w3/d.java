/*
 * Decompiled with CFR 0.152.
 */
package ax.w3;

import android.content.Context;
import ax.P2.b;
import ax.b0.a;
import ax.c3.F;
import ax.t3.l;
import ax.u3.q;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;

public class d
extends q<Void, Integer, Boolean> {
    public static int j = 0;
    public static int k = 1;
    public static int l = 2;
    private Context h;
    private a<Integer> i;

    public d(Context context, a<Integer> a8) {
        super(q.e.e0);
        this.h = context;
        this.i = a8;
    }

    public static boolean w(Context context, String string) {
        return !ax.P2.a.s(context) && (!ax.t3.l.p(context) || !ax.P2.a.r(context)) && ax.P2.a.q(string) && ax.P2.a.k() != null;
    }

    @Override
    protected void o() {
        this.i.accept(l);
    }

    @Override
    protected void r() {
        super.r();
    }

    protected Boolean x(Void ... voidArray) {
        return this.y(this.h);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean y(Context object) {
        Object object2;
        Object object3;
        block29: {
            block31: {
                Object object4;
                Object object5;
                File file;
                block30: {
                    FileOutputStream fileOutputStream;
                    block28: {
                        object3 = ax.P2.a.k();
                        if (object3 == null) {
                            return false;
                        }
                        if (!ax.P2.a.t((Context)object, (String)object3) && !ax.P2.a.p((Context)object, (String)object3)) {
                            return false;
                        }
                        file = ax.P2.a.e((Context)object);
                        object2 = null;
                        object = new StringBuilder();
                        ((StringBuilder)object).append("https://file-manager-plus-65d18.firebaseapp.com/defaultcodec/");
                        ((StringBuilder)object).append((String)object3);
                        ((StringBuilder)object).append("/");
                        ((StringBuilder)object).append("libffmpeg.exo-v3.so.xz");
                        object5 = new URL(((StringBuilder)object).toString());
                        object = ((URL)object5).openConnection();
                        object3 = new BufferedInputStream(((URLConnection)object).getInputStream());
                        object = new ax.Jc.a((InputStream)object3);
                        fileOutputStream = new FileOutputStream(file);
                        object5 = object;
                        object4 = fileOutputStream;
                        F.b((InputStream)object, fileOutputStream);
                        try {
                            ((OutputStream)fileOutputStream).close();
                            break block28;
                        }
                        catch (IOException iOException) {}
                        catch (Throwable throwable) {
                            break block29;
                        }
                        catch (Exception exception) {
                            object5 = null;
                            object3 = object;
                            object = object5;
                            break block30;
                        }
                        catch (Throwable throwable) {
                            object = object3;
                            object3 = throwable;
                            break block29;
                        }
                        catch (Exception exception) {
                            object = null;
                            break block30;
                        }
                        catch (Throwable throwable) {
                            object = null;
                            break block29;
                        }
                        catch (Exception exception) {
                            object = null;
                            object3 = null;
                            break block30;
                        }
                    }
                    try {
                        ((InputStream)object).close();
                        return true;
                    }
                    catch (IOException iOException) {
                        return true;
                    }
                    catch (Throwable throwable) {
                        object2 = object4;
                        object = object5;
                        break block29;
                    }
                    catch (Exception exception) {
                        object3 = object;
                        object = fileOutputStream;
                    }
                }
                object5 = object3;
                object4 = object;
                {
                    file.delete();
                    object5 = object3;
                    object4 = object;
                    ((Throwable)object2).printStackTrace();
                    if (object == null) break block31;
                }
                try {
                    ((OutputStream)object).close();
                }
                catch (IOException iOException) {
                    // empty catch block
                }
            }
            if (object3 == null) return false;
            try {
                ((InputStream)object3).close();
                return false;
            }
            catch (IOException iOException) {
                return false;
            }
        }
        if (object2 != null) {
            try {
                ((OutputStream)object2).close();
            }
            catch (IOException iOException) {
                // empty catch block
            }
        }
        if (object == null) throw object3;
        try {
            ((InputStream)object).close();
        }
        catch (IOException iOException) {
            throw object3;
        }
        throw object3;
    }

    protected void z(Boolean bl) {
        if (bl.booleanValue()) {
            if (b.g() && b.a() >= 2 && b.a() < 3) {
                b.n(true);
            } else {
                b.l(false);
                ax.P2.a.n(this.h);
            }
        }
        if (bl.booleanValue()) {
            this.i.accept(j);
            return;
        }
        this.i.accept(k);
    }
}

