/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import android.content.Context;
import ax.b6.F6;
import ax.b6.G6;
import ax.b6.J2;
import ax.b6.L6;
import ax.b6.M6;
import ax.b6.R6;
import ax.b6.S6;
import ax.b6.V2;
import ax.b6.X6;
import ax.b6.Y6;
import ax.b6.a6;
import ax.b6.e7;
import ax.b6.f7;
import ax.b6.g6;
import ax.b6.h6;
import ax.b6.k7;
import ax.b6.l7;
import ax.b6.m6;
import ax.b6.n6;
import ax.b6.r7;
import ax.b6.s6;
import ax.b6.t6;
import ax.b6.w7;
import ax.b6.x7;
import ax.b6.y6;
import ax.b6.z6;
import ax.f6.d;
import com.google.android.gms.measurement.internal.A1;
import com.google.android.gms.measurement.internal.B0;
import com.google.android.gms.measurement.internal.B1;
import com.google.android.gms.measurement.internal.C0;
import com.google.android.gms.measurement.internal.D0;
import com.google.android.gms.measurement.internal.D1;
import com.google.android.gms.measurement.internal.E0;
import com.google.android.gms.measurement.internal.E1;
import com.google.android.gms.measurement.internal.F0;
import com.google.android.gms.measurement.internal.F1;
import com.google.android.gms.measurement.internal.G;
import com.google.android.gms.measurement.internal.G0;
import com.google.android.gms.measurement.internal.G1;
import com.google.android.gms.measurement.internal.H;
import com.google.android.gms.measurement.internal.H0;
import com.google.android.gms.measurement.internal.H1;
import com.google.android.gms.measurement.internal.I;
import com.google.android.gms.measurement.internal.I0;
import com.google.android.gms.measurement.internal.I1;
import com.google.android.gms.measurement.internal.J;
import com.google.android.gms.measurement.internal.J0;
import com.google.android.gms.measurement.internal.J1;
import com.google.android.gms.measurement.internal.K;
import com.google.android.gms.measurement.internal.K0;
import com.google.android.gms.measurement.internal.K1;
import com.google.android.gms.measurement.internal.L;
import com.google.android.gms.measurement.internal.L0;
import com.google.android.gms.measurement.internal.L1;
import com.google.android.gms.measurement.internal.M;
import com.google.android.gms.measurement.internal.M0;
import com.google.android.gms.measurement.internal.M1;
import com.google.android.gms.measurement.internal.N;
import com.google.android.gms.measurement.internal.N0;
import com.google.android.gms.measurement.internal.O;
import com.google.android.gms.measurement.internal.O0;
import com.google.android.gms.measurement.internal.P;
import com.google.android.gms.measurement.internal.P0;
import com.google.android.gms.measurement.internal.Q;
import com.google.android.gms.measurement.internal.Q0;
import com.google.android.gms.measurement.internal.R0;
import com.google.android.gms.measurement.internal.S;
import com.google.android.gms.measurement.internal.S0;
import com.google.android.gms.measurement.internal.T;
import com.google.android.gms.measurement.internal.T0;
import com.google.android.gms.measurement.internal.U;
import com.google.android.gms.measurement.internal.U0;
import com.google.android.gms.measurement.internal.V;
import com.google.android.gms.measurement.internal.V0;
import com.google.android.gms.measurement.internal.W;
import com.google.android.gms.measurement.internal.W0;
import com.google.android.gms.measurement.internal.X;
import com.google.android.gms.measurement.internal.X0;
import com.google.android.gms.measurement.internal.Y;
import com.google.android.gms.measurement.internal.Y0;
import com.google.android.gms.measurement.internal.Z0;
import com.google.android.gms.measurement.internal.a0;
import com.google.android.gms.measurement.internal.a1;
import com.google.android.gms.measurement.internal.b0;
import com.google.android.gms.measurement.internal.c0;
import com.google.android.gms.measurement.internal.c1;
import com.google.android.gms.measurement.internal.d0;
import com.google.android.gms.measurement.internal.d1;
import com.google.android.gms.measurement.internal.e0;
import com.google.android.gms.measurement.internal.e1;
import com.google.android.gms.measurement.internal.f0;
import com.google.android.gms.measurement.internal.f1;
import com.google.android.gms.measurement.internal.g0;
import com.google.android.gms.measurement.internal.g1;
import com.google.android.gms.measurement.internal.h0;
import com.google.android.gms.measurement.internal.h1;
import com.google.android.gms.measurement.internal.i0;
import com.google.android.gms.measurement.internal.i1;
import com.google.android.gms.measurement.internal.j0;
import com.google.android.gms.measurement.internal.j1;
import com.google.android.gms.measurement.internal.k0;
import com.google.android.gms.measurement.internal.k1;
import com.google.android.gms.measurement.internal.l0;
import com.google.android.gms.measurement.internal.l1;
import com.google.android.gms.measurement.internal.m0;
import com.google.android.gms.measurement.internal.m1;
import com.google.android.gms.measurement.internal.n0;
import com.google.android.gms.measurement.internal.n1;
import com.google.android.gms.measurement.internal.o0;
import com.google.android.gms.measurement.internal.o1;
import com.google.android.gms.measurement.internal.p0;
import com.google.android.gms.measurement.internal.p1;
import com.google.android.gms.measurement.internal.q0;
import com.google.android.gms.measurement.internal.q1;
import com.google.android.gms.measurement.internal.r0;
import com.google.android.gms.measurement.internal.r1;
import com.google.android.gms.measurement.internal.s0;
import com.google.android.gms.measurement.internal.s1;
import com.google.android.gms.measurement.internal.t0;
import com.google.android.gms.measurement.internal.t1;
import com.google.android.gms.measurement.internal.u0;
import com.google.android.gms.measurement.internal.u1;
import com.google.android.gms.measurement.internal.v0;
import com.google.android.gms.measurement.internal.v1;
import com.google.android.gms.measurement.internal.w0;
import com.google.android.gms.measurement.internal.w1;
import com.google.android.gms.measurement.internal.x0;
import com.google.android.gms.measurement.internal.x1;
import com.google.android.gms.measurement.internal.y0;
import com.google.android.gms.measurement.internal.y1;
import com.google.android.gms.measurement.internal.z0;
import com.google.android.gms.measurement.internal.z1;
import java.lang.constant.Constable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public final class F {
    public static final M1<Long> A;
    public static final M1<Boolean> A0;
    public static final M1<Long> B;
    public static final M1<Boolean> B0;
    public static final M1<Long> C;
    public static final M1<Boolean> C0;
    public static final M1<Integer> D;
    public static final M1<Boolean> D0;
    public static final M1<Long> E;
    public static final M1<Boolean> E0;
    public static final M1<Integer> F;
    public static final M1<Boolean> F0;
    public static final M1<Integer> G;
    public static final M1<Boolean> G0;
    public static final M1<Integer> H;
    public static final M1<Boolean> H0;
    public static final M1<Integer> I;
    public static final M1<Boolean> I0;
    public static final M1<Integer> J;
    public static final M1<Boolean> J0;
    public static final M1<Long> K;
    public static final M1<Boolean> K0;
    public static final M1<Boolean> L;
    public static final M1<Boolean> L0;
    public static final M1<String> M;
    public static final M1<Boolean> M0;
    public static final M1<Long> N;
    public static final M1<Boolean> N0;
    public static final M1<Integer> O;
    public static final M1<Boolean> O0;
    public static final M1<Double> P;
    public static final M1<Boolean> P0;
    public static final M1<Integer> Q;
    public static final M1<Boolean> Q0;
    public static final M1<Integer> R;
    public static final M1<Boolean> R0;
    public static final M1<Integer> S;
    public static final M1<Boolean> S0;
    public static final M1<Integer> T;
    public static final M1<Boolean> T0;
    public static final M1<Long> U;
    public static final M1<Boolean> U0;
    public static final M1<Long> V;
    public static final M1<Boolean> V0;
    public static final M1<Integer> W;
    public static final M1<Boolean> W0;
    public static final M1<Integer> X;
    public static final M1<Boolean> X0;
    public static final M1<String> Y;
    public static final M1<Boolean> Y0;
    public static final M1<String> Z;
    public static final M1<Boolean> Z0;
    private static final List<M1<?>> a;
    public static final M1<String> a0;
    public static final M1<Long> b;
    public static final M1<Long> b0;
    public static final M1<Long> c;
    public static final M1<String> c0;
    public static final M1<Long> d;
    public static final M1<String> d0;
    public static final M1<Long> e;
    public static final M1<String> e0;
    public static final M1<String> f;
    public static final M1<String> f0;
    public static final M1<String> g;
    public static final M1<Long> g0;
    public static final M1<Integer> h;
    public static final M1<Boolean> h0;
    public static final M1<Integer> i;
    public static final M1<Boolean> i0;
    public static final M1<Integer> j;
    public static final M1<Boolean> j0;
    public static final M1<Integer> k;
    public static final M1<Boolean> k0;
    public static final M1<Integer> l;
    public static final M1<Boolean> l0;
    public static final M1<Integer> m;
    public static final M1<Boolean> m0;
    public static final M1<Integer> n;
    public static final M1<Boolean> n0;
    public static final M1<Integer> o;
    public static final M1<Boolean> o0;
    public static final M1<Integer> p;
    public static final M1<Integer> p0;
    public static final M1<Integer> q;
    public static final M1<Boolean> q0;
    public static final M1<String> r;
    public static final M1<Boolean> r0;
    public static final M1<Long> s;
    public static final M1<Boolean> s0;
    public static final M1<Long> t;
    public static final M1<Boolean> t0;
    public static final M1<Long> u;
    public static final M1<Boolean> u0;
    public static final M1<Long> v;
    public static final M1<String> v0;
    public static final M1<Long> w;
    public static final M1<Boolean> w0;
    public static final M1<Long> x;
    public static final M1<Boolean> x0;
    public static final M1<Long> y;
    public static final M1<Boolean> y0;
    public static final M1<Long> z;
    public static final M1<Boolean> z0;

    static {
        a = java.util.DesugarCollections.synchronizedList(new ArrayList());
        java.util.DesugarCollections.synchronizedSet(new HashSet());
        Constable constable = 10000L;
        b = com.google.android.gms.measurement.internal.F.F("measurement.ad_id_cache_time", constable, new G());
        Long l8 = 3600000L;
        c = com.google.android.gms.measurement.internal.F.F("measurement.app_uninstalled_additional_ad_id_cache_time", l8, new S());
        Long l9 = 86400000L;
        d = com.google.android.gms.measurement.internal.F.F("measurement.monitoring.sample_period_millis", l9, new f0());
        e = com.google.android.gms.measurement.internal.F.c("measurement.config.cache_time", l9, l8, new r0(), false);
        f = com.google.android.gms.measurement.internal.F.F("measurement.config.url_scheme", "https", new E0());
        g = com.google.android.gms.measurement.internal.F.F("measurement.config.url_authority", "app-measurement.com", new T0());
        Constable constable2 = 100;
        h = com.google.android.gms.measurement.internal.F.F("measurement.upload.max_bundles", constable2, new g1());
        Number number = 65536;
        i = com.google.android.gms.measurement.internal.F.F("measurement.upload.max_batch_size", number, new s1());
        j = com.google.android.gms.measurement.internal.F.F("measurement.upload.max_bundle_size", number, new F1());
        Integer n8 = 1000;
        k = com.google.android.gms.measurement.internal.F.F("measurement.upload.max_events_per_bundle", n8, new L());
        number = 100000;
        l = com.google.android.gms.measurement.internal.F.F("measurement.upload.max_events_per_day", number, new Q0());
        m = com.google.android.gms.measurement.internal.F.F("measurement.upload.max_error_events_per_day", n8, new e1());
        n = com.google.android.gms.measurement.internal.F.F("measurement.upload.max_public_events_per_day", 50000, new n1());
        o = com.google.android.gms.measurement.internal.F.F("measurement.upload.max_conversions_per_day", 10000, new A1());
        p = com.google.android.gms.measurement.internal.F.F("measurement.upload.max_realtime_events_per_day", 10, new I());
        q = com.google.android.gms.measurement.internal.F.F("measurement.store.max_stored_events_per_app", number, new O());
        r = com.google.android.gms.measurement.internal.F.F("measurement.upload.url", "https://app-measurement.com/a", new N());
        com.google.android.gms.measurement.internal.F.F("measurement.sgtm.google_signal.url", "https://app-measurement.com/s", new Q());
        s = com.google.android.gms.measurement.internal.F.F("measurement.upload.backoff_period", 43200000L, new P());
        t = com.google.android.gms.measurement.internal.F.F("measurement.upload.window_interval", l8, new T());
        u = com.google.android.gms.measurement.internal.F.F("measurement.upload.interval", l8, new V());
        v = com.google.android.gms.measurement.internal.F.F("measurement.upload.realtime_upload_interval", constable, new U());
        w = com.google.android.gms.measurement.internal.F.F("measurement.upload.debug_upload_interval", 1000L, new X());
        x = com.google.android.gms.measurement.internal.F.F("measurement.upload.minimum_delay", 500L, new a0());
        y = com.google.android.gms.measurement.internal.F.F("measurement.alarm_manager.minimum_interval", 60000L, new Y());
        z = com.google.android.gms.measurement.internal.F.F("measurement.upload.stale_data_deletion_interval", l9, new c0());
        l9 = 604800000L;
        A = com.google.android.gms.measurement.internal.F.F("measurement.upload.refresh_blacklisted_config_interval", l9, new b0());
        B = com.google.android.gms.measurement.internal.F.F("measurement.upload.initial_upload_delay_time", 15000L, new e0());
        C = com.google.android.gms.measurement.internal.F.F("measurement.upload.retry_time", 1800000L, new d0());
        D = com.google.android.gms.measurement.internal.F.F("measurement.upload.retry_count", 6, new g0());
        E = com.google.android.gms.measurement.internal.F.F("measurement.upload.max_queue_time", 2419200000L, new i0());
        F = com.google.android.gms.measurement.internal.F.F("measurement.lifetimevalue.max_currency_tracked", 4, new h0());
        G = com.google.android.gms.measurement.internal.F.F("measurement.audience.filter_result_max_count", 200, new j0());
        constable = 25;
        H = com.google.android.gms.measurement.internal.F.a("measurement.upload.max_public_user_properties", constable);
        I = com.google.android.gms.measurement.internal.F.a("measurement.upload.max_event_name_cardinality", 500);
        J = com.google.android.gms.measurement.internal.F.a("measurement.upload.max_public_event_params", constable);
        K = com.google.android.gms.measurement.internal.F.F("measurement.service_client.idle_disconnect_millis", 5000L, new m0());
        constable = Boolean.FALSE;
        L = com.google.android.gms.measurement.internal.F.F("measurement.test.boolean_flag", constable, new l0());
        M = com.google.android.gms.measurement.internal.F.F("measurement.test.string_flag", "---", new o0());
        number = -1L;
        N = com.google.android.gms.measurement.internal.F.F("measurement.test.long_flag", number, new n0());
        com.google.android.gms.measurement.internal.F.b("measurement.test.cached_long_flag", number, new q0());
        O = com.google.android.gms.measurement.internal.F.F("measurement.test.int_flag", -2, new p0());
        P = com.google.android.gms.measurement.internal.F.F("measurement.test.double_flag", -3.0, new s0());
        Q = com.google.android.gms.measurement.internal.F.F("measurement.experiment.max_ids", 50, new u0());
        R = com.google.android.gms.measurement.internal.F.F("measurement.upload.max_item_scoped_custom_parameters", 27, new w0());
        S = com.google.android.gms.measurement.internal.F.b("measurement.upload.max_event_parameter_value_length", constable2, new v0());
        T = com.google.android.gms.measurement.internal.F.F("measurement.max_bundles_per_iteration", constable2, new y0());
        U = com.google.android.gms.measurement.internal.F.F("measurement.sdk.attribution.cache.ttl", l9, new x0());
        V = com.google.android.gms.measurement.internal.F.F("measurement.redaction.app_instance_id.ttl", 0x6DDD00L, new B0());
        W = com.google.android.gms.measurement.internal.F.F("measurement.rb.attribution.client.min_ad_services_version", 7, new z0());
        X = com.google.android.gms.measurement.internal.F.F("measurement.dma_consent.max_daily_dcu_realtime_events", 1, new D0());
        Y = com.google.android.gms.measurement.internal.F.F("measurement.rb.attribution.uri_scheme", "https", new C0());
        Z = com.google.android.gms.measurement.internal.F.F("measurement.rb.attribution.uri_authority", "google-analytics.com", new F0());
        a0 = com.google.android.gms.measurement.internal.F.F("measurement.rb.attribution.uri_path", "privacy-sandbox/register-app-conversion", new G0());
        b0 = com.google.android.gms.measurement.internal.F.F("measurement.session.engagement_interval", l8, new J0());
        c0 = com.google.android.gms.measurement.internal.F.F("measurement.rb.attribution.app_allowlist", "com.labpixies.flood,com.sofascore.results,games.spearmint.triplecrush,com.block.juggle,io.supercent.linkedcubic,com.cdtg.gunsound,com.corestudios.storemanagementidle,com.cdgames.fidget3d,io.supercent.burgeridle,io.supercent.pizzaidle,jp.ne.ibis.ibispaintx.app,com.dencreak.dlcalculator,com.ebay.kleinanzeigen,de.wetteronline.wetterapp,com.game.shape.shift,com.champion.cubes,bubbleshooter.orig,com.wolt.android,com.master.hotelmaster,com.games.bus.arrival,com.playstrom.dop2,com.huuuge.casino.slots,com.ig.spider.fighting,com.jura.coloring.page,com.rikkogame.ragdoll2,com.ludo.king,com.sigma.prank.sound.haircut,com.crazy.block.robo.monster.cliffs.craft,com.fugo.wow,com.maps.locator.gps.gpstracker.phone,com.gamovation.tileclub,com.pronetis.ironball2,com.meesho.supply,pdf.pdfreader.viewer.editor.free,com.dino.race.master,com.ig.moto.racing,ai.photo.enhancer.photoclear,com.duolingo,com.candle.magic_piano,com.free.vpn.super.hotspot.open,sg.bigo.live,com.cdg.tictactoe,com.zhiliaoapp.musically.go,com.wildspike.wormszone,com.mast.status.video.edit,com.vyroai.photoeditorone,com.pujiagames.deeeersimulator,com.superbinogo.jungleboyadventure,com.trustedapp.pdfreaderpdfviewer,com.artimind.aiart.artgenerator.artavatar,de.cellular.ottohybrid,com.zeptolab.cats.google,in.crossy.daily_crossword", new I0());
        d0 = com.google.android.gms.measurement.internal.F.F("measurement.rb.attribution.user_properties", "_npa,npa", new L0());
        e0 = com.google.android.gms.measurement.internal.F.F("measurement.rb.attribution.event_params", "value|currency", new K0());
        f0 = com.google.android.gms.measurement.internal.F.F("measurement.rb.attribution.query_parameters_to_remove", "", new N0());
        g0 = com.google.android.gms.measurement.internal.F.F("measurement.rb.attribution.max_queue_time", 1209600000L, new M0());
        constable2 = Boolean.TRUE;
        h0 = com.google.android.gms.measurement.internal.F.F("measurement.collection.log_event_and_bundle_v2", constable2, new P0());
        i0 = com.google.android.gms.measurement.internal.F.a("measurement.quality.checksum", constable);
        j0 = com.google.android.gms.measurement.internal.F.F("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", constable, new O0());
        k0 = com.google.android.gms.measurement.internal.F.F("measurement.audience.refresh_event_count_filters_timestamp", constable, new R0());
        l0 = com.google.android.gms.measurement.internal.F.b("measurement.audience.use_bundle_timestamp_for_event_count_filters", constable, new S0());
        m0 = com.google.android.gms.measurement.internal.F.F("measurement.sdk.collection.last_deep_link_referrer_campaign2", constable, new V0());
        n0 = com.google.android.gms.measurement.internal.F.F("measurement.integration.disable_firebase_instance_id", constable, new U0());
        o0 = com.google.android.gms.measurement.internal.F.F("measurement.collection.service.update_with_analytics_fix", constable, new X0());
        p0 = com.google.android.gms.measurement.internal.F.F("measurement.service.storage_consent_support_version", 203600, new W0());
        q0 = com.google.android.gms.measurement.internal.F.F("measurement.service.store_null_safelist", constable2, new Z0());
        r0 = com.google.android.gms.measurement.internal.F.F("measurement.service.store_safelist", constable2, new Y0());
        s0 = com.google.android.gms.measurement.internal.F.F("measurement.session_stitching_token_enabled", constable, new c1());
        t0 = com.google.android.gms.measurement.internal.F.b("measurement.sgtm.service", constable2, new a1());
        u0 = com.google.android.gms.measurement.internal.F.b("measurement.sgtm.preview_mode_enabled", constable2, new d1());
        v0 = com.google.android.gms.measurement.internal.F.b("measurement.sgtm.app_allowlist", "de.zalando.mobile.internal,de.zalando.mobile.internal.debug,de.zalando.lounge.dev,grit.storytel.app,com.rbc.mobile.android,com.rbc.mobile.android,com.dylvian.mango.activities,com.home24.android,com.home24.android.staging,se.lf.mobile.android,se.lf.mobile.android.beta,se.lf.mobile.android.rc,se.lf.mobile.android.test,se.lf.mobile.android.test.debug,com.boots.flagship.android,com.boots.flagshiproi.android,de.zalando.mobile,com.trivago,com.getyourguide.android,es.mobail.meliarewards,se.nansen.coop.debug,se.nansen.coop,se.coop.coop.qa,com.booking,com.google.firebaseengage,com.mse.mseapp.dev,com.mse.mseapp,pl.eobuwie.eobuwieapp,br.com.eventim.mobile.app.Android,ch.ticketcorner.mobile.app.Android,de.eventim.mobile.app.Android,dk.billetlugen.mobile.app.Android,nl.eventim.mobile.app.Android,com.asos.app,com.blueshieldca.prod,dk.magnetix.tivoliapp,matas.matas.internal,nl.omoda", new f1());
        com.google.android.gms.measurement.internal.F.F("measurement.sgtm.upload_queue", constable, new i1());
        com.google.android.gms.measurement.internal.F.F("measurement.sgtm.google_signal.enable", constable, new h1());
        w0 = com.google.android.gms.measurement.internal.F.F("measurement.gmscore_feature_tracking", constable2, new k1());
        x0 = com.google.android.gms.measurement.internal.F.b("measurement.fix_health_monitor_stack_trace", constable2, new j1());
        y0 = com.google.android.gms.measurement.internal.F.b("measurement.item_scoped_custom_parameters.client", constable2, new m1());
        z0 = com.google.android.gms.measurement.internal.F.F("measurement.item_scoped_custom_parameters.service", constable2, new l1());
        A0 = com.google.android.gms.measurement.internal.F.b("measurement.rb.attribution.service", constable2, new o1());
        B0 = com.google.android.gms.measurement.internal.F.b("measurement.rb.attribution.client2", constable2, new q1());
        C0 = com.google.android.gms.measurement.internal.F.F("measurement.rb.attribution.uuid_generation", constable2, new p1());
        D0 = com.google.android.gms.measurement.internal.F.F("measurement.rb.attribution.enable_trigger_redaction", constable2, new r1());
        com.google.android.gms.measurement.internal.F.F("measurement.rb.attribution.followup1.service", constable, new u1());
        E0 = com.google.android.gms.measurement.internal.F.F("measurement.rb.attribution.registration_regardless_consent", constable, new t1());
        F0 = com.google.android.gms.measurement.internal.F.F("measurement.rb.attribution.ad_campaign_info", constable, new w1());
        G0 = com.google.android.gms.measurement.internal.F.b("measurement.rb.attribution.improved_retry", constable2, new v1());
        H0 = com.google.android.gms.measurement.internal.F.F("measurement.client.sessions.enable_fix_background_engagement", constable, new y1());
        I0 = com.google.android.gms.measurement.internal.F.F("measurement.client.sessions.enable_pause_engagement_in_background", constable2, new x1());
        J0 = com.google.android.gms.measurement.internal.F.F("measurement.dma_consent.service_dcu_event2", constable2, new z1());
        K0 = com.google.android.gms.measurement.internal.F.F("measurement.dma_consent.services_database_update_fix", constable2, new D1());
        L0 = com.google.android.gms.measurement.internal.F.b("measurement.service.deferred_first_open", constable2, new B1());
        M0 = com.google.android.gms.measurement.internal.F.b("measurement.gbraid_campaign.gbraid.client.dev", constable, new E1());
        N0 = com.google.android.gms.measurement.internal.F.b("measurement.gbraid_campaign.gbraid.service", constable, new H1());
        O0 = com.google.android.gms.measurement.internal.F.b("measurement.increase_param_lengths", constable2, new G1());
        P0 = com.google.android.gms.measurement.internal.F.F("measurement.disable_npa_for_dasher_and_unicorn", constable2, new J1());
        Q0 = com.google.android.gms.measurement.internal.F.b("measurement.consent_regional_defaults.service", constable, new I1());
        R0 = com.google.android.gms.measurement.internal.F.b("measurement.consent_regional_defaults.client2", constable, new L1());
        S0 = com.google.android.gms.measurement.internal.F.F("measurement.service.consent.pfo_on_fx", constable2, new H());
        T0 = com.google.android.gms.measurement.internal.F.F("measurement.service.consent.params_on_fx", constable2, new K());
        U0 = com.google.android.gms.measurement.internal.F.F("measurement.service.consent.app_start_fix", constable2, new J());
        V0 = com.google.android.gms.measurement.internal.F.b("measurement.consent.stop_reset_on_storage_denied.client", constable2, new M());
        W0 = com.google.android.gms.measurement.internal.F.b("measurement.consent.stop_reset_on_storage_denied.service", constable2, new W());
        X0 = com.google.android.gms.measurement.internal.F.F("measurement.consent.scrub_audience_data_analytics_consent", constable2, new k0());
        Y0 = com.google.android.gms.measurement.internal.F.F("measurement.consent.fix_first_open_count_from_snapshot", constable2, new t0());
        Z0 = com.google.android.gms.measurement.internal.F.F("measurement.fix_engagement_on_reset_analytics_data", constable2, new H0());
    }

    static /* synthetic */ Integer A() {
        return (int)a6.i();
    }

    static /* synthetic */ String A0() {
        return a6.w();
    }

    static /* synthetic */ Integer B() {
        return (int)a6.e();
    }

    static /* synthetic */ String B0() {
        return a6.t();
    }

    static /* synthetic */ Integer C() {
        return (int)a6.k();
    }

    static /* synthetic */ String C0() {
        return a6.A();
    }

    static /* synthetic */ Integer D() {
        return (int)a6.J();
    }

    static /* synthetic */ String D0() {
        return a6.r();
    }

    static /* synthetic */ Integer E() {
        return (int)a6.m();
    }

    static /* synthetic */ String E0() {
        return a6.x();
    }

    private static <V> M1<V> F(String string, V v8, K1<V> k12) {
        return com.google.android.gms.measurement.internal.F.c(string, v8, v8, k12, false);
    }

    static /* synthetic */ String F0() {
        return a6.u();
    }

    static /* synthetic */ Boolean G() {
        return G6.a();
    }

    static /* bridge */ /* synthetic */ List G0() {
        return a;
    }

    static /* synthetic */ Integer H() {
        return (int)a6.G();
    }

    static /* synthetic */ Boolean H0() {
        return f7.a();
    }

    static /* synthetic */ Integer I() {
        return (int)a6.L();
    }

    static /* synthetic */ Boolean I0() {
        return F6.c();
    }

    static /* synthetic */ Integer J() {
        return (int)e7.c();
    }

    static /* synthetic */ Boolean J0() {
        return F6.b();
    }

    static /* synthetic */ Integer K() {
        return (int)a6.K();
    }

    static /* synthetic */ Boolean K0() {
        return F6.d();
    }

    static /* synthetic */ Integer L() {
        return (int)a6.M();
    }

    static /* synthetic */ Boolean L0() {
        return Y6.a();
    }

    static /* synthetic */ Integer M() {
        return (int)a6.I();
    }

    static /* synthetic */ Boolean M0() {
        return w7.b();
    }

    static /* synthetic */ Integer N() {
        return (int)a6.C();
    }

    static /* synthetic */ Boolean N0() {
        return x7.a();
    }

    static /* synthetic */ Integer O() {
        return (int)a6.N();
    }

    static /* synthetic */ Boolean O0() {
        return y6.b();
    }

    static /* synthetic */ Integer P() {
        return (int)a6.H();
    }

    static /* synthetic */ Boolean P0() {
        return y6.c();
    }

    static /* synthetic */ Integer Q() {
        return (int)a6.d();
    }

    static /* synthetic */ Boolean Q0() {
        return l7.b();
    }

    static /* synthetic */ Integer R() {
        return (int)h6.a();
    }

    static /* synthetic */ Boolean R0() {
        return r7.d();
    }

    static /* synthetic */ Integer S() {
        return (int)a6.l();
    }

    static /* synthetic */ Boolean S0() {
        return r7.c();
    }

    static /* synthetic */ Integer T() {
        return (int)a6.c();
    }

    static /* synthetic */ Boolean T0() {
        return r7.e();
    }

    static /* synthetic */ Integer U() {
        return (int)a6.g();
    }

    static /* synthetic */ Boolean U0() {
        return r7.b();
    }

    static /* synthetic */ Long V() {
        return a6.a();
    }

    static /* synthetic */ Boolean V0() {
        return R6.b();
    }

    static /* synthetic */ Long W() {
        return a6.B();
    }

    static /* synthetic */ Boolean W0() {
        return L6.b();
    }

    static /* synthetic */ Long X() {
        return a6.Y();
    }

    static /* synthetic */ Boolean X0() {
        return X6.b();
    }

    static /* synthetic */ Long Y() {
        return a6.o();
    }

    static /* synthetic */ Boolean Y0() {
        return X6.c();
    }

    static /* synthetic */ Long Z() {
        return a6.Q();
    }

    static /* synthetic */ Boolean Z0() {
        return k7.f();
    }

    private static <V> M1<V> a(String string, V v8) {
        return com.google.android.gms.measurement.internal.F.c(string, v8, v8, null, false);
    }

    static /* synthetic */ Long a0() {
        return a6.b();
    }

    static /* synthetic */ Boolean a1() {
        return k7.c();
    }

    private static <V> M1<V> b(String string, V v8, K1<V> k12) {
        return com.google.android.gms.measurement.internal.F.c(string, v8, v8, k12, true);
    }

    static /* synthetic */ Long b0() {
        return a6.R();
    }

    static /* synthetic */ Boolean b1() {
        return k7.h();
    }

    private static <V> M1<V> c(String object, V v8, V v9, K1<V> k12, boolean bl) {
        object = new M1((String)object, v8, v9, k12, bl, null);
        if (bl) {
            a.add((M1<?>)object);
        }
        return object;
    }

    static /* synthetic */ Long c0() {
        return a6.E();
    }

    static /* synthetic */ Boolean c1() {
        return k7.g();
    }

    static /* synthetic */ Boolean d() {
        return m6.e();
    }

    static /* synthetic */ Long d0() {
        return a6.P();
    }

    static /* synthetic */ Boolean d1() {
        return k7.d();
    }

    public static Map<String, String> e(Context object) {
        if ((object = J2.a(object.getContentResolver(), V2.a("com.google.android.gms.measurement"), new d())) == null) {
            return Collections.EMPTY_MAP;
        }
        return ((J2)object).b();
    }

    static /* synthetic */ Long e0() {
        return a6.O();
    }

    static /* synthetic */ Boolean f() {
        return k7.e();
    }

    static /* synthetic */ Long f0() {
        return a6.U();
    }

    static /* synthetic */ Boolean g() {
        return k7.b();
    }

    static /* synthetic */ Long g0() {
        return a6.S();
    }

    static /* synthetic */ Boolean h() {
        return k7.i();
    }

    static /* synthetic */ Boolean h0() {
        return e7.f();
    }

    static /* synthetic */ Boolean i() {
        return t6.b();
    }

    static /* synthetic */ Long i0() {
        return a6.Z();
    }

    static /* synthetic */ Boolean j() {
        return t6.a();
    }

    static /* synthetic */ Long j0() {
        return a6.n();
    }

    static /* synthetic */ Boolean k() {
        return n6.b();
    }

    static /* synthetic */ Long k0() {
        return a6.D();
    }

    static /* synthetic */ Boolean l() {
        return M6.b();
    }

    static /* synthetic */ Long l0() {
        return a6.j();
    }

    static /* synthetic */ Boolean m() {
        return M6.c();
    }

    static /* synthetic */ Long m0() {
        return a6.T();
    }

    static /* synthetic */ Boolean n() {
        return S6.b();
    }

    static /* synthetic */ Long n0() {
        return e7.d();
    }

    static /* synthetic */ Boolean o() {
        return s6.b();
    }

    static /* synthetic */ Long o0() {
        return e7.b();
    }

    static /* synthetic */ Boolean p() {
        return g6.c();
    }

    static /* synthetic */ Long p0() {
        return a6.W();
    }

    static /* synthetic */ Boolean q() {
        return g6.b();
    }

    static /* synthetic */ Long q0() {
        return a6.X();
    }

    static /* synthetic */ Boolean r() {
        return z6.c();
    }

    static /* synthetic */ Long r0() {
        return a6.F();
    }

    static /* synthetic */ Boolean s() {
        return z6.b();
    }

    static /* synthetic */ Long s0() {
        return a6.V();
    }

    static /* synthetic */ Boolean t() {
        return z6.a();
    }

    static /* synthetic */ String t0() {
        return a6.z();
    }

    static /* synthetic */ Boolean u() {
        return m6.b();
    }

    static /* synthetic */ String u0() {
        return a6.s();
    }

    static /* synthetic */ Boolean v() {
        return m6.c();
    }

    static /* synthetic */ String v0() {
        return e7.e();
    }

    static /* synthetic */ Boolean w() {
        return m6.d();
    }

    static /* synthetic */ String w0() {
        return a6.q();
    }

    static /* synthetic */ Double x() {
        return e7.a();
    }

    static /* synthetic */ String x0() {
        return a6.y();
    }

    static /* synthetic */ Integer y() {
        return (int)a6.h();
    }

    static /* synthetic */ String y0() {
        return a6.v();
    }

    static /* synthetic */ Integer z() {
        return (int)a6.f();
    }

    static /* synthetic */ String z0() {
        return a6.p();
    }
}

