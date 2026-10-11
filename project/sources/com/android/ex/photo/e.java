package com.android.ex.photo;

import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import ax.A3.b;
import ax.z3.ViewOnClickListenerC3543a;

/* loaded from: classes.dex */
public interface e {

    public interface a {
        void F(Cursor cursor);
    }

    public interface b {
        void H(boolean z);

        void M();

        void N();

        void c(boolean z);

        boolean g(float f, float f2);

        void k();

        boolean r(float f, float f2);
    }

    void A(ViewOnClickListenerC3543a viewOnClickListenerC3543a, boolean z);

    boolean B();

    void C(int i);

    void D(int i, b bVar);

    void c(boolean z);

    boolean d();

    void f();

    void g(ViewOnClickListenerC3543a viewOnClickListenerC3543a);

    void i(c cVar, View view);

    b j(int i);

    void k(boolean z);

    boolean l(Uri uri);

    ax.y3.c m();

    void n();

    void o(int i);

    void q(a aVar);

    void r(Uri uri, boolean z);

    boolean s();

    boolean t(Fragment fragment);

    void u(ViewOnClickListenerC3543a viewOnClickListenerC3543a, Cursor cursor);

    void x(a aVar);

    boolean y(Fragment fragment);

    ax.K0.c<b.a> z(int i, Bundle bundle, String str);
}
