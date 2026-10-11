.class public final synthetic Lax/b1/J;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/media/MediaDrm$OnEventListener;


# instance fields
.field public final synthetic a:Lax/b1/O;

.field public final synthetic b:Lax/b1/E$b;


# direct methods
.method public synthetic constructor <init>(Lax/b1/O;Lax/b1/E$b;)V
    .registers 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/b1/J;->a:Lax/b1/O;

    iput-object p2, p0, Lax/b1/J;->b:Lax/b1/E$b;

    return-void
.end method


# virtual methods
.method public final onEvent(Landroid/media/MediaDrm;[BII[B)V
    .registers 13

    .line 1
    iget-object v0, p0, Lax/b1/J;->a:Lax/b1/O;

    iget-object v1, p0, Lax/b1/J;->b:Lax/b1/E$b;

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move v5, p4

    move-object v6, p5

    invoke-static/range {v0 .. v6}, Lax/b1/O;->p(Lax/b1/O;Lax/b1/E$b;Landroid/media/MediaDrm;[BII[B)V

    return-void
.end method
