.class public final synthetic Lax/m1/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic c0:I

.field public final synthetic d0:J

.field public final synthetic e0:J

.field public final synthetic q:Lax/m1/e$a$a$a;


# direct methods
.method public synthetic constructor <init>(Lax/m1/e$a$a$a;IJJ)V
    .registers 7

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/m1/d;->q:Lax/m1/e$a$a$a;

    iput p2, p0, Lax/m1/d;->c0:I

    iput-wide p3, p0, Lax/m1/d;->d0:J

    iput-wide p5, p0, Lax/m1/d;->e0:J

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 7

    .line 1
    iget-object v0, p0, Lax/m1/d;->q:Lax/m1/e$a$a$a;

    iget v1, p0, Lax/m1/d;->c0:I

    iget-wide v2, p0, Lax/m1/d;->d0:J

    iget-wide v4, p0, Lax/m1/d;->e0:J

    invoke-static/range {v0 .. v5}, Lax/m1/e$a$a;->a(Lax/m1/e$a$a$a;IJJ)V

    return-void
.end method
