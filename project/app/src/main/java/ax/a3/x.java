/*
 * Decompiled with CFR 0.152.
 */
package ax.a3;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.app.a;
import ax.a3.I;
import ax.a3.t;
import ax.c3.d0;
import ax.d3.E;
import ax.u3.h;
import java.io.File;
import java.util.Arrays;

public class x
extends I {
    private String t0;
    private boolean u0;
    private int v0;
    private int w0;
    private String x0;
    private int y0;

    @Override
    public void f3() {
        super.f3();
        this.x0 = this.j0().getString("fileName");
        this.u0 = this.j0().getBoolean("extractAll", true);
        this.v0 = this.j0().getInt("selectedItemSize", 0);
        this.w0 = this.j0().getInt("numArchiveFiles", 0);
        this.y0 = this.j0().getInt("showOption", 0);
        if (this.w0 <= 1) {
            if (this.u0) {
                this.t0 = this.x0;
                return;
            }
            Resources resources = this.G0();
            int n8 = this.v0;
            this.t0 = resources.getQuantityString(2131820559, n8, new Object[]{n8});
            return;
        }
        Resources resources = this.G0();
        int n9 = this.w0;
        this.t0 = resources.getQuantityString(2131820549, n9, new Object[]{n9});
    }

    @Override
    public Dialog g3() {
        Object[] objectArray;
        a.a a8 = h.a((Context)this.f0());
        Object object = this.G0().getStringArray(2130903051);
        int n8 = this.y0;
        if (n8 == 1) {
            objectArray = Arrays.copyOfRange(object, 0, 2);
        } else {
            objectArray = object;
            if (n8 == 2) {
                objectArray = Arrays.copyOfRange(object, 2, 3);
            }
        }
        n8 = this.y0;
        if (n8 == 1 || n8 == 0) {
            object = this.w0 <= 1 ? d0.d(this.x0) : "*";
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append((String)object);
            stringBuilder.append(File.separator);
            objectArray[1] = this.N0(2131952031, stringBuilder.toString());
        }
        a8.a((ListAdapter)new ArrayAdapter(a8.getContext(), 2131558690, objectArray), new t(this){
            final x b;
            {
                this.b = x8;
            }

            @Override
            public void a(DialogInterface object, int n8) {
                block7: {
                    block8: {
                        block9: {
                            block6: {
                                block5: {
                                    object = (E)this.b.P0();
                                    if (this.b.y0 != 2) break block5;
                                    if (n8 == 0) {
                                        ((E)object).n7(b.d0);
                                        return;
                                    }
                                    break block6;
                                }
                                if (n8 == 0) break block7;
                                if (n8 == 1) break block8;
                                if (n8 == 2) break block9;
                            }
                            return;
                        }
                        ((E)object).n7(b.d0);
                        return;
                    }
                    ((E)object).n7(b.c0);
                    return;
                }
                ((E)object).n7(b.q);
            }
        });
        return a8.setTitle(this.t0).create();
    }

    public static final class b
    extends Enum<b> {
        public static final /* enum */ b c0;
        public static final /* enum */ b d0;
        private static final b[] e0;
        public static final /* enum */ b q;

        static {
            q = new b();
            c0 = new b();
            d0 = new b();
            e0 = b.d();
        }

        private static /* synthetic */ b[] d() {
            return new b[]{q, c0, d0};
        }

        public static b valueOf(String string) {
            return Enum.valueOf(b.class, string);
        }

        public static b[] values() {
            return (b[])e0.clone();
        }
    }
}

