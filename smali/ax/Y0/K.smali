.class public final synthetic Lax/Y0/K;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/q7/u;


# instance fields
.field public final synthetic q:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;)V
    .registers 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/Y0/K;->q:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/Y0/K;->q:Landroid/content/Context;

    invoke-static {v0}, Landroidx/media3/exoplayer/ExoPlayer$b;->d(Landroid/content/Context;)Lax/m1/e;

    move-result-object v0

    return-object v0
.end method
