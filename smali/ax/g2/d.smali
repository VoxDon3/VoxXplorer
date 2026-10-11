.class public final synthetic Lax/g2/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic c0:I

.field public final synthetic d0:Ljava/lang/Object;

.field public final synthetic q:Landroidx/profileinstaller/f$c;


# direct methods
.method public synthetic constructor <init>(Landroidx/profileinstaller/f$c;ILjava/lang/Object;)V
    .registers 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/g2/d;->q:Landroidx/profileinstaller/f$c;

    iput p2, p0, Lax/g2/d;->c0:I

    iput-object p3, p0, Lax/g2/d;->d0:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 4

    .line 1
    iget-object v0, p0, Lax/g2/d;->q:Landroidx/profileinstaller/f$c;

    iget v1, p0, Lax/g2/d;->c0:I

    iget-object v2, p0, Lax/g2/d;->d0:Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Landroidx/profileinstaller/f;->a(Landroidx/profileinstaller/f$c;ILjava/lang/Object;)V

    return-void
.end method
