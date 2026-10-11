.class public final synthetic Lax/a1/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic c0:Lax/a1/B$d;

.field public final synthetic d0:Landroid/os/Handler;

.field public final synthetic e0:Lax/a1/B$a;

.field public final synthetic q:Landroid/media/AudioTrack;


# direct methods
.method public synthetic constructor <init>(Landroid/media/AudioTrack;Lax/a1/B$d;Landroid/os/Handler;Lax/a1/B$a;)V
    .registers 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/a1/b0;->q:Landroid/media/AudioTrack;

    iput-object p2, p0, Lax/a1/b0;->c0:Lax/a1/B$d;

    iput-object p3, p0, Lax/a1/b0;->d0:Landroid/os/Handler;

    iput-object p4, p0, Lax/a1/b0;->e0:Lax/a1/B$a;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 5

    .line 1
    iget-object v0, p0, Lax/a1/b0;->q:Landroid/media/AudioTrack;

    iget-object v1, p0, Lax/a1/b0;->c0:Lax/a1/B$d;

    iget-object v2, p0, Lax/a1/b0;->d0:Landroid/os/Handler;

    iget-object v3, p0, Lax/a1/b0;->e0:Lax/a1/B$a;

    invoke-static {v0, v1, v2, v3}, Lax/a1/f0;->H(Landroid/media/AudioTrack;Lax/a1/B$d;Landroid/os/Handler;Lax/a1/B$a;)V

    return-void
.end method
