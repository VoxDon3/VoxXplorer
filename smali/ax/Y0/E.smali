.class public final synthetic Lax/Y0/E;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/q7/u;


# instance fields
.field public final synthetic q:Lax/l1/J;


# direct methods
.method public synthetic constructor <init>(Lax/l1/J;)V
    .registers 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/Y0/E;->q:Lax/l1/J;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/Y0/E;->q:Lax/l1/J;

    invoke-static {v0}, Landroidx/media3/exoplayer/ExoPlayer$b;->e(Lax/l1/J;)Lax/l1/J;

    move-result-object v0

    return-object v0
.end method
