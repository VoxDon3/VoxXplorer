package ax.A6;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import ax.b0.C1442c;
import java.util.Collection;

/* loaded from: classes3.dex */
public interface d<S> extends Parcelable {
    void A(long j);

    String h(Context context);

    Collection<C1442c<Long, Long>> l();

    void n(S s);

    View p(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, com.google.android.material.datepicker.a aVar, k<S> kVar);

    int q();

    String r(Context context);

    int s(Context context);

    boolean u();

    Collection<Long> w();

    S x();
}
