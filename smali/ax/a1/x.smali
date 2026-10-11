.class public final synthetic Lax/a1/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic c0:I

.field public final synthetic d0:J

.field public final synthetic e0:J

.field public final synthetic q:Lax/a1/z$a;


# direct methods
.method public synthetic constructor <init>(Lax/a1/z$a;IJJ)V
    .registers 7

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/a1/x;->q:Lax/a1/z$a;

    iput p2, p0, Lax/a1/x;->c0:I

    iput-wide p3, p0, Lax/a1/x;->d0:J

    iput-wide p5, p0, Lax/a1/x;->e0:J

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 7

    .line 1
    iget-object v0, p0, Lax/a1/x;->q:Lax/a1/z$a;

    iget v1, p0, Lax/a1/x;->c0:I

    iget-wide v2, p0, Lax/a1/x;->d0:J

    iget-wide v4, p0, Lax/a1/x;->e0:J

    invoke-static/range {v0 .. v5}, Lax/a1/z$a;->b(Lax/a1/z$a;IJJ)V

    return-void
.end method
