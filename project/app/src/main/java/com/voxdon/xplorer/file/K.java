/*
 * Decompiled with CFR 0.152.
 */
package com.voxdon.xplorer.file;

import ax.b3.j;
import ax.c3.d0;
import com.voxdon.xplorer.file.J;
import com.voxdon.xplorer.file.n;
import com.voxdon.xplorer.file.x;
import com.voxdon.xplorer.file.y;
import java.util.logging.Logger;

public class K
extends y {
    private static final Logger a1 = Logger.getLogger("FileManager.RecycleBinFileInfo");
    private boolean S0;
    private String T0;
    private String U0;
    private String V0;
    private String W0;
    private boolean X0;
    private long Y0;
    private long Z0;

    public K(J j8, y y8, ax.c3.K k8, boolean bl) throws j {
        super((x)j8, y8.F0(), k8);
        this.S0 = bl;
        this.T0 = y8.E();
        this.D1(y8);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void D1(n object) throws j {
        CharSequence charSequence = ((n)object).B();
        int n8 = ((String)charSequence).indexOf("_");
        Object object2 = ((String)charSequence).substring(0, n8);
        Object object3 = ((String)charSequence).substring(n8 + 1);
        n8 = ((String)object3).indexOf("_");
        charSequence = ((String)object3).substring(0, n8);
        object3 = ((String)object3).substring(n8 + 1);
        object3 = ((String)object3).substring(0, ((String)object3).indexOf("_"));
        try {
            this.Y0 = Long.valueOf((String)charSequence);
        }
        catch (NumberFormatException numberFormatException) {}
        try {
            this.Z0 = Long.valueOf((String)object3);
        }
        catch (NumberFormatException numberFormatException) {
            // empty catch block
        }
        this.X0 = "D".equals(object2);
        object2 = J.o2((n)object, this.B0());
        if (!((J.c)object2).a()) {
            object3 = a1;
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("INVALID INDEX : ");
            ((StringBuilder)charSequence).append(((J.c)object2).a);
            ((StringBuilder)charSequence).append(",");
            ((StringBuilder)charSequence).append(((J.c)object2).b);
            ((Logger)object3).fine(((StringBuilder)charSequence).toString());
            if (this.B0() != null) {
                object2 = new StringBuilder();
                ((StringBuilder)object2).append(this.B0().toString());
                ((StringBuilder)object2).append(",");
                ((StringBuilder)object2).append(object.p());
                object = ((StringBuilder)object2).toString();
            } else {
                object2 = new StringBuilder();
                ((StringBuilder)object2).append("");
                ((StringBuilder)object2).append(object.p());
                object = ((StringBuilder)object2).toString();
            }
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("Invalid RecycleBin Index File : ");
            ((StringBuilder)object2).append((String)object);
            throw new j(((StringBuilder)object2).toString());
        }
        this.V0 = object = ((J.c)object2).b;
        this.W0 = ((J.c)object2).c;
        if (object != null) {
            this.U0 = d0.h((String)object);
        }
    }

    public String A1() {
        return this.V0;
    }

    public String B1() {
        return this.W0;
    }

    @Override
    public String C() {
        if (this.S0) {
            return this.U0;
        }
        return super.C();
    }

    public boolean C1() {
        return this.S0;
    }

    @Override
    public String F() {
        if (this.S0) {
            return this.V0;
        }
        return super.F();
    }

    @Override
    public String U() {
        if (this.S0) {
            return d0.r(this.V0);
        }
        return super.U();
    }

    @Override
    public boolean isDirectory() {
        if (this.S0) {
            return this.X0;
        }
        return super.isDirectory();
    }

    @Override
    public long p() {
        if (this.S0) {
            return this.Z0;
        }
        return super.p();
    }

    @Override
    public long q() {
        if (this.S0) {
            return this.Y0;
        }
        return super.q();
    }

    @Override
    public int r(boolean bl) {
        if (this.S0) {
            if (this.Z0 > 0L) {
                return 1;
            }
            return -1;
        }
        return super.r(bl);
    }

    public String z1() {
        return this.T0;
    }
}

