.class public final synthetic Lax/Z0/z1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic c0:Landroid/media/metrics/TrackChangeEvent;

.field public final synthetic q:Lax/Z0/E1;


# direct methods
.method public synthetic constructor <init>(Lax/Z0/E1;Landroid/media/metrics/TrackChangeEvent;)V
    .registers 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/Z0/z1;->q:Lax/Z0/E1;

    iput-object p2, p0, Lax/Z0/z1;->c0:Landroid/media/metrics/TrackChangeEvent;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/Z0/z1;->q:Lax/Z0/E1;

    iget-object v1, p0, Lax/Z0/z1;->c0:Landroid/media/metrics/TrackChangeEvent;

    invoke-static {v0, v1}, Lax/Z0/E1;->C0(Lax/Z0/E1;Landroid/media/metrics/TrackChangeEvent;)V

    return-void
.end method
