.class public final synthetic Lax/w5/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/y5/b$a;


# instance fields
.field public final synthetic a:Lax/w5/r;

.field public final synthetic b:Lax/p5/p;

.field public final synthetic c:J


# direct methods
.method public synthetic constructor <init>(Lax/w5/r;Lax/p5/p;J)V
    .registers 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/w5/q;->a:Lax/w5/r;

    iput-object p2, p0, Lax/w5/q;->b:Lax/p5/p;

    iput-wide p3, p0, Lax/w5/q;->c:J

    return-void
.end method


# virtual methods
.method public final execute()Ljava/lang/Object;
    .registers 5

    .line 1
    iget-object v0, p0, Lax/w5/q;->a:Lax/w5/r;

    iget-object v1, p0, Lax/w5/q;->b:Lax/p5/p;

    iget-wide v2, p0, Lax/w5/q;->c:J

    invoke-static {v0, v1, v2, v3}, Lax/w5/r;->g(Lax/w5/r;Lax/p5/p;J)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
