.class public final synthetic Lax/Y0/G;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/q7/u;


# instance fields
.field public final synthetic q:Lax/Y0/X;


# direct methods
.method public synthetic constructor <init>(Lax/Y0/X;)V
    .registers 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/Y0/G;->q:Lax/Y0/X;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/Y0/G;->q:Lax/Y0/X;

    invoke-static {v0}, Landroidx/media3/exoplayer/ExoPlayer$b;->f(Lax/Y0/X;)Lax/Y0/X;

    move-result-object v0

    return-object v0
.end method
