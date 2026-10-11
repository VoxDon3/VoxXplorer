/*
 * Decompiled with CFR 0.152.
 */
package ax.O9;

import ax.M9.d;
import ax.M9.f;
import ax.O9.B;
import ax.S9.c;
import com.microsoft.graph.extensions.DriveItem;
import java.io.InputStream;
import java.util.List;

public class k
extends ax.P9.d<DriveItem>
implements B {
    public k(String string, f f8, List<c> list, Class clazz) {
        super(string, f8, list, clazz);
    }

    @Override
    public InputStream get() throws d {
        return this.e();
    }

    @Override
    public DriveItem i(byte[] byArray) throws d {
        return (DriveItem)this.l(byArray);
    }
}

