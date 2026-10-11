.class public final synthetic Landroidx/media3/exoplayer/F;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/S0/f$a;


# instance fields
.field public final synthetic a:Landroidx/media3/exoplayer/X;


# direct methods
.method public synthetic constructor <init>(Landroidx/media3/exoplayer/X;)V
    .registers 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/media3/exoplayer/F;->a:Landroidx/media3/exoplayer/X;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;)V
    .registers 4

    .line 1
    iget-object v0, p0, Landroidx/media3/exoplayer/F;->a:Landroidx/media3/exoplayer/X;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, p1, p2}, Landroidx/media3/exoplayer/X;->h1(Landroidx/media3/exoplayer/X;II)V

    return-void
.end method
