.class public final synthetic Lax/Z0/B1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic c0:Landroid/media/metrics/PlaybackErrorEvent;

.field public final synthetic q:Lax/Z0/E1;


# direct methods
.method public synthetic constructor <init>(Lax/Z0/E1;Landroid/media/metrics/PlaybackErrorEvent;)V
    .registers 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/Z0/B1;->q:Lax/Z0/E1;

    iput-object p2, p0, Lax/Z0/B1;->c0:Landroid/media/metrics/PlaybackErrorEvent;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/Z0/B1;->q:Lax/Z0/E1;

    iget-object v1, p0, Lax/Z0/B1;->c0:Landroid/media/metrics/PlaybackErrorEvent;

    invoke-static {v0, v1}, Lax/Z0/E1;->z0(Lax/Z0/E1;Landroid/media/metrics/PlaybackErrorEvent;)V

    return-void
.end method
