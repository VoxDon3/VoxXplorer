.class public final synthetic Lax/o1/L;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic c0:J

.field public final synthetic d0:I

.field public final synthetic q:Lax/o1/P$a;


# direct methods
.method public synthetic constructor <init>(Lax/o1/P$a;JI)V
    .registers 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/o1/L;->q:Lax/o1/P$a;

    iput-wide p2, p0, Lax/o1/L;->c0:J

    iput p4, p0, Lax/o1/L;->d0:I

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 5

    .line 1
    iget-object v0, p0, Lax/o1/L;->q:Lax/o1/P$a;

    iget-wide v1, p0, Lax/o1/L;->c0:J

    iget v3, p0, Lax/o1/L;->d0:I

    invoke-static {v0, v1, v2, v3}, Lax/o1/P$a;->g(Lax/o1/P$a;JI)V

    return-void
.end method
