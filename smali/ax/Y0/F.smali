.class public final synthetic Lax/Y0/F;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/q7/u;


# instance fields
.field public final synthetic q:Lax/i1/F$a;


# direct methods
.method public synthetic constructor <init>(Lax/i1/F$a;)V
    .registers 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/Y0/F;->q:Lax/i1/F$a;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/Y0/F;->q:Lax/i1/F$a;

    invoke-static {v0}, Landroidx/media3/exoplayer/ExoPlayer$b;->c(Lax/i1/F$a;)Lax/i1/F$a;

    move-result-object v0

    return-object v0
.end method
