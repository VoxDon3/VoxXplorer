.class public final synthetic Lax/Z0/j0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/S0/t$a;


# instance fields
.field public final synthetic a:Lax/Z0/c$a;

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:J


# direct methods
.method public synthetic constructor <init>(Lax/Z0/c$a;Ljava/lang/Object;J)V
    .registers 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/Z0/j0;->a:Lax/Z0/c$a;

    iput-object p2, p0, Lax/Z0/j0;->b:Ljava/lang/Object;

    iput-wide p3, p0, Lax/Z0/j0;->c:J

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .registers 6

    .line 1
    iget-object v0, p0, Lax/Z0/j0;->a:Lax/Z0/c$a;

    iget-object v1, p0, Lax/Z0/j0;->b:Ljava/lang/Object;

    iget-wide v2, p0, Lax/Z0/j0;->c:J

    check-cast p1, Lax/Z0/c;

    invoke-static {v0, v1, v2, v3, p1}, Lax/Z0/u0;->x1(Lax/Z0/c$a;Ljava/lang/Object;JLax/Z0/c;)V

    return-void
.end method
