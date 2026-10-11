.class public final synthetic Lax/o1/K;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic c0:I

.field public final synthetic d0:J

.field public final synthetic q:Lax/o1/P$a;


# direct methods
.method public synthetic constructor <init>(Lax/o1/P$a;IJ)V
    .registers 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/o1/K;->q:Lax/o1/P$a;

    iput p2, p0, Lax/o1/K;->c0:I

    iput-wide p3, p0, Lax/o1/K;->d0:J

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 5

    .line 1
    iget-object v0, p0, Lax/o1/K;->q:Lax/o1/P$a;

    iget v1, p0, Lax/o1/K;->c0:I

    iget-wide v2, p0, Lax/o1/K;->d0:J

    invoke-static {v0, v1, v2, v3}, Lax/o1/P$a;->c(Lax/o1/P$a;IJ)V

    return-void
.end method
