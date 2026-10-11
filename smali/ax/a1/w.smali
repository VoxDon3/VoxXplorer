.class public final synthetic Lax/a1/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic c0:J

.field public final synthetic q:Lax/a1/z$a;


# direct methods
.method public synthetic constructor <init>(Lax/a1/z$a;J)V
    .registers 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/a1/w;->q:Lax/a1/z$a;

    iput-wide p2, p0, Lax/a1/w;->c0:J

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 4

    .line 1
    iget-object v0, p0, Lax/a1/w;->q:Lax/a1/z$a;

    iget-wide v1, p0, Lax/a1/w;->c0:J

    invoke-static {v0, v1, v2}, Lax/a1/z$a;->e(Lax/a1/z$a;J)V

    return-void
.end method
