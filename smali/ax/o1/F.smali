.class public final synthetic Lax/o1/F;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic c0:Ljava/lang/String;

.field public final synthetic d0:J

.field public final synthetic e0:J

.field public final synthetic q:Lax/o1/P$a;


# direct methods
.method public synthetic constructor <init>(Lax/o1/P$a;Ljava/lang/String;JJ)V
    .registers 7

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/o1/F;->q:Lax/o1/P$a;

    iput-object p2, p0, Lax/o1/F;->c0:Ljava/lang/String;

    iput-wide p3, p0, Lax/o1/F;->d0:J

    iput-wide p5, p0, Lax/o1/F;->e0:J

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 7

    .line 1
    iget-object v0, p0, Lax/o1/F;->q:Lax/o1/P$a;

    iget-object v1, p0, Lax/o1/F;->c0:Ljava/lang/String;

    iget-wide v2, p0, Lax/o1/F;->d0:J

    iget-wide v4, p0, Lax/o1/F;->e0:J

    invoke-static/range {v0 .. v5}, Lax/o1/P$a;->a(Lax/o1/P$a;Ljava/lang/String;JJ)V

    return-void
.end method
