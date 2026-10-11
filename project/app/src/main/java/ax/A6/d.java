/*
 * Decompiled with CFR 0.152.
 */
package ax.A6;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import ax.A6.k;
import ax.b0.c;
import com.google.android.material.datepicker.a;
import java.util.Collection;

public interface d<S>
extends Parcelable {
    public void A(long var1);

    public String h(Context var1);

    public Collection<c<Long, Long>> l();

    public void n(S var1);

    public View p(LayoutInflater var1, ViewGroup var2, Bundle var3, a var4, k<S> var5);

    public int q();

    public String r(Context var1);

    public int s(Context var1);

    public boolean u();

    public Collection<Long> w();

    public S x();
}

